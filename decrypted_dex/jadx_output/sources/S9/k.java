package S9;

import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class k extends i {
    @Override // S9.i
    public final Object b(o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        long d8 = reader.d();
        long j = 0;
        int i3 = 0;
        while (true) {
            int g10 = reader.g();
            if (g10 == -1) {
                reader.e(d8);
                Instant ofEpochSecond = Instant.ofEpochSecond(j, i3);
                Intrinsics.checkNotNullExpressionValue(ofEpochSecond, "ofEpochSecond(...)");
                return ofEpochSecond;
            }
            if (g10 == 1) {
                j = ((Number) i.f6631i.b(reader)).longValue();
            } else if (g10 != 2) {
                reader.j(g10);
            } else {
                i3 = ((Number) i.f6629g.b(reader)).intValue();
            }
        }
    }

    @Override // S9.i
    public final void d(r writer, Object obj) {
        Instant value = (Instant) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        int nano = value.getNano();
        if (nano != 0) {
            i.f6629g.f(writer, 2, Integer.valueOf(nano));
        }
        long epochSecond = value.getEpochSecond();
        if (epochSecond != 0) {
            i.f6631i.f(writer, 1, Long.valueOf(epochSecond));
        }
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        Instant value = (Instant) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        long epochSecond = value.getEpochSecond();
        if (epochSecond != 0) {
            i.f6631i.g(writer, 1, Long.valueOf(epochSecond));
        }
        int nano = value.getNano();
        if (nano != 0) {
            i.f6629g.g(writer, 2, Integer.valueOf(nano));
        }
    }

    @Override // S9.i
    public final int h(Object obj) {
        int i3;
        Instant value = (Instant) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        long epochSecond = value.getEpochSecond();
        if (epochSecond != 0) {
            i3 = i.f6631i.i(1, Long.valueOf(epochSecond));
        } else {
            i3 = 0;
        }
        int nano = value.getNano();
        if (nano == 0) {
            return i3;
        }
        return i.f6629g.i(2, Integer.valueOf(nano)) + i3;
    }
}
