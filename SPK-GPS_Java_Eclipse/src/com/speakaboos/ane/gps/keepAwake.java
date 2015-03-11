package com.speakaboos.ane.gps;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class keepAwake implements FREFunction {

	@Override
	public FREObject call(FREContext freContext, FREObject[] args) {

		//log("keepAwake");
		freContext.getActivity().getWindow().addFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

		return null;
	}
	
	public void log(String msg){
		System.out.println("[ AndroidANE ] "+msg);
	}

}
