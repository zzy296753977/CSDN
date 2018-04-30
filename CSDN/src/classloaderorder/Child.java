package classloaderorder;

public class Child extends Father 
{
	//静态代码
	static
	{
		System.out.println("子类静态代码块");
	}
	//普通代码
	{
		System.out.println("子类普通代码块");
	}
	//构造函数
	public Child()
	{
		System.out.println("子类构造函数");
	}
	//子类方法
	public void method()
	{
		System.out.println("子类方法");
	}
}
