package Week13.Task1;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Logger logger1 = Logger.getInstance();
        System.out.println(logger1 == logger); // point to the same object

        logger.log("Hello");
        logger1.logError("you can't do that");
    }
}
