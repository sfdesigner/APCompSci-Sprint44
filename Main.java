public class Main {

    public static void main(String[] args) {

        // Creating a string
        String s = new String();
        s = "Doug";

        // Getting the length of a string
        int len = s.length();
        System.out.println(len); // Returns 4

        // Getting the first character of a string
        char firstLetter = s.charAt(0);
        System.out.println(firstLetter); // Returns D

        // Getting a substring from the end
        String sub = s.substring(1);
        System.out.println(sub); // Returns oug

        // Getting a substring from the middle
        String mid = s.substring(1,3);
        System.out.println(mid); // Returns ou

        // Comparing a string
        boolean isSame = s.equals("Doug");
        System.out.println(isSame); // Returns true

        isSame = s.equals("DOUG");
        System.out.println(isSame); // Returns false

        isSame = s.equalsIgnoreCase("DOUG");
        System.out.println(isSame); // Returns true
    }
}
