package com.epam.lab.DroidsFactory;
import com.epam.lab.JediDroids.MedicJediDroid;
import com.epam.lab.JediDroids.SniperDroidJedi;

public class JediDroidsFactory implements DroidsFactory{
	@Override
	public SniperDroidJedi createBattleDroids() {
		return new SniperDroidJedi();	
	}
	@Override
	public MedicJediDroid createSupportDroids() {
        return new MedicJediDroid();		
	}	
}
