public class Exercise {

  public static void main(String[] args) {
    // implement exercise here
    
    String name = "Hans";
    int age = 48;
    char gender = 'm';

    Exercise.printHans(name, age, gender);
  }

  public static void printHans(String name, int age, char gender) {
    
    System.out.println("Name: " + name);
    System.out.println("Alter: " + age);
    System.out.println("Geschlecht: " + gender);

  }
}