/*
 * File:     Worker
 * Package:  org.dromakin
 * Project:  lambda-homework-2
 *
 * Created by dromakin as 09.01.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.01.09
 */

package org.dromakin;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " failed!");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
