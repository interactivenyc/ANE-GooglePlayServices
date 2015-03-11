package com.speakaboos.ane.gps;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;

public class ddmsTrace implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] args) {
		// TODO Auto-generated method stub
		
		try {
			String msg = args[0].getAsString();
			log(msg);
			
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FRETypeMismatchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FREInvalidObjectException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FREWrongThreadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void log(String msg){
		System.out.println("[ AndroidANE ] "+msg);
	}

}
