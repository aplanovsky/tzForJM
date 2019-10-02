package pl.rimcalc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static pl.rimcalc.Arithmetic.doArithmetic;
import static pl.rimcalc.Converter.fromRoman;
import static pl.rimcalc.Converter.toRoman;

public class Scenario {


  public static String getScenario(String num1, String num2, String oper) {


    List<String> arab = new ArrayList<>();
    String[] otherList = new String[]{ "1","2","3","4","5","6","7","8","9","10"};
    arab.addAll(Arrays.asList(otherList));

    List<String> rim = new ArrayList<>();
    String[] otherList2 = new String[] {"X", "IX", "VIII", "VII", "VI", "V",  "IV", "III",  "II", "I" };
    rim.addAll(Arrays.asList(otherList2));

    try {
      System.out.println( (arab.contains(num1) && arab.contains(num2)) ? doArithmetic(num1, num2, oper) :
              (rim.contains(num1) && rim.contains(num2)) ?
                      toRoman(doArithmetic(fromRoman(num1), fromRoman(num2), oper)) : wrongChoice());
    }catch (IllegalArgumentException e){
          wrongChoice();
    }

    return "";
  }

  private static String wrongChoice() throws IllegalArgumentException{

    throw new  IllegalArgumentException("Wrong symbol('s)");

  }

}
