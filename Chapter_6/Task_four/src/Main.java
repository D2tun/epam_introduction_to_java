import port.*;
import java.util.Scanner;

/*���������������. ����. ������� ������ � ���� ��� ���������/�������� �����������. ����� �����������, �����������
� ������� ������ � ����� � �� �������, ����� ���� ��������������� � ����������� �������� ���������������� �����
� ��������������� �����. � ����� �������� ��������� ��������. � ������ ������� ����� ������ ���� �������. �������
����� ����������� � ������� ��� ������������.*/


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ���������� ��������.");
		Port port = new Port(sc.nextInt());
		System.out.println("������� ���������� ��������.");
		for (int i = 0; i <= sc.nextInt(); i++) {
			Thread ship = new Thread(new Ship(port));
			ship.start();
		}
	//	System.out.println("���� ������� " + port.get_port_capacity() + " �����������, � ������ ������ � ����� " + port.get_containers_in_port() + " �����������");
		
		
		
			
			
		

	}

}
