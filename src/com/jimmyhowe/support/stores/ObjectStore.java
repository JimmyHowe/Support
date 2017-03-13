package com.jimmyhowe.support.stores;

import com.jimmyhowe.support.contracts.Countable;
import com.jimmyhowe.support.contracts.DataParameterAccess;

import java.util.ArrayList;
import java.util.List;

/**
 * Stores Objects
 */
public class ObjectStore implements DataParameterAccess, Countable
{
    /**
     * Data
     */
    private List<Object> data = new ArrayList<>();

    /**
     * @param object
     */
    public void put(Object object)
    {
        this.data.add(object);
    }

    /**
     * Returns the Data Object
     */
    @Override
    public List data()
    {
        return data;
    }

    /**
     * Helper to get data at index
     *
     * @param index Index of value
     */
    @Override
    public Object data(int index)
    {
        return data.get(index);
    }

    /**
     * Returns the count
     */
    @Override
    public int count()
    {
        return this.data.size();
    }

    /**
     * @return True or False if empty
     */
    public boolean isEmpty()
    {
        return data.isEmpty();
    }
}
