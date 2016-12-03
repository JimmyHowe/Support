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
    public static String toCsv(List<String> list)
    {
        return listSeparator(list, ", ");
    }

    public static String toSpaceSeparated(List<String> list)
    {
        return listSeparator(list, " ");
    }

    /**
     * Convert String Array to CSV Format
     */
    private static String listSeparator(List<String> data, String separator)
    {
        StringJoiner stringJoiner = new StringJoiner(separator);

        data.forEach(stringJoiner::add);

        return stringJoiner.toString();
    }

    /**
     * @param delimiter Delimiter
     * @param string    String
     *
     * @return Array of Strings
     */
    public static String[] explode(String delimiter, String string)
    {
        return string.split(delimiter);
    }

    /**
     * @param strings Array of Strings
     *
     * @return Imploded Array
     */
    public static String implode(String[] strings)
    {
        return implode(" ", strings);
    }

    /**
     * @param delimiter Delimiter
     * @param strings   Array of Strings
     *
     * @return Imploded Array
     */
    public static String implode(String delimiter, String[] strings)
    {
        StringBuilder builder = new StringBuilder();

        for ( int i = 0; i < strings.length; i++ )
        {
            builder.append(strings[i]);
            if ( i != strings.length - 1 )
            {
                builder.append(delimiter);
            }
        }

        return builder.toString();
    }

    /**
     * @param delimiter Delimiter
     * @param strings   Array of Strings
     *
     * @return Imploded Array
     */
    public static String implode(String delimiter, List<String> strings)
    {
        StringBuilder builder = new StringBuilder();

        for ( int i = 0; i < strings.size(); i++ )
        {
            builder.append(strings.get(i));
            if ( i != strings.size() - 1 )
            {
                builder.append(delimiter);
            }
        }

        return builder.toString();
    }
}
