package com.google.android.gms.internal.measurement;

import com.stub.StubApp;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0591b {

    /* renamed from: d, reason: collision with root package name */
    public static final M4.M f11446d = M4.M.l(3, StubApp.getString2(11890), StubApp.getString2(11891), StubApp.getString2(11892));

    /* renamed from: a, reason: collision with root package name */
    public String f11447a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11448b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f11449c;

    public C0591b(String str, long j, HashMap hashMap) {
        this.f11447a = str;
        this.f11448b = j;
        HashMap hashMap2 = new HashMap();
        this.f11449c = hashMap2;
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
    }

    public static Object b(String str, Object obj, Object obj2) {
        if (f11446d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith(StubApp.getString2(4956))) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0591b clone() {
        return new C0591b(this.f11447a, this.f11448b, new HashMap(this.f11449c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0591b)) {
            return false;
        }
        C0591b c0591b = (C0591b) obj;
        if (this.f11448b == c0591b.f11448b && this.f11447a.equals(c0591b.f11447a)) {
            return this.f11449c.equals(c0591b.f11449c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f11447a.hashCode() * 31;
        HashMap hashMap = this.f11449c;
        long j = this.f11448b;
        return hashMap.hashCode() + ((hashCode + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        String str = this.f11447a;
        String obj = this.f11449c.toString();
        int length = String.valueOf(str).length();
        long j = this.f11448b;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j).length() + 9 + obj.length() + 1);
        sb2.append(StubApp.getString2(11893));
        sb2.append(str);
        sb2.append(StubApp.getString2(11894));
        sb2.append(j);
        sb2.append(StubApp.getString2(11895));
        sb2.append(obj);
        sb2.append(StubApp.getString2(265));
        return sb2.toString();
    }
}
