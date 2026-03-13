package tc;

import Kc.C0104k;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* renamed from: tc.D, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1754D extends S9.f {

    /* renamed from: f, reason: collision with root package name */
    public static final C1753C f21261f = new C1753C(S9.d.f6616d, Reflection.getOrCreateKotlinClass(C1754D.class), S9.s.f6666c, null);

    /* renamed from: d, reason: collision with root package name */
    public final String f21262d;

    /* renamed from: e, reason: collision with root package name */
    public final List f21263e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1754D(String uuid, ArrayList protoLogMessage, C0104k unknownFields) {
        super(f21261f, unknownFields);
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(protoLogMessage, "protoLogMessage");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f21262d = uuid;
        this.f21263e = L1.s("protoLogMessage", protoLogMessage);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1754D)) {
            return false;
        }
        C1754D c1754d = (C1754D) obj;
        return Intrinsics.areEqual(b(), c1754d.b()) && Intrinsics.areEqual(this.f21262d, c1754d.f21262d) && Intrinsics.areEqual(this.f21263e, c1754d.f21263e);
    }

    public final int hashCode() {
        int i3 = this.f6625c;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = this.f21263e.hashCode() + i2.u.d(b().hashCode() * 37, 37, this.f21262d);
        this.f6625c = hashCode;
        return hashCode;
    }

    public final String toString() {
        String joinToString$default;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StubApp.getString2(35320) + L1.E(this.f21262d));
        List list = this.f21263e;
        if (!list.isEmpty()) {
            arrayList.add(StubApp.getString2(35323) + list);
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, StubApp.getString2(81), StubApp.getString2(35324), StubApp.getString2(265), 0, null, null, 56, null);
        return joinToString$default;
    }
}
