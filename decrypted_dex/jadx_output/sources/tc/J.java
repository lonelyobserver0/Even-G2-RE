package tc;

import Kc.C0104k;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class J extends S9.f {

    /* renamed from: g, reason: collision with root package name */
    public static final G f21283g = new G(S9.d.f6616d, Reflection.getOrCreateKotlinClass(J.class), S9.s.f6666c, null);

    /* renamed from: d, reason: collision with root package name */
    public final I f21284d;

    /* renamed from: e, reason: collision with root package name */
    public final I f21285e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f21286f;

    public /* synthetic */ J(I i3, I i10, int i11) {
        this((i11 & 1) != 0 ? I.f21271d : i3, i10, (i11 & 4) == 0, C0104k.f3820d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J)) {
            return false;
        }
        J j = (J) obj;
        return Intrinsics.areEqual(b(), j.b()) && this.f21284d == j.f21284d && this.f21285e == j.f21285e && this.f21286f == j.f21286f;
    }

    public final int hashCode() {
        int i3 = this.f6625c;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = Boolean.hashCode(this.f21286f) + ((this.f21285e.hashCode() + ((this.f21284d.hashCode() + (b().hashCode() * 37)) * 37)) * 37);
        this.f6625c = hashCode;
        return hashCode;
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StubApp.getString2(35333) + this.f21284d);
        arrayList.add(StubApp.getString2(35334) + this.f21285e);
        arrayList.add(StubApp.getString2(35335) + this.f21286f);
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), StubApp.getString2(35336), StubApp.getString2(265), 0, null, null, 56, null);
        return joinToString$default;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(I oldState, I newState, boolean z2, C0104k unknownFields) {
        super(f21283g, unknownFields);
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        Intrinsics.checkNotNullParameter(newState, "newState");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f21284d = oldState;
        this.f21285e = newState;
        this.f21286f = z2;
    }
}
