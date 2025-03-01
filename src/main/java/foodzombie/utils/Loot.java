package foodzombie.utils;

import necesse.inventory.lootTable.LootTable;
import necesse.inventory.lootTable.lootItem.ChanceLootItem;

public class Loot {

    public static LootTable lootTable = new LootTable(
        ChanceLootItem.between(LootNumbers.MONEY.PROBABILITY(), "coin", LootNumbers.MONEY.MINAMOUNT(), LootNumbers.MONEY.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.RARE.PROBABILITY(), "blackcoffee", LootNumbers.RARE.MINAMOUNT(), LootNumbers.RARE.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "cappuccino", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.UNCOMMON.PROBABILITY(), "meatballs", LootNumbers.UNCOMMON.MINAMOUNT(), LootNumbers.UNCOMMON.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.UNCOMMON.PROBABILITY(), "smokedfillet", LootNumbers.UNCOMMON.MINAMOUNT(), LootNumbers.UNCOMMON.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.UNCOMMON.PROBABILITY(), "blueberrycake", LootNumbers.UNCOMMON.MINAMOUNT(), LootNumbers.UNCOMMON.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.UNCOMMON.PROBABILITY(), "blackberryicecream", LootNumbers.UNCOMMON.MINAMOUNT(), LootNumbers.UNCOMMON.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.UNCOMMON.PROBABILITY(), "fruitsmoothie", LootNumbers.UNCOMMON.MINAMOUNT(), LootNumbers.UNCOMMON.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.UNCOMMON.PROBABILITY(), "fishtaco", LootNumbers.UNCOMMON.MINAMOUNT(), LootNumbers.UNCOMMON.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.UNCOMMON.PROBABILITY(), "juniorburger", LootNumbers.UNCOMMON.MINAMOUNT(), LootNumbers.UNCOMMON.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.UNCOMMON.PROBABILITY(), "cheeseburger", LootNumbers.UNCOMMON.MINAMOUNT(), LootNumbers.UNCOMMON.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.UNCOMMON.PROBABILITY(), "omelette", LootNumbers.UNCOMMON.MINAMOUNT(), LootNumbers.UNCOMMON.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.UNCOMMON.PROBABILITY(), "nachos", LootNumbers.UNCOMMON.MINAMOUNT(), LootNumbers.UNCOMMON.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.UNCOMMON.PROBABILITY(), "eggplantparmesan", LootNumbers.UNCOMMON.MINAMOUNT(), LootNumbers.UNCOMMON.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.RARE.PROBABILITY(), "raspberrymousse", LootNumbers.RARE.MINAMOUNT(), LootNumbers.RARE.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.RARE.PROBABILITY(), "tropicalstew", LootNumbers.RARE.MINAMOUNT(), LootNumbers.RARE.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.RARE.PROBABILITY(), "fishandchips", LootNumbers.RARE.MINAMOUNT(), LootNumbers.RARE.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.RARE.PROBABILITY(), "freshpotatosalad", LootNumbers.RARE.MINAMOUNT(), LootNumbers.RARE.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.RARE.PROBABILITY(), "rootsalad", LootNumbers.RARE.MINAMOUNT(), LootNumbers.RARE.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.RARE.PROBABILITY(), "hotdog", LootNumbers.RARE.MINAMOUNT(), LootNumbers.RARE.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.RARE.PROBABILITY(), "ricepudding", LootNumbers.RARE.MINAMOUNT(), LootNumbers.RARE.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.RARE.PROBABILITY(), "minersstew", LootNumbers.RARE.MINAMOUNT(), LootNumbers.RARE.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "chickencutletdish", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "sushirolls", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "friedpork", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "dessertpancakes", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "bananapudding", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "lemontart", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "parisiansteak", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "deepfriedchicken", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "spaghettibolognese", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "porktenderloin", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "beefgoulash", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "shishkebab", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "pumpkinpie", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.RARE.PROBABILITY(), "sweetlemonade", LootNumbers.RARE.MINAMOUNT(), LootNumbers.RARE.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "raspberryjam", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "raspberrypie", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "strawberrypie", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT()),
        ChanceLootItem.between(LootNumbers.EPIC.PROBABILITY(), "wildsalad", LootNumbers.EPIC.MINAMOUNT(), LootNumbers.EPIC.MAXAMOUNT())
    );
}
