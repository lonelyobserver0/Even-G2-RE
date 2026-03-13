package U9;

import android.os.Handler;
import android.os.HandlerThread;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f7514a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7515b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f7516c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f7517d;

    /* renamed from: e, reason: collision with root package name */
    public Ab.b f7518e;

    /* renamed from: f, reason: collision with root package name */
    public e f7519f;

    public f(String str, int i3) {
        this.f7514a = str;
        this.f7515b = i3;
    }

    public final synchronized void a(Ab.b bVar) {
        HandlerThread handlerThread = new HandlerThread(this.f7514a, this.f7515b);
        this.f7516c = handlerThread;
        handlerThread.start();
        this.f7517d = new Handler(this.f7516c.getLooper());
        this.f7518e = bVar;
    }
}
