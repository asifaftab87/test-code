package org.la.test.code.ps.pck.genr;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Injector {

    private Map<Class<?>, Object> objectGraph = new HashMap<>();

    public Injector with(Object value) {
        objectGraph.put(value.getClass(), value);
        return this;
    }

    public <T> T newInstance(final Class<T> type) {
        return (T) objectGraph.computeIfAbsent(type, this::instantiate);
    }

    private Objects instantiate(Class<?> type) {
    return null;
    }
}
