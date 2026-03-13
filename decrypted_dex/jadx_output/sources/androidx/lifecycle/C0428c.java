package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0428c {

    /* renamed from: a, reason: collision with root package name */
    public final int f9903a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f9904b;

    public C0428c(Method method, int i3) {
        this.f9903a = i3;
        this.f9904b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0428c)) {
            return false;
        }
        C0428c c0428c = (C0428c) obj;
        return this.f9903a == c0428c.f9903a && this.f9904b.getName().equals(c0428c.f9904b.getName());
    }

    public final int hashCode() {
        return this.f9904b.getName().hashCode() + (this.f9903a * 31);
    }
}
