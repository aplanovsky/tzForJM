package pl.rimcalc;

import java.util.Arrays;
import java.util.List;

import static pl.rimcalc.Scenario.getScenario;

public class Tests {

  public static String  testAllInput(String operator){

    List<String> intList = Arrays.asList( "1","2","3","4","5","6","7","8","9","10");
    List<String> rimList = Arrays.asList("X", "IX", "VIII", "VII", "VI", "V",  "IV", "III",  "II", "I" );


    intList.stream().forEachOrdered(elem ->getScenario(elem, elem, operator));
    rimList.stream().forEachOrdered(elem ->getScenario(elem, elem, operator));

    return "";
  }
}
