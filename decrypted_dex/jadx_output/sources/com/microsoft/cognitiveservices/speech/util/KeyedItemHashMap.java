package com.microsoft.cognitiveservices.speech.util;

import com.microsoft.cognitiveservices.speech.util.KeyedItem;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class KeyedItemHashMap<T extends KeyedItem> implements Map<String, T> {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f12744a = new HashMap();

    @Override // java.util.Map
    public void clear() {
        this.f12744a.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f12744a.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f12744a.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, T>> entrySet() {
        return this.f12744a.entrySet();
    }

    @Override // java.util.Map
    public T get(Object obj) {
        return (T) this.f12744a.get(String.valueOf(obj));
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f12744a.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.f12744a.keySet();
    }

    public T put(T t3) {
        return (T) this.f12744a.put(t3.getId(), t3);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends T> map) {
        this.f12744a.putAll(map);
    }

    @Override // java.util.Map
    public T remove(Object obj) {
        return (T) this.f12744a.remove(((KeyedItem) obj).getId());
    }

    @Override // java.util.Map
    public int size() {
        return this.f12744a.size();
    }

    @Override // java.util.Map
    public Collection<T> values() {
        return this.f12744a.values();
    }

    @Override // java.util.Map
    public T put(String str, T t3) {
        return (T) this.f12744a.put(t3.getId(), t3);
    }
}
