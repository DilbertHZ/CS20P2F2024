import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class BuildAThermostat {
	
	public static void main(String[] args) throws Exception{
        
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();
        
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        
        temperatureSensor.open(1000);
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);
        
        int setTemp = 21;
        double currentTemp = temperatureSensor.getTemperature();
        
        boolean redState = redButton.getState();
        boolean greenState = greenButton.getState();
        
        while (true) {
        if (redState != redButton.getState()) {
        	if (redState != false) {
        		setTemp--;
        		System.out.println("Set temp: " + setTemp);
        	}
        	redState = redButton.getState();

        } else if (greenState != greenButton.getState()) {
        	if (greenState != false) {
        		setTemp++;
        		System.out.println("Set temp: " + setTemp);
        	}
        	greenState = greenButton.getState();
        	
        } else if (greenState != greenButton.getState() && redState != redButton.getState()) {
        	if (greenState != false && redState != false) {
        		break;
        	}
        	redState = redButton.getState();
        	greenState = greenButton.getState();
        }

        Thread.sleep(100);
        }
        
        while(true) {
        	System.out.println("newLoop");
        	currentTemp = temperatureSensor.getTemperature();
             
        	if (currentTemp < (setTemp + 2) && currentTemp > (setTemp - 2)) {
        		greenLED.setState(true);
        		redLED.setState(false);
        	} else {
        		greenLED.setState(false);
        		redLED.setState(true);
        	}
        	
        	System.out.println("Current temp: " + currentTemp);
        	System.out.println("Set temp: " + setTemp);
        	
        	Thread.sleep(10000);
        }
        
	}
}	
