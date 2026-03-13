package Q8;

import com.stub.StubApp;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final List f5766a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5767b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5768c;

    public a(int i3, int i10, List coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f5766a = coordinates;
        this.f5767b = i3;
        this.f5768c = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f5766a, aVar.f5766a) && this.f5767b == aVar.f5767b && this.f5768c == aVar.f5768c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f5768c) + E1.a.e(this.f5767b, this.f5766a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(5313));
        sb2.append(this.f5766a);
        sb2.append(StubApp.getString2(5314));
        sb2.append(this.f5767b);
        sb2.append(StubApp.getString2(5315));
        return com.mapbox.common.b.j(sb2, this.f5768c, ')');
    }
}
