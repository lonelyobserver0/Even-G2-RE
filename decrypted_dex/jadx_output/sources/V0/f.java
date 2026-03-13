package V0;

import M4.C;
import M4.G;
import M4.I;
import M4.Z;
import M4.r;
import com.stub.StubApp;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import o0.AbstractC1405B;
import o0.C1437l;
import o0.C1438m;
import p0.AbstractC1482f;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Z f7708a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7709b;

    public f(int i3, Z z2) {
        this.f7709b = i3;
        this.f7708a = z2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static f b(int i3, C1553n c1553n) {
        a gVar;
        String string2;
        int i10;
        int i11 = 4;
        r.d(4, StubApp.getString2(2352));
        Object[] objArr = new Object[4];
        int i12 = c1553n.f20178c;
        int i13 = 0;
        int i14 = -2;
        int i15 = 0;
        while (c1553n.a() > 8) {
            int j = c1553n.j();
            int j3 = c1553n.f20177b + c1553n.j();
            c1553n.F(j3);
            if (j != 1414744396) {
                d dVar = null;
                switch (j) {
                    case 1718776947:
                        String string22 = StubApp.getString2(6475);
                        if (i14 == 2) {
                            c1553n.H(i11);
                            int j10 = c1553n.j();
                            int j11 = c1553n.j();
                            c1553n.H(i11);
                            int j12 = c1553n.j();
                            switch (j12) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    string2 = StubApp.getString2(2392);
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    string2 = StubApp.getString2(469);
                                    break;
                                case 842289229:
                                    string2 = StubApp.getString2(6478);
                                    break;
                                case 859066445:
                                    string2 = StubApp.getString2(6477);
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    string2 = StubApp.getString2(6476);
                                    break;
                                default:
                                    string2 = null;
                                    break;
                            }
                            if (string2 != null) {
                                C1437l c1437l = new C1437l();
                                c1437l.f18184t = j10;
                                c1437l.f18185u = j11;
                                c1437l.f18177m = AbstractC1405B.m(string2);
                                gVar = new g(new C1438m(c1437l));
                                break;
                            } else {
                                AbstractC1482f.p(j12, StubApp.getString2(6479), string22);
                                gVar = dVar;
                                break;
                            }
                        } else {
                            if (i14 == 1) {
                                int n10 = c1553n.n();
                                String string23 = StubApp.getString2(76);
                                String string24 = StubApp.getString2(468);
                                String string25 = n10 != 1 ? n10 != 85 ? n10 != 255 ? n10 != 8192 ? n10 != 8193 ? null : StubApp.getString2(3202) : StubApp.getString2(1629) : string24 : StubApp.getString2(1623) : string23;
                                if (string25 != null) {
                                    int n11 = c1553n.n();
                                    int j13 = c1553n.j();
                                    c1553n.H(6);
                                    int y10 = AbstractC1560u.y(c1553n.n());
                                    int n12 = c1553n.a() > 0 ? c1553n.n() : i13;
                                    byte[] bArr = new byte[n12];
                                    c1553n.f(i13, n12, bArr);
                                    C1437l c1437l2 = new C1437l();
                                    c1437l2.f18177m = AbstractC1405B.m(string25);
                                    c1437l2.f18156B = n11;
                                    c1437l2.f18157C = j13;
                                    if (string23.equals(string25) && y10 != 0) {
                                        c1437l2.f18158D = y10;
                                    }
                                    if (string24.equals(string25) && n12 > 0) {
                                        c1437l2.f18180p = I.q(bArr);
                                    }
                                    gVar = new g(new C1438m(c1437l2));
                                    break;
                                } else {
                                    AbstractC1482f.p(n10, StubApp.getString2(6480), string22);
                                }
                            } else {
                                AbstractC1550k.w(string22, StubApp.getString2(6481) + AbstractC1560u.C(i14));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int j14 = c1553n.j();
                        c1553n.H(8);
                        int j15 = c1553n.j();
                        int j16 = c1553n.j();
                        c1553n.H(i11);
                        c1553n.j();
                        c1553n.H(12);
                        gVar = new c(j14, j15, j16);
                        break;
                    case 1752331379:
                        int j17 = c1553n.j();
                        c1553n.H(12);
                        c1553n.j();
                        int j18 = c1553n.j();
                        int j19 = c1553n.j();
                        c1553n.H(i11);
                        int j20 = c1553n.j();
                        int j21 = c1553n.j();
                        c1553n.H(8);
                        dVar = new d(j17, j18, j19, j20, j21);
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(c1553n.s(c1553n.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = b(c1553n.j(), c1553n);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    int i16 = ((d) gVar).f7691a;
                    if (i16 == 1935960438) {
                        i14 = 2;
                    } else if (i16 != 1935963489) {
                        if (i16 != 1937012852) {
                            AbstractC1550k.w(StubApp.getString2(6483), StubApp.getString2(6482) + Integer.toHexString(i16));
                            i10 = -1;
                        } else {
                            i10 = 3;
                        }
                        i14 = i10;
                    } else {
                        i14 = 1;
                    }
                }
                int i17 = i15 + 1;
                int f10 = C.f(objArr.length, i17);
                if (f10 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, f10);
                }
                objArr[i15] = gVar;
                i15 = i17;
            }
            c1553n.G(j3);
            c1553n.F(i12);
            i11 = 4;
            i13 = 0;
        }
        return new f(i3, I.j(i15, objArr));
    }

    public final a a(Class cls) {
        G listIterator = this.f7708a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override // V0.a
    public final int getType() {
        return this.f7709b;
    }
}
