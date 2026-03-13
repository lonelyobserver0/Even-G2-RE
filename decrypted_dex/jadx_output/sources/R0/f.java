package R0;

import E0.z;
import L0.B;
import M4.Z;
import R8.C0250h;
import Z9.C;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import com.stub.StubApp;
import io.flutter.plugin.platform.PlatformPlugin;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import o0.AbstractC1405B;
import o0.AbstractC1416M;
import o0.C1414K;
import o0.C1425W;
import o0.C1431f;
import o0.C1437l;
import o0.C1438m;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1554o;
import r0.C1555p;
import r0.C1557r;
import v0.AbstractC1810e;
import v0.C1798A;
import v0.C1803F;
import v0.C1811f;
import v0.C1812g;
import v0.C1828x;
import v0.SurfaceHolderCallbackC1827w;
import v0.b0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class f extends E0.s {

    /* renamed from: G1, reason: collision with root package name */
    public static final int[] f5940G1 = {1920, 1600, 1440, PlatformPlugin.DEFAULT_SYSTEM_UI, 960, 854, 640, 540, 480};

    /* renamed from: H1, reason: collision with root package name */
    public static boolean f5941H1;

    /* renamed from: I1, reason: collision with root package name */
    public static boolean f5942I1;

    /* renamed from: A1, reason: collision with root package name */
    public int f5943A1;

    /* renamed from: B1, reason: collision with root package name */
    public e f5944B1;

    /* renamed from: C1, reason: collision with root package name */
    public C1828x f5945C1;

    /* renamed from: D1, reason: collision with root package name */
    public long f5946D1;

    /* renamed from: E1, reason: collision with root package name */
    public long f5947E1;

    /* renamed from: F1, reason: collision with root package name */
    public boolean f5948F1;
    public final Context W0;

    /* renamed from: X0, reason: collision with root package name */
    public final boolean f5949X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final C f5950Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final int f5951Z0;
    public final boolean a1;

    /* renamed from: b1, reason: collision with root package name */
    public final n f5952b1;

    /* renamed from: c1, reason: collision with root package name */
    public final Lc.e f5953c1;

    /* renamed from: d1, reason: collision with root package name */
    public d f5954d1;

    /* renamed from: e1, reason: collision with root package name */
    public boolean f5955e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f5956f1;

    /* renamed from: g1, reason: collision with root package name */
    public j f5957g1;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f5958h1;

    /* renamed from: i1, reason: collision with root package name */
    public List f5959i1;

    /* renamed from: j1, reason: collision with root package name */
    public Surface f5960j1;

    /* renamed from: k1, reason: collision with root package name */
    public h f5961k1;

    /* renamed from: l1, reason: collision with root package name */
    public C1554o f5962l1;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f5963m1;

    /* renamed from: n1, reason: collision with root package name */
    public int f5964n1;

    /* renamed from: o1, reason: collision with root package name */
    public int f5965o1;
    public long p1;

    /* renamed from: q1, reason: collision with root package name */
    public int f5966q1;

    /* renamed from: r1, reason: collision with root package name */
    public int f5967r1;

    /* renamed from: s1, reason: collision with root package name */
    public int f5968s1;

    /* renamed from: t1, reason: collision with root package name */
    public long f5969t1;

    /* renamed from: u1, reason: collision with root package name */
    public int f5970u1;

    /* renamed from: v1, reason: collision with root package name */
    public long f5971v1;

    /* renamed from: w1, reason: collision with root package name */
    public C1425W f5972w1;

    /* renamed from: x1, reason: collision with root package name */
    public C1425W f5973x1;

    /* renamed from: y1, reason: collision with root package name */
    public int f5974y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f5975z1;

    public f(Context context, E0.l lVar, Handler handler, SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w) {
        super(2, lVar, 30.0f);
        Context origApplicationContext = StubApp.getOrigApplicationContext(context.getApplicationContext());
        this.W0 = origApplicationContext;
        this.f5951Z0 = 50;
        this.f5957g1 = null;
        this.f5950Y0 = new C(20, handler, surfaceHolderCallbackC1827w);
        this.f5949X0 = true;
        this.f5952b1 = new n(origApplicationContext, this);
        this.f5953c1 = new Lc.e();
        this.a1 = StubApp.getString2(5380).equals(AbstractC1560u.f20192c);
        this.f5962l1 = C1554o.f20179c;
        this.f5964n1 = 1;
        this.f5965o1 = 0;
        this.f5972w1 = C1425W.f18113d;
        this.f5943A1 = 0;
        this.f5973x1 = null;
        this.f5974y1 = -1000;
        this.f5946D1 = -9223372036854775807L;
        this.f5947E1 = -9223372036854775807L;
    }

    public static int A0(E0.p pVar, C1438m c1438m) {
        if (c1438m.f18217o == -1) {
            return y0(pVar, c1438m);
        }
        List list = c1438m.f18219q;
        int size = list.size();
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i3 += ((byte[]) list.get(i10)).length;
        }
        return c1438m.f18217o + i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x09eb, code lost:
    
        if (r14.equals(com.stub.StubApp.getString2(5512)) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0bda, code lost:
    
        if (r1.equals(com.stub.StubApp.getString2(5539)) == false) goto L662;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean x0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 4010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.f.x0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x008e, code lost:
    
        if (r9.equals(r2) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int y0(E0.p r11, o0.C1438m r12) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.f.y0(E0.p, o0.m):int");
    }

    public static List z0(Context context, E0.k kVar, C1438m c1438m, boolean z2, boolean z10) {
        List e10;
        String str = c1438m.f18216n;
        if (str == null) {
            return Z.f4578e;
        }
        if (AbstractC1560u.f20190a >= 26 && StubApp.getString2(1613).equals(str) && !Y3.a.j(context)) {
            String b2 = z.b(c1438m);
            if (b2 == null) {
                e10 = Z.f4578e;
            } else {
                kVar.getClass();
                e10 = z.e(b2, z2, z10);
            }
            if (!e10.isEmpty()) {
                return e10;
            }
        }
        return z.g(kVar, c1438m, z2, z10);
    }

    @Override // E0.s, v0.AbstractC1810e
    public final void A(float f10, float f11) {
        super.A(f10, f11);
        j jVar = this.f5957g1;
        if (jVar != null) {
            jVar.i(f10);
        } else {
            this.f5952b1.h(f10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.Surface B0(E0.p r6) {
        /*
            r5 = this;
            R0.j r0 = r5.f5957g1
            r1 = 0
            r2 = 0
            if (r0 != 0) goto Lae
            android.view.Surface r0 = r5.f5960j1
            if (r0 == 0) goto Lb
            return r0
        Lb:
            int r0 = r0.AbstractC1560u.f20190a
            r3 = 35
            if (r0 < r3) goto L16
            boolean r0 = r6.f1784h
            if (r0 == 0) goto L16
            return r2
        L16:
            boolean r0 = r5.F0(r6)
            r0.AbstractC1550k.g(r0)
            R0.h r0 = r5.f5961k1
            if (r0 == 0) goto L2e
            boolean r3 = r0.f5983a
            boolean r4 = r6.f1782f
            if (r3 == r4) goto L2e
            if (r0 == 0) goto L2e
            r0.release()
            r5.f5961k1 = r2
        L2e:
            R0.h r0 = r5.f5961k1
            if (r0 != 0) goto Lab
            android.content.Context r0 = r5.W0
            boolean r6 = r6.f1782f
            r2 = 1
            if (r6 == 0) goto L42
            boolean r0 = R0.h.d(r0)
            if (r0 == 0) goto L40
            goto L44
        L40:
            r0 = r1
            goto L45
        L42:
            int r0 = R0.h.f5981d
        L44:
            r0 = r2
        L45:
            r0.AbstractC1550k.g(r0)
            R0.g r0 = new R0.g
            r3 = 5542(0x15a6, float:7.766E-42)
            java.lang.String r3 = com.stub.StubApp.getString2(r3)
            r0.<init>(r3)
            if (r6 == 0) goto L59
            int r6 = R0.h.f5981d
            goto L5a
        L59:
            r6 = r1
        L5a:
            r0.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r3.<init>(r4, r0)
            r0.f5977b = r3
            r0.d r4 = new r0.d
            r4.<init>(r3)
            r0.f5976a = r4
            monitor-enter(r0)
            android.os.Handler r3 = r0.f5977b     // Catch: java.lang.Throwable -> L89
            android.os.Message r6 = r3.obtainMessage(r2, r6, r1)     // Catch: java.lang.Throwable -> L89
            r6.sendToTarget()     // Catch: java.lang.Throwable -> L89
        L79:
            R0.h r6 = r0.f5980e     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            java.lang.RuntimeException r6 = r0.f5979d     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            java.lang.Error r6 = r0.f5978c     // Catch: java.lang.Throwable -> L89
            if (r6 != 0) goto L8d
            r0.wait()     // Catch: java.lang.Throwable -> L89 java.lang.InterruptedException -> L8b
            goto L79
        L89:
            r6 = move-exception
            goto La9
        L8b:
            r1 = r2
            goto L79
        L8d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L97
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        L97:
            java.lang.RuntimeException r6 = r0.f5979d
            if (r6 != 0) goto La8
            java.lang.Error r6 = r0.f5978c
            if (r6 != 0) goto La7
            R0.h r6 = r0.f5980e
            r6.getClass()
            r5.f5961k1 = r6
            goto Lab
        La7:
            throw r6
        La8:
            throw r6
        La9:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L89
            throw r6
        Lab:
            R0.h r6 = r5.f5961k1
            return r6
        Lae:
            r0.AbstractC1550k.g(r1)
            r0.AbstractC1550k.h(r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: R0.f.B0(E0.p):android.view.Surface");
    }

    public final void C0() {
        if (this.f5966q1 > 0) {
            this.f21722g.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.p1;
            int i3 = this.f5966q1;
            C c10 = this.f5950Y0;
            Handler handler = (Handler) c10.f9077b;
            if (handler != null) {
                handler.post(new s(c10, i3, j));
            }
            this.f5966q1 = 0;
            this.p1 = elapsedRealtime;
        }
    }

    public final void D0() {
        int i3;
        E0.m mVar;
        if (!this.f5975z1 || (i3 = AbstractC1560u.f20190a) < 23 || (mVar = this.f1826R) == null) {
            return;
        }
        this.f5944B1 = new e(this, mVar);
        if (i3 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt(StubApp.getString2(5543), 1);
            mVar.b(bundle);
        }
    }

    @Override // E0.s
    public final C1812g E(E0.p pVar, C1438m c1438m, C1438m c1438m2) {
        C1812g b2 = pVar.b(c1438m, c1438m2);
        d dVar = this.f5954d1;
        dVar.getClass();
        int i3 = c1438m2.f18223u;
        int i10 = dVar.f5935b;
        int i11 = b2.f21747e;
        if (i3 > i10 || c1438m2.f18224v > dVar.f5936c) {
            i11 |= 256;
        }
        if (A0(pVar, c1438m2) > dVar.f5937d) {
            i11 |= 64;
        }
        int i12 = i11;
        return new C1812g(pVar.f1777a, c1438m, c1438m2, i12 != 0 ? 0 : b2.f21746d, i12);
    }

    public final void E0(E0.m mVar, int i3, long j) {
        Surface surface;
        Trace.beginSection(StubApp.getString2(5544));
        mVar.h(i3, j);
        Trace.endSection();
        this.f1827R0.f21736e++;
        this.f5967r1 = 0;
        if (this.f5957g1 == null) {
            C1425W c1425w = this.f5972w1;
            boolean equals = c1425w.equals(C1425W.f18113d);
            C c10 = this.f5950Y0;
            if (!equals && !c1425w.equals(this.f5973x1)) {
                this.f5973x1 = c1425w;
                c10.J(c1425w);
            }
            n nVar = this.f5952b1;
            boolean z2 = nVar.f6019d != 3;
            nVar.f6019d = 3;
            nVar.f6025k.getClass();
            nVar.f6021f = AbstractC1560u.J(SystemClock.elapsedRealtime());
            if (!z2 || (surface = this.f5960j1) == null) {
                return;
            }
            Handler handler = (Handler) c10.f9077b;
            if (handler != null) {
                handler.post(new t(c10, surface, SystemClock.elapsedRealtime()));
            }
            this.f5963m1 = true;
        }
    }

    @Override // E0.s
    public final E0.o F(IllegalStateException illegalStateException, E0.p pVar) {
        Surface surface = this.f5960j1;
        c cVar = new c(illegalStateException, pVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return cVar;
    }

    public final boolean F0(E0.p pVar) {
        if (AbstractC1560u.f20190a < 23 || this.f5975z1 || x0(pVar.f1777a)) {
            return false;
        }
        return !pVar.f1782f || h.d(this.W0);
    }

    public final void G0(E0.m mVar, int i3) {
        Trace.beginSection(StubApp.getString2(5545));
        mVar.e(i3);
        Trace.endSection();
        this.f1827R0.f21737f++;
    }

    public final void H0(int i3, int i10) {
        C1811f c1811f = this.f1827R0;
        c1811f.f21739h += i3;
        int i11 = i3 + i10;
        c1811f.f21738g += i11;
        this.f5966q1 += i11;
        int i12 = this.f5967r1 + i11;
        this.f5967r1 = i12;
        c1811f.f21740i = Math.max(i12, c1811f.f21740i);
        int i13 = this.f5951Z0;
        if (i13 <= 0 || this.f5966q1 < i13) {
            return;
        }
        C0();
    }

    public final void I0(long j) {
        C1811f c1811f = this.f1827R0;
        c1811f.f21741k += j;
        c1811f.f21742l++;
        this.f5969t1 += j;
        this.f5970u1++;
    }

    @Override // E0.s
    public final int N(u0.e eVar) {
        return (AbstractC1560u.f20190a < 34 || !this.f5975z1 || eVar.f21398g >= this.f21726m) ? 0 : 32;
    }

    @Override // E0.s
    public final boolean O() {
        return this.f5975z1 && AbstractC1560u.f20190a < 23;
    }

    @Override // E0.s
    public final float P(float f10, C1438m[] c1438mArr) {
        float f11 = -1.0f;
        for (C1438m c1438m : c1438mArr) {
            float f12 = c1438m.f18225w;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    @Override // E0.s
    public final ArrayList Q(E0.k kVar, C1438m c1438m, boolean z2) {
        List z02 = z0(this.W0, kVar, c1438m, z2, this.f5975z1);
        HashMap hashMap = z.f1863a;
        ArrayList arrayList = new ArrayList(z02);
        Collections.sort(arrayList, new E0.t(new C2.d(c1438m, 8)));
        return arrayList;
    }

    @Override // E0.s
    public final C0250h R(E0.p pVar, C1438m c1438m, MediaCrypto mediaCrypto, float f10) {
        C1431f c1431f;
        int i3;
        d dVar;
        Point point;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i10;
        int i11;
        int i12;
        char c10;
        boolean z2;
        Pair d8;
        int y02;
        String str = pVar.f1779c;
        C1438m[] c1438mArr = this.f21724k;
        c1438mArr.getClass();
        int i13 = c1438m.f18223u;
        int A02 = A0(pVar, c1438m);
        int length = c1438mArr.length;
        float f11 = c1438m.f18225w;
        int i14 = c1438m.f18223u;
        C1431f c1431f2 = c1438m.f18192B;
        int i15 = c1438m.f18224v;
        if (length == 1) {
            if (A02 != -1 && (y02 = y0(pVar, c1438m)) != -1) {
                A02 = Math.min((int) (A02 * 1.5f), y02);
            }
            dVar = new d(i13, i15, A02, 0);
            c1431f = c1431f2;
            i3 = i15;
        } else {
            int length2 = c1438mArr.length;
            int i16 = i15;
            int i17 = 0;
            boolean z10 = false;
            while (i17 < length2) {
                C1438m c1438m2 = c1438mArr[i17];
                C1438m[] c1438mArr2 = c1438mArr;
                if (c1431f2 != null && c1438m2.f18192B == null) {
                    C1437l a3 = c1438m2.a();
                    a3.f18155A = c1431f2;
                    c1438m2 = new C1438m(a3);
                }
                if (pVar.b(c1438m, c1438m2).f21746d != 0) {
                    int i18 = c1438m2.f18224v;
                    i11 = length2;
                    int i19 = c1438m2.f18223u;
                    i12 = i17;
                    c10 = 65535;
                    z10 |= i19 == -1 || i18 == -1;
                    i13 = Math.max(i13, i19);
                    i16 = Math.max(i16, i18);
                    A02 = Math.max(A02, A0(pVar, c1438m2));
                } else {
                    i11 = length2;
                    i12 = i17;
                    c10 = 65535;
                }
                length2 = i11;
                i17 = i12 + 1;
                c1438mArr = c1438mArr2;
            }
            if (z10) {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(5546));
                sb2.append(i13);
                String string2 = StubApp.getString2(925);
                sb2.append(string2);
                sb2.append(i16);
                String sb3 = sb2.toString();
                String string22 = StubApp.getString2(5547);
                AbstractC1550k.w(string22, sb3);
                boolean z11 = i15 > i14;
                int i20 = z11 ? i15 : i14;
                boolean z12 = z11;
                int i21 = z11 ? i14 : i15;
                float f12 = i21 / i20;
                int[] iArr = f5940G1;
                c1431f = c1431f2;
                int i22 = 0;
                while (i22 < 9) {
                    int i23 = iArr[i22];
                    int i24 = i22;
                    int i25 = (int) (i23 * f12);
                    if (i23 <= i20 || i25 <= i21) {
                        break;
                    }
                    if (!z12) {
                        i25 = i23;
                    }
                    if (!z12) {
                        i23 = i25;
                    }
                    int i26 = i21;
                    MediaCodecInfo.CodecCapabilities codecCapabilities = pVar.f1780d;
                    if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                        i10 = i20;
                        point = null;
                    } else {
                        int widthAlignment = videoCapabilities.getWidthAlignment();
                        i10 = i20;
                        int heightAlignment = videoCapabilities.getHeightAlignment();
                        point = new Point(AbstractC1560u.f(i25, widthAlignment) * widthAlignment, AbstractC1560u.f(i23, heightAlignment) * heightAlignment);
                    }
                    if (point != null) {
                        i3 = i15;
                        if (pVar.f(f11, point.x, point.y)) {
                            break;
                        }
                    } else {
                        i3 = i15;
                    }
                    i22 = i24 + 1;
                    i15 = i3;
                    i21 = i26;
                    i20 = i10;
                }
                i3 = i15;
                point = null;
                if (point != null) {
                    i13 = Math.max(i13, point.x);
                    i16 = Math.max(i16, point.y);
                    C1437l a9 = c1438m.a();
                    a9.f18184t = i13;
                    a9.f18185u = i16;
                    A02 = Math.max(A02, y0(pVar, new C1438m(a9)));
                    AbstractC1550k.w(string22, StubApp.getString2(5548) + i13 + string2 + i16);
                }
            } else {
                c1431f = c1431f2;
                i3 = i15;
            }
            dVar = new d(i13, i16, A02, 0);
        }
        this.f5954d1 = dVar;
        int i27 = this.f5975z1 ? this.f5943A1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(StubApp.getString2(5549), str);
        mediaFormat.setInteger(StubApp.getString2(1650), i14);
        mediaFormat.setInteger(StubApp.getString2(1651), i3);
        AbstractC1550k.v(mediaFormat, c1438m.f18219q);
        if (f11 != -1.0f) {
            mediaFormat.setFloat(StubApp.getString2(5550), f11);
        }
        AbstractC1550k.r(mediaFormat, StubApp.getString2(5551), c1438m.f18226x);
        if (c1431f != null) {
            C1431f c1431f3 = c1431f;
            AbstractC1550k.r(mediaFormat, StubApp.getString2(5552), c1431f3.f18138c);
            AbstractC1550k.r(mediaFormat, StubApp.getString2(5553), c1431f3.f18136a);
            AbstractC1550k.r(mediaFormat, StubApp.getString2(5554), c1431f3.f18137b);
            byte[] bArr = c1431f3.f18139d;
            if (bArr != null) {
                mediaFormat.setByteBuffer(StubApp.getString2(5555), ByteBuffer.wrap(bArr));
            }
        }
        if (StubApp.getString2(1613).equals(c1438m.f18216n) && (d8 = z.d(c1438m)) != null) {
            AbstractC1550k.r(mediaFormat, StubApp.getString2(5556), ((Integer) d8.first).intValue());
        }
        mediaFormat.setInteger(StubApp.getString2(5557), dVar.f5935b);
        mediaFormat.setInteger(StubApp.getString2(5558), dVar.f5936c);
        AbstractC1550k.r(mediaFormat, StubApp.getString2(5559), dVar.f5937d);
        int i28 = AbstractC1560u.f20190a;
        if (i28 >= 23) {
            mediaFormat.setInteger(StubApp.getString2(1044), 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat(StubApp.getString2(1685), f10);
            }
        }
        if (this.a1) {
            z2 = true;
            mediaFormat.setInteger(StubApp.getString2(5560), 1);
            mediaFormat.setInteger(StubApp.getString2(5561), 0);
        } else {
            z2 = true;
        }
        if (i27 != 0) {
            mediaFormat.setFeatureEnabled(StubApp.getString2(1605), z2);
            mediaFormat.setInteger(StubApp.getString2(5562), i27);
        }
        if (i28 >= 35) {
            mediaFormat.setInteger(StubApp.getString2(2644), Math.max(0, -this.f5974y1));
        }
        Surface B02 = B0(pVar);
        if (this.f5957g1 != null && !AbstractC1560u.G(this.W0)) {
            mediaFormat.setInteger(StubApp.getString2(5563), 0);
        }
        return new C0250h(pVar, mediaFormat, c1438m, B02, mediaCrypto, (Q2.g) null);
    }

    @Override // E0.s
    public final void S(u0.e eVar) {
        if (this.f5956f1) {
            ByteBuffer byteBuffer = eVar.f21399h;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s10 == 60 && s11 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        E0.m mVar = this.f1826R;
                        mVar.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray(StubApp.getString2(5564), bArr);
                        mVar.b(bundle);
                    }
                }
            }
        }
    }

    @Override // E0.s
    public final void X(Exception exc) {
        AbstractC1550k.l(StubApp.getString2(5547), StubApp.getString2(5565), exc);
        C c10 = this.f5950Y0;
        Handler handler = (Handler) c10.f9077b;
        if (handler != null) {
            handler.post(new s(c10, exc, 3));
        }
    }

    @Override // E0.s
    public final void Y(long j, String str, long j3) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        C c10 = this.f5950Y0;
        Handler handler = (Handler) c10.f9077b;
        if (handler != null) {
            str2 = str;
            handler.post(new s(c10, str2, j, j3));
        } else {
            str2 = str;
        }
        this.f5955e1 = x0(str2);
        E0.p pVar = this.f1836l0;
        pVar.getClass();
        boolean z2 = false;
        if (AbstractC1560u.f20190a >= 29 && StubApp.getString2(1614).equals(pVar.f1778b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = pVar.f1780d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i3].profile == 16384) {
                    z2 = true;
                    break;
                }
                i3++;
            }
        }
        this.f5956f1 = z2;
        D0();
    }

    @Override // E0.s
    public final void Z(String str) {
        C c10 = this.f5950Y0;
        Handler handler = (Handler) c10.f9077b;
        if (handler != null) {
            handler.post(new s(c10, str, 5));
        }
    }

    @Override // E0.s
    public final C1812g a0(C1803F c1803f) {
        C1812g a02 = super.a0(c1803f);
        C1438m c1438m = (C1438m) c1803f.f21582b;
        c1438m.getClass();
        C c10 = this.f5950Y0;
        Handler handler = (Handler) c10.f9077b;
        if (handler != null) {
            handler.post(new Ab.b(c10, c1438m, a02, 14));
        }
        return a02;
    }

    @Override // E0.s
    public final void b0(C1438m c1438m, MediaFormat mediaFormat) {
        int integer;
        int i3;
        E0.m mVar = this.f1826R;
        if (mVar != null) {
            mVar.n(this.f5964n1);
        }
        if (this.f5975z1) {
            i3 = c1438m.f18223u;
            integer = c1438m.f18224v;
        } else {
            mediaFormat.getClass();
            String string2 = StubApp.getString2(5566);
            boolean containsKey = mediaFormat.containsKey(string2);
            String string22 = StubApp.getString2(5567);
            String string23 = StubApp.getString2(5568);
            String string24 = StubApp.getString2(5569);
            boolean z2 = containsKey && mediaFormat.containsKey(string24) && mediaFormat.containsKey(string23) && mediaFormat.containsKey(string22);
            int integer2 = z2 ? (mediaFormat.getInteger(string2) - mediaFormat.getInteger(string24)) + 1 : mediaFormat.getInteger(StubApp.getString2(1650));
            integer = z2 ? (mediaFormat.getInteger(string23) - mediaFormat.getInteger(string22)) + 1 : mediaFormat.getInteger(StubApp.getString2(1651));
            i3 = integer2;
        }
        float f10 = c1438m.f18227y;
        int i10 = c1438m.f18226x;
        if (i10 == 90 || i10 == 270) {
            f10 = 1.0f / f10;
            int i11 = integer;
            integer = i3;
            i3 = i11;
        }
        this.f5972w1 = new C1425W(f10, i3, integer);
        j jVar = this.f5957g1;
        if (jVar == null || !this.f5948F1) {
            this.f5952b1.g(c1438m.f18225w);
        } else {
            C1437l a3 = c1438m.a();
            a3.f18184t = i3;
            a3.f18185u = integer;
            a3.f18188x = f10;
            C1438m c1438m2 = new C1438m(a3);
            AbstractC1550k.g(false);
            jVar.f6000n.f6004b.g(c1438m2.f18225w);
            jVar.f5990c = c1438m2;
            if (jVar.f5996i) {
                AbstractC1550k.g(jVar.f5995h != -9223372036854775807L);
                jVar.j = true;
                jVar.f5997k = jVar.f5995h;
            } else {
                jVar.e();
                jVar.f5996i = true;
                jVar.j = false;
                jVar.f5997k = -9223372036854775807L;
            }
        }
        this.f5948F1 = false;
    }

    @Override // v0.AbstractC1810e, v0.Y
    public final void d(int i3, Object obj) {
        Handler handler;
        n nVar = this.f5952b1;
        if (i3 == 1) {
            Surface surface = obj instanceof Surface ? (Surface) obj : null;
            Surface surface2 = this.f5960j1;
            C c10 = this.f5950Y0;
            if (surface2 == surface) {
                if (surface != null) {
                    C1425W c1425w = this.f5973x1;
                    if (c1425w != null) {
                        c10.J(c1425w);
                    }
                    Surface surface3 = this.f5960j1;
                    if (surface3 == null || !this.f5963m1 || (handler = (Handler) c10.f9077b) == null) {
                        return;
                    }
                    handler.post(new t(c10, surface3, SystemClock.elapsedRealtime()));
                    return;
                }
                return;
            }
            this.f5960j1 = surface;
            if (this.f5957g1 == null) {
                q qVar = nVar.f6017b;
                if (qVar.f6038e != surface) {
                    qVar.b();
                    qVar.f6038e = surface;
                    qVar.d(true);
                }
                nVar.d(1);
            }
            this.f5963m1 = false;
            int i10 = this.f21723h;
            E0.m mVar = this.f1826R;
            if (mVar != null && this.f5957g1 == null) {
                E0.p pVar = this.f1836l0;
                pVar.getClass();
                Surface surface4 = this.f5960j1;
                boolean z2 = (surface4 != null && surface4.isValid()) || (AbstractC1560u.f20190a >= 35 && pVar.f1784h) || F0(pVar);
                int i11 = AbstractC1560u.f20190a;
                if (i11 < 23 || !z2 || this.f5955e1) {
                    k0();
                    V();
                } else {
                    Surface B02 = B0(pVar);
                    if (i11 >= 23 && B02 != null) {
                        mVar.q(B02);
                    } else {
                        if (i11 < 35) {
                            throw new IllegalStateException();
                        }
                        mVar.g();
                    }
                }
            }
            if (surface != null) {
                C1425W c1425w2 = this.f5973x1;
                if (c1425w2 != null) {
                    c10.J(c1425w2);
                }
                if (i10 == 2) {
                    j jVar = this.f5957g1;
                    if (jVar != null) {
                        jVar.d(true);
                    } else {
                        nVar.c(true);
                    }
                }
            } else {
                this.f5973x1 = null;
                j jVar2 = this.f5957g1;
                if (jVar2 != null) {
                    m mVar2 = jVar2.f6000n;
                    mVar2.getClass();
                    int i12 = C1554o.f20179c.f20180a;
                    mVar2.f6013l = null;
                }
            }
            D0();
            return;
        }
        if (i3 == 7) {
            obj.getClass();
            C1828x c1828x = (C1828x) obj;
            this.f5945C1 = c1828x;
            j jVar3 = this.f5957g1;
            if (jVar3 != null) {
                jVar3.f6000n.j = c1828x;
                return;
            }
            return;
        }
        if (i3 == 10) {
            obj.getClass();
            int intValue = ((Integer) obj).intValue();
            if (this.f5943A1 != intValue) {
                this.f5943A1 = intValue;
                if (this.f5975z1) {
                    k0();
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == 16) {
            obj.getClass();
            this.f5974y1 = ((Integer) obj).intValue();
            E0.m mVar3 = this.f1826R;
            if (mVar3 != null && AbstractC1560u.f20190a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt(StubApp.getString2(2644), Math.max(0, -this.f5974y1));
                mVar3.b(bundle);
                return;
            }
            return;
        }
        if (i3 == 4) {
            obj.getClass();
            int intValue2 = ((Integer) obj).intValue();
            this.f5964n1 = intValue2;
            E0.m mVar4 = this.f1826R;
            if (mVar4 != null) {
                mVar4.n(intValue2);
                return;
            }
            return;
        }
        if (i3 == 5) {
            obj.getClass();
            int intValue3 = ((Integer) obj).intValue();
            this.f5965o1 = intValue3;
            j jVar4 = this.f5957g1;
            if (jVar4 != null) {
                jVar4.g(intValue3);
                return;
            }
            q qVar2 = nVar.f6017b;
            if (qVar2.j == intValue3) {
                return;
            }
            qVar2.j = intValue3;
            qVar2.d(true);
            return;
        }
        if (i3 == 13) {
            obj.getClass();
            List list = (List) obj;
            this.f5959i1 = list;
            j jVar5 = this.f5957g1;
            if (jVar5 != null) {
                jVar5.k(list);
                return;
            }
            return;
        }
        if (i3 != 14) {
            if (i3 == 11) {
                this.f1812I = (C1798A) obj;
                return;
            }
            return;
        }
        obj.getClass();
        C1554o c1554o = (C1554o) obj;
        if (c1554o.f20180a == 0 || c1554o.f20181b == 0) {
            return;
        }
        this.f5962l1 = c1554o;
        j jVar6 = this.f5957g1;
        if (jVar6 != null) {
            Surface surface5 = this.f5960j1;
            AbstractC1550k.h(surface5);
            jVar6.h(surface5, c1554o);
        }
    }

    @Override // E0.s
    public final void d0(long j) {
        super.d0(j);
        if (this.f5975z1) {
            return;
        }
        this.f5968s1--;
    }

    @Override // E0.s
    public final void e0() {
        j jVar = this.f5957g1;
        if (jVar != null) {
            E0.r rVar = this.f1828S0;
            jVar.j(rVar.f1792b, rVar.f1793c, -this.f5946D1, this.f21726m);
        } else {
            this.f5952b1.d(2);
        }
        this.f5948F1 = true;
        D0();
    }

    @Override // E0.s
    public final void f0(u0.e eVar) {
        Surface surface;
        boolean z2 = this.f5975z1;
        if (!z2) {
            this.f5968s1++;
        }
        if (AbstractC1560u.f20190a >= 23 || !z2) {
            return;
        }
        long j = eVar.f21398g;
        w0(j);
        C1425W c1425w = this.f5972w1;
        boolean equals = c1425w.equals(C1425W.f18113d);
        C c10 = this.f5950Y0;
        if (!equals && !c1425w.equals(this.f5973x1)) {
            this.f5973x1 = c1425w;
            c10.J(c1425w);
        }
        this.f1827R0.f21736e++;
        n nVar = this.f5952b1;
        boolean z10 = nVar.f6019d != 3;
        nVar.f6019d = 3;
        nVar.f6025k.getClass();
        nVar.f6021f = AbstractC1560u.J(SystemClock.elapsedRealtime());
        if (z10 && (surface = this.f5960j1) != null) {
            Handler handler = (Handler) c10.f9077b;
            if (handler != null) {
                handler.post(new t(c10, surface, SystemClock.elapsedRealtime()));
            }
            this.f5963m1 = true;
        }
        d0(j);
    }

    @Override // E0.s
    public final void g0(C1438m c1438m) {
        j jVar = this.f5957g1;
        if (jVar == null) {
            return;
        }
        try {
            jVar.c(c1438m);
            throw null;
        } catch (v e10) {
            throw g(e10, c1438m, false, 7000);
        }
    }

    @Override // v0.AbstractC1810e
    public final void h() {
        j jVar = this.f5957g1;
        if (jVar != null) {
            n nVar = (n) jVar.f6000n.f6008f.f16037b;
            if (nVar.f6019d == 0) {
                nVar.f6019d = 1;
                return;
            }
            return;
        }
        n nVar2 = this.f5952b1;
        if (nVar2.f6019d == 0) {
            nVar2.f6019d = 1;
        }
    }

    @Override // E0.s
    public final boolean i0(long j, long j3, E0.m mVar, ByteBuffer byteBuffer, int i3, int i10, int i11, long j10, boolean z2, boolean z10, C1438m c1438m) {
        mVar.getClass();
        E0.r rVar = this.f1828S0;
        long j11 = j10 - rVar.f1793c;
        j jVar = this.f5957g1;
        if (jVar != null) {
            try {
                return jVar.b(j10 + (-this.f5946D1), z10, j, j3, new Bc.i(this, mVar, i3, j11));
            } catch (v e10) {
                throw g(e10, e10.f6066a, false, 7001);
            }
        }
        int a3 = this.f5952b1.a(j10, j, j3, rVar.f1792b, z10, this.f5953c1);
        if (a3 != 4) {
            if (z2 && !z10) {
                G0(mVar, i3);
                return true;
            }
            Surface surface = this.f5960j1;
            Lc.e eVar = this.f5953c1;
            if (surface == null) {
                if (eVar.f4404a < 30000) {
                    G0(mVar, i3);
                    I0(eVar.f4404a);
                    return true;
                }
            } else {
                if (a3 == 0) {
                    this.f21722g.getClass();
                    long nanoTime = System.nanoTime();
                    C1828x c1828x = this.f5945C1;
                    if (c1828x != null) {
                        c1828x.c();
                    }
                    E0(mVar, i3, nanoTime);
                    I0(eVar.f4404a);
                    return true;
                }
                if (a3 == 1) {
                    long j12 = eVar.f4405b;
                    long j13 = eVar.f4404a;
                    if (j12 == this.f5971v1) {
                        G0(mVar, i3);
                    } else {
                        C1828x c1828x2 = this.f5945C1;
                        if (c1828x2 != null) {
                            c1828x2.c();
                        }
                        E0(mVar, i3, j12);
                    }
                    I0(j13);
                    this.f5971v1 = j12;
                    return true;
                }
                if (a3 == 2) {
                    Trace.beginSection(StubApp.getString2(5570));
                    mVar.e(i3);
                    Trace.endSection();
                    H0(0, 1);
                    I0(eVar.f4404a);
                    return true;
                }
                if (a3 == 3) {
                    G0(mVar, i3);
                    I0(eVar.f4404a);
                    return true;
                }
                if (a3 != 5) {
                    throw new IllegalStateException(String.valueOf(a3));
                }
            }
        }
        return false;
    }

    @Override // v0.AbstractC1810e
    public final String j() {
        return StubApp.getString2(5547);
    }

    @Override // v0.AbstractC1810e
    public final boolean l() {
        return this.f1820N0 && this.f5957g1 == null;
    }

    @Override // E0.s
    public final void m0() {
        super.m0();
        this.f5968s1 = 0;
    }

    @Override // E0.s, v0.AbstractC1810e
    public final boolean n() {
        boolean n10 = super.n();
        j jVar = this.f5957g1;
        if (jVar != null) {
            return ((n) jVar.f6000n.f6008f.f16037b).b(false);
        }
        if (n10 && (this.f1826R == null || this.f5960j1 == null || this.f5975z1)) {
            return true;
        }
        return this.f5952b1.b(n10);
    }

    @Override // E0.s, v0.AbstractC1810e
    public final void o() {
        C c10 = this.f5950Y0;
        this.f5973x1 = null;
        this.f5947E1 = -9223372036854775807L;
        j jVar = this.f5957g1;
        if (jVar != null) {
            ((n) jVar.f6000n.f6008f.f16037b).d(0);
        } else {
            this.f5952b1.d(0);
        }
        D0();
        this.f5963m1 = false;
        this.f5944B1 = null;
        try {
            super.o();
            C1811f c1811f = this.f1827R0;
            c10.getClass();
            synchronized (c1811f) {
            }
            Handler handler = (Handler) c10.f9077b;
            if (handler != null) {
                handler.post(new Ab.b(15, c10, c1811f));
            }
            c10.J(C1425W.f18113d);
        } catch (Throwable th) {
            C1811f c1811f2 = this.f1827R0;
            c10.getClass();
            synchronized (c1811f2) {
                Handler handler2 = (Handler) c10.f9077b;
                if (handler2 != null) {
                    handler2.post(new Ab.b(15, c10, c1811f2));
                }
                c10.J(C1425W.f18113d);
                throw th;
            }
        }
    }

    @Override // v0.AbstractC1810e
    public final void p(boolean z2, boolean z10) {
        this.f1827R0 = new C1811f();
        b0 b0Var = this.f21719d;
        b0Var.getClass();
        boolean z11 = b0Var.f21702b;
        AbstractC1550k.g((z11 && this.f5943A1 == 0) ? false : true);
        if (this.f5975z1 != z11) {
            this.f5975z1 = z11;
            k0();
        }
        C1811f c1811f = this.f1827R0;
        C c10 = this.f5950Y0;
        Handler handler = (Handler) c10.f9077b;
        if (handler != null) {
            handler.post(new s(c10, c1811f, 4));
        }
        boolean z12 = this.f5958h1;
        n nVar = this.f5952b1;
        if (!z12) {
            if (this.f5959i1 != null && this.f5957g1 == null) {
                K2.c cVar = new K2.c(this.W0, nVar);
                C1555p c1555p = this.f21722g;
                c1555p.getClass();
                cVar.f3644h = c1555p;
                AbstractC1550k.g(!cVar.f3638b);
                if (((l) cVar.f3642f) == null) {
                    if (((k) cVar.f3641e) == null) {
                        cVar.f3641e = new k();
                    }
                    cVar.f3642f = new l((k) cVar.f3641e);
                }
                m mVar = new m(cVar);
                cVar.f3638b = true;
                this.f5957g1 = mVar.f6003a;
            }
            this.f5958h1 = true;
        }
        j jVar = this.f5957g1;
        if (jVar == null) {
            C1555p c1555p2 = this.f21722g;
            c1555p2.getClass();
            nVar.f6025k = c1555p2;
            nVar.f6019d = z10 ? 1 : 0;
            return;
        }
        F5.c cVar2 = new F5.c(this, 18);
        Q4.a aVar = Q4.a.f5730a;
        jVar.f5998l = cVar2;
        jVar.f5999m = aVar;
        C1828x c1828x = this.f5945C1;
        if (c1828x != null) {
            jVar.f6000n.j = c1828x;
        }
        if (this.f5960j1 != null && !this.f5962l1.equals(C1554o.f20179c)) {
            this.f5957g1.h(this.f5960j1, this.f5962l1);
        }
        this.f5957g1.g(this.f5965o1);
        this.f5957g1.i(this.f1821O);
        List list = this.f5959i1;
        if (list != null) {
            this.f5957g1.k(list);
        }
        ((n) this.f5957g1.f6000n.f6008f.f16037b).f6019d = z10 ? 1 : 0;
    }

    @Override // E0.s, v0.AbstractC1810e
    public final void q(long j, boolean z2) {
        j jVar = this.f5957g1;
        if (jVar != null) {
            jVar.a(true);
            j jVar2 = this.f5957g1;
            E0.r rVar = this.f1828S0;
            jVar2.j(rVar.f1792b, rVar.f1793c, -this.f5946D1, this.f21726m);
            this.f5948F1 = true;
        }
        super.q(j, z2);
        j jVar3 = this.f5957g1;
        n nVar = this.f5952b1;
        if (jVar3 == null) {
            q qVar = nVar.f6017b;
            qVar.f6045m = 0L;
            qVar.f6048p = -1L;
            qVar.f6046n = -1L;
            nVar.f6022g = -9223372036854775807L;
            nVar.f6020e = -9223372036854775807L;
            nVar.d(1);
            nVar.f6023h = -9223372036854775807L;
        }
        if (z2) {
            j jVar4 = this.f5957g1;
            if (jVar4 != null) {
                jVar4.d(false);
            } else {
                nVar.c(false);
            }
        }
        D0();
        this.f5967r1 = 0;
    }

    @Override // E0.s
    public final boolean q0(E0.p pVar) {
        Surface surface = this.f5960j1;
        if (surface == null || !surface.isValid()) {
            return (AbstractC1560u.f20190a >= 35 && pVar.f1784h) || F0(pVar);
        }
        return true;
    }

    @Override // v0.AbstractC1810e
    public final void r() {
        j jVar = this.f5957g1;
        if (jVar == null || !this.f5949X0) {
            return;
        }
        m mVar = jVar.f6000n;
        if (mVar.f6015n == 2) {
            return;
        }
        C1557r c1557r = mVar.f6012k;
        if (c1557r != null) {
            c1557r.f20185a.removeCallbacksAndMessages(null);
        }
        mVar.f6013l = null;
        mVar.f6015n = 2;
    }

    @Override // E0.s
    public final boolean r0(u0.e eVar) {
        if (eVar.k(67108864) && !k() && !eVar.k(PKIFailureInfo.duplicateCertReq)) {
            long j = this.f5947E1;
            if (j != -9223372036854775807L && j - (eVar.f21398g - this.f1828S0.f1793c) > 100000 && !eVar.k(1073741824) && eVar.f21398g < this.f21726m) {
                return true;
            }
        }
        return false;
    }

    @Override // v0.AbstractC1810e
    public final void s() {
        try {
            try {
                G();
                k0();
                Z9.q qVar = this.f1810H;
                if (qVar != null) {
                    qVar.I(null);
                }
                this.f1810H = null;
            } catch (Throwable th) {
                Z9.q qVar2 = this.f1810H;
                if (qVar2 != null) {
                    qVar2.I(null);
                }
                this.f1810H = null;
                throw th;
            }
        } finally {
            this.f5958h1 = false;
            this.f5946D1 = -9223372036854775807L;
            h hVar = this.f5961k1;
            if (hVar != null) {
                hVar.release();
                this.f5961k1 = null;
            }
        }
    }

    @Override // v0.AbstractC1810e
    public final void t() {
        this.f5966q1 = 0;
        this.f21722g.getClass();
        this.p1 = SystemClock.elapsedRealtime();
        this.f5969t1 = 0L;
        this.f5970u1 = 0;
        j jVar = this.f5957g1;
        if (jVar != null) {
            ((n) jVar.f6000n.f6008f.f16037b).e();
        } else {
            this.f5952b1.e();
        }
    }

    @Override // E0.s
    public final int t0(E0.k kVar, C1438m c1438m) {
        boolean z2;
        int i3 = 8;
        int i10 = 0;
        if (!AbstractC1405B.l(c1438m.f18216n)) {
            return AbstractC1810e.f(0, 0, 0, 0);
        }
        boolean z10 = c1438m.f18220r != null;
        Context context = this.W0;
        List z02 = z0(context, kVar, c1438m, z10, false);
        if (z10 && z02.isEmpty()) {
            z02 = z0(context, kVar, c1438m, false, false);
        }
        if (z02.isEmpty()) {
            return AbstractC1810e.f(1, 0, 0, 0);
        }
        int i11 = c1438m.f18202L;
        if (i11 != 0 && i11 != 2) {
            return AbstractC1810e.f(2, 0, 0, 0);
        }
        E0.p pVar = (E0.p) z02.get(0);
        boolean d8 = pVar.d(c1438m);
        if (!d8) {
            for (int i12 = 1; i12 < z02.size(); i12++) {
                E0.p pVar2 = (E0.p) z02.get(i12);
                if (pVar2.d(c1438m)) {
                    d8 = true;
                    z2 = false;
                    pVar = pVar2;
                    break;
                }
            }
        }
        z2 = true;
        int i13 = d8 ? 4 : 3;
        int i14 = pVar.e(c1438m) ? 16 : 8;
        int i15 = pVar.f1783g ? 64 : 0;
        int i16 = z2 ? 128 : 0;
        if (AbstractC1560u.f20190a >= 26 && StubApp.getString2(1613).equals(c1438m.f18216n) && !Y3.a.j(context)) {
            i16 = 256;
        }
        if (d8) {
            List z03 = z0(context, kVar, c1438m, z10, true);
            if (!z03.isEmpty()) {
                HashMap hashMap = z.f1863a;
                ArrayList arrayList = new ArrayList(z03);
                Collections.sort(arrayList, new E0.t(new C2.d(c1438m, i3)));
                E0.p pVar3 = (E0.p) arrayList.get(0);
                if (pVar3.d(c1438m) && pVar3.e(c1438m)) {
                    i10 = 32;
                }
            }
        }
        return i13 | i14 | i10 | i15 | i16;
    }

    @Override // v0.AbstractC1810e
    public final void u() {
        C0();
        int i3 = this.f5970u1;
        if (i3 != 0) {
            long j = this.f5969t1;
            C c10 = this.f5950Y0;
            Handler handler = (Handler) c10.f9077b;
            if (handler != null) {
                handler.post(new s(c10, j, i3));
            }
            this.f5969t1 = 0L;
            this.f5970u1 = 0;
        }
        j jVar = this.f5957g1;
        if (jVar != null) {
            ((n) jVar.f6000n.f6008f.f16037b).f();
        } else {
            this.f5952b1.f();
        }
    }

    @Override // E0.s, v0.AbstractC1810e
    public final void v(C1438m[] c1438mArr, long j, long j3, B b2) {
        super.v(c1438mArr, j, j3, b2);
        if (this.f5946D1 == -9223372036854775807L) {
            this.f5946D1 = j;
        }
        AbstractC1416M abstractC1416M = this.f21730r;
        if (abstractC1416M.p()) {
            this.f5947E1 = -9223372036854775807L;
            return;
        }
        b2.getClass();
        this.f5947E1 = abstractC1416M.g(b2.f3881a, new C1414K()).f18045d;
    }

    @Override // E0.s, v0.AbstractC1810e
    public final void x(long j, long j3) {
        super.x(j, j3);
        j jVar = this.f5957g1;
        if (jVar != null) {
            try {
                jVar.f(j, j3);
            } catch (v e10) {
                throw g(e10, e10.f6066a, false, 7001);
            }
        }
    }
}
