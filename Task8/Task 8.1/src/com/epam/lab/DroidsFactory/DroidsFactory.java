package com.epam.lab.DroidsFactory;
import com.epam.lab.DroidsInterfaces.BattleDroid;
import com.epam.lab.DroidsInterfaces.SupportDroid;

public interface DroidsFactory {
   public BattleDroid createBattleDroids(); 
   public SupportDroid createSupportDroids();
}
