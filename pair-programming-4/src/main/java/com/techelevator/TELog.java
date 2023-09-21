package com.techelevator;

import com.techelevator.util.TELogException;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//Logger logger = Logger.getLogger("MyLog");
//    FileHandler fh;
//
//    try {
//        // This block configure the logger with handler and formatter
//        fh = new FileHandler("C:/temp/test/MyLogFile.log");
//        logger.addHandler(fh);
//        SimpleFormatter formatter = new SimpleFormatter();
//        fh.setFormatter(formatter);

//        // the following statement is used to log any messages
//        logger.info("My first log");
//
//    } catch (SecurityException e) {
//        e.printStackTrace();
//    } catch (IOException e) {
//        e.printStackTrace();
//    }
//    logger.info("Hi How r u?");
//}

public class TELog {

    private static PrintWriter pw = null;

    public static void log(String message) {
        try {
            if (pw == null) {
                String logFilename = "logs/" + LocalDate.now().format(DateTimeFormatter.ISO_DATE) + ".log";
                pw = new PrintWriter(new FileOutputStream(logFilename));
            }
            pw.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME) + " " + message);
            pw.flush();
        }
        catch (FileNotFoundException e) {
            throw new TELogException(e.getMessage());
        }
    }

}
                //Logger logger = Logger.getLogger("MyLog");

                //FileHandler handler = new FileHandler("logs/search.log" + Calendar.getInstance().getTime() + ".log", true);
                //logger.addHandler(handler);
                //SimpleFormatter formatter = new SimpleFormatter();
                //handler.setFormatter(formatter);
                // try(PrintWriter dataOutPut = new PrintWriter(message.valueOf(dataInput)) {

