package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.exception.GeoJsonException;
import com.mapbox.geojson.gson.BoundingBoxTypeAdapter;
import com.stub.StubApp;
import java.io.IOException;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
abstract class BaseGeometryTypeAdapter<G, T> extends TypeAdapter<G> {
    private volatile TypeAdapter<BoundingBox> boundingBoxAdapter = new BoundingBoxTypeAdapter();
    private volatile TypeAdapter<T> coordinatesAdapter;
    private final Gson gson;
    private volatile TypeAdapter<String> stringAdapter;

    public BaseGeometryTypeAdapter(Gson gson, TypeAdapter<T> typeAdapter) {
        this.gson = gson;
        this.coordinatesAdapter = typeAdapter;
    }

    public abstract CoordinateContainer<T> createCoordinateContainer(String str, BoundingBox boundingBox, T t3);

    public CoordinateContainer<T> readCoordinateContainer(JsonReader jsonReader) throws IOException {
        String str = null;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        jsonReader.beginObject();
        BoundingBox boundingBox = null;
        T t3 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (jsonReader.peek() != JsonToken.NULL) {
                nextName.getClass();
                char c10 = 65535;
                switch (nextName.hashCode()) {
                    case 3017257:
                        if (nextName.equals(StubApp.getString2(2302))) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 3575610:
                        if (nextName.equals(StubApp.getString2(660))) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 1871919611:
                        if (nextName.equals(StubApp.getString2(2042))) {
                            c10 = 2;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        TypeAdapter<BoundingBox> typeAdapter = this.boundingBoxAdapter;
                        if (typeAdapter == null) {
                            typeAdapter = this.gson.getAdapter(BoundingBox.class);
                            this.boundingBoxAdapter = typeAdapter;
                        }
                        boundingBox = typeAdapter.read2(jsonReader);
                        break;
                    case 1:
                        TypeAdapter<String> typeAdapter2 = this.stringAdapter;
                        if (typeAdapter2 == null) {
                            typeAdapter2 = this.gson.getAdapter(String.class);
                            this.stringAdapter = typeAdapter2;
                        }
                        str = typeAdapter2.read2(jsonReader);
                        break;
                    case 2:
                        TypeAdapter<T> typeAdapter3 = this.coordinatesAdapter;
                        if (typeAdapter3 == null) {
                            throw new GeoJsonException(StubApp.getString2(13861));
                        }
                        t3 = typeAdapter3.read2(jsonReader);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else {
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return createCoordinateContainer(str, boundingBox, t3);
    }

    public void writeCoordinateContainer(JsonWriter jsonWriter, CoordinateContainer<T> coordinateContainer) throws IOException {
        if (coordinateContainer == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(StubApp.getString2(660));
        if (coordinateContainer.type() == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter<String> typeAdapter = this.stringAdapter;
            if (typeAdapter == null) {
                typeAdapter = this.gson.getAdapter(String.class);
                this.stringAdapter = typeAdapter;
            }
            typeAdapter.write(jsonWriter, coordinateContainer.type());
        }
        jsonWriter.name(StubApp.getString2(2302));
        if (coordinateContainer.bbox() == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter<BoundingBox> typeAdapter2 = this.boundingBoxAdapter;
            if (typeAdapter2 == null) {
                typeAdapter2 = this.gson.getAdapter(BoundingBox.class);
                this.boundingBoxAdapter = typeAdapter2;
            }
            typeAdapter2.write(jsonWriter, coordinateContainer.bbox());
        }
        jsonWriter.name(StubApp.getString2(2042));
        if (coordinateContainer.coordinates() == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapter<T> typeAdapter3 = this.coordinatesAdapter;
            if (typeAdapter3 == null) {
                throw new GeoJsonException(StubApp.getString2(13861));
            }
            typeAdapter3.write(jsonWriter, coordinateContainer.coordinates());
        }
        jsonWriter.endObject();
    }
}
