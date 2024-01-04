package org.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class HasExactly {
    public Collection<String> values;
    public String value;


    public void setValue(String value) {
        this.value = value;
    }
    public void setValues(Collection<String> values) {
        this.values = values;
    }

    public String getValue() {
        return value;
    }

    public Collection<String> getValues() {
        return values;
    }


    public boolean hasExactly(Collection<String> values, String value) {
        Iterator<String> iterator = values.iterator();
        return iterator.hasNext() && Objects.equals(iterator.next(), value) && !iterator.hasNext();
    }
}
