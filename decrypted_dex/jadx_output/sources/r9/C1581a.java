package r9;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxStyleException;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r9.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1581a extends TypeAdapter {
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final Object read2(JsonReader in) {
        Intrinsics.checkNotNullParameter(in, "in");
        if (in.peek() == JsonToken.NULL) {
            return null;
        }
        String expression = in.nextString();
        Intrinsics.checkNotNullExpressionValue(expression, "`in`.nextString()");
        Intrinsics.checkNotNullParameter(expression, "expression");
        Expected<String, Value> fromJson = Value.fromJson(expression);
        if (fromJson != null) {
            String error = fromJson.getError();
            if (error != null) {
                throw new MapboxStyleException(error);
            }
            Value value = fromJson.getValue();
            if (value != null) {
                Intrinsics.checkNotNullExpressionValue(value, "fromJson(expression).take()");
                return a4.f.z(value);
            }
        }
        throw new MapboxStyleException(StubApp.getString2(4403));
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter out, Object obj) {
        N6.d dVar = (N6.d) obj;
        Intrinsics.checkNotNullParameter(out, "out");
        out.value(dVar != null ? dVar.toJson() : null);
    }
}
