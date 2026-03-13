package b6;

import N5.l;
import N5.m;
import N5.n;
import N5.o;
import N5.p;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;

/* renamed from: b6.k, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class AbstractC0531k extends AbstractC0528h {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f10702d = {1, 1, 1};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f10703e = {1, 1, 1, 1, 1};

    /* renamed from: f, reason: collision with root package name */
    public static final int[][] f10704f;

    /* renamed from: g, reason: collision with root package name */
    public static final int[][] f10705g;

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f10706a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    public final C0530j f10707b = new C0530j(0);

    /* renamed from: c, reason: collision with root package name */
    public final C0530j f10708c = new C0530j(1);

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f10704f = iArr;
        int[][] iArr2 = new int[20][];
        f10705g = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i3 = 10; i3 < 20; i3++) {
            int[] iArr3 = f10704f[i3 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i10 = 0; i10 < iArr3.length; i10++) {
                iArr4[i10] = iArr3[(iArr3.length - i10) - 1];
            }
            f10705g[i3] = iArr4;
        }
    }

    public static int h(T5.a aVar, int[] iArr, int i3, int[][] iArr2) {
        AbstractC0528h.e(i3, aVar, iArr);
        int length = iArr2.length;
        float f10 = 0.48f;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float d8 = AbstractC0528h.d(iArr, iArr2[i11], 0.7f);
            if (d8 < f10) {
                i10 = i11;
                f10 = d8;
            }
        }
        if (i10 >= 0) {
            return i10;
        }
        throw N5.i.a();
    }

    public static int[] l(T5.a aVar, int i3, boolean z2, int[] iArr, int[] iArr2) {
        int i10 = aVar.f7182b;
        int c10 = z2 ? aVar.c(i3) : aVar.b(i3);
        int length = iArr.length;
        boolean z10 = z2;
        int i11 = 0;
        int i12 = c10;
        while (c10 < i10) {
            if (aVar.a(c10) != z10) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (AbstractC0528h.d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i12, c10};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i11] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z10 = !z10;
            }
            c10++;
        }
        throw N5.i.a();
    }

    public static int[] m(T5.a aVar) {
        int[] iArr = new int[3];
        int[] iArr2 = null;
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            Arrays.fill(iArr, 0, 3, 0);
            iArr2 = l(aVar, i3, false, f10702d, iArr);
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            int i12 = i10 - (i11 - i10);
            if (i12 >= 0) {
                z2 = aVar.d(i12, i10);
            }
            i3 = i11;
        }
        return iArr2;
    }

    @Override // b6.AbstractC0528h
    public m b(int i3, T5.a aVar, EnumMap enumMap) {
        return k(i3, aVar, m(aVar), enumMap);
    }

    public boolean g(String str) {
        int length = str.length();
        if (length != 0) {
            int i3 = length - 1;
            int digit = Character.digit(str.charAt(i3), 10);
            CharSequence subSequence = str.subSequence(0, i3);
            int length2 = subSequence.length();
            int i10 = 0;
            for (int i11 = length2 - 1; i11 >= 0; i11 -= 2) {
                int charAt = subSequence.charAt(i11) - '0';
                if (charAt < 0 || charAt > 9) {
                    throw N5.e.a();
                }
                i10 += charAt;
            }
            int i12 = i10 * 3;
            for (int i13 = length2 - 2; i13 >= 0; i13 -= 2) {
                int charAt2 = subSequence.charAt(i13) - '0';
                if (charAt2 < 0 || charAt2 > 9) {
                    throw N5.e.a();
                }
                i12 += charAt2;
            }
            if ((1000 - i12) % 10 == digit) {
                return true;
            }
        }
        return false;
    }

    public int[] i(T5.a aVar, int i3) {
        return l(aVar, i3, false, f10702d, new int[3]);
    }

    public abstract int j(T5.a aVar, int[] iArr, StringBuilder sb2);

    public m k(int i3, T5.a aVar, int[] iArr, EnumMap enumMap) {
        int i10;
        String str = null;
        p pVar = enumMap == null ? null : (p) enumMap.get(N5.d.f4890k);
        if (pVar != null) {
            pVar.a(new o((iArr[0] + iArr[1]) / 2.0f, i3));
        }
        StringBuilder sb2 = this.f10706a;
        sb2.setLength(0);
        int j = j(aVar, iArr, sb2);
        if (pVar != null) {
            pVar.a(new o(j, i3));
        }
        int[] i11 = i(aVar, j);
        if (pVar != null) {
            pVar.a(new o((i11[0] + i11[1]) / 2.0f, i3));
        }
        int i12 = i11[1];
        int i13 = (i12 - i11[0]) + i12;
        if (i13 >= aVar.f7182b || !aVar.d(i12, i13)) {
            throw N5.i.a();
        }
        String sb3 = sb2.toString();
        if (sb3.length() < 8) {
            throw N5.e.a();
        }
        if (!g(sb3)) {
            throw N5.c.a();
        }
        N5.a n10 = n();
        float f10 = i3;
        m mVar = new m(sb3, null, new o[]{new o((iArr[1] + iArr[0]) / 2.0f, f10), new o((i11[1] + i11[0]) / 2.0f, f10)}, n10);
        try {
            m b2 = this.f10707b.b(i3, i11[1], aVar);
            mVar.b(n.j, b2.f4908a);
            mVar.a(b2.f4912e);
            o[] oVarArr = b2.f4910c;
            o[] oVarArr2 = mVar.f4910c;
            if (oVarArr2 == null) {
                mVar.f4910c = oVarArr;
            } else if (oVarArr != null && oVarArr.length > 0) {
                o[] oVarArr3 = new o[oVarArr2.length + oVarArr.length];
                System.arraycopy(oVarArr2, 0, oVarArr3, 0, oVarArr2.length);
                System.arraycopy(oVarArr, 0, oVarArr3, oVarArr2.length, oVarArr.length);
                mVar.f4910c = oVarArr3;
            }
            i10 = b2.f4908a.length();
        } catch (l unused) {
            i10 = 0;
        }
        int[] iArr2 = enumMap == null ? null : (int[]) enumMap.get(N5.d.f4891l);
        if (iArr2 != null) {
            for (int i14 : iArr2) {
                if (i10 != i14) {
                }
            }
            throw N5.i.a();
        }
        if (n10 == N5.a.f4870h || n10 == N5.a.f4876q) {
            C0530j c0530j = this.f10708c;
            synchronized (c0530j) {
                if (((ArrayList) c0530j.f10700a).isEmpty()) {
                    c0530j.a(new int[]{0, 19}, StubApp.getString2("9275"));
                    c0530j.a(new int[]{30, 39}, StubApp.getString2("2912"));
                    c0530j.a(new int[]{60, 139}, StubApp.getString2("9275"));
                    c0530j.a(new int[]{300, 379}, StubApp.getString2("4696"));
                    c0530j.a(new int[]{380}, StubApp.getString2("4746"));
                    c0530j.a(new int[]{383}, StubApp.getString2("4577"));
                    c0530j.a(new int[]{385}, StubApp.getString2("4676"));
                    c0530j.a(new int[]{387}, StubApp.getString2("4751"));
                    c0530j.a(new int[]{400, 440}, StubApp.getString2("4713"));
                    c0530j.a(new int[]{450, 459}, StubApp.getString2("4660"));
                    c0530j.a(new int[]{460, 469}, StubApp.getString2("4586"));
                    c0530j.a(new int[]{471}, StubApp.getString2("4551"));
                    c0530j.a(new int[]{474}, StubApp.getString2("4706"));
                    c0530j.a(new int[]{475}, StubApp.getString2("4640"));
                    c0530j.a(new int[]{476}, StubApp.getString2("4752"));
                    c0530j.a(new int[]{477}, StubApp.getString2("4642"));
                    c0530j.a(new int[]{478}, StubApp.getString2("4546"));
                    c0530j.a(new int[]{479}, StubApp.getString2("4645"));
                    c0530j.a(new int[]{480}, StubApp.getString2("4598"));
                    c0530j.a(new int[]{481}, StubApp.getString2("4733"));
                    c0530j.a(new int[]{482}, StubApp.getString2("4549"));
                    c0530j.a(new int[]{484}, StubApp.getString2("4636"));
                    c0530j.a(new int[]{485}, StubApp.getString2("2981"));
                    c0530j.a(new int[]{486}, StubApp.getString2("4692"));
                    c0530j.a(new int[]{487}, StubApp.getString2("4650"));
                    c0530j.a(new int[]{489}, StubApp.getString2("4677"));
                    c0530j.a(new int[]{490, 499}, StubApp.getString2("4660"));
                    c0530j.a(new int[]{500, 509}, StubApp.getString2("4694"));
                    c0530j.a(new int[]{520}, StubApp.getString2("4682"));
                    c0530j.a(new int[]{528}, StubApp.getString2("4648"));
                    c0530j.a(new int[]{529}, StubApp.getString2("4715"));
                    c0530j.a(new int[]{531}, StubApp.getString2("4631"));
                    c0530j.a(new int[]{535}, StubApp.getString2("4622"));
                    c0530j.a(new int[]{539}, StubApp.getString2("4672"));
                    c0530j.a(new int[]{540, 549}, StubApp.getString2("9276"));
                    c0530j.a(new int[]{560}, StubApp.getString2("4593"));
                    c0530j.a(new int[]{569}, StubApp.getString2("4665"));
                    c0530j.a(new int[]{570, 579}, StubApp.getString2("4711"));
                    c0530j.a(new int[]{590}, StubApp.getString2("4596"));
                    c0530j.a(new int[]{594}, StubApp.getString2("4588"));
                    c0530j.a(new int[]{599}, StubApp.getString2("4674"));
                    c0530j.a(new int[]{600, 601}, StubApp.getString2("4533"));
                    c0530j.a(new int[]{603}, StubApp.getString2("4689"));
                    c0530j.a(new int[]{608}, StubApp.getString2("4745"));
                    c0530j.a(new int[]{609}, StubApp.getString2("4621"));
                    c0530j.a(new int[]{611}, StubApp.getString2("4638"));
                    c0530j.a(new int[]{613}, StubApp.getString2("4708"));
                    c0530j.a(new int[]{616}, StubApp.getString2("4659"));
                    c0530j.a(new int[]{618}, StubApp.getString2("4726"));
                    c0530j.a(new int[]{619}, StubApp.getString2("4556"));
                    c0530j.a(new int[]{621}, StubApp.getString2("4565"));
                    c0530j.a(new int[]{622}, StubApp.getString2("4705"));
                    c0530j.a(new int[]{624}, StubApp.getString2("4639"));
                    c0530j.a(new int[]{625}, StubApp.getString2("4661"));
                    c0530j.a(new int[]{626}, StubApp.getString2("4666"));
                    c0530j.a(new int[]{627}, StubApp.getString2("4652"));
                    c0530j.a(new int[]{628}, StubApp.getString2("4584"));
                    c0530j.a(new int[]{629}, StubApp.getString2("4765"));
                    c0530j.a(new int[]{640, 649}, StubApp.getString2("4701"));
                    c0530j.a(new int[]{690, 695}, StubApp.getString2("4722"));
                    c0530j.a(new int[]{700, 709}, StubApp.getString2("4608"));
                    c0530j.a(new int[]{729}, StubApp.getString2("4671"));
                    c0530j.a(new int[]{730, 739}, StubApp.getString2("4580"));
                    c0530j.a(new int[]{740}, StubApp.getString2("4681"));
                    c0530j.a(new int[]{741}, StubApp.getString2("4567"));
                    c0530j.a(new int[]{742}, StubApp.getString2("9277"));
                    c0530j.a(new int[]{743}, StubApp.getString2("4610"));
                    c0530j.a(new int[]{744}, StubApp.getString2("4720"));
                    c0530j.a(new int[]{745}, StubApp.getString2("4602"));
                    c0530j.a(new int[]{746}, StubApp.getString2("4709"));
                    c0530j.a(new int[]{750}, StubApp.getString2("4618"));
                    c0530j.a(new int[]{754, 755}, StubApp.getString2("4731"));
                    c0530j.a(new int[]{759}, StubApp.getString2("4543"));
                    c0530j.a(new int[]{760, 769}, StubApp.getString2("4727"));
                    c0530j.a(new int[]{770}, StubApp.getString2("4721"));
                    c0530j.a(new int[]{773}, StubApp.getString2("4547"));
                    c0530j.a(new int[]{775}, StubApp.getString2("4601"));
                    c0530j.a(new int[]{777}, StubApp.getString2("4739"));
                    c0530j.a(new int[]{779}, StubApp.getString2("4758"));
                    c0530j.a(new int[]{780}, StubApp.getString2("4724"));
                    c0530j.a(new int[]{784}, StubApp.getString2("4591"));
                    c0530j.a(new int[]{785}, StubApp.getString2("4601"));
                    c0530j.a(new int[]{786}, StubApp.getString2("4707"));
                    c0530j.a(new int[]{789, 790}, StubApp.getString2("4737"));
                    c0530j.a(new int[]{800, 839}, StubApp.getString2("4664"));
                    c0530j.a(new int[]{840, 849}, StubApp.getString2("4703"));
                    c0530j.a(new int[]{850}, StubApp.getString2("4719"));
                    c0530j.a(new int[]{858}, StubApp.getString2("4575"));
                    c0530j.a(new int[]{859}, StubApp.getString2("4714"));
                    c0530j.a(new int[]{860}, StubApp.getString2("9278"));
                    c0530j.a(new int[]{865}, StubApp.getString2("4628"));
                    c0530j.a(new int[]{867}, StubApp.getString2("9279"));
                    c0530j.a(new int[]{868, 869}, StubApp.getString2("4554"));
                    c0530j.a(new int[]{870, 879}, StubApp.getString2("4609"));
                    c0530j.a(new int[]{880}, StubApp.getString2("4653"));
                    c0530j.a(new int[]{885}, StubApp.getString2("4560"));
                    c0530j.a(new int[]{888}, StubApp.getString2("4579"));
                    c0530j.a(new int[]{890}, StubApp.getString2("4669"));
                    c0530j.a(new int[]{893}, StubApp.getString2("4540"));
                    c0530j.a(new int[]{896}, StubApp.getString2("4597"));
                    c0530j.a(new int[]{899}, StubApp.getString2("4673"));
                    c0530j.a(new int[]{900, 919}, StubApp.getString2("4756"));
                    c0530j.a(new int[]{930, 939}, StubApp.getString2("4755"));
                    c0530j.a(new int[]{940, 949}, StubApp.getString2("4752"));
                    c0530j.a(new int[]{955}, StubApp.getString2("4617"));
                    c0530j.a(new int[]{958}, StubApp.getString2("4627"));
                }
            }
            int parseInt = Integer.parseInt(sb3.substring(0, 3));
            int size = ((ArrayList) c0530j.f10700a).size();
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    break;
                }
                int[] iArr3 = (int[]) ((ArrayList) c0530j.f10700a).get(i15);
                int i16 = iArr3[0];
                if (parseInt < i16) {
                    break;
                }
                if (iArr3.length != 1) {
                    i16 = iArr3[1];
                }
                if (parseInt <= i16) {
                    str = (String) ((ArrayList) c0530j.f10701b).get(i15);
                    break;
                }
                i15++;
            }
            if (str != null) {
                mVar.b(n.f4920h, str);
            }
        }
        mVar.b(n.f4924n, StubApp.getString2(9280) + (n10 == N5.a.f4869g ? 4 : 0));
        return mVar;
    }

    public abstract N5.a n();
}
