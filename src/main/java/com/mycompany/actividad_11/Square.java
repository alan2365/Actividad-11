package com.mycompany.actividad_11;

/**
 *
 * @author ALAN
 */
public class Square implements Shape{
    
    protected double sideLength;

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        return sideLength * sideLength;
    }

    public double getPerimetro() {
        return sideLength * 4;
    }

    
    
}
