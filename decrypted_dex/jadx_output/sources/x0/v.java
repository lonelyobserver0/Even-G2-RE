package x0;

import M4.I;
import M4.Z;
import Z9.C0366a;
import a0.C0379a;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.stub.StubApp;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o0.AbstractC1405B;
import o0.C1408E;
import o0.C1428c;
import o0.C1429d;
import o0.C1437l;
import o0.C1438m;
import p0.C1484h;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import r0.C1555p;
import sa.C1608a;
import v0.C1798A;
import v0.C1803F;
import v0.C1811f;
import v0.C1812g;
import v0.J;
import v0.SurfaceHolderCallbackC1827w;
import v0.b0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class v extends E0.s implements J {
    public final Context W0;

    /* renamed from: X0, reason: collision with root package name */
    public final C1803F f22794X0;

    /* renamed from: Y0, reason: collision with root package name */
    public final s f22795Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public final Q2.g f22796Z0;
    public int a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f22797b1;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f22798c1;

    /* renamed from: d1, reason: collision with root package name */
    public C1438m f22799d1;

    /* renamed from: e1, reason: collision with root package name */
    public C1438m f22800e1;

    /* renamed from: f1, reason: collision with root package name */
    public long f22801f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f22802g1;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f22803h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f22804i1;

    /* renamed from: j1, reason: collision with root package name */
    public int f22805j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, E0.l lVar, Handler handler, SurfaceHolderCallbackC1827w surfaceHolderCallbackC1827w, s sVar) {
        super(1, lVar, 44100.0f);
        Q2.g gVar = AbstractC1560u.f20190a >= 35 ? new Q2.g(8, (byte) 0) : null;
        this.W0 = StubApp.getOrigApplicationContext(context.getApplicationContext());
        this.f22795Y0 = sVar;
        this.f22796Z0 = gVar;
        this.f22805j1 = -1000;
        this.f22794X0 = new C1803F(handler, surfaceHolderCallbackC1827w);
        sVar.f22783r = new C0379a(this, 27);
    }

    @Override // E0.s
    public final C1812g E(E0.p pVar, C1438m c1438m, C1438m c1438m2) {
        C1812g b2 = pVar.b(c1438m, c1438m2);
        boolean z2 = this.f1810H == null && s0(c1438m2);
        int i3 = b2.f21747e;
        if (z2) {
            i3 |= 32768;
        }
        if (y0(pVar, c1438m2) > this.a1) {
            i3 |= 64;
        }
        int i10 = i3;
        return new C1812g(pVar.f1777a, c1438m, c1438m2, i10 == 0 ? b2.f21746d : 0, i10);
    }

    @Override // E0.s
    public final float P(float f10, C1438m[] c1438mArr) {
        int i3 = -1;
        for (C1438m c1438m : c1438mArr) {
            int i10 = c1438m.f18194D;
            if (i10 != -1) {
                i3 = Math.max(i3, i10);
            }
        }
        if (i3 == -1) {
            return -1.0f;
        }
        return i3 * f10;
    }

    @Override // E0.s
    public final ArrayList Q(E0.k kVar, C1438m c1438m, boolean z2) {
        Z g10;
        if (c1438m.f18216n == null) {
            g10 = Z.f4578e;
        } else {
            if (this.f22795Y0.i(c1438m) != 0) {
                List e10 = E0.z.e(StubApp.getString2(76), false, false);
                E0.p pVar = e10.isEmpty() ? null : (E0.p) e10.get(0);
                if (pVar != null) {
                    g10 = I.q(pVar);
                }
            }
            g10 = E0.z.g(kVar, c1438m, z2, false);
        }
        HashMap hashMap = E0.z.f1863a;
        ArrayList arrayList = new ArrayList(g10);
        Collections.sort(arrayList, new E0.t(new C2.d(c1438m, 8)));
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0121, code lost:
    
        if (com.stub.StubApp.getString2(24138).equals(r5) == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0194  */
    @Override // E0.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final R8.C0250h R(E0.p r12, o0.C1438m r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.v.R(E0.p, o0.m, android.media.MediaCrypto, float):R8.h");
    }

    @Override // E0.s
    public final void S(u0.e eVar) {
        C1438m c1438m;
        m mVar;
        if (AbstractC1560u.f20190a < 29 || (c1438m = eVar.f21394c) == null || !Objects.equals(c1438m.f18216n, StubApp.getString2(1609)) || !this.f1797A0) {
            return;
        }
        ByteBuffer byteBuffer = eVar.f21399h;
        byteBuffer.getClass();
        C1438m c1438m2 = eVar.f21394c;
        c1438m2.getClass();
        if (byteBuffer.remaining() == 8) {
            int i3 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            s sVar = this.f22795Y0;
            AudioTrack audioTrack = sVar.f22787v;
            if (audioTrack == null || !s.p(audioTrack) || (mVar = sVar.f22785t) == null || !mVar.f22718k) {
                return;
            }
            sVar.f22787v.setOffloadDelayPadding(c1438m2.f18196F, i3);
        }
    }

    @Override // E0.s
    public final void X(Exception exc) {
        AbstractC1550k.l(StubApp.getString2(8320), StubApp.getString2(24142), exc);
        C1803F c1803f = this.f22794X0;
        Handler handler = (Handler) c1803f.f21581a;
        if (handler != null) {
            handler.post(new e(c1803f, exc, 3));
        }
    }

    @Override // E0.s
    public final void Y(long j, String str, long j3) {
        C1803F c1803f = this.f22794X0;
        Handler handler = (Handler) c1803f.f21581a;
        if (handler != null) {
            handler.post(new e(c1803f, str, j, j3));
        }
    }

    @Override // E0.s
    public final void Z(String str) {
        C1803F c1803f = this.f22794X0;
        Handler handler = (Handler) c1803f.f21581a;
        if (handler != null) {
            handler.post(new e(c1803f, str, 7));
        }
    }

    @Override // v0.J
    public final long a() {
        if (this.f21723h == 2) {
            z0();
        }
        return this.f22801f1;
    }

    @Override // E0.s
    public final C1812g a0(C1803F c1803f) {
        C1438m c1438m = (C1438m) c1803f.f21582b;
        c1438m.getClass();
        this.f22799d1 = c1438m;
        C1812g a02 = super.a0(c1803f);
        C1803F c1803f2 = this.f22794X0;
        Handler handler = (Handler) c1803f2.f21581a;
        if (handler != null) {
            handler.post(new e(c1803f2, c1438m, a02));
        }
        return a02;
    }

    @Override // v0.J
    public final void b(C1408E c1408e) {
        s sVar = this.f22795Y0;
        sVar.getClass();
        sVar.f22735C = new C1408E(AbstractC1560u.h(c1408e.f18026a, 0.1f, 8.0f), AbstractC1560u.h(c1408e.f18027b, 0.1f, 8.0f));
        if (sVar.x()) {
            sVar.v();
            return;
        }
        n nVar = new n(c1408e, -9223372036854775807L, -9223372036854775807L);
        if (sVar.o()) {
            sVar.f22733A = nVar;
        } else {
            sVar.f22734B = nVar;
        }
    }

    @Override // E0.s
    public final void b0(C1438m c1438m, MediaFormat mediaFormat) {
        int y10;
        int i3;
        C1438m c1438m2 = this.f22800e1;
        boolean z2 = true;
        int[] iArr = null;
        if (c1438m2 != null) {
            c1438m = c1438m2;
        } else if (this.f1826R != null) {
            mediaFormat.getClass();
            String str = c1438m.f18216n;
            String string2 = StubApp.getString2(76);
            if (string2.equals(str)) {
                y10 = c1438m.f18195E;
            } else {
                if (AbstractC1560u.f20190a >= 24) {
                    String string22 = StubApp.getString2(24140);
                    if (mediaFormat.containsKey(string22)) {
                        y10 = mediaFormat.getInteger(string22);
                    }
                }
                String string23 = StubApp.getString2(24143);
                y10 = mediaFormat.containsKey(string23) ? AbstractC1560u.y(mediaFormat.getInteger(string23)) : 2;
            }
            C1437l c1437l = new C1437l();
            c1437l.f18177m = AbstractC1405B.m(string2);
            c1437l.f18158D = y10;
            c1437l.f18159E = c1438m.f18196F;
            c1437l.f18160F = c1438m.f18197G;
            c1437l.f18175k = c1438m.f18214l;
            c1437l.f18166a = c1438m.f18204a;
            c1437l.f18167b = c1438m.f18205b;
            c1437l.f18168c = I.m(c1438m.f18206c);
            c1437l.f18169d = c1438m.f18207d;
            c1437l.f18170e = c1438m.f18208e;
            c1437l.f18171f = c1438m.f18209f;
            c1437l.f18156B = mediaFormat.getInteger(StubApp.getString2(23467));
            c1437l.f18157C = mediaFormat.getInteger(StubApp.getString2(23466));
            C1438m c1438m3 = new C1438m(c1437l);
            boolean z10 = this.f22797b1;
            int i10 = c1438m3.f18193C;
            if (z10 && i10 == 6 && (i3 = c1438m.f18193C) < 6) {
                iArr = new int[i3];
                for (int i11 = 0; i11 < i3; i11++) {
                    iArr[i11] = i11;
                }
            } else if (this.f22798c1) {
                if (i10 == 3) {
                    iArr = new int[]{0, 2, 1};
                } else if (i10 == 5) {
                    iArr = new int[]{0, 2, 1, 3, 4};
                } else if (i10 == 6) {
                    iArr = new int[]{0, 2, 1, 5, 3, 4};
                } else if (i10 == 7) {
                    iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                } else if (i10 == 8) {
                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                }
            }
            c1438m = c1438m3;
        }
        try {
            int i12 = AbstractC1560u.f20190a;
            s sVar = this.f22795Y0;
            if (i12 >= 29) {
                if (this.f1797A0) {
                    b0 b0Var = this.f21719d;
                    b0Var.getClass();
                    if (b0Var.f21701a != 0) {
                        b0 b0Var2 = this.f21719d;
                        b0Var2.getClass();
                        int i13 = b0Var2.f21701a;
                        sVar.getClass();
                        if (i12 < 29) {
                            z2 = false;
                        }
                        AbstractC1550k.g(z2);
                        sVar.j = i13;
                    }
                }
                sVar.getClass();
                if (i12 < 29) {
                    z2 = false;
                }
                AbstractC1550k.g(z2);
                sVar.j = 0;
            }
            sVar.d(c1438m, iArr);
        } catch (f e10) {
            throw g(e10, e10.f22655a, false, 5001);
        }
    }

    @Override // v0.J
    public final boolean c() {
        boolean z2 = this.f22804i1;
        this.f22804i1 = false;
        return z2;
    }

    @Override // E0.s
    public final void c0() {
        this.f22795Y0.getClass();
    }

    @Override // v0.AbstractC1810e, v0.Y
    public final void d(int i3, Object obj) {
        C0366a c0366a;
        Q2.g gVar;
        LoudnessCodecController create;
        boolean addMediaCodec;
        s sVar = this.f22795Y0;
        if (i3 == 2) {
            obj.getClass();
            float floatValue = ((Float) obj).floatValue();
            if (sVar.f22747O != floatValue) {
                sVar.f22747O = floatValue;
                if (sVar.o()) {
                    sVar.f22787v.setVolume(sVar.f22747O);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == 3) {
            C1428c c1428c = (C1428c) obj;
            c1428c.getClass();
            if (sVar.f22791z.equals(c1428c)) {
                return;
            }
            sVar.f22791z = c1428c;
            if (sVar.f22760a0) {
                return;
            }
            m6.l lVar = sVar.f22789x;
            if (lVar != null) {
                lVar.j = c1428c;
                lVar.a(b.c((Context) lVar.f17111c, c1428c, (C0366a) lVar.f17117i));
            }
            sVar.g();
            return;
        }
        if (i3 == 6) {
            C1429d c1429d = (C1429d) obj;
            c1429d.getClass();
            if (sVar.f22757Y.equals(c1429d)) {
                return;
            }
            if (sVar.f22787v != null) {
                sVar.f22757Y.getClass();
            }
            sVar.f22757Y = c1429d;
            return;
        }
        if (i3 == 12) {
            if (AbstractC1560u.f20190a >= 23) {
                AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                if (audioDeviceInfo == null) {
                    c0366a = null;
                } else {
                    sVar.getClass();
                    c0366a = new C0366a(audioDeviceInfo, 26);
                }
                sVar.f22758Z = c0366a;
                m6.l lVar2 = sVar.f22789x;
                if (lVar2 != null) {
                    lVar2.b(audioDeviceInfo);
                }
                AudioTrack audioTrack = sVar.f22787v;
                if (audioTrack != null) {
                    C0366a c0366a2 = sVar.f22758Z;
                    audioTrack.setPreferredDevice(c0366a2 != null ? (AudioDeviceInfo) c0366a2.f9105b : null);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == 16) {
            obj.getClass();
            this.f22805j1 = ((Integer) obj).intValue();
            E0.m mVar = this.f1826R;
            if (mVar != null && AbstractC1560u.f20190a >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt(StubApp.getString2(2644), Math.max(0, -this.f22805j1));
                mVar.b(bundle);
                return;
            }
            return;
        }
        if (i3 == 9) {
            obj.getClass();
            sVar.f22736D = ((Boolean) obj).booleanValue();
            n nVar = new n(sVar.x() ? C1408E.f18025d : sVar.f22735C, -9223372036854775807L, -9223372036854775807L);
            if (sVar.o()) {
                sVar.f22733A = nVar;
                return;
            } else {
                sVar.f22734B = nVar;
                return;
            }
        }
        if (i3 != 10) {
            if (i3 == 11) {
                this.f1812I = (C1798A) obj;
                return;
            }
            return;
        }
        obj.getClass();
        int intValue = ((Integer) obj).intValue();
        if (sVar.f22756X != intValue) {
            sVar.f22756X = intValue;
            sVar.f22755W = intValue != 0;
            sVar.g();
        }
        if (AbstractC1560u.f20190a < 35 || (gVar = this.f22796Z0) == null) {
            return;
        }
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) gVar.f5713d;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            gVar.f5713d = null;
        }
        create = LoudnessCodecController.create(intValue, Q4.a.f5730a, new E0.j(gVar));
        gVar.f5713d = create;
        Iterator it = ((HashSet) gVar.f5711b).iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    @Override // v0.J
    public final C1408E e() {
        return this.f22795Y0.f22735C;
    }

    @Override // E0.s
    public final void e0() {
        this.f22795Y0.f22744L = true;
    }

    @Override // v0.AbstractC1810e
    public final J i() {
        return this;
    }

    @Override // E0.s
    public final boolean i0(long j, long j3, E0.m mVar, ByteBuffer byteBuffer, int i3, int i10, int i11, long j10, boolean z2, boolean z10, C1438m c1438m) {
        int i12;
        int i13;
        byteBuffer.getClass();
        if (this.f22800e1 != null && (i10 & 2) != 0) {
            mVar.getClass();
            mVar.e(i3);
            return true;
        }
        s sVar = this.f22795Y0;
        if (z2) {
            if (mVar != null) {
                mVar.e(i3);
            }
            this.f1827R0.f21737f += i11;
            sVar.f22744L = true;
            return true;
        }
        try {
            if (!sVar.l(j10, byteBuffer, i11)) {
                return false;
            }
            if (mVar != null) {
                mVar.e(i3);
            }
            this.f1827R0.f21736e += i11;
            return true;
        } catch (g e10) {
            C1438m c1438m2 = this.f22799d1;
            if (this.f1797A0) {
                b0 b0Var = this.f21719d;
                b0Var.getClass();
                if (b0Var.f21701a != 0) {
                    i13 = 5004;
                    throw g(e10, c1438m2, e10.f22657b, i13);
                }
            }
            i13 = 5001;
            throw g(e10, c1438m2, e10.f22657b, i13);
        } catch (h e11) {
            if (this.f1797A0) {
                b0 b0Var2 = this.f21719d;
                b0Var2.getClass();
                if (b0Var2.f21701a != 0) {
                    i12 = 5003;
                    throw g(e11, c1438m, e11.f22659b, i12);
                }
            }
            i12 = 5002;
            throw g(e11, c1438m, e11.f22659b, i12);
        }
    }

    @Override // v0.AbstractC1810e
    public final String j() {
        return StubApp.getString2(8320);
    }

    @Override // v0.AbstractC1810e
    public final boolean l() {
        if (!this.f1820N0) {
            return false;
        }
        s sVar = this.f22795Y0;
        if (sVar.o()) {
            return sVar.f22751S && !sVar.m();
        }
        return true;
    }

    @Override // E0.s
    public final void l0() {
        try {
            s sVar = this.f22795Y0;
            if (!sVar.f22751S && sVar.o() && sVar.f()) {
                sVar.s();
                sVar.f22751S = true;
            }
        } catch (h e10) {
            throw g(e10, e10.f22660c, e10.f22659b, this.f1797A0 ? 5003 : 5002);
        }
    }

    @Override // E0.s, v0.AbstractC1810e
    public final boolean n() {
        return this.f22795Y0.m() || super.n();
    }

    @Override // E0.s, v0.AbstractC1810e
    public final void o() {
        C1803F c1803f = this.f22794X0;
        this.f22803h1 = true;
        this.f22799d1 = null;
        try {
            this.f22795Y0.g();
            try {
                super.o();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.o();
                throw th;
            } finally {
            }
        }
    }

    @Override // v0.AbstractC1810e
    public final void p(boolean z2, boolean z10) {
        C1811f c1811f = new C1811f();
        this.f1827R0 = c1811f;
        C1803F c1803f = this.f22794X0;
        Handler handler = (Handler) c1803f.f21581a;
        if (handler != null) {
            handler.post(new e(c1803f, c1811f, 0));
        }
        b0 b0Var = this.f21719d;
        b0Var.getClass();
        boolean z11 = b0Var.f21702b;
        s sVar = this.f22795Y0;
        if (z11) {
            AbstractC1550k.g(sVar.f22755W);
            if (!sVar.f22760a0) {
                sVar.f22760a0 = true;
                sVar.g();
            }
        } else if (sVar.f22760a0) {
            sVar.f22760a0 = false;
            sVar.g();
        }
        w0.j jVar = this.f21721f;
        jVar.getClass();
        sVar.f22782q = jVar;
        C1555p c1555p = this.f21722g;
        c1555p.getClass();
        sVar.f22771g.f22682I = c1555p;
    }

    @Override // E0.s, v0.AbstractC1810e
    public final void q(long j, boolean z2) {
        super.q(j, z2);
        this.f22795Y0.g();
        this.f22801f1 = j;
        this.f22804i1 = false;
        this.f22802g1 = true;
    }

    @Override // v0.AbstractC1810e
    public final void r() {
        Q2.g gVar;
        Q9.c cVar;
        m6.l lVar = this.f22795Y0.f22789x;
        if (lVar != null && lVar.f17110b) {
            lVar.f17116h = null;
            int i3 = AbstractC1560u.f20190a;
            Context context = (Context) lVar.f17111c;
            if (i3 >= 23 && (cVar = (Q9.c) lVar.f17113e) != null) {
                AudioManager audioManager = (AudioManager) context.getSystemService(StubApp.getString2(643));
                audioManager.getClass();
                audioManager.unregisterAudioDeviceCallback(cVar);
            }
            context.unregisterReceiver((R5.f) lVar.f17114f);
            c cVar2 = (c) lVar.f17115g;
            if (cVar2 != null) {
                cVar2.f22646a.unregisterContentObserver(cVar2);
            }
            lVar.f17110b = false;
        }
        if (AbstractC1560u.f20190a < 35 || (gVar = this.f22796Z0) == null) {
            return;
        }
        ((HashSet) gVar.f5711b).clear();
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) gVar.f5713d;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    @Override // v0.AbstractC1810e
    public final void s() {
        s sVar = this.f22795Y0;
        this.f22804i1 = false;
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
            if (this.f22803h1) {
                this.f22803h1 = false;
                sVar.u();
            }
        }
    }

    @Override // E0.s
    public final boolean s0(C1438m c1438m) {
        b0 b0Var = this.f21719d;
        b0Var.getClass();
        if (b0Var.f21701a != 0) {
            int x02 = x0(c1438m);
            if ((x02 & 512) != 0) {
                b0 b0Var2 = this.f21719d;
                b0Var2.getClass();
                if (b0Var2.f21701a == 2 || (x02 & 1024) != 0 || (c1438m.f18196F == 0 && c1438m.f18197G == 0)) {
                    return true;
                }
            }
        }
        return this.f22795Y0.i(c1438m) != 0;
    }

    @Override // v0.AbstractC1810e
    public final void t() {
        this.f22795Y0.r();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if ((r5.isEmpty() ? null : (E0.p) r5.get(0)) != null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010f  */
    @Override // E0.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t0(E0.k r17, o0.C1438m r18) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.v.t0(E0.k, o0.m):int");
    }

    @Override // v0.AbstractC1810e
    public final void u() {
        z0();
        s sVar = this.f22795Y0;
        sVar.f22754V = false;
        if (sVar.o()) {
            k kVar = sVar.f22771g;
            kVar.d();
            if (kVar.f22705x == -9223372036854775807L) {
                j jVar = kVar.f22687e;
                jVar.getClass();
                jVar.a();
            } else {
                kVar.f22707z = kVar.b();
                if (!s.p(sVar.f22787v)) {
                    return;
                }
            }
            sVar.f22787v.pause();
        }
    }

    public final int x0(C1438m c1438m) {
        d h2 = this.f22795Y0.h(c1438m);
        if (!h2.f22650a) {
            return 0;
        }
        int i3 = h2.f22651b ? 1536 : 512;
        return h2.f22652c ? i3 | 2048 : i3;
    }

    public final int y0(E0.p pVar, C1438m c1438m) {
        int i3;
        if (!StubApp.getString2(1692).equals(pVar.f1777a) || (i3 = AbstractC1560u.f20190a) >= 24 || (i3 == 23 && AbstractC1560u.I(this.W0))) {
            return c1438m.f18217o;
        }
        return -1;
    }

    public final void z0() {
        long j;
        ArrayDeque arrayDeque;
        long j3;
        boolean l9 = l();
        s sVar = this.f22795Y0;
        if (!sVar.o() || sVar.f22745M) {
            j = Long.MIN_VALUE;
        } else {
            long min = Math.min(sVar.f22771g.a(l9), AbstractC1560u.P(sVar.f22785t.f22713e, sVar.k()));
            while (true) {
                arrayDeque = sVar.f22773h;
                if (arrayDeque.isEmpty() || min < ((n) arrayDeque.getFirst()).f22722c) {
                    break;
                } else {
                    sVar.f22734B = (n) arrayDeque.remove();
                }
            }
            n nVar = sVar.f22734B;
            long j10 = min - nVar.f22722c;
            long w10 = AbstractC1560u.w(nVar.f22720a.f18026a, j10);
            boolean isEmpty = arrayDeque.isEmpty();
            C1608a c1608a = sVar.f22761b;
            if (isEmpty) {
                C1484h c1484h = (C1484h) c1608a.f20822c;
                if (c1484h.a()) {
                    if (c1484h.f19653o >= 1024) {
                        long j11 = c1484h.f19652n;
                        c1484h.j.getClass();
                        long j12 = j11 - ((r12.f19628k * r12.f19620b) * 2);
                        int i3 = c1484h.f19647h.f19607a;
                        int i10 = c1484h.f19646g.f19607a;
                        j10 = i3 == i10 ? AbstractC1560u.R(j10, j12, c1484h.f19653o, RoundingMode.DOWN) : AbstractC1560u.R(j10, j12 * i3, c1484h.f19653o * i10, RoundingMode.DOWN);
                    } else {
                        j10 = (long) (c1484h.f19642c * j10);
                    }
                }
                n nVar2 = sVar.f22734B;
                j3 = nVar2.f22721b + j10;
                nVar2.f22723d = j10 - w10;
            } else {
                n nVar3 = sVar.f22734B;
                j3 = nVar3.f22721b + w10 + nVar3.f22723d;
            }
            long j13 = ((x) c1608a.f20821b).f22818q;
            j = AbstractC1560u.P(sVar.f22785t.f22713e, j13) + j3;
            long j14 = sVar.f22772g0;
            if (j13 > j14) {
                long P10 = AbstractC1560u.P(sVar.f22785t.f22713e, j13 - j14);
                sVar.f22772g0 = j13;
                sVar.h0 += P10;
                if (sVar.f22775i0 == null) {
                    sVar.f22775i0 = new Handler(Looper.myLooper());
                }
                sVar.f22775i0.removeCallbacksAndMessages(null);
                sVar.f22775i0.postDelayed(new no.nordicsemi.android.ble.v(sVar, 7), 100L);
            }
        }
        if (j != Long.MIN_VALUE) {
            if (!this.f22802g1) {
                j = Math.max(this.f22801f1, j);
            }
            this.f22801f1 = j;
            this.f22802g1 = false;
        }
    }
}
