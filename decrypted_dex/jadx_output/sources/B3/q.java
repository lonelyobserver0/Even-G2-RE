package B3;

import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l4.C1191k0;
import l4.C1200n0;
import l4.P0;
import sa.C1608a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class q implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f644a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f645b;

    public /* synthetic */ q(Object obj, int i3) {
        this.f644a = i3;
        this.f645b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f644a) {
            case 0:
                ((ExecutorService) this.f645b).execute(new p(runnable, 0));
                break;
            case 1:
                ((c4.h) this.f645b).post(runnable);
                break;
            case 2:
                ((c4.h) this.f645b).post(runnable);
                break;
            case 3:
                C1191k0 c1191k0 = ((C1200n0) ((P0) this.f645b).f4728a).f16542g;
                C1200n0.l(c1191k0);
                c1191k0.t(runnable);
                break;
            case 4:
                ((c4.h) this.f645b).post(runnable);
                break;
            default:
                ((Handler) ((C1608a) this.f645b).f20821b).post(runnable);
                break;
        }
    }

    public q() {
        this.f644a = 4;
        c4.h hVar = new c4.h(Looper.getMainLooper());
        Looper.getMainLooper();
        this.f645b = hVar;
    }

    public q(Looper looper) {
        this.f644a = 2;
        this.f645b = new c4.h(looper, 3);
    }

    public q(P0 p02) {
        this.f644a = 3;
        Objects.requireNonNull(p02);
        this.f645b = p02;
    }
}
