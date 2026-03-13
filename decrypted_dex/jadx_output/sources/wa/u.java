package wa;

import aa.C0398e;
import android.util.Log;
import com.stub.StubApp;
import ea.C0854a;
import ea.C0857d;
import fa.C0935a;
import ha.C1013a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.UByte;
import oa.AbstractC1469b;
import oa.C1471d;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import ta.C1747g;
import xa.AbstractC1935c;
import xa.C1933a;
import xa.C1940h;
import xa.C1941i;
import xa.C1942j;
import xa.C1943k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class u extends q {

    /* renamed from: v, reason: collision with root package name */
    public static final HashMap f22265v;

    /* renamed from: w, reason: collision with root package name */
    public static final u f22266w;

    /* renamed from: p, reason: collision with root package name */
    public final X9.b f22267p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f22268q;

    /* renamed from: r, reason: collision with root package name */
    public Ia.b f22269r;

    /* renamed from: s, reason: collision with root package name */
    public final C1013a f22270s;

    /* renamed from: t, reason: collision with root package name */
    public C0935a f22271t;

    static {
        HashMap hashMap = new HashMap();
        f22265v = hashMap;
        hashMap.put(StubApp.getString2(7949), StubApp.getString2(24030));
        hashMap.put(StubApp.getString2(7950), StubApp.getString2(24031));
        hashMap.put(StubApp.getString2(7951), StubApp.getString2(24032));
        hashMap.put(StubApp.getString2(7793), StubApp.getString2(24033));
        hashMap.put(StubApp.getString2(7794), StubApp.getString2(24034));
        hashMap.put(StubApp.getString2(24035), StubApp.getString2(24036));
        hashMap.put(StubApp.getString2(24037), StubApp.getString2(24038));
        hashMap.put(StubApp.getString2(24039), StubApp.getString2(24040));
        hashMap.put(StubApp.getString2(7805), StubApp.getString2(24041));
        new u(StubApp.getString2(23929));
        new u(StubApp.getString2(23936));
        new u(StubApp.getString2(23943));
        new u(StubApp.getString2(23950));
        f22266w = new u(StubApp.getString2(23904));
        new u(StubApp.getString2(23910));
        new u(StubApp.getString2(23917));
        new u(StubApp.getString2(23923));
        new u(StubApp.getString2(23883));
        new u(StubApp.getString2(23888));
        new u(StubApp.getString2(23893));
        new u(StubApp.getString2(23898));
        new u(StubApp.getString2(23951));
        new u(StubApp.getString2(23958));
    }

    public u(String str) {
        super(str);
        String string2;
        this.f22230a.V(oa.j.f18576o3, oa.j.f18422A3);
        this.f22230a.X(oa.j.f18622z, str);
        if (StubApp.getString2(23958).equals(str)) {
            this.f22241k = C1943k.f23137d;
        } else if (StubApp.getString2(23951).equals(str)) {
            this.f22241k = C1941i.f23133d;
        } else {
            this.f22241k = C1942j.f23135d;
            this.f22230a.V(oa.j.f18513X0, oa.j.f18464J3);
        }
        new ConcurrentHashMap();
        C0398e h2 = ((h) Ec.d.A()).h(x(), this.f22233d);
        X9.b bVar = (X9.b) h2.f9344b;
        this.f22267p = bVar;
        if (h2.f9343a) {
            try {
                string2 = bVar.getName();
            } catch (IOException unused) {
                string2 = StubApp.getString2(DilithiumEngine.DilithiumPolyT1PackedBytes);
            }
            StringBuilder l9 = com.mapbox.common.b.l(StubApp.getString2(23983), string2, StubApp.getString2(24042));
            l9.append(x());
            Log.w(StubApp.getString2(948), l9.toString());
        }
        this.f22268q = false;
        C1013a c1013a = new C1013a();
        c1013a.f14474d = 1.0d;
        c1013a.f14471a = 1.0d;
        c1013a.f14476f = 0.0d;
        c1013a.f14475e = 0.0d;
        c1013a.f14473c = 0.0d;
        c1013a.f14472b = 0.0d;
        this.f22270s = c1013a;
    }

    public static int w(int i3, byte[] bArr) {
        byte b2;
        while (i3 > 0) {
            if (bArr[i3] == 101 && bArr[i3 + 1] == 120 && bArr[i3 + 2] == 101 && bArr[i3 + 3] == 99) {
                int i10 = i3 + 4;
                while (i10 < bArr.length && ((b2 = bArr[i10]) == 13 || b2 == 10 || b2 == 32 || b2 == 9)) {
                    i10++;
                }
                return i10;
            }
            i3--;
        }
        return i3;
    }

    @Override // wa.m, wa.o
    public final Ia.b a() {
        List list;
        Ia.b bVar = m.j;
        if (this.f22269r == null) {
            try {
                list = this.f22267p.a();
            } catch (IOException unused) {
                this.f22269r = bVar;
                list = null;
            }
            if (list == null || list.size() != 6) {
                return bVar;
            }
            this.f22269r = new Ia.b(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue(), ((Number) list.get(3)).floatValue(), ((Number) list.get(4)).floatValue(), ((Number) list.get(5)).floatValue());
        }
        return this.f22269r;
    }

    @Override // wa.o
    public final C0935a b() {
        C1747g a3;
        if (this.f22271t == null) {
            n nVar = this.f22233d;
            this.f22271t = (nVar == null || (a3 = nVar.a()) == null || (a3.a() == 0.0f && a3.b() == 0.0f && a3.c() == 0.0f && a3.d() == 0.0f)) ? this.f22267p.d() : new C0935a(a3.a(), a3.b(), a3.c(), a3.d());
        }
        return this.f22271t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0086, code lost:
    
        if (r5 != false) goto L33;
     */
    @Override // wa.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float c(int r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 0
            xa.c r2 = r7.f22241k
            r3 = 7719(0x1e27, float:1.0817E-41)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            if (r2 == 0) goto L12
            java.lang.String r8 = r2.c(r8)
            goto L13
        L12:
            r8 = r3
        L13:
            X9.b r2 = r7.f22267p
            boolean r4 = r7.f22268q
            if (r4 != 0) goto L8a
            boolean r5 = r2.e(r8)
            if (r5 == 0) goto L20
            goto L8a
        L20:
            java.util.HashMap r5 = wa.u.f22265v
            java.lang.Object r5 = r5.get(r8)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L38
            boolean r6 = r8.equals(r3)
            if (r6 != 0) goto L38
            boolean r6 = r2.e(r5)
            if (r6 == 0) goto L38
        L36:
            r8 = r5
            goto L8a
        L38:
            xa.d r5 = r7.f22242l
            java.lang.String r5 = r5.c(r8)
            if (r5 == 0) goto L89
            int r6 = r5.length()
            if (r6 != r0) goto L89
            int r5 = r5.codePointAt(r1)
            java.lang.String r5 = Tc.d.k(r5)
            boolean r6 = r2.e(r5)
            if (r6 == 0) goto L55
            goto L36
        L55:
            r5 = 23952(0x5d90, float:3.3564E-41)
            java.lang.String r5 = com.stub.StubApp.getString2(r5)
            java.lang.String r6 = r2.getName()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L89
            xa.i r5 = xa.C1941i.f23133d
            java.util.HashMap r5 = r5.f23118b
            java.util.Map r5 = java.util.Collections.unmodifiableMap(r5)
            java.lang.Object r8 = r5.get(r8)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L89
            int r8 = r8.intValue()
            r5 = 61440(0xf000, float:8.6096E-41)
            int r8 = r8 + r5
            java.lang.String r8 = Tc.d.k(r8)
            boolean r5 = r2.e(r8)
            if (r5 == 0) goto L89
            goto L8a
        L89:
            r8 = r3
        L8a:
            if (r4 != 0) goto L95
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L95
            r8 = 1132068864(0x437a0000, float:250.0)
            return r8
        L95:
            float r8 = r2.h(r8)
            r2 = 2
            float[] r2 = new float[r2]
            r2[r1] = r8
            r8 = 0
            r2[r0] = r8
            ha.a r8 = r7.f22270s
            r8.b(r2, r2)
            r8 = r2[r1]
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: wa.u.c(int):float");
    }

    @Override // wa.o
    public final boolean d() {
        return this.f22268q;
    }

    @Override // wa.m
    public final float e() {
        Y9.b bVar = this.f22232c;
        return bVar != null ? bVar.a() : super.e();
    }

    @Override // wa.o
    public final String getName() {
        return x();
    }

    @Override // wa.m
    public final int q(ByteArrayInputStream byteArrayInputStream) {
        return byteArrayInputStream.read();
    }

    @Override // wa.q
    public final AbstractC1935c v() {
        Y9.b bVar;
        if (!this.f22268q && (bVar = this.f22232c) != null) {
            return new C1933a(bVar);
        }
        X9.b bVar2 = this.f22267p;
        return bVar2 instanceof X9.a ? C1933a.d(((X9.a) bVar2).b()) : C1940h.f23131d;
    }

    public final String x() {
        return this.f22230a.Q(oa.j.f18622z);
    }

    public final int y(int i3, byte[] bArr) {
        int max = Math.max(0, i3 - 4);
        if (max <= 0 || max > bArr.length - 4) {
            max = bArr.length - 4;
        }
        int w10 = w(max, bArr);
        if (w10 == 0 && i3 > 0) {
            w10 = w(bArr.length - 4, bArr);
        }
        if (i3 - w10 == 0 || w10 <= 0) {
            return i3;
        }
        StringBuilder u2 = Xa.h.u(i3, StubApp.getString2(24050), StubApp.getString2(24051));
        u2.append(x());
        Log.w(StubApp.getString2(948), u2.toString());
        return w10;
    }

    public final int z(int i3, int i10, byte[] bArr) {
        if (i10 >= 0 && i10 <= bArr.length - i3) {
            return i10;
        }
        StringBuilder u2 = Xa.h.u(i10, StubApp.getString2(24052), StubApp.getString2(24051));
        u2.append(x());
        Log.w(StubApp.getString2(948), u2.toString());
        return bArr.length - i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(C1471d c1471d) {
        super(c1471d);
        int i3;
        String string2 = StubApp.getString2(24043);
        new HashMap();
        n nVar = this.f22233d;
        C0857d c0857d = null;
        String string22 = StubApp.getString2(948);
        if (nVar != null) {
            if (nVar.b() != null) {
                Log.w(string22, StubApp.getString2(24044));
            }
            AbstractC1469b J10 = nVar.f22238a.J(oa.j.f18574o1);
            ta.h hVar = J10 instanceof oa.p ? new ta.h((oa.p) J10) : null;
            if (hVar != null) {
                try {
                    oa.p pVar = (oa.p) hVar.f21257b;
                    int N3 = pVar.N(oa.j.f18498S1, null, -1);
                    int N10 = pVar.N(oa.j.f18502T1, null, -1);
                    byte[] a3 = hVar.a();
                    if (a3.length != 0) {
                        int y10 = y(N3, a3);
                        int z2 = z(y10, N10, a3);
                        if ((a3[0] & UByte.MAX_VALUE) == 128) {
                            c0857d = C0857d.f(a3);
                        } else if (y10 >= 0 && y10 <= (i3 = y10 + z2)) {
                            byte[] copyOfRange = Arrays.copyOfRange(a3, 0, y10);
                            byte[] copyOfRange2 = Arrays.copyOfRange(a3, y10, i3);
                            if (y10 > 0 && z2 > 0) {
                                c0857d = new V6.b(12, false).N(copyOfRange, copyOfRange2);
                            }
                        } else {
                            throw new IOException(string2 + a3.length + StubApp.getString2("24045") + y10 + StubApp.getString2("24046") + z2);
                        }
                    } else {
                        throw new IOException(StubApp.getString2("24047"));
                    }
                } catch (C0854a unused) {
                    Log.w(string22, StubApp.getString2(24049) + nVar.c());
                } catch (IOException e10) {
                    Log.e(string22, StubApp.getString2(24048) + nVar.c(), e10);
                }
            }
        }
        this.f22268q = c0857d != null;
        if (c0857d != null) {
            this.f22267p = c0857d;
        } else {
            C0398e h2 = ((h) Ec.d.A()).h(x(), nVar);
            X9.b bVar = (X9.b) h2.f9344b;
            this.f22267p = bVar;
            if (h2.f9343a) {
                Log.w(string22, StubApp.getString2(23983) + bVar.getName() + StubApp.getString2(6035) + x());
            }
        }
        u();
        C1013a b2 = a().b();
        this.f22270s = b2;
        b2.a();
    }
}
