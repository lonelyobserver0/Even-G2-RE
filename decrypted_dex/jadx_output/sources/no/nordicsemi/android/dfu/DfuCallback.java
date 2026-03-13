package no.nordicsemi.android.dfu;

import android.bluetooth.BluetoothGattCallback;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
interface DfuCallback extends DfuController {

    public static class DfuGattCallback extends BluetoothGattCallback {
        public void onDisconnected(int i3) {
        }
    }

    DfuGattCallback getGattCallback();

    void onBondStateChanged(int i3);
}
