package Exect;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводите число от 1 до 100!!!");
        int a = scanner.nextInt();

            try {
                Numcheck.printResult(a);
            } catch (NumChekEX e) {
                e.printStackTrace();
            }

        System.out.println("Програма еще работает!!!");

    }
    }
class Numcheck{
    public  static void printResult(int a) throws NumChekEX{
     if (a <= 100 && a >= 0){
         System.out.println("Програма работает правильно!");
     }else
         throw  new NumChekEX("Число не подходит", a);
    }
    }
    class NumChekEX extends Exception{
        public NumChekEX(String error, int a) {

            System.out.println("Введенное число " + a + " вышла за переделы задания");
        }
    }