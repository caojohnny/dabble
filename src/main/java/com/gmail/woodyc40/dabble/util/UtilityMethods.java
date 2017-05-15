/*
 * Dabble contextual dictionary - Copyright 2017 Johnny Cao
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gmail.woodyc40.dabble.util;

public final class UtilityMethods {
    private UtilityMethods() { // Prevent instantiation
    }

    public static void lf() {
        System.out.println();
    }

    public static void pl(String s) {
        System.out.println(s);
    }

    public static void p(String s) {
        System.out.print(s);
    }
}