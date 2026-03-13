package l4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: l4.j1, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1189j1 extends AbstractC1150F {

    /* renamed from: c, reason: collision with root package name */
    public final ServiceConnectionC1186i1 f16479c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1151G f16480d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Boolean f16481e;

    /* renamed from: f, reason: collision with root package name */
    public final C1177f1 f16482f;

    /* renamed from: g, reason: collision with root package name */
    public ScheduledExecutorService f16483g;

    /* renamed from: h, reason: collision with root package name */
    public final Cc.a f16484h;
    public final ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public final C1177f1 f16485k;

    public C1189j1(C1200n0 c1200n0) {
        super(c1200n0);
        this.j = new ArrayList();
        this.f16484h = new Cc.a(c1200n0.f16545l);
        this.f16479c = new ServiceConnectionC1186i1(this);
        this.f16482f = new C1177f1(this, c1200n0, 0);
        this.f16485k = new C1177f1(this, c1200n0, 1);
    }

    public final M1 A(boolean z2) {
        long abs;
        Pair pair;
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        c1200n0.getClass();
        C1156L q10 = c1200n0.q();
        String str = null;
        if (z2) {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            C1200n0 c1200n02 = (C1200n0) t3.f4728a;
            C1164b0 c1164b0 = c1200n02.f16540e;
            C1200n0.j(c1164b0);
            if (c1164b0.f16370e != null) {
                C1164b0 c1164b02 = c1200n02.f16540e;
                C1200n0.j(c1164b02);
                R8.B b2 = c1164b02.f16370e;
                C1164b0 c1164b03 = (C1164b0) b2.f6255e;
                c1164b03.k();
                c1164b03.k();
                long j = ((C1164b0) b2.f6255e).o().getLong((String) b2.f6252b, 0L);
                if (j == 0) {
                    b2.c();
                    abs = 0;
                } else {
                    ((C1200n0) c1164b03.f4728a).f16545l.getClass();
                    abs = Math.abs(j - System.currentTimeMillis());
                }
                long j3 = b2.f6251a;
                if (abs >= j3) {
                    if (abs > j3 + j3) {
                        b2.c();
                    } else {
                        String string = c1164b03.o().getString((String) b2.f6254d, null);
                        long j10 = c1164b03.o().getLong((String) b2.f6253c, 0L);
                        b2.c();
                        pair = (string == null || j10 <= 0) ? C1164b0.f16365C : new Pair(string, Long.valueOf(j10));
                        if (pair != null && pair != C1164b0.f16365C) {
                            String valueOf = String.valueOf(pair.second);
                            String str2 = (String) pair.first;
                            str = E1.a.n(new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length()), valueOf, StubApp.getString2(478), str2);
                        }
                    }
                }
                pair = null;
                if (pair != null) {
                    String valueOf2 = String.valueOf(pair.second);
                    String str22 = (String) pair.first;
                    str = E1.a.n(new StringBuilder(valueOf2.length() + 1 + String.valueOf(str22).length()), valueOf2, StubApp.getString2(478), str22);
                }
            }
        }
        return q10.o(str);
    }

    public final boolean B() {
        k();
        l();
        return this.f16480d != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x044f A[Catch: all -> 0x03d4, TRY_ENTER, TryCatch #31 {all -> 0x03d4, blocks: (B:196:0x047b, B:218:0x044f, B:220:0x0455, B:221:0x0458, B:210:0x0499, B:333:0x03bb, B:337:0x03c5, B:338:0x03dc), top: B:195:0x047b }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0303 A[Catch: all -> 0x021f, SQLiteException -> 0x02db, SQLiteDatabaseLockedException -> 0x02e0, SQLiteFullException -> 0x02e4, TryCatch #71 {all -> 0x021f, blocks: (B:161:0x01f8, B:167:0x020e, B:169:0x0213, B:177:0x0237, B:180:0x023b, B:181:0x023e, B:228:0x0246, B:231:0x025a, B:233:0x0274, B:238:0x027d, B:239:0x0280, B:236:0x026e, B:242:0x0284, B:245:0x0298, B:247:0x02b2, B:252:0x02bc, B:253:0x02bf, B:250:0x02ac, B:263:0x02c3, B:271:0x02d7, B:273:0x0303, B:284:0x030d, B:285:0x0310, B:282:0x02fd, B:258:0x031d, B:260:0x032c, B:330:0x039c), top: B:160:0x01f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0677  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(l4.InterfaceC1151G r64, T3.a r65, l4.M1 r66) {
        /*
            Method dump skipped, instructions count: 1798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1189j1.C(l4.G, T3.a, l4.M1):void");
    }

    public final void D(C1172e c1172e) {
        boolean r8;
        k();
        l();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        c1200n0.getClass();
        C1158N n10 = c1200n0.n();
        C1200n0 c1200n02 = (C1200n0) n10.f4728a;
        C1200n0.j(c1200n02.j);
        byte[] O7 = K1.O(c1172e);
        if (O7.length > 131072) {
            T t3 = c1200n02.f16541f;
            C1200n0.l(t3);
            t3.f16243g.b(StubApp.getString2(20504));
            r8 = false;
        } else {
            r8 = n10.r(2, O7);
        }
        y(new P3.i(this, A(true), r8, new C1172e(c1172e)));
    }

    @Override // l4.AbstractC1150F
    public final boolean n() {
        return false;
    }

    public final void o(AtomicReference atomicReference) {
        k();
        l();
        y(new K.m(this, atomicReference, A(false)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.os.Bundle r8) {
        /*
            r7 = this;
            r7.k()
            r7.l()
            l4.u r4 = new l4.u
            r4.<init>(r8)
            r7.w()
            java.lang.Object r0 = r7.f4728a
            l4.n0 r0 = (l4.C1200n0) r0
            l4.g r1 = r0.f16539d
            r2 = 0
            l4.C r3 = l4.AbstractC1148D.f15980c1
            boolean r1 = r1.u(r2, r3)
            r2 = 0
            if (r1 == 0) goto L63
            l4.N r0 = r0.n()
            java.lang.Object r1 = r0.f4728a
            l4.n0 r1 = (l4.C1200n0) r1
            l4.K1 r3 = r1.j
            l4.C1200n0.j(r3)
            byte[] r3 = l4.K1.O(r4)
            l4.T r1 = r1.f16541f
            if (r3 != 0) goto L44
            l4.C1200n0.l(r1)
            r0 = 20505(0x5019, float:2.8734E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            Ac.b r1 = r1.f16243g
            r1.b(r0)
        L42:
            r0 = r2
            goto L5e
        L44:
            int r5 = r3.length
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r5 <= r6) goto L59
            l4.C1200n0.l(r1)
            r0 = 20506(0x501a, float:2.8735E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            Ac.b r1 = r1.f16243g
            r1.b(r0)
            goto L42
        L59:
            r1 = 4
            boolean r0 = r0.r(r1, r3)
        L5e:
            if (r0 == 0) goto L63
            r0 = 1
            r3 = r0
            goto L64
        L63:
            r3 = r2
        L64:
            l4.M1 r2 = r7.A(r2)
            l4.H0 r0 = new l4.H0
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7.y(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1189j1.p(android.os.Bundle):void");
    }

    public final void q() {
        k();
        l();
        if (B()) {
            return;
        }
        if (r()) {
            ServiceConnectionC1186i1 serviceConnectionC1186i1 = this.f16479c;
            C1189j1 c1189j1 = serviceConnectionC1186i1.f16467c;
            c1189j1.k();
            Context context = ((C1200n0) c1189j1.f4728a).f16536a;
            synchronized (serviceConnectionC1186i1) {
                try {
                    if (serviceConnectionC1186i1.f16465a) {
                        T t3 = ((C1200n0) serviceConnectionC1186i1.f16467c.f4728a).f16541f;
                        C1200n0.l(t3);
                        t3.f16249p.b(StubApp.getString2("20507"));
                        return;
                    } else {
                        if (serviceConnectionC1186i1.f16466b != null && (serviceConnectionC1186i1.f16466b.f() || serviceConnectionC1186i1.f16466b.i())) {
                            T t10 = ((C1200n0) serviceConnectionC1186i1.f16467c.f4728a).f16541f;
                            C1200n0.l(t10);
                            t10.f16249p.b(StubApp.getString2("20510"));
                            return;
                        }
                        serviceConnectionC1186i1.f16466b = new P(context, Looper.getMainLooper(), S3.O.a(context), com.google.android.gms.common.e.getInstance(), 93, serviceConnectionC1186i1, serviceConnectionC1186i1, null);
                        T t11 = ((C1200n0) serviceConnectionC1186i1.f16467c.f4728a).f16541f;
                        C1200n0.l(t11);
                        t11.f16249p.b(StubApp.getString2("20511"));
                        serviceConnectionC1186i1.f16465a = true;
                        S3.D.h(serviceConnectionC1186i1.f16466b);
                        serviceConnectionC1186i1.f16466b.n();
                        return;
                    }
                } finally {
                }
            }
        }
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        if (c1200n0.f16539d.n()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = c1200n0.f16536a.getPackageManager().queryIntentServices(new Intent().setClassName(c1200n0.f16536a, StubApp.getString2(12379)), PKIFailureInfo.notAuthorized);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            T t12 = c1200n0.f16541f;
            C1200n0.l(t12);
            t12.f16242f.b(StubApp.getString2(20509));
            return;
        }
        Intent intent = new Intent(StubApp.getString2(12388));
        intent.setComponent(new ComponentName(c1200n0.f16536a, StubApp.getString2(12379)));
        ServiceConnectionC1186i1 serviceConnectionC1186i12 = this.f16479c;
        C1189j1 c1189j12 = serviceConnectionC1186i12.f16467c;
        c1189j12.k();
        Context context2 = ((C1200n0) c1189j12.f4728a).f16536a;
        V3.a b2 = V3.a.b();
        synchronized (serviceConnectionC1186i12) {
            try {
                if (serviceConnectionC1186i12.f16465a) {
                    T t13 = ((C1200n0) serviceConnectionC1186i12.f16467c.f4728a).f16541f;
                    C1200n0.l(t13);
                    t13.f16249p.b(StubApp.getString2("20507"));
                } else {
                    C1189j1 c1189j13 = serviceConnectionC1186i12.f16467c;
                    T t14 = ((C1200n0) c1189j13.f4728a).f16541f;
                    C1200n0.l(t14);
                    t14.f16249p.b(StubApp.getString2("20508"));
                    serviceConnectionC1186i12.f16465a = true;
                    b2.a(context2, intent, c1189j13.f16479c, 129);
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.C1189j1.r():boolean");
    }

    public final void s() {
        k();
        l();
        ServiceConnectionC1186i1 serviceConnectionC1186i1 = this.f16479c;
        if (serviceConnectionC1186i1.f16466b != null && (serviceConnectionC1186i1.f16466b.i() || serviceConnectionC1186i1.f16466b.f())) {
            serviceConnectionC1186i1.f16466b.h();
        }
        serviceConnectionC1186i1.f16466b = null;
        try {
            V3.a.b().c(((C1200n0) this.f4728a).f16536a, serviceConnectionC1186i1);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f16480d = null;
    }

    public final boolean t() {
        k();
        l();
        if (!r()) {
            return true;
        }
        K1 k12 = ((C1200n0) this.f4728a).j;
        C1200n0.j(k12);
        return k12.Q() >= ((Integer) AbstractC1148D.f15941J0.a(null)).intValue();
    }

    public final boolean u() {
        k();
        l();
        if (!r()) {
            return true;
        }
        K1 k12 = ((C1200n0) this.f4728a).j;
        C1200n0.j(k12);
        return k12.Q() >= 241200;
    }

    public final void v(ComponentName componentName) {
        k();
        if (this.f16480d != null) {
            this.f16480d = null;
            T t3 = ((C1200n0) this.f4728a).f16541f;
            C1200n0.l(t3);
            t3.f16249p.c(componentName, StubApp.getString2(20522));
            k();
            q();
        }
    }

    public final void w() {
        ((C1200n0) this.f4728a).getClass();
    }

    public final void x() {
        k();
        Cc.a aVar = this.f16484h;
        ((W3.a) aVar.f1189c).getClass();
        aVar.f1188b = SystemClock.elapsedRealtime();
        ((C1200n0) this.f4728a).getClass();
        this.f16482f.b(((Long) AbstractC1148D.f15969Y.a(null)).longValue());
    }

    public final void y(Runnable runnable) {
        k();
        if (B()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.j;
        long size = arrayList.size();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        c1200n0.getClass();
        if (size < 1000) {
            arrayList.add(runnable);
            this.f16485k.b(60000L);
            q();
        } else {
            T t3 = c1200n0.f16541f;
            C1200n0.l(t3);
            t3.f16242f.b(StubApp.getString2(20523));
        }
    }

    public final void z() {
        k();
        C1200n0 c1200n0 = (C1200n0) this.f4728a;
        T t3 = c1200n0.f16541f;
        C1200n0.l(t3);
        ArrayList arrayList = this.j;
        t3.f16249p.c(Integer.valueOf(arrayList.size()), StubApp.getString2(20524));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                T t10 = c1200n0.f16541f;
                C1200n0.l(t10);
                t10.f16242f.c(e10, StubApp.getString2(20525));
            }
        }
        arrayList.clear();
        this.f16485k.c();
    }
}
