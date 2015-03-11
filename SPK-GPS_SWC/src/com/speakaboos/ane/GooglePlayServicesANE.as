package com.speakaboos.ane
{
	import flash.events.EventDispatcher;
	import flash.events.IEventDispatcher;
	import flash.events.StatusEvent;
	import flash.external.ExtensionContext;
	
	import mx.core.mx_internal;
	
	public class GooglePlayServicesANE extends EventDispatcher
	{
		private static var _instance:GooglePlayServicesANE;
		public static var extContext:ExtensionContext = null;
		
		//stores data from event
		private var eventData:Object = new Object;
		
		private var _isSupported:Boolean = false;
		
		public function GooglePlayServicesANE(enforcer:SingletonEnforcer, target:IEventDispatcher=null){
			super(target);
			log("CONSTRUCTOR");
			if (!extContext) {
				log("Creating extension context.");
				
				try{
					extContext = ExtensionContext.createExtensionContext("com.speakaboos.ane.GooglePlayServices", "");
				}catch(error:Error){
					log("Failed to create extension context - caught in try/catch.");
				}
				
				if (extContext){
					
					log("ExtensionContext:");
					log(extContext);
					
					_isSupported = true;
					
					extContext.addEventListener(StatusEvent.STATUS, onStatusEvent);
				}else{
					log("Failed to create extension context.");
				}
			}
		}
		
		public static function getInstance(target:IEventDispatcher=null):GooglePlayServicesANE{
			
			if(!_instance) {
				_instance = new GooglePlayServicesANE( new SingletonEnforcer());
			}
			
			return _instance;
		}
		
		public function getContext():ExtensionContext {
			//log("getContext");
			return extContext;
		}
		
		public function isSupported():Boolean{
			return _isSupported;
		}
		
		public function testGPS():void{
			log("testGPS");
			extContext.call("testGPS");
		}
		
		public function keepAwake():void{
			log("keepAwake");
			extContext.call("keepAwake");
		}
		
		public function cancelKeepAwake():void{
			log("cancelKeepAwake");
			extContext.call("cancelKeepAwake");
		}
		
		public function ddmsTrace(msg:String):void{
			log("ddmsTrace: "+msg);
			extContext.call("ddmsTrace", msg);
		}
		
		public function launchAppByID(appID:String):void{
			log("launchAppByID appID: "+appID);
			extContext.call("launchAppByID", appID);
		}
		
		//****************************************************
		// Main Event Handler 
		// receives event from Android, 
		// dispatches through ANE to be received by AIR app
		//***************************************************
		
		public function onStatusEvent(e:StatusEvent):void{
			// Any data being passed from this event will be in e.level
			
			try{
				//log(e.toString());
				
				var data:String = e.level;
				eventData[e.code] = e.level;
				
				//log("data saved for "+e.code);
				//log(data);
				
			}catch(e:Error){
				//log("Error: "+e.message);
			}
			
		}
		
		public function getDataFromEvent(eventType:String):String{
			var dataString:String = "";
			//log("retrieve data for "+eventType);
			if (eventData[eventType]){
				dataString = eventData[eventType]; 
				eventData[eventType] = null;
			}
			return dataString;
		}
		
		
		
	
		
		private function log(msg:*):void{
			trace("[ GooglePlayServicesANE ] " + msg);
		}
		
	}
}
class SingletonEnforcer {
	public function SingletonEnforcer():void {}
}
