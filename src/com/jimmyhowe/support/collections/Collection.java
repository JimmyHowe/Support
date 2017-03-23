package com.jimmyhowe.support.collections;

import com.jimmyhowe.support.contracts.Countable;
import com.jimmyhowe.support.contracts.DataParameterAccess;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collection
 */
@SuppressWarnings("ALL")
public class Collection<T> implements DataParameterAccess, Countable
{
    /**
     * Collection Objects
     */
    private List<T> data = new ArrayList<>();

    /**
     * @param values Array of values
     */
    @SafeVarargs
    public Collection(T... values)
    {
        this.add(values);
    }

    /**
     * Adds to the collection
     *
     * @param value Single value
     */
    public void add(T value)
    {
        this.data.add(value);
    }

    /**
     * Adds multiple values to the collection
     *
     * @param values Array of values
     */
    @SafeVarargs
    public final void add(T... values)
    {
        Collections.addAll(this.data, values);
    }

    /**
     * Returns first element in collection
     *
     * @return First value in collection
     */
    public T first()
    {
        return data.size() != 0 ? data.get(0) : null;
    }

    /**
     * @return Last value in collection
     */
    public T last()
    {
        return data.get(data.size() - 1);
    }

    /**
     * @param value Value
     *
     * @return True or False if collection has value
     */
    public boolean has(T value)
    {
        if(data.contains(value)) return true;

        return false;
    }

    /**
     * Returns the count
     */
    @Override
    public int count()
    {
        return data.size();
    }

    /**
     * Returns the Data Object
     */
    @Override
    public List<T> data()
    {
        return data;
    }

    /**
     * Helper to get data at index
     *
     * @param index
     */
    @Override
    public T data(int index)
    {
        return data.get(index);
    }
}
