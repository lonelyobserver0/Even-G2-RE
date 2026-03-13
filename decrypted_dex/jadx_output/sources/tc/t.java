package tc;

import Kc.C0104k;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class t extends S9.f {

    /* renamed from: h, reason: collision with root package name */
    public static final o f21363h = new o(S9.d.f6616d, Reflection.getOrCreateKotlinClass(t.class), S9.s.f6666c, null);

    /* renamed from: d, reason: collision with root package name */
    public final String f21364d;

    /* renamed from: e, reason: collision with root package name */
    public final q f21365e;

    /* renamed from: f, reason: collision with root package name */
    public final s f21366f;

    /* renamed from: g, reason: collision with root package name */
    public final long f21367g;

    public /* synthetic */ t(String str, s sVar, long j) {
        this(str, q.f21349n, sVar, j, C0104k.f3820d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(b(), tVar.b()) && Intrinsics.areEqual(this.f21364d, tVar.f21364d) && this.f21365e == tVar.f21365e && this.f21366f == tVar.f21366f && this.f21367g == tVar.f21367g;
    }

    public final int hashCode() {
        int i3 = this.f6625c;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = Long.hashCode(this.f21367g) + ((this.f21366f.hashCode() + ((this.f21365e.hashCode() + i2.u.d(b().hashCode() * 37, 37, this.f21364d)) * 37)) * 37);
        this.f6625c = hashCode;
        return hashCode;
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StubApp.getString2(35379) + L1.E(this.f21364d));
        arrayList.add(StubApp.getString2(35380) + this.f21365e);
        arrayList.add(StubApp.getString2(35381) + this.f21366f);
        arrayList.add(StubApp.getString2(35382) + this.f21367g);
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), StubApp.getString2(35383), StubApp.getString2(265), 0, null, null, 56, null);
        return joinToString$default;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String message, q logCategory, s logLevel, long j, C0104k unknownFields) {
        super(f21363h, unknownFields);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(logCategory, "logCategory");
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f21364d = message;
        this.f21365e = logCategory;
        this.f21366f = logLevel;
        this.f21367g = j;
    }
}
