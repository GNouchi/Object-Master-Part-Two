package folderOne.ObjectMaster;

public class Ninja extends Human{
	public Ninja() {
		this.stealth= 10;
	}
	public void steal(Human enemy){
		enemy.health -=10;
		this.health+=10;
	}
	public void runAway() {
		this.health-=10;
	}
	public void displayHealth() {
		System.out.println("** Ninja health is **" + health);
	}
}
