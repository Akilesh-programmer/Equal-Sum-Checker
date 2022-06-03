package com.akilesh;

public class EqualSumChecker {

    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        int sumOfFirstTwoParameters = firstNumber + secondNumber;
        if(sumOfFirstTwoParameters == thirdNumber) {
            return true;
        } else {
            return false;
        }
    }
}
