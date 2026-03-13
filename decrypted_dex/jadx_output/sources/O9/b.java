package O9;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f5292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f5293b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Looper looper, boolean z2) {
        super(looper);
        this.f5293b = cVar;
        this.f5292a = z2;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f5293b.j.success(Boolean.valueOf(this.f5292a));
    }
}
