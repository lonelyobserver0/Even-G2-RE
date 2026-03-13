package tc;

import Kc.C0104k;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: tc.B, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1752B extends S9.f {

    /* renamed from: f, reason: collision with root package name */
    public static final C1751A f21258f = new C1751A(S9.d.f6616d, Reflection.getOrCreateKotlinClass(C1752B.class), S9.s.f6666c, null);

    /* renamed from: d, reason: collision with root package name */
    public final String f21259d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21260e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1752B(String uuid, boolean z2, C0104k unknownFields) {
        super(f21258f, unknownFields);
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f21259d = uuid;
        this.f21260e = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1752B)) {
            return false;
        }
        C1752B c1752b = (C1752B) obj;
        return Intrinsics.areEqual(b(), c1752b.b()) && Intrinsics.areEqual(this.f21259d, c1752b.f21259d) && this.f21260e == c1752b.f21260e;
    }

    public final int hashCode() {
        int i3 = this.f6625c;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = Boolean.hashCode(this.f21260e) + i2.u.d(b().hashCode() * 37, 37, this.f21259d);
        this.f6625c = hashCode;
        return hashCode;
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StubApp.getString2(35320) + L1.E(this.f21259d));
        arrayList.add(StubApp.getString2(35321) + this.f21260e);
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), StubApp.getString2(35322), StubApp.getString2(265), 0, null, null, 56, null);
        return joinToString$default;
    }
}
