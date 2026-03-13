package com.google.gson.internal.bind;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
class JsonElementTypeAdapter extends TypeAdapter<JsonElement> {
    static final JsonElementTypeAdapter ADAPTER = new JsonElementTypeAdapter();

    /* renamed from: com.google.gson.internal.bind.JsonElementTypeAdapter$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private JsonElementTypeAdapter() {
    }

    private JsonElement readTerminal(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i3 = AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
        if (i3 == 3) {
            return new JsonPrimitive(jsonReader.nextString());
        }
        if (i3 == 4) {
            return new JsonPrimitive(new LazilyParsedNumber(jsonReader.nextString()));
        }
        if (i3 == 5) {
            return new JsonPrimitive(Boolean.valueOf(jsonReader.nextBoolean()));
        }
        if (i3 == 6) {
            jsonReader.nextNull();
            return JsonNull.INSTANCE;
        }
        throw new IllegalStateException("Unexpected token: " + jsonToken);
    }

    private JsonElement tryBeginNesting(JsonReader jsonReader, JsonToken jsonToken) throws IOException {
        int i3 = AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()];
        if (i3 == 1) {
            jsonReader.beginArray();
            return new JsonArray();
        }
        if (i3 != 2) {
            return null;
        }
        jsonReader.beginObject();
        return new JsonObject();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public JsonElement read2(JsonReader jsonReader) throws IOException {
        if (jsonReader instanceof JsonTreeReader) {
            return ((JsonTreeReader) jsonReader).nextJsonElement();
        }
        JsonToken peek = jsonReader.peek();
        JsonElement tryBeginNesting = tryBeginNesting(jsonReader, peek);
        if (tryBeginNesting == null) {
            return readTerminal(jsonReader, peek);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (jsonReader.hasNext()) {
                String nextName = tryBeginNesting instanceof JsonObject ? jsonReader.nextName() : null;
                JsonToken peek2 = jsonReader.peek();
                JsonElement tryBeginNesting2 = tryBeginNesting(jsonReader, peek2);
                boolean z2 = tryBeginNesting2 != null;
                if (tryBeginNesting2 == null) {
                    tryBeginNesting2 = readTerminal(jsonReader, peek2);
                }
                if (tryBeginNesting instanceof JsonArray) {
                    ((JsonArray) tryBeginNesting).add(tryBeginNesting2);
                } else {
                    ((JsonObject) tryBeginNesting).add(nextName, tryBeginNesting2);
                }
                if (z2) {
                    arrayDeque.addLast(tryBeginNesting);
                    tryBeginNesting = tryBeginNesting2;
                }
            } else {
                if (tryBeginNesting instanceof JsonArray) {
                    jsonReader.endArray();
                } else {
                    jsonReader.endObject();
                }
                if (arrayDeque.isEmpty()) {
                    return tryBeginNesting;
                }
                tryBeginNesting = (JsonElement) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, JsonElement jsonElement) throws IOException {
        if (jsonElement == null || jsonElement.isJsonNull()) {
            jsonWriter.nullValue();
            return;
        }
        if (jsonElement.isJsonPrimitive()) {
            JsonPrimitive asJsonPrimitive = jsonElement.getAsJsonPrimitive();
            if (asJsonPrimitive.isNumber()) {
                jsonWriter.value(asJsonPrimitive.getAsNumber());
                return;
            } else if (asJsonPrimitive.isBoolean()) {
                jsonWriter.value(asJsonPrimitive.getAsBoolean());
                return;
            } else {
                jsonWriter.value(asJsonPrimitive.getAsString());
                return;
            }
        }
        if (jsonElement.isJsonArray()) {
            jsonWriter.beginArray();
            Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
            while (it.hasNext()) {
                write(jsonWriter, it.next());
            }
            jsonWriter.endArray();
            return;
        }
        if (!jsonElement.isJsonObject()) {
            throw new IllegalArgumentException("Couldn't write " + jsonElement.getClass());
        }
        jsonWriter.beginObject();
        for (Map.Entry<String, JsonElement> entry : jsonElement.getAsJsonObject().entrySet()) {
            jsonWriter.name(entry.getKey());
            write(jsonWriter, entry.getValue());
        }
        jsonWriter.endObject();
    }
}
