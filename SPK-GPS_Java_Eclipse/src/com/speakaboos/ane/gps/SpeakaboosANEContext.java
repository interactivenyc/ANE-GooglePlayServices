package com.speakaboos.ane.gps;

import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;

public class SpeakaboosANEContext extends FREContext {
	
	public SpeakaboosANEContext() {  
		log("SpeakaboosANEContext");
    } 

	@Override
	public Map<String, FREFunction> getFunctions() {
		log("creating map");

		Map<String, FREFunction> functionMap = new HashMap<String, FREFunction>();

		functionMap.put("keepAwake", new keepAwake() );
		functionMap.put("cancelKeepAwake", new cancelKeepAwake() );
		functionMap.put("ddmsTrace", new ddmsTrace() );
		functionMap.put("launchAppByID", new launchAppByID() );
		functionMap.put("testGPS", new testGPS() );
				
		log("finished creating map");

		return functionMap;
	}
	
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
	}
	
	public void log(String msg){
		System.out.println("[ SpeakaboosANEContext ] "+msg);
	}

}
