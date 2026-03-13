package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import f4.C0882f;
import java.io.ByteArrayOutputStream;
import nc.C1401a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public wb.d f17981a;

    /* renamed from: b, reason: collision with root package name */
    public C0882f f17982b;

    /* renamed from: c, reason: collision with root package name */
    public C0882f f17983c;

    /* renamed from: d, reason: collision with root package name */
    public b f17984d;

    /* renamed from: e, reason: collision with root package name */
    public int f17985e;

    public final void a(BluetoothDevice bluetoothDevice, byte[] bArr) {
        wb.d dVar = this.f17981a;
        if (dVar == null) {
            return;
        }
        C0882f c0882f = this.f17982b;
        b bVar = this.f17984d;
        if (c0882f == null) {
            bVar.x(new n(dVar, bluetoothDevice, new C1401a(bArr), 1));
            return;
        }
        bVar.x(new B0.o(this, bluetoothDevice, bArr, this.f17985e));
        if (this.f17983c == null) {
            this.f17983c = new C0882f(14);
        }
        C0882f c0882f2 = this.f17982b;
        C0882f c0882f3 = this.f17983c;
        int i3 = this.f17985e;
        this.f17985e = i3 + 1;
        if (c0882f2.i(c0882f3, bArr, i3)) {
            bVar.x(new n(dVar, bluetoothDevice, new C1401a(((ByteArrayOutputStream) this.f17983c.f13748b).toByteArray()), 2));
            this.f17983c = null;
            this.f17985e = 0;
        }
    }
}
