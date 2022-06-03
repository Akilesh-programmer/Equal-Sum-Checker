public class EqualSumChecker {

    // Checks if the sum of the first number two is equal to the third number.
    public static boolean hasEqualSum(int firstNumber, int secondNumber, int thirdNumber) {
        int sumOfFirstTwoParameters = firstNumber + secondNumber;
        if(sumOfFirstTwoParameters == thirdNumber) {
            return true;
        } else {
            return false;
        }
    }
}
