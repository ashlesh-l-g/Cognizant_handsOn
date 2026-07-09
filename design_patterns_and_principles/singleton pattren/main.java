package design_patterns_and_principles;

public class main{
    public static void main(String[] args) {
        logger logger1 = logger.getInstance();
        logger logger2 = logger.getInstance();

        logger1.log("Application Started");
        logger2.log("User Logged In");

        System.out.println("Same instance? " + (logger1 == logger2));
    }
}