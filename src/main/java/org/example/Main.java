package org.example;

import java.sql.SQLOutput;
import java.util.Arrays;

class Main {
    public static void main() {
        Question6 question = new Question6();
        question.MoveAllZerosToTheEnd();
    }
}

class Question1 {
    public void findTheMaximumAndMinimumElement() {
        int[] anArray =  new int[] {5, 2, 9, 1, 7};

        int min = anArray[0];
        int max = anArray[0];

        for (int i = 0; i < anArray.length; i++) {
            if (min > anArray[i]) {
                min = anArray[i];
            }
            if (max < anArray[i]) {
                max = anArray[i];
            }
        }
        System.out.println("The minimum value is: " + min);
        System.out.println("The max value is: " + max);
    }
}

class Question2 {
    public void CalculateSumAndAvarage() {
        int[] anArray = new int[] {10, 20, 30, 40};

        int sum = 0;

        for (int i = 0; i < anArray.length; i++) {
            sum += anArray[i];
        }

        double average = (double) sum / anArray.length;

        System.out.println("Sum of the numbers of the array: " + sum);
        System.out.println("The average of the numbers of the array is: " + average);
    }
}

class Question3 {
    public void CheckIfTwoArraysAreEqual() {
        int[] array1 = new int[] {1, 2, 3};
        int[] array2 = new int[] {1, 2, 3};

        boolean condition = true;

        if (array1.length != array2.length) {
            condition = false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i]) {
                    condition = false;
                    break;
                }
            }
        }

        System.out.println("Is array1 equal to array2? R: " + condition);
    }
}

class Question4 {
    public void ReverseAnArrayInPlace() {
        int[] anArray = new int[] {1, 2, 3, 4, 5};

        int start = 0;
        int end = anArray.length - 1;

        while (start  < end) {
            // 1. Store the start element temporarily
            int temp = anArray[start];

            // 2. Overwrite start white the end
            anArray[start] = anArray[end];

            // 3. Overwrite end with the stored start value
            anArray[end] = temp;

            // 4. Move pointers inward
            start ++;
            end --;
        }

        System.out.println("Reversed array: " + Arrays.toString(anArray));
    }
}

class Question5 {
    public void FindTheSecondLargestElement() {
        int[] array = new int[]{50, 42, 36, 41, 34};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element (all elements might be equal).");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }
}

class Question6 {
    public void MoveAllZerosToTheEnd() {
        int[] anArray = new int[] {0, 1, 0, 3, 12};

        int insertPos = 0;

        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] != 0) {
                anArray[insertPos] = anArray[i];
                insertPos++;
            }
        }

        while (insertPos < anArray.length) {
            anArray[insertPos] = 0;
            insertPos++;
        }

        System.out.println("Result: " + Arrays.toString(anArray));
    }
}
