package Y;

import f5.u0;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends u0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f8669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f8670f;

    public j(u0 u0Var, ThreadPoolExecutor threadPoolExecutor) {
        this.f8669e = u0Var;
        this.f8670f = threadPoolExecutor;
    }

    @Override // f5.u0
    public final void s(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f8670f;
        try {
            this.f8669e.s(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // f5.u0
    public final void t(p2.h hVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f8670f;
        try {
            this.f8669e.t(hVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
