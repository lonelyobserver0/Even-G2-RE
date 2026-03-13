package R3;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.stub.StubApp;
import java.util.concurrent.CancellationException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class x extends I {

    /* renamed from: f, reason: collision with root package name */
    public q4.k f6165f;

    @Override // R3.AbstractC0239h
    public final void e() {
        this.f6165f.c(new CancellationException(StubApp.getString2(5658)));
    }

    @Override // R3.I
    public final void j(com.google.android.gms.common.b bVar, int i3) {
        String str = bVar.f11178d;
        if (str == null) {
            str = StubApp.getString2(5659);
        }
        this.f6165f.a(new Q3.e(new Status(bVar.f11176b, str, bVar.f11177c, bVar)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R3.i, java.lang.Object] */
    @Override // R3.I
    public final void k() {
        Activity c10 = this.f6137a.c();
        if (c10 == null) {
            this.f6165f.c(new Q3.e(new Status(8, null, null, null)));
            return;
        }
        int isGooglePlayServicesAvailable = this.f6105e.isGooglePlayServicesAvailable(c10);
        if (isGooglePlayServicesAvailable == 0) {
            this.f6165f.d(null);
        } else {
            if (this.f6165f.f20051a.isComplete()) {
                return;
            }
            l(new com.google.android.gms.common.b(isGooglePlayServicesAvailable, null), 0);
        }
    }
}
