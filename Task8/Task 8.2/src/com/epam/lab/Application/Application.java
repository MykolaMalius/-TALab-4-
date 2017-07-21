package com.epam.lab.Application;
import org.apache.log4j.PropertyConfigurator;

import com.epam.lab.DroidTypeSelector.DroidTypeSelector;
import com.epam.lab.Enums.DroidType;

public class Application {
    public static void main(String[] args){
    	PropertyConfigurator.configure("log4j.properties");	
    	DroidTypeSelector droidTypeSelector = new DroidTypeSelector();
    	Application apllication = new Application();
    	apllication.run(droidTypeSelector);	
}
    public void run(DroidTypeSelector droidTypeSelector){
  	  droidTypeSelector.getDroidType(DroidType.BATTLE_DROID).attack();
  	  droidTypeSelector.getDroidType(DroidType.SUPER_DROID).move();;
  	  droidTypeSelector.getDroidType(DroidType.SNIPER_DROID);  
    }
}

