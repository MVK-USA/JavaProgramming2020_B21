package day03_Variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class CalculateCircle {

    public static void main(String[] args) {

        double radius = 3.5;
        double PI = 3.14;
        double area = radius * radius * PI;
        double perimeter = radius * 2 * PI;

        System.out.print("The area of circle is:");
        System.out.println(area);
        System.out.println();
        System.out.print("The perimeter of circle is:");
        System.out.println(perimeter);


    }

    /* A= radius * radius * PI;
    P = 2 * radius * PI

       */






}
