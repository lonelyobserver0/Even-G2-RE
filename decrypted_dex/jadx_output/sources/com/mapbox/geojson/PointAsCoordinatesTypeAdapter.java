package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class PointAsCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<Point> {
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public Point read2(JsonReader jsonReader) throws IOException {
        return readPoint(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Point point) throws IOException {
        writePoint(jsonWriter, point);
    }
}
