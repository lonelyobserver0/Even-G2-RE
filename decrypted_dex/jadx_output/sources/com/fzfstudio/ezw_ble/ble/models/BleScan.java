package com.fzfstudio.ezw_ble.ble.models;

import com.stub.StubApp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o3.AbstractC1457a;
import p0.AbstractC1482f;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J6\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010\u0010¨\u0006\""}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/BleScan;", "Lo3/a;", "", "", "nameFilters", "Lcom/fzfstudio/ezw_ble/ble/models/BleSnRule;", "snRule", "", "matchCount", "<init>", "(Ljava/util/List;Lcom/fzfstudio/ezw_ble/ble/models/BleSnRule;I)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/fzfstudio/ezw_ble/ble/models/BleSnRule;", "component3", "()I", "copy", "(Ljava/util/List;Lcom/fzfstudio/ezw_ble/ble/models/BleSnRule;I)Lcom/fzfstudio/ezw_ble/ble/models/BleScan;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getNameFilters", "Lcom/fzfstudio/ezw_ble/ble/models/BleSnRule;", "getSnRule", "I", "getMatchCount", "Companion", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class BleScan extends AbstractC1457a {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int matchCount;
    private final List<String> nameFilters;
    private final BleSnRule snRule;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/BleScan$Companion;", "", "<init>", "()V", "empty", "Lcom/fzfstudio/ezw_ble/ble/models/BleScan;", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BleScan empty() {
            return new BleScan(CollectionsKt.emptyList(), BleSnRule.INSTANCE.empty(), 1);
        }

        private Companion() {
        }
    }

    public BleScan(List<String> nameFilters, BleSnRule bleSnRule, int i3) {
        Intrinsics.checkNotNullParameter(nameFilters, "nameFilters");
        this.nameFilters = nameFilters;
        this.snRule = bleSnRule;
        this.matchCount = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleScan copy$default(BleScan bleScan, List list, BleSnRule bleSnRule, int i3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = bleScan.nameFilters;
        }
        if ((i10 & 2) != 0) {
            bleSnRule = bleScan.snRule;
        }
        if ((i10 & 4) != 0) {
            i3 = bleScan.matchCount;
        }
        return bleScan.copy(list, bleSnRule, i3);
    }

    public final List<String> component1() {
        return this.nameFilters;
    }

    /* renamed from: component2, reason: from getter */
    public final BleSnRule getSnRule() {
        return this.snRule;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMatchCount() {
        return this.matchCount;
    }

    public final BleScan copy(List<String> nameFilters, BleSnRule snRule, int matchCount) {
        Intrinsics.checkNotNullParameter(nameFilters, "nameFilters");
        return new BleScan(nameFilters, snRule, matchCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BleScan)) {
            return false;
        }
        BleScan bleScan = (BleScan) other;
        return Intrinsics.areEqual(this.nameFilters, bleScan.nameFilters) && Intrinsics.areEqual(this.snRule, bleScan.snRule) && this.matchCount == bleScan.matchCount;
    }

    public final int getMatchCount() {
        return this.matchCount;
    }

    public final List<String> getNameFilters() {
        return this.nameFilters;
    }

    public final BleSnRule getSnRule() {
        return this.snRule;
    }

    public int hashCode() {
        int hashCode = this.nameFilters.hashCode() * 31;
        BleSnRule bleSnRule = this.snRule;
        return Integer.hashCode(this.matchCount) + ((hashCode + (bleSnRule == null ? 0 : bleSnRule.hashCode())) * 31);
    }

    public String toString() {
        List<String> list = this.nameFilters;
        BleSnRule bleSnRule = this.snRule;
        int i3 = this.matchCount;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(11370));
        sb2.append(list);
        sb2.append(StubApp.getString2(11371));
        sb2.append(bleSnRule);
        sb2.append(StubApp.getString2(11372));
        return AbstractC1482f.f(i3, StubApp.getString2(74), sb2);
    }
}
