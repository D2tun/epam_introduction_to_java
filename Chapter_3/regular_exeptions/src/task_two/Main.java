package task_two;

/* ���� ������, ���������� ��������� ����� (xml-��������). �������� ����������, ����������� ���������������
���������� ���������� ����� xml-��������� � ��� ��� (����������� ���, ����������� ���, ���������� ����, ��� ���
����). ������������ �������� ��������� XML ��� ������� ������ ������ ������. */

public class Main {

	public static void main(String[] args) {
		
		String xml_doc = "<notes>\n" + 
						 " <note id = \"1\">\n" + 
						 "  <to>����</to>\n" + 
						 "  <from>�����</from>\n" + 
						 "  <heading>�����������</heading>\n" + 
						 "  <body>������� ��� ������!</body>\n" + 
						 " </note>\n" + 
						 " <note id = \"2\">\n" + 
						 "  <to>����</to>\n" + 
						 "  <from>����</from>\n" + 
						 "  <heading>������ �����������!</heading>\n" + 
						 "  <body/>\n" + 
						 " </note>\n" + 
						 "</notes>";
		
		System.out.println("����������� ����: " + XML_analyzer.opening_tags(xml_doc));
		System.out.println("����������� ����: " + XML_analyzer.closing_tags(xml_doc));
		System.out.println("���������� �����: " + XML_analyzer.content_of_tags(xml_doc));
		System.out.println("������ ����: " + XML_analyzer.empty_tags(xml_doc));
	}

}
