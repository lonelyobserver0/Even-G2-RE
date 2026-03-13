package y0;

import L0.V;
import L0.Y;
import T0.G;
import T0.H;
import android.os.Handler;
import c1.C0548a;
import com.stub.StubApp;
import e1.C0836a;
import o0.C1404A;
import o0.C1406C;
import o0.C1438m;
import o0.InterfaceC1432g;
import r0.AbstractC1560u;
import r0.C1553n;
import v0.C1803F;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l implements H {

    /* renamed from: a, reason: collision with root package name */
    public final Y f23429a;

    /* renamed from: b, reason: collision with root package name */
    public final C1803F f23430b = new C1803F();

    /* renamed from: c, reason: collision with root package name */
    public final C0548a f23431c = new C0548a(1);

    /* renamed from: d, reason: collision with root package name */
    public long f23432d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f23433e;

    public l(m mVar, P0.e eVar) {
        this.f23433e = mVar;
        this.f23429a = new Y(eVar, null, null);
    }

    @Override // T0.H
    public final void a(C1553n c1553n, int i3, int i10) {
        this.f23429a.a(c1553n, i3, 0);
    }

    @Override // T0.H
    public final int b(InterfaceC1432g interfaceC1432g, int i3, boolean z2) {
        return this.f23429a.b(interfaceC1432g, i3, z2);
    }

    @Override // T0.H
    public final void c(long j, int i3, int i10, int i11, G g10) {
        long e10;
        long j3;
        this.f23429a.c(j, i3, i10, i11, g10);
        while (this.f23429a.r(false)) {
            C0548a c0548a = this.f23431c;
            c0548a.s();
            if (this.f23429a.w(this.f23430b, c0548a, 0, false) == -4) {
                c0548a.v();
            } else {
                c0548a = null;
            }
            if (c0548a != null) {
                long j10 = c0548a.f21398g;
                C1404A h2 = this.f23433e.f23436c.h(c0548a);
                if (h2 != null) {
                    C0836a c0836a = (C0836a) h2.f18017a[0];
                    String str = c0836a.f13574a;
                    String str2 = c0836a.f13575b;
                    if (StubApp.getString2(24580).equals(str) && (StubApp.getString2(878).equals(str2) || StubApp.getString2(4967).equals(str2) || StubApp.getString2(4968).equals(str2))) {
                        try {
                            j3 = AbstractC1560u.M(AbstractC1560u.n(c0836a.f13578e));
                        } catch (C1406C unused) {
                            j3 = -9223372036854775807L;
                        }
                        if (j3 != -9223372036854775807L) {
                            k kVar = new k(j10, j3);
                            Handler handler = this.f23433e.f23437d;
                            handler.sendMessage(handler.obtainMessage(1, kVar));
                        }
                    }
                }
            }
        }
        Y y10 = this.f23429a;
        V v2 = y10.f4014a;
        synchronized (y10) {
            int i12 = y10.f4031s;
            e10 = i12 == 0 ? -1L : y10.e(i12);
        }
        v2.b(e10);
    }

    @Override // T0.H
    public final void d(C1438m c1438m) {
        this.f23429a.d(c1438m);
    }
}
