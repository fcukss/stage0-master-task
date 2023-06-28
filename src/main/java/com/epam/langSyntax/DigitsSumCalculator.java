package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {

        int res = 0;
        int temp = 0;
        while(number>0){
            temp = number%10;
            number /=10;
            res = res + temp;
        }
        System.out.println(res);
    }

}
