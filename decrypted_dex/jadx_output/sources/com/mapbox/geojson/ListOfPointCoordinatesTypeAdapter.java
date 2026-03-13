package com.mapbox.geojson;

import androidx.annotation.Keep;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.exception.GeoJsonException;
import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class ListOfPointCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<List<Point>> {
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public List<Point> read2(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            throw null;
        }
        if (jsonReader.peek() != JsonToken.BEGIN_ARRAY) {
            throw new GeoJsonException(StubApp.getString2(13873));
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            arrayList.add(readPoint(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, List<Point> list) throws IOException {
        if (list == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        Iterator<Point> it = list.iterator();
        while (it.hasNext()) {
            writePoint(jsonWriter, it.next());
        }
        jsonWriter.endArray();
    }
}
