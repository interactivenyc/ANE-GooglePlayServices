package com.speakaboos.ane
{
	import flash.events.EventDispatcher;
	import flash.events.IEventDispatcher;
	import flash.events.StatusEvent;
	import flash.external.ExtensionContext;
	
	public class GooglePlayServicesANE extends EventDispatcher
	{
		private static var _instance:GooglePlayServicesANE;
		public static var extContext:ExtensionContext = null;
		
		//stores data from event
		private var eventData:Object = new Object;
		
		private var _isSupported:Boolean = false;
		
		public function GooglePlayServicesANE(enforcer:SingletonEnforcer, target:IEventDispatcher=null){
			super(target);
		}
		
		public static function getInstance(target:IEventDispatcher=null):GooglePlayServicesANE{
			
			if(!_instance) {
				_instance = new GooglePlayServicesANE( new SingletonEnforcer());
			}
			
			return _instance;
		}
		
		public function getContext():ExtensionContext {
			//log("getContext");
			return null;
		}
		
		public function isSupported():Boolean{
			return _isSupported;
		}
		
		public function testGPS():void{
		}
		
		public function keepAwake():void{
		}
		
		public function cancelKeepAwake():void{
		}
		
		public function ddmsTrace(msg:String):void{
		}
		
		public function launchAppByID(appID:String):void{
		}
		
		//****************************************************
		// Main Event Handler 
		// receives event from Android, 
		// dispatches through ANE to be received by AIR app
		//***************************************************
		
		public function onStatusEvent(e:StatusEvent):void{
		}
		
		public function getDataFromEvent(eventType:String):String{
			return null;
		}
		
		private function log(msg:*):void{
			trace("[ GooglePlayServicesANE ] " + msg);
		}
		
	}
}
class SingletonEnforcer {
	public function SingletonEnforcer():void {}
}