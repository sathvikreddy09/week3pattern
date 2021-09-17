package cmdPattern;

public class TurnOnAc implements BatteryOptimization {
	  AC ac;
	  
	    public TurnOnAc(AC ac) {
	        super();
	        this.ac = ac;
	    }
	 
	    public void execute() {
	        System.out.println("Turning on AC");
	        ac.turnOn();
	    }

}
