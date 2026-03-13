package com.mapbox.navigation.copilot;

import androidx.annotation.Keep;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/mapbox/navigation/copilot/DriveEnds;", "", "", "type", "", "realDuration", "<init>", "(Ljava/lang/String;J)V", "component1", "()Ljava/lang/String;", "component2", "()J", "copy", "(Ljava/lang/String;J)Lcom/mapbox/navigation/copilot/DriveEnds;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getType", "J", "getRealDuration", "copilot_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class DriveEnds {
    private final long realDuration;
    private final String type;

    public DriveEnds(String type, long j) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.type = type;
        this.realDuration = j;
    }

    public static /* synthetic */ DriveEnds copy$default(DriveEnds driveEnds, String str, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = driveEnds.type;
        }
        if ((i3 & 2) != 0) {
            j = driveEnds.realDuration;
        }
        return driveEnds.copy(str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final long getRealDuration() {
        return this.realDuration;
    }

    public final DriveEnds copy(String type, long realDuration) {
        Intrinsics.checkNotNullParameter(type, "type");
        return new DriveEnds(type, realDuration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DriveEnds)) {
            return false;
        }
        DriveEnds driveEnds = (DriveEnds) other;
        return Intrinsics.areEqual(this.type, driveEnds.type) && this.realDuration == driveEnds.realDuration;
    }

    public final long getRealDuration() {
        return this.realDuration;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return Long.hashCode(this.realDuration) + (this.type.hashCode() * 31);
    }

    public String toString() {
        return StubApp.getString2(14653) + this.type + StubApp.getString2(14654) + this.realDuration + ')';
    }
}
