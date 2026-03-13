package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothDevice;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DfuDefaultDeviceSelector implements DfuDeviceSelector {
    @Override // no.nordicsemi.android.dfu.DfuDeviceSelector
    public boolean matches(BluetoothDevice bluetoothDevice, int i3, byte[] bArr, String str, String str2) {
        return str.equals(bluetoothDevice.getAddress()) || str2.equals(bluetoothDevice.getAddress());
    }
}
