import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        Queue<String> number=new LinkedList<>();
        Queue<String> word=new LinkedList<>();

        System.out.println("입력하세요");
        String line=s.nextLine();

        String temp[];
        ArrayList temp_number=new ArrayList();
        ArrayList temp_word=new ArrayList();


        temp=line.split(" ");

        for(int i = 0; i<temp.length; i++){

            if(Character.isDigit(temp[i].charAt(0))==false){
                word.add(temp[i]);
            }else {
                number.add(temp[i]);
            }


            temp_number.add(number.poll());
            temp_word.add(word.poll());

        }
        temp_number.removeAll(Collections.singletonList(null));
        temp_word.removeAll(Collections.singletonList(null));


        System.out.println(temp_number);
        System.out.println(temp_word);
        System.out.println(temp_number.get(0));

        int result= (int)temp_number.get(0);;

        for (int i=1;i<temp_word.size();i++){



            if(temp_word.get(i).equals("+")){
                result=result+(int)temp_number.get(i);

            }else if(temp_word.get(i).equals("-")) {
                result=result-(int)temp_number.get(i);

            }else if(temp_word.get(i).equals("/")) {
                result=result/(int)temp_number.get(i);
            }else if(temp_word.get(i).equals("*")){
                result=result*(int)temp_number.get(i);
            }
        }
        System.out.println(result);

    }
}
