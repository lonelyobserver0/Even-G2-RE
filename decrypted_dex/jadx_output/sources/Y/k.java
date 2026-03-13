package Y;

import android.os.Trace;
import com.google.android.gms.internal.measurement.P1;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ k f8671b = new k(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8672a;

    public /* synthetic */ k(int i3) {
        this.f8672a = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8672a) {
            case 0:
                try {
                    String string2 = StubApp.getString2("7471");
                    int i3 = J.g.f3258a;
                    Trace.beginSection(string2);
                    if (h.f8658k != null) {
                        h.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i10 = J.g.f3258a;
                    Trace.endSection();
                    throw th;
                }
            default:
                P1.f11334i.incrementAndGet();
                return;
        }
    }
}
