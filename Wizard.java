package folderOne.ObjectMaster;

public class Wizard extends Human{
	public Wizard(){
		this.health = 50;
		this.intelligence=8;
	}
	public void heal(Human target) {
		target.health += this.intelligence;
	}
	public void fireball(Human enemy) {
		enemy.health-=3*this.intelligence;
	}
//	wizard will not have an overriding display health because the boss is a wizard
}
