package pak.test;

public class Calculate {
	//成员变量和构造都是在最外层里面创建的（构造本身就是一种“方法”）
	double output; //成员变量（类的属性）
	//构造（也属于“方法Methods”的一种。有带参数和不带参数两种构造方式。注意这里还不是对象，还没有实例化）
	//构造类似于C语言中结构体(struct)构造的过程
	//创建对象是通过new实现的，创建对象时会调用构造方法
	public Calculate(double output) {
		this.output = output;
	}
	
	//定义一个方法（即“计算”这一动作）
	public static double calculate(double input1, double input2, char opt){
		double result = 0; 
		switch (opt) { 
			case '+': result = input1 + input2; break;  //break不要忘
			case '-': result = input1 - input2; break;
			case '*': result = input1 * input2; break;
			case '/': result = input1 / input2; break;
		}
		return result;
	}
	
	public static void main(String[] args) {
		double input1 = 2;  //局部变量必须初始化才能使用
		double input2 = 0.5;
		char opt = '+';
		/*
		Calculate ca = new Calculate(0);
		ca.output = calculate(input1, input2, opt);
		System.out.println(ca.output);
		*/
		//另一种方法，不用对象
		System.out.println(calculate(input1, input2, opt));
	}
}
