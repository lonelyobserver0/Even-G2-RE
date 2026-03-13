package Za;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9178a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9179b;

    public g() {
        this.f9178a = 1;
        this.f9179b = Handler.createAsync(Looper.getMainLooper());
    }

    @Override // Za.h
    public final void a(e eVar) {
        switch (this.f9178a) {
            case 0:
                ((ExecutorService) this.f9179b).execute(eVar);
                break;
            default:
                ((Handler) this.f9179b).post(eVar);
                break;
        }
    }

    public g(ExecutorService executorService) {
        this.f9178a = 0;
        this.f9179b = executorService;
    }
}
