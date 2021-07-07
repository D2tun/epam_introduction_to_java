package bean;



public class Treasure_generator {

	private String[] weapon = { "���", "��������� ���", "�����", "��������� �����", "�����", "��������� �����",
			"���", "�������", "������", "�����", "��������� �������", "�����", "������", "��������" };
	private String[] weapon_and_armor_suffix = { "������", "��������� �����", "��������", "����", "�����",
			"������", "������", "����������", "�������������", "����", "�����", "�������", "�����", "�����", "����",
			"�������", "������ ��������", "������ ���������", "�� ����� ����" };
	private String[] liquid = { "�������", "�����", "��������", "������", "�����", "����" };
	private String[] liquid_suffix = { "�������", "���������", "����������", "��������� ����", "�����������",
			"������", "������ �� ����", "������ �� ����", "������ �� �����", "������ �� �������" };
	private String[] armor = { "������ ������ ������", "���������� ������", "��������", "������� �����",
			"������" };
	private String[] jewel = { "�����", "�����", "�����", "������", "�������", "�������" };
	private String[] jewel_prefix = { "�������", "�������", "�����" };

	public Treasure generate_item() {
		String res = "";
		int cost = 0;

		int num = (int) StrictMath.round(StrictMath.random() * 4);
		switch (num) {

		case 0: {
			int num01 = (int) StrictMath.round(StrictMath.random() * (this.weapon.length - 1));
			res += this.weapon[num01] + " ";
			int num02 = (int) StrictMath.round(StrictMath.random() * (this.weapon_and_armor_suffix.length - 1));
			res += this.weapon_and_armor_suffix[num02];
			cost = (int) StrictMath.round(StrictMath.random() * 9000) + 1000;
			break;
		}

		case 1: {
			int num11 = (int) StrictMath.round(StrictMath.random() * (this.liquid.length - 1));
			res += this.liquid[num11] + " ";
			int num12 = (int) StrictMath.round(StrictMath.random() * (this.liquid_suffix.length - 1));
			res += this.liquid_suffix[num12];
			cost = (int) StrictMath.round(StrictMath.random() * 450) + 50;
			break;
		}

		case 2: {
			int num21 = (int) StrictMath.round(StrictMath.random() * (this.armor.length - 1));
			res += this.armor[num21] + " ";
			int num22 = (int) StrictMath.round(StrictMath.random() * (this.weapon_and_armor_suffix.length - 1));
			res += this.weapon_and_armor_suffix[num22];
			cost = (int) StrictMath.round(StrictMath.random() * 9000) + 1000;
			break;
		}

		case 3: {
			int num31 = (int) StrictMath.round(StrictMath.random() * (this.jewel_prefix.length - 1));
			res += this.jewel_prefix[num31] + " ";
			int num32 = (int) StrictMath.round(StrictMath.random() * (this.jewel.length - 1));
			res += this.jewel[num32];
			cost = (int) StrictMath.round(StrictMath.random() * 9750) + 250;
			break;
		}

		case 4: {
			cost = (int) StrictMath.round(StrictMath.random() * 9000) + 1000;
			res = "���� �������������� �� ����� " + cost + "�.�.";
			break;
		}
		}

		Treasure result = new Treasure(res, cost);
		return result;
	}
}
