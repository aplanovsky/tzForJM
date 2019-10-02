package pl.rimcalc;


public class Converter {

  public static String fromRoman(String value) {

    switch (value) {
      case "X": return "10";
      case "IX": return "9";
      case "VIII": return "8";
      case "VII": return "7";
      case "VI": return "6";
      case "V": return "5";
      case "IV": return "4";
      case "III": return "3";
      case "II": return "2";
      case "I": return "1";
    }
    return value;
  }

  public static String toRoman(int value) { {

    String s = "";
    if (value == 0) s = "nulla";
    if (value >= 0 || value < 101)

      while (value == 100)  {s += "C"; value -= 100;}
      while (value >= 90)   {s += "XC";value -= 90;}
      while (value >= 50)   {s += "L"; value -= 50;}
      while (value >= 40)   {s += "XL";value -= 40;}
      while (value >= 10)   {s += "X"; value -= 10;}
      while (value >= 9)    {s += "IX";value -= 9;}
      while (value >= 5)    {s += "V"; value -= 5;}
      while (value >= 4)    {s += "IV";value -= 4;}
      while (value >= 1)    {s += "I"; value -= 1;}


    return s;
  }

  }
}
