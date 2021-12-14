package calculation;

import calculator.Calculator;

public class Calculation {

    private int count;
    private int size;

    public Calculation(Calculator calculator){

        size = calculator.number.size();

        for (count = 0; count < size; count++){
            if(count == 0){
                calculator.setResult(calculator.number.poll().getNumber());
                continue;
            }

            String operator = calculator.operator.poll().getOperator();

            if(operator.equals(calculator.PLUS.getSIGN())){
                calculator.setResult(calculator.PLUS.doCalculate(calculator.getResult(), calculator.number.poll().getNumber()));
            }
            if(operator.equals(calculator.MINUS.getSIGN())){
                calculator.setResult(calculator.MINUS.doCalculate(calculator.getResult(), calculator.number.poll().getNumber()));
            }
            if(operator.equals(calculator.TIMES.getSIGN())){
                calculator.setResult(calculator.TIMES.doCalculate(calculator.getResult(), calculator.number.poll().getNumber()));
            }
            if(operator.equals(calculator.DIVISION.getSIGN())){
                calculator.setResult(calculator.DIVISION.doCalculate(calculator.getResult(), calculator.number.poll().getNumber()));
            }
        }
    }
}
