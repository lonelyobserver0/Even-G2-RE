package com.fzfstudio.ezw_ble.ble.models;

import i2.u;
import java.io.Serializable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J5\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013¨\u0006#"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/BlePrivateService;", "Ljava/io/Serializable;", "service", "", "writeChars", "readChars", "type", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getService", "()Ljava/lang/String;", "getWriteChars", "getReadChars", "getType", "()I", "serviceUUID", "Ljava/util/UUID;", "getServiceUUID", "()Ljava/util/UUID;", "writeCharsUUID", "getWriteCharsUUID", "readCharsUUID", "getReadCharsUUID", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class BlePrivateService implements Serializable {
    private final String readChars;
    private final String service;
    private final int type;
    private final String writeChars;

    public BlePrivateService(String service, String str, String str2, int i3) {
        Intrinsics.checkNotNullParameter(service, "service");
        this.service = service;
        this.writeChars = str;
        this.readChars = str2;
        this.type = i3;
    }

    public static /* synthetic */ BlePrivateService copy$default(BlePrivateService blePrivateService, String str, String str2, String str3, int i3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = blePrivateService.service;
        }
        if ((i10 & 2) != 0) {
            str2 = blePrivateService.writeChars;
        }
        if ((i10 & 4) != 0) {
            str3 = blePrivateService.readChars;
        }
        if ((i10 & 8) != 0) {
            i3 = blePrivateService.type;
        }
        return blePrivateService.copy(str, str2, str3, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getService() {
        return this.service;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWriteChars() {
        return this.writeChars;
    }

    /* renamed from: component3, reason: from getter */
    public final String getReadChars() {
        return this.readChars;
    }

    /* renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public final BlePrivateService copy(String service, String writeChars, String readChars, int type) {
        Intrinsics.checkNotNullParameter(service, "service");
        return new BlePrivateService(service, writeChars, readChars, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlePrivateService)) {
            return false;
        }
        BlePrivateService blePrivateService = (BlePrivateService) other;
        return Intrinsics.areEqual(this.service, blePrivateService.service) && Intrinsics.areEqual(this.writeChars, blePrivateService.writeChars) && Intrinsics.areEqual(this.readChars, blePrivateService.readChars) && this.type == blePrivateService.type;
    }

    public final String getReadChars() {
        return this.readChars;
    }

    public final UUID getReadCharsUUID() {
        String str = this.readChars;
        if (str == null) {
            return null;
        }
        return UUID.fromString(str);
    }

    public final String getService() {
        return this.service;
    }

    public final UUID getServiceUUID() {
        UUID fromString = UUID.fromString(this.service);
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
        return fromString;
    }

    public final int getType() {
        return this.type;
    }

    public final String getWriteChars() {
        return this.writeChars;
    }

    public final UUID getWriteCharsUUID() {
        String str = this.writeChars;
        if (str == null) {
            return null;
        }
        return UUID.fromString(str);
    }

    public int hashCode() {
        int hashCode = this.service.hashCode() * 31;
        String str = this.writeChars;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.readChars;
        return Integer.hashCode(this.type) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.service;
        String str2 = this.writeChars;
        String str3 = this.readChars;
        int i3 = this.type;
        StringBuilder t3 = u.t("BlePrivateService(service=", str, ", writeChars=", str2, ", readChars=");
        t3.append(str3);
        t3.append(", type=");
        t3.append(i3);
        t3.append(")");
        return t3.toString();
    }

    public /* synthetic */ BlePrivateService(String str, String str2, String str3, int i3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? 0 : i3);
    }
}
