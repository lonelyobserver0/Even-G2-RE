package r0;

import aa.C0398e;

/* renamed from: r0.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1548i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20152a;

    /* renamed from: b, reason: collision with root package name */
    public C0398e f20153b = new C0398e(10, false);

    /* renamed from: c, reason: collision with root package name */
    public boolean f20154c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20155d;

    public C1548i(Object obj) {
        this.f20152a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1548i.class != obj.getClass()) {
            return false;
        }
        return this.f20152a.equals(((C1548i) obj).f20152a);
    }

    public final int hashCode() {
        return this.f20152a.hashCode();
    }
}
