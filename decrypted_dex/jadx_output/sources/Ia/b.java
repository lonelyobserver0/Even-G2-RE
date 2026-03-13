package Ia;

import android.graphics.PointF;
import com.stub.StubApp;
import ha.C1013a;
import java.util.Arrays;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.l;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class b implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public float[] f3244a;

    public b() {
        this.f3244a = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static b c(AbstractC1469b abstractC1469b) {
        if (!(abstractC1469b instanceof C1468a)) {
            return new b();
        }
        C1468a c1468a = (C1468a) abstractC1469b;
        if (c1468a.f18393a.size() < 6) {
            return new b();
        }
        for (int i3 = 0; i3 < 6; i3++) {
            if (!(c1468a.G(i3) instanceof l)) {
                return new b();
            }
        }
        b bVar = new b();
        float[] fArr = new float[9];
        bVar.f3244a = fArr;
        fArr[0] = ((l) c1468a.G(0)).a();
        bVar.f3244a[1] = ((l) c1468a.G(1)).a();
        bVar.f3244a[3] = ((l) c1468a.G(2)).a();
        bVar.f3244a[4] = ((l) c1468a.G(3)).a();
        bVar.f3244a[6] = ((l) c1468a.G(4)).a();
        bVar.f3244a[7] = ((l) c1468a.G(5)).a();
        bVar.f3244a[8] = 1.0f;
        return bVar;
    }

    public static b e(float f10, float f11) {
        return new b(1.0f, 0.0f, 0.0f, 1.0f, f10, f11);
    }

    public static boolean h(float f10) {
        return Math.abs(f10) <= Float.MAX_VALUE;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b clone() {
        return new b((float[]) this.f3244a.clone());
    }

    public final C1013a b() {
        float[] fArr = this.f3244a;
        float f10 = fArr[0];
        float f11 = fArr[1];
        float f12 = fArr[3];
        float f13 = fArr[4];
        float f14 = fArr[6];
        float f15 = fArr[7];
        C1013a c1013a = new C1013a();
        c1013a.f14471a = f10;
        c1013a.f14472b = f11;
        c1013a.f14473c = f12;
        c1013a.f14474d = f13;
        c1013a.f14475e = f14;
        c1013a.f14476f = f15;
        return c1013a;
    }

    public final float d() {
        float[] fArr = this.f3244a;
        if (fArr[1] == 0.0f) {
            return fArr[0];
        }
        return (float) Math.sqrt(Math.pow(this.f3244a[1], 2.0d) + Math.pow(fArr[0], 2.0d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            return Arrays.equals(this.f3244a, ((b) obj).f3244a);
        }
        return false;
    }

    public final float f() {
        return this.f3244a[6];
    }

    public final float g() {
        return this.f3244a[7];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f3244a);
    }

    public final b i(b bVar, b bVar2) {
        float[] fArr = (bVar2 == null || bVar2 == bVar || bVar2 == this) ? new float[9] : bVar2.f3244a;
        float[] fArr2 = this.f3244a;
        float[] fArr3 = bVar.f3244a;
        float f10 = fArr2[0] * fArr3[0];
        float f11 = fArr2[1];
        float f12 = fArr3[3];
        float f13 = fArr2[2];
        float f14 = fArr3[6];
        float f15 = (f13 * f14) + (f11 * f12) + f10;
        fArr[0] = f15;
        float f16 = fArr2[0];
        float f17 = fArr3[1] * f16;
        float f18 = fArr3[4];
        float f19 = fArr3[7];
        fArr[1] = (f13 * f19) + (f11 * f18) + f17;
        float f20 = f16 * fArr3[2];
        float f21 = fArr2[1];
        float f22 = fArr3[5];
        float f23 = fArr3[8];
        fArr[2] = (f13 * f23) + (f21 * f22) + f20;
        float f24 = fArr2[3];
        float f25 = fArr3[0];
        float f26 = fArr2[4];
        float f27 = (f12 * f26) + (f24 * f25);
        float f28 = fArr2[5];
        fArr[3] = (f28 * f14) + f27;
        float f29 = fArr2[3];
        float f30 = fArr3[1];
        fArr[4] = (f28 * f19) + (f26 * f18) + (f29 * f30);
        float f31 = fArr3[2];
        fArr[5] = (f28 * f23) + (fArr2[4] * f22) + (f29 * f31);
        float f32 = fArr2[6] * f25;
        float f33 = fArr2[7];
        float f34 = (fArr3[3] * f33) + f32;
        float f35 = fArr2[8];
        fArr[6] = (f14 * f35) + f34;
        float f36 = fArr2[6];
        fArr[7] = (f19 * f35) + (f33 * fArr3[4]) + (f30 * f36);
        fArr[8] = (f35 * f23) + (fArr2[7] * fArr3[5]) + (f36 * f31);
        if (!h(f15) || !h(fArr[1]) || !h(fArr[2]) || !h(fArr[3]) || !h(fArr[4]) || !h(fArr[5]) || !h(fArr[6]) || !h(fArr[7]) || !h(fArr[8])) {
            throw new IllegalArgumentException(StubApp.getString2(2884));
        }
        if (bVar2 == null) {
            return new b(fArr);
        }
        bVar2.f3244a = fArr;
        return bVar2;
    }

    public final PointF j(float f10, float f11) {
        float[] fArr = this.f3244a;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = fArr[3];
        float f15 = fArr[4];
        return new PointF((f14 * f11) + (f12 * f10) + fArr[6], (f11 * f15) + (f10 * f13) + fArr[7]);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1557));
        sb2.append(this.f3244a[0]);
        String string2 = StubApp.getString2(321);
        sb2.append(string2);
        sb2.append(this.f3244a[1]);
        sb2.append(string2);
        sb2.append(this.f3244a[3]);
        sb2.append(string2);
        sb2.append(this.f3244a[4]);
        sb2.append(string2);
        sb2.append(this.f3244a[6]);
        sb2.append(string2);
        sb2.append(this.f3244a[7]);
        sb2.append(StubApp.getString2(511));
        return sb2.toString();
    }

    public b(float[] fArr) {
        this.f3244a = fArr;
    }

    public b(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f3244a = new float[]{f10, f11, 0.0f, f12, f13, 0.0f, f14, f15, 1.0f};
    }
}
