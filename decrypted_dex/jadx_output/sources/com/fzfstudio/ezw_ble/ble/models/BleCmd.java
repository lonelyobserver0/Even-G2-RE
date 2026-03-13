package com.fzfstudio.ezw_ble.ble.models;

import com.fzfstudio.ezw_utils.gson.ByteArrayAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.stub.StubApp;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o3.AbstractC1457a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\t\u0010\u0018¨\u0006$"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/BleCmd;", "Lo3/a;", "", "uuid", "", "psType", "", "data", "", "isSuccess", "<init>", "(Ljava/lang/String;I[BZ)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "()Ljava/lang/String;", "component2", "component3", "()[B", "component4", "()Z", "copy", "(Ljava/lang/String;I[BZ)Lcom/fzfstudio/ezw_ble/ble/models/BleCmd;", "toString", "Ljava/lang/String;", "getUuid", "I", "getPsType", "[B", "getData", "Z", "Companion", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class BleCmd extends AbstractC1457a {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JsonAdapter(ByteArrayAdapter.class)
    private final byte[] data;
    private final boolean isSuccess;
    private final int psType;
    private final String uuid;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/fzfstudio/ezw_ble/ble/models/BleCmd$Companion;", "", "<init>", "()V", "fail", "Lcom/fzfstudio/ezw_ble/ble/models/BleCmd;", "uuid", "", "psType", "", "flutter_ezw_ble_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BleCmd fail(String uuid, int psType) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return new BleCmd(uuid, psType, null, false);
        }

        private Companion() {
        }
    }

    public BleCmd(String uuid, int i3, byte[] bArr, boolean z2) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        this.uuid = uuid;
        this.psType = i3;
        this.data = bArr;
        this.isSuccess = z2;
    }

    public static /* synthetic */ BleCmd copy$default(BleCmd bleCmd, String str, int i3, byte[] bArr, boolean z2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bleCmd.uuid;
        }
        if ((i10 & 2) != 0) {
            i3 = bleCmd.psType;
        }
        if ((i10 & 4) != 0) {
            bArr = bleCmd.data;
        }
        if ((i10 & 8) != 0) {
            z2 = bleCmd.isSuccess;
        }
        return bleCmd.copy(str, i3, bArr, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPsType() {
        return this.psType;
    }

    /* renamed from: component3, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public final BleCmd copy(String uuid, int psType, byte[] data, boolean isSuccess) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        return new BleCmd(uuid, psType, data, isSuccess);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(BleCmd.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.fzfstudio.ezw_ble.ble.models.BleCmd");
        BleCmd bleCmd = (BleCmd) other;
        if (!Intrinsics.areEqual(this.uuid, bleCmd.uuid) || this.psType != bleCmd.psType) {
            return false;
        }
        byte[] bArr = this.data;
        if (bArr != null) {
            byte[] bArr2 = bleCmd.data;
            if (bArr2 == null || !Arrays.equals(bArr, bArr2)) {
                return false;
            }
        } else if (bleCmd.data != null) {
            return false;
        }
        return this.isSuccess == bleCmd.isSuccess;
    }

    public final byte[] getData() {
        return this.data;
    }

    public final int getPsType() {
        return this.psType;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int hashCode = ((this.uuid.hashCode() * 31) + this.psType) * 31;
        byte[] bArr = this.data;
        return Boolean.hashCode(this.isSuccess) + ((hashCode + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public String toString() {
        return StubApp.getString2(11347) + this.uuid + StubApp.getString2(11265) + this.psType + StubApp.getString2(11348) + Arrays.toString(this.data) + StubApp.getString2(11349) + this.isSuccess + StubApp.getString2(74);
    }
}
