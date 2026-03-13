package H5;

import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final String f2757a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2758b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2759c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2760d;

    public D(String processName, int i3, int i10, boolean z2) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.f2757a = processName;
        this.f2758b = i3;
        this.f2759c = i10;
        this.f2760d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d8 = (D) obj;
        return Intrinsics.areEqual(this.f2757a, d8.f2757a) && this.f2758b == d8.f2758b && this.f2759c == d8.f2759c && this.f2760d == d8.f2760d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int e10 = E1.a.e(this.f2759c, E1.a.e(this.f2758b, this.f2757a.hashCode() * 31, 31), 31);
        boolean z2 = this.f2760d;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        return e10 + i3;
    }

    public final String toString() {
        return StubApp.getString2(2562) + this.f2757a + StubApp.getString2(2563) + this.f2758b + StubApp.getString2(2564) + this.f2759c + StubApp.getString2(2565) + this.f2760d + ')';
    }
}
