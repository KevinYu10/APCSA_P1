public class Main {
  public static void main(String[] args) {
    MySolution mySoluti1 = new MySolution();
    mySoluti1.celsiusToFahrenheit();
    mySoluti1.elapsedTime();
    mySoluti1.secondsToHMS();
  }
}

class MySolution {
  public void celsiusToFahrenheit() {  
	// Your code goes here
    double celsius;
    celsius = 30;
    double Fahrenheit = (celsius * 9/5) + 32;
    System.out.println(celsius + " °C = " + Fahrenheit + " °F");
  }
  public void elapsedTime() {  
	// Your code goes here
    int numOfHours = 12;
    int numOfMinutes = 0;
    int numOfSeconds = 0;
    double dayProgress = numOfHours*3600 + numOfMinutes*60 + numOfSeconds;
    int daytimeLeft = 86400 - numOfHours*3600 - numOfMinutes*60 - numOfSeconds;
    double precentage = (dayProgress/86400)*100;
    System.out.println("The current time is "+numOfHours+":"+numOfMinutes+":"+numOfSeconds+". It has been "+dayProgress+" seconds since the day began.");
    System.out.println("There are "+daytimeLeft+" seconds left in the day.");
    System.out.println("The day is "+precentage+"% done.");
    
  }
  public void secondsToHMS() {  
	// Your code goes here
    int totalSeconds = 5000;
    int Seconds = 5000;
    int hours = 0;
    int minutes = 0;
    int seconds = 0;
    while(totalSeconds >= 1) {
    if(totalSeconds >= 3600) {
      hours++;
      totalSeconds -= 3600;
    } else if(totalSeconds >= 60) {
      minutes++;
      totalSeconds -= 60;
    } else if(totalSeconds >= 1) {
      seconds++;
      totalSeconds -= 1;
    }
    }
    System.out.println(Seconds+" seconds = "+hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");
  }
}