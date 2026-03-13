package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.util.Log;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f17964b;

    public /* synthetic */ p(q qVar) {
        this.f17963a = 2;
        this.f17964b = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q qVar = this.f17964b;
        switch (this.f17963a) {
            case 0:
                qVar.getClass();
                break;
            case 1:
                mc.b bVar = qVar.f17971f;
                if (bVar != null) {
                    try {
                        bVar.a();
                        break;
                    } catch (Throwable th) {
                        Log.e(StubApp.getString2(1573), StubApp.getString2(26272), th);
                        return;
                    }
                }
                break;
            default:
                qVar.getClass();
                break;
        }
    }

    public /* synthetic */ p(q qVar, BluetoothDevice bluetoothDevice, int i3) {
        this.f17963a = i3;
        this.f17964b = qVar;
    }
}
