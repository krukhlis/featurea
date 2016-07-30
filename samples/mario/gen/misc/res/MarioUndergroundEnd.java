package misc.res; public class MarioUndergroundEnd extends mario.objects.hero.World { public static mario.objects.hero.World value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(MarioUndergroundEnd.class);} else {return new MarioUndergroundEnd();}}{ if (featurea.app.Context.isProduction()) { {setSize(featurea.util.Size.valueOf("568, 224"));setTheme(mario.Theme.overworld);}{final misc.res.MarioUndergroundEnd.Hero var198 = new misc.res.MarioUndergroundEnd.Hero();final mario.objects.background.ThemeBackground var199 = new mario.objects.background.ThemeBackground() { {setStep(featurea.util.Vector.valueOf("768, 0"));setPosition(featurea.util.Vector.valueOf("-512, 0"));setValue("cloud.png, 136, 64, 312, 48;          cloudTriple.png, 440, 64;          cloudDouble.png, 584, 48;          hill.png, 0, 200;          hillSmall.png, 254, 200;          bushTriple.png, 184, 200;          bush.png, 376, 200;          bushDouble.png, 664, 200;");}{}{this.build();} };final mario.objects.background.CastleBackground var200 = new mario.objects.background.CastleBackground() { {setCastle2(featurea.util.Vector.valueOf("416.0, 118.0, 0.0"));}{}{this.build();} };final mario.objects.landscape.Stairs var201 = new mario.objects.landscape.Stairs() { {setPosition(featurea.util.Vector.valueOf("80, 200"));setSteps(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 8});}{}{this.build();} };final mario.objects.landscape.Tube var202 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("48.0, 168.0, 0.0"));setCorner(false);setOut("marioUndergroundEndTube");setPiranhaPlant(true);}{}{this.build();} };final mario.objects.landscape.Flagpole var203 = new mario.objects.landscape.Flagpole() { {setPosition(featurea.util.Vector.valueOf("360.0, 32.0"));}{}{this.build();} };final mario.objects.landscape.Platform var204 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("0, 200.0"));setRectangle(0,0,568,24);}{}{this.build();} };setHero(var198);add(var199);add(var200);add(var201);add(var202);add(var203);add(var204);}{this.build();}} }public static class Hero extends mario.objects.hero.Hero { public static mario.objects.hero.Hero value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(Hero.class);} else {return new Hero();}}{ if (featurea.app.Context.isProduction()) { {}{}{this.build();}} } }  } 