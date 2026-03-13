package tc;

import Kc.C0104k;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class N extends S9.f {

    /* renamed from: g, reason: collision with root package name */
    public static final M f21292g = new M(S9.d.f6616d, Reflection.getOrCreateKotlinClass(N.class), S9.s.f6666c, null);

    /* renamed from: d, reason: collision with root package name */
    public final String f21293d;

    /* renamed from: e, reason: collision with root package name */
    public final C1762h f21294e;

    /* renamed from: f, reason: collision with root package name */
    public final List f21295f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(String device_uuid, ArrayList images, C1762h c1762h, C0104k unknownFields) {
        super(f21292g, unknownFields);
        Intrinsics.checkNotNullParameter(device_uuid, "device_uuid");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f21293d = device_uuid;
        this.f21294e = c1762h;
        this.f21295f = L1.s("images", images);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n10 = (N) obj;
        return Intrinsics.areEqual(b(), n10.b()) && Intrinsics.areEqual(this.f21293d, n10.f21293d) && Intrinsics.areEqual(this.f21295f, n10.f21295f) && Intrinsics.areEqual(this.f21294e, n10.f21294e);
    }

    public final int hashCode() {
        int i3 = this.f6625c;
        if (i3 != 0) {
            return i3;
        }
        int g10 = E1.a.g(i2.u.d(b().hashCode() * 37, 37, this.f21293d), 37, this.f21295f);
        C1762h c1762h = this.f21294e;
        int hashCode = g10 + (c1762h != null ? c1762h.hashCode() : 0);
        this.f6625c = hashCode;
        return hashCode;
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StubApp.getString2(35325) + L1.E(this.f21293d));
        List list = this.f21295f;
        if (!list.isEmpty()) {
            arrayList.add(StubApp.getString2(35341) + list);
        }
        C1762h c1762h = this.f21294e;
        if (c1762h != null) {
            arrayList.add(StubApp.getString2(35328) + c1762h);
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), StubApp.getString2(35342), StubApp.getString2(265), 0, null, null, 56, null);
        return joinToString$default;
    }
}
