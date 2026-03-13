package com.fzfstudio.ezw_ble.ble.extension;

import android.bluetooth.BluetoothDevice;
import com.fzfstudio.ezw_ble.ble.models.BleConfig;
import com.fzfstudio.ezw_ble.ble.models.BleDevice;
import com.fzfstudio.ezw_ble.ble.models.enums.BleConnectState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"toBleDevice", "Lcom/fzfstudio/ezw_ble/ble/models/BleDevice;", "Landroid/bluetooth/BluetoothDevice;", "belongConfig", "Lcom/fzfstudio/ezw_ble/ble/models/BleConfig;", "sn", "", "rssi", "", "flutter_ezw_ble_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BluetoothDeviceExtKt {
    public static final BleDevice toBleDevice(BluetoothDevice bluetoothDevice, BleConfig belongConfig, String sn, int i3) {
        Intrinsics.checkNotNullParameter(bluetoothDevice, "<this>");
        Intrinsics.checkNotNullParameter(belongConfig, "belongConfig");
        Intrinsics.checkNotNullParameter(sn, "sn");
        String name = bluetoothDevice.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String address = bluetoothDevice.getAddress();
        Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
        return new BleDevice(belongConfig, name, address, sn, i3, BleConnectState.NONE);
    }
}
