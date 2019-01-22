package Tracker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sanket MIttal
 */
public class getBodyFat {
   Data info = new Data();
   BMICalculator BMI = new BMICalculator(); 
   double BodyFat; 
   
   public double  Calculate() {
   if (info.isMale()){
        BodyFat = (1.20 * BMI.BMICalc());  
        BodyFat += ((0.23*info.getAge())- 10.8 - 5.4);
    }
    else if (info.isFemale()){
        BodyFat = ((1.20 * BMI.BMICalc())+ (0.23*info.getAge())- 5.4);
    }
   return BodyFat;
   }
}