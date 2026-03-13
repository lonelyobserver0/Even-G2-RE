package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.util.Log;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class g implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17941a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17943c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17944d;

    public /* synthetic */ g(BleManagerHandler$4 bleManagerHandler$4, int i3, BluetoothGatt bluetoothGatt) {
        this.f17943c = bleManagerHandler$4;
        this.f17942b = i3;
        this.f17944d = bluetoothGatt;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f17943c;
        int i3 = this.f17942b;
        Object obj2 = this.f17944d;
        switch (this.f17941a) {
            case 0:
                b bVar = ((BleManagerHandler$4) obj).f17895a;
                if (i3 == bVar.f17919s && bVar.f17920t && !bVar.f17915n && !bVar.f17917q) {
                    BluetoothGatt bluetoothGatt = (BluetoothGatt) obj2;
                    if (bluetoothGatt.getDevice().getBondState() != 11) {
                        bVar.f17917q = true;
                        if (2 >= bVar.f17911h.a()) {
                            bVar.f17911h.b(2, StubApp.getString2(26254));
                        }
                        if (3 >= bVar.f17911h.a()) {
                            bVar.f17911h.b(3, StubApp.getString2(26141));
                        }
                        bluetoothGatt.discoverServices();
                        break;
                    }
                }
                break;
            default:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) obj2;
                mc.a aVar = ((q) obj).f17972g;
                if (aVar != null) {
                    try {
                        aVar.d(bluetoothDevice, i3);
                        break;
                    } catch (Throwable th) {
                        Log.e(StubApp.getString2(1573), StubApp.getString2(26265), th);
                    }
                }
                break;
        }
    }

    public /* synthetic */ g(q qVar, BluetoothDevice bluetoothDevice, int i3) {
        this.f17943c = qVar;
        this.f17944d = bluetoothDevice;
        this.f17942b = i3;
    }
}
