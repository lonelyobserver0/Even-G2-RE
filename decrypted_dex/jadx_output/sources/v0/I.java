package v0;

import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final long f21589a;

    /* renamed from: b, reason: collision with root package name */
    public final float f21590b;

    /* renamed from: c, reason: collision with root package name */
    public final long f21591c;

    public I(C1805H c1805h) {
        this.f21589a = c1805h.f21586a;
        this.f21590b = c1805h.f21587b;
        this.f21591c = c1805h.f21588c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i3 = (I) obj;
        return this.f21589a == i3.f21589a && this.f21590b == i3.f21590b && this.f21591c == i3.f21591c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f21589a), Float.valueOf(this.f21590b), Long.valueOf(this.f21591c)});
    }
}
