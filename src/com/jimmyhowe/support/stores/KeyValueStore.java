package com.jimmyhowe.support.stores;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Stores Key Value Pairs
 */
public class KeyValueStore
{
    /**
     * Linked Values
     */
    private Map<String, Object> data = new LinkedHashMap<>();

    /**
     * @param key   Map Key
     * @param value Value
     */
    public void add(String key, Object value)
    {
        this.data.put(key, value);
    }

    /**
     * @param key Map Key
     *
     * @return Value
     */
    public Object get(String key)
    {
        return this.data.get(key);
    }

    /**
     * @param key    Map Key
     * @param format Format String
     *
     * @return
     */
    public String getWithFormat(String key, String format)
    {
        return this.kvFormat(key, this.get(key), format);
    }

    /**
     * @param format Format String
     *
     * @return Returns list of Objects formatted
     */
    public List<String> getAllWithFormat(String format)
    {
        return this.data.entrySet().stream().map(
                entry -> this.getWithFormat(entry.getKey(), format)
        ).collect(Collectors.toList());
    }

    /**
     * @param key    Map Key
     * @param value  Value
     * @param format Format String
     *
     * @return
     */
    private String kvFormat(String key, Object value, String format)
    {
        String formattedString;

        formattedString = format.replace("$k", key);
        formattedString = formattedString.replace("$v", value.toString());

        return formattedString;
    }

    /**
     * @return Returns the Keys
     */
    public ArrayList<String> getKeys()
    {
        return new ArrayList<>(this.data.keySet());
    }

    /**
     * @return Returns the Values
     */
    public ArrayList<Object> getValues()
    {
        return new ArrayList<>(this.data.values());
    }

    public Map<String, Object> getData()
    {
        return data;
    }
}
