package y7;

import android.content.Context;
import com.stub.StubApp;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f23542a;

    /* renamed from: b, reason: collision with root package name */
    public final Locale f23543b;

    /* renamed from: c, reason: collision with root package name */
    public final c f23544c;

    public b(Context context, Locale locale, c cVar) {
        this.f23542a = context;
        this.f23543b = locale;
        this.f23544c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.formatter.DistanceFormatterOptions");
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.f23542a, bVar.f23542a) && Intrinsics.areEqual(this.f23543b, bVar.f23543b) && this.f23544c == bVar.f23544c;
    }

    public final int hashCode() {
        return ((this.f23544c.hashCode() + ((this.f23543b.hashCode() + (this.f23542a.hashCode() * 31)) * 31)) * 31) + 50;
    }

    public final String toString() {
        return StubApp.getString2(24667) + this.f23542a + StubApp.getString2(261) + this.f23543b + StubApp.getString2(24668) + this.f23544c + StubApp.getString2(24669);
    }
}
