package com.fzfstudio.ezw_ble.ble.models;

import E1.a;
import com.stub.StubApp;
import i2.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o3.AbstractC1457a;
import p0.AbstractC1482f;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u0000 52\u00020\u0001:\u00015BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\\\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015J\u0010\u0010#\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b#\u0010\u001fJ\u001a\u0010&\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0017R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0019R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0013R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010\u001cR\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u00100\u001a\u0004\b2\u0010\u001cR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u0010\u001f¨\u00066"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/BleConfig;", "Lo3/a;", "", "name", "Lcom/fzfstudio/ezw_ble/ble/models/BleScan;", "scan", "", "Lcom/fzfstudio/ezw_ble/ble/models/BlePrivateService;", "privateServices", "", "initiateBinding", "", "connectTimeout", "upgradeSwapTime", "", "mtu", "<init>", "(Ljava/lang/String;Lcom/fzfstudio/ezw_ble/ble/models/BleScan;Ljava/util/List;ZDDI)V", "isEmpty", "()Z", "component1", "()Ljava/lang/String;", "component2", "()Lcom/fzfstudio/ezw_ble/ble/models/BleScan;", "component3", "()Ljava/util/List;", "component4", "component5", "()D", "component6", "component7", "()I", "copy", "(Ljava/lang/String;Lcom/fzfstudio/ezw_ble/ble/models/BleScan;Ljava/util/List;ZDDI)Lcom/fzfstudio/ezw_ble/ble/models/BleConfig;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Lcom/fzfstudio/ezw_ble/ble/models/BleScan;", "getScan", "Ljava/util/List;", "getPrivateServices", "Z", "getInitiateBinding", "D", "getConnectTimeout", "getUpgradeSwapTime", "I", "getMtu", "Companion", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class BleConfig extends AbstractC1457a {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final double connectTimeout;
    private final boolean initiateBinding;
    private final int mtu;
    private final String name;
    private final List<BlePrivateService> privateServices;
    private final BleScan scan;
    private final double upgradeSwapTime;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/BleConfig$Companion;", "", "<init>", "()V", "empty", "Lcom/fzfstudio/ezw_ble/ble/models/BleConfig;", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BleConfig empty() {
            return new BleConfig("", BleScan.INSTANCE.empty(), CollectionsKt.emptyList(), true, 15000.0d, 60000.0d, 247);
        }

        private Companion() {
        }
    }

    public BleConfig(String name, BleScan scan, List<BlePrivateService> privateServices, boolean z2, double d8, double d10, int i3) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(scan, "scan");
        Intrinsics.checkNotNullParameter(privateServices, "privateServices");
        this.name = name;
        this.scan = scan;
        this.privateServices = privateServices;
        this.initiateBinding = z2;
        this.connectTimeout = d8;
        this.upgradeSwapTime = d10;
        this.mtu = i3;
    }

    public static /* synthetic */ BleConfig copy$default(BleConfig bleConfig, String str, BleScan bleScan, List list, boolean z2, double d8, double d10, int i3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bleConfig.name;
        }
        if ((i10 & 2) != 0) {
            bleScan = bleConfig.scan;
        }
        if ((i10 & 4) != 0) {
            list = bleConfig.privateServices;
        }
        if ((i10 & 8) != 0) {
            z2 = bleConfig.initiateBinding;
        }
        if ((i10 & 16) != 0) {
            d8 = bleConfig.connectTimeout;
        }
        if ((i10 & 32) != 0) {
            d10 = bleConfig.upgradeSwapTime;
        }
        if ((i10 & 64) != 0) {
            i3 = bleConfig.mtu;
        }
        int i11 = i3;
        double d11 = d10;
        double d12 = d8;
        return bleConfig.copy(str, bleScan, list, z2, d12, d11, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final BleScan getScan() {
        return this.scan;
    }

    public final List<BlePrivateService> component3() {
        return this.privateServices;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getInitiateBinding() {
        return this.initiateBinding;
    }

    /* renamed from: component5, reason: from getter */
    public final double getConnectTimeout() {
        return this.connectTimeout;
    }

    /* renamed from: component6, reason: from getter */
    public final double getUpgradeSwapTime() {
        return this.upgradeSwapTime;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMtu() {
        return this.mtu;
    }

    public final BleConfig copy(String name, BleScan scan, List<BlePrivateService> privateServices, boolean initiateBinding, double connectTimeout, double upgradeSwapTime, int mtu) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(scan, "scan");
        Intrinsics.checkNotNullParameter(privateServices, "privateServices");
        return new BleConfig(name, scan, privateServices, initiateBinding, connectTimeout, upgradeSwapTime, mtu);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BleConfig)) {
            return false;
        }
        BleConfig bleConfig = (BleConfig) other;
        return Intrinsics.areEqual(this.name, bleConfig.name) && Intrinsics.areEqual(this.scan, bleConfig.scan) && Intrinsics.areEqual(this.privateServices, bleConfig.privateServices) && this.initiateBinding == bleConfig.initiateBinding && Double.compare(this.connectTimeout, bleConfig.connectTimeout) == 0 && Double.compare(this.upgradeSwapTime, bleConfig.upgradeSwapTime) == 0 && this.mtu == bleConfig.mtu;
    }

    public final double getConnectTimeout() {
        return this.connectTimeout;
    }

    public final boolean getInitiateBinding() {
        return this.initiateBinding;
    }

    public final int getMtu() {
        return this.mtu;
    }

    public final String getName() {
        return this.name;
    }

    public final List<BlePrivateService> getPrivateServices() {
        return this.privateServices;
    }

    public final BleScan getScan() {
        return this.scan;
    }

    public final double getUpgradeSwapTime() {
        return this.upgradeSwapTime;
    }

    public int hashCode() {
        return Integer.hashCode(this.mtu) + a.d(this.upgradeSwapTime, a.d(this.connectTimeout, u.e(a.g((this.scan.hashCode() + (this.name.hashCode() * 31)) * 31, 31, this.privateServices), 31, this.initiateBinding), 31), 31);
    }

    public final boolean isEmpty() {
        return this.name.length() == 0 || this.privateServices.isEmpty();
    }

    public String toString() {
        String str = this.name;
        BleScan bleScan = this.scan;
        List<BlePrivateService> list = this.privateServices;
        boolean z2 = this.initiateBinding;
        double d8 = this.connectTimeout;
        double d10 = this.upgradeSwapTime;
        int i3 = this.mtu;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(11350));
        sb2.append(str);
        sb2.append(StubApp.getString2(11351));
        sb2.append(bleScan);
        sb2.append(StubApp.getString2(11352));
        sb2.append(list);
        sb2.append(StubApp.getString2(11353));
        sb2.append(z2);
        sb2.append(StubApp.getString2(11354));
        sb2.append(d8);
        sb2.append(StubApp.getString2(11355));
        sb2.append(d10);
        sb2.append(StubApp.getString2(11356));
        return AbstractC1482f.f(i3, StubApp.getString2(74), sb2);
    }
}
