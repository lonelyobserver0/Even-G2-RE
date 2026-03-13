package Ha;

import android.util.Log;
import com.stub.StubApp;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.HashMap;
import wa.m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f {

    /* renamed from: r, reason: collision with root package name */
    public static final HashMap f2996r;

    /* renamed from: a, reason: collision with root package name */
    public final Ia.b f2997a;

    /* renamed from: b, reason: collision with root package name */
    public final float f2998b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2999c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3000d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3001e;

    /* renamed from: f, reason: collision with root package name */
    public final float f3002f;

    /* renamed from: g, reason: collision with root package name */
    public final float f3003g;

    /* renamed from: h, reason: collision with root package name */
    public final float f3004h;

    /* renamed from: i, reason: collision with root package name */
    public final float f3005i;
    public final float j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f3006k;

    /* renamed from: l, reason: collision with root package name */
    public final m f3007l;

    /* renamed from: m, reason: collision with root package name */
    public final float f3008m;

    /* renamed from: n, reason: collision with root package name */
    public final int f3009n;

    /* renamed from: o, reason: collision with root package name */
    public float[] f3010o;

    /* renamed from: p, reason: collision with root package name */
    public String f3011p;

    /* renamed from: q, reason: collision with root package name */
    public float f3012q = -1.0f;

    static {
        HashMap hashMap = new HashMap(31);
        String string2 = StubApp.getString2(2733);
        hashMap.put(96, string2);
        hashMap.put(715, string2);
        String string22 = StubApp.getString2(2734);
        hashMap.put(39, string22);
        hashMap.put(697, string22);
        hashMap.put(714, string22);
        String string23 = StubApp.getString2(2735);
        hashMap.put(94, string23);
        hashMap.put(710, string23);
        hashMap.put(126, StubApp.getString2(2736));
        hashMap.put(713, StubApp.getString2(2737));
        hashMap.put(176, StubApp.getString2(2738));
        hashMap.put(698, StubApp.getString2(2739));
        hashMap.put(711, StubApp.getString2(2740));
        hashMap.put(712, StubApp.getString2(2741));
        hashMap.put(34, StubApp.getString2(2742));
        hashMap.put(699, StubApp.getString2(2743));
        String string24 = StubApp.getString2(2744);
        hashMap.put(700, string24);
        hashMap.put(1158, string24);
        hashMap.put(1370, string24);
        String string25 = StubApp.getString2(2745);
        hashMap.put(701, string25);
        hashMap.put(1157, string25);
        hashMap.put(1369, string25);
        hashMap.put(724, StubApp.getString2(2746));
        hashMap.put(725, StubApp.getString2(2747));
        hashMap.put(726, StubApp.getString2(2748));
        hashMap.put(727, StubApp.getString2(2749));
        hashMap.put(690, StubApp.getString2(2750));
        hashMap.put(716, StubApp.getString2(2751));
        hashMap.put(695, StubApp.getString2(2752));
        hashMap.put(717, StubApp.getString2(2753));
        hashMap.put(95, StubApp.getString2(2754));
        hashMap.put(8270, StubApp.getString2(2755));
        f2996r = hashMap;
    }

    public f(int i3, float f10, float f11, Ia.b bVar, float f12, float f13, float f14, float f15, float f16, String str, int[] iArr, m mVar, float f17, int i10) {
        this.f2997a = bVar;
        this.f2998b = f12;
        this.f2999c = f13;
        this.f3001e = i3;
        this.f3000d = f14;
        this.f3004h = f11;
        this.f3005i = f10;
        this.f3010o = new float[]{f15};
        this.j = f16;
        this.f3011p = str;
        this.f3006k = iArr;
        this.f3007l = mVar;
        this.f3008m = f17;
        this.f3009n = i10;
        float f18 = i3;
        this.f3002f = e(f18);
        if (i3 == 0 || i3 == 180) {
            this.f3003g = f11 - g(f18);
        } else {
            this.f3003g = f10 - g(f18);
        }
    }

    public final boolean a(f fVar) {
        double d8 = d();
        double c10 = c(b());
        double d10 = d8 + c10;
        double d11 = fVar.d();
        double c11 = fVar.c(fVar.b()) + d11;
        if (c11 <= d8 || d11 >= d10) {
            return false;
        }
        double f10 = f();
        double f11 = fVar.f();
        if (fVar.f3000d + f11 < f10 || f11 > f10 + this.f3000d) {
            return false;
        }
        return (d11 <= d8 || c11 <= d10) ? d11 >= d8 || c11 >= d10 || (c11 - d8) / c10 > 0.15d : (d10 - d11) / c10 > 0.15d;
    }

    public final float b() {
        if (this.f3012q < 0.0f) {
            float[] fArr = this.f2997a.f3244a;
            float f10 = fArr[4];
            float f11 = fArr[1];
            float f12 = fArr[3];
            float f13 = fArr[0];
            if (f10 > 0.0f && Math.abs(f11) < f13 && Math.abs(f12) < f10 && f13 > 0.0f) {
                this.f3012q = 0.0f;
            } else if (f10 < 0.0f && Math.abs(f11) < Math.abs(f13) && Math.abs(f12) < Math.abs(f10) && f13 < 0.0f) {
                this.f3012q = 180.0f;
            } else if (Math.abs(f10) < Math.abs(f12) && f11 > 0.0f && f12 < 0.0f && Math.abs(f13) < f11) {
                this.f3012q = 90.0f;
            } else if (Math.abs(f10) >= f12 || f11 >= 0.0f || f12 <= 0.0f || Math.abs(f13) >= Math.abs(f11)) {
                this.f3012q = 0.0f;
            } else {
                this.f3012q = 270.0f;
            }
        }
        return this.f3012q;
    }

    public final float c(float f10) {
        Ia.b bVar = this.f2997a;
        return (f10 == 90.0f || f10 == 270.0f) ? Math.abs(this.f2999c - bVar.g()) : Math.abs(this.f2998b - bVar.f());
    }

    public final float d() {
        return e(b());
    }

    public final float e(float f10) {
        float f11;
        float g10;
        Ia.b bVar = this.f2997a;
        if (f10 == 0.0f) {
            return bVar.f();
        }
        if (f10 == 90.0f) {
            return bVar.g();
        }
        if (f10 == 180.0f) {
            f11 = this.f3005i;
            g10 = bVar.f();
        } else {
            if (f10 != 270.0f) {
                return 0.0f;
            }
            f11 = this.f3004h;
            g10 = bVar.g();
        }
        return f11 - g10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (Float.compare(fVar.f2998b, this.f2998b) != 0 || Float.compare(fVar.f2999c, this.f2999c) != 0 || Float.compare(fVar.f3000d, this.f3000d) != 0 || this.f3001e != fVar.f3001e || Float.compare(fVar.f3002f, this.f3002f) != 0 || Float.compare(fVar.f3003g, this.f3003g) != 0 || Float.compare(fVar.f3004h, this.f3004h) != 0 || Float.compare(fVar.f3005i, this.f3005i) != 0 || Float.compare(fVar.j, this.j) != 0 || Float.compare(fVar.f3008m, this.f3008m) != 0 || this.f3009n != fVar.f3009n) {
            return false;
        }
        Ia.b bVar = fVar.f2997a;
        Ia.b bVar2 = this.f2997a;
        if (bVar2 == null ? bVar != null : !bVar2.equals(bVar)) {
            return false;
        }
        if (!Arrays.equals(this.f3006k, fVar.f3006k)) {
            return false;
        }
        m mVar = fVar.f3007l;
        m mVar2 = this.f3007l;
        return mVar2 != null ? mVar2.equals(mVar) : mVar == null;
    }

    public final float f() {
        float f10;
        float g10;
        float b2 = b();
        if (b2 == 0.0f || b2 == 180.0f) {
            f10 = this.f3004h;
            g10 = g(b2);
        } else {
            f10 = this.f3005i;
            g10 = g(b2);
        }
        return f10 - g10;
    }

    public final float g(float f10) {
        float f11;
        float g10;
        Ia.b bVar = this.f2997a;
        if (f10 == 0.0f) {
            return bVar.g();
        }
        if (f10 == 90.0f) {
            f11 = this.f3005i;
            g10 = bVar.f();
        } else {
            if (f10 != 180.0f) {
                if (f10 == 270.0f) {
                    return bVar.f();
                }
                return 0.0f;
            }
            f11 = this.f3004h;
            g10 = bVar.g();
        }
        return f11 - g10;
    }

    public final void h(int i3, f fVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) this.f3011p, 0, i3);
        float[] fArr = this.f3010o;
        float[] fArr2 = new float[fArr.length + 1];
        System.arraycopy(fArr, 0, fArr2, 0, i3);
        sb2.append(this.f3011p.charAt(i3));
        fArr2[i3] = this.f3010o[i3];
        String str = fVar.f3011p;
        int codePointAt = str.codePointAt(0);
        HashMap hashMap = f2996r;
        sb2.append(hashMap.containsKey(Integer.valueOf(codePointAt)) ? (String) hashMap.get(Integer.valueOf(codePointAt)) : Normalizer.normalize(str, Normalizer.Form.NFKC).trim());
        int i10 = i3 + 1;
        fArr2[i10] = 0.0f;
        sb2.append(this.f3011p.substring(i10));
        System.arraycopy(this.f3010o, i10, fArr2, i3 + 2, (r1.length - i3) - 1);
        this.f3011p = sb2.toString();
        this.f3010o = fArr2;
    }

    public final int hashCode() {
        Ia.b bVar = this.f2997a;
        int hashCode = (Arrays.hashCode(this.f3006k) + ((Float.floatToIntBits(this.j) + ((Float.floatToIntBits(this.f3005i) + ((Float.floatToIntBits(this.f3004h) + ((Float.floatToIntBits(this.f3003g) + ((Float.floatToIntBits(this.f3002f) + ((((Float.floatToIntBits(this.f3000d) + ((Float.floatToIntBits(this.f2999c) + ((Float.floatToIntBits(this.f2998b) + ((bVar != null ? Arrays.hashCode(bVar.f3244a) : 0) * 31)) * 31)) * 31)) * 31) + this.f3001e) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        m mVar = this.f3007l;
        return ((Float.floatToIntBits(this.f3008m) + ((hashCode + (mVar != null ? mVar.f22230a.hashCode() : 0)) * 31)) * 31) + this.f3009n;
    }

    public final boolean i() {
        String str = this.f3011p;
        if (str.length() != 1 || StubApp.getString2(2756).equals(str)) {
            return false;
        }
        int type = Character.getType(str.charAt(0));
        return type == 6 || type == 27 || type == 4;
    }

    public final void j(f fVar) {
        if (fVar.f3011p.length() > 1) {
            return;
        }
        float d8 = fVar.d();
        float f10 = fVar.f3010o[0] + d8;
        float d10 = d();
        int length = this.f3011p.length();
        float f11 = d10;
        boolean z2 = false;
        for (int i3 = 0; i3 < length && !z2; i3++) {
            float[] fArr = this.f3010o;
            if (i3 >= fArr.length) {
                Log.i(StubApp.getString2(948), StubApp.getString2(2757) + fVar.f3011p + StubApp.getString2(2758) + this.f3011p + StubApp.getString2(2759));
                return;
            }
            float f12 = fArr[i3];
            float f13 = f11 + f12;
            if (d8 >= f11 || f10 > f13) {
                if (d8 < f11) {
                    h(i3, fVar);
                } else if (f10 <= f13) {
                    h(i3, fVar);
                } else if (i3 == length - 1) {
                    h(i3, fVar);
                } else {
                    f11 += this.f3010o[i3];
                }
            } else if (i3 == 0) {
                h(i3, fVar);
            } else {
                int i10 = i3 - 1;
                if ((f10 - f11) / f12 >= (f11 - d8) / fArr[i10]) {
                    h(i3, fVar);
                } else {
                    h(i10, fVar);
                }
            }
            z2 = true;
            f11 += this.f3010o[i3];
        }
    }

    public final String toString() {
        return this.f3011p;
    }
}
