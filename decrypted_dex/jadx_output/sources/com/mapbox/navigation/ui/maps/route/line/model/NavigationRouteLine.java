package com.mapbox.navigation.ui.maps.route.line.model;

import Xa.h;
import androidx.annotation.Keep;
import com.mapbox.navigation.base.route.g;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, d2 = {"Lcom/mapbox/navigation/ui/maps/route/line/model/NavigationRouteLine;", "", "Lcom/mapbox/navigation/base/route/g;", "route", "", "identifier", "<init>", "(Lcom/mapbox/navigation/base/route/g;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/mapbox/navigation/base/route/g;", "getRoute", "()Lcom/mapbox/navigation/base/route/g;", "Ljava/lang/String;", "getIdentifier", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class NavigationRouteLine {
    private final String identifier;
    private final g route;

    public NavigationRouteLine(g route, String str) {
        Intrinsics.checkNotNullParameter(route, "route");
        this.route = route;
        this.identifier = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(NavigationRouteLine.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.mapbox.navigation.ui.maps.route.line.model.NavigationRouteLine");
        NavigationRouteLine navigationRouteLine = (NavigationRouteLine) other;
        if (Intrinsics.areEqual(this.route, navigationRouteLine.route)) {
            return Intrinsics.areEqual(this.identifier, navigationRouteLine.identifier);
        }
        return false;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final g getRoute() {
        return this.route;
    }

    public int hashCode() {
        int hashCode = this.route.hashCode() * 31;
        String str = this.identifier;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14827));
        sb2.append(this.route);
        sb2.append(StubApp.getString2(14828));
        return h.s(sb2, this.identifier, ')');
    }
}
