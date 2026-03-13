package com.dexterous.flutterlocalnotifications;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.stub.StubApp;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f11124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f11125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RuntimeTypeAdapterFactory f11126c;

    public k(RuntimeTypeAdapterFactory runtimeTypeAdapterFactory, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        this.f11126c = runtimeTypeAdapterFactory;
        this.f11124a = linkedHashMap;
        this.f11125b = linkedHashMap2;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final Object read2(JsonReader jsonReader) {
        String str;
        Class cls;
        String str2;
        Class cls2;
        JsonElement parse = Streams.parse(jsonReader);
        JsonObject asJsonObject = parse.getAsJsonObject();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = this.f11126c;
        str = runtimeTypeAdapterFactory.typeFieldName;
        JsonElement remove = asJsonObject.remove(str);
        String string2 = StubApp.getString2(9900);
        if (remove == null) {
            StringBuilder sb2 = new StringBuilder(string2);
            cls = runtimeTypeAdapterFactory.baseType;
            sb2.append(cls);
            sb2.append(StubApp.getString2(9903));
            str2 = runtimeTypeAdapterFactory.typeFieldName;
            sb2.append(str2);
            throw new JsonParseException(sb2.toString());
        }
        String asString = remove.getAsString();
        TypeAdapter typeAdapter = (TypeAdapter) this.f11124a.get(asString);
        if (typeAdapter != null) {
            return typeAdapter.fromJsonTree(parse);
        }
        StringBuilder sb3 = new StringBuilder(string2);
        cls2 = runtimeTypeAdapterFactory.baseType;
        sb3.append(cls2);
        sb3.append(StubApp.getString2(9901));
        sb3.append(asString);
        sb3.append(StubApp.getString2(9902));
        throw new JsonParseException(sb3.toString());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        Map map;
        String str;
        String str2;
        String str3;
        Class<?> cls = obj.getClass();
        RuntimeTypeAdapterFactory runtimeTypeAdapterFactory = this.f11126c;
        map = runtimeTypeAdapterFactory.subtypeToLabel;
        String str4 = (String) map.get(cls);
        TypeAdapter typeAdapter = (TypeAdapter) this.f11125b.get(cls);
        String string2 = StubApp.getString2(9904);
        if (typeAdapter == null) {
            throw new JsonParseException(Xa.h.k(cls, new StringBuilder(string2), StubApp.getString2(9902)));
        }
        JsonObject asJsonObject = typeAdapter.toJsonTree(obj).getAsJsonObject();
        str = runtimeTypeAdapterFactory.typeFieldName;
        if (asJsonObject.has(str)) {
            StringBuilder sb2 = new StringBuilder(string2);
            sb2.append(cls.getName());
            sb2.append(StubApp.getString2(9905));
            str2 = runtimeTypeAdapterFactory.typeFieldName;
            sb2.append(str2);
            throw new JsonParseException(sb2.toString());
        }
        JsonObject jsonObject = new JsonObject();
        str3 = runtimeTypeAdapterFactory.typeFieldName;
        jsonObject.add(str3, new JsonPrimitive(str4));
        for (Map.Entry<String, JsonElement> entry : asJsonObject.entrySet()) {
            jsonObject.add(entry.getKey(), entry.getValue());
        }
        Streams.write(jsonObject, jsonWriter);
    }
}
