package calculator;

import calculation.Plus;
import calculatorIO.validity;
import error.OperatorError;

public class Operator implements validity {


    private final String operator;

    public Operator(Calculator calculator, String operator){
        doValidation(calculator, operator);
        this.operator = operator;
        addOperator(calculator,this);
    }

    private void addOperator(Calculator calculator,Operator operator){
        calculator.operator.add(operator);
    }

    public String getOperator(){
        return this.operator;
    }

    @Override
    public void doValidation(Calculator calculator, String data) {
        try{
            if(!(data.equals(calculator.PLUS.getSIGN()))  && !(data.equals(calculator.MINUS.getSIGN())) && !(data.equals(calculator.TIMES.getSIGN())) && !(data.equals(calculator.DIVISION.getSIGN()))){
                throw new Exception();
            }
        }catch(Exception e){
            new OperatorError().printErrorMessage();
            System.exit(0);
        }
    }
}
