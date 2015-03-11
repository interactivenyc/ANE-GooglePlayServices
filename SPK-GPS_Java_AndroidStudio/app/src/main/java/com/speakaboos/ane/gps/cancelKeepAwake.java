package com.speakaboos.ane.gps;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class cancelKeepAwake implements FREFunction {

	@Override
	public FREObject call(FREContext freContext, FREObject[] args) {

		//log("cancelKeepAwake");
		freContext.getActivity().getWindow().clearFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
		
		return null;
	}
	
	public void log(String msg){
		System.out.println("[ AndroidANE ] "+msg);
	}

}
