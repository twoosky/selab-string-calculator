import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

public class Operator {

    static String line = Input.input();
    static String temp[] = line.split(" ");

    public static void separation() {
        Queue number = new LinkedList<>();
        Queue operator = new LinkedList<>();

        for (int i = 0; i < temp.length; i++) {
            if (Character.isDigit(temp[i].charAt(0)) == false) {
                operator.offer(temp[i]);
            } else {
                number.offer(temp[i]);
            }
        }
        Operator.cal(operator, number);
    }

    public static void cal(Queue operator, Queue number) {
        float result = Float.parseFloat(String.valueOf(number.poll()));

        Iterator iter_oper=operator.iterator();

        while(iter_oper.hasNext()){
            float next= Float.parseFloat(String.valueOf(number.poll())) ;
            if (iter_oper.next().equals("+")) {
                result = result + next;
            } else if (iter_oper.next().equals("*")) {
                result =result* next;
            } else if (iter_oper.next().equals("-")) {
                result =result- next;
            } else if (iter_oper.next().equals("/")) {
                result =result/next;
            }
        }

        Output.output(result);
    }
}
