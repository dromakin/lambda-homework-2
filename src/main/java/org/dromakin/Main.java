package org.dromakin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        OnTaskDoneListener listener = logger::info;
        OnTaskErrorListener errorListener = logger::error;
        Worker worker = new Worker(listener, errorListener);
        worker.start();
    }
}