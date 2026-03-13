package com.fzfstudio.ezw_ble.ble.models;

import android.bluetooth.BluetoothGattCharacteristic;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/BleWriteAndRead;", "", "psType", "", "writeChars", "Landroid/bluetooth/BluetoothGattCharacteristic;", "readChars", "<init>", "(Ljava/lang/Integer;Landroid/bluetooth/BluetoothGattCharacteristic;Landroid/bluetooth/BluetoothGattCharacteristic;)V", "getPsType", "()Ljava/lang/Integer;", "setPsType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getWriteChars", "()Landroid/bluetooth/BluetoothGattCharacteristic;", "setWriteChars", "(Landroid/bluetooth/BluetoothGattCharacteristic;)V", "getReadChars", "setReadChars", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class BleWriteAndRead {
    private Integer psType;
    private BluetoothGattCharacteristic readChars;
    private BluetoothGattCharacteristic writeChars;

    public BleWriteAndRead() {
        this(null, null, null, 7, null);
    }

    public final Integer getPsType() {
        return this.psType;
    }

    public final BluetoothGattCharacteristic getReadChars() {
        return this.readChars;
    }

    public final BluetoothGattCharacteristic getWriteChars() {
        return this.writeChars;
    }

    public final void setPsType(Integer num) {
        this.psType = num;
    }

    public final void setReadChars(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.readChars = bluetoothGattCharacteristic;
    }

    public final void setWriteChars(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.writeChars = bluetoothGattCharacteristic;
    }

    public BleWriteAndRead(Integer num, BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothGattCharacteristic bluetoothGattCharacteristic2) {
        this.psType = num;
        this.writeChars = bluetoothGattCharacteristic;
        this.readChars = bluetoothGattCharacteristic2;
    }

    public /* synthetic */ BleWriteAndRead(Integer num, BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothGattCharacteristic bluetoothGattCharacteristic2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? null : num, (i3 & 2) != 0 ? null : bluetoothGattCharacteristic, (i3 & 4) != 0 ? null : bluetoothGattCharacteristic2);
    }
}
