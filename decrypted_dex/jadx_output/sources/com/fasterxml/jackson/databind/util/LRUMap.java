package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap;
import java.io.Serializable;
import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class LRUMap<K, V> implements LookupCache<K, V>, Serializable {
    protected final int _initialEntries;
    protected final transient PrivateMaxEntriesMap<K, V> _map;
    protected final int _maxEntries;

    public LRUMap(int i3, int i10) {
        this._initialEntries = i3;
        this._maxEntries = i10;
        this._map = new PrivateMaxEntriesMap.Builder().initialCapacity(i3).maximumCapacity(i10).concurrencyLevel(4).build();
    }

    public void contents(BiConsumer<K, V> biConsumer) {
        for (Map.Entry<K, V> entry : this._map.entrySet()) {
            biConsumer.accept(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.fasterxml.jackson.databind.util.LookupCache
    public V get(Object obj) {
        return this._map.get(obj);
    }

    public V put(K k3, V v2) {
        return this._map.put(k3, v2);
    }

    @Override // com.fasterxml.jackson.databind.util.LookupCache
    public V putIfAbsent(K k3, V v2) {
        return this._map.putIfAbsent(k3, v2);
    }

    public int size() {
        return this._map.size();
    }
}
