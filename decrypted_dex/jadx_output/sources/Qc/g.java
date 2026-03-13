package Qc;

import java.util.TimeZone;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final Pc.b f5917a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5918b;

    public g(int i3, Pc.b bVar) {
        this.f5917a = bVar;
        bVar.ordinal();
        this.f5918b = i3;
    }

    public int a(int i3, int i10) {
        return ((b(i3) + i10) - 1) % 7;
    }

    public abstract int b(int i3);

    public abstract long c(long j, TimeZone timeZone);

    public abstract long d(TimeZone timeZone, int i3, int i10, int i11, int i12, int i13, int i14);

    public final boolean equals(Object obj) {
        if (!(obj instanceof g) || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f5918b == gVar.f5918b && this.f5917a == gVar.f5917a;
    }

    public final int hashCode() {
        return getClass().hashCode();
    }
}
