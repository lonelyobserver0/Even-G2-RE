package com.mapbox.api.directions.v5.models;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class InterningStringAdapter extends TypeAdapter<String> {
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public String read2(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() != JsonToken.NULL) {
            return jsonReader.nextString().intern();
        }
        jsonReader.nextNull();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, String str) throws IOException {
        jsonWriter.value(str);
    }
}
