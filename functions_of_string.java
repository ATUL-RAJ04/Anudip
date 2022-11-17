public class functions_of_string{

    public static void main(String[] args){
  //String Concatenation
        String str1 = "Rock";
        String str2 = "Star";
  //Method 1 : Using concat
        String str3 = str1.concat(str2);
        System.out.println(str3);
  //Method 2 : Using "+" operator
        String str4 = str1 + str2;
        System.out.println(str4);
 //Method 3 : Length of a String
        String str_Sample = "RockStar";
        System.out.println("Length of String: " + str_Sample.length());
 //Method 4 : Index of a given character
        System.out.println("Index of character 'S': " + str_Sample.indexOf('S'));
 //Methode 5 : Compare to - Ignore case
        System.out.println("Compare To 'ROCKSTAR' - Case Ignored: " + 
        str_Sample.compareToIgnoreCase("ROCKSTAR"));                     
    }
  }