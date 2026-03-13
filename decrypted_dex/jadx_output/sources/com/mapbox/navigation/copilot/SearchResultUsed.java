package com.mapbox.navigation.copilot;

import androidx.annotation.Keep;
import com.stub.StubApp;
import i2.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001b\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/mapbox/navigation/copilot/SearchResultUsed;", "", "", "provider", "id", "name", "address", "Lcom/mapbox/navigation/copilot/HistoryPoint;", "coordinates", "", "Lcom/mapbox/navigation/copilot/HistoryRoutablePoint;", "routablePoint", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/mapbox/navigation/copilot/HistoryPoint;Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getProvider", "getId", "getName", "getAddress", "Lcom/mapbox/navigation/copilot/HistoryPoint;", "getCoordinates", "()Lcom/mapbox/navigation/copilot/HistoryPoint;", "Ljava/util/List;", "getRoutablePoint", "()Ljava/util/List;", "copilot_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class SearchResultUsed {
    private final String address;
    private final HistoryPoint coordinates;
    private final String id;
    private final String name;
    private final String provider;
    private final List<HistoryRoutablePoint> routablePoint;

    public SearchResultUsed(String provider, String id, String name, String address, HistoryPoint coordinates, List<HistoryRoutablePoint> list) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.provider = provider;
        this.id = id;
        this.name = name;
        this.address = address;
        this.coordinates = coordinates;
        this.routablePoint = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SearchResultUsed.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.navigation.copilot.SearchResultUsed");
        SearchResultUsed searchResultUsed = (SearchResultUsed) other;
        if (Intrinsics.areEqual(this.provider, searchResultUsed.provider) && Intrinsics.areEqual(this.id, searchResultUsed.id) && Intrinsics.areEqual(this.name, searchResultUsed.name) && Intrinsics.areEqual(this.address, searchResultUsed.address) && Intrinsics.areEqual(this.coordinates, searchResultUsed.coordinates)) {
            return Intrinsics.areEqual(this.routablePoint, searchResultUsed.routablePoint);
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

    public final String getProvider() {
        return this.provider;
    }

    public final List<HistoryRoutablePoint> getRoutablePoint() {
        return this.routablePoint;
    }

    public int hashCode() {
        int hashCode = (this.coordinates.hashCode() + u.d(u.d(u.d(this.provider.hashCode() * 31, 31, this.id), 31, this.name), 31, this.address)) * 31;
        List<HistoryRoutablePoint> list = this.routablePoint;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return StubApp.getString2(14663) + this.provider + StubApp.getString2(14664) + this.id + StubApp.getString2(14658) + this.name + StubApp.getString2(14659) + this.address + StubApp.getString2(14660) + this.coordinates + StubApp.getString2(14661) + this.routablePoint + ')';
    }
}
