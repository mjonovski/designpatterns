package singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoggerSingleton {
    private static LoggerSingleton logger;
    private String logFileLocation = "log.txt";
    private PrintWriter pw;
    private FileWriter fw;
    private BufferedWriter bw;

    private LoggerSingleton() throws IOException {
        fw = new FileWriter(logFileLocation, true);
        bw = new BufferedWriter(fw);
        this.pw = new PrintWriter(bw);
    }

    public synchronized LoggerSingleton getLogger() throws IOException {
        if (this.logger == null) {
            logger = new LoggerSingleton();
        }
        return this.logger;
    }

    public void write(String txt) {
        pw.println(txt);
    }
}