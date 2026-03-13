package com.mapbox.bindgen;

import java.util.HashMap;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class HashMapKeyValueExtractor {
    private final Object[] keys;
    private final Object[] values;

    public HashMapKeyValueExtractor(HashMap<Object, Object> hashMap) {
        Set<Object> keySet = hashMap.keySet();
        int size = keySet.size();
        this.keys = new Object[size];
        this.values = new Object[size];
        int i3 = 0;
        for (Object obj : keySet) {
            this.keys[i3] = obj;
            this.values[i3] = hashMap.get(obj);
            i3++;
        }
    }

    public Object[] getKeys() {
        return this.keys;
    }

    public Object[] getValues() {
        return this.values;
    }
}
