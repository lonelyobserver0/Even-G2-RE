package d6;

import N5.i;
import N5.m;
import N5.n;
import N5.o;
import b6.AbstractC0528h;
import ba.AbstractC0534b;
import c6.AbstractC0572a;
import c6.C0573b;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import e6.C0847a;
import e6.C0848b;
import e6.C0849c;
import e6.f;
import i2.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.math.Primes;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c extends AbstractC0572a {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f13430k = {7, 5, 4, 3, 1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f13431l = {4, 20, 52, 104, 204};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f13432m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n, reason: collision with root package name */
    public static final int[][] f13433n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o, reason: collision with root package name */
    public static final int[][] f13434o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, CertificateBody.profileType, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p, reason: collision with root package name */
    public static final int[][] f13435p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f13436g = new ArrayList(11);

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f13437h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final int[] f13438i = new int[2];
    public boolean j;

    public static m m(List list) {
        AbstractC0534b c0847a;
        int size = list.size() * 2;
        int i3 = size - 1;
        if (((a) list.get(list.size() - 1)).f13426b == null) {
            i3 = size - 2;
        }
        T5.a aVar = new T5.a(i3 * 12);
        int i10 = ((a) list.get(0)).f13426b.f10980a;
        int i11 = 0;
        for (int i12 = 11; i12 >= 0; i12--) {
            if (((1 << i12) & i10) != 0) {
                aVar.f(i11);
            }
            i11++;
        }
        for (int i13 = 1; i13 < list.size(); i13++) {
            a aVar2 = (a) list.get(i13);
            C0573b c0573b = aVar2.f13425a;
            for (int i14 = 11; i14 >= 0; i14--) {
                if (((1 << i14) & c0573b.f10980a) != 0) {
                    aVar.f(i11);
                }
                i11++;
            }
            C0573b c0573b2 = aVar2.f13426b;
            if (c0573b2 != null) {
                for (int i15 = 11; i15 >= 0; i15--) {
                    if (((1 << i15) & c0573b2.f10980a) != 0) {
                        aVar.f(i11);
                    }
                    i11++;
                }
            }
        }
        if (aVar.a(1)) {
            c0847a = new C0848b(aVar, 2);
        } else if (aVar.a(2)) {
            int o5 = a5.c.o(1, 4, aVar);
            if (o5 == 4) {
                c0847a = new C0847a(aVar, 0);
            } else if (o5 != 5) {
                int o10 = a5.c.o(1, 5, aVar);
                if (o10 == 12) {
                    c0847a = new C0848b(aVar, 0);
                } else if (o10 != 13) {
                    int o11 = a5.c.o(1, 7, aVar);
                    String string2 = StubApp.getString2(1724);
                    String string22 = StubApp.getString2(1722);
                    String string23 = StubApp.getString2(16823);
                    String string24 = StubApp.getString2(16824);
                    String string25 = StubApp.getString2(16825);
                    String string26 = StubApp.getString2(16826);
                    switch (o11) {
                        case 56:
                            c0847a = new C0849c(aVar, string25, string2);
                            break;
                        case 57:
                            c0847a = new C0849c(aVar, string26, string2);
                            break;
                        case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                            c0847a = new C0849c(aVar, string25, string22);
                            break;
                        case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                            c0847a = new C0849c(aVar, string26, string22);
                            break;
                        case 60:
                            c0847a = new C0849c(aVar, string25, string23);
                            break;
                        case 61:
                            c0847a = new C0849c(aVar, string26, string23);
                            break;
                        case 62:
                            c0847a = new C0849c(aVar, string25, string24);
                            break;
                        case 63:
                            c0847a = new C0849c(aVar, string26, string24);
                            break;
                        default:
                            throw new IllegalStateException(StubApp.getString2(16827) + aVar);
                    }
                } else {
                    c0847a = new C0848b(aVar, 1);
                }
            } else {
                c0847a = new C0847a(aVar, 1);
            }
        } else {
            c0847a = new f(aVar);
        }
        String j = c0847a.j();
        o[] oVarArr = ((a) list.get(0)).f13427c.f10984c;
        o[] oVarArr2 = ((a) list.get(list.size() - 1)).f13427c.f10984c;
        m mVar = new m(j, null, new o[]{oVarArr[0], oVarArr[1], oVarArr2[0], oVarArr2[1]}, N5.a.f4875p);
        mVar.b(n.f4924n, StubApp.getString2(9613));
        return mVar;
    }

    @Override // b6.AbstractC0528h
    public final m b(int i3, T5.a aVar, EnumMap enumMap) {
        ArrayList arrayList = this.f13436g;
        arrayList.clear();
        this.j = false;
        try {
            return m(o(aVar, i3));
        } catch (i unused) {
            arrayList.clear();
            this.j = true;
            return m(o(aVar, i3));
        }
    }

    public final boolean j() {
        ArrayList arrayList = this.f13436g;
        a aVar = (a) arrayList.get(0);
        C0573b c0573b = aVar.f13425a;
        C0573b c0573b2 = aVar.f13426b;
        if (c0573b2 != null) {
            int i3 = 2;
            int i10 = c0573b2.f10981b;
            for (int i11 = 1; i11 < arrayList.size(); i11++) {
                a aVar2 = (a) arrayList.get(i11);
                i10 += aVar2.f13425a.f10981b;
                int i12 = i3 + 1;
                C0573b c0573b3 = aVar2.f13426b;
                if (c0573b3 != null) {
                    i10 += c0573b3.f10981b;
                    i3 += 2;
                } else {
                    i3 = i12;
                }
            }
            if (E1.a.f(i3, 4, Primes.SMALL_FACTOR_LIMIT, i10 % Primes.SMALL_FACTOR_LIMIT) == c0573b.f10980a) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (j() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        r1 = new java.util.ArrayList(r11);
        r1.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006d, code lost:
    
        return k(r10 + 1, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005e, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List k(int r10, java.util.ArrayList r11) {
        /*
            r9 = this;
        L0:
            java.util.ArrayList r0 = r9.f13437h
            int r1 = r0.size()
            if (r10 >= r1) goto L74
            java.lang.Object r0 = r0.get(r10)
            d6.b r0 = (d6.b) r0
            java.util.ArrayList r1 = r9.f13436g
            r1.clear()
            java.util.Iterator r2 = r11.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L29
            java.lang.Object r3 = r2.next()
            d6.b r3 = (d6.b) r3
            java.util.ArrayList r3 = r3.f13428a
            r1.addAll(r3)
            goto L17
        L29:
            java.util.ArrayList r2 = r0.f13428a
            r1.addAll(r2)
            int[][] r2 = d6.c.f13435p
            r3 = 0
            r4 = r3
        L32:
            r5 = 10
            if (r4 >= r5) goto L71
            r5 = r2[r4]
            int r6 = r1.size()
            int r7 = r5.length
            if (r6 > r7) goto L6e
            r6 = r3
        L40:
            int r7 = r1.size()
            if (r6 >= r7) goto L58
            java.lang.Object r7 = r1.get(r6)
            d6.a r7 = (d6.a) r7
            c6.c r7 = r7.f13427c
            r8 = r5[r6]
            int r7 = r7.f10982a
            if (r7 == r8) goto L55
            goto L6e
        L55:
            int r6 = r6 + 1
            goto L40
        L58:
            boolean r2 = r9.j()
            if (r2 == 0) goto L5f
            return r1
        L5f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            r1.add(r0)
            int r0 = r10 + 1
            java.util.List r10 = r9.k(r0, r1)     // Catch: N5.i -> L71
            return r10
        L6e:
            int r4 = r4 + 1
            goto L32
        L71:
            int r10 = r10 + 1
            goto L0
        L74:
            N5.i r10 = N5.i.a()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.c.k(int, java.util.ArrayList):java.util.List");
    }

    public final List l(boolean z2) {
        ArrayList arrayList = this.f13437h;
        List list = null;
        if (arrayList.size() > 25) {
            arrayList.clear();
            return null;
        }
        this.f13436g.clear();
        if (z2) {
            Collections.reverse(arrayList);
        }
        try {
            list = k(0, new ArrayList());
        } catch (i unused) {
        }
        if (z2) {
            Collections.reverse(arrayList);
        }
        return list;
    }

    public final C0573b n(T5.a aVar, c6.c cVar, boolean z2, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int[][] iArr;
        int[] iArr2 = this.f10975b;
        Arrays.fill(iArr2, 0);
        if (z10) {
            AbstractC0528h.f(cVar.f10983b[0], aVar, iArr2);
        } else {
            AbstractC0528h.e(cVar.f10983b[1], aVar, iArr2);
            int i3 = 0;
            for (int length = iArr2.length - 1; i3 < length; length--) {
                int i10 = iArr2[i3];
                iArr2[i3] = iArr2[length];
                iArr2[length] = i10;
                i3++;
            }
        }
        float x7 = AbstractC0624h2.x(iArr2) / 17;
        int[] iArr3 = cVar.f10983b;
        float f10 = (iArr3[1] - iArr3[0]) / 15.0f;
        if (Math.abs(x7 - f10) / f10 > 0.3f) {
            throw i.a();
        }
        int i11 = 0;
        while (true) {
            int length2 = iArr2.length;
            float[] fArr = this.f10977d;
            float[] fArr2 = this.f10976c;
            int[] iArr4 = this.f10979f;
            int[] iArr5 = this.f10978e;
            if (i11 >= length2) {
                int x10 = AbstractC0624h2.x(iArr5);
                int x11 = AbstractC0624h2.x(iArr4);
                if (x10 > 13) {
                    z11 = false;
                    z12 = true;
                } else if (x10 < 4) {
                    z12 = false;
                    z11 = true;
                } else {
                    z11 = false;
                    z12 = false;
                }
                if (x11 > 13) {
                    z13 = false;
                    z14 = true;
                } else if (x11 < 4) {
                    z14 = false;
                    z13 = true;
                } else {
                    z13 = false;
                    z14 = false;
                }
                int i12 = (x10 + x11) - 17;
                boolean z15 = (x10 & 1) == 1;
                boolean z16 = (x11 & 1) == 0;
                boolean z17 = z11;
                boolean z18 = z12;
                boolean z19 = z13;
                boolean z20 = z14;
                if (i12 != -1) {
                    if (i12 != 0) {
                        if (i12 != 1) {
                            throw i.a();
                        }
                        if (z15) {
                            if (z16) {
                                throw i.a();
                            }
                            z18 = true;
                            z17 = z11;
                            z19 = z13;
                            z20 = z14;
                        } else {
                            if (!z16) {
                                throw i.a();
                            }
                            z20 = true;
                            z17 = z11;
                            z18 = z12;
                            z19 = z13;
                        }
                    } else if (z15) {
                        if (!z16) {
                            throw i.a();
                        }
                        if (x10 < x11) {
                            z17 = true;
                            z20 = true;
                            z18 = z12;
                            z19 = z13;
                        } else {
                            z18 = true;
                            z19 = true;
                            z17 = z11;
                            z20 = z14;
                        }
                    } else if (z16) {
                        throw i.a();
                    }
                } else if (z15) {
                    if (z16) {
                        throw i.a();
                    }
                    z17 = true;
                    z18 = z12;
                    z19 = z13;
                    z20 = z14;
                } else {
                    if (!z16) {
                        throw i.a();
                    }
                    z19 = true;
                    z17 = z11;
                    z18 = z12;
                    z20 = z14;
                }
                if (z17) {
                    if (z18) {
                        throw i.a();
                    }
                    AbstractC0572a.h(iArr5, fArr2);
                }
                if (z18) {
                    AbstractC0572a.g(iArr5, fArr2);
                }
                if (z19) {
                    if (z20) {
                        throw i.a();
                    }
                    AbstractC0572a.h(iArr4, fArr2);
                }
                if (z20) {
                    AbstractC0572a.g(iArr4, fArr);
                }
                int i13 = cVar.f10982a;
                int i14 = (((i13 * 4) + (z2 ? 0 : 2)) + (!z10 ? 1 : 0)) - 1;
                int length3 = iArr5.length - 1;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    iArr = f13434o;
                    if (length3 < 0) {
                        break;
                    }
                    if (i13 != 0 || !z2 || !z10) {
                        i15 += iArr5[length3] * iArr[i14][length3 * 2];
                    }
                    i16 += iArr5[length3];
                    length3--;
                }
                int i17 = 0;
                for (int length4 = iArr4.length - 1; length4 >= 0; length4--) {
                    if (i13 != 0 || !z2 || !z10) {
                        i17 += iArr4[length4] * iArr[i14][(length4 * 2) + 1];
                    }
                }
                int i18 = i15 + i17;
                if ((i16 & 1) != 0 || i16 > 13 || i16 < 4) {
                    throw i.a();
                }
                int i19 = (13 - i16) / 2;
                int i20 = f13430k[i19];
                return new C0573b(AbstractC1482f.c(Oc.a.q(iArr5, i20, true), f13431l[i19], Oc.a.q(iArr4, 9 - i20, false), f13432m[i19]), i18);
            }
            float f11 = (iArr2[i11] * 1.0f) / x7;
            int i21 = (int) (0.5f + f11);
            if (i21 < 1) {
                if (f11 < 0.3f) {
                    throw i.a();
                }
                i21 = 1;
            } else if (i21 > 8) {
                if (f11 > 8.7f) {
                    throw i.a();
                }
                i21 = 8;
            }
            int i22 = i11 / 2;
            if ((i11 & 1) == 0) {
                iArr5[i22] = i21;
                fArr2[i22] = f11 - i21;
            } else {
                iArr4[i22] = i21;
                fArr[i22] = f11 - i21;
            }
            i11++;
        }
    }

    public final List o(T5.a aVar, int i3) {
        boolean z2;
        boolean z10;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList = this.f13436g;
            if (z11) {
                if (j()) {
                    return arrayList;
                }
                ArrayList arrayList2 = this.f13437h;
                boolean isEmpty = arrayList2.isEmpty();
                int i10 = 0;
                boolean z12 = false;
                while (true) {
                    if (i10 >= arrayList2.size()) {
                        z2 = false;
                        break;
                    }
                    b bVar = (b) arrayList2.get(i10);
                    int i11 = bVar.f13429b;
                    ArrayList arrayList3 = bVar.f13428a;
                    if (i11 > i3) {
                        z2 = arrayList3.equals(arrayList);
                        break;
                    }
                    z12 = arrayList3.equals(arrayList);
                    i10++;
                }
                if (!z2 && !z12) {
                    Iterator it = arrayList2.iterator();
                    loop2: while (true) {
                        if (!it.hasNext()) {
                            z10 = false;
                            break;
                        }
                        b bVar2 = (b) it.next();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            a aVar2 = (a) it2.next();
                            Iterator it3 = bVar2.f13428a.iterator();
                            while (it3.hasNext()) {
                                if (aVar2.equals((a) it3.next())) {
                                    break;
                                }
                            }
                        }
                        z10 = true;
                        break loop2;
                    }
                    if (!z10) {
                        arrayList2.add(i10, new b(i3, arrayList));
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            b bVar3 = (b) it4.next();
                            if (bVar3.f13428a.size() != arrayList.size()) {
                                Iterator it5 = bVar3.f13428a.iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        it4.remove();
                                        break;
                                    }
                                    if (!arrayList.contains((a) it5.next())) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (!isEmpty) {
                    List l9 = l(false);
                    if (l9 != null) {
                        return l9;
                    }
                    List l10 = l(true);
                    if (l10 != null) {
                        return l10;
                    }
                }
                throw i.a();
            }
            try {
                arrayList.add(p(aVar, arrayList, i3));
            } catch (i e10) {
                if (arrayList.isEmpty()) {
                    throw e10;
                }
                z11 = true;
            }
        }
    }

    public final a p(T5.a aVar, ArrayList arrayList, int i3) {
        int i10;
        int i11;
        int i12;
        int c10;
        int i13;
        c6.c cVar;
        int[][] iArr;
        int i14;
        int i15 = 2;
        int i16 = 0;
        int i17 = 1;
        boolean z2 = arrayList.size() % 2 == 0;
        if (this.j) {
            z2 = !z2;
        }
        int i18 = -1;
        boolean z10 = true;
        while (true) {
            int[] iArr2 = this.f10974a;
            iArr2[i16] = i16;
            iArr2[i17] = i16;
            iArr2[i15] = i16;
            int i19 = 3;
            iArr2[3] = i16;
            int i20 = aVar.f7182b;
            int i21 = i18 >= 0 ? i18 : arrayList.isEmpty() ? i16 : ((a) u.j(i17, arrayList)).f13427c.f10983b[i17];
            int i22 = arrayList.size() % i15 != 0 ? i17 : i16;
            if (this.j) {
                i22 ^= 1;
            }
            boolean z11 = i16;
            while (true) {
                if (i21 >= i20) {
                    break;
                }
                boolean a3 = aVar.a(i21);
                boolean z12 = !a3;
                if (a3) {
                    z11 = z12;
                    break;
                }
                i21++;
                z11 = z12;
            }
            int i23 = i15;
            int i24 = i16;
            boolean z13 = z11;
            int i25 = i21;
            while (i21 < i20) {
                int i26 = i16;
                if (aVar.a(i21) != z13) {
                    iArr2[i24] = iArr2[i24] + i17;
                    i10 = i17;
                    i11 = i19;
                } else {
                    if (i24 == i19) {
                        if (i22 != 0) {
                            int length = iArr2.length;
                            i11 = i19;
                            int i27 = i26;
                            while (true) {
                                i12 = i17;
                                if (i27 >= length / 2) {
                                    break;
                                }
                                int i28 = iArr2[i27];
                                int i29 = (length - i27) - 1;
                                iArr2[i27] = iArr2[i29];
                                iArr2[i29] = i28;
                                i27++;
                                i17 = i12;
                            }
                        } else {
                            i12 = i17;
                            i11 = i19;
                        }
                        if (AbstractC0572a.i(iArr2)) {
                            int[] iArr3 = this.f13438i;
                            iArr3[i26] = i25;
                            iArr3[i12] = i21;
                            if (z2) {
                                int i30 = i25 - 1;
                                while (i30 >= 0 && !aVar.a(i30)) {
                                    i30--;
                                }
                                i25 = i30 + 1;
                                i13 = iArr3[i26] - i25;
                                c10 = iArr3[i12];
                            } else {
                                c10 = aVar.c(i21 + 1);
                                i13 = c10 - iArr3[i12];
                            }
                            int i31 = i25;
                            int i32 = c10;
                            System.arraycopy(iArr2, i26, iArr2, i12, iArr2.length - 1);
                            iArr2[i26] = i13;
                            C0573b c0573b = null;
                            try {
                                iArr = f13433n;
                            } catch (i unused) {
                                cVar = null;
                            }
                            for (i14 = 0; i14 < 6; i14++) {
                                if (AbstractC0528h.d(iArr2, iArr[i14], 0.45f) < 0.2f) {
                                    cVar = new c6.c(i14, new int[]{i31, i32}, i31, i32, i3);
                                    if (cVar == null) {
                                        int i33 = iArr3[0];
                                        i18 = aVar.a(i33) ? aVar.b(aVar.c(i33)) : aVar.c(aVar.b(i33));
                                    } else {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        C0573b n10 = n(aVar, cVar, z2, true);
                                        if (!arrayList.isEmpty() && ((a) u.j(1, arrayList)).f13426b == null) {
                                            throw i.a();
                                        }
                                        try {
                                            c0573b = n(aVar, cVar, z2, false);
                                        } catch (i unused2) {
                                        }
                                        return new a(n10, c0573b, cVar);
                                    }
                                    i15 = i23;
                                    i16 = 0;
                                    i17 = 1;
                                }
                            }
                            throw i.a();
                        } else {
                            if (i22 != 0) {
                                int length2 = iArr2.length;
                                for (int i34 = 0; i34 < length2 / 2; i34++) {
                                    int i35 = iArr2[i34];
                                    int i36 = (length2 - i34) - 1;
                                    iArr2[i34] = iArr2[i36];
                                    iArr2[i36] = i35;
                                }
                            }
                            i10 = 1;
                            i26 = 0;
                            i25 += iArr2[0] + iArr2[1];
                            iArr2[0] = iArr2[i23];
                            iArr2[1] = iArr2[i11];
                            iArr2[i23] = 0;
                            iArr2[i11] = 0;
                            i24--;
                        }
                    } else {
                        i10 = i17;
                        i11 = i19;
                        i24++;
                    }
                    iArr2[i24] = i10;
                    z13 = !z13;
                }
                i21++;
                i16 = i26;
                i19 = i11;
                i17 = i10;
            }
            throw i.a();
        }
    }

    @Override // b6.AbstractC0528h, N5.k
    public final void reset() {
        this.f13436g.clear();
        this.f13437h.clear();
    }
}
