package singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.time.Clock;

public class Log {
    private static final Logger parentLogger = LogManager.getLogger(Log.class.getName());
    private static Log myLogger;

    private Log(){}

    public void LogExecution(String mes) {
        Logger(mes);
    }

    public static Log getMyLogger() {
        if (myLogger == null)
            myLogger = new Log();

        return myLogger;
    }

    private static void Logger(String logMessage) {
        Log.parentLogger.info("\r\nLog Entry : ");
        Log.parentLogger.info(Clock.systemUTC().toString());
        Log.parentLogger.info("Действие: {}", logMessage);
        Log.parentLogger.info("-------------------------------");
    }
}
