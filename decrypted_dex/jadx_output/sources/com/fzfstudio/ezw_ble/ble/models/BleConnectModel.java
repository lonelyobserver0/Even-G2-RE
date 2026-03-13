package com.fzfstudio.ezw_ble.ble.models;

import com.fzfstudio.ezw_ble.ble.models.enums.BleConnectState;
import com.stub.StubApp;
import i2.u;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o3.AbstractC1457a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\u0011¨\u0006\""}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/BleConnectModel;", "Lo3/a;", "", "uuid", "name", "Lcom/fzfstudio/ezw_ble/ble/models/enums/BleConnectState;", "connectState", "", "mtu", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/fzfstudio/ezw_ble/ble/models/enums/BleConnectState;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/fzfstudio/ezw_ble/ble/models/enums/BleConnectState;", "component4", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/fzfstudio/ezw_ble/ble/models/enums/BleConnectState;I)Lcom/fzfstudio/ezw_ble/ble/models/BleConnectModel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUuid", "getName", "Lcom/fzfstudio/ezw_ble/ble/models/enums/BleConnectState;", "getConnectState", "I", "getMtu", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class BleConnectModel extends AbstractC1457a {
    private final BleConnectState connectState;
    private final int mtu;
    private final String name;
    private final String uuid;

    public /* synthetic */ BleConnectModel(String str, String str2, BleConnectState bleConnectState, int i3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bleConnectState, (i10 & 8) != 0 ? 247 : i3);
    }

    public static /* synthetic */ BleConnectModel copy$default(BleConnectModel bleConnectModel, String str, String str2, BleConnectState bleConnectState, int i3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bleConnectModel.uuid;
        }
        if ((i10 & 2) != 0) {
            str2 = bleConnectModel.name;
        }
        if ((i10 & 4) != 0) {
            bleConnectState = bleConnectModel.connectState;
        }
        if ((i10 & 8) != 0) {
            i3 = bleConnectModel.mtu;
        }
        return bleConnectModel.copy(str, str2, bleConnectState, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final BleConnectState getConnectState() {
        return this.connectState;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMtu() {
        return this.mtu;
    }

    public final BleConnectModel copy(String uuid, String name, BleConnectState connectState, int mtu) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(connectState, "connectState");
        return new BleConnectModel(uuid, name, connectState, mtu);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BleConnectModel)) {
            return false;
        }
        BleConnectModel bleConnectModel = (BleConnectModel) other;
        return Intrinsics.areEqual(this.uuid, bleConnectModel.uuid) && Intrinsics.areEqual(this.name, bleConnectModel.name) && this.connectState == bleConnectModel.connectState && this.mtu == bleConnectModel.mtu;
    }

    public final BleConnectState getConnectState() {
        return this.connectState;
    }

    public final int getMtu() {
        return this.mtu;
    }

    public final String getName() {
        return this.name;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return Integer.hashCode(this.mtu) + ((this.connectState.hashCode() + u.d(this.uuid.hashCode() * 31, 31, this.name)) * 31);
    }

    public String toString() {
        String str = this.uuid;
        String str2 = this.name;
        BleConnectState bleConnectState = this.connectState;
        int i3 = this.mtu;
        StringBuilder t3 = u.t(StubApp.getString2(11357), str, StubApp.getString2(1065), str2, StubApp.getString2(11358));
        t3.append(bleConnectState);
        t3.append(StubApp.getString2(11356));
        t3.append(i3);
        t3.append(StubApp.getString2(74));
        return t3.toString();
    }

    public BleConnectModel(String uuid, String name, BleConnectState connectState, int i3) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(connectState, "connectState");
        this.uuid = uuid;
        this.name = name;
        this.connectState = connectState;
        this.mtu = i3;
    }
}
