package domain;

public class Number {
    private int numberMember;

    public Number(String numberMember) {
        this.numberMember = changeNumberType(numberMember);
    }

    private int changeNumberType(String numbers) {
        return numberMember = java.lang.Integer.parseInt(numbers);
    }

    public int getNumberMember() {
        return numberMember;
    }
}