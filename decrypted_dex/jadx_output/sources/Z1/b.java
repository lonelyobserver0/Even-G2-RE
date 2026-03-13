package Z1;

import android.graphics.Rect;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f8945a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8946b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8947c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8948d;

    public b(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        int i3 = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        this.f8945a = i3;
        this.f8946b = i10;
        this.f8947c = i11;
        this.f8948d = i12;
        if (i3 > i11) {
            throw new IllegalArgumentException(Xa.h.o(StubApp.getString2(7600), i3, i11, StubApp.getString2(7601)).toString());
        }
        if (i10 > i12) {
            throw new IllegalArgumentException(Xa.h.o(StubApp.getString2(7598), i10, i12, StubApp.getString2(7599)).toString());
        }
    }

    public final Rect a() {
        return new Rect(this.f8945a, this.f8946b, this.f8947c, this.f8948d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f8945a == bVar.f8945a && this.f8946b == bVar.f8946b && this.f8947c == bVar.f8947c && this.f8948d == bVar.f8948d;
    }

    public final int hashCode() {
        return (((((this.f8945a * 31) + this.f8946b) * 31) + this.f8947c) * 31) + this.f8948d;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(b.class.getSimpleName());
        sb2.append(StubApp.getString2(7602));
        sb2.append(this.f8945a);
        sb2.append(',');
        sb2.append(this.f8946b);
        sb2.append(',');
        sb2.append(this.f8947c);
        sb2.append(',');
        return AbstractC1482f.f(this.f8948d, StubApp.getString2(7603), sb2);
    }
}
