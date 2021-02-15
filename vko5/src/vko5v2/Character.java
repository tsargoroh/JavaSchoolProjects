package vko5v2;

public abstract class Character{
	WeaponBehavior weapon;
	
	public Character(WeaponBehavior weapon){
		this.weapon = weapon;
	}
	public void fight(){
		System.out.print(this.getClass().getSimpleName() + " fights ");
		weapon.useWeapon();
	}
}
class King extends Character{
	public King(WeaponBehavior weapon){
		super(weapon);
	}
}
class Knight extends Character{
	public Knight(WeaponBehavior weapon){
		super(weapon);
	}
}
class Queen extends Character{
	public Queen(WeaponBehavior weapon){
		super(weapon);
	}
}
class Troll extends Character{
	public Troll(WeaponBehavior weapon){
		super(weapon);
	}
}
abstract class WeaponBehavior{
	private String weapon;
	
	public WeaponBehavior(String weapon){
		this.weapon = weapon;
	}
	public void useWeapon(){
		System.out.println("with weapon " + weapon);
	}
}
class KnifeBehavior extends WeaponBehavior{
	public KnifeBehavior(){
		super("Knife");
	}
}
class AxeBehavior extends WeaponBehavior{
	public AxeBehavior(){
		super("Axe");
	}
}
class SwordBehavior extends WeaponBehavior{
	public SwordBehavior(){
		super("Sword");
	}
}
class ClubBehavior extends WeaponBehavior{
	public ClubBehavior(){
		super("Club");
	}
}