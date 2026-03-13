package com.mapbox.navigation.ui.maps.internal.route.line;

import Xa.h;
import androidx.annotation.Keep;
import com.stub.StubApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/LightRouteLine;", "", "routeId", "", "featureId", "(Ljava/lang/String;Ljava/lang/String;)V", "getFeatureId", "()Ljava/lang/String;", "getRouteId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* data */ class LightRouteLine {
    private final String featureId;
    private final String routeId;

    public LightRouteLine(String routeId, String str) {
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        this.routeId = routeId;
        this.featureId = str;
    }

    public static /* synthetic */ LightRouteLine copy$default(LightRouteLine lightRouteLine, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = lightRouteLine.routeId;
        }
        if ((i3 & 2) != 0) {
            str2 = lightRouteLine.featureId;
        }
        return lightRouteLine.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRouteId() {
        return this.routeId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFeatureId() {
        return this.featureId;
    }

    public final LightRouteLine copy(String routeId, String featureId) {
        Intrinsics.checkNotNullParameter(routeId, "routeId");
        return new LightRouteLine(routeId, featureId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LightRouteLine)) {
            return false;
        }
        LightRouteLine lightRouteLine = (LightRouteLine) other;
        return Intrinsics.areEqual(this.routeId, lightRouteLine.routeId) && Intrinsics.areEqual(this.featureId, lightRouteLine.featureId);
    }

    public final String getFeatureId() {
        return this.featureId;
    }

    public final String getRouteId() {
        return this.routeId;
    }

    public int hashCode() {
        int hashCode = this.routeId.hashCode() * 31;
        String str = this.featureId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(14740));
        sb2.append(this.routeId);
        sb2.append(StubApp.getString2(14741));
        return h.s(sb2, this.featureId, ')');
    }
}
