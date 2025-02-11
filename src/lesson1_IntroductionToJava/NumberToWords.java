package lesson1_IntroductionToJava;

import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (0-999): ");
        int number = sc.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else {
            String result = "";

            if (number < 10) {
                switch (number) {
                    case 0:
                        result = "zero";
                        break;
                    case 1:
                        result = "one";
                        break;
                    case 2:
                        result = "two";
                        break;
                    case 3:
                        result = "three";
                        break;
                    case 4:
                        result = "four";
                        break;
                    case 5:
                        result = "five";
                        break;
                    case 6:
                        result = "six";
                        break;
                    case 7:
                        result = "seven";
                        break;
                    case 8:
                        result = "eight";
                        break;
                    case 9:
                        result = "nine";
                        break;
                }
            } else if (number < 20) {
                switch (number) {
                    case 10:
                        result = "ten";
                        break;
                    case 11:
                        result = "eleven";
                        break;
                    case 12:
                        result = "twelve";
                        break;
                    case 13:
                        result = "thirteen";
                        break;
                    case 14:
                        result = "fourteen";
                        break;
                    case 15:
                        result = "fifteen";
                        break;
                    case 16:
                        result = "sixteen";
                        break;
                    case 17:
                        result = "seventeen";
                        break;
                    case 18:
                        result = "eighteen";
                        break;
                    case 19:
                        result = "nineteen";
                        break;
                }
            } else if (number < 100) {
                int tensPlace = number / 10;
                int onesPlace = number % 10;
                switch (tensPlace) {
                    case 2:
                        result = "twenty";
                        break;
                    case 3:
                        result = "thirty";
                        break;
                    case 4:
                        result = "forty";
                        break;
                    case 5:
                        result = "fifty";
                        break;
                    case 6:
                        result = "sixty";
                        break;
                    case 7:
                        result = "seventy";
                        break;
                    case 8:
                        result = "eighty";
                        break;
                    case 9:
                        result = "ninety";
                        break;
                }
                if (onesPlace != 0) {
                    result += " " + (onesPlace == 1 ? "one" :
                            onesPlace == 2 ? "two" :
                                    onesPlace == 3 ? "three" :
                                            onesPlace == 4 ? "four" :
                                                    onesPlace == 5 ? "five" :
                                                            onesPlace == 6 ? "six" :
                                                                    onesPlace == 7 ? "seven" :
                                                                            onesPlace == 8 ? "eight" :
                                                                                    onesPlace == 9 ? "nine" : "");
                }
            } else {
                int hundredsPlace = number / 100;
                int remainder = number % 100;
                switch (hundredsPlace) {
                    case 1:
                        result = "one hundred";
                        break;
                    case 2:
                        result = "two hundred";
                        break;
                    case 3:
                        result = "three hundred";
                        break;
                    case 4:
                        result = "four hundred";
                        break;
                    case 5:
                        result = "five hundred";
                        break;
                    case 6:
                        result = "six hundred";
                        break;
                    case 7:
                        result = "seven hundred";
                        break;
                    case 8:
                        result = "eight hundred";
                        break;
                    case 9:
                        result = "nine hundred";
                        break;
                }
                if (remainder != 0) {
                    result += " and ";
                    if (remainder < 10) {
                        switch (remainder) {
                            case 1:
                                result += "one";
                                break;
                            case 2:
                                result += "two";
                                break;
                            case 3:
                                result += "three";
                                break;
                            case 4:
                                result += "four";
                                break;
                            case 5:
                                result += "five";
                                break;
                            case 6:
                                result += "six";
                                break;
                            case 7:
                                result += "seven";
                                break;
                            case 8:
                                result += "eight";
                                break;
                            case 9:
                                result += "nine";
                                break;
                        }
                    } else if (remainder < 20) {
                        switch (remainder) {
                            case 10:
                                result += "ten";
                                break;
                            case 11:
                                result += "eleven";
                                break;
                            case 12:
                                result += "twelve";
                                break;
                            case 13:
                                result += "thirteen";
                                break;
                            case 14:
                                result += "fourteen";
                                break;
                            case 15:
                                result += "fifteen";
                                break;
                            case 16:
                                result += "sixteen";
                                break;
                            case 17:
                                result += "seventeen";
                                break;
                            case 18:
                                result += "eighteen";
                                break;
                            case 19:
                                result += "nineteen";
                                break;
                        }
                    } else {
                        int tensPlace = remainder / 10;
                        int onesPlace = remainder % 10;
                        switch (tensPlace) {
                            case 2:
                                result += "twenty";
                                break;
                            case 3:
                                result += "thirty";
                                break;
                            case 4:
                                result += "forty";
                                break;
                            case 5:
                                result += "fifty";
                                break;
                            case 6:
                                result += "sixty";
                                break;
                            case 7:
                                result += "seventy";
                                break;
                            case 8:
                                result += "eighty";
                                break;
                            case 9:
                                result += "ninety";
                                break;
                        }
                        if (onesPlace != 0) {
                            result += " " + (onesPlace == 1 ? "one" :
                                    onesPlace == 2 ? "two" :
                                            onesPlace == 3 ? "three" :
                                                    onesPlace == 4 ? "four" :
                                                            onesPlace == 5 ? "five" :
                                                                    onesPlace == 6 ? "six" :
                                                                            onesPlace == 7 ? "seven" :
                                                                                    onesPlace == 8 ? "eight" :
                                                                                            onesPlace == 9 ? "nine" : "");
                        }
                    }
                }
            }

            System.out.println(result);
        }

        sc.close(); // Đóng Scanner
    }
}
