package b6;

import N5.m;
import com.stub.StubApp;
import java.util.EnumMap;
import org.bouncycastle.asn1.eac.EACTags;

/* renamed from: b6.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0525e extends AbstractC0531k {
    public static final int[] j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f10683k = {1, 1, 1, 1, 1, 1};

    /* renamed from: l, reason: collision with root package name */
    public static final int[][] f10684l = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10685h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f10686i;

    public C0525e(int i3) {
        this.f10685h = i3;
        switch (i3) {
            case 1:
                this.f10686i = new int[4];
                break;
            case 2:
                this.f10686i = new int[4];
                break;
            case 3:
                this.f10686i = new C0525e(0);
                break;
            default:
                this.f10686i = new int[4];
                break;
        }
    }

    public static m o(m mVar) {
        String str = mVar.f4908a;
        if (str.charAt(0) != '0') {
            throw N5.e.a();
        }
        m mVar2 = new m(str.substring(1), null, mVar.f4910c, N5.a.f4876q);
        EnumMap enumMap = mVar.f4912e;
        if (enumMap != null) {
            mVar2.a(enumMap);
        }
        return mVar2;
    }

    @Override // b6.AbstractC0528h, N5.k
    public m a(N5.b bVar, EnumMap enumMap) {
        switch (this.f10685h) {
            case 3:
                return o(((C0525e) this.f10686i).a(bVar, enumMap));
            default:
                return super.a(bVar, enumMap);
        }
    }

    @Override // b6.AbstractC0531k, b6.AbstractC0528h
    public m b(int i3, T5.a aVar, EnumMap enumMap) {
        switch (this.f10685h) {
            case 3:
                return o(((C0525e) this.f10686i).b(i3, aVar, enumMap));
            default:
                return super.b(i3, aVar, enumMap);
        }
    }

    @Override // b6.AbstractC0531k
    public boolean g(String str) {
        switch (this.f10685h) {
            case 1:
                char[] cArr = new char[6];
                str.getChars(1, 7, cArr, 0);
                StringBuilder sb2 = new StringBuilder(12);
                sb2.append(str.charAt(0));
                char c10 = cArr[5];
                String string2 = StubApp.getString2(9266);
                String string22 = StubApp.getString2(9267);
                switch (c10) {
                    case '0':
                    case '1':
                    case '2':
                        sb2.append(cArr, 0, 2);
                        sb2.append(c10);
                        sb2.append(string22);
                        sb2.append(cArr, 2, 3);
                        break;
                    case EACTags.TRANSACTION_DATE /* 51 */:
                        sb2.append(cArr, 0, 3);
                        sb2.append(string2);
                        sb2.append(cArr, 3, 2);
                        break;
                    case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                        sb2.append(cArr, 0, 4);
                        sb2.append(string2);
                        sb2.append(cArr[4]);
                        break;
                    default:
                        sb2.append(cArr, 0, 5);
                        sb2.append(string22);
                        sb2.append(c10);
                        break;
                }
                if (str.length() >= 8) {
                    sb2.append(str.charAt(7));
                }
                return super.g(sb2.toString());
            default:
                return super.g(str);
        }
    }

    @Override // b6.AbstractC0531k
    public int[] i(T5.a aVar, int i3) {
        switch (this.f10685h) {
            case 1:
                return AbstractC0531k.l(aVar, i3, true, f10683k, new int[6]);
            default:
                return super.i(aVar, i3);
        }
    }

    @Override // b6.AbstractC0531k
    public final int j(T5.a aVar, int[] iArr, StringBuilder sb2) {
        int[][] iArr2;
        switch (this.f10685h) {
            case 0:
                int[] iArr3 = (int[]) this.f10686i;
                iArr3[0] = 0;
                iArr3[1] = 0;
                iArr3[2] = 0;
                iArr3[3] = 0;
                int i3 = aVar.f7182b;
                int i10 = iArr[1];
                int i11 = 0;
                for (int i12 = 0; i12 < 6 && i10 < i3; i12++) {
                    int h2 = AbstractC0531k.h(aVar, iArr3, i10, AbstractC0531k.f10705g);
                    sb2.append((char) ((h2 % 10) + 48));
                    for (int i13 : iArr3) {
                        i10 += i13;
                    }
                    if (h2 >= 10) {
                        i11 |= 1 << (5 - i12);
                    }
                }
                for (int i14 = 0; i14 < 10; i14++) {
                    if (i11 == j[i14]) {
                        sb2.insert(0, (char) (i14 + 48));
                        int i15 = AbstractC0531k.l(aVar, i10, true, AbstractC0531k.f10703e, new int[5])[1];
                        for (int i16 = 0; i16 < 6 && i15 < i3; i16++) {
                            sb2.append((char) (AbstractC0531k.h(aVar, iArr3, i15, AbstractC0531k.f10704f) + 48));
                            for (int i17 : iArr3) {
                                i15 += i17;
                            }
                        }
                        return i15;
                    }
                }
                throw N5.i.a();
            case 1:
                int[] iArr4 = (int[]) this.f10686i;
                iArr4[0] = 0;
                iArr4[1] = 0;
                iArr4[2] = 0;
                iArr4[3] = 0;
                int i18 = aVar.f7182b;
                int i19 = iArr[1];
                int i20 = 0;
                for (int i21 = 0; i21 < 6 && i19 < i18; i21++) {
                    int h4 = AbstractC0531k.h(aVar, iArr4, i19, AbstractC0531k.f10705g);
                    sb2.append((char) ((h4 % 10) + 48));
                    for (int i22 : iArr4) {
                        i19 += i22;
                    }
                    if (h4 >= 10) {
                        i20 |= 1 << (5 - i21);
                    }
                }
                for (int i23 = 0; i23 <= 1; i23++) {
                    for (int i24 = 0; i24 < 10; i24++) {
                        if (i20 == f10684l[i23][i24]) {
                            sb2.insert(0, (char) (i23 + 48));
                            sb2.append((char) (i24 + 48));
                            return i19;
                        }
                    }
                }
                throw N5.i.a();
            case 2:
                int[] iArr5 = (int[]) this.f10686i;
                iArr5[0] = 0;
                iArr5[1] = 0;
                iArr5[2] = 0;
                iArr5[3] = 0;
                int i25 = aVar.f7182b;
                int i26 = iArr[1];
                int i27 = 0;
                while (true) {
                    iArr2 = AbstractC0531k.f10704f;
                    if (i27 < 4 && i26 < i25) {
                        sb2.append((char) (AbstractC0531k.h(aVar, iArr5, i26, iArr2) + 48));
                        for (int i28 : iArr5) {
                            i26 += i28;
                        }
                        i27++;
                    }
                }
                int i29 = AbstractC0531k.l(aVar, i26, true, AbstractC0531k.f10703e, new int[5])[1];
                for (int i30 = 0; i30 < 4 && i29 < i25; i30++) {
                    sb2.append((char) (AbstractC0531k.h(aVar, iArr5, i29, iArr2) + 48));
                    for (int i31 : iArr5) {
                        i29 += i31;
                    }
                }
                return i29;
            default:
                return ((C0525e) this.f10686i).j(aVar, iArr, sb2);
        }
    }

    @Override // b6.AbstractC0531k
    public m k(int i3, T5.a aVar, int[] iArr, EnumMap enumMap) {
        switch (this.f10685h) {
            case 3:
                return o(((C0525e) this.f10686i).k(i3, aVar, iArr, enumMap));
            default:
                return super.k(i3, aVar, iArr, enumMap);
        }
    }

    @Override // b6.AbstractC0531k
    public final N5.a n() {
        switch (this.f10685h) {
            case 0:
                return N5.a.f4870h;
            case 1:
                return N5.a.f4877r;
            case 2:
                return N5.a.f4869g;
            default:
                return N5.a.f4876q;
        }
    }
}
