package G9;

import com.stub.StubApp;
import i2.u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.voice.options.VoiceInstructionsPlayerOptions");
        ((c) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(0L) + u.e(u.e(88758983, 31, false), 31, true);
    }

    public final String toString() {
        return StubApp.getString2(2330);
    }
}
