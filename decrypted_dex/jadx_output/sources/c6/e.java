package c6;

import N5.i;
import N5.m;
import N5.n;
import N5.o;
import N5.p;
import b6.AbstractC0528h;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class e extends AbstractC0572a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f10987i = {1, 10, 34, 70, 126};
    public static final int[] j = {4, 20, 48, 81};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f10988k = {0, 161, 961, 2015, 2715};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f10989l = {0, 336, 1036, 1516};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f10990m = {8, 6, 4, 3, 1};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f10991n = {2, 4, 6, 8};

    /* renamed from: o, reason: collision with root package name */
    public static final int[][] f10992o = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f10993g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f10994h = new ArrayList();

    public static void j(ArrayList arrayList, d dVar) {
        if (dVar == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar2 = (d) it.next();
            if (dVar2.f10980a == dVar.f10980a) {
                dVar2.f10986d++;
                return;
            }
        }
        arrayList.add(dVar);
    }

    @Override // b6.AbstractC0528h
    public final m b(int i3, T5.a aVar, EnumMap enumMap) {
        d l9 = l(aVar, false, i3, enumMap);
        ArrayList arrayList = this.f10993g;
        j(arrayList, l9);
        aVar.e();
        d l10 = l(aVar, true, i3, enumMap);
        ArrayList arrayList2 = this.f10994h;
        j(arrayList2, l10);
        aVar.e();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f10986d > 1) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    d dVar2 = (d) it2.next();
                    if (dVar2.f10986d > 1) {
                        int i10 = ((dVar2.f10981b * 16) + dVar.f10981b) % 79;
                        c cVar = dVar.f10985c;
                        int i11 = cVar.f10982a * 9;
                        c cVar2 = dVar2.f10985c;
                        int i12 = i11 + cVar2.f10982a;
                        if (i12 > 72) {
                            i12--;
                        }
                        if (i12 > 8) {
                            i12--;
                        }
                        if (i10 == i12) {
                            String valueOf = String.valueOf((dVar.f10980a * 4537077) + dVar2.f10980a);
                            StringBuilder sb2 = new StringBuilder(14);
                            for (int length = 13 - valueOf.length(); length > 0; length--) {
                                sb2.append('0');
                            }
                            sb2.append(valueOf);
                            int i13 = 0;
                            for (int i14 = 0; i14 < 13; i14++) {
                                int charAt = sb2.charAt(i14) - '0';
                                if ((i14 & 1) == 0) {
                                    charAt *= 3;
                                }
                                i13 += charAt;
                            }
                            int i15 = 10 - (i13 % 10);
                            if (i15 == 10) {
                                i15 = 0;
                            }
                            sb2.append(i15);
                            o[] oVarArr = cVar.f10984c;
                            o[] oVarArr2 = cVar2.f10984c;
                            m mVar = new m(sb2.toString(), null, new o[]{oVarArr[0], oVarArr[1], oVarArr2[0], oVarArr2[1]}, N5.a.f4874n);
                            mVar.b(n.f4924n, StubApp.getString2(9613));
                            return mVar;
                        }
                    }
                }
            }
        }
        throw i.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0093, code lost:
    
        if (r6 < 4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0095, code lost:
    
        r17 = false;
        r16 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x009a, code lost:
    
        r16 = false;
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00b1, code lost:
    
        if (r6 < 4) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c6.C0573b k(T5.a r20, c6.c r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c6.e.k(T5.a, c6.c, boolean):c6.b");
    }

    public final d l(T5.a aVar, boolean z2, int i3, EnumMap enumMap) {
        try {
            c n10 = n(aVar, i3, z2, m(aVar, z2));
            p pVar = enumMap == null ? null : (p) enumMap.get(N5.d.f4890k);
            if (pVar != null) {
                int[] iArr = n10.f10983b;
                float f10 = ((iArr[0] + iArr[1]) - 1) / 2.0f;
                if (z2) {
                    f10 = (aVar.f7182b - 1) - f10;
                }
                pVar.a(new o(f10, i3));
            }
            C0573b k3 = k(aVar, n10, true);
            C0573b k4 = k(aVar, n10, false);
            return new d((k3.f10980a * 1597) + k4.f10980a, (k4.f10981b * 4) + k3.f10981b, n10);
        } catch (i unused) {
            return null;
        }
    }

    public final int[] m(T5.a aVar, boolean z2) {
        int[] iArr = this.f10974a;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        int i3 = aVar.f7182b;
        int i10 = 0;
        boolean z10 = false;
        while (i10 < i3) {
            z10 = !aVar.a(i10);
            if (z2 == z10) {
                break;
            }
            i10++;
        }
        int i11 = 0;
        int i12 = i10;
        while (i10 < i3) {
            if (aVar.a(i10) != z10) {
                iArr[i11] = iArr[i11] + 1;
            } else {
                if (i11 != 3) {
                    i11++;
                } else {
                    if (AbstractC0572a.i(iArr)) {
                        return new int[]{i12, i10};
                    }
                    i12 += iArr[0] + iArr[1];
                    iArr[0] = iArr[2];
                    iArr[1] = iArr[3];
                    iArr[2] = 0;
                    iArr[3] = 0;
                    i11--;
                }
                iArr[i11] = 1;
                z10 = !z10;
            }
            i10++;
        }
        throw i.a();
    }

    public final c n(T5.a aVar, int i3, boolean z2, int[] iArr) {
        int i10;
        int i11;
        boolean a3 = aVar.a(iArr[0]);
        int i12 = iArr[0] - 1;
        while (i12 >= 0 && a3 != aVar.a(i12)) {
            i12--;
        }
        int i13 = i12 + 1;
        int i14 = iArr[0] - i13;
        int[] iArr2 = this.f10974a;
        System.arraycopy(iArr2, 0, iArr2, 1, iArr2.length - 1);
        iArr2[0] = i14;
        int[][] iArr3 = f10992o;
        for (int i15 = 0; i15 < 9; i15++) {
            if (AbstractC0528h.d(iArr2, iArr3[i15], 0.45f) < 0.2f) {
                int i16 = iArr[1];
                if (z2) {
                    int i17 = aVar.f7182b - 1;
                    i10 = i17 - i16;
                    i11 = i17 - i13;
                } else {
                    i10 = i16;
                    i11 = i13;
                }
                return new c(i15, new int[]{i13, i16}, i11, i10, i3);
            }
        }
        throw i.a();
    }

    @Override // b6.AbstractC0528h, N5.k
    public final void reset() {
        this.f10993g.clear();
        this.f10994h.clear();
    }
}
