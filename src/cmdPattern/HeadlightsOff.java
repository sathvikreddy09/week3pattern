package cmdPattern;

public class HeadlightsOff implements BatteryOptimization {
	   Headlights light;
	   
	    public HeadlightsOff(Headlights light) {
	        super();
	        this.light = light;
	    }
	 
	    public void execute() {
	        System.out.println("Turning off light.");
	        light.switchOff();
	    }

}
