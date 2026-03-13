package o0;

import M4.Z;
import java.util.Arrays;
import java.util.Objects;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class y {

    /* renamed from: B, reason: collision with root package name */
    public static final y f18281B;

    /* renamed from: A, reason: collision with root package name */
    public final M4.I f18282A;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f18283a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f18284b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f18285c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f18286d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f18287e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f18288f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f18289g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f18290h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f18291i;
    public final Integer j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f18292k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f18293l;

    /* renamed from: m, reason: collision with root package name */
    public final Integer f18294m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f18295n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f18296o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f18297p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f18298q;

    /* renamed from: r, reason: collision with root package name */
    public final Integer f18299r;

    /* renamed from: s, reason: collision with root package name */
    public final CharSequence f18300s;

    /* renamed from: t, reason: collision with root package name */
    public final CharSequence f18301t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f18302u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f18303v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f18304w;

    /* renamed from: x, reason: collision with root package name */
    public final CharSequence f18305x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f18306y;

    /* renamed from: z, reason: collision with root package name */
    public final Integer f18307z;

    static {
        x xVar = new x();
        M4.G g10 = M4.I.f4549b;
        xVar.f18280z = Z.f4578e;
        f18281B = new y(xVar);
        i2.u.A(0, 1, 2, 3, 4);
        i2.u.A(5, 6, 8, 9, 10);
        i2.u.A(11, 12, 13, 14, 15);
        i2.u.A(16, 17, 18, 19, 20);
        i2.u.A(21, 22, 23, 24, 25);
        i2.u.A(26, 27, 28, 29, 30);
        i2.u.A(31, 32, 33, 34, 1000);
    }

    public y(x xVar) {
        Boolean bool = xVar.f18265k;
        Integer num = xVar.j;
        Integer num2 = xVar.f18279y;
        int i3 = 1;
        int i10 = 0;
        if (bool != null) {
            if (!bool.booleanValue()) {
                num = -1;
            } else if (num == null || num.intValue() == -1) {
                if (num2 != null) {
                    switch (num2.intValue()) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                            break;
                        case 20:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        default:
                            i3 = 0;
                            break;
                        case 21:
                            i3 = 2;
                            break;
                        case 22:
                            i3 = 3;
                            break;
                        case 23:
                            i3 = 4;
                            break;
                        case 24:
                            i3 = 5;
                            break;
                        case 25:
                            i3 = 6;
                            break;
                    }
                    i10 = i3;
                }
                num = Integer.valueOf(i10);
            }
        } else if (num != null) {
            boolean z2 = num.intValue() != -1;
            bool = Boolean.valueOf(z2);
            if (z2 && num2 == null) {
                switch (num.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i10 = 21;
                        break;
                    case 3:
                        i10 = 22;
                        break;
                    case 4:
                        i10 = 23;
                        break;
                    case 5:
                        i10 = 24;
                        break;
                    case 6:
                        i10 = 25;
                        break;
                    default:
                        i10 = 20;
                        break;
                }
                num2 = Integer.valueOf(i10);
            }
        }
        this.f18283a = xVar.f18256a;
        this.f18284b = xVar.f18257b;
        this.f18285c = xVar.f18258c;
        this.f18286d = xVar.f18259d;
        this.f18287e = xVar.f18260e;
        this.f18288f = xVar.f18261f;
        this.f18289g = xVar.f18262g;
        this.f18290h = xVar.f18263h;
        this.f18291i = xVar.f18264i;
        this.j = num;
        this.f18292k = bool;
        Integer num3 = xVar.f18266l;
        this.f18293l = num3;
        this.f18294m = num3;
        this.f18295n = xVar.f18267m;
        this.f18296o = xVar.f18268n;
        this.f18297p = xVar.f18269o;
        this.f18298q = xVar.f18270p;
        this.f18299r = xVar.f18271q;
        this.f18300s = xVar.f18272r;
        this.f18301t = xVar.f18273s;
        this.f18302u = xVar.f18274t;
        this.f18303v = xVar.f18275u;
        this.f18304w = xVar.f18276v;
        this.f18305x = xVar.f18277w;
        this.f18306y = xVar.f18278x;
        this.f18307z = num2;
        this.f18282A = xVar.f18280z;
    }

    public final x a() {
        x xVar = new x();
        xVar.f18256a = this.f18283a;
        xVar.f18257b = this.f18284b;
        xVar.f18258c = this.f18285c;
        xVar.f18259d = this.f18286d;
        xVar.f18260e = this.f18287e;
        xVar.f18261f = this.f18288f;
        xVar.f18262g = this.f18289g;
        xVar.f18263h = this.f18290h;
        xVar.f18264i = this.f18291i;
        xVar.j = this.j;
        xVar.f18265k = this.f18292k;
        xVar.f18266l = this.f18294m;
        xVar.f18267m = this.f18295n;
        xVar.f18268n = this.f18296o;
        xVar.f18269o = this.f18297p;
        xVar.f18270p = this.f18298q;
        xVar.f18271q = this.f18299r;
        xVar.f18272r = this.f18300s;
        xVar.f18273s = this.f18301t;
        xVar.f18274t = this.f18302u;
        xVar.f18275u = this.f18303v;
        xVar.f18276v = this.f18304w;
        xVar.f18277w = this.f18305x;
        xVar.f18278x = this.f18306y;
        xVar.f18279y = this.f18307z;
        xVar.f18280z = this.f18282A;
        return xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        int i3 = AbstractC1560u.f20190a;
        return Objects.equals(this.f18283a, yVar.f18283a) && Objects.equals(this.f18284b, yVar.f18284b) && Objects.equals(this.f18285c, yVar.f18285c) && Objects.equals(this.f18286d, yVar.f18286d) && Objects.equals(this.f18287e, yVar.f18287e) && Arrays.equals(this.f18288f, yVar.f18288f) && Objects.equals(this.f18289g, yVar.f18289g) && Objects.equals(this.f18290h, yVar.f18290h) && Objects.equals(this.f18291i, yVar.f18291i) && Objects.equals(this.j, yVar.j) && Objects.equals(this.f18292k, yVar.f18292k) && Objects.equals(this.f18294m, yVar.f18294m) && Objects.equals(this.f18295n, yVar.f18295n) && Objects.equals(this.f18296o, yVar.f18296o) && Objects.equals(this.f18297p, yVar.f18297p) && Objects.equals(this.f18298q, yVar.f18298q) && Objects.equals(this.f18299r, yVar.f18299r) && Objects.equals(this.f18300s, yVar.f18300s) && Objects.equals(this.f18301t, yVar.f18301t) && Objects.equals(this.f18302u, yVar.f18302u) && Objects.equals(this.f18303v, yVar.f18303v) && Objects.equals(this.f18304w, yVar.f18304w) && Objects.equals(this.f18305x, yVar.f18305x) && Objects.equals(this.f18306y, yVar.f18306y) && Objects.equals(this.f18307z, yVar.f18307z) && Objects.equals(this.f18282A, yVar.f18282A);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18283a, this.f18284b, this.f18285c, this.f18286d, null, null, this.f18287e, null, null, null, Integer.valueOf(Arrays.hashCode(this.f18288f)), this.f18289g, null, this.f18290h, this.f18291i, this.j, this.f18292k, null, this.f18294m, this.f18295n, this.f18296o, this.f18297p, this.f18298q, this.f18299r, this.f18300s, this.f18301t, this.f18302u, this.f18303v, this.f18304w, this.f18305x, null, this.f18306y, this.f18307z, true, this.f18282A});
    }
}
