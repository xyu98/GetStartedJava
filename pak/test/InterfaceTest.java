package pak.test;

public class InterfaceTest {
	public static void main(String[] args) {
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		
	}
}

interface FoodMenu {
	void salad();
	void chips();
	void dumplings();
}

class Customer {
	// Customer调用的是Menu接口
	// 不直接调用EasternCook和WesternCook 降低类与类之间的耦合度
	// EasternCook ec;
	// WesternCook wc;
	FoodMenu menu;
	
	
	public void order(FoodMenu menu) {
		System.out.println();
		
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