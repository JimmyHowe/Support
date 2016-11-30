package com.jimmyhowe.support;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by Jimmy on 10/10/2016.
 */
public class StrTest
{
    @Test
    public void camelCaseToWords() throws Exception
    {
        assertEquals("Camel Case", Str.CamelCaseToWords("CamelCase"));
    }

    @Test
    public void camelCaseToLowerCaseWords() throws Exception
    {
        assertEquals("camel case", Str.CamelCaseToLowerCaseWords("CamelCase"));
    }

    @Test
    public void camelCaseToSnakeCase() throws Exception
    {
        assertEquals("camel_case", Str.CamelCaseToSnakeCase("CamelCase"));
    }

    @Test
    public void toCsv() throws Exception
    {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("World");

        assertEquals("Hello, World", Str.toCsv(list));
    }

    @Test
    public void toSpaceSeparated() throws Exception
    {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("World");

        assertEquals("Hello World", Str.toSpaceSeparated(list));
    }

    @Test
    public void explode() throws Exception
    {
        String[] expected = new String[2];

        expected[0] = "Hello";
        expected[1] = "World";

        assertArrayEquals(expected, Str.explode("Hello World", " "));
    }

    @Test
    public void implode() throws Exception
    {
        String expected = "Hello World";

        String[] arrayOfStrings = new String[2];

        arrayOfStrings[0] = "Hello";
        arrayOfStrings[1] = "World";

        assertEquals(expected, Str.implode(arrayOfStrings));
    }

    @Test
    public void implodeWithDelimiter() throws Exception
    {
        String expected = "Hello.World";

        String[] arrayOfStrings = new String[2];

        arrayOfStrings[0] = "Hello";
        arrayOfStrings[1] = "World";

        assertEquals(expected, Str.implode(arrayOfStrings, "."));
    }
}