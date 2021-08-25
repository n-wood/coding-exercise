package nathan.wood.exercise;


public class FizzBuzz {

    /**
     * 1. Create a function called fizzBuzz that takes an Int and returns the same value as a String
     * 2. If the input is divisible by 3 (with no remainder) return the word “Fizz”
     * 3. If the input is divisible by 5 (with no remainder) return the word “Buzz”
     * 4. If the input is divisible by 3 and 5 (with no remainder) return the word “FizzBuzz”
     * @param number The input number as an Int
     * @return number,Fizz,Buzz or FizzBuzz
     */
    public String fizzBuzz(final int number) {
        boolean divisibleByThree = (number % 3 == 0); //Fizz
        boolean divisibleByFive = (number % 5 == 0); //Buzz

        StringBuilder response = new StringBuilder();

        if (!divisibleByFive && !divisibleByThree) {
            response.append(number);
        }

        if (divisibleByThree) {
            response.append("Fizz");
        }

        if (divisibleByFive) {
            response.append("Buzz");
        }
        return response.toString();
    }


    
}
