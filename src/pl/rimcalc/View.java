package pl.rimcalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static pl.rimcalc.Scenario.getScenario;

public class View {


  public static String ParseIt() throws IOException {
    System.out.print("Input: " + "\n");

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();

    int endInput = input.length();
    int end = input.indexOf(" ");

    String operand1 = input.substring(0, end);

    int newend = operand1.length() + 3;
    String operator = input.substring(operand1.length(), newend).replaceAll(" ", "" );

    String operand2 = input.substring(newend, endInput);

    System.out.println("Output: ");
    return getScenario(operand1, operand2, operator);

  }
}
