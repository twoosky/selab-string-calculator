import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        String line=Input.input();

        Queue number=new LinkedList<>();
        Queue operator=new LinkedList<>();

        ArrayList temp_number=new ArrayList();
        ArrayList temp_operator=new ArrayList();

        String temp[]=line.split(" ");

        for(int i = 0; i<temp.length; i++){
            if(Character.isDigit(temp[i].charAt(0))==false){
                operator.add(temp[i]);
            }else{
                number.add(temp[i]);
            }

            temp_number.add(number.poll());
            temp_operator.add(operator.poll());

        }
        temp_number.removeAll(Collections.singletonList(null));
        temp_operator.removeAll(Collections.singletonList(null));

        float result=Integer.parseInt(String.valueOf(temp_number.get(0)));
        Operator.operator(temp_operator,temp_number,result);
    }
}
