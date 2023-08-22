public class Main {
    public static void main(String[] args) {
        // Declare and initialize some strings
        String Greeting = "Hello, ";
        String name = "Alex";
        String message;

        // Concatenate strings
        message = Greeting + name;

        // Print the result
        System.out.println(message);

        // String length
        int length = message.length();
        System.out.println("Length of the message: " + length);

        // String Methods
        System.out.println("Uppercase message: " + message.toUpperCase());
        System.out.println("Lowercase message: " + message.toLowerCase());

        // Substring
        String partOfMessage = message.substring(0, 5);
        System.out.println("Substring: " + partOfMessage);

        // String comparison
        String otherName = "Alex";
        boolean isEqual = name.equals(otherName);
        System.out.println("Are the names equal? " + isEqual);




    }
}