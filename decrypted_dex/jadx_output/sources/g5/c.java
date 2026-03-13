package g5;

import Xa.h;
import android.util.Base64;
import android.util.JsonReader;
import com.stub.StubApp;
import f4.C0879c;
import f5.A0;
import f5.B0;
import f5.C0;
import f5.C0883A;
import f5.C0884B;
import f5.C0885C;
import f5.C0886D;
import f5.C0887a;
import f5.C0888a0;
import f5.C0889b;
import f5.C0891c;
import f5.C0892c0;
import f5.C0893d;
import f5.C0894d0;
import f5.C0895e;
import f5.C0897f;
import f5.C0898f0;
import f5.C0899g;
import f5.C0900g0;
import f5.C0901h;
import f5.C0902h0;
import f5.C0903i;
import f5.C0904i0;
import f5.C0905j;
import f5.C0906j0;
import f5.C0907k;
import f5.C0908k0;
import f5.C0909l;
import f5.C0911m;
import f5.C0913n;
import f5.C0915o;
import f5.C0917p;
import f5.C0918q;
import f5.C0919s;
import f5.C0920t;
import f5.C0921u;
import f5.C0922v;
import f5.C0923w;
import f5.C0924x;
import f5.C0925y;
import f5.C0926z;
import f5.D0;
import f5.E;
import f5.E0;
import f5.F;
import f5.F0;
import f5.G;
import f5.G0;
import f5.H;
import f5.H0;
import f5.I;
import f5.I0;
import f5.J;
import f5.J0;
import f5.K;
import f5.K0;
import f5.L;
import f5.L0;
import f5.M;
import f5.M0;
import f5.N;
import f5.N0;
import f5.O0;
import f5.P;
import f5.Q;
import f5.S;
import f5.T;
import f5.U;
import f5.V;
import f5.W;
import f5.X;
import f5.Y;
import f5.Z;
import f5.p0;
import f5.q0;
import f5.r;
import f5.r0;
import f5.s0;
import f5.t0;
import f5.u0;
import f5.v0;
import f5.w0;
import f5.x0;
import f5.y0;
import f5.z0;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.math.ec.Tnaf;
import r5.C1571d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0879c f14217a;

    static {
        C1571d c1571d = new C1571d();
        C0893d c0893d = C0893d.f13984a;
        c1571d.a(O0.class, c0893d);
        c1571d.a(C0884B.class, c0893d);
        C0905j c0905j = C0905j.f14038a;
        c1571d.a(N0.class, c0905j);
        c1571d.a(J.class, c0905j);
        C0899g c0899g = C0899g.f14012a;
        c1571d.a(v0.class, c0899g);
        c1571d.a(K.class, c0899g);
        C0901h c0901h = C0901h.f14022a;
        c1571d.a(u0.class, c0901h);
        c1571d.a(L.class, c0901h);
        C0926z c0926z = C0926z.f14150a;
        c1571d.a(M0.class, c0926z);
        c1571d.a(C0908k0.class, c0926z);
        C0925y c0925y = C0925y.f14145a;
        c1571d.a(L0.class, c0925y);
        c1571d.a(C0906j0.class, c0925y);
        C0903i c0903i = C0903i.f14024a;
        c1571d.a(w0.class, c0903i);
        c1571d.a(N.class, c0903i);
        C0920t c0920t = C0920t.f14122a;
        c1571d.a(K0.class, c0920t);
        c1571d.a(P.class, c0920t);
        C0907k c0907k = C0907k.f14054a;
        c1571d.a(E0.class, c0907k);
        c1571d.a(Q.class, c0907k);
        C0911m c0911m = C0911m.f14071a;
        c1571d.a(C0.class, c0911m);
        c1571d.a(S.class, c0911m);
        C0917p c0917p = C0917p.f14100a;
        c1571d.a(B0.class, c0917p);
        c1571d.a(W.class, c0917p);
        C0918q c0918q = C0918q.f14104a;
        c1571d.a(A0.class, c0918q);
        c1571d.a(Y.class, c0918q);
        C0913n c0913n = C0913n.f14083a;
        c1571d.a(y0.class, c0913n);
        c1571d.a(U.class, c0913n);
        C0889b c0889b = C0889b.f13959a;
        c1571d.a(q0.class, c0889b);
        c1571d.a(C0886D.class, c0889b);
        C0887a c0887a = C0887a.f13951a;
        c1571d.a(p0.class, c0887a);
        c1571d.a(E.class, c0887a);
        C0915o c0915o = C0915o.f14095a;
        c1571d.a(z0.class, c0915o);
        c1571d.a(V.class, c0915o);
        C0909l c0909l = C0909l.f14063a;
        c1571d.a(x0.class, c0909l);
        c1571d.a(T.class, c0909l);
        C0891c c0891c = C0891c.f13975a;
        c1571d.a(r0.class, c0891c);
        c1571d.a(F.class, c0891c);
        r rVar = r.f14110a;
        c1571d.a(D0.class, rVar);
        c1571d.a(C0888a0.class, rVar);
        C0919s c0919s = C0919s.f14115a;
        c1571d.a(F0.class, c0919s);
        c1571d.a(C0892c0.class, c0919s);
        C0921u c0921u = C0921u.f14129a;
        c1571d.a(G0.class, c0921u);
        c1571d.a(C0894d0.class, c0921u);
        C0924x c0924x = C0924x.f14143a;
        c1571d.a(J0.class, c0924x);
        c1571d.a(C0902h0.class, c0924x);
        C0922v c0922v = C0922v.f14135a;
        c1571d.a(I0.class, c0922v);
        c1571d.a(C0898f0.class, c0922v);
        C0923w c0923w = C0923w.f14140a;
        c1571d.a(H0.class, c0923w);
        c1571d.a(C0900g0.class, c0923w);
        C0895e c0895e = C0895e.f13997a;
        c1571d.a(t0.class, c0895e);
        c1571d.a(G.class, c0895e);
        C0897f c0897f = C0897f.f14005a;
        c1571d.a(s0.class, c0897f);
        c1571d.a(H.class, c0897f);
        c1571d.f20352d = true;
        f14217a = new C0879c(c1571d);
    }

    public static Y a(JsonReader jsonReader) {
        X x7 = new X();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals(StubApp.getString2(14005))) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals(StubApp.getString2(5295))) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals(StubApp.getString2(17693))) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals(StubApp.getString2(3105))) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals(StubApp.getString2(2644))) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    x7.f13938d = jsonReader.nextLong();
                    x7.f13940f = (byte) (x7.f13940f | 2);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException(StubApp.getString2(9572));
                    }
                    x7.f13936b = nextString;
                    break;
                case 2:
                    x7.f13935a = jsonReader.nextLong();
                    x7.f13940f = (byte) (x7.f13940f | 1);
                    break;
                case 3:
                    x7.f13937c = jsonReader.nextString();
                    break;
                case 4:
                    x7.f13939e = jsonReader.nextInt();
                    x7.f13940f = (byte) (x7.f13940f | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return x7.a();
    }

    public static F b(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (nextName.equals(StubApp.getString2(728))) {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException(StubApp.getString2(17791));
                }
            } else if (nextName.equals(StubApp.getString2(1061))) {
                str2 = jsonReader.nextString();
                if (str2 == null) {
                    throw new NullPointerException(StubApp.getString2(17790));
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null) {
            return new F(str, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            sb2.append(StubApp.getString2(17792));
        }
        if (str2 == null) {
            sb2.append(StubApp.getString2(12720));
        }
        throw new IllegalStateException(h.r(sb2, StubApp.getString2(555)));
    }

    public static C0886D c(JsonReader jsonReader) {
        C0885C c0885c = new C0885C();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals(StubApp.getString2(17616))) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 110987:
                    if (nextName.equals(StubApp.getString2(2643))) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals(StubApp.getString2(17613))) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals(StubApp.getString2(17614))) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals(StubApp.getString2(1350))) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals(StubApp.getString2(2642))) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals(StubApp.getString2(17612))) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals(StubApp.getString2(17615))) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals(StubApp.getString2(2644))) {
                        c10 = '\b';
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    c0885c.f13828i = d(jsonReader, new com.mapbox.common.module.cronet.a(29));
                    break;
                case 1:
                    c0885c.f13820a = jsonReader.nextInt();
                    c0885c.j = (byte) (c0885c.j | 1);
                    break;
                case 2:
                    c0885c.f13824e = jsonReader.nextLong();
                    c0885c.j = (byte) (c0885c.j | 8);
                    break;
                case 3:
                    c0885c.f13825f = jsonReader.nextLong();
                    c0885c.j = (byte) (c0885c.j | Tnaf.POW_2_WIDTH);
                    break;
                case 4:
                    c0885c.f13826g = jsonReader.nextLong();
                    c0885c.j = (byte) (c0885c.j | 32);
                    break;
                case 5:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException(StubApp.getString2(7621));
                    }
                    c0885c.f13821b = nextString;
                    break;
                case 6:
                    c0885c.f13822c = jsonReader.nextInt();
                    c0885c.j = (byte) (c0885c.j | 2);
                    break;
                case 7:
                    c0885c.f13827h = jsonReader.nextString();
                    break;
                case '\b':
                    c0885c.f13823d = jsonReader.nextInt();
                    c0885c.j = (byte) (c0885c.j | 4);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0885c.a();
    }

    public static List d(JsonReader jsonReader, b bVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(bVar.b(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0333, code lost:
    
        if (r3 != null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0335, code lost:
    
        r0.append(com.stub.StubApp.getString2(12747));
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x033f, code lost:
    
        if (r4 != null) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0341, code lost:
    
        r0.append(com.stub.StubApp.getString2(2054));
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x034c, code lost:
    
        if ((r2 & 1) != 0) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x034e, code lost:
    
        r0.append(com.stub.StubApp.getString2(9573));
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0361, code lost:
    
        throw new java.lang.IllegalStateException(Xa.h.r(r0, r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0383, code lost:
    
        r0 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0388, code lost:
    
        if (r24 != null) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x038a, code lost:
    
        r0.append(com.stub.StubApp.getString2(17795));
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0394, code lost:
    
        if (r25 != null) goto L199;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0396, code lost:
    
        r0.append(com.stub.StubApp.getString2(17796));
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x03a9, code lost:
    
        throw new java.lang.IllegalStateException(Xa.h.r(r0, r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static f5.P e(android.util.JsonReader r26) {
        /*
            Method dump skipped, instructions count: 1558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g5.c.e(android.util.JsonReader):f5.P");
    }

    public static U f(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i3 = 0;
        String str = null;
        String str2 = null;
        List list = null;
        U u2 = null;
        byte b2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals(StubApp.getString2(17685))) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals(StubApp.getString2(532))) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals(StubApp.getString2(660))) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals(StubApp.getString2(17686))) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals(StubApp.getString2(17687))) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    List d8 = d(jsonReader, new C0955a(4));
                    if (d8 == null) {
                        throw new NullPointerException(StubApp.getString2(9571));
                    }
                    list = d8;
                    break;
                case 1:
                    str2 = jsonReader.nextString();
                    break;
                case 2:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException(StubApp.getString2(2257));
                    }
                    str = nextString;
                    break;
                case 3:
                    u2 = f(jsonReader);
                    break;
                case 4:
                    i3 = jsonReader.nextInt();
                    b2 = (byte) (b2 | 1);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (b2 == 1 && str != null && list != null) {
            return new U(str, str2, list, u2, i3);
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            sb2.append(StubApp.getString2(2256));
        }
        if (list == null) {
            sb2.append(StubApp.getString2(17765));
        }
        if ((b2 & 1) == 0) {
            sb2.append(StubApp.getString2(9570));
        }
        throw new IllegalStateException(h.r(sb2, StubApp.getString2(555)));
    }

    public static C0888a0 g(JsonReader jsonReader) {
        Z z2 = new Z();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c10 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals(StubApp.getString2(2643))) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals(StubApp.getString2(2642))) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1694598382:
                    if (nextName.equals(StubApp.getString2(2645))) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals(StubApp.getString2(2644))) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    z2.f13947b = jsonReader.nextInt();
                    z2.f13950e = (byte) (z2.f13950e | 1);
                    break;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException(StubApp.getString2(7621));
                    }
                    z2.f13946a = nextString;
                    break;
                case 2:
                    z2.f13949d = jsonReader.nextBoolean();
                    z2.f13950e = (byte) (z2.f13950e | 4);
                    break;
                case 3:
                    z2.f13948c = jsonReader.nextInt();
                    z2.f13950e = (byte) (z2.f13950e | 2);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return z2.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static C0884B h(JsonReader jsonReader) {
        char c10;
        char c11;
        char c12;
        char c13;
        char c14;
        char c15;
        String string2 = StubApp.getString2(2155);
        String string22 = StubApp.getString2(17629);
        String string23 = StubApp.getString2(17625);
        String string24 = StubApp.getString2(17626);
        String string25 = StubApp.getString2(17628);
        String string26 = StubApp.getString2(17627);
        String string27 = StubApp.getString2(4474);
        Charset charset = O0.f13901a;
        C0883A c0883a = new C0883A();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            String string28 = StubApp.getString2(9524);
            switch (nextName.hashCode()) {
                case -2118372775:
                    c10 = '\b';
                    if (nextName.equals(StubApp.getString2(17630))) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1962630338:
                    c10 = '\b';
                    if (nextName.equals(StubApp.getString2(214))) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1907185581:
                    c10 = '\b';
                    if (nextName.equals(string26)) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1375141843:
                    c10 = '\b';
                    if (nextName.equals(StubApp.getString2(17631))) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -911706486:
                    c10 = '\b';
                    if (nextName.equals(string25)) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -401988390:
                    c10 = '\b';
                    if (nextName.equals(StubApp.getString2(2655))) {
                        c11 = 5;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 344431858:
                    c10 = '\b';
                    if (nextName.equals(StubApp.getString2(17624))) {
                        c11 = 6;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 719853845:
                    c10 = '\b';
                    if (nextName.equals(string24)) {
                        c11 = 7;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1047652060:
                    c10 = '\b';
                    if (nextName.equals(StubApp.getString2(2654))) {
                        c11 = '\b';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1874684019:
                    c10 = '\b';
                    if (nextName.equals(string23)) {
                        c11 = '\t';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1975623094:
                    c10 = '\b';
                    if (nextName.equals(string22)) {
                        c11 = '\n';
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1984987798:
                    c10 = '\b';
                    if (nextName.equals(StubApp.getString2(9434))) {
                        c11 = 11;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    c10 = '\b';
                    break;
            }
            switch (c11) {
                case 0:
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (nextName2.equals(StubApp.getString2(3038))) {
                            list = d(jsonReader, new C0955a(0));
                            if (list == null) {
                                throw new NullPointerException(StubApp.getString2(17802));
                            }
                        } else if (nextName2.equals(StubApp.getString2(17636))) {
                            str = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (list == null) {
                        throw new IllegalStateException(StubApp.getString2(17803));
                    }
                    c0883a.f13806k = new G(list, str);
                    continue;
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString == null) {
                        throw new NullPointerException(StubApp.getString2(17801));
                    }
                    c0883a.f13797a = nextString;
                    break;
                case 2:
                    c0883a.f13803g = jsonReader.nextString();
                    break;
                case 3:
                    c0883a.f13807l = c(jsonReader);
                    break;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 == null) {
                        throw new NullPointerException(string28);
                    }
                    c0883a.f13804h = nextString2;
                    break;
                case 5:
                    c0883a.f13802f = jsonReader.nextString();
                    break;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 == null) {
                        throw new NullPointerException(StubApp.getString2(9529));
                    }
                    c0883a.f13798b = nextString3;
                    break;
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 == null) {
                        throw new NullPointerException(StubApp.getString2(9528));
                    }
                    c0883a.f13800d = nextString4;
                    break;
                case '\b':
                    c0883a.f13801e = jsonReader.nextString();
                    break;
                case '\t':
                    c0883a.f13799c = jsonReader.nextInt();
                    c0883a.f13808m = (byte) (c0883a.f13808m | 1);
                    break;
                case '\n':
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 == null) {
                        throw new NullPointerException(StubApp.getString2(9527));
                    }
                    c0883a.f13805i = nextString5;
                    break;
                case 11:
                    I i3 = new I();
                    i3.f13852f = false;
                    i3.f13858m = (byte) (i3.f13858m | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        String string29 = StubApp.getString2(2012);
                        String string210 = StubApp.getString2(9525);
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                if (nextName3.equals(StubApp.getString2(17654))) {
                                    c12 = 0;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1907185581:
                                if (nextName3.equals(string26)) {
                                    c12 = 1;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1618432855:
                                if (nextName3.equals(string27)) {
                                    c12 = 2;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1606742899:
                                if (nextName3.equals(StubApp.getString2(17655))) {
                                    c12 = 3;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1335157162:
                                if (nextName3.equals(StubApp.getString2(217))) {
                                    c12 = 4;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case -1291329255:
                                if (nextName3.equals(StubApp.getString2(973))) {
                                    c12 = 5;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3556:
                                if (nextName3.equals(StubApp.getString2(17657))) {
                                    c12 = 6;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 96801:
                                if (nextName3.equals(StubApp.getString2(4849))) {
                                    c12 = 7;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 3599307:
                                if (nextName3.equals(StubApp.getString2(11522))) {
                                    c12 = c10;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 286956243:
                                if (nextName3.equals(StubApp.getString2(17653))) {
                                    c12 = '\t';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 1025385094:
                                if (nextName3.equals(StubApp.getString2(17656))) {
                                    c12 = '\n';
                                    break;
                                }
                                c12 = 65535;
                                break;
                            case 2047016109:
                                if (nextName3.equals(StubApp.getString2(17658))) {
                                    c12 = 11;
                                    break;
                                }
                                c12 = 65535;
                                break;
                            default:
                                c12 = 65535;
                                break;
                        }
                        switch (c12) {
                            case 0:
                                i3.f13850d = jsonReader.nextLong();
                                i3.f13858m = (byte) (i3.f13858m | 1);
                                break;
                            case 1:
                                i3.f13849c = jsonReader.nextString();
                                break;
                            case 2:
                                i3.f13848b = new String(Base64.decode(jsonReader.nextString(), 2), O0.f13901a);
                                break;
                            case 3:
                                i3.f13851e = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                M m4 = new M();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals(StubApp.getString2(5889))) {
                                                c13 = 0;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals(StubApp.getString2(220))) {
                                                c13 = 1;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 112670:
                                            if (nextName4.equals(StubApp.getString2(17648))) {
                                                c13 = 2;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 3002454:
                                            if (nextName4.equals(StubApp.getString2(13781))) {
                                                c13 = 3;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 81784169:
                                            if (nextName4.equals(StubApp.getString2(17649))) {
                                                c13 = 4;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 94848180:
                                            if (nextName4.equals(StubApp.getString2(17647))) {
                                                c13 = 5;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 104069929:
                                            if (nextName4.equals(StubApp.getString2(215))) {
                                                c13 = 6;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 109757585:
                                            if (nextName4.equals(StubApp.getString2(291))) {
                                                c13 = 7;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals(StubApp.getString2(17650))) {
                                                c13 = c10;
                                                break;
                                            }
                                            c13 = 65535;
                                            break;
                                        default:
                                            c13 = 65535;
                                            break;
                                    }
                                    switch (c13) {
                                        case 0:
                                            m4.f13881f = jsonReader.nextBoolean();
                                            m4.j = (byte) (m4.j | Tnaf.POW_2_WIDTH);
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 == null) {
                                                throw new NullPointerException(StubApp.getString2(9522));
                                            }
                                            m4.f13883h = nextString6;
                                            break;
                                        case 2:
                                            m4.f13879d = jsonReader.nextLong();
                                            m4.j = (byte) (m4.j | 4);
                                            break;
                                        case 3:
                                            m4.f13876a = jsonReader.nextInt();
                                            m4.j = (byte) (m4.j | 1);
                                            break;
                                        case 4:
                                            m4.f13880e = jsonReader.nextLong();
                                            m4.j = (byte) (m4.j | 8);
                                            break;
                                        case 5:
                                            m4.f13878c = jsonReader.nextInt();
                                            m4.j = (byte) (m4.j | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 == null) {
                                                throw new NullPointerException(StubApp.getString2(9523));
                                            }
                                            m4.f13877b = nextString7;
                                            break;
                                        case 7:
                                            m4.f13882g = jsonReader.nextInt();
                                            m4.j = (byte) (m4.j | 32);
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 == null) {
                                                throw new NullPointerException(StubApp.getString2(9521));
                                            }
                                            m4.f13884i = nextString8;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                i3.j = m4.a();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(e(jsonReader));
                                }
                                jsonReader.endArray();
                                i3.f13856k = Collections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                C0904i0 c0904i0 = new C0904i0();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals(string25)) {
                                                c14 = 0;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case -293026577:
                                            if (nextName5.equals(StubApp.getString2(17727))) {
                                                c14 = 1;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName5.equals(string2)) {
                                                c14 = 2;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals(string23)) {
                                                c14 = 3;
                                                break;
                                            }
                                            c14 = 65535;
                                            break;
                                        default:
                                            c14 = 65535;
                                            break;
                                    }
                                    switch (c14) {
                                        case 0:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 == null) {
                                                throw new NullPointerException(string28);
                                            }
                                            c0904i0.f14035c = nextString9;
                                            break;
                                        case 1:
                                            c0904i0.f14036d = jsonReader.nextBoolean();
                                            c0904i0.f14037e = (byte) (c0904i0.f14037e | 2);
                                            break;
                                        case 2:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 == null) {
                                                throw new NullPointerException(string29);
                                            }
                                            c0904i0.f14034b = nextString10;
                                            break;
                                        case 3:
                                            c0904i0.f14033a = jsonReader.nextInt();
                                            c0904i0.f14037e = (byte) (c0904i0.f14037e | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                i3.f13855i = c0904i0.a();
                                break;
                            case 7:
                                jsonReader.beginObject();
                                String str2 = null;
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                String str7 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals(string27)) {
                                                c15 = 0;
                                                break;
                                            }
                                            c15 = 65535;
                                            break;
                                        case -519438642:
                                            if (nextName6.equals(StubApp.getString2(17641))) {
                                                c15 = 1;
                                                break;
                                            }
                                            c15 = 65535;
                                            break;
                                        case 213652010:
                                            if (nextName6.equals(StubApp.getString2(17642))) {
                                                c15 = 2;
                                                break;
                                            }
                                            c15 = 65535;
                                            break;
                                        case 351608024:
                                            if (nextName6.equals(string2)) {
                                                c15 = 3;
                                                break;
                                            }
                                            c15 = 65535;
                                            break;
                                        case 719853845:
                                            if (nextName6.equals(string24)) {
                                                c15 = 4;
                                                break;
                                            }
                                            c15 = 65535;
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals(string22)) {
                                                c15 = 5;
                                                break;
                                            }
                                            c15 = 65535;
                                            break;
                                        default:
                                            c15 = 65535;
                                            break;
                                    }
                                    switch (c15) {
                                        case 0:
                                            str2 = jsonReader.nextString();
                                            if (str2 == null) {
                                                throw new NullPointerException(string210);
                                            }
                                            break;
                                        case 1:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str7 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            str3 = jsonReader.nextString();
                                            if (str3 == null) {
                                                throw new NullPointerException(string29);
                                            }
                                            break;
                                        case 4:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str4 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str2 != null && str3 != null) {
                                    i3.f13853g = new K(str2, str3, str4, str5, str6, str7);
                                    break;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    if (str2 == null) {
                                        sb2.append(StubApp.getString2(17547));
                                    }
                                    if (str3 == null) {
                                        sb2.append(StubApp.getString2(17645));
                                    }
                                    throw new IllegalStateException(h.r(sb2, StubApp.getString2(555)));
                                }
                            case '\b':
                                jsonReader.beginObject();
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals(string27)) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            throw new NullPointerException(string210);
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 == null) {
                                    throw new IllegalStateException(StubApp.getString2(17800));
                                }
                                i3.f13854h = new C0908k0(str8);
                                break;
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 == null) {
                                    throw new NullPointerException(StubApp.getString2(9526));
                                }
                                i3.f13847a = nextString11;
                                break;
                            case '\n':
                                i3.f13852f = jsonReader.nextBoolean();
                                i3.f13858m = (byte) (i3.f13858m | 2);
                                break;
                            case 11:
                                i3.f13857l = jsonReader.nextInt();
                                i3.f13858m = (byte) (i3.f13858m | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    c0883a.j = i3.a();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return c0883a.a();
    }

    public static C0884B i(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                C0884B h2 = h(jsonReader);
                jsonReader.close();
                return h2;
            } finally {
            }
        } catch (IllegalStateException e10) {
            throw new IOException(e10);
        }
    }
}
