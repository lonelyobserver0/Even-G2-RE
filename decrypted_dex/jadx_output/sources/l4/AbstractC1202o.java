package l4;

import android.os.Handler;
import com.stub.StubApp;

/* renamed from: l4.o, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1202o {

    /* renamed from: d, reason: collision with root package name */
    public static volatile c4.h f16561d;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1216v0 f16562a;

    /* renamed from: b, reason: collision with root package name */
    public final Q4.b f16563b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f16564c;

    public AbstractC1202o(InterfaceC1216v0 interfaceC1216v0) {
        S3.D.h(interfaceC1216v0);
        this.f16562a = interfaceC1216v0;
        this.f16563b = new Q4.b(this, interfaceC1216v0);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            InterfaceC1216v0 interfaceC1216v0 = this.f16562a;
            interfaceC1216v0.f().getClass();
            this.f16564c = System.currentTimeMillis();
            if (d().postDelayed(this.f16563b, j)) {
                return;
            }
            interfaceC1216v0.a().f16242f.c(Long.valueOf(j), StubApp.getString2(20869));
        }
    }

    public final void c() {
        this.f16564c = 0L;
        d().removeCallbacks(this.f16563b);
    }

    public final Handler d() {
        c4.h hVar;
        if (f16561d != null) {
            return f16561d;
        }
        synchronized (AbstractC1202o.class) {
            try {
                if (f16561d == null) {
                    f16561d = new c4.h(this.f16562a.e().getMainLooper(), 1);
                }
                hVar = f16561d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }
}
