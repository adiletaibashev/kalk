package com.company;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = num();
        int num2 = num();
        char operi = oper();
        int operation = simvol(num1, num2, operi);
        System.out.println("ответ " + operation);



    }
    public static int num (){
        int numer;
        System.out.println("Введите число");
        if (s.hasNextInt()){
            numer = s.nextInt();
        }else {
            System.out.println("Вы ввели не то число повторите");
            s.next();
            numer = num();
        }
        return numer;
    }
    public static char oper(){
        System.out.println("введите операцию");
        char operation;
        if (s.hasNext()){
            operation = s.next().charAt(0);
        }else{
            System.out.println("Вы ввели не то число , повторите ввод");
            s.next();
            operation = oper();
        }
        return operation;
    }
    public static int simvol (int num1, int num2, char operat){
        int operatt;
        switch (operat){
            case '-':
                operatt = num1 - num2;
                break;
            case '+':
                operatt = num1 + num2;
                break;
            case '/':
                operatt = num1 / num2;
                break;
            case '*':
                operatt = num1 * num2;
                break;
            default:
                System.out.println("не верный символб попробуйте еще раз");
                operatt = simvol(num1, num2, oper() );
        }
        return operatt;
    }
}
