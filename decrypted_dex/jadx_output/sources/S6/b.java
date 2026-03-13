package S6;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f6594a = new b();

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        ((b) obj).getClass();
        return Intrinsics.areEqual("map", "map");
    }

    @Override // S6.c
    public final String getValue() {
        return StubApp.getString2(6015);
    }

    public final int hashCode() {
        return 107868;
    }

    public final String toString() {
        return StubApp.getString2(6016);
    }
}
