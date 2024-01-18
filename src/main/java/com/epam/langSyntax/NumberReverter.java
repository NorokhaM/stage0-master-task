package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int revertDigit=0;
        while(number!=0){
            int digit=number%10;
            revertDigit=revertDigit*10+digit;
            number/=10;
        }
        System.out.println(revertDigit);
    }
}
