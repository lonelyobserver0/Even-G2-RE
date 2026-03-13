package com.mapbox.api.directions.v5.models;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.mapbox.api.directions.v5.DirectionsAdapterFactory;
import com.mapbox.api.directions.v5.models.AutoValue_DirectionsResponse;
import com.mapbox.api.directions.v5.models.C$AutoValue_DirectionsResponse;
import com.mapbox.api.directions.v5.models.DirectionsJsonObject;
import com.mapbox.geojson.Point;
import com.mapbox.geojson.PointAsCoordinatesTypeAdapter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

@AutoValue
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class DirectionsResponse extends DirectionsJsonObject {

    @AutoValue.Builder
    public static abstract class Builder extends DirectionsJsonObject.Builder<Builder> {
        public abstract DirectionsResponse autoBuild();

        public DirectionsResponse build() {
            ArrayList arrayList = new ArrayList(routes().size());
            for (int i3 = 0; i3 < routes().size(); i3++) {
                arrayList.add(i3, routes().get(i3).toBuilder().routeIndex(String.valueOf(i3)).requestUuid(uuid()).build());
            }
            routes(arrayList);
            return autoBuild();
        }

        public abstract Builder code(String str);

        public abstract Builder message(String str);

        public abstract Builder metadata(Metadata metadata);

        public abstract Builder routes(List<DirectionsRoute> list);

        public abstract List<DirectionsRoute> routes();

        public abstract Builder uuid(String str);

        public abstract String uuid();

        public abstract Builder waypoints(List<DirectionsWaypoint> list);
    }

    public static Builder builder() {
        return new C$AutoValue_DirectionsResponse.Builder();
    }

    private static Gson createGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(DirectionsAdapterFactory.a());
        gsonBuilder.registerTypeAdapter(Point.class, new PointAsCoordinatesTypeAdapter());
        return gsonBuilder.create();
    }

    public static DirectionsResponse fromJson(Reader reader) {
        return ((DirectionsResponse) createGson().fromJson(reader, DirectionsResponse.class)).toBuilder().build();
    }

    public static TypeAdapter<DirectionsResponse> typeAdapter(Gson gson) {
        return new AutoValue_DirectionsResponse.GsonTypeAdapter(gson);
    }

    public abstract String code();

    public abstract String message();

    public abstract Metadata metadata();

    public abstract List<DirectionsRoute> routes();

    public abstract Builder toBuilder();

    public abstract String uuid();

    public abstract List<DirectionsWaypoint> waypoints();
}
