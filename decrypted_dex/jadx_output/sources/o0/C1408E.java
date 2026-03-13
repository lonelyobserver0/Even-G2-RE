package o0;

import com.stub.StubApp;
import java.util.Locale;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: o0.E, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1408E {

    /* renamed from: d, reason: collision with root package name */
    public static final C1408E f18025d = new C1408E(1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f18026a;

    /* renamed from: b, reason: collision with root package name */
    public final float f18027b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18028c;

    static {
        AbstractC1560u.E(0);
        AbstractC1560u.E(1);
    }

    public C1408E(float f10) {
        this(f10, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1408E.class == obj.getClass()) {
            C1408E c1408e = (C1408E) obj;
            if (this.f18026a == c1408e.f18026a && this.f18027b == c1408e.f18027b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f18027b) + ((Float.floatToRawIntBits(this.f18026a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f18026a), Float.valueOf(this.f18027b)};
        int i3 = AbstractC1560u.f20190a;
        return String.format(Locale.US, StubApp.getString2(21521), objArr);
    }

    public C1408E(float f10, float f11) {
        AbstractC1550k.c(f10 > 0.0f);
        AbstractC1550k.c(f11 > 0.0f);
        this.f18026a = f10;
        this.f18027b = f11;
        this.f18028c = Math.round(f10 * 1000.0f);
    }
}
