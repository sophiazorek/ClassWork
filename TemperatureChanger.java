/*
*  Convert user input in the format xxxF or yyyC from Celsius to Farenheit
*
*  @author Kent Collins
*  @version 25 September, 2014
**/

 import java.util.*;
 
 public class TemperatureChanger {

  public static void main (String[] args) {
        Scanner temperatureInput = new Scanner(System.in);
        System.out.println("Please enter a Temperature and indicate if it is in Farenheit or Celcius with an F or a C!");
        String numberInput = temperatureInput.nextLine();
        
        if (numberInput.charAt(numberInput.length()-1) == 'F') {
            numberInput = numberInput.substring(0,numberInput.length() - 1);
            double result = Double.parseDouble(numberInput);
        System.out.println(((result * (5/9)) - 32));
    
   
   }
        if (numberInput.charAt(numberInput.length()-1) == 'C') {
            numberInput = numberInput.substring(0,numberInput.length() -1);
            double result = Double.parseDouble(numberInput);
            System.out.println((result*(9/5) + 32));
  }
}

}


