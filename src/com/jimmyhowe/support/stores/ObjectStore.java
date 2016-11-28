package com.jimmyhowe.support.stores;

import com.jimmyhowe.support.contracts.Countable;

import java.util.ArrayList;

/**
 * Stores Objects
 */
public class ObjectStore implements Countable
{
    protected ArrayList<Object> data = new ArrayList<>();

    public ArrayList<Object> data()
    {
        return data;
    }

    public Object data(int i)
    {
        return data().get(i);
    }

    public void put(Object object)
    {
        this.data.add(object);
    }

    public boolean isEmpty()
    {
        return data.isEmpty();
    }

    /**
     * Returns the count
     */
    @Override
    public int count()
    {
        return this.data.size();
    }
}
