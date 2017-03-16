public class Enemy implements Character {

	public String weapon = "Lightsaber";

	public Enemy() {

	}

	@Override
	public void attack() {
		System.out.println("The enemy attacks you!");
	}

	@Override
	public void heal() {
		System.out.println("The enemy heals himself.");
	}

	@Override
	public String getWeapon() {
		return this.weapon;
	}

	public void weaponDraw() {
		System.out.println("The enemy draws out their weapon.");
	}
}