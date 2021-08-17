package by.minsk.epam.jio.generator;

import by.minsk.epam.jio.bean.Treasure;

public class TreasureGenerator {

	private String[] weapon = { "меч", "двуручный меч", "топор", 
								"двуручный топор", "молот", "двуручный молот", 
								"лук", "арбалет", "мушкет", "посох", 
								"волшебна€ палочка", "копьЄ", "кинжал", 
								"алебарда" };
	private String[] weaponAndArmorSuffix = { "€рости", "стального ветра", 
											  "быстроты", "мощи", "грозы",
											  "тирана", "лидера", "гладиатора",
											  "военачальника", "огн€", "ветра",
											  "воздуха", "земли", "света",
											  "тьмы", "природы", 
											  "убийцы драконов",
											  "убийцы великанов", 
											  "из иного мира" };
	private String[] liquid = { "эликсир", "зелье", "снадобье", "настой", 
								"масло", "мазь" };
	private String[] liquidSuffix = { "лечени€", "исцелени€", "отравлени€", 
									  "выведени€ €дов", "регенерации", 
									  "взрыва", "защиты от огн€", 
									  "защиты от воды", "защиты от земли",
									  "защиты от воздуха" };
	private String[] armor = { "полный латный доспех", "полулатный доспех", 
							   "кольчуга", "кожана€ брон€", "манти€" };
	private String[] jewel = { "алмаз", "топаз", "рубин", "сапфир", "шпинель", 
							   "изумруд" };
	private String[] jewelPrefix = { "большой", "средний", "малый" };

	public Treasure generateItem() {
		String res = "";
		int cost = 0;

		int num = (int) StrictMath.round(StrictMath.random() * 4);
		
		switch (num) {

		case 0: {
			int num01 = (int) StrictMath.round(StrictMath.random() 
						* (this.weapon.length - 1));
			res += this.weapon[num01] + " ";
			int num02 = (int) StrictMath.round(StrictMath.random() 
						* (this.weaponAndArmorSuffix.length - 1));
			res += this.weaponAndArmorSuffix[num02];
			cost = (int) StrictMath.round(StrictMath.random() * 9000) + 1000;
			break;
		}

		case 1: 
			int num11 = (int) StrictMath.round(StrictMath.random() 
						* (this.liquid.length - 1));
			res += this.liquid[num11] + " ";
			int num12 = (int) StrictMath.round(StrictMath.random() 
						* (this.liquidSuffix.length - 1));
			res += this.liquidSuffix[num12];
			cost = (int) StrictMath.round(StrictMath.random() * 450) + 50;
			break;

		case 2: 
			int num21 = (int) StrictMath.round(StrictMath.random() 
						* (this.armor.length - 1));
			res += this.armor[num21] + " ";
			int num22 = (int) StrictMath.round(StrictMath.random() 
						* (this.weaponAndArmorSuffix.length - 1));
			res += this.weaponAndArmorSuffix[num22];
			cost = (int) StrictMath.round(StrictMath.random() * 9000) + 1000;
			break;

		case 3: 
			int num31 = (int) StrictMath.round(StrictMath.random() 
						* (this.jewelPrefix.length - 1));
			res += this.jewelPrefix[num31] + " ";
			int num32 = (int) StrictMath.round(StrictMath.random() 
						* (this.jewel.length - 1));
			res += this.jewel[num32];
			cost = (int) StrictMath.round(StrictMath.random() * 9750) + 250;
			break;

		case 4: 
			cost = (int) StrictMath.round(StrictMath.random() * 9000) + 1000;
			res = " уча драгоценностей на сумму " + cost + "з.м.";
			break;
		}

		Treasure result = new Treasure(res, cost);
		return result;
	}
}
