package calculator;

import calculatorIO.validity;

public class Number implements validity {

    private final int number;

    public Number(String number){


        this.number = Integer.parseInt(number);
    }

    public int getNumber(){
        return this.number;
    }

    @Override
    public void doValidation(String data) {
        try{
            Integer.parseInt(data);
        } catch(Exception e){

        }
    }
}
