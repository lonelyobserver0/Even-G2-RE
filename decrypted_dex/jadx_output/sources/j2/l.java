package j2;

import A3.s;
import J1.v;
import Y.m;
import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import i2.n;
import i2.o;
import i2.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import sa.C1608a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l implements Runnable {

    /* renamed from: v, reason: collision with root package name */
    public static final String f15304v = o.g(StubApp.getString2(19003));

    /* renamed from: a, reason: collision with root package name */
    public Context f15305a;

    /* renamed from: b, reason: collision with root package name */
    public String f15306b;

    /* renamed from: c, reason: collision with root package name */
    public List f15307c;

    /* renamed from: d, reason: collision with root package name */
    public r2.f f15308d;

    /* renamed from: e, reason: collision with root package name */
    public ListenableWorker f15309e;

    /* renamed from: f, reason: collision with root package name */
    public C1608a f15310f;

    /* renamed from: g, reason: collision with root package name */
    public n f15311g;

    /* renamed from: h, reason: collision with root package name */
    public La.b f15312h;
    public C1084b j;

    /* renamed from: k, reason: collision with root package name */
    public WorkDatabase f15313k;

    /* renamed from: l, reason: collision with root package name */
    public s f15314l;

    /* renamed from: m, reason: collision with root package name */
    public m f15315m;

    /* renamed from: n, reason: collision with root package name */
    public V6.b f15316n;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f15317p;

    /* renamed from: q, reason: collision with root package name */
    public String f15318q;

    /* renamed from: r, reason: collision with root package name */
    public t2.j f15319r;

    /* renamed from: s, reason: collision with root package name */
    public Q4.c f15320s;

    /* renamed from: t, reason: collision with root package name */
    public volatile boolean f15321t;

    public final void a(n nVar) {
        boolean z2 = nVar instanceof i2.m;
        String str = f15304v;
        if (!z2) {
            if (nVar instanceof i2.l) {
                o.e().f(str, E1.a.j(StubApp.getString2(19007), this.f15318q), new Throwable[0]);
                c();
                return;
            }
            o.e().f(str, E1.a.j(StubApp.getString2(19008), this.f15318q), new Throwable[0]);
            if (this.f15308d.c()) {
                d();
                return;
            } else {
                g();
                return;
            }
        }
        o.e().f(str, E1.a.j(StubApp.getString2(19004), this.f15318q), new Throwable[0]);
        if (this.f15308d.c()) {
            d();
            return;
        }
        m mVar = this.f15315m;
        String str2 = this.f15306b;
        s sVar = this.f15314l;
        WorkDatabase workDatabase = this.f15313k;
        workDatabase.c();
        try {
            sVar.q(3, str2);
            sVar.o(str2, ((i2.m) this.f15311g).f14744a);
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = mVar.o(str2).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (sVar.i(str3) == 5) {
                    v e10 = v.e(1, StubApp.getString2("19005"));
                    if (str3 == null) {
                        e10.x(1);
                    } else {
                        e10.g(1, str3);
                    }
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) mVar.f8674b;
                    workDatabase_Impl.b();
                    Cursor u2 = F1.u(workDatabase_Impl, e10);
                    try {
                        if (u2.moveToFirst() && u2.getInt(0) != 0) {
                            o.e().f(str, StubApp.getString2("19006") + str3, new Throwable[0]);
                            sVar.q(1, str3);
                            sVar.p(currentTimeMillis, str3);
                        }
                    } finally {
                        u2.close();
                        e10.h();
                    }
                }
            }
            workDatabase.n();
            workDatabase.j();
            e(false);
        } catch (Throwable th) {
            workDatabase.j();
            e(false);
            throw th;
        }
    }

    public final void b() {
        boolean h2 = h();
        String str = this.f15306b;
        WorkDatabase workDatabase = this.f15313k;
        if (!h2) {
            workDatabase.c();
            try {
                int i3 = this.f15314l.i(str);
                a5.c t3 = workDatabase.t();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) t3.f9282b;
                workDatabase_Impl.b();
                Q2.e eVar = (Q2.e) t3.f9283c;
                P1.k a3 = eVar.a();
                if (str == null) {
                    a3.x(1);
                } else {
                    a3.g(1, str);
                }
                workDatabase_Impl.c();
                try {
                    a3.d();
                    workDatabase_Impl.n();
                    if (i3 == 0) {
                        e(false);
                    } else if (i3 == 2) {
                        a(this.f15311g);
                    } else if (!u.a(i3)) {
                        c();
                    }
                    workDatabase.n();
                    workDatabase.j();
                } finally {
                    workDatabase_Impl.j();
                    eVar.d(a3);
                }
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            }
        }
        List list = this.f15307c;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC1085c) it.next()).d(str);
            }
            AbstractC1086d.a(this.f15312h, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.f15306b;
        s sVar = this.f15314l;
        WorkDatabase workDatabase = this.f15313k;
        workDatabase.c();
        try {
            sVar.q(1, str);
            sVar.p(System.currentTimeMillis(), str);
            sVar.n(-1L, str);
            workDatabase.n();
        } finally {
            workDatabase.j();
            e(true);
        }
    }

    public final void d() {
        String str = this.f15306b;
        s sVar = this.f15314l;
        WorkDatabase workDatabase = this.f15313k;
        workDatabase.c();
        try {
            sVar.p(System.currentTimeMillis(), str);
            sVar.q(1, str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) sVar.f189a;
            workDatabase_Impl.b();
            Q2.e eVar = (Q2.e) sVar.f195g;
            P1.k a3 = eVar.a();
            if (str == null) {
                a3.x(1);
            } else {
                a3.g(1, str);
            }
            workDatabase_Impl.c();
            try {
                a3.d();
                workDatabase_Impl.n();
                workDatabase_Impl.j();
                eVar.d(a3);
                sVar.n(-1L, str);
                workDatabase.n();
            } catch (Throwable th) {
                workDatabase_Impl.j();
                eVar.d(a3);
                throw th;
            }
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:3:0x0005, B:10:0x0036, B:12:0x003e, B:14:0x004a, B:15:0x005e, B:17:0x0062, B:19:0x0066, B:21:0x006c, B:22:0x0072, B:30:0x007f, B:32:0x0080, B:38:0x0094, B:39:0x009a, B:5:0x0024, B:7:0x002b, B:24:0x0073, B:25:0x007b), top: B:2:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a A[Catch: all -> 0x0046, TryCatch #1 {all -> 0x0046, blocks: (B:3:0x0005, B:10:0x0036, B:12:0x003e, B:14:0x004a, B:15:0x005e, B:17:0x0062, B:19:0x0066, B:21:0x006c, B:22:0x0072, B:30:0x007f, B:32:0x0080, B:38:0x0094, B:39:0x009a, B:5:0x0024, B:7:0x002b, B:24:0x0073, B:25:0x007b), top: B:2:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.f15313k
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.f15313k     // Catch: java.lang.Throwable -> L46
            A3.s r0 = r0.u()     // Catch: java.lang.Throwable -> L46
            r0.getClass()     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = "19009"
            java.lang.String r1 = com.stub.StubApp.getString2(r1)     // Catch: java.lang.Throwable -> L46
            r2 = 0
            J1.v r1 = J1.v.e(r2, r1)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r0 = r0.f189a     // Catch: java.lang.Throwable -> L46
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0     // Catch: java.lang.Throwable -> L46
            r0.b()     // Catch: java.lang.Throwable -> L46
            android.database.Cursor r0 = com.google.android.gms.internal.measurement.F1.u(r0, r1)     // Catch: java.lang.Throwable -> L46
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L33
            r4 = 1
            if (r3 == 0) goto L35
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L35
            r3 = r4
            goto L36
        L33:
            r6 = move-exception
            goto L94
        L35:
            r3 = r2
        L36:
            r0.close()     // Catch: java.lang.Throwable -> L46
            r1.h()     // Catch: java.lang.Throwable -> L46
            if (r3 != 0) goto L48
            android.content.Context r0 = r5.f15305a     // Catch: java.lang.Throwable -> L46
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            s2.e.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L46
            goto L48
        L46:
            r6 = move-exception
            goto L9b
        L48:
            if (r6 == 0) goto L5e
            A3.s r0 = r5.f15314l     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = r5.f15306b     // Catch: java.lang.Throwable -> L46
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> L46
            r0.q(r4, r1)     // Catch: java.lang.Throwable -> L46
            A3.s r0 = r5.f15314l     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = r5.f15306b     // Catch: java.lang.Throwable -> L46
            r2 = -1
            r0.n(r2, r1)     // Catch: java.lang.Throwable -> L46
        L5e:
            r2.f r0 = r5.f15308d     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L80
            androidx.work.ListenableWorker r0 = r5.f15309e     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L80
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L80
            j2.b r0 = r5.j     // Catch: java.lang.Throwable -> L46
            java.lang.String r1 = r5.f15306b     // Catch: java.lang.Throwable -> L46
            java.lang.Object r2 = r0.f15271l     // Catch: java.lang.Throwable -> L46
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L46
            java.util.HashMap r3 = r0.f15267f     // Catch: java.lang.Throwable -> L7d
            r3.remove(r1)     // Catch: java.lang.Throwable -> L7d
            r0.h()     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            goto L80
        L7d:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            throw r6     // Catch: java.lang.Throwable -> L46
        L80:
            androidx.work.impl.WorkDatabase r0 = r5.f15313k     // Catch: java.lang.Throwable -> L46
            r0.n()     // Catch: java.lang.Throwable -> L46
            androidx.work.impl.WorkDatabase r0 = r5.f15313k
            r0.j()
            t2.j r0 = r5.f15319r
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.j(r6)
            return
        L94:
            r0.close()     // Catch: java.lang.Throwable -> L46
            r1.h()     // Catch: java.lang.Throwable -> L46
            throw r6     // Catch: java.lang.Throwable -> L46
        L9b:
            androidx.work.impl.WorkDatabase r0 = r5.f15313k
            r0.j()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.l.e(boolean):void");
    }

    public final void f() {
        s sVar = this.f15314l;
        String str = this.f15306b;
        int i3 = sVar.i(str);
        String string2 = StubApp.getString2(19010);
        String str2 = f15304v;
        if (i3 == 2) {
            o.e().b(str2, E1.a.k(string2, str, StubApp.getString2(19011)), new Throwable[0]);
            e(true);
            return;
        }
        o e10 = o.e();
        StringBuilder l9 = com.mapbox.common.b.l(string2, str, StubApp.getString2(11256));
        l9.append(u.D(i3));
        l9.append(StubApp.getString2(19012));
        e10.b(str2, l9.toString(), new Throwable[0]);
        e(false);
    }

    public final void g() {
        String str = this.f15306b;
        WorkDatabase workDatabase = this.f15313k;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (!linkedList.isEmpty()) {
                String str2 = (String) linkedList.remove();
                s sVar = this.f15314l;
                if (sVar.i(str2) != 6) {
                    sVar.q(4, str2);
                }
                linkedList.addAll(this.f15315m.o(str2));
            }
            this.f15314l.o(str, ((i2.k) this.f15311g).f14743a);
            workDatabase.n();
        } finally {
            workDatabase.j();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.f15321t) {
            return false;
        }
        o.e().b(f15304v, E1.a.j(StubApp.getString2(19013), this.f15318q), new Throwable[0]);
        if (this.f15314l.i(this.f15306b) == 0) {
            e(false);
            return true;
        }
        e(!u.a(r0));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00df, code lost:
    
        if ((r6.f20303b == 1 && r6.f20311k > 0) != false) goto L36;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j2.l.run():void");
    }
}
