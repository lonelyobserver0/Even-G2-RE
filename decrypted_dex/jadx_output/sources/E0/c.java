package E0;

import android.os.HandlerThread;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class c implements L4.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1733b;

    public /* synthetic */ c(int i3, int i10) {
        this.f1732a = i10;
        this.f1733b = i3;
    }

    @Override // L4.k
    public final Object get() {
        switch (this.f1732a) {
            case 0:
                return new HandlerThread(d.v(this.f1733b, StubApp.getString2(1587)));
            default:
                return new HandlerThread(d.v(this.f1733b, StubApp.getString2(1586)));
        }
    }
}
