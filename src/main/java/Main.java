import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("입력하세요");
        String line=s.nextLine();

        String temp[]=new String [10];

        temp=line.split(" ");

        for(int i = 0; i<temp.length; i++){
            System.out.println(temp[i]);
        }

       /* Queue<Integer> number=new LinkedList<>();
        Queue<String> word=new LinkedList<>();



        try{
            number.offer(s.nextInt());
            word.offer(s.next());
        }catch (InputMismatchException e){
            System.out.println("입력이 잘못 되었습니다.");
        }


        if(word.poll().equals("+")){

        }else if(word.poll().equals("-")) {

        }else if(word.poll().equals("/")){

        }else if(word.poll().equals("*")){

        }else {
            System.out.println("error");
        }*/

    }
}
