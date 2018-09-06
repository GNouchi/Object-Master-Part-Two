package folderOne.ObjectMaster;

public class ClassTest {
	public static Wizard makeTestBoss(){
		Wizard boss1= new Wizard();
		for(int i =0; i < 120 ;i ++) {
			boss1.heal(boss1);
		}
		return boss1;
	}
	public static void main(String[]args) {
//make boss
		Wizard boss1 = makeTestBoss();
		System.out.println("Boss health is:");
		boss1.displayHealth(); //1010 starting

// make classes
		Wizard wizard = new Wizard();
		Ninja ninja = new Ninja ();
		Samurai samurai= new Samurai();

//test wizard
		System.out.println("** Start testing wizard **");
		wizard.attack(boss1);
		boss1.displayHealth(); //1007 test wizard attack (-3)
		wizard.fireball(boss1);
		boss1.displayHealth(); //983 test wizard fireball(-3*8)
//reset boss
		System.out.println("** Reset Boss **");		
		boss1 = makeTestBoss();
		boss1.displayHealth(); //1060 test wizard attack
//test ninja
		ninja.displayHealth();
		System.out.println("** Start testing ninja **");
		ninja.attack(boss1);
		boss1.displayHealth(); //1007 test ninja attack (-3)
		ninja.steal(boss1);
		boss1.displayHealth(); //1007 test ninja steal(-10)
		ninja.displayHealth();
		System.out.println("** Start testing ninja.stealth() **");
		boss1.displayHealth(); //1015 test ninja steal(-10)
		ninja.runAway();
		ninja.displayHealth(); //991 test wizard fireball(-3*8)
//reset boss
		System.out.println("** Reset Boss **");		
		boss1 = makeTestBoss();
		boss1.displayHealth(); //1060 test wizard attack
//test samurai
		samurai.displayHealth();
		System.out.println("** Start testing samurai **");
		samurai.attack(boss1);
		boss1.displayHealth(); //1007 test samuraiattack (-3)
		samurai.deathBlow(boss1);
		boss1.displayHealth(); //1015 test samuraiheal (+8)
		samurai.displayHealth();
		samurai.meditate();
		samurai.displayHealth();
		Samurai.howMany();
	}
}
