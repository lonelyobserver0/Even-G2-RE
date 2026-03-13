package S9;

import java.time.Duration;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.InstantKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends i {
    public static int j(Duration duration) {
        return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getNano() : duration.getNano() - InstantKt.NANOS_PER_SECOND;
    }

    public static long k(Duration duration) {
        return (duration.getSeconds() >= 0 || duration.getNano() == 0) ? duration.getSeconds() : duration.getSeconds() + 1;
    }

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
                Duration ofSeconds = Duration.ofSeconds(j, i3);
                Intrinsics.checkNotNullExpressionValue(ofSeconds, "ofSeconds(...)");
                return ofSeconds;
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
        Duration value = (Duration) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        int j = j(value);
        if (j != 0) {
            i.f6629g.f(writer, 2, Integer.valueOf(j));
        }
        long k3 = k(value);
        if (k3 != 0) {
            i.f6631i.f(writer, 1, Long.valueOf(k3));
        }
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        Duration value = (Duration) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        long k3 = k(value);
        if (k3 != 0) {
            i.f6631i.g(writer, 1, Long.valueOf(k3));
        }
        int j = j(value);
        if (j != 0) {
            i.f6629g.g(writer, 2, Integer.valueOf(j));
        }
    }

    @Override // S9.i
    public final int h(Object obj) {
        int i3;
        Duration value = (Duration) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        long k3 = k(value);
        if (k3 != 0) {
            i3 = i.f6631i.i(1, Long.valueOf(k3));
        } else {
            i3 = 0;
        }
        int j = j(value);
        if (j == 0) {
            return i3;
        }
        return i.f6629g.i(2, Integer.valueOf(j)) + i3;
    }
}
