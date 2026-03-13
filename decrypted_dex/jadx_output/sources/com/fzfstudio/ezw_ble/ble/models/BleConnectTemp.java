package com.fzfstudio.ezw_ble.ble.models;

import E1.a;
import com.stub.StubApp;
import i2.u;
import java.util.Timer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J;\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/BleConnectTemp;", "", "belongConfig", "Lcom/fzfstudio/ezw_ble/ble/models/BleConfig;", "uuid", "", "name", "sn", "afterUpgrade", "", "<init>", "(Lcom/fzfstudio/ezw_ble/ble/models/BleConfig;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getBelongConfig", "()Lcom/fzfstudio/ezw_ble/ble/models/BleConfig;", "getUuid", "()Ljava/lang/String;", "getName", "getSn", "getAfterUpgrade", "()Z", "setAfterUpgrade", "(Z)V", "timeoutTimer", "Ljava/util/Timer;", "getTimeoutTimer", "()Ljava/util/Timer;", "setTimeoutTimer", "(Ljava/util/Timer;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class BleConnectTemp {
    private boolean afterUpgrade;
    private final BleConfig belongConfig;
    private final String name;
    private final String sn;
    private Timer timeoutTimer;
    private final String uuid;

    public BleConnectTemp(BleConfig belongConfig, String uuid, String name, String sn, boolean z2) {
        Intrinsics.checkNotNullParameter(belongConfig, "belongConfig");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sn, "sn");
        this.belongConfig = belongConfig;
        this.uuid = uuid;
        this.name = name;
        this.sn = sn;
        this.afterUpgrade = z2;
    }

    public static /* synthetic */ BleConnectTemp copy$default(BleConnectTemp bleConnectTemp, BleConfig bleConfig, String str, String str2, String str3, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            bleConfig = bleConnectTemp.belongConfig;
        }
        if ((i3 & 2) != 0) {
            str = bleConnectTemp.uuid;
        }
        if ((i3 & 4) != 0) {
            str2 = bleConnectTemp.name;
        }
        if ((i3 & 8) != 0) {
            str3 = bleConnectTemp.sn;
        }
        if ((i3 & 16) != 0) {
            z2 = bleConnectTemp.afterUpgrade;
        }
        boolean z10 = z2;
        String str4 = str2;
        return bleConnectTemp.copy(bleConfig, str, str4, str3, z10);
    }

    /* renamed from: component1, reason: from getter */
    public final BleConfig getBelongConfig() {
        return this.belongConfig;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAfterUpgrade() {
        return this.afterUpgrade;
    }

    public final BleConnectTemp copy(BleConfig belongConfig, String uuid, String name, String sn, boolean afterUpgrade) {
        Intrinsics.checkNotNullParameter(belongConfig, "belongConfig");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(sn, "sn");
        return new BleConnectTemp(belongConfig, uuid, name, sn, afterUpgrade);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BleConnectTemp)) {
            return false;
        }
        BleConnectTemp bleConnectTemp = (BleConnectTemp) other;
        return Intrinsics.areEqual(this.belongConfig, bleConnectTemp.belongConfig) && Intrinsics.areEqual(this.uuid, bleConnectTemp.uuid) && Intrinsics.areEqual(this.name, bleConnectTemp.name) && Intrinsics.areEqual(this.sn, bleConnectTemp.sn) && this.afterUpgrade == bleConnectTemp.afterUpgrade;
    }

    public final boolean getAfterUpgrade() {
        return this.afterUpgrade;
    }

    public final BleConfig getBelongConfig() {
        return this.belongConfig;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSn() {
        return this.sn;
    }

    public final Timer getTimeoutTimer() {
        return this.timeoutTimer;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return Boolean.hashCode(this.afterUpgrade) + u.d(u.d(u.d(this.belongConfig.hashCode() * 31, 31, this.uuid), 31, this.name), 31, this.sn);
    }

    public final void setAfterUpgrade(boolean z2) {
        this.afterUpgrade = z2;
    }

    public final void setTimeoutTimer(Timer timer) {
        this.timeoutTimer = timer;
    }

    public String toString() {
        BleConfig bleConfig = this.belongConfig;
        String str = this.uuid;
        String str2 = this.name;
        String str3 = this.sn;
        boolean z2 = this.afterUpgrade;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(11359));
        sb2.append(bleConfig);
        sb2.append(StubApp.getString2(11360));
        sb2.append(str);
        sb2.append(StubApp.getString2(1065));
        a.v(sb2, str2, StubApp.getString2(11361), str3, StubApp.getString2(11362));
        sb2.append(z2);
        sb2.append(StubApp.getString2(74));
        return sb2.toString();
    }
}
