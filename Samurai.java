package folderOne.ObjectMaster;

public class Samurai extends Human{
	private static int counter;
	public Samurai() {
		this.health =200;
		counter++;
	}
	public void deathBlow(Human enemy) {
		enemy.health = 0;
		this.health /= 2;
	}
	public void meditate() {
		this.health = 200;
	}
	public static int howMany(){
		System.out.println("there are currenttly: " + counter  + " samurai");
		return counter;
	}
	public void displayHealth() {
		System.out.println("** Samurai health is **" + health);
	}
}
