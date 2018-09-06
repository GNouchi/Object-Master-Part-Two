package folderOne.ObjectMaster;

public class Human {
	int strength=3;
	int stealth=3;
	int intelligence=3;
	int health=100;
	public void attack(Human enemy) {
		enemy.health -=this.strength;
	}
	public void displayHealth(){
		System.out.println(this.health);
	}
}
