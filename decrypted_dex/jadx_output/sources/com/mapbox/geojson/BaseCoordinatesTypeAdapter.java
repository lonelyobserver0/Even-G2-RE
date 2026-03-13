package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.exception.GeoJsonException;
import com.mapbox.geojson.shifter.CoordinateShifterManager;
import com.mapbox.geojson.utils.GeoJsonUtils;
import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
abstract class BaseCoordinatesTypeAdapter<T> extends TypeAdapter<T> {
    public Point readPoint(JsonReader jsonReader) throws IOException {
        List<Double> readPointList = readPointList(jsonReader);
        if (readPointList == null || readPointList.size() <= 1) {
            throw new GeoJsonException(StubApp.getString2(13860));
        }
        return new Point(StubApp.getString2(13859), null, readPointList);
    }

    public List<Double> readPointList(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            throw null;
        }
        ArrayList arrayList = new ArrayList(3);
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(Double.valueOf(jsonReader.nextDouble()));
        }
        jsonReader.endArray();
        return arrayList.size() > 2 ? CoordinateShifterManager.getCoordinateShifter().shiftLonLatAlt(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue(), ((Double) arrayList.get(2)).doubleValue()) : CoordinateShifterManager.getCoordinateShifter().shiftLonLat(((Double) arrayList.get(0)).doubleValue(), ((Double) arrayList.get(1)).doubleValue());
    }

    public void writePoint(JsonWriter jsonWriter, Point point) throws IOException {
        if (point == null) {
            return;
        }
        writePointList(jsonWriter, point.coordinates());
    }

    public void writePointList(JsonWriter jsonWriter, List<Double> list) throws IOException {
        if (list == null) {
            return;
        }
        jsonWriter.beginArray();
        List<Double> unshiftPoint = CoordinateShifterManager.getCoordinateShifter().unshiftPoint(list);
        jsonWriter.value(GeoJsonUtils.trim(unshiftPoint.get(0).doubleValue()));
        jsonWriter.value(GeoJsonUtils.trim(unshiftPoint.get(1).doubleValue()));
        if (list.size() > 2) {
            jsonWriter.value(unshiftPoint.get(2));
        }
        jsonWriter.endArray();
    }
}
