package l4;

import android.os.SystemClock;
import android.text.TextUtils;
import com.stub.StubApp;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class G0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P0 f16083c;

    public G0(P0 p02, long j, int i3) {
        this.f16081a = i3;
        switch (i3) {
            case 1:
                this.f16082b = j;
                Objects.requireNonNull(p02);
                this.f16083c = p02;
                break;
            default:
                this.f16082b = j;
                Objects.requireNonNull(p02);
                this.f16083c = p02;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16081a) {
            case 0:
                C1200n0 c1200n0 = (C1200n0) this.f16083c.f4728a;
                C1164b0 c1164b0 = c1200n0.f16540e;
                C1200n0.j(c1164b0);
                C1161a0 c1161a0 = c1164b0.f16375l;
                long j = this.f16082b;
                c1161a0.h(j);
                T t3 = c1200n0.f16541f;
                C1200n0.l(t3);
                t3.f16248n.c(Long.valueOf(j), StubApp.getString2(19926));
                break;
            default:
                P0 p02 = this.f16083c;
                p02.k();
                p02.l();
                C1200n0 c1200n02 = (C1200n0) p02.f4728a;
                T t10 = c1200n02.f16541f;
                C1200n0.l(t10);
                t10.f16248n.b(StubApp.getString2(19925));
                q1 q1Var = c1200n02.f16543h;
                C1200n0.k(q1Var);
                q1Var.k();
                L0.U u2 = q1Var.f16595f;
                ((p1) u2.f3996c).c();
                ((C1200n0) ((q1) u2.f3997d).f4728a).f16545l.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                u2.f3994a = elapsedRealtime;
                u2.f3995b = elapsedRealtime;
                c1200n02.q().p();
                boolean z2 = !c1200n02.d();
                C1164b0 c1164b02 = c1200n02.f16540e;
                C1200n0.j(c1164b02);
                c1164b02.f16371f.h(this.f16082b);
                C1200n0 c1200n03 = (C1200n0) c1164b02.f4728a;
                C1164b0 c1164b03 = c1200n03.f16540e;
                C1200n0.j(c1164b03);
                if (!TextUtils.isEmpty(c1164b03.f16386y.k())) {
                    c1164b02.f16386y.l(null);
                }
                c1164b02.f16380r.h(0L);
                c1164b02.f16381s.h(0L);
                if (!c1200n03.f16539d.x()) {
                    c1164b02.t(z2);
                }
                c1164b02.f16387z.l(null);
                c1164b02.f16366A.h(0L);
                c1164b02.f16367B.O(null);
                C1189j1 o5 = c1200n02.o();
                o5.k();
                o5.l();
                M1 A4 = o5.A(false);
                o5.w();
                ((C1200n0) o5.f4728a).n().o();
                o5.y(new RunnableC1174e1(o5, A4, 0));
                C1200n0.k(q1Var);
                q1Var.f16594e.n();
                p02.f16221v = z2;
                c1200n02.o().o(new AtomicReference());
                break;
        }
    }
}
