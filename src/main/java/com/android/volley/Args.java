package com.android.volley;

/**
 * Created by kulik on 8/27/14.
 */
public class Args {
    public static <T> T notNull(final T argument, final String name) {
        if (argument == null) {
            throw new IllegalArgumentException(name + " may not be null");
        }
        return argument;
    }

}
