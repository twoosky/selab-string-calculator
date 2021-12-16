package calculator;

import calculatorIO.validity;
import error.NumberError;

public class Number implements validity {

    private final int number;

    public Number(Calculator calculator, String number){
        doValidation(calculator, number);
        this.number = Integer.parseInt(number);
        addNumber(calculator,this);
    }

    private void addNumber(Calculator calculator,Number number){
        calculator.number.add(number);
    }

    public int getNumber(){
        return this.number;
    }

    @Override
    public void doValidation(Calculator calculator, String data) {
        try{
            Integer.parseInt(data);
        } catch(NumberFormatException e){
            new NumberError().printErrorMessage();
            System.exit(0);
        }
    }
}
