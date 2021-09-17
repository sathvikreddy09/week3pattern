package cmdPattern;

public class CarAutomationVoiceControl {
	BatteryOptimization command;
	 
    public void setCommand(BatteryOptimization command) {
        this.command = command;
    }
 
    public void voiceControl() {
        command.execute();
    }
}
