package com.mycompany.actividad_11;

/**
 *
 * @author ALAN
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entradaEscaner = new Scanner(System.in);

        int opc = 0;
        int figura = 0;
        
        do {

            System.out.println("Menu de opciones\n"
                    + "1 Calcular area:\n"
                    + "2 Calcular perimetro\n"
                    + "0 Salir\n");

            opc = Integer.parseInt(entradaEscaner.nextLine());

            if(opc == 1){
                System.out.println("Seleccionar la figura\n"
                            + "1 Cuadrado\n"
                            + "2 Triangulo\n"
                            + "3 Circulo\n");
                figura = Integer.parseInt(entradaEscaner.nextLine());
                figuras(figura, opc);
                
            }else if (opc == 2){
                System.out.println("Seleccionar la figura\n"
                            + "1 Cuadrado\n"
                            + "2 Triangulo\n"
                            + "3 Circulo\n");
                figura = Integer.parseInt(entradaEscaner.nextLine());
                figuras(figura, opc);
            }

        } while (opc != 0);

    }
    
    public static void figuras(int figura, int opc){
        
        Scanner entradaEscaner = new Scanner(System.in);
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        
        double base = 0;
        double altura = 0;
        double radio = 0;
        
        if(opc == 1){
            switch (figura) {
                case 1:
                    System.out.println("Cuadrado\n"
                            + "Ingrese Tamaño del lado\n");
                    base = Integer.parseInt(entradaEscaner.nextLine());
                    
                    square.setSideLength(base);
                    System.out.println("El area es: " + square.getArea() + "\n");
                    break;
                case 2:
                    System.out.println("Triangulo\n"
                            + "Ingrese altura\n");
                    altura = Integer.parseInt(entradaEscaner.nextLine());
                    
                    System.out.println("Ingrese base");
                    base = Integer.parseInt(entradaEscaner.nextLine());
                    
                    triangle.setHeightLength(altura);
                    triangle.setSideLength(base);
                    
                    System.out.println("El area es: " + triangle.getArea() + "\n");
                    break;
                case 3:
                    System.out.println("Circulo\n"
                            + "Ingrese radio\n");
                    radio = Integer.parseInt(entradaEscaner.nextLine());
                    
                    circle.setRadius(radio);
                    System.out.println("El area es: " + circle.getArea() + "\n");
                    break;
            }
        }else{
            switch (figura) {
                case 1:
                    System.out.println("Cuadrado\n"
                            + "Ingrese Tamaño del lado\n");
                    base = Integer.parseInt(entradaEscaner.nextLine());
                    
                    square.setSideLength(base);
                    System.out.println("El perimetro es: " + square.getPerimetro() + "\n");
                    break;
                case 2:
                    System.out.println("Triangulo\n"
                            + "Ingrese altura\n");
                    altura = Integer.parseInt(entradaEscaner.nextLine());
                    
                    triangle.setSideLength(altura);
                    
                    System.out.println("El perimetro es: " + triangle.getPerimetro() + "\n");
                    break;
                case 3:
                    System.out.println("Circulo\n"
                            + "Ingrese radio\n");
                    
                    radio = Integer.parseInt(entradaEscaner.nextLine());
                    
                    circle.setRadius(radio);
                    System.out.println("El perimetro es: " + circle.getPerimetro() + "\n");
                    break;
            }
        }
        
        
    }

}
