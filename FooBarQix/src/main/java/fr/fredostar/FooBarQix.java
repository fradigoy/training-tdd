package fr.fredostar;

public class FooBarQix {
    public String generate(int number) {

        String result = String.valueOf(number);
        if(number % 3 == 0 && result.contains("3"))
            return "Foo";

        return result;
    }
}
