package z7;

import com.stub.StubApp;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: z7.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C2014b {

    /* renamed from: a, reason: collision with root package name */
    public final int f24130a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24131b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f24132c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f24133d;

    public C2014b(int i3, int i10, Integer num, HashMap experimentalProperties) {
        Intrinsics.checkNotNullParameter(experimentalProperties, "experimentalProperties");
        this.f24130a = i3;
        this.f24131b = i10;
        this.f24132c = num;
        this.f24133d = experimentalProperties;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(C2014b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.mapbox.navigation.base.internal.RouteRefreshRequestData");
        C2014b c2014b = (C2014b) obj;
        return this.f24130a == c2014b.f24130a && this.f24131b == c2014b.f24131b && Intrinsics.areEqual(this.f24132c, c2014b.f24132c) && Intrinsics.areEqual(this.f24133d, c2014b.f24133d);
    }

    public final int hashCode() {
        int i3 = ((this.f24130a * 31) + this.f24131b) * 31;
        Integer num = this.f24132c;
        return this.f24133d.hashCode() + ((i3 + (num != null ? num.intValue() : 0)) * 31);
    }

    public final String toString() {
        return StubApp.getString2(24929) + this.f24130a + StubApp.getString2(2689) + this.f24131b + StubApp.getString2(2690) + this.f24132c + StubApp.getString2(24930) + this.f24133d + ')';
    }
}
