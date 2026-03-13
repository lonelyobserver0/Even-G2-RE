package tc;

import Kc.C0104k;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: tc.n, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1768n extends S9.f {

    /* renamed from: g, reason: collision with root package name */
    public static final C1767m f21335g = new C1767m(S9.d.f6616d, Reflection.getOrCreateKotlinClass(C1768n.class), S9.s.f6666c, null);

    /* renamed from: d, reason: collision with root package name */
    public final String f21336d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f21337e;

    /* renamed from: f, reason: collision with root package name */
    public final List f21338f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public /* synthetic */ C1768n(String str, boolean z2, ArrayList arrayList, int i3) {
        this(str, z2, (i3 & 4) != 0 ? CollectionsKt.emptyList() : arrayList, C0104k.f3820d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1768n)) {
            return false;
        }
        C1768n c1768n = (C1768n) obj;
        return Intrinsics.areEqual(b(), c1768n.b()) && Intrinsics.areEqual(this.f21336d, c1768n.f21336d) && this.f21337e == c1768n.f21337e && Intrinsics.areEqual(this.f21338f, c1768n.f21338f);
    }

    public final int hashCode() {
        int i3 = this.f6625c;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = this.f21338f.hashCode() + i2.u.e(i2.u.d(b().hashCode() * 37, 37, this.f21336d), 37, this.f21337e);
        this.f6625c = hashCode;
        return hashCode;
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StubApp.getString2(35320) + L1.E(this.f21336d));
        arrayList.add(StubApp.getString2(35368) + this.f21337e);
        List list = this.f21338f;
        if (!list.isEmpty()) {
            arrayList.add(StubApp.getString2(35341) + list);
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), StubApp.getString2(35369), StubApp.getString2(265), 0, null, null, 56, null);
        return joinToString$default;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768n(String uuid, boolean z2, List images, C0104k unknownFields) {
        super(f21335g, unknownFields);
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f21336d = uuid;
        this.f21337e = z2;
        this.f21338f = L1.s("images", images);
    }
}
