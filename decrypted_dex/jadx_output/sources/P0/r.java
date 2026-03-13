package P0;

import L0.C0123t;
import android.net.Uri;
import com.stub.StubApp;
import java.util.Collections;
import java.util.Map;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import t0.C1710j;
import t0.C1711k;
import t0.C1725y;
import t0.InterfaceC1708h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final long f5435a;

    /* renamed from: b, reason: collision with root package name */
    public final C1711k f5436b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5437c;

    /* renamed from: d, reason: collision with root package name */
    public final C1725y f5438d;

    /* renamed from: e, reason: collision with root package name */
    public final q f5439e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f5440f;

    public r(InterfaceC1708h interfaceC1708h, Uri uri, int i3, q qVar) {
        Map map = Collections.EMPTY_MAP;
        AbstractC1550k.i(uri, StubApp.getString2(505));
        C1711k c1711k = new C1711k(uri, 1, null, map, 0L, -1L, null, 1);
        this.f5438d = new C1725y(interfaceC1708h);
        this.f5436b = c1711k;
        this.f5437c = i3;
        this.f5439e = qVar;
        this.f5435a = C0123t.f4129c.getAndIncrement();
    }

    @Override // P0.l
    public final void l() {
        this.f5438d.f21124b = 0L;
        C1710j c1710j = new C1710j(this.f5438d, this.f5436b);
        try {
            c1710j.f21071a.n(c1710j.f21072b);
            c1710j.f21074d = true;
            Uri z2 = this.f5438d.f21123a.z();
            z2.getClass();
            this.f5440f = this.f5439e.d(z2, c1710j);
        } finally {
            AbstractC1560u.g(c1710j);
        }
    }

    @Override // P0.l
    public final void o() {
    }
}
