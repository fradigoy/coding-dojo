package com.fredostar;

public class FizzBuzz {
    public String resultat(int i) {

        String resultat = Integer.toString(i);

        if(isFizz(i)|| i % 5 == 0){

            resultat = "";

            if(isFizz(i)){

                resultat += "Fizz";

            }
            if(isBuzz(i)){
                resultat += "Buzz";
            }
        }

        return resultat;
    }

    private boolean isFizz(int number){

        if((number % 3) == 0){

           return true;

        }
        else
        {
            return false;
        }

    }

    private boolean isBuzz(int number){

        if(number % 5 == 0){
            return true;
        }
        else
        {
            return false;
        }
    }


}
