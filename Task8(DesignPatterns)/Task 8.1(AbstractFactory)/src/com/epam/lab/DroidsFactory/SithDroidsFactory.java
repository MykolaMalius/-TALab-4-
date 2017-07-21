package com.epam.lab.DroidsFactory;
import com.epam.lab.SithDroids.AssaultDroid;
import com.epam.lab.SithDroids.MechanicDroid;

public class SithDroidsFactory implements DroidsFactory{
	@Override
	public AssaultDroid createBattleDroids() {
        return new AssaultDroid();
	}
	@Override
	public MechanicDroid createSupportDroids() {
		return new MechanicDroid();
	}
}
