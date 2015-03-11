package com.speakaboos.ane.gps;

import android.content.Intent;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREInvalidObjectException;
import com.adobe.fre.FREObject;
import com.adobe.fre.FRETypeMismatchException;
import com.adobe.fre.FREWrongThreadException;

public class launchAppByID implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] args) {
		// TODO Auto-generated method stub
		//log(""CONSTRUCTOR");
		
		try {
			String appID = args[0].getAsString();
			
			log("launchAppByID appID: "+appID);
			
			Intent intent = context.getActivity().getPackageManager().getLaunchIntentForPackage(appID);
			context.getActivity().startActivity(intent);
			
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
		System.out.println("[ ANE launchAppByID.java ] "+msg);
	}

}
