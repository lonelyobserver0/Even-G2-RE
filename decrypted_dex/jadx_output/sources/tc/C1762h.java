package tc;

import Kc.C0104k;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: tc.h, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1762h extends S9.f {

    /* renamed from: k, reason: collision with root package name */
    public static final C1757c f21315k = new C1757c(S9.d.f6616d, Reflection.getOrCreateKotlinClass(C1762h.class), S9.s.f6666c, null);

    /* renamed from: d, reason: collision with root package name */
    public final long f21316d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21317e;

    /* renamed from: f, reason: collision with root package name */
    public final long f21318f;

    /* renamed from: g, reason: collision with root package name */
    public final EnumC1761g f21319g;

    /* renamed from: h, reason: collision with root package name */
    public final long f21320h;
    public final EnumC1759e j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1762h(long j, boolean z2, long j3, EnumC1761g byteAlignment, long j10, EnumC1759e firmwareUpgradeMode, C0104k unknownFields) {
        super(f21315k, unknownFields);
        Intrinsics.checkNotNullParameter(byteAlignment, "byteAlignment");
        Intrinsics.checkNotNullParameter(firmwareUpgradeMode, "firmwareUpgradeMode");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f21316d = j;
        this.f21317e = z2;
        this.f21318f = j3;
        this.f21319g = byteAlignment;
        this.f21320h = j10;
        this.j = firmwareUpgradeMode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1762h)) {
            return false;
        }
        C1762h c1762h = (C1762h) obj;
        return Intrinsics.areEqual(b(), c1762h.b()) && this.f21316d == c1762h.f21316d && this.f21317e == c1762h.f21317e && this.f21318f == c1762h.f21318f && this.f21319g == c1762h.f21319g && this.f21320h == c1762h.f21320h && this.j == c1762h.j;
    }

    public final int hashCode() {
        int i3 = this.f6625c;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = this.j.hashCode() + com.mapbox.common.b.b((this.f21319g.hashCode() + com.mapbox.common.b.b(i2.u.e(com.mapbox.common.b.b(b().hashCode() * 37, 37, this.f21316d), 37, this.f21317e), 37, this.f21318f)) * 37, 37, this.f21320h);
        this.f6625c = hashCode;
        return hashCode;
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StubApp.getString2(35350) + this.f21316d);
        arrayList.add(StubApp.getString2(35351) + this.f21317e);
        arrayList.add(StubApp.getString2(35352) + this.f21318f);
        arrayList.add(StubApp.getString2(35353) + this.f21319g);
        arrayList.add(StubApp.getString2(35354) + this.f21320h);
        arrayList.add(StubApp.getString2(35355) + this.j);
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), StubApp.getString2(35356), StubApp.getString2(265), 0, null, null, 56, null);
        return joinToString$default;
    }
}
