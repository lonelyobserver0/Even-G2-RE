package E9;

import android.media.AudioAttributes;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final G9.c f2101a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioAttributes.Builder f2102b;

    public r(G9.c options, AudioAttributes.Builder builder) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f2101a = options;
        this.f2102b = builder;
    }

    public final AudioAttributes a(F9.a owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        AudioAttributes build = this.f2102b.setUsage(12).setContentType(2).build();
        Intrinsics.checkNotNullExpressionValue(build, "builder\n            .let…   }\n            .build()");
        return build;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.areEqual(this.f2101a, rVar.f2101a) && Intrinsics.areEqual(this.f2102b, rVar.f2102b);
    }

    public final int hashCode() {
        return this.f2102b.hashCode() + (this.f2101a.hashCode() * 31);
    }

    public final String toString() {
        return StubApp.getString2(1963) + this.f2101a + StubApp.getString2(1964) + this.f2102b + ')';
    }
}
