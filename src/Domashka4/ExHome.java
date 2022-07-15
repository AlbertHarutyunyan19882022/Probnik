package Domashka4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExHome {

        public static void main(String[] args) throws IOException {
//            BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
            Scanner scan = new Scanner(System.in);
            System.out.println("Вводите размеры");
            int side1= scan.nextInt();
            int side2= scan.nextInt();
            int side3= scan.nextInt();
            try{
                Triangle triangle = new Triangle(side1,side2,side3);
                System.out.println("ТриУгольник создан\n");
            }catch (CreateTriangleException e){
                System.err.println("Такого ТриУгольника нет");
            }
        }
    }

class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) throws CreateTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (side1 + side2 < side3) {
            throw new CreateTriangleException();
        }
    }

}

class CreateTriangleException extends Exception {
    public CreateTriangleException() {
    }

    public CreateTriangleException(String message) {
        super(message);
    }

    public CreateTriangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public CreateTriangleException(Throwable cause) {
        super(cause);
    }

    public CreateTriangleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}