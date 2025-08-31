public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.write("hi loggo");
        logger.write("Second message");
        logger.setFileName("log2.txt");
        logger.write("Third message");
        logger.setFileName("log.txt");
        logger.write("Fourth message");
        logger.close();
    }
}