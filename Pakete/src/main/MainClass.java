package main;

import item.tools.Shovel;
import item.weapons.melee.Sword;
import item.weapons.range.*;    // Klassen Bow und Gun werden importiert

public class MainClass {

    Shovel shovel = new Shovel();

    item.weapons.melee.Sword schwert = new Sword(); //Das geht auch, aber macht keinen Sinn

    Gun gun = new Gun();
    Bow bow = new Bow();
}
