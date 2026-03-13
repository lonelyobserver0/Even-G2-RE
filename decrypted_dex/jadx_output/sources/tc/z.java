package tc;

import Kc.C0104k;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class z extends S9.f {

    /* renamed from: h, reason: collision with root package name */
    public static final y f21377h = new y(S9.d.f6616d, Reflection.getOrCreateKotlinClass(z.class), S9.s.f6666c, null);

    /* renamed from: d, reason: collision with root package name */
    public final String f21378d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21379e;

    /* renamed from: f, reason: collision with root package name */
    public final C1756b f21380f;

    /* renamed from: g, reason: collision with root package name */
    public final x f21381g;

    public /* synthetic */ z(String str, x xVar, int i3) {
        this(str, (i3 & 2) == 0, null, (i3 & 8) != 0 ? null : xVar, C0104k.f3820d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.areEqual(b(), zVar.b()) && Intrinsics.areEqual(this.f21378d, zVar.f21378d) && this.f21379e == zVar.f21379e && Intrinsics.areEqual(this.f21380f, zVar.f21380f) && Intrinsics.areEqual(this.f21381g, zVar.f21381g);
    }

    public final int hashCode() {
        int i3 = this.f6625c;
        if (i3 != 0) {
            return i3;
        }
        int e10 = i2.u.e(i2.u.d(b().hashCode() * 37, 37, this.f21378d), 37, this.f21379e);
        C1756b c1756b = this.f21380f;
        int hashCode = (e10 + (c1756b != null ? c1756b.hashCode() : 0)) * 37;
        x xVar = this.f21381g;
        int hashCode2 = hashCode + (xVar != null ? xVar.hashCode() : 0);
        this.f6625c = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StubApp.getString2(35320) + L1.E(this.f21378d));
        arrayList.add(StubApp.getString2(35337) + this.f21379e);
        C1756b c1756b = this.f21380f;
        if (c1756b != null) {
            arrayList.add(StubApp.getString2(35338) + c1756b);
        }
        x xVar = this.f21381g;
        if (xVar != null) {
            arrayList.add(StubApp.getString2(35389) + xVar);
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), StubApp.getString2(35390), StubApp.getString2(265), 0, null, null, 56, null);
        return joinToString$default;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(String uuid, boolean z2, C1756b c1756b, x xVar, C0104k unknownFields) {
        super(f21377h, unknownFields);
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f21378d = uuid;
        this.f21379e = z2;
        this.f21380f = c1756b;
        this.f21381g = xVar;
    }
}
