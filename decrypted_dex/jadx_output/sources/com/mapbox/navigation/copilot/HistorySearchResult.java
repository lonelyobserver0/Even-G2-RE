package com.mapbox.navigation.copilot;

import androidx.annotation.Keep;
import com.stub.StubApp;
import i2.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/mapbox/navigation/copilot/HistorySearchResult;", "", "id", "", "name", "address", "coordinates", "Lcom/mapbox/navigation/copilot/HistoryPoint;", "routablePoint", "", "Lcom/mapbox/navigation/copilot/HistoryRoutablePoint;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/navigation/copilot/HistoryPoint;Ljava/util/List;)V", "getAddress", "()Ljava/lang/String;", "getCoordinates", "()Lcom/mapbox/navigation/copilot/HistoryPoint;", "getId", "getName", "getRoutablePoint", "()Ljava/util/List;", "equals", "", "other", "hashCode", "", "toString", "copilot_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class HistorySearchResult {
    private final String address;
    private final HistoryPoint coordinates;
    private final String id;
    private final String name;
    private final List<HistoryRoutablePoint> routablePoint;

    public HistorySearchResult(String id, String name, String address, HistoryPoint historyPoint, List<HistoryRoutablePoint> list) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        this.id = id;
        this.name = name;
        this.address = address;
        this.coordinates = historyPoint;
        this.routablePoint = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(HistorySearchResult.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.navigation.copilot.HistorySearchResult");
        HistorySearchResult historySearchResult = (HistorySearchResult) other;
        if (Intrinsics.areEqual(this.id, historySearchResult.id) && Intrinsics.areEqual(this.name, historySearchResult.name) && Intrinsics.areEqual(this.address, historySearchResult.address) && Intrinsics.areEqual(this.coordinates, historySearchResult.coordinates)) {
            return Intrinsics.areEqual(this.routablePoint, historySearchResult.routablePoint);
        }
        return false;
    }

    public final String getAddress() {
        return this.address;
    }

    public final HistoryPoint getCoordinates() {
        return this.coordinates;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final List<HistoryRoutablePoint> getRoutablePoint() {
        return this.routablePoint;
    }

    public int hashCode() {
        int d8 = u.d(u.d(this.id.hashCode() * 31, 31, this.name), 31, this.address);
        HistoryPoint historyPoint = this.coordinates;
        int hashCode = (d8 + (historyPoint != null ? historyPoint.hashCode() : 0)) * 31;
        List<HistoryRoutablePoint> list = this.routablePoint;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return StubApp.getString2(14657) + this.id + StubApp.getString2(14658) + this.name + StubApp.getString2(14659) + this.address + StubApp.getString2(14660) + this.coordinates + StubApp.getString2(14661) + this.routablePoint + ')';
    }
}
