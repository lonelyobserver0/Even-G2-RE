package H0;

import com.stub.StubApp;
import java.util.Locale;
import q8.AbstractC1526a;
import r0.AbstractC1560u;

/* renamed from: H0.i, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0066i {

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f2572g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2573a;

    /* renamed from: b, reason: collision with root package name */
    public final byte f2574b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2575c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2576d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2577e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f2578f;

    public C0066i(C0065h c0065h) {
        this.f2573a = c0065h.f2566a;
        this.f2574b = c0065h.f2567b;
        this.f2575c = c0065h.f2568c;
        this.f2576d = c0065h.f2569d;
        this.f2577e = c0065h.f2570e;
        this.f2578f = c0065h.f2571f;
    }

    public static int a(int i3) {
        return AbstractC1526a.F(i3 + 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0066i.class == obj.getClass()) {
            C0066i c0066i = (C0066i) obj;
            if (this.f2574b == c0066i.f2574b && this.f2575c == c0066i.f2575c && this.f2573a == c0066i.f2573a && this.f2576d == c0066i.f2576d && this.f2577e == c0066i.f2577e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i3 = (((((527 + this.f2574b) * 31) + this.f2575c) * 31) + (this.f2573a ? 1 : 0)) * 31;
        long j = this.f2576d;
        return ((i3 + ((int) (j ^ (j >>> 32)))) * 31) + this.f2577e;
    }

    public final String toString() {
        Object[] objArr = {Byte.valueOf(this.f2574b), Integer.valueOf(this.f2575c), Long.valueOf(this.f2576d), Integer.valueOf(this.f2577e), Boolean.valueOf(this.f2573a)};
        int i3 = AbstractC1560u.f20190a;
        return String.format(Locale.US, StubApp.getString2(2397), objArr);
    }
}
