package com.company;

public class SevenSegment {

    public static String numbers =
      " _     _  _     _  _  _  _  _ \n" +
      "| |  | _| _||_||_ |_   ||_||_|\n" +
      "|_|  ||_  _|  | _||_|  ||_| _|";

    public static String input =
      " _  _        _  _  _  _  _ \n" +
      "|_||_ |_|  || ||_ |_ |_| _|\n" +
      " _| _|  |  ||_| _| _| _||_ ";

    public static void main(String[] args) {
        putTogether(numbersArray(numbers));
        System.out.println(calculate(putTogether(numbersArray(input)), putTogether(numbersArray(numbers))));

    }

    public static String[] numbersArray(String input)
    {
        String[] splittedInputToArray;
        splittedInputToArray = input.split("\n");

        return splittedInputToArray;
    }

    public static String[] putTogether(String[] splittedInputToArray)
    {
        String[] numberString = {"", "", "", "", "", "", "", "", "", ""};
        int counter = 0;

        for(int i = 0; i < 3; i++)
        {
            //System.out.println("Line: " + (i+1));
            String row = splittedInputToArray[i];
            for (int j = 0; j < splittedInputToArray[i].length(); j+=3)
            {
                String number = row.substring(j, j+3);
                //System.out.println(number);
                if (counter < 10) numberString[counter] += number;
                counter ++;

            }
            counter = 0;
        }
        return numberString;
    }

    public static String calculate(String[] coded, String[] numbers)
    {
        String decoded = "";

        if(coded != null) {

            for (String str: coded)
            {
                for(int number = 0; number < numbers.length; number++)
                {
                    if(str.equals(numbers[number]))
                    {
                        decoded += String.valueOf(number);
                    }
                }

            }
        }

        return decoded;
    }
}
