package com.example.math;

public class Series {

    public static long nSum(int number){
        //This function return the sum of all the number from 0 to number
        return number*(number+1)/2;
    }

    public static long fibonacci(int number){
        long result;
        if(number == 0){
            return 0;
        }else if(number == 1){
            return 1;
        }else result = fibonacci(number - 1) + fibonacci(number - 2);
        return result;
    }

    public static long factorial(int number){
        long result = 1;
        while(number!=0){
            result*=number;
            number--;
        }
        return result;
    }
}
