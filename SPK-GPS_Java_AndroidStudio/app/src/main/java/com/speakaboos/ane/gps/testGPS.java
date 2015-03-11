package com.speakaboos.ane.gps;

import android.content.Context;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

import com.google.android.gms.common.GooglePlayServicesUtil;

//import java.io.IOException;
//import com.google.android.gms.ads.identifier.AdvertisingIdClient;
//import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
//import com.google.android.gms.common.GooglePlayServicesRepairableException;

public class testGPS implements FREFunction {

	@Override
	public FREObject call(FREContext arg0, FREObject[] arg1) {
		// TODO Auto-generated method stub
		log("TestGPS Java");
		
		Context context = arg0.getActivity().getApplicationContext();
		log("isGooglePlayServicesAvailable:");
		
		// **********************************
		// THIS DOESN'T WORK - FAILS WITHOUT
		// EXECUTING ANY OF THE FOLLOWING TRY/CATCH
		// **********************************
		try{
			if (GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) > -1){
				log("isGooglePlayServicesAvailable True?:");
			}else{
				log("isGooglePlayServicesAvailable False?:");
			}
		}catch(Exception e){
			log("FAIL WITH EXCEPTION:");
		}
		
		// **********************************
		// THIS RESULTS IN APP FAILING TO
		// START AT ALL
		// **********************************
//		 try {
//	    	log("try/catch");
//			log("*** AppsFlyerLib.AdvertisingIdClient.Info:"+AdvertisingIdClient.getAdvertisingIdInfo(context));
//		} catch (IllegalStateException e) {
//			// TODO Auto-generated catch block
//			log("*** AppsFlyerLib.IllegalStateException");
//			e.printStackTrace();
//		} catch (GooglePlayServicesRepairableException e) {
//			// TODO Auto-generated catch block
//			log("*** AppsFlyerLib.GooglePlayServicesRepairableException");
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			log("*** AppsFlyerLib.IOException");
//			e.printStackTrace();
//		} catch (GooglePlayServicesNotAvailableException e) {
//			// TODO Auto-generated catch block
//			log("*** AppsFlyerLib.GooglePlayServicesNotAvailableException");
//			e.printStackTrace();
//		}

		return null;
	}
	
	public void log(String msg){
		System.out.println("[ ANE TestGPS.java ] "+msg);
	}

}
