package A3;

import android.util.JsonReader;
import android.util.JsonToken;
import com.stub.StubApp;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final long f213a;

    public v(long j) {
        this.f213a = j;
    }

    public static v a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals(StubApp.getString2("338"))) {
                    return jsonReader.peek() == JsonToken.STRING ? new v(Long.parseLong(jsonReader.nextString())) : new v(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException(StubApp.getString2("339"));
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            if (this.f213a == ((v) obj).f213a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f213a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return Xa.h.q(new StringBuilder(StubApp.getString2(340)), this.f213a, StubApp.getString2(265));
    }
}
