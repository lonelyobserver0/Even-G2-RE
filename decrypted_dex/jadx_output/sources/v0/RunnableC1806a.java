package v0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.gms.internal.measurement.K1;
import com.stub.StubApp;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1806a extends BroadcastReceiver implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final SurfaceHolderCallbackC1827w f21686a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f21687b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ K1 f21688c;

    public RunnableC1806a(K1 k12, Handler handler, SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w) {
        this.f21688c = k12;
        this.f21687b = handler;
        this.f21686a = surfaceHolderCallbackC1827w;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (StubApp.getString2(680).equals(intent.getAction())) {
            this.f21687b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f21688c.f11298a) {
            this.f21686a.f21810a.I(-1, 3, false);
        }
    }
}
