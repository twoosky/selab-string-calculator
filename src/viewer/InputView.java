package viewer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class InputView {

  private List<String> formulaList = new ArrayList<>();

  public InputView() throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("식을 입력해주세요 : ");
    String formula = bufferedReader.readLine();
    transformFormula(formula);
  }

  private void transformFormula(String formula) {
    String[] formulas = formula.split(" ");
    formulaList = Stream.of(formulas).collect(Collectors.toList());
  }

  public List<String> getFormulaList() {
    return formulaList;
  }
}