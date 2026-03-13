package A3;

import com.stub.StubApp;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p extends C {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f185a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f186b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f185a = bArr;
        this.f186b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            C c10 = (C) obj;
            boolean z2 = c10 instanceof p;
            if (Arrays.equals(this.f185a, z2 ? ((p) c10).f185a : ((p) c10).f185a)) {
                if (Arrays.equals(this.f186b, z2 ? ((p) c10).f186b : ((p) c10).f186b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f185a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f186b);
    }

    public final String toString() {
        return StubApp.getString2(271) + Arrays.toString(this.f185a) + StubApp.getString2(272) + Arrays.toString(this.f186b) + StubApp.getString2(265);
    }
}
