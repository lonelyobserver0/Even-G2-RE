package com.fzfstudio.ezw_ble.ble.models;

import i2.u;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/BleConnectedDevice;", "Ljava/io/Serializable;", "writeChars", "", "readChars", "isConnected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getWriteChars", "()Ljava/lang/String;", "getReadChars", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class BleConnectedDevice implements Serializable {
    private final boolean isConnected;
    private final String readChars;
    private final String writeChars;

    public BleConnectedDevice(String writeChars, String readChars, boolean z2) {
        Intrinsics.checkNotNullParameter(writeChars, "writeChars");
        Intrinsics.checkNotNullParameter(readChars, "readChars");
        this.writeChars = writeChars;
        this.readChars = readChars;
        this.isConnected = z2;
    }

    public static /* synthetic */ BleConnectedDevice copy$default(BleConnectedDevice bleConnectedDevice, String str, String str2, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = bleConnectedDevice.writeChars;
        }
        if ((i3 & 2) != 0) {
            str2 = bleConnectedDevice.readChars;
        }
        if ((i3 & 4) != 0) {
            z2 = bleConnectedDevice.isConnected;
        }
        return bleConnectedDevice.copy(str, str2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getWriteChars() {
        return this.writeChars;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReadChars() {
        return this.readChars;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    public final BleConnectedDevice copy(String writeChars, String readChars, boolean isConnected) {
        Intrinsics.checkNotNullParameter(writeChars, "writeChars");
        Intrinsics.checkNotNullParameter(readChars, "readChars");
        return new BleConnectedDevice(writeChars, readChars, isConnected);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BleConnectedDevice)) {
            return false;
        }
        BleConnectedDevice bleConnectedDevice = (BleConnectedDevice) other;
        return Intrinsics.areEqual(this.writeChars, bleConnectedDevice.writeChars) && Intrinsics.areEqual(this.readChars, bleConnectedDevice.readChars) && this.isConnected == bleConnectedDevice.isConnected;
    }

    public final String getReadChars() {
        return this.readChars;
    }

    public final String getWriteChars() {
        return this.writeChars;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isConnected) + u.d(this.writeChars.hashCode() * 31, 31, this.readChars);
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public String toString() {
        String str = this.writeChars;
        String str2 = this.readChars;
        boolean z2 = this.isConnected;
        StringBuilder t3 = u.t("BleConnectedDevice(writeChars=", str, ", readChars=", str2, ", isConnected=");
        t3.append(z2);
        t3.append(")");
        return t3.toString();
    }
}
