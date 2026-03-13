package tc;

import Kc.C0104k;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: tc.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1764j extends S9.f {

    /* renamed from: h, reason: collision with root package name */
    public static final C1763i f21321h = new C1763i(S9.d.f6616d, Reflection.getOrCreateKotlinClass(C1764j.class), S9.s.f6666c, null);

    /* renamed from: d, reason: collision with root package name */
    public final int f21322d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f21323e;

    /* renamed from: f, reason: collision with root package name */
    public final C0104k f21324f;

    /* renamed from: g, reason: collision with root package name */
    public final C0104k f21325g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1764j(int i3, Integer num, C0104k c0104k, C0104k data_, C0104k unknownFields) {
        super(f21321h, unknownFields);
        Intrinsics.checkNotNullParameter(data_, "data_");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f21322d = i3;
        this.f21323e = num;
        this.f21324f = c0104k;
        this.f21325g = data_;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1764j)) {
            return false;
        }
        C1764j c1764j = (C1764j) obj;
        return Intrinsics.areEqual(b(), c1764j.b()) && this.f21322d == c1764j.f21322d && Intrinsics.areEqual(this.f21323e, c1764j.f21323e) && Intrinsics.areEqual(this.f21324f, c1764j.f21324f) && Intrinsics.areEqual(this.f21325g, c1764j.f21325g);
    }

    public final int hashCode() {
        int i3 = this.f6625c;
        if (i3 != 0) {
            return i3;
        }
        int e10 = E1.a.e(this.f21322d, b().hashCode() * 37, 37);
        Integer num = this.f21323e;
        int hashCode = (e10 + (num != null ? num.hashCode() : 0)) * 37;
        C0104k c0104k = this.f21324f;
        int hashCode2 = this.f21325g.hashCode() + ((hashCode + (c0104k != null ? c0104k.hashCode() : 0)) * 37);
        this.f6625c = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StubApp.getString2(35357) + this.f21322d);
        Integer num = this.f21323e;
        if (num != null) {
            arrayList.add(StubApp.getString2(35358) + num);
        }
        C0104k c0104k = this.f21324f;
        if (c0104k != null) {
            arrayList.add(StubApp.getString2(35326) + c0104k);
        }
        arrayList.add(StubApp.getString2(35359) + this.f21325g);
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), StubApp.getString2(35360), StubApp.getString2(265), 0, null, null, 56, null);
        return joinToString$default;
    }
}
