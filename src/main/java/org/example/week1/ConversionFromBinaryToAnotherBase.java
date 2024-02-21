package org.example.week1;

import java.util.Scanner;

public class ConversionFromBinaryToAnotherBase {
    //100 -> 1 * 2(2) + 0 * 2(1) + 0 * 2(0) = 4
    public int convertBinaryToDecimal(String binaryNumber){
        int total = 0;

        int lengthOfBinaryNumbers = binaryNumber.length();
        int maxIndex = lengthOfBinaryNumbers -1 ;
        for (int startIndex = 0; startIndex <= maxIndex; startIndex++){
            char binaryCharacter = binaryNumber.charAt(startIndex);
            int binaryDigit = Integer.parseInt(String.valueOf(binaryCharacter));
            total += binaryDigit * Math.pow(2, maxIndex - startIndex);
        }

        return total;
    }
    //4 -> 4%2 - 0(4/2) -> 2%2 - 0(2/2) -> 1%2 - 1
    public int convertDecimalToOtherBase(int decimalNumber, int baseNumber){
        StringBuilder baseNumberResponse = new StringBuilder();

        for (int stop = decimalNumber; stop > 0;){
            int baseReminder = decimalNumber % baseNumber;
            baseNumberResponse.append(baseReminder);
            decimalNumber /= baseNumber;
            stop = decimalNumber;
        }
        return Integer.parseInt(baseNumberResponse.reverse().toString());

    }

    public void showConversionFromBinaryToOtherBase(  ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter binary digits e.g. : 11111111111111000010010101");
        String binaryNumbers = scanner.nextLine();
        int decimalNumber = convertBinaryToDecimal(binaryNumbers);
        System.out.printf("Conversion of %s to decimal is : " + decimalNumber, binaryNumbers);
        System.out.println();
        System.out.println();
        System.out.println("Enter the Return Base e.g. : Base 3 or 4 or 5 or 6 ...");
        int returnBase = scanner.nextInt();
        int conversionFromDecimalToAnotherBase = convertDecimalToOtherBase(decimalNumber, returnBase);
        System.out.printf("The conversion of binary digit %s to decimal was %d\n", binaryNumbers, decimalNumber);
        System.out.printf("The conversion of decimal digit %d to base %d is: %d", decimalNumber, returnBase, conversionFromDecimalToAnotherBase);
    }

    public static void main(String[] args) {
        ConversionFromBinaryToAnotherBase converter = new ConversionFromBinaryToAnotherBase();
        converter.showConversionFromBinaryToOtherBase();
    }

}
