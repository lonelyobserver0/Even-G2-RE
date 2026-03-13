package com.fasterxml.jackson.databind.util;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public interface LookupCache<K, V> {
    V get(Object obj);

    V putIfAbsent(K k3, V v2);
}
