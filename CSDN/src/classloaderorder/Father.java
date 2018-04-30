package classloaderorder;

public class Father {
	// 静态代码段，同为静态代码段的时候按照编写顺序加载
	static {
		System.out.println("父类静态代码段");
	}
	// 代码段
	{
		System.out.println("父类普通代码段");
	}
	// 构造函数
	public Father() {
		System.out.println("父类构造函数");
	}
	// 方法
	public void method()
	{
		System.out.println("父类方法");
	}
}
