package l4;

import android.util.Log;
import com.stub.StubApp;

/* renamed from: l4.d0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1170d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16406a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final C1200n0 f16407b;

    public C1170d0(F1 f12) {
        this.f16407b = f12.f16069m;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean a() {
        switch (this.f16406a) {
            case 0:
                C1200n0 c1200n0 = this.f16407b;
                boolean z2 = false;
                try {
                    Y3.b a3 = Y3.c.a(c1200n0.f16536a);
                    if (a3 == null) {
                        T t3 = c1200n0.f16541f;
                        C1200n0.l(t3);
                        t3.f16249p.b(StubApp.getString2("20399"));
                        c1200n0 = c1200n0;
                    } else {
                        int i3 = a3.b(128, StubApp.getString2("3519")).versionCode;
                        c1200n0 = i3;
                        if (i3 >= 80837300) {
                            z2 = true;
                            c1200n0 = i3;
                        }
                    }
                } catch (Exception e10) {
                    T t10 = c1200n0.f16541f;
                    C1200n0.l(t10);
                    t10.f16249p.c(e10, StubApp.getString2(20400));
                }
                return z2;
            default:
                T t11 = this.f16407b.f16541f;
                C1200n0.l(t11);
                return Log.isLoggable(t11.u(), 3);
        }
    }

    public C1170d0(bb.d dVar, C1200n0 c1200n0) {
        this.f16407b = c1200n0;
    }
}
