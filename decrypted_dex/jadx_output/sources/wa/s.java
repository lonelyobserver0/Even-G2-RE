package wa;

import aa.C0395b;
import android.util.Log;
import com.stub.StubApp;
import da.InterfaceC0813c;
import da.J;
import fa.C0935a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.UByte;
import oa.AbstractC1469b;
import oa.C1468a;
import oa.C1471d;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class s extends m {

    /* renamed from: k, reason: collision with root package name */
    public final j f22253k;

    /* renamed from: l, reason: collision with root package name */
    public final C0395b f22254l;

    /* renamed from: m, reason: collision with root package name */
    public final C0395b f22255m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f22256n;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f22257p;

    /* renamed from: q, reason: collision with root package name */
    public final HashSet f22258q;

    public s(C1471d c1471d) {
        super(c1471d);
        j lVar;
        this.f22258q = new HashSet();
        AbstractC1469b J10 = c1471d.J(oa.j.f18457I0);
        if (!(J10 instanceof C1468a)) {
            throw new IOException(StubApp.getString2(24016));
        }
        C1468a c1468a = (C1468a) J10;
        if (c1468a.f18393a.size() == 0) {
            throw new IOException(StubApp.getString2(24015));
        }
        boolean z2 = false;
        AbstractC1469b G4 = c1468a.G(0);
        if (!(G4 instanceof C1471d)) {
            throw new IOException(StubApp.getString2(24014));
        }
        oa.j jVar = oa.j.f18556k1;
        C1471d c1471d2 = (C1471d) G4;
        oa.j jVar2 = oa.j.f18621y3;
        AbstractC1469b J11 = c1471d2.J(jVar2);
        if (!jVar.equals(J11 instanceof oa.j ? (oa.j) J11 : jVar)) {
            throw new IOException(StubApp.getString2(24013));
        }
        AbstractC1469b J12 = c1471d2.J(jVar2);
        oa.j jVar3 = J12 instanceof oa.j ? (oa.j) J12 : jVar;
        if (!jVar.equals(jVar3)) {
            throw new IOException(AbstractC1482f.k(new StringBuilder(StubApp.getString2(24012)), jVar3.f18626a, StubApp.getString2(620)));
        }
        oa.j H2 = c1471d2.H(oa.j.f18576o3);
        if (oa.j.f18516Y.equals(H2)) {
            lVar = new k(c1471d2, this);
        } else {
            if (!oa.j.f18520Z.equals(H2)) {
                throw new IOException(StubApp.getString2(24011) + jVar3);
            }
            lVar = new l(c1471d2, this);
        }
        this.f22253k = lVar;
        oa.j jVar4 = oa.j.f18513X0;
        AbstractC1469b J13 = c1471d.J(jVar4);
        boolean z10 = J13 instanceof oa.j;
        String string2 = StubApp.getString2(948);
        if (z10) {
            this.f22254l = b.a(((oa.j) J13).f18626a);
            this.f22256n = true;
        } else if (J13 != null) {
            C0395b o5 = m.o(J13);
            this.f22254l = o5;
            if (o5.j.isEmpty() && o5.f9339k.isEmpty()) {
                Log.w(string2, StubApp.getString2(24006) + c1471d.Q(oa.j.f18622z));
            }
        }
        Ea.c i3 = lVar.i();
        if (i3 != null) {
            String a3 = i3.a();
            if (StubApp.getString2(24007).equals(i3.f2125b.Q(oa.j.f18489P2)) && (StubApp.getString2(23968).equals(a3) || StubApp.getString2(23969).equals(a3) || StubApp.getString2(23970).equals(a3) || StubApp.getString2(23971).equals(a3))) {
                z2 = true;
            }
            this.f22257p = z2;
        }
        oa.j H10 = c1471d.H(jVar4);
        if ((!this.f22256n || H10 == oa.j.f18435D1 || H10 == oa.j.f18440E1) && !this.f22257p) {
            return;
        }
        boolean z11 = this.f22257p;
        String str = null;
        String string22 = StubApp.getString2(999);
        if (z11) {
            Ea.c i10 = lVar.i();
            if (i10 != null) {
                StringBuilder sb2 = new StringBuilder();
                oa.j jVar5 = oa.j.f18489P2;
                C1471d c1471d3 = i10.f2125b;
                sb2.append(c1471d3.Q(jVar5));
                sb2.append(string22);
                sb2.append(i10.a());
                sb2.append(string22);
                sb2.append(c1471d3.N(oa.j.f18580p3, null, -1));
                str = sb2.toString();
            }
        } else if (H10 != null) {
            str = H10.f18626a;
        }
        if (str != null) {
            try {
                C0395b a9 = b.a(str);
                this.f22255m = b.a(a9.f9332c + string22 + a9.f9333d + StubApp.getString2("24008"));
            } catch (IOException e10) {
                StringBuilder l9 = com.mapbox.common.b.l(StubApp.getString2(24009), str, StubApp.getString2(24010));
                l9.append(this.f22230a.Q(oa.j.f18622z));
                Log.w(string2, l9.toString(), e10);
            }
        }
    }

    @Override // wa.m, wa.o
    public final Ia.b a() {
        return this.f22253k.a();
    }

    @Override // wa.o
    public final C0935a b() {
        return this.f22253k.b();
    }

    @Override // wa.o
    public final float c(int i3) {
        return this.f22253k.c(i3);
    }

    @Override // wa.o
    public final boolean d() {
        return this.f22253k.d();
    }

    @Override // wa.m
    public final float e() {
        return this.f22253k.g();
    }

    @Override // wa.m
    public final Ia.e f(int i3) {
        if (!n()) {
            return super.f(i3);
        }
        j jVar = this.f22253k;
        Float f10 = (Float) jVar.f22211e.get(Integer.valueOf(jVar.e(i3)));
        if (f10 == null) {
            f10 = Float.valueOf(jVar.f22213g[1]);
        }
        return new Ia.e(0.0f, f10.floatValue() / 1000.0f);
    }

    @Override // wa.m
    public final n g() {
        return this.f22253k.k();
    }

    @Override // wa.o
    public final String getName() {
        return this.f22230a.Q(oa.j.f18622z);
    }

    @Override // wa.m
    public final Ia.e h(int i3) {
        j jVar = this.f22253k;
        int e10 = jVar.e(i3);
        Ia.e eVar = (Ia.e) jVar.f22212f.get(Integer.valueOf(e10));
        if (eVar == null) {
            Float f10 = (Float) jVar.f22208b.get(Integer.valueOf(e10));
            if (f10 == null) {
                f10 = Float.valueOf(jVar.j());
            }
            eVar = new Ia.e(f10.floatValue() / 2.0f, jVar.f22213g[0]);
        }
        return new Ia.e(eVar.f3248a * (-0.001f), eVar.f3249b * (-0.001f));
    }

    @Override // wa.m
    public final float j(int i3) {
        throw new UnsupportedOperationException(StubApp.getString2(24017));
    }

    @Override // wa.m
    public final float k(int i3) {
        j jVar = this.f22253k;
        Float f10 = (Float) jVar.f22208b.get(Integer.valueOf(jVar.e(i3)));
        if (f10 == null) {
            f10 = Float.valueOf(jVar.j());
        }
        return f10.floatValue();
    }

    @Override // wa.m
    public final boolean m() {
        return false;
    }

    @Override // wa.m
    public final boolean n() {
        C0395b c0395b = this.f22254l;
        return c0395b != null && c0395b.f9330a == 1;
    }

    @Override // wa.m
    public final int q(ByteArrayInputStream byteArrayInputStream) {
        int i3;
        C0395b c0395b = this.f22254l;
        if (c0395b == null) {
            throw new IOException(StubApp.getString2(24023));
        }
        byte[] bArr = new byte[c0395b.f9335f];
        byteArrayInputStream.read(bArr, 0, c0395b.f9334e);
        byteArrayInputStream.mark(c0395b.f9335f);
        int i10 = c0395b.f9334e - 1;
        while (i10 < c0395b.f9335f) {
            i10++;
            Iterator it = c0395b.f9336g.iterator();
            while (it.hasNext()) {
                aa.f fVar = (aa.f) it.next();
                int i11 = fVar.f9347c;
                if (i11 == i10) {
                    for (0; i3 < i11; i3 + 1) {
                        int i12 = bArr[i3] & UByte.MAX_VALUE;
                        i3 = (i12 >= fVar.f9345a[i3] && i12 <= fVar.f9346b[i3]) ? i3 + 1 : 0;
                    }
                    return C0395b.c(i10, bArr);
                }
            }
            if (i10 < c0395b.f9335f) {
                bArr[i10] = (byte) byteArrayInputStream.read();
            }
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i13 = 0; i13 < c0395b.f9335f; i13++) {
            sb2.append(String.format(StubApp.getString2(24018), Byte.valueOf(bArr[i13]), Byte.valueOf(bArr[i13])));
        }
        String str = StubApp.getString2(24019) + ((Object) sb2) + StubApp.getString2(24020) + c0395b.f9331b;
        String string2 = StubApp.getString2(948);
        Log.w(string2, str);
        if (byteArrayInputStream.markSupported()) {
            byteArrayInputStream.reset();
        } else {
            StringBuilder sb3 = new StringBuilder(StubApp.getString2(24021));
            sb3.append(c0395b.f9335f - 1);
            sb3.append(StubApp.getString2(24022));
            Log.w(string2, sb3.toString());
        }
        return C0395b.c(c0395b.f9334e, bArr);
    }

    @Override // wa.m
    public final String r(int i3) {
        J j;
        String r8 = super.r(i3);
        if (r8 != null) {
            return r8;
        }
        boolean z2 = this.f22256n;
        j jVar = this.f22253k;
        if ((z2 || this.f22257p) && this.f22255m != null) {
            return (String) this.f22255m.f9337h.get(Integer.valueOf(jVar.e(i3)));
        }
        boolean z10 = jVar instanceof l;
        String string2 = StubApp.getString2(948);
        if (z10 && (j = ((l) jVar).f22222k) != null) {
            try {
                InterfaceC0813c G4 = j.G();
                if (G4 != null) {
                    ArrayList c10 = G4.c(((l) jVar).f22224m ? jVar.f(i3) : jVar.e(i3));
                    if (c10 != null && !c10.isEmpty()) {
                        return Character.toString((char) ((Integer) c10.get(0)).intValue());
                    }
                }
            } catch (IOException e10) {
                Log.w(string2, StubApp.getString2(24024), e10);
            }
        }
        HashSet hashSet = this.f22258q;
        if (hashSet.contains(Integer.valueOf(i3))) {
            return null;
        }
        Log.w(string2, StubApp.getString2(23999) + (StubApp.getString2(24025) + jVar.e(i3)) + StubApp.getString2(1561) + i3 + StubApp.getString2(24000) + this.f22230a.Q(oa.j.f18622z));
        hashSet.add(Integer.valueOf(i3));
        return null;
    }

    @Override // wa.m
    public final String toString() {
        j jVar = this.f22253k;
        return s.class.getSimpleName() + StubApp.getString2(601) + (jVar != null ? jVar.getClass().getSimpleName() : null) + StubApp.getString2(24026) + this.f22230a.Q(oa.j.f18622z);
    }
}
