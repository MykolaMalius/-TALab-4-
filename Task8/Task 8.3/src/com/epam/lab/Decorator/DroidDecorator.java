package com.epam.lab.Decorator;
import com.epam.lab.Droid.Droid;

public abstract class DroidDecorator implements Droid{	
	protected final Droid droid;
    public DroidDecorator(Droid droid){
 	   this.droid = droid;
    }
	@Override
	public int getEnergyLevel() {
       return droid.getEnergyLevel();
	}
	@Override
	public String getDescription() {
	    return droid.getDescription();
	}
}
