package B3;

import com.stub.StubApp;
import java.util.Arrays;
import y3.C1970c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final C1970c f638a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f639b;

    public m(C1970c c1970c, byte[] bArr) {
        if (c1970c == null) {
            throw new NullPointerException(StubApp.getString2(589));
        }
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(588));
        }
        this.f638a = c1970c;
        this.f639b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f638a.equals(mVar.f638a)) {
            return Arrays.equals(this.f639b, mVar.f639b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f638a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f639b);
    }

    public final String toString() {
        return StubApp.getString2(590) + this.f638a + StubApp.getString2(591);
    }
}
