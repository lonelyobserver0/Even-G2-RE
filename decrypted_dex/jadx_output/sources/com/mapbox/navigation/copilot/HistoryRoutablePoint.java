package com.mapbox.navigation.copilot;

import androidx.annotation.Keep;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/mapbox/navigation/copilot/HistoryRoutablePoint;", "", "coordinates", "Lcom/mapbox/navigation/copilot/HistoryPoint;", "(Lcom/mapbox/navigation/copilot/HistoryPoint;)V", "getCoordinates", "()Lcom/mapbox/navigation/copilot/HistoryPoint;", "equals", "", "other", "hashCode", "", "toString", "", "copilot_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class HistoryRoutablePoint {
    private final HistoryPoint coordinates;

    public HistoryRoutablePoint(HistoryPoint coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.coordinates = coordinates;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(HistoryRoutablePoint.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.navigation.copilot.HistoryRoutablePoint");
        return Intrinsics.areEqual(this.coordinates, ((HistoryRoutablePoint) other).coordinates);
    }

    public final HistoryPoint getCoordinates() {
        return this.coordinates;
    }

    public int hashCode() {
        return this.coordinates.hashCode();
    }

    public String toString() {
        return StubApp.getString2(14656) + this.coordinates + ')';
    }
}
