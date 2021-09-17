package cmdPattern;

public class TurnOffAc implements BatteryOptimization {
	 AC ac;
	 
	    public TurnOffAc(AC ac) {
	        super();
	        this.ac = ac;
	    }
	 
	    public void execute() {
	        System.out.println("Turning off AC.");
	        ac.turnOff();
	    }

}
