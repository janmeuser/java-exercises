public class Exercise2 {
    public static void main(String[] args) {
        String title = "Herr";
        String firstName = "Duffy";
        String lastName = "Duck";

        String fullName = getFullName(title, firstName, lastName);
        System.out.println(fullName);
    }

    public static String getFullName(String title, String firstName, String lastName) {
        return title + " " + firstName + " " + lastName; 
				// Rückgabe durch Leerzeichen getrennt
    }
}