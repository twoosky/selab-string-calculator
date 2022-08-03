import java.util.LinkedList;
import java.util.regex.Pattern;

public class Operand {
    private final LinkedList<Integer> operands;

    public Operand() {
        this.operands = new LinkedList<>();
    }

    public void insertLast(int element) {
        operands.addLast(element);
    }

    public void insertFirst(int element) {
        operands.addFirst(element);
    }

    public int getOperand() {
        return operands.removeFirst();
    }

    public boolean validateOperand(String element) {
        return Pattern.matches("^[0-9]+$", element);
    }
}
