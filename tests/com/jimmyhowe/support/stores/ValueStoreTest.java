package com.jimmyhowe.support.stores;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Jimmy on 27/09/2016.
 */
public class ValueStoreTest
{
    private ValueStore store;

    @Before
    public void setUp() throws Exception
    {
        this.store = new ValueStore();
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void add() throws Exception
    {
        store.add(1, 2, 3);
    }

    @Test
    public void toCsv() throws Exception
    {
        store.add(1, 2, 3);

        assertEquals("1, 2, 3", store.toCsv());
    }

    @Test
    public void addQuotes() throws Exception
    {
        store.add(1, 2, 3);

        assertEquals("('1', '2', '3')", store.addQuotes().toWrappedInBraces());
    }

    @Test
    public void toWrappedInBraces() throws Exception
    {
        store.add(1, 2, 3);

        assertEquals("(1, 2, 3)", store.toWrappedInBraces());
    }

    @Test
    public void count() throws Exception
    {
        store.add(1, 2, 3);

        assertEquals(3, store.count());
    }
}