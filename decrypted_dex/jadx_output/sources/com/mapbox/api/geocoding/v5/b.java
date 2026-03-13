package com.mapbox.api.geocoding.v5;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.GsonTypes;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final TypeAdapter f12281a;

    static {
        new TypeAdapterFactory() { // from class: com.mapbox.api.geocoding.v5.SingleElementSafeListTypeAdapter$1
            @Override // com.google.gson.TypeAdapterFactory
            public final TypeAdapter create(Gson gson, TypeToken typeToken) {
                Class rawType = typeToken.getRawType();
                if (List.class.isAssignableFrom(rawType)) {
                    return new b(gson.getAdapter(TypeToken.get(GsonTypes.getCollectionElementType(typeToken.getType(), rawType))));
                }
                return null;
            }
        };
    }

    public b(TypeAdapter typeAdapter) {
        this.f12281a = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final Object read2(JsonReader jsonReader) {
        JsonToken peek = jsonReader.peek();
        ArrayList arrayList = new ArrayList();
        int i3 = a.f12280a[peek.ordinal()];
        TypeAdapter typeAdapter = this.f12281a;
        switch (i3) {
            case 1:
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(typeAdapter.read2(jsonReader));
                }
                jsonReader.endArray();
                return arrayList;
            case 2:
            case 3:
            case 4:
            case 5:
                arrayList.add(typeAdapter.read2(jsonReader));
                return arrayList;
            case 6:
                jsonReader.nextNull();
                return null;
            case 7:
            case 8:
            case 9:
            case 10:
                throw new MalformedJsonException(StubApp.getString2(13144) + peek);
            default:
                throw new IllegalStateException(StubApp.getString2(13143) + peek);
        }
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, Object obj) {
        List list = (List) obj;
        if (list == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f12281a.write(jsonWriter, it.next());
        }
        jsonWriter.endArray();
    }
}
