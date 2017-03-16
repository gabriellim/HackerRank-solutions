/*

//Interfaces
Definition: A collection of abstract methods (bare bones, template of functionality)
1. No Implementations
2. No Constructors

E.g. Want the ability to compare objects of a certain class?
-> Comparable Interface

*/

import java.util.Random;

public class StarWarsInterfacePractice {

	public static Character summonCharacter() {
		Random rand = new Random();
		
		if (Math.abs(rand.nextInt()) % 2 == 0) {
			return new Enemy();
		}
		else {
			return new Hero();
		}
	}

	public static void main(String[] args) {
		Enemy DarthVader = new Enemy();
		Hero ObiWanKenobi = new Hero();

		DarthVader.attack();
		ObiWanKenobi.attack();
		DarthVader.heal();
		ObiWanKenobi.heal();
		System.out.println("Enemy weapon: " + DarthVader.weapon);
		System.out.println("Hero weapon: " + ObiWanKenobi.weapon);

		Character spy = summonCharacter();
		spy.attack();
		spy.heal();
	}
}