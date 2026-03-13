package r9;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.geojson.FeatureCollection;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b extends TypeAdapter {
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final Object read2(JsonReader in) {
        Intrinsics.checkNotNullParameter(in, "in");
        if (in.peek() == JsonToken.NULL) {
            return null;
        }
        return FeatureCollection.fromJson(in.nextString());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter out, Object obj) {
        FeatureCollection featureCollection = (FeatureCollection) obj;
        Intrinsics.checkNotNullParameter(out, "out");
        out.value(featureCollection != null ? featureCollection.toJson() : null);
    }
}
