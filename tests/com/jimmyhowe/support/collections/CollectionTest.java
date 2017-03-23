package com.jimmyhowe.support.collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNull;

/**
 * Created by Jimmy on 11/03/2017.
 */
public class CollectionTest
{
    private Collection<Integer> integersCollection;

    @Before
    public void setUp() throws Exception
    {
        integersCollection = new Collection<>(1, 2, 3);
    }

    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void it_can_add_an_object() throws Exception
    {
        integersCollection.add(1);

        assertEquals(1, (int) integersCollection.data(0));
    }

    @Test
    public void it_can_add_multiple() throws Exception
    {
        integersCollection.add(1, 2, 3);
    }

    @Test
    public void it_can_get_first_and_last() throws Exception
    {
        assertEquals(1, (int) integersCollection.first());
        assertEquals(3, (int) integersCollection.last());
    }

    @Test
    public void it_can_can_handle_first_exception() throws Exception
    {
        Collection<Integer> collection = new Collection<>();

        assertNull(collection.first());
        assertNotNull(integersCollection.first());
    }

    @Test
    public void it_can_assert_if_value_exists() throws Exception
    {
        assertEquals(true, integersCollection.has(2));
    }

    @Test
    public void it_can_count() throws Exception
    {
        assertEquals(3, integersCollection.count());
    }
}