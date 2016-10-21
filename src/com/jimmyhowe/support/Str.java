package com.jimmyhowe.support;

import java.util.List;
import java.util.StringJoiner;

/**
 * String Utility Helper
 */
public class Str
{
    /**
     * Converts CamelCase to Camel Case
     *
     * @param camelCase
     */
    public static String CamelCaseToWords(String camelCase)
    {
        String result = "";

        for ( int i = 0; i < camelCase.length(); i++ )
        {
            Character ch = camelCase.charAt(i);
            if ( Character.isUpperCase(ch) )
                result += " " + ch;
            else
                result += ch;
        }

        return result.trim();
    }

    /**
     * Converts CamelCase to camel case
     *
     * @param camelCase
     */
    public static String CamelCaseToLowerCaseWords(String camelCase)
    {
        String result = "";

        for ( int i = 0; i < camelCase.length(); i++ )
        {
            Character ch = camelCase.charAt(i);
            if ( Character.isUpperCase(ch) )
                result += " " + Character.toLowerCase(ch);
            else
                result += ch;
        }

        return result.trim();
    }

    /**
     * Converts CamelCase to snake_case
     *
     * @param camelCase
     */
    public static String CamelCaseToSnakeCase(String camelCase)
    {
        return Str.CamelCaseToLowerCaseWords(camelCase).replace(' ', '_');
    }

    /**
     * Convert String Array to CSV Format
     */
    public static String toCsv(List<String> data)
    {
        StringJoiner stringJoiner = new StringJoiner(", ");

        data.forEach(stringJoiner::add);

        return stringJoiner.toString();
    }
}
