package L1;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f4167a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4168b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4169c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4170d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public e(String name, boolean z2, List columns, List orders) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(columns, "columns");
        Intrinsics.checkNotNullParameter(orders, "orders");
        this.f4167a = name;
        this.f4168b = z2;
        this.f4169c = columns;
        this.f4170d = orders;
        if (orders.isEmpty()) {
            int size = columns.size();
            orders = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                orders.add(StubApp.getString2(3337));
            }
        }
        this.f4170d = orders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f4168b != eVar.f4168b || !Intrinsics.areEqual(this.f4169c, eVar.f4169c) || !Intrinsics.areEqual(this.f4170d, eVar.f4170d)) {
            return false;
        }
        String str = this.f4167a;
        String string2 = StubApp.getString2(3338);
        boolean O7 = StringsKt.O(str, string2);
        String str2 = eVar.f4167a;
        return O7 ? StringsKt.O(str2, string2) : Intrinsics.areEqual(str, str2);
    }

    public final int hashCode() {
        String string2 = StubApp.getString2(3338);
        String str = this.f4167a;
        return this.f4170d.hashCode() + E1.a.g((((StringsKt.O(str, string2) ? -1184239155 : str.hashCode()) * 31) + (this.f4168b ? 1 : 0)) * 31, 31, this.f4169c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(3339));
        sb2.append(this.f4167a);
        sb2.append(StubApp.getString2(3340));
        sb2.append(this.f4168b);
        sb2.append(StubApp.getString2(3341));
        sb2.append(this.f4169c);
        sb2.append(StubApp.getString2(3342));
        return E1.a.l(StubApp.getString2(3254), sb2, this.f4170d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(java.lang.String r6, java.util.List r7) {
        /*
            r5 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "columns"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r7.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
            r3 = r2
        L15:
            if (r3 >= r0) goto L24
            r4 = 3337(0xd09, float:4.676E-42)
            java.lang.String r4 = com.stub.StubApp.getString2(r4)
            r1.add(r4)
            int r3 = r3 + 1
            goto L15
        L24:
            r5.<init>(r6, r2, r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.e.<init>(java.lang.String, java.util.List):void");
    }
}
