package com.jimmyhowe.support.stores;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class KeyValueStoreTest
{
    private KeyValueStore store;

    @Before
    public void setUp() throws Exception
    {
        this.store = new KeyValueStore();

        this.store.add("name", "Jimmy");
        this.store.add("age", 33);
    }

    @Test
    public void it_can_store_a_and_receive_key_value_set() throws Exception
    {
        assertEquals("Jimmy", this.store.get("name"));
        assertEquals(33, this.store.get("age"));
    }

    @Test
    public void it_can_format_key_pair() throws Exception
    {
        assertEquals("name=Jimmy", this.store.getWithFormat("name", "$k=$v"));
    }

    @Test
    public void it_can_get_all_with_format() throws Exception
    {
        List<String> list = this.store.getAllWithFormat("$k=$v");

        assertEquals("name=Jimmy", list.get(0));
        assertEquals("age=33", list.get(1));
    }

    @Test
    public void it_can_get_keys() throws Exception
    {
        List list = this.store.getKeys();

        assertEquals("name", list.get(0));
        assertEquals("age", list.get(1));
    }

    @Test
    public void it_can_get_values() throws Exception
    {
        List list = this.store.getValues();

        assertEquals("Jimmy", list.get(0));
        assertEquals(33, list.get(1));
    }
}