public class StringsandLoops {
    public static void main(String[] args) {
        // This loop will print numbers 1 to 20
        System.out.printf("\nWelcome to Stings and Loops!\n");

        for (int i = 1; i <= 20; i++) {
            System.out.println("i = " + i);

        }

        int myLoopControlVariable = 0;

        while (myLoopControlVariable <= 12) {

            System.out.println("myLoopControlVariable is..." + myLoopControlVariable);
            myLoopControlVariable++;
        }

        String[] myStrArray = {"this", "that", "the other"};

        for (int i = 0; i <= 2; i++) {
            System.out.println("myStrArray[" + i + "] = "  + myStrArray[i]);

        }

    }
}