package com.mapbox.api.directions.v5.models;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.api.directions.v5.models.StepManeuver;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class StepManeuverTypeAdapter extends TypeAdapter<StepManeuver> {
    private final TypeAdapter<StepManeuver> defaultAdapter;

    public StepManeuverTypeAdapter(TypeAdapter<StepManeuver> typeAdapter) {
        this.defaultAdapter = typeAdapter;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public StepManeuver read2(JsonReader jsonReader) throws IOException {
        LinkedHashMap linkedHashMap = null;
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        JsonObject asJsonObject = JsonParser.parseReader(jsonReader).getAsJsonObject();
        StepManeuver.Builder builder = StepManeuver.builder();
        for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (!value.isJsonNull()) {
                key.getClass();
                char c10 = 65535;
                switch (key.hashCode()) {
                    case -901094096:
                        if (key.equals(StubApp.getString2(13125))) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case -615513385:
                        if (key.equals(StubApp.getString2(12961))) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case -307042805:
                        if (key.equals(StubApp.getString2(13124))) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 3127582:
                        if (key.equals(StubApp.getString2(13127))) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 3575610:
                        if (key.equals(StubApp.getString2(660))) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 301526158:
                        if (key.equals(StubApp.getString2(13126))) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 1901043637:
                        if (key.equals(StubApp.getString2(662))) {
                            c10 = 6;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        builder.bearingBefore(Double.valueOf(value.getAsDouble()));
                        break;
                    case 1:
                        builder.modifier(value.getAsString().intern());
                        break;
                    case 2:
                        builder.bearingAfter(Double.valueOf(value.getAsDouble()));
                        break;
                    case 3:
                        builder.exit(Integer.valueOf(value.getAsInt()));
                        break;
                    case 4:
                        builder.type(value.getAsString().intern());
                        break;
                    case 5:
                        builder.instruction(value.getAsString());
                        break;
                    case 6:
                        JsonArray asJsonArray = value.getAsJsonArray();
                        double[] dArr = new double[asJsonArray.size()];
                        for (int i3 = 0; i3 < asJsonArray.size(); i3++) {
                            dArr[i3] = asJsonArray.get(i3).getAsDouble();
                        }
                        builder.rawLocation(dArr);
                        break;
                    default:
                        if (linkedHashMap == null) {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap.put(key, value);
                        break;
                }
            }
        }
        return builder.unrecognizedJsonProperties(linkedHashMap).build();
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, StepManeuver stepManeuver) throws IOException {
        this.defaultAdapter.write(jsonWriter, stepManeuver);
    }
}
