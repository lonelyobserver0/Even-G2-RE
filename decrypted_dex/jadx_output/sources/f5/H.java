package f5;

import com.stub.StubApp;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class H extends s0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13845a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f13846b;

    public H(String str, byte[] bArr) {
        this.f13845a = str;
        this.f13846b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            s0 s0Var = (s0) obj;
            if (this.f13845a.equals(((H) s0Var).f13845a)) {
                if (Arrays.equals(this.f13846b, (s0Var instanceof H ? (H) s0Var : (H) s0Var).f13846b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f13845a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f13846b);
    }

    public final String toString() {
        return StubApp.getString2(17545) + this.f13845a + StubApp.getString2(16207) + Arrays.toString(this.f13846b) + StubApp.getString2(265);
    }
}
