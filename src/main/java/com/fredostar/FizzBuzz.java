package com.fredostar;

public class FizzBuzz {
    public String resultat(int i) {

        String resultat = Integer.toString(i);

        if(i % 3 == 0 || i % 5 == 0){

            resultat = "";

            if(i % 3 == 0){

                resultat += "Fizz";

            }
            if(i % 5 == 0){
                resultat += "Buzz";
            }
        }

        return resultat;
    }


}
