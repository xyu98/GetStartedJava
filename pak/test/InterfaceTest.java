package pak.test;

public class InterfaceTest {
	public static void main(String[] args) {
		// create cook object
		FoodMenu cook1 = new EasternCook();  // 接口无法new,只能new接口的实现类(多态)
		// create customer object
		Customer customer1 = new Customer(cook1); // customer有成员变量FoodMenu,把实际的cook1传进去★★★
		// the customer taking order
		customer1.order();
	}
}

interface FoodMenu {
	void salad();
	void chips();
	void dumplings();
}

class Customer {
	// Customer调用的是FoodMenu接口
	// EasternCook和WesternCook是FoodMenu接口的实现类
	// 不直接调用实现类，以降低代码耦合度
	// EasternCook ec;
	// WesternCook wc;
	private FoodMenu menu; //养成封装的习惯,同时要提供访问和修改方法
	
	// constructor
	public Customer() {
	}
	
	// 这里必须要有带参数的构造方法,目的是给menu赋一个值
	public Customer(FoodMenu menu) {
		this.menu = menu;
	}
	
	// setter and visitor
	public void setFoodMenu(FoodMenu menu) {
		this.menu = menu;
	}
	
	public FoodMenu getFoodMenu() {
		return menu;
	}
	
	public void order() {
		FoodMenu menu = this.getFoodMenu(); //类的内部也可以直接访问
		menu.dumplings();  // 如果没有带参数构造方法的话,成员变量menu是空的,这里会出现空指针异常★★★
		menu.chips();
		menu.salad();
	}
}

class EasternCook implements FoodMenu {
	@Override
	public void salad() {
		System.out.println("Salad prepared by eastern cook.");
	}

	@Override
	public void chips() {
		System.out.println("Chips prepared by eastern cook.");
	}

	@Override
	public void dumplings() {
		System.out.println("Dumplings prepared by eastern cook.");
	}
}

class WesternCook implements FoodMenu {
	@Override
	public void salad() {
		System.out.println("Salad prepared by western cook.");
	}

	@Override
	public void chips() {
		System.out.println("Chips prepared by western cook.");
	}

	@Override
	public void dumplings() {
		System.out.println("Dumplings prepared by western cook.");
	}
}