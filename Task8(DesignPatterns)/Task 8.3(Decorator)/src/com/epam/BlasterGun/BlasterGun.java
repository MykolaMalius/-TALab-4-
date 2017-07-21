package com.epam.BlasterGun;
import com.epam.lab.Decorator.DroidDecorator;
import com.epam.lab.Droid.Droid;

public class BlasterGun extends DroidDecorator{
	public BlasterGun(Droid droid) {
		super(droid);
	}
	int blasterGunEnergy = 100;
	String blasterGunDescription = "1000 shots per minute";	
	@Override
	public int getEnergyLevel() {
		return super.getEnergyLevel() + blasterGunEnergy;
	}
	@Override
	public String getDescription() {
		return super.getDescription() + " With assault rifle which has:" + blasterGunDescription;
	}	
}
