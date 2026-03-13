package com.mapbox.geojson.internal.typeadapters;

import Xa.h;
import androidx.annotation.Keep;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.stub.StubApp;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

@Keep
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class RuntimeTypeAdapterFactory<T> implements TypeAdapterFactory {
    private final Class<?> baseType;
    private final boolean maintainType;
    private final String typeFieldName;
    private final Map<String, Class<?>> labelToSubtype = new LinkedHashMap();
    private final Map<Class<?>, String> subtypeToLabel = new LinkedHashMap();

    private RuntimeTypeAdapterFactory(Class<?> cls, String str, boolean z2) {
        if (str == null || cls == null) {
            throw null;
        }
        this.baseType = cls;
        this.typeFieldName = str;
        this.maintainType = z2;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str, boolean z2) {
        return new RuntimeTypeAdapterFactory<>(cls, str, z2);
    }

    @Override // com.google.gson.TypeAdapterFactory
    public <R> TypeAdapter<R> create(Gson gson, TypeToken<R> typeToken) {
        if (typeToken.getRawType() != this.baseType) {
            return null;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry<String, Class<?>> entry : this.labelToSubtype.entrySet()) {
            TypeAdapter<T> delegateAdapter = gson.getDelegateAdapter(this, TypeToken.get((Class) entry.getValue()));
            linkedHashMap.put(entry.getKey(), delegateAdapter);
            linkedHashMap2.put(entry.getValue(), delegateAdapter);
        }
        return new TypeAdapter<R>() { // from class: com.mapbox.geojson.internal.typeadapters.RuntimeTypeAdapterFactory.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: read */
            public R read2(JsonReader jsonReader) throws IOException {
                JsonElement parse = Streams.parse(jsonReader);
                JsonElement remove = RuntimeTypeAdapterFactory.this.maintainType ? parse.getAsJsonObject().get(RuntimeTypeAdapterFactory.this.typeFieldName) : parse.getAsJsonObject().remove(RuntimeTypeAdapterFactory.this.typeFieldName);
                String string2 = StubApp.getString2(9900);
                if (remove == null) {
                    throw new JsonParseException(string2 + RuntimeTypeAdapterFactory.this.baseType + StubApp.getString2(9903) + RuntimeTypeAdapterFactory.this.typeFieldName);
                }
                String asString = remove.getAsString();
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap.get(asString);
                if (typeAdapter != null) {
                    return (R) typeAdapter.fromJsonTree(parse);
                }
                throw new JsonParseException(string2 + RuntimeTypeAdapterFactory.this.baseType + StubApp.getString2(9901) + asString + StubApp.getString2(9902));
            }

            @Override // com.google.gson.TypeAdapter
            public void write(JsonWriter jsonWriter, R r8) throws IOException {
                Class<?> cls = r8.getClass();
                TypeAdapter typeAdapter = (TypeAdapter) linkedHashMap2.get(cls);
                String string2 = StubApp.getString2(9904);
                if (typeAdapter == null) {
                    throw new JsonParseException(h.k(cls, new StringBuilder(string2), StubApp.getString2(9902)));
                }
                JsonObject asJsonObject = typeAdapter.toJsonTree(r8).getAsJsonObject();
                if (RuntimeTypeAdapterFactory.this.maintainType) {
                    Streams.write(asJsonObject, jsonWriter);
                    return;
                }
                JsonObject jsonObject = new JsonObject();
                if (asJsonObject.has(RuntimeTypeAdapterFactory.this.typeFieldName)) {
                    StringBuilder sb2 = new StringBuilder(string2);
                    h.w(cls, sb2, StubApp.getString2(9905));
                    sb2.append(RuntimeTypeAdapterFactory.this.typeFieldName);
                    throw new JsonParseException(sb2.toString());
                }
                jsonObject.add(RuntimeTypeAdapterFactory.this.typeFieldName, new JsonPrimitive((String) RuntimeTypeAdapterFactory.this.subtypeToLabel.get(cls)));
                for (Map.Entry<String, JsonElement> entry2 : asJsonObject.entrySet()) {
                    jsonObject.add(entry2.getKey(), entry2.getValue());
                }
                Streams.write(jsonObject, jsonWriter);
            }
        }.nullSafe();
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls, String str) {
        if (cls == null || str == null) {
            throw null;
        }
        if (this.subtypeToLabel.containsKey(cls) || this.labelToSubtype.containsKey(str)) {
            throw new IllegalArgumentException(StubApp.getString2(9885));
        }
        this.labelToSubtype.put(str, cls);
        this.subtypeToLabel.put(cls, str);
        return this;
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls, String str) {
        return new RuntimeTypeAdapterFactory<>(cls, str, false);
    }

    public static <T> RuntimeTypeAdapterFactory<T> of(Class<T> cls) {
        return new RuntimeTypeAdapterFactory<>(cls, StubApp.getString2(660), false);
    }

    public RuntimeTypeAdapterFactory<T> registerSubtype(Class<? extends T> cls) {
        return registerSubtype(cls, cls.getSimpleName());
    }
}
