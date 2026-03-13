package G1;

import java.util.concurrent.Executor;
import o.C1402a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2369a;

    private final void a(Runnable runnable) {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f2369a) {
            case 0:
                runnable.run();
                break;
            case 1:
                break;
            default:
                C1402a.Y().f18013c.f18015d.execute(runnable);
                break;
        }
    }
}
