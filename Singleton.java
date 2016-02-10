package patterns.creational.singleton;

public class Singleton {

	private static Singleton instance;

	protected Singleton() {
		System.out.println("Singleton created");
	}

	public static Singleton instance() {
		return
		instance != null
		? instance
		: (instance = new Singleton()); // Lazy initialization
	}

}
