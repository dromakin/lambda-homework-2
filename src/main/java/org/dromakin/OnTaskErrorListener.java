/*
 * File:     OnTaskErrorListener
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

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
