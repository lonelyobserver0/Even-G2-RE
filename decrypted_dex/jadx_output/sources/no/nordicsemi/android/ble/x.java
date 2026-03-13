package no.nordicsemi.android.ble;

import android.util.Log;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17995a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f17996b;

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.f17996b;
        switch (this.f17995a) {
            case 0:
                yVar.getClass();
                break;
            default:
                if (yVar.f17978o != null) {
                    try {
                        throw new ClassCastException();
                    } catch (Throwable th) {
                        Log.e(StubApp.getString2(1573), StubApp.getString2(1574), th);
                    }
                }
                break;
        }
    }
}
