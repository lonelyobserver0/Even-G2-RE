package L8;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f4317a;

    /* renamed from: b, reason: collision with root package name */
    public final c f4318b;

    public f(String reason, c cVar) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f4317a = reason;
        this.f4318b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.core.preview.RoutesPreviewUpdate");
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f4317a, fVar.f4317a) && Intrinsics.areEqual(this.f4318b, fVar.f4318b);
    }

    public final int hashCode() {
        int hashCode = this.f4317a.hashCode() * 31;
        c cVar = this.f4318b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return StubApp.getString2(3462) + this.f4317a + StubApp.getString2(3463) + this.f4318b + ')';
    }
}
