package bonusLevels.res; public class E extends mario.objects.hero.World { public static mario.objects.hero.World value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(E.class);} else {return new E();}}{ if (featurea.app.Context.isProduction()) { {setTheme(mario.Theme.underground);}{final mario.objects.landscape.Tube var16 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("208, 168"));setCorner(true);}{}{this.build();} };final mario.layers.PlatformLayer var17 = new mario.layers.PlatformLayer() { {setXy(new int[] { 0, 256, 200, 224});}{}{this.build();} };final mario.layers.BlockLayer var18 = new mario.layers.BlockLayer() { {setCoin(new int[] { 323, 112, 9});}{}{this.build();} };add(var16);add(var17);add(var18);}{this.build();}} } } 