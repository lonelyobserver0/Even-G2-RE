package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class ListOfDoublesCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<List<Double>> {
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public List<Double> read2(JsonReader jsonReader) throws IOException {
        return readPointList(jsonReader);
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, List<Double> list) throws IOException {
        writePointList(jsonWriter, list);
    }
}
