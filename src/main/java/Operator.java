import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Operator {

    private static String line = Input.input();
    private static String temp[] = line.split(" ");

    public static void separation() {
        Queue<String> number = new LinkedList<String>();
        Queue<String> operator = new LinkedList<String>();

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
                result += next;
            } else if (iter_oper.next().equals("*")) {
                result *= next;
            } else if (iter_oper.next().equals("-")) {
                result -= next;
            } else if (iter_oper.next().equals("/")) {
                result /=next;
            }
        }
        Output.output(result);
    }
}
