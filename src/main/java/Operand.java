import java.util.LinkedList;
import java.util.regex.Pattern;

public class Operand {
    private final LinkedList<Integer> operands;

    public Operand() {
        this.operands = new LinkedList<>();
    }

    public void insertLast(Integer element) {
        operands.addLast(element);
    }

    public void insertFirst(Integer element) {
        operands.addFirst(element);
    }

    public int getOperand() {
        return operands.removeFirst();
    }

    public Boolean validateOperand(String element) {
        if(!Pattern.compile("^[0-9]+$")
                .matcher(element)
                .matches()) {
            throw new RuntimeException("유효하지 않은 수입니다.");
        }
        return true;
    }
}
