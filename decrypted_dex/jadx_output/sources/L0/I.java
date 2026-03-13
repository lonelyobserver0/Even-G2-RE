package L0;

import com.stub.StubApp;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import o0.C1417N;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class I implements InterfaceC0129z, InterfaceC0128y {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0129z[] f3899a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentityHashMap f3900b;

    /* renamed from: c, reason: collision with root package name */
    public final I4.e f3901c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3902d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f3903e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0128y f3904f;

    /* renamed from: g, reason: collision with root package name */
    public h0 f3905g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0129z[] f3906h;
    public C0117m j;

    public I(I4.e eVar, long[] jArr, InterfaceC0129z... interfaceC0129zArr) {
        this.f3901c = eVar;
        this.f3899a = interfaceC0129zArr;
        eVar.getClass();
        M4.G g10 = M4.I.f4549b;
        M4.Z z2 = M4.Z.f4578e;
        this.j = new C0117m(z2, z2);
        this.f3900b = new IdentityHashMap();
        this.f3906h = new InterfaceC0129z[0];
        for (int i3 = 0; i3 < interfaceC0129zArr.length; i3++) {
            long j = jArr[i3];
            if (j != 0) {
                this.f3899a[i3] = new f0(interfaceC0129zArr[i3], j);
            }
        }
    }

    @Override // L0.InterfaceC0128y
    public final void a(InterfaceC0129z interfaceC0129z) {
        String string2;
        ArrayList arrayList = this.f3902d;
        arrayList.remove(interfaceC0129z);
        if (arrayList.isEmpty()) {
            InterfaceC0129z[] interfaceC0129zArr = this.f3899a;
            int i3 = 0;
            for (InterfaceC0129z interfaceC0129z2 : interfaceC0129zArr) {
                i3 += interfaceC0129z2.s().f4093a;
            }
            C1417N[] c1417nArr = new C1417N[i3];
            int i10 = 0;
            for (int i11 = 0; i11 < interfaceC0129zArr.length; i11++) {
                h0 s10 = interfaceC0129zArr[i11].s();
                int i12 = s10.f4093a;
                int i13 = 0;
                while (i13 < i12) {
                    C1417N a3 = s10.a(i13);
                    int i14 = a3.f18067a;
                    C1438m[] c1438mArr = new C1438m[i14];
                    int i15 = 0;
                    while (true) {
                        string2 = StubApp.getString2(478);
                        if (i15 < i14) {
                            C1438m c1438m = a3.f18070d[i15];
                            C1437l a9 = c1438m.a();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i11);
                            sb2.append(string2);
                            String str = c1438m.f18204a;
                            if (str == null) {
                                str = "";
                            }
                            sb2.append(str);
                            a9.f18166a = sb2.toString();
                            c1438mArr[i15] = new C1438m(a9);
                            i15++;
                        }
                    }
                    C1417N c1417n = new C1417N(i11 + string2 + a3.f18068b, c1438mArr);
                    this.f3903e.put(c1417n, a3);
                    c1417nArr[i10] = c1417n;
                    i13++;
                    i10++;
                }
            }
            this.f3905g = new h0(c1417nArr);
            InterfaceC0128y interfaceC0128y = this.f3904f;
            interfaceC0128y.getClass();
            interfaceC0128y.a(this);
        }
    }

    @Override // L0.InterfaceC0129z
    public final long b(long j, v0.c0 c0Var) {
        InterfaceC0129z[] interfaceC0129zArr = this.f3906h;
        return (interfaceC0129zArr.length > 0 ? interfaceC0129zArr[0] : this.f3899a[0]).b(j, c0Var);
    }

    @Override // L0.InterfaceC0129z
    public final long c(O0.s[] sVarArr, boolean[] zArr, Z[] zArr2, boolean[] zArr3, long j) {
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2 = new int[sVarArr.length];
        int[] iArr3 = new int[sVarArr.length];
        int i3 = 0;
        int i10 = 0;
        while (true) {
            int length = sVarArr.length;
            identityHashMap = this.f3900b;
            if (i10 >= length) {
                break;
            }
            Z z2 = zArr2[i10];
            Integer num = z2 == null ? null : (Integer) identityHashMap.get(z2);
            iArr2[i10] = num == null ? -1 : num.intValue();
            O0.s sVar = sVarArr[i10];
            if (sVar != null) {
                String str = sVar.c().f18068b;
                iArr3[i10] = Integer.parseInt(str.substring(0, str.indexOf(StubApp.getString2(478))));
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        identityHashMap.clear();
        int length2 = sVarArr.length;
        Z[] zArr4 = new Z[length2];
        Z[] zArr5 = new Z[sVarArr.length];
        O0.s[] sVarArr2 = new O0.s[sVarArr.length];
        InterfaceC0129z[] interfaceC0129zArr = this.f3899a;
        ArrayList arrayList = new ArrayList(interfaceC0129zArr.length);
        long j3 = j;
        int i11 = 0;
        while (i11 < interfaceC0129zArr.length) {
            int i12 = i3;
            while (i12 < sVarArr.length) {
                zArr5[i12] = iArr2[i12] == i11 ? zArr2[i12] : null;
                if (iArr3[i12] == i11) {
                    O0.s sVar2 = sVarArr[i12];
                    sVar2.getClass();
                    iArr = iArr2;
                    C1417N c1417n = (C1417N) this.f3903e.get(sVar2.c());
                    c1417n.getClass();
                    sVarArr2[i12] = new H(sVar2, c1417n);
                } else {
                    iArr = iArr2;
                    sVarArr2[i12] = null;
                }
                i12++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr2;
            InterfaceC0129z[] interfaceC0129zArr2 = interfaceC0129zArr;
            int i13 = i11;
            long c10 = interfaceC0129zArr2[i11].c(sVarArr2, zArr, zArr5, zArr3, j3);
            if (i13 == 0) {
                j3 = c10;
            } else if (c10 != j3) {
                throw new IllegalStateException(StubApp.getString2(3290));
            }
            boolean z10 = false;
            for (int i14 = 0; i14 < sVarArr.length; i14++) {
                if (iArr3[i14] == i13) {
                    Z z11 = zArr5[i14];
                    z11.getClass();
                    zArr4[i14] = zArr5[i14];
                    identityHashMap.put(z11, Integer.valueOf(i13));
                    z10 = true;
                } else if (iArr4[i14] == i13) {
                    AbstractC1550k.g(zArr5[i14] == null);
                }
            }
            if (z10) {
                arrayList.add(interfaceC0129zArr2[i13]);
            }
            i11 = i13 + 1;
            interfaceC0129zArr = interfaceC0129zArr2;
            iArr2 = iArr4;
            i3 = 0;
        }
        int i15 = i3;
        System.arraycopy(zArr4, i15, zArr2, i15, length2);
        this.f3906h = (InterfaceC0129z[]) arrayList.toArray(new InterfaceC0129z[i15]);
        AbstractList u2 = M4.r.u(arrayList, new A1.a(20));
        this.f3901c.getClass();
        this.j = new C0117m(arrayList, u2);
        return j3;
    }

    @Override // L0.InterfaceC0129z
    public final void e(InterfaceC0128y interfaceC0128y, long j) {
        this.f3904f = interfaceC0128y;
        ArrayList arrayList = this.f3902d;
        InterfaceC0129z[] interfaceC0129zArr = this.f3899a;
        Collections.addAll(arrayList, interfaceC0129zArr);
        for (InterfaceC0129z interfaceC0129z : interfaceC0129zArr) {
            interfaceC0129z.e(this, j);
        }
    }

    @Override // L0.b0
    public final long f() {
        return this.j.f();
    }

    @Override // L0.b0
    public final boolean g(v0.I i3) {
        ArrayList arrayList = this.f3902d;
        if (arrayList.isEmpty()) {
            return this.j.g(i3);
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((InterfaceC0129z) arrayList.get(i10)).g(i3);
        }
        return false;
    }

    @Override // L0.a0
    public final void h(b0 b0Var) {
        InterfaceC0128y interfaceC0128y = this.f3904f;
        interfaceC0128y.getClass();
        interfaceC0128y.h(this);
    }

    @Override // L0.InterfaceC0129z
    public final void j() {
        for (InterfaceC0129z interfaceC0129z : this.f3899a) {
            interfaceC0129z.j();
        }
    }

    @Override // L0.InterfaceC0129z
    public final long k(long j) {
        long k3 = this.f3906h[0].k(j);
        int i3 = 1;
        while (true) {
            InterfaceC0129z[] interfaceC0129zArr = this.f3906h;
            if (i3 >= interfaceC0129zArr.length) {
                return k3;
            }
            if (interfaceC0129zArr[i3].k(k3) != k3) {
                throw new IllegalStateException(StubApp.getString2(3291));
            }
            i3++;
        }
    }

    @Override // L0.InterfaceC0129z
    public final void l(long j) {
        for (InterfaceC0129z interfaceC0129z : this.f3906h) {
            interfaceC0129z.l(j);
        }
    }

    @Override // L0.b0
    public final boolean n() {
        return this.j.n();
    }

    @Override // L0.InterfaceC0129z
    public final long p() {
        long j = -9223372036854775807L;
        for (InterfaceC0129z interfaceC0129z : this.f3906h) {
            long p8 = interfaceC0129z.p();
            String string2 = StubApp.getString2(3291);
            if (p8 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (InterfaceC0129z interfaceC0129z2 : this.f3906h) {
                        if (interfaceC0129z2 == interfaceC0129z) {
                            break;
                        }
                        if (interfaceC0129z2.k(p8) != p8) {
                            throw new IllegalStateException(string2);
                        }
                    }
                    j = p8;
                } else if (p8 != j) {
                    throw new IllegalStateException(StubApp.getString2(3292));
                }
            } else if (j != -9223372036854775807L && interfaceC0129z.k(j) != j) {
                throw new IllegalStateException(string2);
            }
        }
        return j;
    }

    @Override // L0.InterfaceC0129z
    public final h0 s() {
        h0 h0Var = this.f3905g;
        h0Var.getClass();
        return h0Var;
    }

    @Override // L0.b0
    public final long u() {
        return this.j.u();
    }

    @Override // L0.b0
    public final void v(long j) {
        this.j.v(j);
    }
}
