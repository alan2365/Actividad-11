package com.mycompany.actividad_11;

/**
 *
 * @author ALAN
 */
public class Circle implements Shape{
    
    public static final double PI = 3.141592;

    protected double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimetro() {
        return PI * (radius * 2);
    }
    
}
