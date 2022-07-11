package org.home.productivity.todo.commons;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public class StringUtilities {

    /**
     * Checks if given string starts with any given prefixes
     * 
     * @param string
     * @param prefixes
     * @return
     */
    public static boolean startsWithIn(String string, String[] prefixes) {
        if (StringUtils.isBlank(string)) {
            throw new RuntimeException("Given string is null, blank, or empty: \"" + string + "\"");
        }

        // TODO: finish and add in unit tests
        // if (prefixes doesn't contain anything)

        return Arrays.stream(prefixes).anyMatch(prefix -> string.startsWith(prefix));
    }
}
