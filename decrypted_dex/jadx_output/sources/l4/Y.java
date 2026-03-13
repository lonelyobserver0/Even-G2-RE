package l4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.stub.StubApp;
import i.RunnableC1018B;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class Y extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final F1 f16323a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f16324b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16325c;

    public Y(F1 f12) {
        S3.D.h(f12);
        this.f16323a = f12;
    }

    public final void a() {
        F1 f12 = this.f16323a;
        f12.k0();
        f12.b().k();
        f12.b().k();
        if (this.f16324b) {
            T a3 = f12.a();
            a3.f16249p.b(StubApp.getString2(20319));
            this.f16324b = false;
            this.f16325c = false;
            try {
                f12.f16069m.f16536a.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                T a9 = f12.a();
                a9.f16242f.c(e10, StubApp.getString2(20320));
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        F1 f12 = this.f16323a;
        f12.k0();
        String action = intent.getAction();
        T a3 = f12.a();
        a3.f16249p.c(action, StubApp.getString2(20321));
        if (!StubApp.getString2(1355).equals(action)) {
            T a9 = f12.a();
            a9.j.c(action, StubApp.getString2(20322));
            return;
        }
        W w10 = f12.f16060b;
        F1.S(w10);
        boolean E10 = w10.E();
        if (this.f16325c != E10) {
            this.f16325c = E10;
            f12.b().t(new RunnableC1018B(this, E10));
        }
    }
}
