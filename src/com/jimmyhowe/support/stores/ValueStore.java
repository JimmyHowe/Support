/*
 * Copyright (c) 2016. JimmyHowe.com
 */

package com.jimmyhowe.support.stores;

import com.jimmyhowe.support.contracts.Cleanable;
import com.jimmyhowe.support.contracts.Countable;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * Values Store
 * <p>
 * Allows to add objects and convert into MySQL VALUES String
 */
public class ValueStore implements Cleanable, Countable
{
    /**
     * Array of Strings
     */
    private List<String> data = new ArrayList<>();

    /**
     * Construct with values
     *
     * @param values
     */
    public ValueStore(Object... values)
    {
        this.add(values);
    }

    /**
     * Construct with List
     *
     * @param strings
     */
    public ValueStore(List<String> strings)
    {
        this.data = strings;
    }

    /**
     * Add Array of Objects
     *
     * @param values
     */
    public ValueStore add(Object... values)
    {
        for ( Object object : values )
        {
            this.data.add(object.toString());
        }

        return this;
    }

    /**
     * Convert String Array to CSV Format
     */
    public String toCsv()
    {
        StringJoiner stringJoiner = new StringJoiner(", ");

        this.data.forEach(stringJoiner::add);

        return stringJoiner.toString();
    }

    public ValueStore addQuotes()
    {
        for ( int i = 0; i < this.data.size(); i++ )
        {
            String value = "'" + data.get(i) + "'";
            this.data.set(i, value);
        }

        return this;
    }

    /**
     * Convert String Array to CSV Format
     */
    public String toWrappedInBraces()
    {
        StringJoiner stringJoiner = new StringJoiner(", ", "(", ")");

        this.data.forEach(stringJoiner::add);

        return stringJoiner.toString();
    }

    /**
     * Clean Up
     */
    public void cleanUp()
    {
        this.data = new ArrayList<>();
    }

    /**
     * Get Object by Index
     *
     * @param i
     */
    public Object get(int i)
    {
        return this.data.get(i);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int count()
    {
        return this.data.size();
    }
}