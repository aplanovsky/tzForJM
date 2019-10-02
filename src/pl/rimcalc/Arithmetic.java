package pl.rimcalc;

public class Arithmetic {
  public static int doArithmetic(String num1, String num2, String oper) {

    int operand1 = Integer.parseInt(num1);
    int operand2 = Integer.parseInt(num2);
    switch (oper) {
      case "+": return operand1 + operand2;
      case "-": return operand1 - operand2;
      case "*": return operand1 * operand2;
      case "/": return operand1 / operand2;
    }


    int result = Integer.parseInt(oper);
    return result;
  }
}
