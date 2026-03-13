package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.util.Log;
import com.stub.StubApp;
import nc.C1401a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wb.d f17960b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1401a f17961c;

    public /* synthetic */ n(wb.d dVar, BluetoothDevice bluetoothDevice, C1401a c1401a, int i3) {
        this.f17959a = i3;
        this.f17960b = dVar;
        this.f17961c = c1401a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string2 = StubApp.getString2(2371);
        String string22 = StubApp.getString2(1573);
        String string23 = StubApp.getString2(1574);
        C1401a c1401a = this.f17961c;
        wb.d dVar = this.f17960b;
        switch (this.f17959a) {
            case 0:
                try {
                    dVar.a(c1401a);
                    break;
                } catch (Throwable th) {
                    Log.e(string22, string23, th);
                    return;
                }
            case 1:
                try {
                    dVar.a(c1401a);
                    break;
                } catch (Throwable th2) {
                    Log.e(string2, string23, th2);
                    return;
                }
            case 2:
                try {
                    dVar.a(c1401a);
                    break;
                } catch (Throwable th3) {
                    Log.e(string2, string23, th3);
                    return;
                }
            case 3:
                try {
                    dVar.a(c1401a);
                    break;
                } catch (Throwable th4) {
                    Log.e(string22, string23, th4);
                    return;
                }
            default:
                try {
                    dVar.a(c1401a);
                    break;
                } catch (Throwable th5) {
                    Log.e(string22, string23, th5);
                }
        }
    }
}
