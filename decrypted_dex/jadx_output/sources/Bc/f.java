package Bc;

import Kc.C0104k;
import com.stub.StubApp;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import wc.C1881F;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class f {
    static {
        C0104k c0104k = C0104k.f3820d;
        u5.d.r(StubApp.getString2(25054));
        u5.d.r(StubApp.getString2(25055));
    }

    public static final boolean a(C1881F c1881f) {
        boolean equals;
        Intrinsics.checkNotNullParameter(c1881f, "<this>");
        if (Intrinsics.areEqual(c1881f.f22325a.f22494b, "HEAD")) {
            return false;
        }
        int i3 = c1881f.f22328d;
        if (((i3 < 100 || i3 >= 200) && i3 != 204 && i3 != 304) || xc.b.k(c1881f) != -1) {
            return true;
        }
        equals = StringsKt__StringsJVMKt.equals(StubApp.getString2(25032), C1881F.a(StubApp.getString2(25031), c1881f), true);
        return equals;
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0229, code lost:
    
        if (xc.b.f23183e.matches(r0) == false) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x027f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(wc.m r37, wc.t r38, wc.s r39) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Bc.f.b(wc.m, wc.t, wc.s):void");
    }
}
