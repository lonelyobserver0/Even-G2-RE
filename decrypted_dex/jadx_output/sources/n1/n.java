package n1;

import J1.s;
import M4.I;
import T0.F;
import com.stub.StubApp;
import f4.C0879c;
import h1.AbstractC1006i;
import h1.C0998a;
import h1.C1002e;
import i2.u;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;
import o0.C1404A;
import o0.z;
import p0.AbstractC1482f;
import r0.AbstractC1550k;
import r0.C1553n;
import s0.C1593a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f17754a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static byte[] a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length = AbstractC1482f.c(uuidArr.length, 16, 4, length);
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            allocate.putInt(0);
        } else {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static C1593a b(C1404A c1404a, String str) {
        int i3 = 0;
        while (true) {
            z[] zVarArr = c1404a.f18017a;
            if (i3 >= zVarArr.length) {
                return null;
            }
            z zVar = zVarArr[i3];
            if (zVar instanceof C1593a) {
                C1593a c1593a = (C1593a) zVar;
                if (c1593a.f20587a.equals(str)) {
                    return c1593a;
                }
            }
            i3++;
        }
    }

    public static boolean c(int i3, boolean z2) {
        if ((i3 >>> 8) == 3368816) {
            return true;
        }
        if (i3 == 1751476579 && z2) {
            return true;
        }
        int[] iArr = f17754a;
        for (int i10 = 0; i10 < 29; i10++) {
            if (iArr[i10] == i3) {
                return true;
            }
        }
        return false;
    }

    public static C1002e d(int i3, C1553n c1553n) {
        int h2 = c1553n.h();
        if (c1553n.h() == 1684108385) {
            c1553n.H(8);
            String q10 = c1553n.q(h2 - 16);
            return new C1002e(StubApp.getString2(3969), q10, q10);
        }
        AbstractC1550k.w(StubApp.getString2(21347), StubApp.getString2(21367) + s.i(i3));
        return null;
    }

    public static C0998a e(C1553n c1553n) {
        int h2 = c1553n.h();
        int h4 = c1553n.h();
        String string2 = StubApp.getString2(21347);
        if (h4 != 1684108385) {
            AbstractC1550k.w(string2, StubApp.getString2(21369));
            return null;
        }
        int h5 = c1553n.h();
        byte[] bArr = c.f17649a;
        int i3 = h5 & 16777215;
        String string22 = i3 == 13 ? StubApp.getString2(6953) : i3 == 14 ? StubApp.getString2(6955) : null;
        if (string22 == null) {
            AbstractC1482f.p(i3, StubApp.getString2(21368), string2);
            return null;
        }
        c1553n.H(4);
        int i10 = h2 - 16;
        byte[] bArr2 = new byte[i10];
        c1553n.f(0, i10, bArr2);
        return new C0998a(3, string22, null, bArr2);
    }

    public static h1.o f(int i3, String str, C1553n c1553n) {
        int h2 = c1553n.h();
        if (c1553n.h() == 1684108385 && h2 >= 22) {
            c1553n.H(10);
            int A4 = c1553n.A();
            if (A4 > 0) {
                String p8 = u.p(A4, "");
                int A5 = c1553n.A();
                if (A5 > 0) {
                    p8 = p8 + StubApp.getString2(601) + A5;
                }
                return new h1.o(str, null, I.q(p8));
            }
        }
        AbstractC1550k.w(StubApp.getString2(21347), StubApp.getString2(21370) + s.i(i3));
        return null;
    }

    public static int g(C1553n c1553n) {
        int h2 = c1553n.h();
        if (c1553n.h() == 1684108385) {
            c1553n.H(8);
            int i3 = h2 - 16;
            if (i3 == 1) {
                return c1553n.u();
            }
            if (i3 == 2) {
                return c1553n.A();
            }
            if (i3 == 3) {
                return c1553n.x();
            }
            if (i3 == 4 && (c1553n.e() & 128) == 0) {
                return c1553n.y();
            }
        }
        AbstractC1550k.w(StubApp.getString2(21347), StubApp.getString2(21371));
        return -1;
    }

    public static AbstractC1006i h(int i3, String str, C1553n c1553n, boolean z2, boolean z10) {
        int g10 = g(c1553n);
        if (z10) {
            g10 = Math.min(1, g10);
        }
        if (g10 >= 0) {
            return z2 ? new h1.o(str, null, I.q(Integer.toString(g10))) : new C1002e(StubApp.getString2(3969), str, Integer.toString(g10));
        }
        AbstractC1550k.w(StubApp.getString2(21347), StubApp.getString2(21372) + s.i(i3));
        return null;
    }

    public static C0879c i(byte[] bArr) {
        C1553n c1553n = new C1553n(bArr);
        if (c1553n.f20178c < 32) {
            return null;
        }
        c1553n.G(0);
        int a3 = c1553n.a();
        int h2 = c1553n.h();
        String string2 = StubApp.getString2(21373);
        if (h2 != a3) {
            AbstractC1550k.w(string2, StubApp.getString2(21374) + h2 + StubApp.getString2(21375) + a3);
            return null;
        }
        int h4 = c1553n.h();
        if (h4 != 1886614376) {
            AbstractC1482f.p(h4, StubApp.getString2(21376), string2);
            return null;
        }
        int c10 = c.c(c1553n.h());
        if (c10 > 1) {
            AbstractC1482f.p(c10, StubApp.getString2(21377), string2);
            return null;
        }
        UUID uuid = new UUID(c1553n.o(), c1553n.o());
        if (c10 == 1) {
            int y10 = c1553n.y();
            UUID[] uuidArr = new UUID[y10];
            for (int i3 = 0; i3 < y10; i3++) {
                uuidArr[i3] = new UUID(c1553n.o(), c1553n.o());
            }
        }
        int y11 = c1553n.y();
        int a9 = c1553n.a();
        if (y11 == a9) {
            byte[] bArr2 = new byte[y11];
            c1553n.f(0, y11, bArr2);
            return new C0879c(uuid, c10, bArr2);
        }
        AbstractC1550k.w(string2, StubApp.getString2(21378) + y11 + StubApp.getString2(21379) + a9);
        return null;
    }

    public static h1.o j(int i3, String str, C1553n c1553n) {
        int h2 = c1553n.h();
        if (c1553n.h() == 1684108385) {
            c1553n.H(8);
            return new h1.o(str, null, I.q(c1553n.q(h2 - 16)));
        }
        AbstractC1550k.w(StubApp.getString2(21347), StubApp.getString2(21380) + s.i(i3));
        return null;
    }

    public static F k(T0.p pVar, boolean z2, boolean z10) {
        F f10;
        int i3;
        int i10;
        long j;
        int i11;
        int i12;
        int[] iArr;
        boolean z11 = true;
        long r8 = pVar.r();
        long j3 = -1;
        long j10 = 4096;
        if (r8 != -1 && r8 <= 4096) {
            j10 = r8;
        }
        int i13 = (int) j10;
        C1553n c1553n = new C1553n(64);
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i13) {
            c1553n.D(8);
            if (!pVar.i(c1553n.f20176a, i14, 8, z11)) {
                break;
            }
            long w10 = c1553n.w();
            int i17 = z11;
            int h2 = c1553n.h();
            if (w10 == 1) {
                pVar.b(8, 8, c1553n.f20176a);
                i11 = 16;
                c1553n.F(16);
                j = c1553n.o();
                i10 = i15;
            } else {
                if (w10 == 0) {
                    long r10 = pVar.r();
                    if (r10 != j3) {
                        w10 = (r10 - pVar.l()) + 8;
                    }
                }
                i10 = i15;
                j = w10;
                i11 = 8;
            }
            long j11 = i11;
            if (j < j11) {
                return new i();
            }
            int i18 = i10 + i11;
            f10 = null;
            if (h2 == 1836019574) {
                i13 += (int) j;
                if (r8 != -1 && i13 > r8) {
                    i13 = (int) r8;
                }
                i15 = i18;
                z11 = i17;
                j3 = -1;
                i14 = 0;
            } else {
                if (h2 == 1836019558 || h2 == 1836475768) {
                    i3 = i17;
                    break;
                }
                if (h2 == 1835295092) {
                    i16 = i17;
                }
                long j12 = r8;
                if ((i18 + j) - j11 >= i13) {
                    i3 = 0;
                    break;
                }
                int i19 = (int) (j - j11);
                i15 = i18 + i19;
                if (h2 != 1718909296) {
                    i12 = 0;
                    if (i19 != 0) {
                        pVar.o(i19);
                    }
                } else {
                    if (i19 < 8) {
                        return new i();
                    }
                    c1553n.D(i19);
                    i12 = 0;
                    pVar.b(0, i19, c1553n.f20176a);
                    if (c(c1553n.h(), z10)) {
                        i16 = i17;
                    }
                    c1553n.H(4);
                    int a3 = c1553n.a() / 4;
                    if (i16 == 0 && a3 > 0) {
                        iArr = new int[a3];
                        int i20 = 0;
                        while (true) {
                            if (i20 >= a3) {
                                break;
                            }
                            int h4 = c1553n.h();
                            iArr[i20] = h4;
                            if (c(h4, z10)) {
                                i16 = i17;
                                break;
                            }
                            i20++;
                        }
                    } else {
                        iArr = null;
                    }
                    if (i16 == 0) {
                        i iVar = new i();
                        if (iArr == null) {
                            int i21 = P4.a.f5532c;
                            return iVar;
                        }
                        int i22 = P4.a.f5532c;
                        if (iArr.length == 0) {
                            return iVar;
                        }
                        new P4.a(Arrays.copyOf(iArr, iArr.length));
                        return iVar;
                    }
                }
                i14 = i12;
                z11 = i17;
                r8 = j12;
                j3 = -1;
            }
        }
        f10 = null;
        i3 = i14;
        return i16 == 0 ? i.f17710c : z2 != i3 ? i3 != 0 ? i.f17708a : i.f17709b : f10;
    }
}
