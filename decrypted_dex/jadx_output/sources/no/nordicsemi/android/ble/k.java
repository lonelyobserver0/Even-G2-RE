package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import f5.u0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class k extends t {

    /* renamed from: q, reason: collision with root package name */
    public final BluetoothDevice f17953q;

    /* renamed from: r, reason: collision with root package name */
    public final int f17954r;

    /* renamed from: s, reason: collision with root package name */
    public int f17955s;

    /* renamed from: t, reason: collision with root package name */
    public int f17956t;

    /* renamed from: u, reason: collision with root package name */
    public int f17957u;

    public k(BluetoothDevice bluetoothDevice) {
        super(2);
        this.f17955s = 0;
        this.f17956t = 0;
        this.f17957u = 0;
        this.f17953q = bluetoothDevice;
        this.f17954r = 1;
    }

    @Override // no.nordicsemi.android.ble.q
    public final void f(u0 u0Var) {
        g(u0Var);
    }
}
