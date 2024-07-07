
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    //Q.1 program to print sum of add, multiply, divide and remainder
    Scanner scanner = new Scanner(System.in);
    System.out.println("Q.1 Please Enter First Number: ");
    int firstNum = scanner.nextInt();
    System.out.println("Q.1 Please Enter Second Number: ");
    int secondNum = scanner.nextInt();
    System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
    System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
    System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
    System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
    System.out.println(firstNum + " % " + secondNum + " = " + (firstNum % secondNum));

    //Q.2 program to print input multiplication to 10
    System.out.println("Q.2 Please Enter a number to get it's multiplication table:");
    int multiplications = scanner.nextInt();
    for (int i = 1; i <= 10; i++) {
        System.out.println(multiplications + " * " + i + " = " + (multiplications * i));
    }
    //Q.3 write a java program to print the area and perimeter
    System.out.println("Q.3 Please Enter the Radius to calculate the Area and Perimeter:");
    double radius = scanner.nextDouble();
    double area = Math.PI * radius * radius;
    double perimeter = 2 * Math.PI * radius;
    System.out.println("The perimeter of a circle is: " + perimeter);
    System.out.println("The area of a circle is: " + area);


    //Q.4 find the average
    System.out.println("Q.4 Please enter the count of numbers: ");
    int count = scanner.nextInt();
    double average = 0;
    for (int i = 0; i < count; i++) {
        System.out.println("Please Enter a number: ");
        int number = scanner.nextInt();
        average += number;
    }
    System.out.println("The average is : " + average / count);

    //Q.5 accepts three integers add first two and compare with the third
    System.out.println("Q.5 Enter first number: ");
    int first = scanner.nextInt();
    System.out.println("Q.5 Enter second number: ");
    int second = scanner.nextInt();
    System.out.println("Q.5 Enter third number: ");
    int third = scanner.nextInt();
    boolean result = (first + second) == third;
    System.out.println("the result is: " + result);
    scanner.nextLine();

    //Q.6 reverse a word
    System.out.println("Q.6 Enter a word you would like to reverse");
    String word = scanner.nextLine();
    StringBuilder str = new StringBuilder(word);
    System.out.println(word + " After reverse is : " + str.reverse());

    //Q.7 check if even or odd
    System.out.println("Q.7 Enter a number to check if even or odd: ");
    int evenOrOdd = scanner.nextInt();
    if (evenOrOdd % 2 == 0) {
        System.out.println(evenOrOdd + " is an even number");
    } else {
        System.out.println(evenOrOdd + " is an odd number");
    }

    //Q.8 Java program to convert the temperature
    System.out.println("Q.8 Enter Temperature degree:");
    double temperature = scanner.nextDouble();
    double fahrenheit = (temperature * 9 / 5) + 32;
    System.out.println("Temperature in Fahrenheit is : " + fahrenheit);

    scanner.nextLine();
    //Q.9 get index and print the character
    System.out.println("Q.9 Please enter the words:");
    String words = scanner.nextLine();
    System.out.println("Enter the index number: ");
    int index = scanner.nextInt();
    System.out.println(words.charAt(index));

    //Q.10 print the area and perimeter of a rectangle
    System.out.println("Q.10 Enter the rectangle width:");
    double width = scanner.nextDouble();
    System.out.println("Enter the rectangle height: ");
    double height = scanner.nextDouble();
    System.out.println("Area is: " + width + " * " + height + " = " + (width * height));
    System.out.println("Perimeter is: " + 2 + " * (" + width + " + " + height + ") = " + 2 * (width + height));

    //Q.11 compare two numbers by using applicable logical operators
    System.out.println("Q.11 Enter the first number you like to compare: ");
    int compare1 = scanner.nextInt();
    System.out.println("Enter the second number you like to compare: ");
    int compare2 = scanner.nextInt();
    if (compare1 < compare2) {
        System.out.println(compare1 + " < " + compare2);
    }
    if (compare1 > compare2) {
        System.out.println(compare1 + " > " + compare2);
    }
    if (compare1 <= compare2) {
        System.out.println(compare1 + " <= " + compare2);
    }
    if (compare1 >= compare2) {
        System.out.println(compare1 + " >= " + compare2);
    }
    if (compare1 == compare2) {
        System.out.println(compare1 + " == " + compare2);
    }
    if (compare1 != compare2) {
        System.out.println(compare1 + " != " + compare2);
    }
    //Q.12 convert seconds to hours
    System.out.println("Q.12 Enter the number of seconds you like to convert: ");
    int seconds = scanner.nextInt();
    int hours = (seconds / 60) / 60;
    int minutes = seconds / 60 % 60;
    int seconds1 = seconds % 60;
    System.out.println(hours + ":" + minutes + ":" + seconds1);
    //Q.13 4 integers equal or not
    System.out.println("Q.13 Enter first number: ");
    int compNum1 = scanner.nextInt();
    System.out.println("Q.13 Enter second number: ");
    int compNum2 = scanner.nextInt();System.out.println("Q.13 Enter third number: ");
    int compNum3 = scanner.nextInt();System.out.println("Q.13 Enter forth number: ");
    int compNum4 = scanner.nextInt();
    if ((compNum1 == compNum2) && (compNum2 == compNum3) && (compNum3 == compNum4)) {
        System.out.println("Numbers are equal");
    } else {
        System.out.println("Numbers are not equal!");
    }
    // Q.14 read an integer and check if negative, zero, or positive
    System.out.println("Q.14 Please enter a number :");
    int isNum = scanner.nextInt();
    if (isNum > 0) {
        System.out.println("number is positive");
    } else if (isNum < 0) {
        System.out.println("number is negative");
    } else {
        System.out.println("number is zero");
    }
    //Q.15 enter numbers until the user end it than calculate pos,neg, zero's
    int userNum;
    String answer;
    int positive = 0, negative = 0, zero = 0;
    do {
        System.out.println("Q.15 Please enter any number except -1:  ");
        userNum = scanner.nextInt();
        if (userNum > 0) {
            positive++;
        } else if (userNum < -1) {
            negative++;
        } else if(userNum == 0) {
            zero++;
        }
        System.out.println("Enter -1 to exit or any other key to continue ");
        answer = scanner.next();
    } while (!answer.equals("-1"));
    System.out.println("number of positive number entries : " + positive);
    System.out.println("number of negative number entries: " + negative);
    System.out.println("number of zero's number entries: " + zero);
    scanner.nextLine();
    //Q.16 write a number and revers it
    System.out.println("Q.16 Enter the number you like to reverse:");
    String input1 = scanner.nextLine();
    StringBuilder str1 = new StringBuilder(input1);
    System.out.println(str1.reverse());
    //Q.17 allow user to input numbers and print the largest one
     int ragem;
    int largest = 0;
    int lowest = 0;
    String answer2;
    do {
        System.out.println("Q.17 Enter the number: ");
        ragem = scanner.nextInt();
        System.out.println("press any key to continue or write no to exit:");
        scanner.nextLine();
        answer2 = scanner.nextLine();
        if (ragem > largest) {
            largest = ragem;
        } else if (ragem < lowest){
            lowest = ragem;
        }
    } while (!answer2.equals("no"));
    System.out.println(largest + " is the largest");
    System.out.println(lowest + " is the lowest ");
    //Q.18 Determine a number of character appears in a word
    System.out.println("Q.18 please enter a word : ");
    String userWord = scanner.nextLine();
    int countOfChar = 0;
    for (int i = 0; i < userWord.length(); i++) {
        if (userWord.charAt(i) == 'a') {
            countOfChar++;
        }
    }
    System.out.println("char a appeared in the word :" + countOfChar + " times.");
    }

}
