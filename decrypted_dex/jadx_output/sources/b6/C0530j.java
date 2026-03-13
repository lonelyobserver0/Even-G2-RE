package b6;

import N5.l;
import N5.m;
import N5.n;
import N5.o;
import java.util.ArrayList;
import java.util.EnumMap;

/* renamed from: b6.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0530j {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f10699c = {1, 1, 2};

    /* renamed from: a, reason: collision with root package name */
    public final Object f10700a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f10701b;

    public C0530j(int i3) {
        switch (i3) {
            case 1:
                this.f10700a = new ArrayList();
                this.f10701b = new ArrayList();
                break;
            default:
                this.f10700a = new C0529i(1);
                this.f10701b = new C0529i(0);
                break;
        }
    }

    public void a(int[] iArr, String str) {
        ((ArrayList) this.f10700a).add(iArr);
        ((ArrayList) this.f10701b).add(str);
    }

    public m b(int i3, int i10, T5.a aVar) {
        EnumMap enumMap;
        int[] l9 = AbstractC0531k.l(aVar, i10, false, f10699c, new int[3]);
        try {
            return ((C0529i) this.f10701b).a(i3, aVar, l9);
        } catch (l unused) {
            C0529i c0529i = (C0529i) this.f10700a;
            StringBuilder sb2 = c0529i.f10698b;
            sb2.setLength(0);
            int[] iArr = c0529i.f10697a;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            iArr[3] = 0;
            int i11 = l9[1];
            int i12 = 0;
            for (int i13 = 0; i13 < 2 && i11 < aVar.f7182b; i13++) {
                int h2 = AbstractC0531k.h(aVar, iArr, i11, AbstractC0531k.f10705g);
                sb2.append((char) ((h2 % 10) + 48));
                for (int i14 : iArr) {
                    i11 += i14;
                }
                if (h2 >= 10) {
                    i12 |= 1 << (1 - i13);
                }
                if (i13 != 1) {
                    i11 = aVar.c(aVar.b(i11));
                }
            }
            if (sb2.length() != 2) {
                throw N5.i.a();
            }
            if (Integer.parseInt(sb2.toString()) % 4 != i12) {
                throw N5.i.a();
            }
            String sb3 = sb2.toString();
            if (sb3.length() != 2) {
                enumMap = null;
            } else {
                enumMap = new EnumMap(n.class);
                enumMap.put((EnumMap) n.f4918f, (n) Integer.valueOf(sb3));
            }
            float f10 = i3;
            m mVar = new m(sb3, null, new o[]{new o((l9[0] + l9[1]) / 2.0f, f10), new o(i11, f10)}, N5.a.f4878s);
            if (enumMap != null) {
                mVar.a(enumMap);
            }
            return mVar;
        }
    }
}
