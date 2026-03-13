package R3;

import java.util.Arrays;

/* renamed from: R3.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0233b {

    /* renamed from: a, reason: collision with root package name */
    public final int f6110a;

    /* renamed from: b, reason: collision with root package name */
    public final Q3.d f6111b;

    /* renamed from: c, reason: collision with root package name */
    public final Q3.b f6112c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6113d;

    public C0233b(Q3.d dVar, Q3.b bVar, String str) {
        this.f6111b = dVar;
        this.f6112c = bVar;
        this.f6113d = str;
        this.f6110a = Arrays.hashCode(new Object[]{dVar, bVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0233b)) {
            return false;
        }
        C0233b c0233b = (C0233b) obj;
        return S3.D.k(this.f6111b, c0233b.f6111b) && S3.D.k(this.f6112c, c0233b.f6112c) && S3.D.k(this.f6113d, c0233b.f6113d);
    }

    public final int hashCode() {
        return this.f6110a;
    }
}
