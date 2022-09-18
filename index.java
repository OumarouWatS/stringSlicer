import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String word, part;
    int number, Substringslength;
    Scanner scnr = new Scanner(System.in);
    System.out.println("Please, enter a String:");
    word = scnr.nextLine();
    System.out.println("In how many substrings do you want to divide your string input?");
    number = scnr.nextInt();
    Substringslength = word.length()/number;
    for(int i=0; i<word.length(); i= i+Substringslength){
      part = word.substring(i,i+Substringslength);
      System.out.print(part + " ");
    }
  }
}
