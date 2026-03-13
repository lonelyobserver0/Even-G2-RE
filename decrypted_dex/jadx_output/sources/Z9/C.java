package Z9;

import C.C0036m;
import H0.C0060c;
import H5.C0069b;
import H5.W;
import H5.e0;
import H5.g0;
import L0.Y;
import M4.Z;
import R8.C0250h;
import Tb.InterfaceC0327h;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.lifecycle.EnumC0439n;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import fa.AbstractC0936b;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;
import o0.C1406C;
import o0.C1425W;
import org.bouncycastle.asn1.eac.CertificateBody;
import p0.AbstractC1482f;
import q4.InterfaceC1521b;
import r0.AbstractC1550k;
import r0.AbstractC1560u;
import vb.EnumC1846c;
import vb.InterfaceC1845b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C implements C0.p, D3.b, InterfaceC1845b, E0.l, T0.q, InterfaceC0327h, K5.b, InterfaceC1521b, q4.d {

    /* renamed from: d, reason: collision with root package name */
    public static int f9075d;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9076a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9077b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9078c;

    public /* synthetic */ C(int i3, Object obj, Object obj2) {
        this.f9076a = i3;
        this.f9077b = obj;
        this.f9078c = obj2;
    }

    public static int[] A(C0369d c0369d) {
        int g10 = c0369d.g();
        if (g10 == 0) {
            return null;
        }
        int h2 = c0369d.h();
        int[] iArr = new int[g10 + 1];
        for (int i3 = 0; i3 <= g10; i3++) {
            int i10 = 0;
            for (int i11 = 0; i11 < h2; i11++) {
                i10 = (i10 << 8) | c0369d.f();
            }
            if (i10 > c0369d.f8408a.length) {
                throw new IOException(Xa.h.g(i10, StubApp.getString2(7677), StubApp.getString2(7678)));
            }
            iArr[i3] = i10;
        }
        return iArr;
    }

    public static Integer B(C0369d c0369d, int i3) {
        if (i3 == 28) {
            return Integer.valueOf((short) c0369d.g());
        }
        if (i3 == 29) {
            return Integer.valueOf(c0369d.e());
        }
        if (i3 >= 32 && i3 <= 246) {
            return Integer.valueOf(i3 - 139);
        }
        if (i3 >= 247 && i3 <= 250) {
            return Integer.valueOf(((i3 - 247) * 256) + c0369d.f() + 108);
        }
        if (i3 < 251 || i3 > 254) {
            throw new IllegalArgumentException();
        }
        return Integer.valueOf((((-(i3 - 251)) * 256) - c0369d.f()) - 108);
    }

    public static LinkedHashMap C(q qVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(17);
        String string2 = StubApp.getString2(6535);
        linkedHashMap.put(string2, qVar.v(string2));
        String string22 = StubApp.getString2(6536);
        linkedHashMap.put(string22, qVar.v(string22));
        String string23 = StubApp.getString2(6537);
        linkedHashMap.put(string23, qVar.v(string23));
        String string24 = StubApp.getString2(6538);
        linkedHashMap.put(string24, qVar.v(string24));
        Double valueOf = Double.valueOf(0.039625d);
        String string25 = StubApp.getString2(6539);
        linkedHashMap.put(string25, qVar.y(string25, valueOf));
        String string26 = StubApp.getString2(6540);
        linkedHashMap.put(string26, qVar.y(string26, 7));
        String string27 = StubApp.getString2(6541);
        linkedHashMap.put(string27, qVar.y(string27, 1));
        String string28 = StubApp.getString2(6542);
        linkedHashMap.put(string28, qVar.y(string28, null));
        String string29 = StubApp.getString2(6543);
        linkedHashMap.put(string29, qVar.y(string29, null));
        String string210 = StubApp.getString2(6544);
        linkedHashMap.put(string210, qVar.v(string210));
        String string211 = StubApp.getString2(6545);
        linkedHashMap.put(string211, qVar.v(string211));
        String string212 = StubApp.getString2(6546);
        linkedHashMap.put(string212, qVar.n(string212));
        String string213 = StubApp.getString2(6548);
        linkedHashMap.put(string213, qVar.y(string213, 0));
        Double valueOf2 = Double.valueOf(0.06d);
        String string214 = StubApp.getString2(7679);
        linkedHashMap.put(string214, qVar.y(string214, valueOf2));
        String string215 = StubApp.getString2(7680);
        linkedHashMap.put(string215, qVar.y(string215, 0));
        String string216 = StubApp.getString2(7681);
        linkedHashMap.put(string216, qVar.y(string216, 0));
        String string217 = StubApp.getString2(7682);
        linkedHashMap.put(string217, qVar.y(string217, 0));
        return linkedHashMap;
    }

    public static String[] F(C0369d c0369d) {
        int[] A4 = A(c0369d);
        if (A4 == null) {
            return null;
        }
        int length = A4.length - 1;
        String[] strArr = new String[length];
        int i3 = 0;
        while (i3 < length) {
            int i10 = i3 + 1;
            int i11 = A4[i10] - A4[i3];
            if (i11 < 0) {
                StringBuilder l9 = AbstractC1482f.l(i11, StubApp.getString2(7683), i3, StubApp.getString2(7684), StubApp.getString2(7685));
                l9.append(i10);
                String string2 = StubApp.getString2(7686);
                l9.append(string2);
                l9.append(A4[i10]);
                l9.append(StubApp.getString2(7687));
                l9.append(i3);
                l9.append(string2);
                l9.append(A4[i3]);
                throw new IOException(l9.toString());
            }
            strArr[i3] = new String(c0369d.d(i11), AbstractC0936b.f14188a);
            i3 = i10;
        }
        return strArr;
    }

    public static C c(byte[] bArr) {
        byte[] bArr2;
        Fb.b bVar;
        if (bArr.length < 32) {
            throw new Db.c(StubApp.getString2(7691));
        }
        int c10 = Y3.a.c(0, 1, bArr, 4);
        if (c10 != -1762412483 && c10 != -1762412484) {
            throw new Db.c(String.format(StubApp.getString2(7688), Integer.valueOf(c10), -1762412483, -1762412484));
        }
        Y3.a.c(4, 1, bArr, 4);
        short c11 = (short) Y3.a.c(8, 1, bArr, 2);
        int c12 = Y3.a.c(12, 1, bArr, 4);
        Y3.a.c(16, 1, bArr, 4);
        if (bArr.length - 20 < 8) {
            throw new Db.c(StubApp.getString2(7690));
        }
        byte b2 = bArr[20];
        byte b10 = bArr[21];
        Y3.a.c(22, 1, bArr, 2);
        Y3.a.c(24, 1, bArr, 4);
        int i3 = c11 + c12;
        Fb.a c13 = Fb.a.c(i3, bArr, c10 == -1762412484);
        if (!c13.f2345a && (bVar = (Fb.b) c13.f2347c) != null && bVar.f2349a == 26888) {
            c13 = Fb.a.c(i3 + c13.f2346b, bArr, c10 == -1762412484);
        }
        for (Fb.c cVar : (ArrayList) c13.f2348d) {
            boolean z2 = c13.f2345a;
            if ((z2 && cVar.f2351a == 1) || (!z2 && cVar.f2351a == 16)) {
                bArr2 = cVar.f2352b;
                break;
            }
        }
        bArr2 = null;
        if (bArr2 != null) {
            return new C(9, bArr2, bArr);
        }
        throw new Db.c(StubApp.getString2(7689));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x013a, code lost:
    
        throw new java.io.IOException(i2.u.p(r1, com.stub.StubApp.getString2(7696)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Z9.p y(Z9.C0369d r12) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z9.C.y(Z9.d):Z9.p");
    }

    public static byte[][] z(C0369d c0369d) {
        int[] A4 = A(c0369d);
        if (A4 == null) {
            return null;
        }
        int length = A4.length - 1;
        byte[][] bArr = new byte[length][];
        int i3 = 0;
        while (i3 < length) {
            int i10 = i3 + 1;
            bArr[i3] = c0369d.d(A4[i10] - A4[i3]);
            i3 = i10;
        }
        return bArr;
    }

    @Override // T0.q
    public void D(T0.B b2) {
    }

    public String E(int i3) {
        int i10;
        if (i3 < 0) {
            throw new IOException(StubApp.getString2(7698));
        }
        if (i3 <= 390) {
            return E.f9080a[i3];
        }
        String[] strArr = (String[]) this.f9077b;
        return (strArr == null || (i10 = i3 + (-391)) >= strArr.length) ? i2.u.p(i3, StubApp.getString2(7697)) : strArr[i10];
    }

    public void G(C0369d c0369d, o oVar) {
        oVar.f9138c = new n[c0369d.f()];
        for (int i3 = 0; i3 < oVar.f9138c.length; i3++) {
            n nVar = new n(0);
            nVar.f9136b = c0369d.f();
            int g10 = c0369d.g();
            nVar.f9137c = g10;
            E(g10);
            oVar.f9138c[i3] = nVar;
            oVar.c(nVar.f9136b, E(nVar.f9137c));
        }
    }

    public T0.H H(int i3) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.f9077b;
            if (i10 >= iArr.length) {
                AbstractC1550k.k(StubApp.getString2(7700), StubApp.getString2(7699) + i3);
                return new T0.n();
            }
            if (i3 == iArr[i10]) {
                return ((Y[]) this.f9078c)[i10];
            }
            i10++;
        }
    }

    public void I(C2.c cVar, boolean z2) {
        PendingIntent pendingIntent;
        C2.a aVar = (C2.a) cVar.f1054g;
        String str = aVar.f1045a;
        Context context = (Context) this.f9077b;
        int identifier = context.getResources().getIdentifier(str, aVar.f1046b, context.getPackageName());
        if (identifier == 0) {
            context.getResources().getIdentifier(StubApp.getString2(7701), StubApp.getString2(5103), context.getPackageName());
        }
        C0036m c0036m = (C0036m) this.f9078c;
        c0036m.getClass();
        c0036m.f864e = C0036m.c((String) cVar.f1051d);
        c0036m.f857I.icon = identifier;
        c0036m.f865f = C0036m.c((String) cVar.f1052e);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setPackage(null);
            launchIntentForPackage.setFlags(270532608);
            pendingIntent = PendingIntent.getActivity(context, 0, launchIntentForPackage, 201326592);
        } else {
            pendingIntent = null;
        }
        c0036m.f866g = pendingIntent;
        c0036m.d(2, cVar.f1050c);
        this.f9078c = c0036m;
        Integer num = (Integer) cVar.f1055h;
        if (num != null) {
            c0036m.f884z = num.intValue();
            this.f9078c = c0036m;
        }
        if (z2) {
            new C.J(context).c(null, 75415, ((C0036m) this.f9078c).b());
        }
    }

    public void J(C1425W c1425w) {
        Handler handler = (Handler) this.f9077b;
        if (handler != null) {
            handler.post(new Ab.b(13, this, c1425w));
        }
    }

    public void a(Object obj, String str) {
        ((ArrayList) this.f9077b).add(AbstractC1482f.h(str, StubApp.getString2(2359), String.valueOf(obj)));
    }

    @Override // E0.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public E0.d l(C0250h c0250h) {
        MediaCodec mediaCodec;
        String string2 = StubApp.getString2(1656);
        String str = ((E0.p) c0250h.f6296a).f1777a;
        E0.d dVar = null;
        try {
            Trace.beginSection(string2 + str);
            mediaCodec = MediaCodec.createByCodecName(str);
            try {
                E0.d dVar2 = new E0.d(mediaCodec, (HandlerThread) ((E0.c) this.f9077b).get(), new E0.g(mediaCodec, (HandlerThread) ((E0.c) this.f9078c).get()), (Q2.g) c0250h.f6301f);
                try {
                    Trace.endSection();
                    Surface surface = (Surface) c0250h.f6299d;
                    E0.d.u(dVar2, (MediaFormat) c0250h.f6297b, surface, (MediaCrypto) c0250h.f6300e, (surface == null && ((E0.p) c0250h.f6296a).f1784h && AbstractC1560u.f20190a >= 35) ? 8 : 0);
                    return dVar2;
                } catch (Exception e10) {
                    e = e10;
                    dVar = dVar2;
                    if (dVar != null) {
                        dVar.release();
                    } else if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
            mediaCodec = null;
        }
    }

    public T0.o d(Object... objArr) {
        Constructor d8;
        synchronized (((AtomicBoolean) this.f9078c)) {
            if (!((AtomicBoolean) this.f9078c).get()) {
                try {
                    d8 = ((R4.i) this.f9077b).d();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f9078c).set(true);
                } catch (Exception e10) {
                    throw new RuntimeException(StubApp.getString2("7702"), e10);
                }
            }
            d8 = null;
        }
        if (d8 == null) {
            return null;
        }
        try {
            return (T0.o) d8.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException(StubApp.getString2(7703), e11);
        }
    }

    @Override // q4.InterfaceC1521b
    public Object e(q4.j jVar) {
        Bundle bundle;
        P3.b bVar = (P3.b) this.f9077b;
        bVar.getClass();
        return (jVar.isSuccessful() && (bundle = (Bundle) jVar.getResult()) != null && bundle.containsKey(StubApp.getString2(4854))) ? bVar.a((Bundle) this.f9078c).onSuccessTask(P3.h.f5506c, P3.d.f5501d) : jVar;
    }

    public String f(q qVar, String str) {
        p w10 = qVar.w(str);
        if (w10 == null || !w10.b()) {
            return null;
        }
        return E(w10.a(0).intValue());
    }

    public void g(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Qb.L.j((Vb.f) this.f9077b, null, new A9.n(this, block, null), 3);
    }

    @Override // Pb.a
    public Object get() {
        switch (this.f9076a) {
            case 5:
                return new C3.e((Context) ((F5.c) this.f9077b).f2238b, (C3.d) ((A0.c) this.f9078c).get());
            case 13:
                return new W((e0) ((Pb.a) this.f9077b).get(), (g0) ((Pb.a) this.f9078c).get());
            case 14:
                return new I3.h(new I4.e(11), new C2.i(), I3.a.f3104f, (I3.j) ((s2.d) this.f9077b).get(), (Pb.a) this.f9078c);
            default:
                return new L5.g((C0069b) ((Pb.a) this.f9077b).get(), (CoroutineContext) ((K5.c) this.f9078c).f3721a);
        }
    }

    public void h(E0 e02) {
        H0.D d8 = H0.D.f2482c;
        String str = (String) ((H0.G) e02.f16038c).f2500a.get(StubApp.getString2(7704));
        H0.o oVar = (H0.o) this.f9078c;
        if (str != null) {
            try {
                d8 = H0.D.a(str);
            } catch (C1406C e10) {
                oVar.f2595a.q(StubApp.getString2(7705), e10);
                return;
            }
        }
        Uri uri = oVar.f2602h;
        M4.r.d(4, StubApp.getString2(2352));
        Object[] objArr = new Object[4];
        int i3 = 0;
        int i10 = 0;
        while (true) {
            Z z2 = ((H0.G) e02.f16038c).f2501b;
            if (i3 < z2.f4580d) {
                C0060c c0060c = (C0060c) z2.get(i3);
                String z10 = AbstractC0624h2.z(c0060c.j.f2531b);
                z10.getClass();
                char c10 = 65535;
                switch (z10.hashCode()) {
                    case -1922091719:
                        if (z10.equals(StubApp.getString2(2445))) {
                            c10 = 0;
                            break;
                        }
                        break;
                    case 2412:
                        if (z10.equals(StubApp.getString2(2431))) {
                            c10 = 1;
                            break;
                        }
                        break;
                    case 64593:
                        if (z10.equals(StubApp.getString2(2444))) {
                            c10 = 2;
                            break;
                        }
                        break;
                    case 64934:
                        if (z10.equals(StubApp.getString2(2443))) {
                            c10 = 3;
                            break;
                        }
                        break;
                    case 74609:
                        if (z10.equals(StubApp.getString2(2387))) {
                            c10 = 4;
                            break;
                        }
                        break;
                    case 85182:
                        if (z10.equals(StubApp.getString2(2442))) {
                            c10 = 5;
                            break;
                        }
                        break;
                    case 85183:
                        if (z10.equals(StubApp.getString2(2441))) {
                            c10 = 6;
                            break;
                        }
                        break;
                    case 2194728:
                        if (z10.equals(StubApp.getString2(2440))) {
                            c10 = 7;
                            break;
                        }
                        break;
                    case 2194729:
                        if (z10.equals(StubApp.getString2(2439))) {
                            c10 = '\b';
                            break;
                        }
                        break;
                    case 2433087:
                        if (z10.equals(StubApp.getString2(2438))) {
                            c10 = '\t';
                            break;
                        }
                        break;
                    case 2450119:
                        if (z10.equals(StubApp.getString2(2389))) {
                            c10 = '\n';
                            break;
                        }
                        break;
                    case 2450139:
                        if (z10.equals(StubApp.getString2(2390))) {
                            c10 = 11;
                            break;
                        }
                        break;
                    case 1061166827:
                        if (z10.equals(StubApp.getString2(2394))) {
                            c10 = '\f';
                            break;
                        }
                        break;
                    case 1934494802:
                        if (z10.equals(StubApp.getString2(2437))) {
                            c10 = '\r';
                            break;
                        }
                        break;
                    case 1959269366:
                        if (z10.equals(StubApp.getString2(2436))) {
                            c10 = 14;
                            break;
                        }
                        break;
                    case 2137188397:
                        if (z10.equals(StubApp.getString2(2435))) {
                            c10 = 15;
                            break;
                        }
                        break;
                    case 2137209252:
                        if (z10.equals(StubApp.getString2(2434))) {
                            c10 = 16;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                        H0.x xVar = new H0.x((H0.p) e02.f16037b, c0060c, uri);
                        int i11 = i10 + 1;
                        int f10 = M4.C.f(objArr.length, i11);
                        if (f10 > objArr.length) {
                            objArr = Arrays.copyOf(objArr, f10);
                        }
                        objArr[i10] = xVar;
                        i10 = i11;
                        break;
                }
                i3++;
            } else {
                Z j = M4.I.j(i10, objArr);
                boolean isEmpty = j.isEmpty();
                A0.c cVar = oVar.f2595a;
                if (isEmpty) {
                    cVar.q(StubApp.getString2(7706), null);
                    return;
                }
                cVar.getClass();
                int i12 = 0;
                while (true) {
                    int i13 = j.f4580d;
                    H0.t tVar = (H0.t) cVar.f29a;
                    if (i12 >= i13) {
                        q qVar = tVar.f2632g;
                        long j3 = d8.f2484a;
                        long j10 = d8.f2485b;
                        long J10 = AbstractC1560u.J(j10 - j3);
                        H0.w wVar = (H0.w) qVar.f9143b;
                        wVar.f2651m = J10;
                        wVar.f2652n = !(j10 == -9223372036854775807L);
                        wVar.f2653p = j10 == -9223372036854775807L;
                        wVar.f2654q = false;
                        wVar.w();
                        oVar.f2609r = true;
                        return;
                    }
                    H0.s sVar = new H0.s(tVar, (H0.x) j.get(i12), i12, tVar.f2633h);
                    tVar.f2630e.add(sVar);
                    sVar.f2621b.f(sVar.f2620a.f2617b, tVar.f2628c, 0);
                    i12++;
                }
            }
        }
    }

    @Override // vb.InterfaceC1845b
    public void i(Db.c cVar) {
        ((Mb.a) this.f9077b).i((Cb.h) this.f9078c, cVar);
    }

    @Override // q4.d
    public void j(q4.j jVar) {
        ((Map) ((E0) this.f9078c).f16038c).remove((q4.k) this.f9077b);
    }

    @Override // C0.p
    public P0.q k(C0.l lVar, C0.i iVar) {
        ((C2.i) this.f9077b).getClass();
        return new E0(8, new C0.o(lVar, iVar), (List) this.f9078c);
    }

    @Override // vb.InterfaceC1845b
    public void m(Hb.b bVar) {
        Ib.b bVar2 = (Ib.b) bVar;
        boolean b2 = bVar2.b();
        Cb.h hVar = (Cb.h) this.f9078c;
        if (b2) {
            hVar.f1170a = SystemClock.elapsedRealtime();
            Cb.h.f1169c.f();
        } else {
            ((Mb.a) this.f9077b).i(hVar, new Db.b(EnumC1846c.a(bVar2.f3016rc)));
        }
    }

    public void n(String str, String str2) {
        R8.j jVar = (R8.j) this.f9078c;
        if (Intrinsics.areEqual(jVar != null ? jVar.f6303a : null, str)) {
            return;
        }
        R8.j jVar2 = str != null ? new R8.j(str, str2) : null;
        this.f9078c = jVar2;
        if (jVar2 != null) {
            Iterator it = ((CopyOnWriteArraySet) this.f9077b).iterator();
            if (it.hasNext()) {
                throw com.mapbox.common.b.e(it);
            }
        }
    }

    @Override // C0.p
    public P0.q o() {
        return new E0(8, ((C2.i) this.f9077b).o(), (List) this.f9078c);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Type inference failed for: r2v11, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // Tb.InterfaceC0327h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(Tb.InterfaceC0328i r7, kotlin.coroutines.Continuation r8) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z9.C.p(Tb.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // T0.q
    public void q() {
        H0.t tVar = (H0.t) this.f9078c;
        tVar.f2627b.post(new H0.q(tVar, 0));
    }

    public void r() {
        H0.o oVar = (H0.o) this.f9078c;
        AbstractC1550k.g(oVar.f2608q == 2);
        oVar.f2608q = 1;
        oVar.f2611t = false;
        long j = oVar.f2612v;
        if (j != -9223372036854775807L) {
            oVar.k(AbstractC1560u.V(j));
        }
    }

    public void t(K.g gVar) {
        int i3 = gVar.f3557b;
        Ab.e eVar = (Ab.e) this.f9078c;
        F5.c cVar = (F5.c) this.f9077b;
        if (i3 != 0) {
            eVar.execute(new K.a(i3, 0, cVar));
        } else {
            eVar.execute(new Q4.b(1, cVar, gVar.f3556a));
        }
    }

    public String toString() {
        switch (this.f9076a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C.class.getSimpleName());
                sb2.append(StubApp.getString2(1557));
                return AbstractC1482f.k(sb2, (String) this.f9078c, StubApp.getString2(511));
            case 24:
                StringBuilder sb3 = new StringBuilder(100);
                sb3.append(this.f9078c.getClass().getSimpleName());
                sb3.append('{');
                ArrayList arrayList = (ArrayList) this.f9077b;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    sb3.append((String) arrayList.get(i3));
                    if (i3 < size - 1) {
                        sb3.append(StubApp.getString2(81));
                    }
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [Z9.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v59, types: [Z9.c, Z9.w] */
    /* JADX WARN: Type inference failed for: r1v60 */
    /* JADX WARN: Type inference failed for: r1v63, types: [Z9.c, Z9.y] */
    /* JADX WARN: Type inference failed for: r27v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v50, types: [Z9.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v51, types: [Z9.E] */
    /* JADX WARN: Type inference failed for: r2v65, types: [Z9.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r47v0, types: [Z9.C] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean] */
    public ArrayList u(byte[] bArr, m mVar) {
        int i3;
        int i10;
        C0367b c0367b;
        String[] strArr;
        byte[][] bArr2;
        byte[][] bArr3;
        String str;
        ArrayList arrayList;
        int i11;
        AbstractC0368c abstractC0368c;
        AbstractC0370e abstractC0370e;
        LinkedHashMap linkedHashMap;
        int i12;
        byte[][] bArr4;
        ?? vVar;
        int i13;
        int i14;
        int i15;
        ?? wVar;
        byte[][] bArr5;
        String str2;
        ArrayList arrayList2;
        int i16 = 3;
        int i17 = 4;
        int i18 = 0;
        int i19 = 1;
        C0369d c0369d = new C0369d(bArr);
        String str3 = new String(c0369d.d(4), AbstractC0936b.f14188a);
        if (StubApp.getString2(7707).equals(str3)) {
            short g10 = (short) c0369d.g();
            c0369d.g();
            c0369d.g();
            c0369d.g();
            for (int i20 = 0; i20 < g10; i20++) {
                String str4 = new String(c0369d.d(4), AbstractC0936b.f14188a);
                c0369d.g();
                c0369d.g();
                long g11 = (c0369d.g() << 16) | c0369d.g();
                i3 = 5;
                long g12 = (c0369d.g() << 16) | c0369d.g();
                if (StubApp.getString2(7708).equals(str4)) {
                    c0369d = new C0369d(Arrays.copyOfRange(bArr, (int) g11, (int) (g11 + g12)));
                }
            }
            throw new IOException(StubApp.getString2(7709));
        }
        i3 = 5;
        if (StubApp.getString2(7710).equals(str3)) {
            throw new IOException(StubApp.getString2(7734));
        }
        if (StubApp.getString2(7711).equals(str3)) {
            throw new IOException(StubApp.getString2(7733));
        }
        c0369d.f8409b = 0;
        c0369d.f();
        c0369d.f();
        c0369d.f();
        c0369d.h();
        String[] F3 = F(c0369d);
        if (F3 == null) {
            throw new IOException(StubApp.getString2(7732));
        }
        byte[][] z2 = z(c0369d);
        this.f9077b = F(c0369d);
        byte[][] z10 = z(c0369d);
        ArrayList arrayList3 = new ArrayList(F3.length);
        int i21 = 0;
        while (i21 < F3.length) {
            String str5 = F3[i21];
            C0369d c0369d2 = new C0369d(z2[i21]);
            q qVar = new q(i18);
            while (true) {
                i10 = i17;
                if (c0369d2.f8409b >= c0369d2.f8408a.length) {
                    break;
                }
                p y10 = y(c0369d2);
                C0377l c0377l = y10.f9140b;
                if (c0377l != null) {
                    ((HashMap) qVar.f9143b).put(c0377l.f9134b, y10);
                }
                i17 = i10;
            }
            if (qVar.w(StubApp.getString2(7712)) != null) {
                throw new IOException(StubApp.getString2(7731));
            }
            String string2 = StubApp.getString2(7713);
            ?? r62 = qVar.w(string2) != null ? i19 : i18;
            if (r62 != 0) {
                C0367b c0367b2 = new C0367b();
                p w10 = qVar.w(string2);
                if (w10 == null || w10.f9139a.size() < i16) {
                    throw new IOException(StubApp.getString2(7714));
                }
                c0367b2.f9106f = E(w10.a(i18).intValue());
                c0367b2.f9107g = E(w10.a(i19).intValue());
                c0367b2.f9108h = w10.a(2).intValue();
                c0367b = c0367b2;
            } else {
                c0367b = new F();
            }
            this.f9078c = str5;
            c0367b.f9123a = str5;
            String string22 = StubApp.getString2(2155);
            c0367b.c(f(qVar, string22), string22);
            String string23 = StubApp.getString2(6571);
            c0367b.c(f(qVar, string23), string23);
            String string24 = StubApp.getString2(7715);
            c0367b.c(f(qVar, string24), string24);
            String string25 = StubApp.getString2(6572);
            c0367b.c(f(qVar, string25), string25);
            String string26 = StubApp.getString2(6573);
            c0367b.c(f(qVar, string26), string26);
            String string27 = StubApp.getString2(6574);
            c0367b.c(f(qVar, string27), string27);
            String string28 = StubApp.getString2(6576);
            c0367b.c(qVar.n(string28), string28);
            Integer valueOf = Integer.valueOf(i18);
            String string29 = StubApp.getString2(6575);
            c0367b.c(qVar.y(string29, valueOf), string29);
            String string210 = StubApp.getString2(6577);
            c0367b.c(qVar.y(string210, -100), string210);
            String string211 = StubApp.getString2(6578);
            c0367b.c(qVar.y(string211, 50), string211);
            Integer valueOf2 = Integer.valueOf(i18);
            String string212 = StubApp.getString2(6564);
            c0367b.c(qVar.y(string212, valueOf2), string212);
            String string213 = StubApp.getString2(7716);
            c0367b.c(qVar.y(string213, 2), string213);
            Double valueOf3 = Double.valueOf(0.001d);
            Double valueOf4 = Double.valueOf(0.0d);
            Double valueOf5 = Double.valueOf(0.0d);
            Double valueOf6 = Double.valueOf(0.001d);
            Double valueOf7 = Double.valueOf(0.0d);
            Double valueOf8 = Double.valueOf(0.0d);
            int i22 = i16;
            ?? r27 = i19;
            Number[] numberArr = new Number[6];
            numberArr[i18] = valueOf3;
            numberArr[r27 == true ? 1 : 0] = valueOf4;
            numberArr[2] = valueOf5;
            numberArr[i22] = valueOf6;
            numberArr[i10] = valueOf7;
            numberArr[i3] = valueOf8;
            List asList = Arrays.asList(numberArr);
            String string214 = StubApp.getString2(6566);
            c0367b.c(qVar.l(string214, asList), string214);
            String string215 = StubApp.getString2(6568);
            c0367b.c(qVar.y(string215, null), string215);
            Integer valueOf9 = Integer.valueOf(i18);
            Integer valueOf10 = Integer.valueOf(i18);
            Integer valueOf11 = Integer.valueOf(i18);
            Integer valueOf12 = Integer.valueOf(i18);
            int i23 = i18;
            Number[] numberArr2 = new Number[i10];
            numberArr2[i23] = valueOf9;
            numberArr2[r27 == true ? 1 : 0] = valueOf10;
            numberArr2[2] = valueOf11;
            numberArr2[i22] = valueOf12;
            List asList2 = Arrays.asList(numberArr2);
            String string216 = StubApp.getString2(6567);
            c0367b.c(qVar.l(string216, asList2), string216);
            Integer valueOf13 = Integer.valueOf(i23);
            String string217 = StubApp.getString2(6569);
            c0367b.c(qVar.y(string217, valueOf13), string217);
            String string218 = StubApp.getString2(7717);
            c0367b.c(qVar.l(string218, null), string218);
            p w11 = qVar.w(StubApp.getString2(6549));
            if (w11 == null || !w11.b()) {
                throw new IOException(StubApp.getString2(7730));
            }
            c0369d.f8409b = w11.a(i23).intValue();
            byte[][] z11 = z(c0369d);
            if (z11 == null) {
                throw new IOException(StubApp.getString2(7729));
            }
            p w12 = qVar.w(StubApp.getString2(7718));
            String string219 = StubApp.getString2(7719);
            if (w12 == null || !w12.b()) {
                strArr = F3;
                bArr2 = z2;
                bArr3 = z10;
                str = string214;
                arrayList = arrayList3;
                i11 = i21;
                if (r62 != 0) {
                    int length = z11.length;
                    abstractC0368c = new s(r27);
                    abstractC0368c.a(0, 0);
                    for (int i24 = r27 == true ? 1 : 0; i24 <= length; i24 += r27 == true ? 1 : 0) {
                        abstractC0368c.a(i24, i24);
                    }
                } else {
                    abstractC0368c = C0375j.f9129h;
                }
            } else {
                int intValue = w12.a(0).intValue();
                if (r62 == 0 && intValue == 0) {
                    abstractC0368c = C0375j.f9129h;
                    strArr = F3;
                    bArr2 = z2;
                    bArr3 = z10;
                    str = string214;
                    arrayList = arrayList3;
                    i11 = i21;
                } else {
                    if (r62 == 0 && intValue == r27) {
                        abstractC0368c = C0371f.f9119h;
                    } else if (r62 == 0 && intValue == 2) {
                        abstractC0368c = C0373h.f9122h;
                    } else {
                        c0369d.f8409b = intValue;
                        int length2 = z11.length;
                        int f10 = c0369d.f();
                        if (f10 != 0) {
                            strArr = F3;
                            if (f10 == 1) {
                                bArr2 = z2;
                                bArr3 = z10;
                                str = string214;
                                arrayList = arrayList3;
                                i11 = i21;
                                wVar = new w(r62);
                                wVar.f9148g = f10;
                                if (r62 != 0) {
                                    wVar.a(0, 0);
                                    wVar.f9149h = new ArrayList();
                                } else {
                                    wVar.b(0, 0, string219);
                                }
                                int i25 = 1;
                                while (i25 < length2) {
                                    int g13 = c0369d.g();
                                    int f11 = c0369d.f();
                                    if (r62 == 0) {
                                        for (int i26 = 0; i26 < f11 + 1; i26++) {
                                            int i27 = g13 + i26;
                                            wVar.b(i25 + i26, i27, E(i27));
                                        }
                                    } else {
                                        wVar.f9149h.add(new B(i25, g13, f11));
                                    }
                                    i25 = i25 + f11 + 1;
                                }
                            } else {
                                if (f10 != 2) {
                                    throw new IOException(i2.u.p(f10, StubApp.getString2(7720)));
                                }
                                wVar = new y(r62);
                                wVar.f9152g = f10;
                                if (r62 != 0) {
                                    wVar.a(0, 0);
                                    wVar.f9153h = new ArrayList();
                                } else {
                                    wVar.b(0, 0, string219);
                                }
                                int i28 = 1;
                                while (i28 < length2) {
                                    byte[][] bArr6 = z2;
                                    int g14 = c0369d.g();
                                    int i29 = i21;
                                    int g15 = c0369d.g();
                                    if (r62 == 0) {
                                        bArr5 = z10;
                                        arrayList2 = arrayList3;
                                        int i30 = 0;
                                        while (i30 < g15 + 1) {
                                            int i31 = g14 + i30;
                                            int i32 = i30;
                                            wVar.b(i28 + i32, i31, E(i31));
                                            i30 = i32 + 1;
                                            string214 = string214;
                                        }
                                        str2 = string214;
                                    } else {
                                        bArr5 = z10;
                                        str2 = string214;
                                        arrayList2 = arrayList3;
                                        wVar.f9153h.add(new B(i28, g14, g15));
                                    }
                                    i28 = i28 + g15 + 1;
                                    z2 = bArr6;
                                    i21 = i29;
                                    arrayList3 = arrayList2;
                                    z10 = bArr5;
                                    string214 = str2;
                                }
                                bArr2 = z2;
                                bArr3 = z10;
                                str = string214;
                                arrayList = arrayList3;
                                i11 = i21;
                            }
                            abstractC0368c = wVar;
                        } else {
                            strArr = F3;
                            bArr2 = z2;
                            bArr3 = z10;
                            str = string214;
                            arrayList = arrayList3;
                            i11 = i21;
                            t tVar = new t(r62);
                            tVar.f9144g = f10;
                            if (r62 != 0) {
                                tVar.a(0, 0);
                            } else {
                                tVar.b(0, 0, string219);
                            }
                            for (int i33 = 1; i33 < length2; i33++) {
                                int g16 = c0369d.g();
                                if (r62 != 0) {
                                    tVar.a(i33, g16);
                                } else {
                                    tVar.b(i33, g16, E(g16));
                                }
                            }
                            abstractC0368c = tVar;
                        }
                    }
                    strArr = F3;
                    bArr2 = z2;
                    bArr3 = z10;
                    str = string214;
                    arrayList = arrayList3;
                    i11 = i21;
                }
            }
            c0367b.f9125c = abstractC0368c;
            c0367b.f9126d = z11;
            String string220 = StubApp.getString2(6524);
            String string221 = StubApp.getString2(6520);
            if (r62 != 0) {
                C0367b c0367b3 = c0367b;
                int length3 = z11.length;
                p w13 = qVar.w(StubApp.getString2(7721));
                if (w13 == null || !w13.b()) {
                    throw new IOException(StubApp.getString2(7726));
                }
                c0369d.f8409b = w13.a(0).intValue();
                byte[][] z12 = z(c0369d);
                if (z12 == null) {
                    throw new IOException(StubApp.getString2(7725));
                }
                LinkedList linkedList = new LinkedList();
                LinkedList linkedList2 = new LinkedList();
                int length4 = z12.length;
                int i34 = 0;
                while (i34 < length4) {
                    C0369d c0369d3 = new C0369d(z12[i34]);
                    byte[][] bArr7 = z12;
                    q qVar2 = new q(0);
                    while (true) {
                        i13 = length4;
                        if (c0369d3.f8409b >= c0369d3.f8408a.length) {
                            break;
                        }
                        p y11 = y(c0369d3);
                        C0377l c0377l2 = y11.f9140b;
                        if (c0377l2 != null) {
                            i15 = i34;
                            ((HashMap) qVar2.f9143b).put(c0377l2.f9134b, y11);
                        } else {
                            i15 = i34;
                        }
                        length4 = i13;
                        i34 = i15;
                    }
                    int i35 = i34;
                    p w14 = qVar2.w(string221);
                    if (w14 == null || w14.f9139a.size() < 2) {
                        throw new IOException(StubApp.getString2(7722));
                    }
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
                    String string222 = StubApp.getString2(6563);
                    linkedHashMap2.put(string222, f(qVar2, string222));
                    String string223 = StubApp.getString2(6565);
                    linkedHashMap2.put(string223, qVar2.y(string223, 0));
                    linkedHashMap2.put(string216, qVar2.l(string216, null));
                    String str6 = str;
                    linkedHashMap2.put(str6, qVar2.l(str6, null));
                    linkedList2.add(linkedHashMap2);
                    int intValue2 = w14.a(1).intValue();
                    c0369d.f8409b = intValue2;
                    int intValue3 = w14.a(0).intValue();
                    q qVar3 = new q(0);
                    int i36 = c0369d.f8409b + intValue3;
                    while (c0369d.f8409b < i36) {
                        p y12 = y(c0369d);
                        String str7 = string216;
                        C0377l c0377l3 = y12.f9140b;
                        if (c0377l3 != null) {
                            i14 = intValue2;
                            ((HashMap) qVar3.f9143b).put(c0377l3.f9134b, y12);
                        } else {
                            i14 = intValue2;
                        }
                        string216 = str7;
                        intValue2 = i14;
                    }
                    String str8 = string216;
                    int i37 = intValue2;
                    LinkedHashMap C10 = C(qVar3);
                    linkedList.add(C10);
                    Number y13 = qVar3.y(string220, 0);
                    if (y13 instanceof Integer) {
                        Integer num = (Integer) y13;
                        if (num.intValue() > 0) {
                            c0369d.f8409b = num.intValue() + i37;
                            C10.put(string220, z(c0369d));
                        }
                    }
                    i34 = i35 + 1;
                    z12 = bArr7;
                    string216 = str8;
                    length4 = i13;
                    str = str6;
                }
                String str9 = str;
                p w15 = qVar.w(StubApp.getString2(7723));
                if (w15 == null || !w15.b()) {
                    throw new IOException(StubApp.getString2(7724));
                }
                c0369d.f8409b = w15.a(0).intValue();
                int f12 = c0369d.f();
                if (f12 == 0) {
                    vVar = new v();
                    vVar.f9147b = new int[length3];
                    int i38 = 0;
                    while (true) {
                        int[] iArr = vVar.f9147b;
                        if (i38 >= iArr.length) {
                            break;
                        }
                        iArr[i38] = c0369d.f();
                        i38++;
                    }
                } else {
                    if (f12 != i22) {
                        throw new IllegalArgumentException();
                    }
                    vVar = new z();
                    vVar.f9154b = f12;
                    int g17 = c0369d.g();
                    vVar.f9155c = g17;
                    vVar.f9156d = new A[g17];
                    for (int i39 = 0; i39 < vVar.f9155c; i39++) {
                        A a3 = new A(0);
                        a3.f9069b = c0369d.g();
                        a3.f9070c = c0369d.f();
                        vVar.f9156d[i39] = a3;
                    }
                    vVar.f9157e = c0369d.g();
                }
                c0367b3.j = linkedList;
                c0367b3.f9109k = vVar;
                List list = (linkedList2.isEmpty() || !((Map) linkedList2.get(0)).containsKey(str9)) ? null : (List) ((Map) linkedList2.get(0)).get(str9);
                List l9 = qVar.l(str9, null);
                if (l9 == null) {
                    if (list != null) {
                        c0367b.c(list, str9);
                    } else {
                        Double valueOf14 = Double.valueOf(0.001d);
                        Double valueOf15 = Double.valueOf(0.0d);
                        Double valueOf16 = Double.valueOf(0.0d);
                        Double valueOf17 = Double.valueOf(0.001d);
                        Double valueOf18 = Double.valueOf(0.0d);
                        Double valueOf19 = Double.valueOf(0.0d);
                        Number[] numberArr3 = new Number[6];
                        numberArr3[0] = valueOf14;
                        numberArr3[1] = valueOf15;
                        numberArr3[2] = valueOf16;
                        numberArr3[3] = valueOf17;
                        numberArr3[4] = valueOf18;
                        numberArr3[i3] = valueOf19;
                        c0367b.c(qVar.l(str9, Arrays.asList(numberArr3)), str9);
                        i12 = 0;
                        bArr4 = bArr3;
                        c0367b.f9127e = bArr4;
                        ArrayList arrayList4 = arrayList;
                        arrayList4.add(c0367b);
                        i21 = i11 + 1;
                        z10 = bArr4;
                        arrayList3 = arrayList4;
                        F3 = strArr;
                        i18 = i12;
                        z2 = bArr2;
                        i19 = 1;
                        i16 = 3;
                        i17 = 4;
                        i3 = 5;
                    }
                } else if (list != null) {
                    double doubleValue = ((Number) l9.get(0)).doubleValue();
                    double doubleValue2 = ((Number) l9.get(1)).doubleValue();
                    double doubleValue3 = ((Number) l9.get(2)).doubleValue();
                    double doubleValue4 = ((Number) l9.get(3)).doubleValue();
                    double doubleValue5 = ((Number) l9.get(4)).doubleValue();
                    double doubleValue6 = ((Number) l9.get(i3)).doubleValue();
                    double doubleValue7 = ((Number) list.get(0)).doubleValue();
                    double doubleValue8 = ((Number) list.get(1)).doubleValue();
                    double doubleValue9 = ((Number) list.get(2)).doubleValue();
                    double doubleValue10 = ((Number) list.get(3)).doubleValue();
                    double doubleValue11 = ((Number) list.get(4)).doubleValue();
                    double doubleValue12 = ((Number) list.get(5)).doubleValue();
                    l9.set(0, Double.valueOf((doubleValue2 * doubleValue9) + (doubleValue * doubleValue7)));
                    l9.set(1, Double.valueOf((doubleValue2 * doubleValue4) + (doubleValue * doubleValue8)));
                    l9.set(2, Double.valueOf((doubleValue4 * doubleValue9) + (doubleValue3 * doubleValue7)));
                    l9.set(3, Double.valueOf((doubleValue4 * doubleValue10) + (doubleValue3 * doubleValue8)));
                    l9.set(4, Double.valueOf((doubleValue9 * doubleValue6) + (doubleValue7 * doubleValue5) + doubleValue11));
                    l9.set(5, Double.valueOf((doubleValue6 * doubleValue10) + (doubleValue5 * doubleValue8) + doubleValue12));
                } else {
                    i12 = 0;
                }
                bArr4 = bArr3;
                i12 = 0;
                c0367b.f9127e = bArr4;
                ArrayList arrayList42 = arrayList;
                arrayList42.add(c0367b);
                i21 = i11 + 1;
                z10 = bArr4;
                arrayList3 = arrayList42;
                F3 = strArr;
                i18 = i12;
                z2 = bArr2;
                i19 = 1;
                i16 = 3;
                i17 = 4;
                i3 = 5;
            } else {
                F f13 = c0367b;
                p w16 = qVar.w(StubApp.getString2(6559));
                int intValue4 = (w16 == null || !w16.b()) ? 0 : w16.a(0).intValue();
                if (intValue4 == 0) {
                    abstractC0370e = D.f9079c;
                } else if (intValue4 != 1) {
                    c0369d.f8409b = intValue4;
                    int f14 = c0369d.f();
                    int i40 = f14 & CertificateBody.profileType;
                    if (i40 == 0) {
                        u uVar = new u();
                        uVar.f9145d = f14;
                        uVar.f9146e = c0369d.f();
                        uVar.c(0, string219);
                        for (int i41 = 1; i41 <= uVar.f9146e; i41++) {
                            uVar.c(c0369d.f(), E(abstractC0368c.e(i41)));
                        }
                        abstractC0370e = uVar;
                        if ((f14 & 128) != 0) {
                            G(c0369d, uVar);
                            abstractC0370e = uVar;
                        }
                    } else {
                        if (i40 != 1) {
                            throw new IOException(i2.u.p(i40, StubApp.getString2(7727)));
                        }
                        x xVar = new x();
                        xVar.f9150d = f14;
                        xVar.f9151e = c0369d.f();
                        xVar.c(0, string219);
                        int i42 = 1;
                        for (int i43 = 0; i43 < xVar.f9151e; i43++) {
                            int f15 = c0369d.f();
                            int f16 = c0369d.f();
                            int i44 = 0;
                            while (i44 <= f16) {
                                int i45 = f15;
                                xVar.c(i45 + i44, E(abstractC0368c.e(i42)));
                                i42++;
                                i44++;
                                f15 = i45;
                            }
                        }
                        abstractC0370e = xVar;
                        if ((f14 & 128) != 0) {
                            G(c0369d, xVar);
                            abstractC0370e = xVar;
                        }
                    }
                } else {
                    abstractC0370e = C0372g.f9120c;
                }
                f13.f9082g = abstractC0370e;
                p w17 = qVar.w(string221);
                if (w17 == null || w17.f9139a.size() < 2) {
                    throw new IOException(StubApp.getString2(7728) + f13.f9123a);
                }
                int intValue5 = w17.a(1).intValue();
                c0369d.f8409b = intValue5;
                int intValue6 = w17.a(0).intValue();
                q qVar4 = new q(0);
                int i46 = c0369d.f8409b + intValue6;
                while (c0369d.f8409b < i46) {
                    p y14 = y(c0369d);
                    C0377l c0377l4 = y14.f9140b;
                    if (c0377l4 != null) {
                        ((HashMap) qVar4.f9143b).put(c0377l4.f9134b, y14);
                    }
                }
                Iterator it = C(qVar4).entrySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    linkedHashMap = f13.f9081f;
                    if (!hasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str10 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        linkedHashMap.put(str10, value);
                    }
                }
                i12 = 0;
                Number y15 = qVar4.y(string220, 0);
                if (y15 instanceof Integer) {
                    Integer num2 = (Integer) y15;
                    if (num2.intValue() > 0) {
                        c0369d.f8409b = num2.intValue() + intValue5;
                        byte[][] z13 = z(c0369d);
                        if (z13 != null) {
                            linkedHashMap.put(string220, z13);
                        }
                    }
                }
            }
            bArr4 = bArr3;
            c0367b.f9127e = bArr4;
            ArrayList arrayList422 = arrayList;
            arrayList422.add(c0367b);
            i21 = i11 + 1;
            z10 = bArr4;
            arrayList3 = arrayList422;
            F3 = strArr;
            i18 = i12;
            z2 = bArr2;
            i19 = 1;
            i16 = 3;
            i17 = 4;
            i3 = 5;
        }
        return arrayList3;
    }

    public void v(Bundle source) {
        C2.c cVar = (C2.c) this.f9077b;
        if (!cVar.f1048a) {
            cVar.a();
        }
        M1.e eVar = (M1.e) cVar.f1051d;
        if (eVar.i().f9925c.a(EnumC0439n.f9916d)) {
            throw new IllegalStateException((StubApp.getString2(7736) + eVar.i().f9925c).toString());
        }
        if (cVar.f1049b) {
            throw new IllegalStateException(StubApp.getString2(7735));
        }
        Bundle bundle = null;
        if (source != null) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter("androidx.lifecycle.BundlableSavedStateRegistry.key", StubApp.getString2(728));
            if (source.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundle = Oc.a.r("androidx.lifecycle.BundlableSavedStateRegistry.key", source);
            }
        }
        cVar.f1055h = bundle;
        cVar.f1049b = true;
    }

    @Override // T0.q
    public T0.H w(int i3, int i10) {
        return (Y) this.f9077b;
    }

    public void x(Bundle source) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(source, "outBundle");
        C2.c cVar = (C2.c) this.f9077b;
        Intrinsics.checkNotNullParameter(source, "outBundle");
        Map emptyMap = MapsKt.emptyMap();
        if (emptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(emptyMap.size());
            for (Map.Entry entry : emptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle value = AbstractC0624h2.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Intrinsics.checkNotNullParameter(value, "source");
        Bundle from = (Bundle) cVar.f1055h;
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            value.putAll(from);
        }
        synchronized (((u5.d) cVar.f1053f)) {
            try {
                for (Map.Entry entry2 : ((LinkedHashMap) cVar.f1054g).entrySet()) {
                    String key = (String) entry2.getKey();
                    Bundle value2 = ((M1.d) entry2.getValue()).a();
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(value2, "value");
                    value.putBundle(key, value2);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Intrinsics.checkNotNullParameter(value, "source");
        if (value.isEmpty()) {
            return;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        String key2 = StubApp.getString2(7737);
        Intrinsics.checkNotNullParameter(key2, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        source.putBundle(key2, value);
    }

    public /* synthetic */ C(Object obj, Object obj2, int i3, boolean z2) {
        this.f9076a = i3;
        this.f9078c = obj;
        this.f9077b = obj2;
    }

    public /* synthetic */ C(Object obj) {
        this.f9076a = 24;
        this.f9078c = obj;
        this.f9077b = new ArrayList();
    }

    public C(GoogleApiAvailability googleApiAvailability) {
        this.f9076a = 25;
        this.f9077b = new SparseIntArray();
        S3.D.h(googleApiAvailability);
        this.f9078c = googleApiAvailability;
    }

    public C(File cacheDirectory) {
        this.f9076a = 8;
        Intrinsics.checkNotNullParameter(cacheDirectory, "cacheDirectory");
        this.f9077b = cacheDirectory;
        this.f9078c = LazyKt.lazy(E9.b.f2054d);
    }

    public C(Vb.f originalScope) {
        this.f9076a = 2;
        Intrinsics.checkNotNullParameter(originalScope, "originalScope");
        this.f9077b = originalScope;
        this.f9078c = Zb.f.a();
    }

    public C(C2.c cVar) {
        this.f9076a = 18;
        this.f9077b = cVar;
        this.f9078c = new E0(cVar);
    }

    public C(Context context, C2.c cVar) {
        this.f9076a = 4;
        this.f9077b = context;
        C0036m c0036m = new C0036m(context, StubApp.getString2(164));
        c0036m.f869k = 1;
        this.f9078c = c0036m;
        I(cVar, false);
    }

    public C(int i3, byte b2) {
        this.f9076a = i3;
        switch (i3) {
            case 1:
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                this.f9077b = linkedHashSet;
                A8.b bVar = new A8.b();
                A8.b bVar2 = (A8.b) this.f9078c;
                if (bVar2 != null) {
                    linkedHashSet.remove(bVar2);
                }
                A8.b[] interceptors = {bVar};
                Intrinsics.checkNotNullParameter(interceptors, "interceptors");
                CollectionsKt.addAll(linkedHashSet, interceptors);
                this.f9078c = bVar;
                break;
            case 23:
                this.f9077b = new CopyOnWriteArraySet();
                break;
            default:
                this.f9077b = null;
                break;
        }
    }

    public C(int i3) {
        this.f9076a = 7;
        E0.c cVar = new E0.c(i3, 0);
        E0.c cVar2 = new E0.c(i3, 1);
        this.f9077b = cVar;
        this.f9078c = cVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C(InterfaceC0327h interfaceC0327h, Function2 function2) {
        this.f9076a = 28;
        this.f9077b = interfaceC0327h;
        this.f9078c = (SuspendLambda) function2;
    }

    public C(H0.o oVar) {
        this.f9076a = 10;
        this.f9078c = oVar;
        this.f9077b = AbstractC1560u.m(null);
    }

    public C(R4.i iVar) {
        this.f9076a = 26;
        this.f9077b = iVar;
        this.f9078c = new AtomicBoolean(false);
    }
}
