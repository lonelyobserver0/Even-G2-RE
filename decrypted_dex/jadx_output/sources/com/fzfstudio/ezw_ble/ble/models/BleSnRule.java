package com.fzfstudio.ezw_ble.ble.models;

import E1.a;
import i2.u;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/BleSnRule;", "Ljava/io/Serializable;", "byteLength", "", "startSubIndex", "replaceRex", "", "filters", "", "<init>", "(IILjava/lang/String;Ljava/util/List;)V", "getByteLength", "()I", "getStartSubIndex", "getReplaceRex", "()Ljava/lang/String;", "getFilters", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class BleSnRule implements Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int byteLength;
    private final List<String> filters;
    private final String replaceRex;
    private final int startSubIndex;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/BleSnRule$Companion;", "", "<init>", "()V", "empty", "Lcom/fzfstudio/ezw_ble/ble/models/BleSnRule;", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BleSnRule empty() {
            return new BleSnRule(0, 0, "", CollectionsKt.emptyList());
        }

        private Companion() {
        }
    }

    public BleSnRule(int i3, int i10, String replaceRex, List<String> filters) {
        Intrinsics.checkNotNullParameter(replaceRex, "replaceRex");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.byteLength = i3;
        this.startSubIndex = i10;
        this.replaceRex = replaceRex;
        this.filters = filters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BleSnRule copy$default(BleSnRule bleSnRule, int i3, int i10, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i3 = bleSnRule.byteLength;
        }
        if ((i11 & 2) != 0) {
            i10 = bleSnRule.startSubIndex;
        }
        if ((i11 & 4) != 0) {
            str = bleSnRule.replaceRex;
        }
        if ((i11 & 8) != 0) {
            list = bleSnRule.filters;
        }
        return bleSnRule.copy(i3, i10, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getByteLength() {
        return this.byteLength;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStartSubIndex() {
        return this.startSubIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final String getReplaceRex() {
        return this.replaceRex;
    }

    public final List<String> component4() {
        return this.filters;
    }

    public final BleSnRule copy(int byteLength, int startSubIndex, String replaceRex, List<String> filters) {
        Intrinsics.checkNotNullParameter(replaceRex, "replaceRex");
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new BleSnRule(byteLength, startSubIndex, replaceRex, filters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BleSnRule)) {
            return false;
        }
        BleSnRule bleSnRule = (BleSnRule) other;
        return this.byteLength == bleSnRule.byteLength && this.startSubIndex == bleSnRule.startSubIndex && Intrinsics.areEqual(this.replaceRex, bleSnRule.replaceRex) && Intrinsics.areEqual(this.filters, bleSnRule.filters);
    }

    public final int getByteLength() {
        return this.byteLength;
    }

    public final List<String> getFilters() {
        return this.filters;
    }

    public final String getReplaceRex() {
        return this.replaceRex;
    }

    public final int getStartSubIndex() {
        return this.startSubIndex;
    }

    public int hashCode() {
        return this.filters.hashCode() + u.d(a.e(this.startSubIndex, Integer.hashCode(this.byteLength) * 31, 31), 31, this.replaceRex);
    }

    public String toString() {
        int i3 = this.byteLength;
        int i10 = this.startSubIndex;
        String str = this.replaceRex;
        List<String> list = this.filters;
        StringBuilder l9 = AbstractC1482f.l(i3, "BleSnRule(byteLength=", i10, ", startSubIndex=", ", replaceRex=");
        l9.append(str);
        l9.append(", filters=");
        l9.append(list);
        l9.append(")");
        return l9.toString();
    }
}
