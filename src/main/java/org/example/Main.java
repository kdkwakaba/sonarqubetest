package org.example;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.setLevel(Level.INFO);
        logger.log(Level.INFO, "This is the test log.");

        for (int i = 0; i < 100; i++) {
            logger.log(Level.INFO, "Loop Log");
        }
    }
}