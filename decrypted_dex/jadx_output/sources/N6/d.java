package N6;

import com.mapbox.bindgen.Value;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class d extends Value {

    /* renamed from: a, reason: collision with root package name */
    public Object f4930a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(N6.a r4) {
        /*
            r3 = this;
            r4.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.mapbox.bindgen.Value r1 = new com.mapbox.bindgen.Value
            java.lang.String r2 = r4.f4928a
            r1.<init>(r2)
            r0.add(r1)
            java.util.ArrayList r4 = r4.f4929b
            r0.addAll(r4)
            r3.<init>(r0)
            java.lang.String r0 = "literal"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            if (r0 == 0) goto L2c
            java.lang.Object r4 = kotlin.collections.CollectionsKt.last(r4)
            N6.d r4 = (N6.d) r4
            java.lang.Object r4 = r4.f4930a
            r3.f4930a = r4
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N6.d.<init>(N6.a):void");
    }

    public d(double d8) {
        super(d8);
        this.f4930a = Double.valueOf(d8);
    }

    public d(long j) {
        super(j);
        this.f4930a = Long.valueOf(j);
    }

    public d(String str) {
        super(str);
        this.f4930a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(HashMap value) {
        super((HashMap<String, Value>) value);
        Intrinsics.checkNotNullParameter(value, "value");
        this.f4930a = value;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(java.util.List r4) {
        /*
            r3 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt.f(r4)
            r0.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            com.mapbox.bindgen.Value r2 = a.AbstractC0378a.H(r2)
            r0.add(r2)
            goto L12
        L24:
            r3.<init>(r0)
            r3.f4930a = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N6.d.<init>(java.util.List):void");
    }
}
