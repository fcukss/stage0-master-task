package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int num = 0;
        int temp=0;
        while (number>0){
            temp=number%10;
            number /=10;
            num=num*10+temp;
        }
        System.out.println(num);
    }

}
