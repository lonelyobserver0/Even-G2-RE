package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class a implements mc.b, mc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f17896a;

    @Override // mc.b
    public void a() {
        this.f17896a.f17990s = 0;
    }

    @Override // mc.a
    public void d(BluetoothDevice bluetoothDevice, int i3) {
        w wVar = this.f17896a;
        wVar.f17990s = i3;
        wVar.f17968c.open();
        wVar.b(bluetoothDevice, i3);
    }
}
