package com.jimmyhowe.support.collections;

import com.jimmyhowe.support.contracts.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Generalized Collection
 *
 * @param <T>
 */
public abstract class GeneralisedCollection<T> implements Collection<T>
{
    /**
     * Data in ArrayList
     */
    protected List<T> data = new ArrayList<>();

    /**
     * Adds an item to the collection
     *
     * @param item
     */
    @Override
    public void add(T item)
    {
        this.data.add(item);
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
     * @param i
     */
    @Override
    public T data(int i)
    {
        return this.data.get(i);
    }

    /**
     * Returns the first object
     *
     * @return
     */
    public T first()
    {
        return this.data(0);
    }

    /**
     * Returns the last object
     *
     * @return
     */
    public T last()
    {
        return this.data(this.count() - 1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int count()
    {
        return this.data.size();
    }

    @Override
    public String toString()
    {
        return "GeneralisedCollection{" +
                "data=" + data +
                '}';
    }
}
