package folderOne.ObjectMaster;

public class ClassTest {
	public static void main(String[]args) {
		Human test1 = new Human();
		Human test1a = new Human();
		test1a.displayHealth();
		test1.attack(test1a);
		test1a.displayHealth();
		Wizard test2 = new Wizard();
		Ninja test3 = new Ninja ();
		Samurai test4 = new Samurai();
		System.out.println("works");
	}
}
