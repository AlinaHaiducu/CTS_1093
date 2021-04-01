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
	
	public SuperHero() {
		
	}

	public SuperHero(
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

}