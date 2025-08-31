import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private static Logger instance;
    private File logFile;
    private FileWriter writer;

    private Logger() {
        setFileName("log.txt");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setFileName(String fileName) {
        logFile = new File(fileName);
        try {
            if (writer != null) {
                writer.close();
            }
            if (logFile.createNewFile()) {
                System.out.println("file created");
            } else {
                System.out.println("file already exists");
            }
            writer = new FileWriter(logFile, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(String message) {
        try {
            if (writer != null) {
                writer.write(message + System.lineSeparator());
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if (writer != null) {
                writer.close();
                System.out.println("logger closed");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}