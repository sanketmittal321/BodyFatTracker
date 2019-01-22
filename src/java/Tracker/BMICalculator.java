package Tracker;

/**
 *
 * @author Sanket MIttal
 */

/*  Formulas: 

BMI Formula (Imperial)
BMI = (Weight in Pounds / (Height in inches x Height in inches)) x 703
Metric BMI Formula
BMI = (Weight in Kilograms / (Height in Meters x Height in Meters))
*/
public class BMICalculator {
   // double BMI;
    double BMI;
    Data info = new Data(); 
    
    public double BMICalc(){
        double heightsquared; 
        double weight = info.getWeight(); 
        double height = info.getHeight();
        
        heightsquared = Math.pow(height,2); 
        BMI = (weight/heightsquared) * 703;
     //   System.out.println("BMI: " + BMI);
       return BMI;  
    }
}
