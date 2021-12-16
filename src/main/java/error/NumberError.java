package error;

public class NumberError implements error{
    private final String MESSAGE = "\n잘못된 숫자를 입력하셨습니다.";
    @Override
    public void printErrorMessage() {
        System.out.println(MESSAGE);
    }
}
