package cmdPattern;

public class HeadlightsOn implements BatteryOptimization {


    Headlights light;
 
    public HeadlightsOn(Headlights light) {
        super();
        this.light = light;
    }
	@Override
	public void execute() {
		 System.out.println("Turning off light");
	        light.switchOff();
	    }

}
