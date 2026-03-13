package G9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.voice.options.MapboxSpeechApiOptions");
        ((a) obj).getClass();
        return Intrinsics.areEqual("https://api.mapbox.com", "https://api.mapbox.com") && Intrinsics.areEqual((Object) null, (Object) null);
    }

    public final int hashCode() {
        return -1276694085;
    }

    public final String toString() {
        return StubApp.getString2(2329);
    }
}
