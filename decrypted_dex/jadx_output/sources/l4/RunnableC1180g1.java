package l4;

import com.stub.StubApp;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: l4.g1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1180g1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16443a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1151G f16444b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC1186i1 f16445c;

    public RunnableC1180g1(ServiceConnectionC1186i1 serviceConnectionC1186i1, InterfaceC1151G interfaceC1151G, int i3) {
        this.f16443a = i3;
        switch (i3) {
            case 1:
                this.f16444b = interfaceC1151G;
                Objects.requireNonNull(serviceConnectionC1186i1);
                this.f16445c = serviceConnectionC1186i1;
                break;
            default:
                this.f16444b = interfaceC1151G;
                this.f16445c = serviceConnectionC1186i1;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16443a) {
            case 0:
                ServiceConnectionC1186i1 serviceConnectionC1186i1 = this.f16445c;
                synchronized (serviceConnectionC1186i1) {
                    try {
                        serviceConnectionC1186i1.f16465a = false;
                        C1189j1 c1189j1 = serviceConnectionC1186i1.f16467c;
                        if (!c1189j1.B()) {
                            T t3 = ((C1200n0) c1189j1.f4728a).f16541f;
                            C1200n0.l(t3);
                            t3.f16249p.b(StubApp.getString2("20445"));
                            InterfaceC1151G interfaceC1151G = this.f16444b;
                            c1189j1.k();
                            c1189j1.f16480d = interfaceC1151G;
                            c1189j1.x();
                            c1189j1.z();
                        }
                    } finally {
                    }
                }
                return;
            default:
                ServiceConnectionC1186i1 serviceConnectionC1186i12 = this.f16445c;
                synchronized (serviceConnectionC1186i12) {
                    try {
                        serviceConnectionC1186i12.f16465a = false;
                        C1189j1 c1189j12 = serviceConnectionC1186i12.f16467c;
                        if (!c1189j12.B()) {
                            T t10 = ((C1200n0) c1189j12.f4728a).f16541f;
                            C1200n0.l(t10);
                            t10.f16248n.b(StubApp.getString2("20444"));
                            InterfaceC1151G interfaceC1151G2 = this.f16444b;
                            c1189j12.k();
                            c1189j12.f16480d = interfaceC1151G2;
                            c1189j12.x();
                            c1189j12.z();
                        }
                    } finally {
                    }
                }
                C1189j1 c1189j13 = this.f16445c.f16467c;
                ScheduledExecutorService scheduledExecutorService = c1189j13.f16483g;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    c1189j13.f16483g = null;
                    return;
                }
                return;
        }
    }
}
