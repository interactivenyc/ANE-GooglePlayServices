# ANE-GooglePlayServices
Adobe AIR ANE Project - this example illustrates a problem, and doesn't work!


This Android ANE will work if you comment out the GooglePlayServicesUtils references in this file:

https://github.com/interactivenyc/ANE-GooglePlayServices/blob/master/SPK-GPS_Java_Eclipse/src/com/speakaboos/ane/gps/testGPS.java

This project can be built with the ANT script in the SPK-GPS_Build folder. Just navigate to that folder and run "ant buildANE." To build the test GPS.apk file and install it on your Android device, run "ant buildTest." NOTE: You'll need to edit the top of the build.config file to point the script to your FLEX and AIR SDKs, and the location of your local project files.

I've tried to make this as simple as possible, in order to ask for help getting it to work. If you have any questions, please email me at steve+github@speakaboos.com.

There are two different folders for compiling the native JAR file for inclusion in the ANE. I believe the problem lies in the way I'm trying to include the google-play-services.jar file in my project. I've tried including it from the libs folder in the Eclipse version. I've tried combining it with my own jar file. I've tried using AndroidStudio and Gradle to see if their way of including a module would help. I've used a platformoptions file to see if AIR could include the library that way too. I'm out of ideas.'




