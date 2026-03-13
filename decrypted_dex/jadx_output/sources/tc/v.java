package tc;

import Kc.C0104k;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class v extends S9.f {

    /* renamed from: h, reason: collision with root package name */
    public static final u f21368h = new u(S9.d.f6616d, Reflection.getOrCreateKotlinClass(v.class), S9.s.f6666c, null);

    /* renamed from: d, reason: collision with root package name */
    public final String f21369d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21370e;

    /* renamed from: f, reason: collision with root package name */
    public final C1756b f21371f;

    /* renamed from: g, reason: collision with root package name */
    public final t f21372g;

    public /* synthetic */ v(String str, t tVar, int i3) {
        this(str, (i3 & 2) == 0, null, (i3 & 8) != 0 ? null : tVar, C0104k.f3820d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.areEqual(b(), vVar.b()) && Intrinsics.areEqual(this.f21369d, vVar.f21369d) && this.f21370e == vVar.f21370e && Intrinsics.areEqual(this.f21371f, vVar.f21371f) && Intrinsics.areEqual(this.f21372g, vVar.f21372g);
    }

    public final int hashCode() {
        int i3 = this.f6625c;
        if (i3 != 0) {
            return i3;
        }
        int e10 = i2.u.e(i2.u.d(b().hashCode() * 37, 37, this.f21369d), 37, this.f21370e);
        C1756b c1756b = this.f21371f;
        int hashCode = (e10 + (c1756b != null ? c1756b.hashCode() : 0)) * 37;
        t tVar = this.f21372g;
        int hashCode2 = hashCode + (tVar != null ? tVar.hashCode() : 0);
        this.f6625c = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StubApp.getString2(35320) + L1.E(this.f21369d));
        arrayList.add(StubApp.getString2(35337) + this.f21370e);
        C1756b c1756b = this.f21371f;
        if (c1756b != null) {
            arrayList.add(StubApp.getString2(35338) + c1756b);
        }
        t tVar = this.f21372g;
        if (tVar != null) {
            arrayList.add(StubApp.getString2(35323) + tVar);
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), StubApp.getString2(35384), StubApp.getString2(265), 0, null, null, 56, null);
        return joinToString$default;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(String uuid, boolean z2, C1756b c1756b, t tVar, C0104k unknownFields) {
        super(f21368h, unknownFields);
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f21369d = uuid;
        this.f21370e = z2;
        this.f21371f = c1756b;
        this.f21372g = tVar;
    }
}
