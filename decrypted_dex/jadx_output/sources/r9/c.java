package r9;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c extends TypeAdapter {
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public final Object read2(JsonReader in) {
        Intrinsics.checkNotNullParameter(in, "in");
        Integer num = null;
        if (in.peek() == JsonToken.NULL) {
            return null;
        }
        in.beginObject();
        Integer num2 = null;
        for (int i3 = 0; i3 < 2; i3++) {
            String nextName = in.nextName();
            if (Intrinsics.areEqual(nextName, "first")) {
                num = Integer.valueOf(in.nextInt());
            } else if (Intrinsics.areEqual(nextName, "last")) {
                num2 = Integer.valueOf(in.nextInt());
            }
        }
        in.endObject();
        Intrinsics.checkNotNull(num);
        int intValue = num.intValue();
        Intrinsics.checkNotNull(num2);
        return new IntRange(intValue, num2.intValue());
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter out, Object obj) {
        IntRange intRange = (IntRange) obj;
        Intrinsics.checkNotNullParameter(out, "out");
        if (intRange == null) {
            out.nullValue();
            return;
        }
        out.beginObject();
        out.name(StubApp.getString2(22746)).value(Integer.valueOf(intRange.getFirst()));
        out.name(StubApp.getString2(22747)).value(Integer.valueOf(intRange.getLast()));
        out.endObject();
    }
}
