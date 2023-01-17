package Homework6;

public class Task3 {
    public static void main(String[] args) {
        //Create an array of countries
        // While retrieving all values from an array print capital for each country choose any five countries
        String[] country = {"Moldova", "Russia", "Romania", "Japan", "Italy"};
        String[] capital = {"Chisinau", "Moscow", "Bucharest", "Tokyo", "Roma"};


        for (int i = 0; i < country.length; i++) {
            System.out.println(country[i] + " - " + capital[i]);
        }
    }
}