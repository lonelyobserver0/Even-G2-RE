package P3;

import java.util.concurrent.Executor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class h implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h f5505b = new h(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h f5506c = new h(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5507a;

    public /* synthetic */ h(int i3) {
        this.f5507a = i3;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f5507a) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
