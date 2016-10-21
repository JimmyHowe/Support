package com.jimmyhowe.support.stores;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jimmy on 21/10/2016.
 */
public class ObjectStoreTest
{
    private ObjectStore store;

    @Before
    public void setUp() throws Exception
    {
        this.store = new ObjectStore();
    }

    @Test
    public void it_can_store_objects() throws Exception
    {
        this.store.put(new Where());
        this.store.put(new Something());
    }
}

class Something {

}

class Where {

}