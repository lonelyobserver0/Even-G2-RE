package o0;

import com.stub.StubApp;
import java.util.Arrays;
import r0.AbstractC1560u;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1427b {

    /* renamed from: c, reason: collision with root package name */
    public static final C1427b f18123c = new C1427b(new C1426a[0]);

    /* renamed from: d, reason: collision with root package name */
    public static final C1426a f18124d;

    /* renamed from: a, reason: collision with root package name */
    public final int f18125a;

    /* renamed from: b, reason: collision with root package name */
    public final C1426a[] f18126b;

    static {
        C1426a c1426a = new C1426a(-1, -1, new int[0], new C1447v[0], new long[0]);
        int[] iArr = c1426a.f18121e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = c1426a.f18122f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f18124d = new C1426a(0, c1426a.f18118b, copyOf, (C1447v[]) Arrays.copyOf(c1426a.f18120d, 0), copyOf2);
        AbstractC1560u.E(1);
        AbstractC1560u.E(2);
        AbstractC1560u.E(3);
        AbstractC1560u.E(4);
    }

    public C1427b(C1426a[] c1426aArr) {
        this.f18125a = c1426aArr.length;
        this.f18126b = c1426aArr;
    }

    public final C1426a a(int i3) {
        return i3 < 0 ? f18124d : this.f18126b[i3];
    }

    public final boolean b(int i3) {
        if (i3 != this.f18125a - 1) {
            return false;
        }
        a(i3).getClass();
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1427b.class != obj.getClass()) {
            return false;
        }
        C1427b c1427b = (C1427b) obj;
        int i3 = AbstractC1560u.f20190a;
        return this.f18125a == c1427b.f18125a && Arrays.equals(this.f18126b, c1427b.f18126b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18126b) + (((((this.f18125a * 961) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 961);
    }

    public final String toString() {
        String string2;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(21530));
        int i3 = 0;
        while (true) {
            C1426a[] c1426aArr = this.f18126b;
            int length = c1426aArr.length;
            String string22 = StubApp.getString2(6691);
            if (i3 >= length) {
                sb2.append(string22);
                return sb2.toString();
            }
            sb2.append(StubApp.getString2(21531));
            c1426aArr[i3].getClass();
            int i10 = 0;
            while (true) {
                int length2 = c1426aArr[i3].f18121e.length;
                string2 = StubApp.getString2(81);
                if (i10 >= length2) {
                    break;
                }
                sb2.append(StubApp.getString2(21532));
                int i11 = c1426aArr[i3].f18121e[i10];
                if (i11 == 0) {
                    sb2.append('_');
                } else if (i11 == 1) {
                    sb2.append('R');
                } else if (i11 == 2) {
                    sb2.append('S');
                } else if (i11 == 3) {
                    sb2.append('P');
                } else if (i11 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(StubApp.getString2(21533));
                sb2.append(c1426aArr[i3].f18122f[i10]);
                sb2.append(')');
                if (i10 < c1426aArr[i3].f18121e.length - 1) {
                    sb2.append(string2);
                }
                i10++;
            }
            sb2.append(string22);
            if (i3 < c1426aArr.length - 1) {
                sb2.append(string2);
            }
            i3++;
        }
    }
}
