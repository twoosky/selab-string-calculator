package error;

public class OperatorError implements error{

    private final String MESSAGE = "\n잘못된 연산자를 입력하셨습니다.";

    @Override
    public void printErrorMessage() {
        System.out.println(MESSAGE);
    }
}
