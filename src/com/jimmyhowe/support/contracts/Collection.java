package com.jimmyhowe.support.contracts;

import java.util.List;

/**
 * Created by Jimmy on 23/08/2016.
 */
public interface Collection<T> extends Countable
{
    void add(T item);

    List<T> data();

    T data(int i);

    @Override
    int count();
}
