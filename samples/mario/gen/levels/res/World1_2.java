package levels.res; public class World1_2 extends mario.objects.hero.World { public static mario.objects.hero.World value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(World1_2.class);} else {return new World1_2();}}{ if (featurea.app.Context.isProduction()) { {setSize(featurea.util.Size.valueOf("3056, 224"));setTheme(mario.Theme.underground);}{final levels.res.World1_2.Hero var371 = new levels.res.World1_2.Hero();final mario.layers.BlockLayer var372 = new mario.layers.BlockLayer() { {setFlower(new int[] { 1112,128,           2408,128,           168,152,});setStar(new int[] { 744,112,});setLevelUp(new int[] { 1432,32,});setCoin(new int[] { 472,128,18,         1176,128,9,         184,152,1,         200,152,1,         216,152,1,         232,152,1,});setBrick(new int[] { 1112,128,});}{}{this.build();} };final mario.layers.BlockLayer var373 = new mario.layers.BlockLayer() { {setLayout(mario.layers.BlockLayer.Layout.full);}{}{this.build();} };final mario.layers.StoneLayer var374 = new mario.layers.StoneLayer() { {setBlocks(new double[] { 272,184,288,200,           304,168,320,200,           336,152,352,200,           368,136,384,200,           400,136,416,200,           432,152,448,200,           496,152,512,200,           528,168,544,200,           2128,184,2208,200,           2144,168,2208,184,           2160,152,2208,168,           2176,136,2208,152,});}{}{this.build();} };final mario.objects.enemies.Goomba var375 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1294.0, -18.0, 0.0"));setLifeDistance(296);}{}{this.build();} };final mario.objects.enemies.Goomba var376 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("583.0, 180.0, 0.0"));setLifeDistance(520);}{}{this.build();} };final mario.objects.enemies.KoopaTroopa var377 = new mario.objects.enemies.KoopaTroopa() { {setPosition(featurea.util.Vector.valueOf("677.0, 176.0, 0.0"));setLifeDistance(910);}{}{this.build();} };final mario.objects.enemies.KoopaTroopa var378 = new mario.objects.enemies.KoopaTroopa() { {setPosition(featurea.util.Vector.valueOf("710.0, 176.0, 0.0"));setLifeDistance(910);}{}{this.build();} };final mario.objects.enemies.KoopaTroopa var379 = new mario.objects.enemies.KoopaTroopa() { {setPosition(featurea.util.Vector.valueOf("812.0, 155.0, 0.0"));setLifeDistance(910);}{}{this.build();} };final mario.objects.enemies.Goomba var380 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("961.0, 184.0, 0.0"));setLifeDistance(1300);}{}{this.build();} };final mario.objects.enemies.Goomba var381 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1006.0, 185.0, 0.0"));setLifeDistance(1300);}{}{this.build();} };final mario.objects.enemies.Goomba var382 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1153.0, 56.0, 0.0"));setLifeDistance(1300);}{}{this.build();} };final mario.objects.enemies.Goomba var383 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1196.0, 143.0, 0.0"));setLifeDistance(1300);}{}{this.build();} };final mario.objects.enemies.Goomba var384 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1219.0, 120.0, 0.0"));setLifeDistance(1300);}{}{this.build();} };final mario.objects.enemies.Goomba var385 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1583.0, 184.0, 0.0"));setLifeDistance(1700);}{}{this.build();} };final mario.objects.enemies.Goomba var386 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1611.0, 184.0, 0.0"));setLifeDistance(1700);}{}{this.build();} };final mario.objects.enemies.Goomba var387 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("2123.0, 164.0, 0.0"));setLifeDistance(2190);}{}{this.build();} };final mario.objects.enemies.Goomba var388 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("2154.0, 133.0, 0.0"));setLifeDistance(2190);}{}{this.build();} };final mario.objects.enemies.KoopaTroopa var389 = new mario.objects.enemies.KoopaTroopa() { {setPosition(featurea.util.Vector.valueOf("2373.0, 176.0, 0.0"));setAngle(0.0);setLifeDistance(2460);setWalkDistance(20);}{}{this.build();} };final mario.objects.landscape.Tube var390 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("2656.0, 120.0, 0.0"));setCorner(true);setIn("marioUndergroundEndTube");}{}{this.build();} };final mario.objects.enemies.Goomba var391 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1798.0, 184.0, 0.0"));setLifeDistance(1850);}{}{this.build();} };final mario.objects.bonuses.Coin var392 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("640.0, 120.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var393 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("656.0, 71.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var394 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("672.0, 71.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var395 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("720.0, 118.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var396 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("704.0, 71.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var397 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("688.0, 71.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var398 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("944.0, 120.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var399 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("928.0, 120.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var400 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("960.0, 120.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var401 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("976.0, 120.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var402 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("1088.0, 120.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var403 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("1344.0, 74.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var404 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("1360.0, 74.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var405 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("1376.0, 74.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var406 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("1392.0, 74.0, 0.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var407 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("1408.0, 74.0"));}{}{this.build();} };final mario.objects.bonuses.Coin var408 = new mario.objects.bonuses.Coin() { {setPosition(featurea.util.Vector.valueOf("1424.0, 74.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var409 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1348.0, 4.0, 0.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var410 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1369.0, 4.0, 0.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var411 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("467.0, 182.0, 0.0"));}{}{this.build();} };final mario.objects.enemies.Goomba var412 = new mario.objects.enemies.Goomba() { {setPosition(featurea.util.Vector.valueOf("1418.0, 1.0, 0.0"));}{}{this.build();} };final mario.objects.landscape.Platform var413 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("1344.0, 200.0, 0.0"));setLength(35);setHighness(2);}{}{this.build();} };final mario.objects.landscape.Platform var414 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("0.0, 200.0"));setLength(80);setHighness(2);}{}{this.build();} };final mario.objects.landscape.Platform var415 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("2032.0, 200.0, 0.0"));setLength(11);setHighness(2);}{}{this.build();} };final mario.objects.landscape.Platform var416 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("2560.0, 200.0, 0.0"));setLength(31);setHighness(2);}{}{this.build();} };final mario.objects.landscape.Platform var417 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("1952.0, 200.0"));setLength(2);setHighness(2);}{}{this.build();} };final mario.objects.landscape.Platform var418 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("2318.0, 200.0, 0.0"));setLength(7);setHighness(2);}{}{this.build();} };final mario.objects.landscape.Platform var419 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("87.0, 148.0"));setLength(2);}{}{this.build();} };final mario.objects.landscape.Platform var420 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("141.0, 116.0"));setLength(2);setHighness(2);}{}{this.build();} };final mario.objects.landscape.Platform var421 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("211.0, 105.0, 0.0"));}{}{this.build();} };final mario.objects.landscape.Platform var422 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("37.0, 72.0, 0.0"));setLength(4);setHighness(3);}{}{this.build();} };final mario.objects.landscape.Platform var423 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("138.0, 34.0"));}{}{this.build();} };final mario.objects.landscape.Platform var424 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("180.0, 16.0"));}{}{this.build();} };final mario.objects.landscape.Platform var425 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("217.0, 27.0, 0.0"));}{}{this.build();} };final mario.objects.landscape.Platform var426 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("213.0, -22.0, 0.0"));}{}{this.build();} };final mario.objects.landscape.Platform var427 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("243.0, 141.0, 0.0"));}{}{this.build();} };final mario.objects.landscape.Platform var428 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("280.0, 36.0"));}{}{this.build();} };final mario.objects.landscape.Platform var429 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("126.0, -23.0"));}{}{this.build();} };final mario.objects.landscape.Platform var430 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("344.0, 54.0, 0.0"));setLength(8);}{}{this.build();} };final mario.objects.landscape.Platform var431 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("272.0, 82.0"));}{}{this.build();} };final mario.objects.landscape.Platform var432 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("300.0, -14.0"));}{}{this.build();} };final mario.objects.landscape.Platform var433 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("493.0, 31.0"));}{}{this.build();} };final mario.objects.landscape.Platform var434 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("531.0, 14.0"));}{}{this.build();} };final mario.objects.landscape.Platform var435 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("582.0, -5.0"));}{}{this.build();} };final mario.objects.landscape.Platform var436 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("637.0, -28.0"));}{}{this.build();} };final mario.objects.landscape.Tube var437 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("1648.0, 152.0, -1"));setTrunkCount(3);}{}{this.build();} };final mario.objects.landscape.Tube var438 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("1744.0, 136.0, -1"));setTrunkCount(4);}{}{this.build();} };final mario.objects.landscape.Tube var439 = new mario.objects.landscape.Tube() { {setPosition(featurea.util.Vector.valueOf("1840.0, 168.0, -1"));setTrunkCount(2);}{}{this.build();} };final mario.objects.landscape.Block var440 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2356.0, 114.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("becomeBig"));}{}{this.build();} };final mario.objects.landscape.Block var441 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2340.0, 114.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("coinRotate, 5"));}{}{this.build();} };final mario.objects.landscape.Block var442 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2373.0, 114.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("star"));}{}{this.build();} };final mario.objects.landscape.Block var443 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2390.0, 114.0"));setBonus(mario.objects.bonuses.Bonus.valueOf("star"));}{}{this.build();} };final mario.objects.landscape.Block var444 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2333.0, 175.0"));}{}{this.build();} };final mario.objects.landscape.Block var445 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2313.0, 161.0"));}{}{this.build();} };final mario.objects.landscape.Block var446 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2294.0, 145.0"));}{}{this.build();} };final mario.objects.landscape.Block var447 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("2273.0, 129.0"));}{}{this.build();} };final mario.objects.landscape.Platform var448 = new mario.objects.landscape.Platform() { {setPosition(featurea.util.Vector.valueOf("179.0, 86.0"));}{}{this.build();} };final mario.objects.landscape.Block var449 = new mario.objects.landscape.Block() { {setPosition(featurea.util.Vector.valueOf("198.0, 34.0"));}{}{this.build();} };setHero(var371);add(var372);add(var373);add(var374);add(var375);add(var376);add(var377);add(var378);add(var379);add(var380);add(var381);add(var382);add(var383);add(var384);add(var385);add(var386);add(var387);add(var388);add(var389);add(var390);add(var391);add(var392);add(var393);add(var394);add(var395);add(var396);add(var397);add(var398);add(var399);add(var400);add(var401);add(var402);add(var403);add(var404);add(var405);add(var406);add(var407);add(var408);add(var409);add(var410);add(var411);add(var412);add(var413);add(var414);add(var415);add(var416);add(var417);add(var418);add(var419);add(var420);add(var421);add(var422);add(var423);add(var424);add(var425);add(var426);add(var427);add(var428);add(var429);add(var430);add(var431);add(var432);add(var433);add(var434);add(var435);add(var436);add(var437);add(var438);add(var439);add(var440);add(var441);add(var442);add(var443);add(var444);add(var445);add(var446);add(var447);add(var448);add(var449);}{this.build();}} }public static class Hero extends mario.objects.hero.Hero { public static mario.objects.hero.Hero value() {if (!featurea.app.Context.isProduction()) {return featurea.app.Context.getResources().getResource(Hero.class);} else {return new Hero();}}{ if (featurea.app.Context.isProduction()) { {setPosition(featurea.util.Vector.valueOf("47.0, 27.0, 102.0"));setVisible(true);}{}{this.build();}} } }  } 