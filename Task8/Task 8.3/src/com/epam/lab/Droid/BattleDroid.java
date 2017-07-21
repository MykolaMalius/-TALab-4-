package com.epam.lab.Droid;

public class BattleDroid implements Droid{	
	final int energyLevel = 500;
	@Override
	public int getEnergyLevel(){
	   return energyLevel;
	}
	@Override
	public  String getDescription() {
		return "BattleDroid with assault rifle";
	}
}
