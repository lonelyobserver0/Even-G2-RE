package tc;

import Kc.C0104k;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class x extends S9.f {

    /* renamed from: g, reason: collision with root package name */
    public static final w f21373g = new w(S9.d.f6616d, Reflection.getOrCreateKotlinClass(x.class), S9.s.f6666c, null);

    /* renamed from: d, reason: collision with root package name */
    public final long f21374d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21375e;

    /* renamed from: f, reason: collision with root package name */
    public final double f21376f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(long j, long j3, double d8, C0104k unknownFields) {
        super(f21373g, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f21374d = j;
        this.f21375e = j3;
        this.f21376f = d8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return Intrinsics.areEqual(b(), xVar.b()) && this.f21374d == xVar.f21374d && this.f21375e == xVar.f21375e && this.f21376f == xVar.f21376f;
    }

    public final int hashCode() {
        int i3 = this.f6625c;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = Double.hashCode(this.f21376f) + com.mapbox.common.b.b(com.mapbox.common.b.b(b().hashCode() * 37, 37, this.f21374d), 37, this.f21375e);
        this.f6625c = hashCode;
        return hashCode;
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StubApp.getString2(35385) + this.f21374d);
        arrayList.add(StubApp.getString2(35386) + this.f21375e);
        arrayList.add(StubApp.getString2(35387) + this.f21376f);
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), StubApp.getString2(35388), StubApp.getString2(265), 0, null, null, 56, null);
        return joinToString$default;
    }
}
