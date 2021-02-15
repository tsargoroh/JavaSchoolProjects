package vko5v2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Mainclass{
	public static void main(String[] args){
		Character character = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String choice = null;
		String characterChoice = null;
		String weaponChoice = null;
		try{
			while (true){
				System.out.println("*** BATTLE SIMULATOR ***");
				System.out.println("1) Create a character");
				System.out.println("2) Fight with a character");
				System.out.println("0) Quit");
				System.out.print("Your choice: ");
				choice = br.readLine();
				
				if (choice.equals("1")){
					System.out.println("Choose your character: ");
					System.out.println("1) King");
					System.out.println("2) Knight");
					System.out.println("3) Queen");
					System.out.println("4) Troll");
					System.out.print("Your choice: ");
					characterChoice = br.readLine();
					System.out.println("Choose your weapon: ");
					System.out.println("1) Knife");
					System.out.println("2) Axe");
					System.out.println("3) Sword");
					System.out.println("4) Club");
					System.out.print("Your choice: ");
					weaponChoice = br.readLine();
					
					if (characterChoice.equals("1"))
						character = new King(chooseWeapon(weaponChoice));
					else if (characterChoice.equals("2"))
						character = new Knight(chooseWeapon(weaponChoice));
					else if (characterChoice.equals("3"))
						character = new Queen(chooseWeapon(weaponChoice));
					else if (characterChoice.equals("4"))
						character = new Troll(chooseWeapon(weaponChoice));
				}else if (choice.equals("2"))
					character.fight();
				else if (choice.equals("0"))
					break;
				else
					System.out.println("Unknown choice");
			}
			br.close();
		}catch (IOException ex){
			System.out.println(ex);
		}
	}
	private static WeaponBehavior chooseWeapon(String weaponChoice){
		WeaponBehavior weapon = null;
		
		if (weaponChoice.equals("1"))
			weapon = new KnifeBehavior();
		else if (weaponChoice.equals("2"))
			weapon = new AxeBehavior();
		else if (weaponChoice.equals("3"))
			weapon = new SwordBehavior();
		else if (weaponChoice.equals("4"))
			weapon = new ClubBehavior();
		return weapon;
	}
}