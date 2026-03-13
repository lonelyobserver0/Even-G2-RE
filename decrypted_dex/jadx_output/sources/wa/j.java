package wa;

import android.util.Log;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import kotlin.UByte;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1471d;
import ta.InterfaceC1743c;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class j implements InterfaceC1743c, o {

    /* renamed from: a, reason: collision with root package name */
    public final s f22207a;

    /* renamed from: c, reason: collision with root package name */
    public float f22209c;

    /* renamed from: d, reason: collision with root package name */
    public float f22210d;

    /* renamed from: h, reason: collision with root package name */
    public final C1471d f22214h;
    public n j;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f22211e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f22212f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final float[] f22213g = {880.0f, -1000.0f};

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f22208b = new HashMap();

    public j(C1471d c1471d, s sVar) {
        boolean z2 = true;
        this.f22214h = c1471d;
        this.f22207a = sVar;
        AbstractC1469b J10 = c1471d.J(oa.j.F3);
        if (J10 instanceof C1468a) {
            C1468a c1468a = (C1468a) J10;
            int size = c1468a.f18393a.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size - 1) {
                    break;
                }
                int i10 = i3 + 1;
                AbstractC1469b G4 = c1468a.G(i3);
                boolean z10 = G4 instanceof oa.l;
                String string2 = StubApp.getString2(23973);
                String string22 = StubApp.getString2(948);
                if (z10) {
                    oa.l lVar = (oa.l) G4;
                    int i11 = i3 + 2;
                    AbstractC1469b G10 = c1468a.G(i10);
                    if (G10 instanceof C1468a) {
                        C1468a c1468a2 = (C1468a) G10;
                        int F3 = lVar.F();
                        int size2 = c1468a2.f18393a.size();
                        for (int i12 = 0; i12 < size2; i12++) {
                            AbstractC1469b G11 = c1468a2.G(i12);
                            if (G11 instanceof oa.l) {
                                this.f22208b.put(Integer.valueOf(F3 + i12), Float.valueOf(((oa.l) G11).a()));
                            } else {
                                Log.w(string22, string2 + G11);
                            }
                        }
                        i3 = i11;
                    } else {
                        if (i11 >= size) {
                            Log.w(string22, StubApp.getString2(23974));
                            break;
                        }
                        i3 += 3;
                        AbstractC1469b G12 = c1468a.G(i11);
                        if ((G10 instanceof oa.l) && (G12 instanceof oa.l)) {
                            int F10 = ((oa.l) G10).F();
                            float a3 = ((oa.l) G12).a();
                            for (int F11 = lVar.F(); F11 <= F10; F11++) {
                                this.f22208b.put(Integer.valueOf(F11), Float.valueOf(a3));
                            }
                        } else {
                            Log.w(string22, StubApp.getString2(23975) + G10 + StubApp.getString2(3542) + G12);
                        }
                    }
                } else {
                    Log.w(string22, string2 + G4);
                    i3 = i10;
                }
            }
        }
        oa.j jVar = oa.j.f18501T0;
        C1471d c1471d2 = this.f22214h;
        AbstractC1469b J11 = c1471d2.J(jVar);
        if (J11 instanceof C1468a) {
            C1468a c1468a3 = (C1468a) J11;
            AbstractC1469b G13 = c1468a3.G(0);
            AbstractC1469b G14 = c1468a3.G(1);
            if ((G13 instanceof oa.l) && (G14 instanceof oa.l)) {
                float a9 = ((oa.l) G13).a();
                float[] fArr = this.f22213g;
                fArr[0] = a9;
                fArr[1] = ((oa.l) G14).a();
            }
        }
        AbstractC1469b J12 = c1471d2.J(oa.j.f18451G3);
        if (J12 instanceof C1468a) {
            C1468a c1468a4 = (C1468a) J12;
            int i13 = 0;
            while (i13 < c1468a4.f18393a.size()) {
                oa.l lVar2 = (oa.l) c1468a4.G(i13);
                int i14 = i13 + 1;
                AbstractC1469b G15 = c1468a4.G(i14);
                boolean z11 = G15 instanceof C1468a;
                HashMap hashMap = this.f22212f;
                HashMap hashMap2 = this.f22211e;
                if (z11) {
                    C1468a c1468a5 = (C1468a) G15;
                    for (int i15 = 0; i15 < c1468a5.f18393a.size(); i15 += 3) {
                        int F12 = (i15 / 3) + lVar2.F();
                        oa.l lVar3 = (oa.l) c1468a5.G(i15);
                        oa.l lVar4 = (oa.l) c1468a5.G(i15 + 1);
                        oa.l lVar5 = (oa.l) c1468a5.G(i15 + 2);
                        hashMap2.put(Integer.valueOf(F12), Float.valueOf(lVar3.a()));
                        hashMap.put(Integer.valueOf(F12), new Ia.e(lVar4.a(), lVar5.a()));
                    }
                } else {
                    int F13 = lVar2.F();
                    int F14 = ((oa.l) G15).F();
                    oa.l lVar6 = (oa.l) c1468a4.G(i13 + 2);
                    oa.l lVar7 = (oa.l) c1468a4.G(i13 + 3);
                    int i16 = i13 + 4;
                    oa.l lVar8 = (oa.l) c1468a4.G(i16);
                    while (F13 <= F14) {
                        hashMap2.put(Integer.valueOf(F13), Float.valueOf(lVar6.a()));
                        hashMap.put(Integer.valueOf(F13), new Ia.e(lVar7.a(), lVar8.a()));
                        F13++;
                        z2 = z2;
                    }
                    i14 = i16;
                }
                i13 = i14 + 1;
                z2 = z2;
            }
        }
    }

    public abstract int e(int i3);

    public abstract int f(int i3);

    public float g() {
        float f10;
        if (this.f22210d == 0.0f) {
            HashMap hashMap = this.f22208b;
            int i3 = 0;
            if (hashMap != null) {
                f10 = 0.0f;
                for (Float f11 : hashMap.values()) {
                    if (f11.floatValue() > 0.0f) {
                        f10 += f11.floatValue();
                        i3++;
                    }
                }
            } else {
                f10 = 0.0f;
            }
            if (i3 != 0) {
                this.f22210d = f10 / i3;
            }
            float f12 = this.f22210d;
            if (f12 <= 0.0f || Float.isNaN(f12)) {
                this.f22210d = j();
            }
        }
        return this.f22210d;
    }

    public final String h() {
        return this.f22214h.Q(oa.j.f18622z);
    }

    public final Ea.c i() {
        AbstractC1469b J10 = this.f22214h.J(oa.j.f18555k0);
        if (J10 instanceof C1471d) {
            return new Ea.c((C1471d) J10, 2);
        }
        return null;
    }

    public final float j() {
        if (this.f22209c == 0.0f) {
            AbstractC1469b J10 = this.f22214h.J(oa.j.f18497S0);
            if (J10 instanceof oa.l) {
                this.f22209c = ((oa.l) J10).a();
            } else {
                this.f22209c = 1000.0f;
            }
        }
        return this.f22209c;
    }

    public final n k() {
        C1471d c1471d;
        if (this.j == null && (c1471d = (C1471d) this.f22214h.J(oa.j.f18565m1)) != null) {
            this.j = new n(c1471d);
        }
        return this.j;
    }

    public final int[] l() {
        AbstractC1469b J10 = this.f22214h.J(oa.j.h0);
        if (!(J10 instanceof oa.p)) {
            return null;
        }
        oa.h Z10 = ((oa.p) J10).Z();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        F1.i(Z10, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        F1.h(Z10);
        int length = byteArray.length / 2;
        int[] iArr = new int[length];
        int i3 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = ((byteArray[i3] & UByte.MAX_VALUE) << 8) | (byteArray[i3 + 1] & UByte.MAX_VALUE);
            i3 += 2;
        }
        return iArr;
    }

    @Override // ta.InterfaceC1743c
    public final AbstractC1469b p() {
        return this.f22214h;
    }
}
