package ya;

import com.stub.StubApp;
import java.util.Arrays;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1473f;
import oa.i;
import p0.AbstractC1482f;
import ta.InterfaceC1743c;

/* renamed from: ya.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1980a implements InterfaceC1743c {

    /* renamed from: a, reason: collision with root package name */
    public final int f23631a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f23632b;

    public C1980a(C1468a c1468a, int i3) {
        this.f23632b = c1468a.K();
        this.f23631a = i3;
    }

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        C1468a c1468a = new C1468a();
        C1468a c1468a2 = new C1468a();
        c1468a2.f18393a.clear();
        for (float f10 : this.f23632b) {
            c1468a2.a(new C1473f(f10));
        }
        c1468a.a(c1468a2);
        c1468a.a(i.H(this.f23631a));
        return c1468a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(24744));
        sb2.append(Arrays.toString(this.f23632b));
        sb2.append(StubApp.getString2(24745));
        return AbstractC1482f.f(this.f23631a, StubApp.getString2(265), sb2);
    }
}
