package in.com.pluralsight.example;

public class CustomSingleton {

	private static CustomSingleton instance = null;

	private CustomSingleton() {
	}

	public static CustomSingleton getInstance() {
		if (null == instance) {
			synchronized (CustomSingleton.class) {
				if (null == instance) {
					instance = new CustomSingleton();
				}
			}
		}
		return instance;
	}

	public static void main(String[] arg) {
		CustomSingleton instance1 = CustomSingleton.getInstance();
		System.out.println(instance1);
		CustomSingleton instance2 = CustomSingleton.getInstance();
		System.out.println(instance2);
		if (instance1 == instance2) {
			System.out.println("Both instances are equal");
		}
	}

}
