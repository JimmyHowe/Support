package com.jimmyhowe.support;

import org.junit.Test;

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
}