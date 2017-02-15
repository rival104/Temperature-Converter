/** Navidur Rahman CSCI: lab-B
 * This Program asks the user Temperature in fahrenheit and converts to centigrade.
 *It also check if the value entered is number and round the number to make it look cleaner. 
 * The program works continuously unless the user type STOP in the input.
 */
import java.math.BigDecimal;
import javax.swing.*;


public class new_exp {

	public static void main(String[] args) {
		// while loop for running program continuously
		while(true){
			
			String inputWord; 
	
			float fahrenheit = 0, centigrade = 0;
		
			inputWord = JOptionPane.showInputDialog(null,"Please enter a temperature in Fahrenheit: ");
			
			if ( inputWord == null)
				System.exit(0);

				
			System.out.println(inputWord);
			// STOP command execution to exit the program.
			
			if ( inputWord != null && inputWord.equalsIgnoreCase("STOP")){
				JOptionPane.showMessageDialog(null, "Goodbye!" );
				System.exit(0);
			}
			
			if( !(isNumeric(inputWord)) ){
					JOptionPane.showMessageDialog(null, "Please Enter a valid number! or type STOP.");
			}
			else{
		
				fahrenheit = Float.parseFloat(inputWord);
				centigrade = (5.0F/9)*(fahrenheit - 32 );
		
				JOptionPane.showMessageDialog(null, "Fahrenheit: " + round(fahrenheit,2) + "\n" + "Centigrade: " + round(centigrade,2));
			}
			
			}
		
		}

		
	 /**
     * Round to certain number of decimals preserving zeroes
     * @param d
     * @param decimalPlace
     * @return
     */
	public static BigDecimal round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);       
        return bd;
    }
	public static boolean isNumeric(String str)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(str);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}
	

}

/**
 * Round to certain number of decimals
 * 
 * @param d
 * @param decimalPlace
 * @return
 *

public static float round(float d, int decimalPlace) {
    BigDecimal bd = new BigDecimal(Float.toString(d));
    bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
    return bd.floatValue();
}*/