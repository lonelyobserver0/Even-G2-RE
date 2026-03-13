package tc;

import Kc.C0104k;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: tc.l, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1766l extends S9.f {

    /* renamed from: n, reason: collision with root package name */
    public static final C1765k f21326n = new C1765k(S9.d.f6616d, Reflection.getOrCreateKotlinClass(C1766l.class), S9.s.f6666c, null);

    /* renamed from: d, reason: collision with root package name */
    public final long f21327d;

    /* renamed from: e, reason: collision with root package name */
    public final long f21328e;

    /* renamed from: f, reason: collision with root package name */
    public final String f21329f;

    /* renamed from: g, reason: collision with root package name */
    public final C0104k f21330g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f21331h;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f21332k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f21333l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f21334m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1766l(long j, long j3, String str, C0104k hash, boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, C0104k unknownFields) {
        super(f21326n, unknownFields);
        Intrinsics.checkNotNullParameter(hash, "hash");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f21327d = j;
        this.f21328e = j3;
        this.f21329f = str;
        this.f21330g = hash;
        this.f21331h = z2;
        this.j = z10;
        this.f21332k = z11;
        this.f21333l = z12;
        this.f21334m = z13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1766l)) {
            return false;
        }
        C1766l c1766l = (C1766l) obj;
        return Intrinsics.areEqual(b(), c1766l.b()) && this.f21327d == c1766l.f21327d && this.f21328e == c1766l.f21328e && Intrinsics.areEqual(this.f21329f, c1766l.f21329f) && Intrinsics.areEqual(this.f21330g, c1766l.f21330g) && this.f21331h == c1766l.f21331h && this.j == c1766l.j && this.f21332k == c1766l.f21332k && this.f21333l == c1766l.f21333l && this.f21334m == c1766l.f21334m;
    }

    public final int hashCode() {
        int i3 = this.f6625c;
        if (i3 != 0) {
            return i3;
        }
        int b2 = com.mapbox.common.b.b(com.mapbox.common.b.b(b().hashCode() * 37, 37, this.f21327d), 37, this.f21328e);
        String str = this.f21329f;
        int hashCode = Boolean.hashCode(this.f21334m) + i2.u.e(i2.u.e(i2.u.e(i2.u.e((this.f21330g.hashCode() + ((b2 + (str != null ? str.hashCode() : 0)) * 37)) * 37, 37, this.f21331h), 37, this.j), 37, this.f21332k), 37, this.f21333l);
        this.f6625c = hashCode;
        return hashCode;
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StubApp.getString2(35357) + this.f21327d);
        arrayList.add(StubApp.getString2(35358) + this.f21328e);
        String str = this.f21329f;
        if (str != null) {
            arrayList.add(StubApp.getString2(35361) + L1.E(str));
        }
        arrayList.add(StubApp.getString2(35326) + this.f21330g);
        arrayList.add(StubApp.getString2(35362) + this.f21331h);
        arrayList.add(StubApp.getString2(35363) + this.j);
        arrayList.add(StubApp.getString2(35364) + this.f21332k);
        arrayList.add(StubApp.getString2(35365) + this.f21333l);
        arrayList.add(StubApp.getString2(35366) + this.f21334m);
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), StubApp.getString2(35367), StubApp.getString2(265), 0, null, null, 56, null);
        return joinToString$default;
    }
}
