/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gravitycalculator1;

/**
 *
 * @author Nowrin
 */
public class GravityCalculator1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

                
                double   Acceleration  =-9.81; // Earth's gravity in (m/s2)

                double  initialVelocity = 0.0; // starting velocity of the object

                double  Time = 10.0; // time 

                double  initialPosition = 1000.0; // Starting position in meters, the calculation will determine the ending position in meters

                double  finalPosition = 0.0;
                
                finalPosition = 0.5*(Acceleration*(Time*Time)) + (initialVelocity * Time) + initialPosition;

              


                 System.out.println("The object's position after " + Time +" seconds is "+finalPosition + " m.");

            }

}
    
    

