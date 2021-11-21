import java.util.ArrayList;

public class Operator {

    public static void operator(ArrayList temp_operator,ArrayList temp_number, float result) {
        for (int i = 1; i < temp_operator.size() + 1; i++) {
            if (temp_operator.get(i - 1).equals("+")) {
                result = result + Float.parseFloat(String.valueOf(temp_number.get(i)));
            } else if (temp_operator.get(i - 1).equals("-")) {
                result = result - Float.parseFloat(String.valueOf(temp_number.get(i)));
            } else if (temp_operator.get(i - 1).equals("/")) {
                result = result / Float.parseFloat(String.valueOf(temp_number.get(i)));
            } else if (temp_operator.get(i - 1).equals("*")) {
                result = result * Float.parseFloat(String.valueOf(temp_number.get(i)));
            }
        }
        Output.output(result);
    }
}
