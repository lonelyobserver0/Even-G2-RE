package com.mapbox.navigation.ui.maps.internal.route.line;

import N6.d;
import androidx.annotation.Keep;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.mapbox.geojson.FeatureCollection;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.PointAsCoordinatesTypeAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import r9.C1581a;
import r9.b;
import r9.c;
import r9.v;

@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b'\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/mapbox/navigation/ui/maps/internal/route/line/RouteLineEvent;", "", "", "subtype", "instanceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toJson", "()Ljava/lang/String;", "Ljava/lang/String;", "getSubtype", "getInstanceId", "Companion", "r9/v", "ui-maps_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class RouteLineEvent {
    public static final v Companion = new v();
    private final String instanceId;

    @SerializedName("subtype")
    private final String subtype;

    public RouteLineEvent(String subtype, String instanceId) {
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.subtype = subtype;
        this.instanceId = instanceId;
    }

    public final String getInstanceId() {
        return this.instanceId;
    }

    public final String getSubtype() {
        return this.subtype;
    }

    public final String toJson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        Companion.getClass();
        gsonBuilder.registerTypeAdapter(IntRange.class, new c());
        gsonBuilder.registerTypeAdapter(Point.class, new PointAsCoordinatesTypeAdapter());
        gsonBuilder.registerTypeAdapter(d.class, new C1581a());
        gsonBuilder.registerTypeAdapter(FeatureCollection.class, new b());
        String json = gsonBuilder.create().toJson(this);
        Intrinsics.checkNotNullExpressionValue(json, "gsonBuilder.create().toJson(this)");
        return json;
    }
}
