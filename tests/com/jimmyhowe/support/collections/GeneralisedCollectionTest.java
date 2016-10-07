package com.jimmyhowe.support.collections;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jimmy on 09/09/2016.
 */
public class GeneralisedCollectionTest
{
    private TestCollection testCollection;

    private class TestCollection extends GeneralisedCollection<Integer>
    {

    }

    @Before
    public void setUp() throws Exception
    {
        testCollection = new TestCollection();

        testCollection.add(123);
        testCollection.add(456);
        testCollection.add(789);
    }

    @Test
    public void add() throws Exception
    {
        testCollection.add(123);

        assertTrue(testCollection.data().get(0).equals(123));
        assertTrue(testCollection.data().get(1).equals(456));
        assertTrue(testCollection.data().get(2).equals(789));
        assertTrue(testCollection.data().get(3).equals(123));
    }

    @Test
    public void data() throws Exception
    {
        assertEquals(123, (int) testCollection.data().get(0));
    }

    @Test
    public void data_with_key() throws Exception
    {
        assertEquals(123, (int) testCollection.data(0));
    }

    @Test
    public void count() throws Exception
    {
        assertEquals(3, testCollection.count());
    }
}