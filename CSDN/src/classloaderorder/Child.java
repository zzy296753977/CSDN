package classloaderorder;

public class Child extends Father 
{
	//��̬����
	static
	{
		System.out.println("���ྲ̬�����");
	}
	//��ͨ����
	{
		System.out.println("������ͨ�����");
	}
	//���캯��
	public Child()
	{
		System.out.println("���๹�캯��");
	}
	//���෽��
	public void method()
	{
		System.out.println("���෽��");
	}
}
