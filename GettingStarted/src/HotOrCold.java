import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class HotOrCold {
	public static void main(String[] args) throws Exception{
        
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        DigitalOutput redLED = new DigitalOutput();
        DigitalOutput greenLED = new DigitalOutput();
        
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        
        temperatureSensor.open(1000);
        greenLED.open(1000);
        redLED.open(1000);
        
        while(true){
        	System.out.println(" Temperature: " + temperatureSensor.getTemperature() + " °C" );
        	if(temperatureSensor.getTemperature() > 20 && temperatureSensor.getTemperature() < 24) {
        		redLED.setState(false);
        		greenLED.setState(true);
        	} else {
        		greenLED.setState(false);
        		redLED.setState(true);
        	}
        
            Thread.sleep(150);
        }
    }

}
