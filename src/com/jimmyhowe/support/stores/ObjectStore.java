package com.jimmyhowe.support.stores;

import java.util.ArrayList;

/**
 * Stores Objects
 */
public class ObjectStore
{
    protected ArrayList<Object> data = new ArrayList<>();

    public void put(Object object)
    {
        this.data.add(object);
    }

    public boolean isEmpty()
    {
        return data.isEmpty();
    }
}
