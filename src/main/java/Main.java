import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue number=new LinkedList<>();
        Queue operator=new LinkedList<>();

        String line=Input.input();

        ArrayList temp_number=new ArrayList();
        ArrayList temp_operator=new ArrayList();

        String temp[]=line.split(" ");

        float result=0;

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

        result=Integer.parseInt(String.valueOf(temp_number.get(0)));

        for (int i=1;i<temp_operator.size()+1;i++){
            if(temp_operator.get(i-1).equals("+")){
                result=result+Float.parseFloat(String.valueOf(temp_number.get(i)));
            }else if(temp_operator.get(i-1).equals("-")) {
                result=result-Float.parseFloat(String.valueOf(temp_number.get(i)));
            }else if(temp_operator.get(i-1).equals("/")) {
                result=result/Float.parseFloat(String.valueOf(temp_number.get(i)));
            }else if(temp_operator.get(i-1).equals("*")){
                result=result*Float.parseFloat(String.valueOf(temp_number.get(i)));
            }
        }
        Output.output(result);
    }
}
