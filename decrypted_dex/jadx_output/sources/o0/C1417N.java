package o0;

import com.stub.StubApp;
import java.util.Arrays;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* renamed from: o0.N, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1417N {

    /* renamed from: a, reason: collision with root package name */
    public final int f18067a;

    /* renamed from: b, reason: collision with root package name */
    public final String f18068b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18069c;

    /* renamed from: d, reason: collision with root package name */
    public final C1438m[] f18070d;

    /* renamed from: e, reason: collision with root package name */
    public int f18071e;

    static {
        AbstractC1560u.E(0);
        AbstractC1560u.E(1);
    }

    public C1417N(String str, C1438m... c1438mArr) {
        AbstractC1550k.c(c1438mArr.length > 0);
        this.f18068b = str;
        this.f18070d = c1438mArr;
        this.f18067a = c1438mArr.length;
        int h2 = AbstractC1405B.h(c1438mArr[0].f18216n);
        this.f18069c = h2 == -1 ? AbstractC1405B.h(c1438mArr[0].f18215m) : h2;
        String str2 = c1438mArr[0].f18207d;
        String string2 = StubApp.getString2(3969);
        str2 = (str2 == null || str2.equals(string2)) ? "" : str2;
        int i3 = c1438mArr[0].f18209f | 16384;
        for (int i10 = 1; i10 < c1438mArr.length; i10++) {
            String str3 = c1438mArr[i10].f18207d;
            if (!str2.equals((str3 == null || str3.equals(string2)) ? "" : str3)) {
                b(StubApp.getString2(21523), i10, c1438mArr[0].f18207d, c1438mArr[i10].f18207d);
                return;
            } else {
                if (i3 != (c1438mArr[i10].f18209f | 16384)) {
                    b(StubApp.getString2(21524), i10, Integer.toBinaryString(c1438mArr[0].f18209f), Integer.toBinaryString(c1438mArr[i10].f18209f));
                    return;
                }
            }
        }
    }

    public static void b(String str, int i3, String str2, String str3) {
        StringBuilder t3 = i2.u.t(StubApp.getString2(21525), str, StubApp.getString2(21526), str2, StubApp.getString2(21527));
        t3.append(str3);
        t3.append(StubApp.getString2(21528));
        t3.append(i3);
        t3.append(StubApp.getString2(74));
        AbstractC1550k.l(StubApp.getString2(21529), "", new IllegalStateException(t3.toString()));
    }

    public final int a(C1438m c1438m) {
        int i3 = 0;
        while (true) {
            C1438m[] c1438mArr = this.f18070d;
            if (i3 >= c1438mArr.length) {
                return -1;
            }
            if (c1438m == c1438mArr[i3]) {
                return i3;
            }
            i3++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1417N.class == obj.getClass()) {
            C1417N c1417n = (C1417N) obj;
            if (this.f18068b.equals(c1417n.f18068b) && Arrays.equals(this.f18070d, c1417n.f18070d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f18071e == 0) {
            this.f18071e = Arrays.hashCode(this.f18070d) + i2.u.d(527, 31, this.f18068b);
        }
        return this.f18071e;
    }
}
