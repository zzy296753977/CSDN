package classloaderorder;

public class Father {
	// ��̬����Σ�ͬΪ��̬����ε�ʱ���ձ�д˳�����
	static {
		System.out.println("���ྲ̬�����");
	}
	// �����
	{
		System.out.println("������ͨ�����");
	}
	// ���캯��
	public Father() {
		System.out.println("���๹�캯��");
	}
	// ����
	public void method()
	{
		System.out.println("���෽��");
	}
}
