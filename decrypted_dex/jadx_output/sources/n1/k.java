package n1;

import M4.G;
import M4.I;
import M4.Z;
import T0.B;
import T0.F;
import i1.C1032a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class k implements T0.o, B {

    /* renamed from: A, reason: collision with root package name */
    public j[] f17716A;

    /* renamed from: B, reason: collision with root package name */
    public long[][] f17717B;

    /* renamed from: C, reason: collision with root package name */
    public int f17718C;

    /* renamed from: D, reason: collision with root package name */
    public long f17719D;

    /* renamed from: E, reason: collision with root package name */
    public int f17720E;

    /* renamed from: F, reason: collision with root package name */
    public C1032a f17721F;

    /* renamed from: a, reason: collision with root package name */
    public final q1.j f17722a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17723b;

    /* renamed from: c, reason: collision with root package name */
    public final C1553n f17724c;

    /* renamed from: d, reason: collision with root package name */
    public final C1553n f17725d;

    /* renamed from: e, reason: collision with root package name */
    public final C1553n f17726e;

    /* renamed from: f, reason: collision with root package name */
    public final C1553n f17727f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f17728g;

    /* renamed from: h, reason: collision with root package name */
    public final m f17729h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f17730i;
    public Z j;

    /* renamed from: k, reason: collision with root package name */
    public int f17731k;

    /* renamed from: l, reason: collision with root package name */
    public int f17732l;

    /* renamed from: m, reason: collision with root package name */
    public long f17733m;

    /* renamed from: n, reason: collision with root package name */
    public int f17734n;

    /* renamed from: o, reason: collision with root package name */
    public C1553n f17735o;

    /* renamed from: p, reason: collision with root package name */
    public int f17736p;

    /* renamed from: q, reason: collision with root package name */
    public int f17737q;

    /* renamed from: r, reason: collision with root package name */
    public int f17738r;

    /* renamed from: s, reason: collision with root package name */
    public int f17739s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17740t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17741u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17742v;

    /* renamed from: w, reason: collision with root package name */
    public long f17743w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f17744x;

    /* renamed from: y, reason: collision with root package name */
    public long f17745y;

    /* renamed from: z, reason: collision with root package name */
    public T0.q f17746z;

    public k(q1.j jVar, int i3) {
        this.f17722a = jVar;
        this.f17723b = i3;
        G g10 = I.f4549b;
        this.j = Z.f4578e;
        this.f17731k = (i3 & 4) != 0 ? 3 : 0;
        this.f17729h = new m();
        this.f17730i = new ArrayList();
        this.f17727f = new C1553n(16);
        this.f17728g = new ArrayDeque();
        this.f17724c = new C1553n(s0.n.f20647a);
        this.f17725d = new C1553n(5);
        this.f17726e = new C1553n();
        this.f17736p = -1;
        this.f17746z = T0.q.f7042N;
        this.f17716A = new j[0];
        this.f17740t = (i3 & 32) == 0;
    }

    @Override // T0.o
    public final void b(long j, long j3) {
        this.f17728g.clear();
        this.f17734n = 0;
        this.f17736p = -1;
        this.f17737q = 0;
        this.f17738r = 0;
        this.f17739s = 0;
        this.f17740t = (this.f17723b & 32) == 0;
        if (j == 0) {
            if (this.f17731k != 3) {
                this.f17731k = 0;
                this.f17734n = 0;
                return;
            } else {
                m mVar = this.f17729h;
                mVar.f17751a.clear();
                mVar.f17752b = 0;
                this.f17730i.clear();
                return;
            }
        }
        for (j jVar : this.f17716A) {
            r rVar = jVar.f17712b;
            int e10 = AbstractC1560u.e(rVar.f17792f, j3, false);
            while (true) {
                if (e10 < 0) {
                    e10 = -1;
                    break;
                } else if ((rVar.f17793g[e10] & 1) != 0) {
                    break;
                } else {
                    e10--;
                }
            }
            if (e10 == -1) {
                e10 = rVar.a(j3);
            }
            jVar.f17715e = e10;
            T0.I i3 = jVar.f17714d;
            if (i3 != null) {
                i3.f6942b = false;
                i3.f6943c = 0;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x001c, code lost:
    
        if (r11 == 1) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0474, code lost:
    
        r5 = r4;
        r6 = r43.f17733m - r43.f17734n;
        r8 = r44.getPosition() + r6;
        r3 = r43.f17735o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0483, code lost:
    
        if (r3 == null) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0485, code lost:
    
        r44.readFully(r3.f20176a, r43.f17734n, (int) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0492, code lost:
    
        if (r43.f17732l != 1718909296) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0494, code lost:
    
        r43.f17741u = true;
        r3.G(8);
        r6 = r3.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x04a6, code lost:
    
        if (r6 == 1751476579) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x04a8, code lost:
    
        if (r6 == 1903435808) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04aa, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x04af, code lost:
    
        if (r6 == 0) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x04b2, code lost:
    
        r3.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x04ba, code lost:
    
        if (r3.a() <= 0) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x04bc, code lost:
    
        r6 = r3.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x04c0, code lost:
    
        if (r6 == 1751476579) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x04c2, code lost:
    
        if (r6 == 1903435808) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x04c4, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x04c9, code lost:
    
        if (r6 == 0) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x04c6, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x04c8, code lost:
    
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x04cc, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x04cd, code lost:
    
        r43.f17720E = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x04ff, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0509, code lost:
    
        l(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x050e, code lost:
    
        if (r43.f17742v == false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0510, code lost:
    
        r43.f17744x = true;
        r45.f7043a = r43.f17743w;
        r43.f17742v = false;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x051b, code lost:
    
        if (r3 == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0520, code lost:
    
        if (r43.f17731k == 2) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0522, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0525, code lost:
    
        if (r3 == false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0527, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0524, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x04ac, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04ae, code lost:
    
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x04d4, code lost:
    
        if (r12.isEmpty() != false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x04d6, code lost:
    
        ((s0.b) r12.peek()).f20592d.add(new s0.c(r43.f17732l, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x04eb, code lost:
    
        if (r43.f17741u != false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x04f2, code lost:
    
        if (r43.f17732l != 1835295092) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x04f4, code lost:
    
        r43.f17720E = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x04f9, code lost:
    
        if (r6 >= 262144) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x04fb, code lost:
    
        r44.u((int) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0501, code lost:
    
        r45.f7043a = r44.getPosition() + r6;
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0020, code lost:
    
        if (r11 == r9) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0022, code lost:
    
        if (r11 != r4) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0024, code lost:
    
        r3 = r43.f17730i;
        r11 = r43.f17729h;
        r12 = r11.f17752b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x002a, code lost:
    
        if (r12 == 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x002c, code lost:
    
        if (r12 == 1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x002e, code lost:
    
        r15 = r11.f17751a;
        r5 = 2817;
        r25 = 8;
        r8 = 2820;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x003a, code lost:
    
        if (r12 == r9) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x003c, code lost:
    
        if (r12 != r4) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x003e, code lost:
    
        r16 = r44.getPosition();
        r11 = (int) ((r44.r() - r44.getPosition()) - r11.f17753c);
        r12 = new r0.C1553n(r11);
        r44.readFully(r12.f20176a, r6, r11);
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0061, code lost:
    
        if (r0 >= r15.size()) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0063, code lost:
    
        r9 = (n1.l) r15.get(r0);
        r18 = r15;
        r12.G((int) (r9.f17747a - r16));
        r12.H(r7);
        r11 = r12.j();
        r14 = java.nio.charset.StandardCharsets.UTF_8;
        r15 = r12.s(r11, r14);
        r30 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0086, code lost:
    
        switch(r15.hashCode()) {
            case -1711564334: goto L39;
            case -1332107749: goto L35;
            case -1251387154: goto L31;
            case -830665521: goto L27;
            case 1760745220: goto L23;
            default: goto L22;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0089, code lost:
    
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x00db, code lost:
    
        switch(r7) {
            case 0: goto L50;
            case 1: goto L49;
            case 2: goto L48;
            case 3: goto L47;
            case 4: goto L46;
            default: goto L389;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x00eb, code lost:
    
        r7 = 2817;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00f5, code lost:
    
        r9 = r9.f17748b - (r11 + 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x00fa, code lost:
    
        if (r7 == 2192) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00fc, code lost:
    
        if (r7 == 2816) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00fe, code lost:
    
        if (r7 == 2817) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0102, code lost:
    
        if (r7 == 2819) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0104, code lost:
    
        if (r7 != 2820) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x010c, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0181, code lost:
    
        r0 = r0 + 1;
        r15 = r18;
        r7 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0110, code lost:
    
        r7 = new java.util.ArrayList();
        r9 = n1.m.f17750e.u(r12.s(r9, r14));
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0124, code lost:
    
        if (r11 >= r9.size()) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0126, code lost:
    
        r14 = n1.m.f17749d.u((java.lang.CharSequence) r9.get(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0136, code lost:
    
        if (r14.size() != r4) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0138, code lost:
    
        r7.add(new i1.b(java.lang.Long.parseLong((java.lang.String) r14.get(r6)), 1 << (java.lang.Integer.parseInt((java.lang.String) r14.get(2)) - 1), java.lang.Long.parseLong((java.lang.String) r14.get(1))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0168, code lost:
    
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x016b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0171, code lost:
    
        throw o0.C1406C.a(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0177, code lost:
    
        throw o0.C1406C.a(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0178, code lost:
    
        r3.add(new i1.c(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x00ed, code lost:
    
        r7 = 2820;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x00ef, code lost:
    
        r7 = 2816;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x00f1, code lost:
    
        r7 = 2819;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x00f4, code lost:
    
        r7 = 2192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x00ea, code lost:
    
        throw o0.C1406C.a(com.stub.StubApp.getString2(21341), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0096, code lost:
    
        if (r15.equals(com.stub.StubApp.getString2(21336)) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0099, code lost:
    
        r7 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x00a7, code lost:
    
        if (r15.equals(com.stub.StubApp.getString2(21337)) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x00aa, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x00b7, code lost:
    
        if (r15.equals(com.stub.StubApp.getString2(21338)) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x00ba, code lost:
    
        r7 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x00c7, code lost:
    
        if (r15.equals(com.stub.StubApp.getString2(21339)) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x00ca, code lost:
    
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x00d7, code lost:
    
        if (r15.equals(com.stub.StubApp.getString2(21340)) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x00da, code lost:
    
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0189, code lost:
    
        r45.f7043a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x018d, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x027e, code lost:
    
        if (r45.f7043a != 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0280, code lost:
    
        r43.f17731k = 0;
        r43.f17734n = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0285, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:?, code lost:
    
        return r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0195, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0196, code lost:
    
        r18 = r15;
        r14 = r44.r();
        r3 = r11.f17753c - 20;
        r7 = new r0.C1553n(r3);
        r44.readFully(r7.f20176a, r6, r3);
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x01ad, code lost:
    
        if (r0 >= (r3 / 12)) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x01af, code lost:
    
        r7.H(2);
        r12 = r7.f20176a;
        r9 = r7.f20177b;
        r6 = r9 + 1;
        r7.f20177b = r6;
        r4 = r12[r9] & kotlin.UByte.MAX_VALUE;
        r7.f20177b = r9 + 2;
        r4 = (short) (r4 | ((r12[r6] & kotlin.UByte.MAX_VALUE) << 8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x01cf, code lost:
    
        if (r4 == 2192) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x01d1, code lost:
    
        if (r4 == 2816) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x01d3, code lost:
    
        if (r4 == r5) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x01d7, code lost:
    
        if (r4 == 2819) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x01d9, code lost:
    
        if (r4 == r8) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x01db, code lost:
    
        r7.H(r25);
        r4 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0201, code lost:
    
        r0 = r0 + 1;
        r18 = r4;
        r5 = 2817;
        r8 = 2820;
        r25 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x01e7, code lost:
    
        r4 = r18;
        r4.add(new n1.l((r14 - r11.f17753c) - r7.j(), r7.j()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x020e, code lost:
    
        r4 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0214, code lost:
    
        if (r4.isEmpty() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0216, code lost:
    
        r45.f7043a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x021d, code lost:
    
        r11.f17752b = 3;
        r45.f7043a = ((n1.l) r4.get(0)).f17747a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x022d, code lost:
    
        r4 = new r0.C1553n(8);
        r44.readFully(r4.f20176a, r6, 8);
        r11.f17753c = r4.j() + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x0248, code lost:
    
        if (r4.h() == 1397048916) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x024a, code lost:
    
        r45.f7043a = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x0250, code lost:
    
        r45.f7043a = r44.getPosition() - (r11.f17753c - 12);
        r11.f17752b = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0261, code lost:
    
        r3 = r44.r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0267, code lost:
    
        if (r3 == (-1)) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x026b, code lost:
    
        if (r3 >= 8) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x026e, code lost:
    
        r3 = r3 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0273, code lost:
    
        r45.f7043a = r3;
        r15 = 1;
        r11.f17752b = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0271, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x028e, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x028f, code lost:
    
        r30 = r7;
        r4 = r44.getPosition();
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0298, code lost:
    
        if (r43.f17736p != (-1)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x029a, code lost:
    
        r8 = -1;
        r9 = -1;
        r10 = true;
        r11 = true;
        r12 = 0;
        r13 = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        r16 = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
        r32 = kotlin.jvm.internal.LongCompanionObject.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x02b3, code lost:
    
        r6 = r43.f17716A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x02b6, code lost:
    
        if (r12 >= r6.length) goto L394;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x02b8, code lost:
    
        r6 = r6[r12];
        r7 = r6.f17715e;
        r6 = r6.f17712b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x02c0, code lost:
    
        if (r7 != r6.f17788b) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x02f9, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x02c5, code lost:
    
        r37 = r6.f17789c[r7];
        r3 = r43.f17717B;
        r6 = r0.AbstractC1560u.f20190a;
        r6 = r3[r12][r7];
        r37 = r37 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x02d7, code lost:
    
        if (r37 < 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x02db, code lost:
    
        if (r37 < 262144) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x02de, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x02e1, code lost:
    
        if (r3 != false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x02e3, code lost:
    
        if (r11 != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x02eb, code lost:
    
        r11 = r3;
        r16 = r6;
        r9 = r12;
        r32 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x02f3, code lost:
    
        if (r6 >= r13) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x02f5, code lost:
    
        r10 = r3;
        r13 = r6;
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x02e5, code lost:
    
        if (r3 != r11) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x02e9, code lost:
    
        if (r37 >= r32) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x02e0, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x02fe, code lost:
    
        if (r13 == kotlin.jvm.internal.LongCompanionObject.MAX_VALUE) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0300, code lost:
    
        if (r10 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x0308, code lost:
    
        if (r16 >= (r13 + 10485760)) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x030b, code lost:
    
        r43.f17736p = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x030e, code lost:
    
        if (r8 != (-1)) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0730, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x030a, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0314, code lost:
    
        r3 = r43.f17716A[r43.f17736p];
        r6 = r3.f17713c;
        r14 = r3.f17715e;
        r7 = r3.f17712b;
        r8 = r7.f17789c[r14] + r43.f17745y;
        r10 = r7.f17790d[r14];
        r4 = (r8 - r4) + r43.f17737q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0335, code lost:
    
        if (r4 < 0) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0339, code lost:
    
        if (r4 < 262144) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x033d, code lost:
    
        r2 = r3.f17711a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0342, code lost:
    
        if (r2.f17762h != 1) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0344, code lost:
    
        r4 = r4 + 8;
        r10 = r10 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0348, code lost:
    
        r44.u((int) r4);
        r4 = r2.f17761g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x035c, code lost:
    
        if (java.util.Objects.equals(r4.f18216n, com.stub.StubApp.getString2(469)) != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x035e, code lost:
    
        r43.f17740t = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0360, code lost:
    
        r2 = r2.f17764k;
        r5 = r3.f17714d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0364, code lost:
    
        if (r2 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0366, code lost:
    
        r4 = r43.f17725d;
        r8 = r4.f20176a;
        r8[0] = 0;
        r8[1] = 0;
        r8[2] = 0;
        r11 = r2 + 1;
        r2 = 4 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x037a, code lost:
    
        if (r43.f17738r >= r10) goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x037c, code lost:
    
        r9 = r43.f17739s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x037e, code lost:
    
        if (r9 != 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0380, code lost:
    
        r44.readFully(r8, r2, r11);
        r43.f17737q += r11;
        r4.G(0);
        r12 = r4.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0391, code lost:
    
        if (r12 < 1) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0393, code lost:
    
        r43.f17739s = r12 - 1;
        r12 = r43.f17724c;
        r12.G(0);
        r13 = r30;
        r6.a(r12, r13, 0);
        r6.a(r4, 1, 0);
        r43.f17738r += 5;
        r10 = r10 + r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x03ac, code lost:
    
        if (r43.f17740t != false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x03b4, code lost:
    
        if (s0.n.c(r8[r13]) == false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x03b6, code lost:
    
        r43.f17740t = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x03b9, code lost:
    
        r30 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x03c8, code lost:
    
        throw o0.C1406C.a(com.stub.StubApp.getString2(21320), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x03c9, code lost:
    
        r9 = r6.b(r44, r9, false);
        r43.f17737q += r9;
        r43.f17738r += r9;
        r43.f17739s -= r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0422, code lost:
    
        r8 = r7.f17792f[r14];
        r0 = r7.f17793g[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x042c, code lost:
    
        if (r43.f17740t != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x042e, code lost:
    
        r0 = r0 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0431, code lost:
    
        if (r5 == null) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0433, code lost:
    
        r5.b(r6, r8, r0, r10, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0445, code lost:
    
        if ((r14 + 1) != r7.f17788b) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0447, code lost:
    
        r5.a(r6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0455, code lost:
    
        r3.f17715e++;
        r43.f17736p = -1;
        r43.f17737q = 0;
        r43.f17738r = 0;
        r43.f17739s = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0467, code lost:
    
        if ((r14 & 32) != 0) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0469, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x046c, code lost:
    
        r43.f17740t = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x046e, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x046b, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x044c, code lost:
    
        r6.c(r8, r0, r10, 0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x03eb, code lost:
    
        if (com.stub.StubApp.getString2(3955).equals(r4.f18216n) == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x03ef, code lost:
    
        if (r43.f17738r != 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x03f1, code lost:
    
        T0.AbstractC0311b.i(r10, r15);
        r4 = 7;
        r6.a(r15, 7, 0);
        r43.f17738r += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0400, code lost:
    
        r10 = r10 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0407, code lost:
    
        r2 = r43.f17738r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0409, code lost:
    
        if (r2 >= r10) goto L401;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x040b, code lost:
    
        r2 = r6.b(r44, r10 - r2, false);
        r43.f17737q += r2;
        r43.f17738r += r2;
        r43.f17739s -= r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x03ff, code lost:
    
        r4 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0402, code lost:
    
        if (r5 == null) goto L402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0404, code lost:
    
        r5.c(r44);
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x046f, code lost:
    
        r45.f7043a = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0473, code lost:
    
        return 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0731 A[LOOP:1: B:3:0x000a->B:21:0x0731, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0730 A[SYNTHETIC] */
    @Override // T0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(T0.p r44, T0.s r45) {
        /*
            Method dump skipped, instructions count: 1894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.k.c(T0.p, T0.s):int");
    }

    @Override // T0.B
    public final boolean e() {
        return true;
    }

    @Override // T0.o
    public final void f(T0.q qVar) {
        if ((this.f17723b & 16) == 0) {
            qVar = new a5.c(qVar, this.f17722a);
        }
        this.f17746z = qVar;
    }

    @Override // T0.o
    public final List g() {
        return this.j;
    }

    @Override // T0.o
    public final boolean h(T0.p pVar) {
        Z z2;
        F k3 = n.k(pVar, false, (this.f17723b & 2) != 0);
        if (k3 != null) {
            z2 = I.q(k3);
        } else {
            G g10 = I.f4549b;
            z2 = Z.f4578e;
        }
        this.j = z2;
        return k3 == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0 A[EDGE_INSN: B:69:0x00e0->B:70:0x00e0 BREAK  A[LOOP:1: B:28:0x0077->B:58:0x00db], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    @Override // T0.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T0.A i(long r20) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.k.i(long):T0.A");
    }

    @Override // T0.B
    public final long k() {
        return this.f17719D;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x030a, code lost:
    
        r6 = n1.n.e(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0312, code lost:
    
        if (r5 != 1631670868) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0314, code lost:
    
        r6 = n1.n.j(r5, com.stub.StubApp.getString2("18285"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0322, code lost:
    
        if (r5 != 1936682605) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0324, code lost:
    
        r6 = n1.n.j(r5, com.stub.StubApp.getString2("21352"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0332, code lost:
    
        if (r5 != 1936679276) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0334, code lost:
    
        r6 = n1.n.j(r5, com.stub.StubApp.getString2("21353"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0343, code lost:
    
        if (r5 != 1936679282) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0345, code lost:
    
        r6 = n1.n.j(r5, com.stub.StubApp.getString2("21354"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0354, code lost:
    
        if (r5 != 1936679265) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0356, code lost:
    
        r6 = n1.n.j(r5, com.stub.StubApp.getString2("21355"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0365, code lost:
    
        if (r5 != 1936679791) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0367, code lost:
    
        r6 = n1.n.j(r5, com.stub.StubApp.getString2("21356"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0376, code lost:
    
        if (r5 != 1920233063) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0378, code lost:
    
        r6 = n1.n.h(r5, com.stub.StubApp.getString2("21357"), r9, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0388, code lost:
    
        if (r5 != 1885823344) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x038a, code lost:
    
        r3 = n1.n.h(r5, com.stub.StubApp.getString2("21358"), r9, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x039b, code lost:
    
        if (r5 != 1936683886) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x039d, code lost:
    
        r6 = n1.n.j(r5, com.stub.StubApp.getString2("21359"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03ac, code lost:
    
        if (r5 != 1953919848) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03ae, code lost:
    
        r6 = n1.n.j(r5, com.stub.StubApp.getString2("21360"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03bd, code lost:
    
        if (r5 != 757935405) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03bf, code lost:
    
        r3 = null;
        r5 = null;
        r6 = -1;
        r8 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x03c3, code lost:
    
        r13 = r9.f20177b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x03c5, code lost:
    
        if (r13 >= r12) goto L449;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03c7, code lost:
    
        r21 = r9.h();
        r7 = r9.h();
        r37 = r8;
        r9.H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03d8, code lost:
    
        if (r7 != 1835360622) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x03da, code lost:
    
        r3 = r9.q(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03fd, code lost:
    
        r8 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03e7, code lost:
    
        if (r7 != 1851878757) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03e9, code lost:
    
        r5 = r9.q(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x03f3, code lost:
    
        if (r7 != 1684108385) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x03f5, code lost:
    
        r6 = r13;
        r37 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03f8, code lost:
    
        r9.H(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0401, code lost:
    
        r37 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0406, code lost:
    
        if (r3 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0408, code lost:
    
        if (r5 == null) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x040b, code lost:
    
        if (r6 != (-1)) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0424, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0425, code lost:
    
        r9.G(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x040e, code lost:
    
        r9.G(r6);
        r9.H(r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0421, code lost:
    
        r6 = new h1.k(r3, r5, r9.q(r37 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04c6, code lost:
    
        r0.AbstractC1550k.j(r8, r13 + J1.s.i(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x04d9, code lost:
    
        r9.G(r12);
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x028f, code lost:
    
        r5 = h1.AbstractC1007j.a(n1.n.g(r9) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0299, code lost:
    
        if (r5 == null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x029b, code lost:
    
        r6 = new h1.o(r3, null, M4.I.q(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x02a6, code lost:
    
        r0.AbstractC1550k.w(r8, com.stub.StubApp.getString2("21348"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02b0, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0509, code lost:
    
        r9.G(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x050c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0431, code lost:
    
        r6 = 16777215 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0438, code lost:
    
        if (r6 != 6516084) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x043a, code lost:
    
        r6 = n1.n.d(r5, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x043e, code lost:
    
        r9.G(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0446, code lost:
    
        if (r6 == 7233901) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x044b, code lost:
    
        if (r6 != 7631467) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0452, code lost:
    
        if (r6 == 6516589) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0457, code lost:
    
        if (r6 != 7828084) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x045e, code lost:
    
        if (r6 != 6578553) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0460, code lost:
    
        r6 = n1.n.j(r5, com.stub.StubApp.getString2("18289"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x046e, code lost:
    
        if (r6 != 4280916) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0470, code lost:
    
        r6 = n1.n.j(r5, com.stub.StubApp.getString2("18286"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x047e, code lost:
    
        if (r6 != 7630703) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0480, code lost:
    
        r6 = n1.n.j(r5, com.stub.StubApp.getString2("21361"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x048e, code lost:
    
        if (r6 != 6384738) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0490, code lost:
    
        r6 = n1.n.j(r5, com.stub.StubApp.getString2("18293"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x049e, code lost:
    
        if (r6 != 7108978) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x04a0, code lost:
    
        r6 = n1.n.j(r5, com.stub.StubApp.getString2("21362"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x04ae, code lost:
    
        if (r6 != 6776174) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x04b0, code lost:
    
        r6 = n1.n.j(r5, r3, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x04b8, code lost:
    
        if (r6 != 6779504) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x04ba, code lost:
    
        r6 = n1.n.j(r5, com.stub.StubApp.getString2("21363"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x04de, code lost:
    
        r6 = n1.n.j(r5, com.stub.StubApp.getString2("18292"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x04ea, code lost:
    
        r6 = n1.n.j(r5, com.stub.StubApp.getString2("18287"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x050d, code lost:
    
        r35 = r3;
        r33 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0518, code lost:
    
        if (r4.isEmpty() == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x051a, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x051c, code lost:
    
        r3 = new o0.C1404A(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x023f, code lost:
    
        r9.G(r8);
        r8 = r8 + r13;
        r9.H(8);
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x024d, code lost:
    
        r12 = r9.f20177b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x024f, code lost:
    
        if (r12 >= r8) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0251, code lost:
    
        r13 = com.stub.StubApp.getString2(21346);
        r12 = r9.h() + r12;
        r5 = r9.h();
        r32 = r6;
        r6 = (r5 >> 24) & 255;
        r33 = r7;
        r34 = r8;
        r8 = com.stub.StubApp.getString2(21347);
        r35 = r3;
        r3 = com.stub.StubApp.getString2(18291);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x027e, code lost:
    
        if (r6 == 169) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0282, code lost:
    
        if (r6 != 253) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x028d, code lost:
    
        if (r5 != 1735291493) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02bd, code lost:
    
        if (r5 != 1684632427) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02bf, code lost:
    
        r6 = n1.n.f(r5, com.stub.StubApp.getString2("21349"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02b1, code lost:
    
        r9.G(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x04f6, code lost:
    
        if (r6 == null) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x04f8, code lost:
    
        r4.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x04fb, code lost:
    
        r7 = r33;
        r8 = r34;
        r3 = r35;
        r6 = true;
        r23 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02d0, code lost:
    
        if (r5 != 1953655662) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02d2, code lost:
    
        r6 = n1.n.f(r5, com.stub.StubApp.getString2("18283"), r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02e0, code lost:
    
        if (r5 != 1953329263) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02e2, code lost:
    
        r3 = n1.n.h(r5, com.stub.StubApp.getString2("21350"), r9, r32, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02ef, code lost:
    
        r9.G(r12);
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02f7, code lost:
    
        if (r5 != 1668311404) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x02f9, code lost:
    
        r3 = n1.n.h(r5, com.stub.StubApp.getString2("21351"), r9, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0308, code lost:
    
        if (r5 != 1668249202) goto L135;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x091c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(long r39) {
        /*
            Method dump skipped, instructions count: 2355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.k.l(long):void");
    }

    @Override // T0.o
    public final void release() {
    }
}
