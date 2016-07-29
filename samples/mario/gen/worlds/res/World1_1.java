package worlds.res; public class World1_1 extends mario.objects.hero.World { public static mario.objects.hero.World value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(World1_1.class);} else {return new World1_1();}}{ if (featurea.app.Context.isProduction()) { {setSize(featurea.util.Size.valueOf("1000, 300"));}{final worlds.res.World1_1.Hero var211 = new worlds.res.World1_1.Hero();final mario.objects.landscape.Flagpole var212 = new mario.objects.landscape.Flagpole() { {setPosition(featurea.util.Vector.valueOf("1053.0, 144.0"));}{}{this.build();} };final mario.objects.landscape.Platform var213 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("-9.0, 189.0, 0.0"));setRectangle(9,12,640,40);}{}{this.build();} };final mario.objects.landscape.Block var214 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("56.0, 151.0, 0.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("becomeBig"));}{}{this.build();} };final mario.objects.enemies.Beetle var215 = new mario.objects.enemies.Beetle() { {setPosition(featurea.util.Vector.valueOf("65.0, 180.0, 0.0"));}{}{this.build();} };final mario.objects.enemies.Turtle var216 = new mario.objects.enemies.Turtle() { {setPosition(featurea.util.Vector.valueOf("84.0, 107.0, 0.0"));}{}{this.build();} };final mario.objects.landscape.Platform var217 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("732.0, 196.0, 0.0"));setRectangle(-15,3,384,34);}{}{this.build();} };final mario.objects.landscape.Stairs var218 = new mario.objects.landscape.Stairs() { {setPosition(featurea.util.Vector.valueOf("789.0, 200.0"));setSteps(new int[] { 1, 2, 3, 4, 5});}{}{this.build();} };final mario.objects.enemies.Beetle var219 = new mario.objects.enemies.Beetle() { {setPosition(featurea.util.Vector.valueOf("45.0, 181.0, 0.0"));}{}{this.build();} };final mario.objects.enemies.Lakitu var220 = new mario.objects.enemies.Lakitu() { {setPosition(featurea.util.Vector.valueOf("853.0, 10.0"));}{}{this.build();} };final mario.objects.landscape.Platform var221 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("1142.0, 198.0"));setRectangle(4,1,225,31);}{}{this.build();} };final mario.objects.background.CastleBackground var222 = new mario.objects.background.CastleBackground() { {setPosition(featurea.util.Vector.valueOf("1243.0, 157.0"));setCastle2(featurea.util.Vector.valueOf("1250.0, 16.0, 0.0"));}{}{this.build();} };final mario.objects.enemies.Beetle var223 = new mario.objects.enemies.Beetle() { {setPosition(featurea.util.Vector.valueOf("13.0, 91.0, 0.0"));}{}{this.build();} };final mario.objects.enemies.Beetle var224 = new mario.objects.enemies.Beetle() { {setPosition(featurea.util.Vector.valueOf("49.0, 79.0, 0.0"));}{}{this.build();} };final mario.objects.enemies.Beetle var225 = new mario.objects.enemies.Beetle() { {setPosition(featurea.util.Vector.valueOf("91.0, 80.0, 0.0"));}{}{this.build();} };final mario.objects.landscape.FireStick var226 = new mario.objects.landscape.FireStick() { {setPosition(featurea.util.Vector.valueOf("275.0, 112.0, 0.0"));setLength(6);}{}{this.build();} };setHero(var211);add(var212);add(var213);add(var214);add(var215);add(var216);add(var217);add(var218);add(var219);add(var220);add(var221);add(var222);add(var223);add(var224);add(var225);add(var226);}{this.build();}} }public static class Hero extends mario.objects.hero.Hero { public static mario.objects.hero.Hero value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(Hero.class);} else {return new Hero();}}{ if (featurea.app.Context.isProduction()) { {setPosition(featurea.util.Vector.valueOf("146.0, 144.0, 0.0"));}{}{this.build();}} } }  } 