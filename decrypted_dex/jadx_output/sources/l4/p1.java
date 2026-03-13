package l4;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.stub.StubApp;
import java.util.Objects;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p1 extends AbstractC1202o {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f16583e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16584f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(L0.U u2, InterfaceC1216v0 interfaceC1216v0) {
        super(interfaceC1216v0);
        Objects.requireNonNull(u2);
        this.f16584f = u2;
    }

    @Override // l4.AbstractC1202o
    public final void a() {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        switch (this.f16583e) {
            case 0:
                L0.U u2 = (L0.U) this.f16584f;
                q1 q1Var = (q1) u2.f3997d;
                q1Var.k();
                C1200n0 c1200n0 = (C1200n0) q1Var.f4728a;
                c1200n0.f16545l.getClass();
                u2.a(false, false, SystemClock.elapsedRealtime());
                C1219x c1219x = c1200n0.f16548p;
                C1200n0.i(c1219x);
                c1200n0.f16545l.getClass();
                c1219x.n(SystemClock.elapsedRealtime());
                break;
            case 1:
                v1 v1Var = (v1) this.f16584f;
                v1Var.o();
                T t3 = ((C1200n0) v1Var.f4728a).f16541f;
                C1200n0.l(t3);
                t3.f16249p.b(StubApp.getString2(20871));
                v1Var.f16651b.q();
                break;
            default:
                F1 f12 = (F1) this.f16584f;
                f12.b().k();
                String str = (String) f12.f16074s.pollFirst();
                if (str != null) {
                    f12.f().getClass();
                    f12.f16057O = SystemClock.elapsedRealtime();
                    T a3 = f12.a();
                    a3.f16249p.c(str, StubApp.getString2(20870));
                    Intent intent = new Intent();
                    intent.setAction(StubApp.getString2(5201));
                    intent.setPackage(str);
                    Context context = f12.f16069m.f16536a;
                    if (Build.VERSION.SDK_INT < 34) {
                        context.sendBroadcast(intent);
                    } else {
                        makeBasic = BroadcastOptions.makeBasic();
                        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                        bundle = shareIdentityEnabled.toBundle();
                        context.sendBroadcast(intent, null, bundle);
                    }
                }
                f12.F();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(v1 v1Var, InterfaceC1216v0 interfaceC1216v0) {
        super(interfaceC1216v0);
        Objects.requireNonNull(v1Var);
        this.f16584f = v1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(F1 f12, InterfaceC1216v0 interfaceC1216v0) {
        super(interfaceC1216v0);
        Objects.requireNonNull(f12);
        this.f16584f = f12;
    }
}
