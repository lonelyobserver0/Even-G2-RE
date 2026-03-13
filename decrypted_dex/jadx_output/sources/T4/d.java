package T4;

import java.util.concurrent.Executor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class d implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d f7177b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d f7178c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d f7179d = new d(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7180a;

    public /* synthetic */ d(int i3) {
        this.f7180a = i3;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f7180a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
