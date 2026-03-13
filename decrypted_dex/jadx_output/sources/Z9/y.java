package Z9;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class y extends r {

    /* renamed from: g, reason: collision with root package name */
    public int f9152g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f9153h;

    @Override // Z9.AbstractC0368c
    public final int c(int i3) {
        int i10;
        Iterator it = this.f9153h.iterator();
        while (it.hasNext()) {
            B b2 = (B) it.next();
            int i11 = b2.f9073c;
            if (i3 >= i11 && i3 <= (i10 = b2.f9074d)) {
                if (i3 < i11 || i3 > i10) {
                    return 0;
                }
                return (i3 - i11) + b2.f9071a;
            }
        }
        return super.c(i3);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Xa.h.w(y.class, sb2, StubApp.getString2(8247));
        return AbstractC1482f.f(this.f9152g, StubApp.getString2(511), sb2);
    }
}
