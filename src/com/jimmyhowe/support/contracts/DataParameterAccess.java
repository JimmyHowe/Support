package com.jimmyhowe.support.contracts;

import java.util.List;

/**
 * Interface for data object access
 *
 * @param <T> Type
 */
public interface DataParameterAccess<T>
{
    /**
     * Returns the Data Object
     */
    @SuppressWarnings("unused")
    default List<T> data()
    {
        return null;
    }

    /**
     * Helper to get data at index
     *
     * @param index Index of value
     */
    @SuppressWarnings("SameParameterValue")
    T data(int index);
}
