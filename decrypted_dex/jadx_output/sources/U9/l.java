package U9;

import io.flutter.plugin.common.MethodChannel;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f7542a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MethodChannel.Result f7543b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f7544c;

    public l(n nVar, d dVar, MethodChannel.Result result) {
        this.f7544c = nVar;
        this.f7542a = dVar;
        this.f7543b = result;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (n.f7552f) {
            n.a(this.f7544c, this.f7542a);
        }
        this.f7543b.success(null);
    }
}
