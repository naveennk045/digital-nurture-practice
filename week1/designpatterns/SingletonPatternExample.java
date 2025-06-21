package week1.designpatterns;

class Logger {
    // instance variable
    private static Logger instance;

    // private constructor for restricting the access
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // method to get an instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

public class SingletonPatternExample {

    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("This is the first message.");
        logger2.log("This is the second message.");

        if (logger1 == logger2) {
            System.out.println("logger instances are the same");
        } else {
            System.out.println("Different logger instances");
        }
    }
}