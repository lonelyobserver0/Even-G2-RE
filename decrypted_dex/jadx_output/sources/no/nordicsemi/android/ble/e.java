package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class e extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f17938b;

    public /* synthetic */ e(b bVar, int i3) {
        this.f17937a = i3;
        this.f17938b = bVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String string2;
        BluetoothGatt bluetoothGatt;
        switch (this.f17937a) {
            case 0:
                int intExtra = intent.getIntExtra(StubApp.getString2(11422), 10);
                int intExtra2 = intent.getIntExtra(StubApp.getString2(26258), 10);
                b bVar = this.f17938b;
                if (3 >= bVar.f17911h.a()) {
                    c cVar = bVar.f17911h;
                    StringBuilder sb2 = new StringBuilder(StubApp.getString2(26259));
                    switch (intExtra) {
                        case 10:
                            string2 = StubApp.getString2(15478);
                            break;
                        case 11:
                            string2 = StubApp.getString2(26261);
                            break;
                        case 12:
                            string2 = StubApp.getString2(21899);
                            break;
                        case 13:
                            string2 = StubApp.getString2(26260);
                            break;
                        default:
                            string2 = Xa.h.g(intExtra, StubApp.getString2(3049), StubApp.getString2(74));
                            break;
                    }
                    sb2.append(string2);
                    cVar.b(3, sb2.toString());
                }
                if (intExtra == 10 || intExtra == 13) {
                    if (intExtra2 != 13 && intExtra2 != 10) {
                        bVar.f17921v = true;
                        bVar.f17912k.clear();
                        bVar.f17913l = null;
                        BluetoothDevice bluetoothDevice = bVar.f17909f;
                        if (bluetoothDevice != null) {
                            q qVar = bVar.f17900D;
                            if (qVar != null && qVar.f17969d != 3) {
                                qVar.b(bluetoothDevice, -100);
                                bVar.f17900D = null;
                            }
                            w wVar = bVar.f17904H;
                            if (wVar != null) {
                                wVar.b(bluetoothDevice, -100);
                                bVar.f17904H = null;
                            }
                            k kVar = bVar.f17899C;
                            if (kVar != null) {
                                kVar.b(bluetoothDevice, -100);
                                bVar.f17899C = null;
                            }
                        }
                        bVar.f17922w = true;
                        bVar.f17921v = false;
                        if (bluetoothDevice != null) {
                            bVar.W(bluetoothDevice);
                        }
                        bVar.f17920t = false;
                        bVar.f17924y = 0;
                        break;
                    } else {
                        bVar.E();
                        break;
                    }
                }
                break;
            default:
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra(StubApp.getString2(1287));
                int intExtra3 = intent.getIntExtra(StubApp.getString2(11418), -1);
                int intExtra4 = intent.getIntExtra(StubApp.getString2(26253), -1);
                b bVar2 = this.f17938b;
                if (bVar2.f17909f != null && bluetoothDevice2 != null && bluetoothDevice2.getAddress().equals(bVar2.f17909f.getAddress())) {
                    bVar2.U(3, new Ja.b(intExtra3, 2));
                    String string22 = StubApp.getString2(26141);
                    String string23 = StubApp.getString2(26254);
                    switch (intExtra3) {
                        case 10:
                            if (intExtra4 != 11) {
                                if (intExtra4 == 12) {
                                    bVar2.f17922w = true;
                                    q qVar2 = bVar2.f17900D;
                                    if (qVar2 != null && qVar2.f17969d == 6) {
                                        if (4 >= bVar2.f17911h.a()) {
                                            bVar2.f17911h.b(4, StubApp.getString2(26257));
                                        }
                                        bVar2.f17900D.e(bluetoothDevice2);
                                        bVar2.f17900D = null;
                                    }
                                    if (!bVar2.f17920t) {
                                        bVar2.E();
                                        break;
                                    }
                                }
                            } else {
                                bVar2.f17911h.getClass();
                                bVar2.f17911h.getClass();
                                if (5 >= bVar2.f17911h.a()) {
                                    bVar2.f17911h.b(5, StubApp.getString2(26256));
                                }
                                q qVar3 = bVar2.f17900D;
                                if (qVar3 != null && qVar3.f17969d == 4) {
                                    qVar3.b(bluetoothDevice2, -4);
                                    bVar2.f17900D = null;
                                }
                                if (!bVar2.f17915n && !bVar2.f17917q) {
                                    BluetoothGatt bluetoothGatt2 = bVar2.f17910g;
                                    if (bluetoothGatt2 != null) {
                                        bVar2.f17917q = true;
                                        if (2 >= bVar2.f17911h.a()) {
                                            bVar2.f17911h.b(2, string23);
                                        }
                                        if (3 >= bVar2.f17911h.a()) {
                                            bVar2.f17911h.b(3, string22);
                                        }
                                        bluetoothGatt2.discoverServices();
                                        break;
                                    }
                                }
                            }
                            break;
                        case 11:
                            bVar2.f17911h.getClass();
                            bVar2.f17911h.getClass();
                            break;
                        case 12:
                            if (4 >= bVar2.f17911h.a()) {
                                bVar2.f17911h.b(4, StubApp.getString2(26255));
                            }
                            bVar2.f17911h.getClass();
                            bVar2.f17911h.getClass();
                            q qVar4 = bVar2.f17900D;
                            if (qVar4 != null && qVar4.f17969d == 4) {
                                qVar4.e(bluetoothDevice2);
                                bVar2.f17900D = null;
                                break;
                            } else if (!bVar2.f17915n && !bVar2.f17917q && (bluetoothGatt = bVar2.f17910g) != null) {
                                bVar2.f17917q = true;
                                if (2 >= bVar2.f17911h.a()) {
                                    bVar2.f17911h.b(2, string23);
                                }
                                if (3 >= bVar2.f17911h.a()) {
                                    bVar2.f17911h.b(3, string22);
                                }
                                bluetoothGatt.discoverServices();
                                break;
                            }
                            break;
                    }
                    bVar2.V(true);
                    break;
                }
                break;
        }
    }
}
