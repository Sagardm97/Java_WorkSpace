package main;

import java.util.Scanner;
class main{
    public static void main(String[]args)
    {
        Scanner scan=new Scanner(System.in);
       
        sub(20,5);
        System.out.println("subtractNumber : "+(20-5));
        mul(4,5); 
        System.out.println("multiplyNumbers : "+(4*5));
        div(20,4);
        System.out.println("divideNumbers : "+(20/4));
        rem(10,3);
        System.out.println("findRemainde : "+(10%3));
        
        
    }
    public static int sub(int num1,int num2){
     return num1-num2;
    }
    public static int mul(int num1,int num2){
     return num1*num2;
    }
    public static float div(float num1,float num2){
     return num1/num2;
    }
    public static int rem(int num1,int num2){
     return num1%num2;
    }
}