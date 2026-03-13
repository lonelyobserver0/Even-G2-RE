package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import f5.u0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class t extends q {

    /* renamed from: o, reason: collision with root package name */
    public com.even.translate.a f17979o;

    /* renamed from: p, reason: collision with root package name */
    public long f17980p;

    @Override // no.nordicsemi.android.ble.q
    public final void b(BluetoothDevice bluetoothDevice, int i3) {
        com.even.translate.a aVar = this.f17979o;
        if (aVar != null) {
            ((b) this.f17967b).j.removeCallbacks(aVar);
            this.f17979o = null;
        }
        super.b(bluetoothDevice, i3);
    }

    @Override // no.nordicsemi.android.ble.q
    public final void c() {
        com.even.translate.a aVar = this.f17979o;
        if (aVar != null) {
            ((b) this.f17967b).j.removeCallbacks(aVar);
            this.f17979o = null;
        }
        super.c();
    }

    @Override // no.nordicsemi.android.ble.q
    public final void d(BluetoothDevice bluetoothDevice) {
        long j = this.f17980p;
        if (j > 0) {
            com.even.translate.a aVar = new com.even.translate.a(16, this, bluetoothDevice);
            this.f17979o = aVar;
            this.f17967b.y(aVar, j);
        }
        super.d(bluetoothDevice);
    }

    @Override // no.nordicsemi.android.ble.q
    public final boolean e(BluetoothDevice bluetoothDevice) {
        com.even.translate.a aVar = this.f17979o;
        if (aVar != null) {
            ((b) this.f17967b).j.removeCallbacks(aVar);
            this.f17979o = null;
        }
        return super.e(bluetoothDevice);
    }

    public final void g(u0 u0Var) {
        super.f(u0Var);
    }
}
