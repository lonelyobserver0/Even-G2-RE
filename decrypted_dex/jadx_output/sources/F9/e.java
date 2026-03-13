package F9;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f2339a;

    public e(float f10) {
        this.f2339a = f10;
        double d8 = f10;
        if (0.0d > d8 || d8 > 1.0d) {
            throw new IllegalArgumentException(StubApp.getString2(2188));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(e.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.voice.model.SpeechVolume");
        return W.a.v(Float.valueOf(this.f2339a), Float.valueOf(((e) obj).f2339a));
    }

    public final int hashCode() {
        return Float.hashCode(this.f2339a);
    }

    public final String toString() {
        return StubApp.getString2(2189) + this.f2339a + ')';
    }
}
