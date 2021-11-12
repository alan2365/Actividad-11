package com.mycompany.actividad_11;

/**
 *
 * @author ALAN
 */

public class Triangle implements Shape{
    
    private double sideLength;   // cm
    private double heightLength; // cm

    

    public double getArea() {
        return (sideLength * heightLength) / 2.0;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public void setHeightLength(double heightLength) {
        this.heightLength = heightLength;
    }

    public double getPerimetro() {
        return sideLength * 3.0;
    }
    
}
