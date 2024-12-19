//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class TugOfWar {
    //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
    public static void main(String[] args) throws Exception{

        //Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(1);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        int redButtonPress = 0;
        int greenButtonPress = 0;
        boolean redState = redButton.getState();
        boolean greenState = greenButton.getState();
        
        while(redButtonPress < 10 && greenButtonPress < 10){	

            if (redState != redButton.getState()) {
            	if (redState != false) {
            		redButtonPress++;
                	System.out.println("Red: " +redButtonPress);
                	
            	}
            	redState = redButton.getState();
  
            } else if (greenState != greenButton.getState()) {
            	if (greenState != false) {
            		greenButtonPress++;
                	System.out.println("Green: " + greenButtonPress);
            	}
            	greenState = greenButton.getState();
            }
             
            Thread.sleep(10);
        }
        
        redLED.setState(true);
        greenLED.setState(true);
        Thread.sleep(1000);
        redLED.setState(false);
        greenLED.setState(false);
        
        for (int x = 0; x < 5; x++) {
        	Thread.sleep(1000);
        	if (redButtonPress == 10) {
        		redLED.setState(true);
        	} else if (greenButtonPress == 10) {
        		greenLED.setState(true);
        	}
        	Thread.sleep(1000);
        	redLED.setState(false);
            greenLED.setState(false);
        }
        
    }
}