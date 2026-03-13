package Z9;

import com.stub.StubApp;
import java.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class v extends E {

    /* renamed from: b, reason: collision with root package name */
    public int[] f9147b;

    @Override // Z9.E
    public final int a(int i3) {
        int[] iArr = this.f9147b;
        if (i3 < iArr.length) {
            return iArr[i3];
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Xa.h.w(v.class, sb2, StubApp.getString2(8250));
        sb2.append(Arrays.toString(this.f9147b));
        sb2.append(StubApp.getString2(511));
        return sb2.toString();
    }
}
