package ro.ase.csie.cts.g1093.dp.builder;

public class SuperHero {
	
	private String name;
	private int lifePoints;
	
	private boolean isVillain;
	private boolean isWounded;
	
	private WeaponInterface rightweapon;
	private WeaponInterface leftweapon;
	
	SuperPowerInterface superPower;
	SuperPowerInterface superSuperPower;
	
	private SuperHero() {
		
	}

	private SuperHero(
			String name,
			int lifePoints,
			boolean isVillain,
			boolean isWounded,
			WeaponInterface rightweapon,
			WeaponInterface leftweapon, SuperPowerInterface superPower, SuperPowerInterface superSuperPower) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillain = isVillain;
		this.isWounded = isWounded;
		this.rightweapon = rightweapon;
		this.leftweapon = leftweapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}
	
	public static class SuperHeroBuilder{
		SuperHero superHero;
		
		public SuperHeroBuilder(String name, int lifePoints) {
			this.superHero=new SuperHero();
			this.superHero.name = name;
			this.superHero.lifePoints = lifePoints;
			
		}
		
		public SuperHeroBuilder isVillain() { 
			this.superHero.isVillain = true;
			return this;
		}
		
		public SuperHeroBuilder isWounded() {
			this.superHero.isWounded = true;
			return this;
		}
		
		public SuperHeroBuilder setRightWeapon(WeaponInterface weapon) {
			this.superHero.rightweapon = weapon;
			return this;
		}
		
		public SuperHeroBuilder setLefttWeapon(WeaponInterface weapon) {
			this.superHero.leftweapon = weapon;
			return this;
		}
		
		public SuperHeroBuilder setSuperPower(SuperPowerInterface power) {
			this.superHero.superPower = power;
			return this;
		}
		
		public SuperHeroBuilder setSuperSuperPower(SuperPowerInterface power) {
			this.superHero.superSuperPower = power;
			return this;
		}
		
		public SuperHero build() {
			return this.superHero;
		}
	}

}






