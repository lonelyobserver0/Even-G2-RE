package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class X implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f9753a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W f9755c;

    public X(W w10, Comparable comparable, Object obj) {
        this.f9755c = w10;
        this.f9753a = comparable;
        this.f9754b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f9753a.compareTo(((X) obj).f9753a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f9753a;
                if (comparable == null ? key == null : comparable.equals(key)) {
                    Object obj2 = this.f9754b;
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
    public final Object getKey() {
        return this.f9753a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f9754b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f9753a;
        int hashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f9754b;
        return (obj != null ? obj.hashCode() : 0) ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f9755c.b();
        Object obj2 = this.f9754b;
        this.f9754b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f9753a + "=" + this.f9754b;
    }
}
