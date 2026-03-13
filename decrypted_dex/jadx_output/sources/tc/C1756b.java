package tc;

import Kc.C0104k;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: tc.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1756b extends S9.f {

    /* renamed from: e, reason: collision with root package name */
    public static final C1755a f21296e = new C1755a(S9.d.f6616d, Reflection.getOrCreateKotlinClass(C1756b.class), S9.s.f6666c, null);

    /* renamed from: d, reason: collision with root package name */
    public final String f21297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1756b(C0104k unknownFields, String localizedDescription) {
        super(f21296e, unknownFields);
        Intrinsics.checkNotNullParameter(localizedDescription, "localizedDescription");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f21297d = localizedDescription;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1756b)) {
            return false;
        }
        C1756b c1756b = (C1756b) obj;
        return Intrinsics.areEqual(b(), c1756b.b()) && Intrinsics.areEqual(this.f21297d, c1756b.f21297d);
    }

    public final int hashCode() {
        int i3 = this.f6625c;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = this.f21297d.hashCode() + (b().hashCode() * 37);
        this.f6625c = hashCode;
        return hashCode;
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StubApp.getString2(35343) + L1.E(this.f21297d));
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), StubApp.getString2(35344), StubApp.getString2(265), 0, null, null, 56, null);
        return joinToString$default;
    }
}
