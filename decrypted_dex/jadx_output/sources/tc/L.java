package tc;

import Kc.C0104k;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class L extends S9.f {

    /* renamed from: h, reason: collision with root package name */
    public static final K f21287h = new K(S9.d.f6616d, Reflection.getOrCreateKotlinClass(L.class), S9.s.f6666c, null);

    /* renamed from: d, reason: collision with root package name */
    public final String f21288d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21289e;

    /* renamed from: f, reason: collision with root package name */
    public final C1756b f21290f;

    /* renamed from: g, reason: collision with root package name */
    public final J f21291g;

    public /* synthetic */ L(String str, C1756b c1756b, J j, int i3) {
        this(str, (i3 & 2) == 0, (i3 & 4) != 0 ? null : c1756b, (i3 & 8) != 0 ? null : j, C0104k.f3820d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l9 = (L) obj;
        return Intrinsics.areEqual(b(), l9.b()) && Intrinsics.areEqual(this.f21288d, l9.f21288d) && this.f21289e == l9.f21289e && Intrinsics.areEqual(this.f21290f, l9.f21290f) && Intrinsics.areEqual(this.f21291g, l9.f21291g);
    }

    public final int hashCode() {
        int i3 = this.f6625c;
        if (i3 != 0) {
            return i3;
        }
        int e10 = i2.u.e(i2.u.d(b().hashCode() * 37, 37, this.f21288d), 37, this.f21289e);
        C1756b c1756b = this.f21290f;
        int hashCode = (e10 + (c1756b != null ? c1756b.hashCode() : 0)) * 37;
        J j = this.f21291g;
        int hashCode2 = hashCode + (j != null ? j.hashCode() : 0);
        this.f6625c = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StubApp.getString2(35320) + L1.E(this.f21288d));
        arrayList.add(StubApp.getString2(35337) + this.f21289e);
        C1756b c1756b = this.f21290f;
        if (c1756b != null) {
            arrayList.add(StubApp.getString2(35338) + c1756b);
        }
        J j = this.f21291g;
        if (j != null) {
            arrayList.add(StubApp.getString2(35339) + j);
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), StubApp.getString2(35340), StubApp.getString2(265), 0, null, null, 56, null);
        return joinToString$default;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(String uuid, boolean z2, C1756b c1756b, J j, C0104k unknownFields) {
        super(f21287h, unknownFields);
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f21288d = uuid;
        this.f21289e = z2;
        this.f21290f = c1756b;
        this.f21291g = j;
    }
}
