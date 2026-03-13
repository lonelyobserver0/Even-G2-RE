package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class JDKValueInstantiators {

    public static class ArrayListInstantiator extends ValueInstantiator.Base implements Serializable {
        public static final ArrayListInstantiator INSTANCE = new ArrayListInstantiator();

        public ArrayListInstantiator() {
            super((Class<?>) ArrayList.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean canCreateUsingDefault() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean canInstantiate() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new ArrayList();
        }
    }

    public static class ConstantValueInstantiator extends ValueInstantiator.Base implements Serializable {
        protected final Object _value;

        public ConstantValueInstantiator(Object obj) {
            super(obj.getClass());
            this._value = obj;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean canCreateUsingDefault() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean canInstantiate() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return this._value;
        }
    }

    public static class HashMapInstantiator extends ValueInstantiator.Base implements Serializable {
        public static final HashMapInstantiator INSTANCE = new HashMapInstantiator();

        public HashMapInstantiator() {
            super((Class<?>) HashMap.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean canCreateUsingDefault() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean canInstantiate() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new HashMap();
        }
    }

    public static class LinkedHashMapInstantiator extends ValueInstantiator.Base implements Serializable {
        public static final LinkedHashMapInstantiator INSTANCE = new LinkedHashMapInstantiator();

        public LinkedHashMapInstantiator() {
            super((Class<?>) LinkedHashMap.class);
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean canCreateUsingDefault() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public boolean canInstantiate() {
            return true;
        }

        @Override // com.fasterxml.jackson.databind.deser.ValueInstantiator
        public Object createUsingDefault(DeserializationContext deserializationContext) throws IOException {
            return new LinkedHashMap();
        }
    }

    public static ValueInstantiator findStdValueInstantiator(DeserializationConfig deserializationConfig, Class<?> cls) {
        if (cls == JsonLocation.class) {
            return new JsonLocationInstantiator();
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls == ArrayList.class) {
                return ArrayListInstantiator.INSTANCE;
            }
            Set set = Collections.EMPTY_SET;
            if (set.getClass() == cls) {
                return new ConstantValueInstantiator(set);
            }
            List list = Collections.EMPTY_LIST;
            if (list.getClass() == cls) {
                return new ConstantValueInstantiator(list);
            }
            return null;
        }
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (cls == LinkedHashMap.class) {
            return LinkedHashMapInstantiator.INSTANCE;
        }
        if (cls == HashMap.class) {
            return HashMapInstantiator.INSTANCE;
        }
        Map map = Collections.EMPTY_MAP;
        if (map.getClass() == cls) {
            return new ConstantValueInstantiator(map);
        }
        return null;
    }
}
