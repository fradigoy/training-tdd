package fr.fradigoy;

public class FizzBuzz {
    public String generate(int number) {

        String result = String.valueOf(number);

        if(number == 3)
            return "Fizz";
        if(number == 5)
            return "Buzz";

        return result;
    }
}
