package featurea.app;

import featurea.util.FileUtil;
import featurea.util.Properties;
import featurea.xml.XmlParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.File;
import java.io.InputStream;

/*package*/ class ProjectParser {

  private final Project project;

  public ProjectParser(Project project) {
    this.project = project;
  }

  public void readInputStream(InputStream inputStream) {
    try {
      Document document = XmlParser.readXML(inputStream);
      Element rootElement = document.getDocumentElement();
      project.pakage = rootElement.getAttribute("package");

      // inflate
      inflateDependencies(rootElement);
      inflateClasspath(rootElement);
      inflatePacks(rootElement);
      inflateTools(rootElement);
      inflateConfigs(rootElement);

    } catch (Throwable e) {
      e.printStackTrace();
    }
  }

  private void inflateDependencies(Element rootElement) {
    NodeList dependenciesNodeList = rootElement.getElementsByTagName("dependencies");
    if (dependenciesNodeList.getLength() != 0) {
      Element dependenciesElement = (Element) dependenciesNodeList.item(0);
      NodeList fileNodeList = dependenciesElement.getElementsByTagName("file");
      int length = fileNodeList.getLength();
      for (int i = 0; i < length; i++) {
        Project dependency = null;
        Element fileElement = (Element) fileNodeList.item(i);
        String path = fileElement.getAttribute("path");
        path = FileUtil.formatPath(path);
        File file = project.findFile(path);
        if (file.exists()) {
          // jar dependency or directory dependency
          if (!path.endsWith(".jar")) {
            file = new File(file, Project.PROJECT_FILE_NAME);
          }
          dependency = new Project(file, project);
        } else {
          // package dependency
          if (project.file.getName().endsWith(".jar")) {
            dependency = new Project(new File(path), project);
          } else {
            if (!project.isProduction()) {
              throw new RuntimeException("Dependency not found: " + file.getAbsolutePath());
            }
          }
        }
        if (dependency != null) {
          project.children.add(dependency);
        }
      }
    }
  }

  private void inflateClasspath(Element rootElement) {
    NodeList dependenciesNodeList = rootElement.getElementsByTagName("classpath");
    if (dependenciesNodeList.getLength() != 0) {
      Element dependeciesElement = (Element) dependenciesNodeList.item(0);
      NodeList fileNodeList = dependeciesElement.getElementsByTagName("file");
      int length = fileNodeList.getLength();
      for (int i = 0; i < length; i++) {
        Element fileElement = (Element) fileNodeList.item(i);
        String path = fileElement.getAttribute("path");
        project.classPath.add(project.findFile(path));
      }
    }
  }

  private void inflatePacks(Element rootElement) {
    project.packProperties = new Properties();
    NodeList dependenciesNodeList = rootElement.getElementsByTagName("packs");
    if (dependenciesNodeList.getLength() != 0) {
      Element dependeciesElement = (Element) dependenciesNodeList.item(0);
      NodeList fileNodeList = dependeciesElement.getElementsByTagName("pack");
      int length = fileNodeList.getLength();
      for (int i = 0; i < length; i++) {
        Element fileElement = (Element) fileNodeList.item(i);
        String key = fileElement.getAttribute("name");
        String value = fileElement.getAttribute("files");
        project.packProperties.put(key, value);
      }
    }
  }

  private void inflateTools(Element rootElement) {
    project.toolsProperties = new Properties();
    NodeList dependenciesNodeList = rootElement.getElementsByTagName("tools");
    if (dependenciesNodeList.getLength() != 0) {
      Element dependeciesElement = (Element) dependenciesNodeList.item(0);
      NodeList fileNodeList = dependeciesElement.getElementsByTagName("tool");
      int length = fileNodeList.getLength();
      for (int i = 0; i < length; i++) {
        Element fileElement = (Element) fileNodeList.item(i);
        String key = fileElement.getAttribute("jar");
        String value = fileElement.getAttribute("args");
        project.toolsProperties.put(key, value);
      }
    }
  }

  private void inflateConfigs(Element rootElement) {
    String result = "";
    NodeList dependenciesNodeList = rootElement.getElementsByTagName("config");
    if (dependenciesNodeList.getLength() != 0) {
      Element dependeciesElement = (Element) dependenciesNodeList.item(0);
      NodeList fileNodeList = dependeciesElement.getElementsByTagName("file");
      int length = fileNodeList.getLength();
      for (int i = 0; i < length; i++) {
        Element fileElement = (Element) fileNodeList.item(i);
        String path = fileElement.getAttribute("path");
        result += path + ",";
      }
    }
    project.toolsProperties.put("config", result);
  }

}
