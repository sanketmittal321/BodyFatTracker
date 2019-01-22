package Tracker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//     Scanner reader = new Scanner(System.in); 
//     System.out.println("Enter your Weight in pounds: ");
//     Weight = reader.nextDouble();
/**
 *
 * @author Sanket MIttal
 */
//Imperial = Pounds/Feet -- Want to use this 
//Metric = Kilograms/ Meters

public class Data {
        
    private static double mWeight; 
    private static  double mHeight; 
    private Integer ActivityLevel; 
    private static int mAge;
    private static boolean Male; 
    private static boolean Female; 
    private static boolean Imperial;

      /**
     * @return the Imperial
     */
    public boolean isImperial() {
        return Imperial;
    }

    /**
     * @param Imperial the Imperial to set
     */
    public void setImperial(boolean Imperial) {
        this.Imperial = Imperial;
    }
    
      /**
     * @return the Weight
     */
    public double  getWeight() {
    return mWeight;
    }

    /**
     * @param Weight the Weight to set
     */
    public void setWeight(double Weight) {
       if (!Imperial){
         Weight = Weight*2.20462;  // converting kilograms to pounds
        }
        mWeight = Weight; 
       }

    /**
     * @return the Height
     */
    public double getHeight() {
      return mHeight; 
    }

    /**
     * @param Height the Height to set
     */
    public void setHeight(double Height) {
        // Convert Height if in meters
       if (!Imperial){
          Height = Height*39.3701; //// converting meters to inchs
        }
       mHeight = Height; 
    }

  
    /**
     * @return the Age
     */
    public int getAge() {
    return mAge;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
       //this.Age = Age;
       mAge = Age; 
    }

    
      /**
     * @return the ActivityLevel
     */
    public int getActivityLevel() {
        return ActivityLevel;
    }

    /**
     * @param ActivityLevel the ActivityLevel to set
     */
    public void setActivityLevel(int ActivityLevel) {
        this.ActivityLevel = ActivityLevel;
    }

    /**
     * @return the Male
     */
    public boolean isMale() {
        return Male;
    }

    /**
     * @param Male the Male to set
     */
    public void setMale(boolean Male) {
        this.Male = Male;
    }

    /**
     * @return the Female
     */
    public boolean isFemale() {
        return Female;
    }

    /**
     * @param Female the Female to set
     */
    public void setFemale(boolean Female) {
        this.Female = Female;
    }

  

 }
