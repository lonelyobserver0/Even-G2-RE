package n1;

import M4.G;
import M4.I;
import M4.Z;
import O0.u;
import T0.F;
import T0.H;
import android.util.SparseArray;
import com.stub.StubApp;
import f4.C0879c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import o0.AbstractC1405B;
import o0.C1406C;
import o0.C1434i;
import o0.C1435j;
import o0.C1437l;
import o0.C1438m;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1553n;
import r0.C1558s;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class h implements T0.o {

    /* renamed from: M, reason: collision with root package name */
    public static final byte[] f17669M = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: N, reason: collision with root package name */
    public static final C1438m f17670N;

    /* renamed from: A, reason: collision with root package name */
    public long f17671A;

    /* renamed from: B, reason: collision with root package name */
    public long f17672B;

    /* renamed from: C, reason: collision with root package name */
    public g f17673C;

    /* renamed from: D, reason: collision with root package name */
    public int f17674D;

    /* renamed from: E, reason: collision with root package name */
    public int f17675E;

    /* renamed from: F, reason: collision with root package name */
    public int f17676F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f17677G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f17678H;

    /* renamed from: I, reason: collision with root package name */
    public T0.q f17679I;

    /* renamed from: J, reason: collision with root package name */
    public H[] f17680J;

    /* renamed from: K, reason: collision with root package name */
    public H[] f17681K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f17682L;

    /* renamed from: a, reason: collision with root package name */
    public final q1.j f17683a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17684b;

    /* renamed from: c, reason: collision with root package name */
    public final o f17685c;

    /* renamed from: d, reason: collision with root package name */
    public final List f17686d;

    /* renamed from: i, reason: collision with root package name */
    public final byte[] f17691i;
    public final C1553n j;

    /* renamed from: k, reason: collision with root package name */
    public final C1558s f17692k;

    /* renamed from: p, reason: collision with root package name */
    public final u f17697p;

    /* renamed from: q, reason: collision with root package name */
    public final y0.l f17698q;

    /* renamed from: r, reason: collision with root package name */
    public Z f17699r;

    /* renamed from: s, reason: collision with root package name */
    public int f17700s;

    /* renamed from: t, reason: collision with root package name */
    public int f17701t;

    /* renamed from: u, reason: collision with root package name */
    public long f17702u;

    /* renamed from: v, reason: collision with root package name */
    public int f17703v;

    /* renamed from: w, reason: collision with root package name */
    public C1553n f17704w;

    /* renamed from: x, reason: collision with root package name */
    public long f17705x;

    /* renamed from: y, reason: collision with root package name */
    public int f17706y;

    /* renamed from: z, reason: collision with root package name */
    public long f17707z;

    /* renamed from: l, reason: collision with root package name */
    public final Y.m f17693l = new Y.m(10);

    /* renamed from: m, reason: collision with root package name */
    public final C1553n f17694m = new C1553n(16);

    /* renamed from: f, reason: collision with root package name */
    public final C1553n f17688f = new C1553n(s0.n.f20647a);

    /* renamed from: g, reason: collision with root package name */
    public final C1553n f17689g = new C1553n(5);

    /* renamed from: h, reason: collision with root package name */
    public final C1553n f17690h = new C1553n();

    /* renamed from: n, reason: collision with root package name */
    public final ArrayDeque f17695n = new ArrayDeque();

    /* renamed from: o, reason: collision with root package name */
    public final ArrayDeque f17696o = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray f17687e = new SparseArray();

    static {
        C1437l c1437l = new C1437l();
        c1437l.f18177m = AbstractC1405B.m(StubApp.getString2(494));
        f17670N = new C1438m(c1437l);
    }

    public h(q1.j jVar, int i3, C1558s c1558s, o oVar, List list, y0.l lVar) {
        this.f17683a = jVar;
        this.f17684b = i3;
        this.f17692k = c1558s;
        this.f17685c = oVar;
        this.f17686d = Collections.unmodifiableList(list);
        this.f17698q = lVar;
        byte[] bArr = new byte[16];
        this.f17691i = bArr;
        this.j = new C1553n(bArr);
        G g10 = I.f4549b;
        this.f17699r = Z.f4578e;
        this.f17671A = -9223372036854775807L;
        this.f17707z = -9223372036854775807L;
        this.f17672B = -9223372036854775807L;
        this.f17679I = T0.q.f7042N;
        this.f17680J = new H[0];
        this.f17681K = new H[0];
        this.f17697p = new u(new e(this));
    }

    public static C1435j a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i3 = 0; i3 < size; i3++) {
            s0.c cVar = (s0.c) arrayList.get(i3);
            if (cVar.f3376b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = cVar.f20594c.f20176a;
                C0879c i10 = n.i(bArr);
                UUID uuid = i10 == null ? null : (UUID) i10.f13742a;
                if (uuid == null) {
                    AbstractC1550k.w(StubApp.getString2(21313), StubApp.getString2(21314));
                } else {
                    arrayList2.add(new C1434i(uuid, null, StubApp.getString2(880), bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C1435j(null, false, (C1434i[]) arrayList2.toArray(new C1434i[0]));
    }

    public static void d(C1553n c1553n, int i3, q qVar) {
        c1553n.G(i3 + 8);
        int h2 = c1553n.h();
        byte[] bArr = c.f17649a;
        if ((h2 & 1) != 0) {
            throw C1406C.c(StubApp.getString2(21317));
        }
        boolean z2 = (h2 & 2) != 0;
        int y10 = c1553n.y();
        if (y10 == 0) {
            Arrays.fill(qVar.f17781l, 0, qVar.f17775e, false);
            return;
        }
        if (y10 != qVar.f17775e) {
            StringBuilder u2 = Xa.h.u(y10, StubApp.getString2(21315), StubApp.getString2(21316));
            u2.append(qVar.f17775e);
            throw C1406C.a(u2.toString(), null);
        }
        Arrays.fill(qVar.f17781l, 0, y10, z2);
        int a3 = c1553n.a();
        C1553n c1553n2 = qVar.f17783n;
        c1553n2.D(a3);
        qVar.f17780k = true;
        qVar.f17784o = true;
        c1553n.f(0, c1553n2.f20178c, c1553n2.f20176a);
        c1553n2.G(0);
        qVar.f17784o = false;
    }

    @Override // T0.o
    public final void b(long j, long j3) {
        SparseArray sparseArray = this.f17687e;
        int size = sparseArray.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((g) sparseArray.valueAt(i3)).e();
        }
        this.f17696o.clear();
        this.f17706y = 0;
        this.f17697p.c(0);
        this.f17707z = j3;
        this.f17695n.clear();
        this.f17700s = 0;
        this.f17703v = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:192:0x00d8, code lost:
    
        r2 = r36.f17700s;
        r5 = r36.f17684b;
        r7 = com.stub.StubApp.getString2(469);
        r8 = r3.f17659b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x00e7, code lost:
    
        if (r2 != 3) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x00eb, code lost:
    
        if (r3.f17668l != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x00ed, code lost:
    
        r2 = r3.f17661d.f17790d[r3.f17663f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x00fc, code lost:
    
        r36.f17674D = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0100, code lost:
    
        if ((r5 & 64) == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x010e, code lost:
    
        if (java.util.Objects.equals(r3.f17661d.f17787a.f17761g.f18216n, r7) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0111, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0115, code lost:
    
        r36.f17677G = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x011b, code lost:
    
        if (r3.f17663f >= r3.f17666i) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x011d, code lost:
    
        ((T0.l) r37).u(r36.f17674D);
        r1 = r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0128, code lost:
    
        if (r1 != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x012b, code lost:
    
        r2 = r8.f17783n;
        r1 = r1.f17769d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x012f, code lost:
    
        if (r1 == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0131, code lost:
    
        r2.H(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0134, code lost:
    
        r1 = r3.f17663f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0138, code lost:
    
        if (r8.f17780k == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x013e, code lost:
    
        if (r8.f17781l[r1] == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0140, code lost:
    
        r2.H(r2.A() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x014c, code lost:
    
        if (r3.c() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x014e, code lost:
    
        r36.f17673C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0151, code lost:
    
        r36.f17700s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0154, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x015d, code lost:
    
        if (r3.f17661d.f17787a.f17762h != r22) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x015f, code lost:
    
        r36.f17674D -= 8;
        ((T0.l) r37).u(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0180, code lost:
    
        if (com.stub.StubApp.getString2(3955).equals(r3.f17661d.f17787a.f17761g.f18216n) == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0182, code lost:
    
        r36.f17675E = r3.d(r36.f17674D, 7);
        r2 = r36.f17674D;
        r11 = r36.j;
        T0.AbstractC0311b.i(r2, r11);
        r3.f17658a.a(r11, 7, 0);
        r36.f17675E += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x01a5, code lost:
    
        r36.f17674D += r36.f17675E;
        r36.f17700s = 4;
        r36.f17676F = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x019d, code lost:
    
        r36.f17675E = r3.d(r36.f17674D, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0113, code lost:
    
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x00f6, code lost:
    
        r2 = r8.f17778h[r3.f17663f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x01b1, code lost:
    
        r2 = r3.f17661d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x01b5, code lost:
    
        if (r3.f17668l != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x01b7, code lost:
    
        r10 = r2.f17792f[r3.f17663f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x01c4, code lost:
    
        if (r15 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x01c6, code lost:
    
        r10 = r15.a(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x01ca, code lost:
    
        r2 = r2.f17787a;
        r8 = r2.f17764k;
        r12 = r3.f17658a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x01d0, code lost:
    
        if (r8 == 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x01d2, code lost:
    
        r13 = r36.f17689g;
        r4 = r13.f20176a;
        r4[0] = 0;
        r4[1] = 0;
        r4[r18] = 0;
        r6 = r8 + 1;
        r8 = 4 - r8;
        r17 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x01e6, code lost:
    
        r31 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01ec, code lost:
    
        if (r36.f17675E >= r36.f17674D) goto L420;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x01ee, code lost:
    
        r5 = r36.f17676F;
        r14 = com.stub.StubApp.getString2(1610);
        r32 = r15;
        r15 = r2.f17761g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x01fb, code lost:
    
        if (r5 != 0) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x02a5, code lost:
    
        r20 = r2;
        r23 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x02ac, code lost:
    
        if (r36.f17678H == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x02ae, code lost:
    
        r4 = r36.f17690h;
        r4.D(r5);
        r33 = r3;
        r18 = r6;
        ((T0.l) r37).e(r4.f20176a, 0, r36.f17676F, false);
        r12.a(r4, r36.f17676F, 0);
        r2 = r36.f17676F;
        r3 = s0.n.k(r4.f20178c, r4.f20176a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x02d7, code lost:
    
        if (java.util.Objects.equals(r15.f18216n, r14) != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x02df, code lost:
    
        if (o0.AbstractC1405B.b(r15.f18213k, r14) == null) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x02e2, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x02e5, code lost:
    
        r4.G(r5);
        r4.F(r3);
        r3 = r15.f18218p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x02ee, code lost:
    
        if (r3 != (-1)) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x02f2, code lost:
    
        if (r9.f5181a == 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x02f4, code lost:
    
        r9.f5181a = 0;
        r9.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x030c, code lost:
    
        r9.a(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0318, code lost:
    
        if ((r33.a() & 4) == 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x031a, code lost:
    
        r9.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0327, code lost:
    
        r36.f17675E += r2;
        r36.f17676F -= r2;
        r6 = r18;
        r2 = r20;
        r4 = r23;
        r14 = r31;
        r15 = r32;
        r3 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x02fd, code lost:
    
        if (r9.f5181a == r3) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x02ff, code lost:
    
        if (r3 < 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0301, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0304, code lost:
    
        r0.AbstractC1550k.g(r5);
        r9.f5181a = r3;
        r9.c(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0303, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x02e4, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x031e, code lost:
    
        r33 = r3;
        r18 = r6;
        r2 = r12.b(r37, r5, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x01fd, code lost:
    
        r20 = r2;
        ((T0.l) r37).e(r4, r8, r6, false);
        r13.G(0);
        r5 = r13.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x020e, code lost:
    
        if (r5 < 1) goto L419;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0210, code lost:
    
        r36.f17676F = r5 - 1;
        r5 = r36.f17688f;
        r5.G(0);
        r23 = r4;
        r12.a(r5, 4, 0);
        r12.a(r13, 1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0226, code lost:
    
        if (r36.f17681K.length <= 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0228, code lost:
    
        r2 = r23[4];
        r4 = java.util.Objects.equals(r15.f18216n, r7);
        r5 = r15.f18213k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0232, code lost:
    
        if (r4 != false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0238, code lost:
    
        if (o0.AbstractC1405B.b(r5, r7) == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x023b, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x024c, code lost:
    
        if (java.util.Objects.equals(r15.f18216n, r14) != false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0252, code lost:
    
        if (o0.AbstractC1405B.b(r5, r14) == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0261, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x0262, code lost:
    
        r36.f17678H = r4;
        r36.f17675E += 5;
        r36.f17674D += r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0271, code lost:
    
        if (r36.f17677G != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x027f, code lost:
    
        if (java.util.Objects.equals(r3.f17661d.f17787a.f17761g.f18216n, r7) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0289, code lost:
    
        if (s0.n.c(r23[4]) == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x028b, code lost:
    
        r36.f17677G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x028e, code lost:
    
        r2 = r20;
        r4 = r23;
        r14 = r31;
        r15 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x025c, code lost:
    
        if (((r18 & 126) >> 1) != 39) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x025e, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x023f, code lost:
    
        r18 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0244, code lost:
    
        if ((r2 & 31) == 6) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x02a4, code lost:
    
        throw o0.C1406C.a(com.stub.StubApp.getString2(21320), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x033f, code lost:
    
        r33 = r3;
        r32 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x035e, code lost:
    
        r1 = r33.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0364, code lost:
    
        if ((r17 & 64) == 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0368, code lost:
    
        if (r36.f17677G != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x036a, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x036d, code lost:
    
        r26 = r1;
        r1 = r33.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0373, code lost:
    
        if (r1 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0375, code lost:
    
        r29 = r1.f17768c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x037c, code lost:
    
        r24 = r10;
        r12.c(r24, r26, r36.f17674D, 0, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x038d, code lost:
    
        if (r31.isEmpty() != false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x038f, code lost:
    
        r1 = (n1.f) r31.removeFirst();
        r36.f17706y -= r1.f17657c;
        r2 = r1.f17656b;
        r3 = r1.f17655a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x03a0, code lost:
    
        if (r2 == false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x03a2, code lost:
    
        r3 = r3 + r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x03a4, code lost:
    
        r2 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x03a6, code lost:
    
        if (r32 == null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x03a8, code lost:
    
        r3 = r2.a(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x03ac, code lost:
    
        r6 = r3;
        r3 = r36.f17680J;
        r4 = r3.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x03b1, code lost:
    
        if (r12 >= r4) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x03b3, code lost:
    
        r3[r12].c(r6, 1, r1.f17657c, r36.f17706y, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x03c3, code lost:
    
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x03ca, code lost:
    
        if (r33.c() != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x03cc, code lost:
    
        r36.f17673C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x03cf, code lost:
    
        r36.f17700s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x03d4, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x037a, code lost:
    
        r29 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0344, code lost:
    
        r33 = r3;
        r17 = r5;
        r31 = r14;
        r32 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x034c, code lost:
    
        r2 = r36.f17675E;
        r3 = r36.f17674D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0350, code lost:
    
        if (r2 >= r3) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0352, code lost:
    
        r36.f17675E += r12.b(r37, r3 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x01be, code lost:
    
        r10 = r8.f17779i[r3.f17663f];
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // T0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(T0.p r37, T0.s r38) {
        /*
            Method dump skipped, instructions count: 2196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.h.c(T0.p, T0.s):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x03ef, code lost:
    
        if ((r0.AbstractC1560u.R(r41, 1000000, r4.f17758d, r47) + r0.AbstractC1560u.R(r40[0], 1000000, r4.f17757c, r47)) >= r4.f17759e) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x083d, code lost:
    
        r58.f17700s = 0;
        r58.f17703v = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0842, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(long r59) {
        /*
            Method dump skipped, instructions count: 2115
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.h.e(long):void");
    }

    @Override // T0.o
    public final void f(T0.q qVar) {
        int i3;
        int i10 = this.f17684b;
        if ((i10 & 32) == 0) {
            qVar = new a5.c(qVar, this.f17683a);
        }
        this.f17679I = qVar;
        this.f17700s = 0;
        this.f17703v = 0;
        H[] hArr = new H[2];
        this.f17680J = hArr;
        y0.l lVar = this.f17698q;
        if (lVar != null) {
            hArr[0] = lVar;
            i3 = 1;
        } else {
            i3 = 0;
        }
        int i11 = 100;
        if ((i10 & 4) != 0) {
            hArr[i3] = qVar.w(100, 5);
            i11 = 101;
            i3++;
        }
        H[] hArr2 = (H[]) AbstractC1560u.L(i3, this.f17680J);
        this.f17680J = hArr2;
        for (H h2 : hArr2) {
            h2.d(f17670N);
        }
        List list = this.f17686d;
        this.f17681K = new H[list.size()];
        int i12 = 0;
        while (i12 < this.f17681K.length) {
            H w10 = this.f17679I.w(i11, 3);
            w10.d((C1438m) list.get(i12));
            this.f17681K[i12] = w10;
            i12++;
            i11++;
        }
        o oVar = this.f17685c;
        if (oVar != null) {
            this.f17687e.put(0, new g(this.f17679I.w(0, oVar.f17756b), new r(this.f17685c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new d(0, 0, 0, 0)));
            this.f17679I.q();
        }
    }

    @Override // T0.o
    public final List g() {
        return this.f17699r;
    }

    @Override // T0.o
    public final boolean h(T0.p pVar) {
        Z z2;
        F k3 = n.k(pVar, true, false);
        if (k3 != null) {
            z2 = I.q(k3);
        } else {
            G g10 = I.f4549b;
            z2 = Z.f4578e;
        }
        this.f17699r = z2;
        return k3 == null;
    }

    @Override // T0.o
    public final void release() {
    }
}
