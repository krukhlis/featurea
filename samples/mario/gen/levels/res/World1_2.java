package levels.res; public class World1_2 extends mario.objects.hero.World { public static mario.objects.hero.World value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(World1_2.class);} else {return new World1_2();}}{ if (featurea.app.Context.isProduction()) { {setSize(featurea.util.Size.valueOf("3056, 224"));setTheme(mario.Theme.underground);}{final levels.res.World1_2.Hero var120 = new levels.res.World1_2.Hero();final mario.layers.BlockLayer var121 = new mario.layers.BlockLayer() { {setFlower(new int[] { 1112,128,           2408,128,           168,152,});setStar(new int[] { 744,112,});setLevelUp(new int[] { 1432,32,});setCoin(new int[] { 472,128,18,         1176,128,9,         184,152,1,         200,152,1,         216,152,1,         232,152,1,});setBrick(new int[] { 1112,128,});}{}{this.build();} };final mario.layers.BlockLayer var122 = new mario.layers.BlockLayer() { {setLayout(mario.layers.BlockLayer.Layout.full);}{}{this.build();} };final mario.layers.StoneLayer var123 = new mario.layers.StoneLayer() { {setBlocks(new double[] { 272,184,288,200,           304,168,320,200,           336,152,352,200,           368,136,384,200,           400,136,416,200,           432,152,448,200,           496,152,512,200,           528,168,544,200,           2128,184,2208,200,           2144,168,2208,184,           2160,152,2208,168,           2176,136,2208,152,});}{}{this.build();} };final mario.objects.enemies.Goomba var124 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1294.0, -18.0, 0.0"));setLifeDistance(296);}{}{this.build();} };final mario.objects.enemies.Goomba var125 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("583.0, 180.0, 0.0"));setLifeDistance(520);}{}{this.build();} };final mario.objects.enemies.KoopaTroopa var126 = new mario.objects.enemies.KoopaTroopa() { {setPosition(featurea.util.Vector.valueOf("677.0, 176.0, 0.0"));setLifeDistance(910);}{}{this.build();} };final mario.objects.enemies.KoopaTroopa var127 = new mario.objects.enemies.KoopaTroopa() { {setPosition(featurea.util.Vector.valueOf("710.0, 176.0, 0.0"));setLifeDistance(910);}{}{this.build();} };final mario.objects.enemies.KoopaTroopa var128 = new mario.objects.enemies.KoopaTroopa() { {setPosition(featurea.util.Vector.valueOf("812.0, 155.0, 0.0"));setLifeDistance(910);}{}{this.build();} };final mario.objects.enemies.Goomba var129 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("961.0, 184.0, 0.0"));setLifeDistance(1300);}{}{this.build();} };final mario.objects.enemies.Goomba var130 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1006.0, 185.0, 0.0"));setLifeDistance(1300);}{}{this.build();} };final mario.objects.enemies.Goomba var131 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1153.0, 56.0, 0.0"));setLifeDistance(1300);}{}{this.build();} };final mario.objects.enemies.Goomba var132 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1196.0, 143.0, 0.0"));setLifeDistance(1300);}{}{this.build();} };final mario.objects.enemies.Goomba var133 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1219.0, 120.0, 0.0"));setLifeDistance(1300);}{}{this.build();} };final mario.objects.enemies.Goomba var134 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1583.0, 184.0, 0.0"));setLifeDistance(1700);}{}{this.build();} };final mario.objects.enemies.Goomba var135 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1611.0, 184.0, 0.0"));setLifeDistance(1700);}{}{this.build();} };final mario.objects.enemies.Goomba var136 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("2123.0, 164.0, 0.0"));setLifeDistance(2190);}{}{this.build();} };final mario.objects.enemies.Goomba var137 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("2154.0, 133.0, 0.0"));setLifeDistance(2190);}{}{this.build();} };final mario.objects.enemies.KoopaTroopa var138 = new mario.objects.enemies.KoopaTroopa() { {setPosition(featurea.util.Vector.valueOf("2373.0, 176.0, 0.0"));setAngle(0.0);setLifeDistance(2460);setWalkDistance(20);}{}{this.build();} };final mario.objects.landscape.Tube var139 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("2656.0, 120.0, 0.0"));setCorner(true);setIn("marioUndergroundEndTube");}{}{this.build();} };final mario.objects.enemies.Goomba var140 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1798.0, 184.0, 0.0"));setLifeDistance(1850);}{}{this.build();} };final mario.objects.bonuses.Coin var141 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("640.0, 120.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var142 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("656.0, 71.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var143 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("672.0, 71.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var144 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("720.0, 118.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var145 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("704.0, 71.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var146 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("688.0, 71.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var147 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("944.0, 120.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var148 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("928.0, 120.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var149 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("960.0, 120.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var150 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("976.0, 120.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var151 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("1088.0, 120.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var152 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("1344.0, 74.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var153 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("1360.0, 74.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var154 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("1376.0, 74.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var155 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("1392.0, 74.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var156 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("1408.0, 74.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var157 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("1424.0, 74.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var158 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1348.0, 4.0, 0.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var159 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1369.0, 4.0, 0.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var160 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("467.0, 182.0, 0.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var161 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1418.0, 1.0, 0.0"));}{}{this.build();} };final mario.objects.landscape.Platform var162 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("1344.0, 200.0, 0.0"));setLength(35);setHighness(2);}{}{this.build();} };final mario.objects.landscape.Platform var163 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("0.0, 200.0"));setLength(80);setHighness(2);}{}{this.build();} };final mario.objects.landscape.Platform var164 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("2032.0, 200.0, 0.0"));setLength(11);setHighness(2);}{}{this.build();} };final mario.objects.landscape.Platform var165 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("2560.0, 200.0, 0.0"));setLength(31);setHighness(2);}{}{this.build();} };final mario.objects.landscape.Platform var166 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("1952.0, 200.0"));setLength(2);setHighness(2);}{}{this.build();} };final mario.objects.landscape.Platform var167 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("2318.0, 200.0, 0.0"));setLength(7);setHighness(2);}{}{this.build();} };final mario.objects.landscape.Platform var168 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("87.0, 148.0"));setLength(2);}{}{this.build();} };final mario.objects.landscape.Platform var169 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("141.0, 116.0"));setLength(2);setHighness(2);}{}{this.build();} };final mario.objects.landscape.Platform var170 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("211.0, 105.0, 0.0"));}{}{this.build();} };final mario.objects.landscape.Platform var171 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("37.0, 72.0, 0.0"));setLength(4);setHighness(3);}{}{this.build();} };final mario.objects.landscape.Platform var172 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("138.0, 34.0"));}{}{this.build();} };final mario.objects.landscape.Platform var173 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("180.0, 16.0"));}{}{this.build();} };final mario.objects.landscape.Platform var174 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("217.0, 27.0, 0.0"));}{}{this.build();} };final mario.objects.landscape.Platform var175 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("213.0, -22.0, 0.0"));}{}{this.build();} };final mario.objects.landscape.Platform var176 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("243.0, 141.0, 0.0"));}{}{this.build();} };final mario.objects.landscape.Platform var177 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("280.0, 36.0"));}{}{this.build();} };final mario.objects.landscape.Platform var178 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("126.0, -23.0"));}{}{this.build();} };final mario.objects.landscape.Platform var179 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("344.0, 54.0, 0.0"));setLength(8);}{}{this.build();} };final mario.objects.landscape.Platform var180 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("272.0, 82.0"));}{}{this.build();} };final mario.objects.landscape.Platform var181 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("300.0, -14.0"));}{}{this.build();} };final mario.objects.landscape.Platform var182 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("493.0, 31.0"));}{}{this.build();} };final mario.objects.landscape.Platform var183 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("531.0, 14.0"));}{}{this.build();} };final mario.objects.landscape.Platform var184 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("582.0, -5.0"));}{}{this.build();} };final mario.objects.landscape.Platform var185 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("637.0, -28.0"));}{}{this.build();} };final mario.objects.landscape.Tube var186 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("1648.0, 152.0, -1"));setTrunkCount(3);}{}{this.build();} };final mario.objects.landscape.Tube var187 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("1744.0, 136.0, -1"));setTrunkCount(4);}{}{this.build();} };final mario.objects.landscape.Tube var188 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("1840.0, 168.0, -1"));setTrunkCount(2);}{}{this.build();} };final mario.objects.landscape.Block var189 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2356.0, 114.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("becomeBig"));}{}{this.build();} };final mario.objects.landscape.Block var190 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2340.0, 114.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("coinRotate, 5"));}{}{this.build();} };final mario.objects.landscape.Block var191 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2373.0, 114.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("star"));}{}{this.build();} };final mario.objects.landscape.Block var192 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2390.0, 114.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("star"));}{}{this.build();} };final mario.objects.landscape.Block var193 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2333.0, 175.0"));}{}{this.build();} };final mario.objects.landscape.Block var194 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2313.0, 161.0"));}{}{this.build();} };final mario.objects.landscape.Block var195 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2294.0, 145.0"));}{}{this.build();} };final mario.objects.landscape.Block var196 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2273.0, 129.0"));}{}{this.build();} };final mario.objects.landscape.Platform var197 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("179.0, 86.0"));}{}{this.build();} };final mario.objects.landscape.Block var198 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("198.0, 34.0"));}{}{this.build();} };setHero(var120);add(var121);add(var122);add(var123);add(var124);add(var125);add(var126);add(var127);add(var128);add(var129);add(var130);add(var131);add(var132);add(var133);add(var134);add(var135);add(var136);add(var137);add(var138);add(var139);add(var140);add(var141);add(var142);add(var143);add(var144);add(var145);add(var146);add(var147);add(var148);add(var149);add(var150);add(var151);add(var152);add(var153);add(var154);add(var155);add(var156);add(var157);add(var158);add(var159);add(var160);add(var161);add(var162);add(var163);add(var164);add(var165);add(var166);add(var167);add(var168);add(var169);add(var170);add(var171);add(var172);add(var173);add(var174);add(var175);add(var176);add(var177);add(var178);add(var179);add(var180);add(var181);add(var182);add(var183);add(var184);add(var185);add(var186);add(var187);add(var188);add(var189);add(var190);add(var191);add(var192);add(var193);add(var194);add(var195);add(var196);add(var197);add(var198);}{this.build();}} }public static class Hero extends mario.objects.hero.Hero { public static mario.objects.hero.Hero value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(Hero.class);} else {return new Hero();}}{ if (featurea.app.Context.isProduction()) { {setPosition(featurea.util.Vector.valueOf("47.0, 27.0, 102.0"));setVisible(true);}{}{this.build();}} } }  } 