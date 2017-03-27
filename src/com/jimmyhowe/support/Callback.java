package com.jimmyhowe.support;

/**
 * Created by Jimmy on 23/03/2017.
 */
public interface Callback<T>
{
    T call(Object value);
}
