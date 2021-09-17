package cmdPattern;

public class VoiceControlRun {

	public static void main(String[] args)  {
        Headlights carLowBeam = new Headlights();
 
        AC carFrontCabin = new AC();  
 
        Headlights carHighBeam = new Headlights();   
 
        AC carRearCabin = new AC();     //receivers
 
        CarAutomationVoiceControl kia = new CarAutomationVoiceControl();   //Invoker
 
        kia.setCommand(new HeadlightsOff( carLowBeam ));
        kia.voiceControl();
 
        kia.setCommand(new HeadlightsOff( carHighBeam ));
        kia.voiceControl();
 
        kia.setCommand(new TurnOnAc( carFrontCabin ));
        kia.voiceControl();
 
        kia.setCommand(new TurnOffAc( carFrontCabin ));
        kia.voiceControl();
 
        kia.setCommand(new TurnOnAc( carRearCabin ));
        kia.voiceControl();
 
        kia.setCommand(new TurnOffAc( carRearCabin ));
        kia.voiceControl();
    }

}
