package fr.fradigoy;

public class FizzBuzz {
    public String generate(int number) {

        String result = String.valueOf(number);

        if(number%3 == 0 || number%5==0){
            result = "";
            if(number % 3 == 0)
                result = "Fizz";
            if(number % 5 == 0)
                result = "Buzz";
        }


        return result;
    }
}
