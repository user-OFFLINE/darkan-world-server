package com.rs.game.content.dnds.penguins

import com.rs.lib.game.Tile

enum class Penguins(val points: Int, val npcId: Int, val locationHint: String, val tile: Tile, val wikiLocation: String, val roamRange: IntRange) {
    CACTUS_1(1, 8107, "located around the Al Kharid region, north of Shantay Pass.", Tile(3310, 3157, 0), "Al Kharid - South-west of Ranael's Super Skirt Store", 7..35),
    CACTUS_2(1, 8107, "located in the north of the Kharidian desert.", Tile(3257, 3055, 0), "Southern Desert (Mining Camp) - North-west of the Desert Mining Camp", 7..35),
    CACTUS_3(1, 8107, "located in the south of the Kharidian desert.", Tile(3250, 2958, 0), "Southern Desert (Lodestone) - East of the Bandit camp lodestone", 7..35),
    CACTUS_4(2, 8107, "located in a city of plagues within the desert.", Tile(3275, 2802, 0), "Sophanem (Northern Sophanem) - West of the musician", 7..20),
    CACTUS_5(2, 8107, "located in a city of plagues within the desert.", Tile(3282, 2755, 0), "Sophanem (Southern Sophanem) - Inside the most south-western building", 7..20),
    CACTUS_6(2, 8107, "located in the south of the Kharidian desert.", Tile(3438, 2958, 0), "Southern Desert (Nardah) - North of Nardah, south-east of Fairy Ring code DLQ", 5..20),
    CACTUS_7(2, 8107, "located in the south of the Kharidian desert.", Tile(3285, 2911, 0), "Southern Desert (Pyramid) - East of the pyramid, north of the bridge", 5..20),

    BUSH_1(1, 8105, "located near the Barbarian Outpost.", Tile(2529, 3587, 0), "Barbarian Outpost - North of the Barbarian Assault building", 5..25),
    BUSH_2(1, 8105, "located where banana smugglers dwell.", Tile(2739, 3233, 0), "Brimhaven - North-east of goldmine", 5..15),
    BUSH_3(1, 8105, "located south of Ardougne.", Tile(2455, 3092, 0), "Castle Wars - East of Castle Wars lobby", 5..20),
    BUSH_4(1, 8105, "located deep in the jungle", Tile(2851, 3060, 0), "Central Karamja - When world map is 200%, next to 1st tree west of “Karamja”", 5..20),
    BUSH_5(1, 8105, "located where eagles fly.", Tile(2311, 3518, 0), "Eagles' Peak - North-west of Eagles' Peak, next to the tree, south-west of the boulder trap", 5..10),
    BUSH_6(1, 8105, "located deep in the jungle.", Tile(2938, 2978, 0), "East Karamja - West of the fence entrance to the glider on Karamja", 9..25),
    BUSH_7(1, 8105, "located south of Ardougne.", Tile(2513, 3154, 0), "Gnome Maze - Inside the south-western part of the maze", 4..10),
    BUSH_8(1, 8105, "located near a big tree surrounded by short people.", Tile(2386, 3454, 0), "Gnome Stronghold - Directly west of ”Stronghold” on the world map, next to river", 5..30),
    BUSH_9(1, 8105, "located around the Ice Mountain region.", Tile(2949, 3509, 0), "Goblin Village - West of the generals' house in the village", 7..20),
    BUSH_10(1, 8105, "located around the Al Kharid region, north of Shantay Pass.", Tile(3350, 3309, 0), "Mage Training Arena - West of Mage Training Arena, east of rocky outcrop", 5..15),
    BUSH_11(1, 8105, "located in the east of the kingdom of Kandarin.", Tile(2632, 3501, 0), "McGrubor's Wood - West of Fairy Ring code ALS", 5..35),
    BUSH_12(1, 8105, "located near the mud skippers.", Tile(2989, 3121, 0), "Mudskipper Point - North-west of Fairy Ring code AIQ, through line of palm trees", 5..10),
    BUSH_13(1, 8105, "located north of Ardougne.", Tile(2399, 3363, 0), "North Ardougne - West of Ardougne's Outpost, south of the cracked dolmen", 5..20),
    BUSH_14(1, 8105, "located where wizards study.", Tile(3112, 3151, 0), "Wizard's Tower - Outside tower, east of Fairy Ring code DIS", 5..20),
    BUSH_15(2, 8105, "located where monkeys rule.", Tile(2802, 2806, 0), "Ape Atoll - Inside the walls of Marim. North-east of the temple", 5..55),
    BUSH_16(2, 8105, "located near some ogres in South Feldip Hills.", Tile(2578, 2909, 0), "Feldip Hills - West of the hut north of the Oo'glog red sandstone mine", 5..20),
    BUSH_17(2, 8105, "located near a town of werewolves.", Tile(3600, 3486, 0), "Haunted Woods - South-east of Fairy Ring code ALQ", 5..25),
    //BUSH_18(2, 8105, "located on islands where brothers quarrel.", Tile(2355, 3848, 0), "Jatizso - On the second island north of Neitiznot", 5..20),
    BUSH_19(2, 8105, "located on an island, etc.", Tile(2534, 3871, 0), "Miscellania - East from the north-east corner of the Miscellanian castle", 5..60),
    BUSH_20(2, 8105, "located where bloodsuckers rule.", Tile(3472, 3392, 0), "Mort Myre - South-east of the triangular lake, south of Fairy Ring code BKR", 5..25),
    //BUSH_21(2, 8105, "located on islands where brothers quarrel.", Tile(2353, 3834, 0), "Neitiznot - On the grassy island, north of the town of Neitiznot", 5..20),

    ROCK_1(1, 8109, "located where the Imperial Guard train.", Tile(2867, 3606, 0), "Death Plateau - On the path to Death Plateau", 5..35),
    ROCK_2(1, 8109, "located in the north of the kingdom of Misthalin.", Tile(3356, 3416, 0), "Digsite - Near west side winch", 10..30),
    ROCK_3(1, 8109, "located around Feldip Hills, near Gu'Tanoth.", Tile(2606, 3004, 0), "Feldip Hills - North-west of quest start icon, just south of the 3 coastline humps", 15..50),
    ROCK_4(1, 8109, "located around the Ice Mountain region.", Tile(3013, 3501, 0), "Ice Mountain - South-west of the Oracle's tent", 5..15),
    ROCK_5(1, 8109, "located between Fremennik and barbarians.", Tile(2524, 3625, 0), "Lighthouse - South-east of the lighthouse, just past the bridge, west of the shallow pool", 10..30),
    ROCK_6(1, 8109, "located between Fremennik and barbarians.", Tile(2675, 3717, 0), "Rellekka - Among the rock crabs inside town", 5..20),
    ROCK_7(1, 8109, "located near a mountain of wolves.", Tile(2869, 3515, 0), "White Wolf Mountain - East of White Wolf Mountain", 5..15),
    ROCK_8(1, 8109, "located near the coast, east of Ardougne.", Tile(2733, 3283, 0), "Witchaven - East of Witchaven church", 5..20),
    ROCK_9(2, 8109, "located around Feldip Hills, near Gu'Tanoth.", Tile(2340, 3064, 0), "Castle Wars - South-west of Castle Wars, between the 2 lakes, north of the rare tree icon", 5..25),
    //ROCK_10(2, 8109, "located on islands where brothers quarrel.", Tile(2413, 3846, 0), "Jatizso - West from the bridge north of Jatizso", 5..20),
    ROCK_11(2, 8109, "located around Feldip Hills, near Gu'Tanoth.", Tile(2438, 3050, 0), "Jiggig - South-west of quest start icon at Jiggig", 5..15),
    ROCK_12(2, 8109, "located where dwarves dig deep.", Tile(2909, 10210, 0), "Keldagrim - North-west of Blasidar the sculptor's house", 5..45),
    ROCK_13(2, 8109, "located on a large crescent island.", Tile(2117, 3942, 0), "Lunar Isle - South-east corner of Livid Farm", 5..45),
    ROCK_14(2, 8109, "located where bloodsuckers rule.", Tile(3545, 3439, 0), "Mort Myre - In the hunter area, just west of the south hunter training icon", 5..20),
    ROCK_15(2, 8109, "located on islands where brothers quarrel.", Tile(2357, 3797, 0), "Neitiznot - Near the south-east corner of town", 5..40),
    ROCK_16(2, 8109, "located near the pointy-eared ones.", Tile(2232, 3270, 0), "Tirannwn (Prifddinas South Gate) - Confined amongst the trees east of the Prifddinas southern gate", 3..15),
    ROCK_17(2, 8109, "located in the Wilderness.", Tile(3236, 3927, 0), "Wilderness (Scorpion Pit) - South of the Scorpion Pit, wilderness level 51, near the Chaos Elemental", 5..45),
    ROCK_18(2, 8109, "located in the Wilderness.", Tile(3019, 3866, 0), "Wilderness (North KBD) - North of the Lava Maze Dungeon to the KBD. Wilderness level 44", 5..45),
    ROCK_19(2, 8109, "located in the Wilderness.", Tile(3108, 3837, 0), "Wilderness (Lava Maze) - South-eastern corner of the Lava Maze", 5..45),
    ROCK_20(2, 8109, "located in the Wilderness.", Tile(2998, 3829, 0), "Wilderness (South KBD) - East of the Chaos Temple, wilderness level 39", 5..45),
    ROCK_21(2, 8109, "located in the Wilderness.", Tile(3169, 3650, 0), "Wilderness (Volcano) - North-east of the pond south of the volcano", 5..45),

    CRATE_1(1, 8108, "located around a village between a great tower and a vampyre's manor.", Tile(3116, 3337, 0), "Draynor Manor - Inside Draynor Manor's yard, just north-east from the fence entrance", 5..25),
    CRATE_2(1, 8108, "located where banana smugglers dwell.", Tile(2870, 3156, 0), "Musa Point - Among the trees south-east of the volcano, north-west of the shortcut", 15..45),
    CRATE_3(1, 8108, "located south of Ardougne.", Tile(2440, 3206, 0), "Observatory - North of the Observatory, near Hill giants", 5..30),
    CRATE_4(2, 8108, "located near a town of werewolves.", Tile(3637, 3486, 0), "Haunted Woods - At the lake west of the western entrance to Port Phasmatys", 5..35),
    CRATE_5(2, 8108, "located where fishers colonise.", Tile(2322, 3658, 0), "Piscatoris  - Among the dead trees south of Piscatoris Fishing Colony", 5..25),

    BARREL_1(1, 8104, "located where no weapons may go.", Tile(2810, 3383, 0), "Entrana - North-west corner of Entrana, south-east of the Submerged statue", 5..45),
    BARREL_2(1, 8104, "located south of Ardougne.", Tile(2662, 3152, 0), "Port Khazard - East of the store nearest the dock", 5..30),
    //BARREL_3(1, 8104, "located where the big-eyed goblins dwell.", Tile(2732, 5326, 0), "Dorgesh-Kaan - East of the large white fern north of the lamp stall", 5..55),
    BARREL_4(2, 8104, "located where monkeys rule.", Tile(2751, 2700, 0), "Ape Atoll - Outside the walls of Marim. West from the dungeon", 5..55),
    BARREL_5(2, 8104, "located where pirates feel mostly harmless.", Tile(3738, 3001, 0), "Mos Le'Harmless - East of the town's east wall, near first tropical tree", 5..55),
    BARREL_6(2, 8104, "located near the city of ghosts.", Tile(3654, 3491, 0), "Port Phasmatys - South-west of the southern most market stall", 5..30),

    TOADSTOOL_1(1, 8110, "located in the south of the kingdom of Misthalin.", Tile(3211, 3156, 0), "Lumbridge Swamp - North-east of Father Urhney's house", 5..18),
    TOADSTOOL_2(1, 8110, "located in the fairy realm.", Tile(2420, 4473, 0), "Zanaris - Close to wall, north-east of the yew tree and windmill", 5..55),
    TOADSTOOL_3(2, 8110, "located where bloodsuckers rule.", Tile(3416, 3438, 0), "Mort Myre - On the south-eastern edge of the lake, where “River Salve” is found on the world map", 5..20),
    TOADSTOOL_4(2, 8110, "located near the pointy-eared ones.", Tile(2219, 3227, 0), "Tirannwn (South of Elf Camp) - South-east of the log balance to the Elf Camp", 5..30),
    TOADSTOOL_5(2, 8110, "located near the pointy-eared ones.", Tile(2315, 3172, 0), "Tirannwn (Lletya) - Just west of Lletya's entrance, south-west of clothes shop icon on map", 10..30),
    TOADSTOOL_6(2, 8110, "located near the pointy-eared ones.", Tile(2181, 3172, 0), "Tirannwn (North of Tyras Camp) - South-west of the catapult", 5..20);

    companion object {
        fun getPenguinByTile(tile: Tile): Penguins? {
            return Penguins.entries.find { it.tile == tile }
        }
        fun getPenguinsByPoints(points: Int): List<Penguins> {
            return Penguins.entries
                .shuffled()
                .filter { it.points == points }
        }
    }

}