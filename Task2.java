package Homework6;

public class Task2 {
    public static void main(String[] args) {
        // Create an array of size 5 on integers
        // and calculate the sum af all the elements in an array
        int[] numbers={9,8,7,6,5};
        int sum=0;
         for (int i=0;i< numbers.length; i++){
             System.out.println(numbers[i]);
             sum+=numbers[i];
         }
        System.out.println("The sum of all numbers is : "+ sum);
    }
}
