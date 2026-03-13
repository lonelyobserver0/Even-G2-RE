package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.Map;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class O2 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f11323a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N2 f11325c;

    public O2(N2 n22, Comparable comparable, Object obj) {
        Objects.requireNonNull(n22);
        this.f11325c = n22;
        this.f11323a = comparable;
        this.f11324b = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f11323a.compareTo(((O2) obj).f11323a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f11323a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f11324b;
                    Object value = entry.getValue();
                    if (obj2 == null ? value == null : obj2.equals(value)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f11323a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11324b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f11323a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f11324b;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f11325c.f();
        Object obj2 = this.f11324b;
        this.f11324b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f11323a);
        String valueOf2 = String.valueOf(this.f11324b);
        return E1.a.n(new StringBuilder(valueOf.length() + 1 + valueOf2.length()), valueOf, StubApp.getString2(2359), valueOf2);
    }
}
