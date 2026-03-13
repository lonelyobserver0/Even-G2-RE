package com.fzfstudio.ezw_ble.ble.models;

import com.stub.StubApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o3.AbstractC1457a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/BleMatchDevice;", "Lo3/a;", "", "sn", "", "Lcom/fzfstudio/ezw_ble/ble/models/BleDevice;", "devices", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/fzfstudio/ezw_ble/ble/models/BleMatchDevice;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSn", "Ljava/util/List;", "getDevices", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class BleMatchDevice extends AbstractC1457a {
    private final List<BleDevice> devices;
    private final String sn;

    public BleMatchDevice(String sn, List<BleDevice> devices) {
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(devices, "devices");
        this.sn = sn;
        this.devices = devices;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleMatchDevice copy$default(BleMatchDevice bleMatchDevice, String str, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = bleMatchDevice.sn;
        }
        if ((i3 & 2) != 0) {
            list = bleMatchDevice.devices;
        }
        return bleMatchDevice.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    public final List<BleDevice> component2() {
        return this.devices;
    }

    public final BleMatchDevice copy(String sn, List<BleDevice> devices) {
        Intrinsics.checkNotNullParameter(sn, "sn");
        Intrinsics.checkNotNullParameter(devices, "devices");
        return new BleMatchDevice(sn, devices);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BleMatchDevice)) {
            return false;
        }
        BleMatchDevice bleMatchDevice = (BleMatchDevice) other;
        return Intrinsics.areEqual(this.sn, bleMatchDevice.sn) && Intrinsics.areEqual(this.devices, bleMatchDevice.devices);
    }

    public final List<BleDevice> getDevices() {
        return this.devices;
    }

    public final String getSn() {
        return this.sn;
    }

    public int hashCode() {
        return this.devices.hashCode() + (this.sn.hashCode() * 31);
    }

    public String toString() {
        return StubApp.getString2(11368) + this.sn + StubApp.getString2(11369) + this.devices + StubApp.getString2(74);
    }
}
