public class Demo {

    public static void main(String[] args) {
        Hello hello = new Hello();

        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is: " + hello.getNext());
        }

        System.out.println("\nResetting");
        hello.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is: " + hello.getNext());
        }

        System.out.println("\nStarting at 100");
        hello.setStart(100);
        for (int i = 0; i < 5; i++) {
            System.out.println("Next value is: " + hello.getNext());
        }
    }
}
