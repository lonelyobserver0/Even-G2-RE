package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17933a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17934b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17935c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f17936d;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, int i3) {
        this.f17933a = i3;
        this.f17934b = obj;
        this.f17935c = obj2;
        this.f17936d = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f17936d;
        Object obj2 = this.f17935c;
        Object obj3 = this.f17934b;
        switch (this.f17933a) {
            case 0:
                b bVar = (b) obj3;
                q qVar = (q) obj2;
                if (bVar.f17900D == qVar) {
                    qVar.b((BluetoothDevice) obj, -5);
                    bVar.V(true);
                    break;
                }
                break;
            case 1:
                b bVar2 = (b) obj3;
                if (4 >= bVar2.f17911h.a()) {
                    bVar2.f17911h.b(4, StubApp.getString2(26252));
                }
                BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                ((q) obj2).e(bluetoothDevice);
                bVar2.f17900D = null;
                w wVar = bVar2.f17904H;
                if (wVar != null) {
                    wVar.b(bluetoothDevice, -3);
                    bVar2.f17904H = null;
                }
                bVar2.f17912k.clear();
                bVar2.f17913l = null;
                BluetoothGatt bluetoothGatt = bVar2.f17910g;
                if (bVar2.f17920t && bluetoothGatt != null) {
                    bVar2.f17911h.c();
                    bVar2.f17917q = true;
                    bVar2.f17915n = false;
                    if (2 >= bVar2.f17911h.a()) {
                        bVar2.f17911h.b(2, StubApp.getString2(26140));
                    }
                    if (3 >= bVar2.f17911h.a()) {
                        bVar2.f17911h.b(3, StubApp.getString2(26141));
                    }
                    bluetoothGatt.discoverServices();
                    break;
                }
                break;
            default:
                int i3 = BleManagerHandler$4.f17894b;
                b bVar3 = ((BleManagerHandler$4) obj3).f17895a;
                bVar3.I(((BluetoothGatt) obj2).getDevice(), (k) obj);
                if (bVar3.f17910g == null) {
                    bVar3.f17924y = 0;
                    if (4 >= bVar3.f17911h.a()) {
                        bVar3.f17911h.b(4, StubApp.getString2(15157));
                    }
                    bVar3.f17911h.getClass();
                    bVar3.f17911h.getClass();
                    break;
                }
                break;
        }
    }
}
