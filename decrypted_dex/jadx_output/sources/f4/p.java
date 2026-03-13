package f4;

import R3.C0241j;
import S3.AbstractC0275i;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.stub.StubApp;
import i4.C1046j;
import i5.C1059c;
import t.C1697j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class p extends AbstractC0275i {

    /* renamed from: C, reason: collision with root package name */
    public final C1697j f13762C;

    /* renamed from: D, reason: collision with root package name */
    public final C1697j f13763D;

    /* renamed from: E, reason: collision with root package name */
    public final C1697j f13764E;

    public p(Context context, Looper looper, C1059c c1059c, R3.r rVar, R3.r rVar2) {
        super(context, looper, 23, c1059c, rVar, rVar2);
        this.f13762C = new C1697j(0);
        this.f13763D = new C1697j(0);
        this.f13764E = new C1697j(0);
    }

    public final void B(C1046j c1046j, q4.k kVar) {
        com.google.android.gms.common.d dVar;
        com.google.android.gms.common.d[] k3 = k();
        com.google.android.gms.common.d dVar2 = null;
        int i3 = 0;
        if (k3 != null) {
            int i10 = 0;
            while (true) {
                if (i10 >= k3.length) {
                    dVar = null;
                    break;
                }
                dVar = k3[i10];
                if (StubApp.getString2(6601).equals(dVar.f11182a)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (dVar != null && dVar.d() >= 1) {
                F f10 = (F) t();
                r rVar = new r(4, null, new j(1, kVar), null, null);
                Parcel g10 = f10.g();
                g.b(g10, c1046j);
                g.b(g10, rVar);
                f10.L(g10, 90);
                return;
            }
        }
        com.google.android.gms.common.d[] k4 = k();
        if (k4 != null) {
            while (true) {
                if (i3 >= k4.length) {
                    break;
                }
                com.google.android.gms.common.d dVar3 = k4[i3];
                if (StubApp.getString2(17501).equals(dVar3.f11182a)) {
                    dVar2 = dVar3;
                    break;
                }
                i3++;
            }
            if (dVar2 != null && dVar2.d() >= 1) {
                F f11 = (F) t();
                j jVar = new j(1, kVar);
                Parcel g11 = f11.g();
                g.b(g11, c1046j);
                g11.writeStrongBinder(jVar);
                f11.L(g11, 82);
                return;
            }
        }
        F f12 = (F) t();
        Parcel K10 = f12.K(f12.g(), 7);
        Location location = (Location) g.a(K10, Location.CREATOR);
        K10.recycle();
        kVar.b(location);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0066 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:19:0x0042, B:23:0x004f, B:25:0x0066, B:28:0x0077, B:29:0x00b8, B:34:0x008a, B:35:0x0057), top: B:18:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:19:0x0042, B:23:0x004f, B:25:0x0066, B:28:0x0077, B:29:0x00b8, B:34:0x008a, B:35:0x0057), top: B:18:0x0042 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(f4.m r19, com.google.android.gms.location.LocationRequest r20, q4.k r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r21
            R3.l r2 = r19.a()
            java.lang.Object r3 = r2.f6142c
            R3.j r3 = (R3.C0241j) r3
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.common.d[] r4 = r1.k()
            r5 = 0
            r6 = 0
            if (r4 == 0) goto L3f
            r7 = r6
        L18:
            int r8 = r4.length
            if (r7 >= r8) goto L30
            r8 = r4[r7]
            r9 = 6601(0x19c9, float:9.25E-42)
            java.lang.String r9 = com.stub.StubApp.getString2(r9)
            java.lang.String r10 = r8.f11182a
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L2d
            goto L31
        L2d:
            int r7 = r7 + 1
            goto L18
        L30:
            r8 = r5
        L31:
            if (r8 != 0) goto L34
            goto L3f
        L34:
            long r7 = r8.d()
            r9 = 1
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 < 0) goto L3f
            r6 = 1
        L3f:
            t.j r4 = r1.f13763D
            monitor-enter(r4)
            t.j r7 = r1.f13763D     // Catch: java.lang.Throwable -> L88
            java.lang.Object r7 = r7.get(r3)     // Catch: java.lang.Throwable -> L88
            f4.n r7 = (f4.n) r7     // Catch: java.lang.Throwable -> L88
            if (r7 == 0) goto L57
            if (r6 == 0) goto L4f
            goto L57
        L4f:
            f4.m r8 = r7.f13760f     // Catch: java.lang.Throwable -> L88
            r8.c(r2)     // Catch: java.lang.Throwable -> L88
            r12 = r7
            r7 = r5
            goto L64
        L57:
            f4.n r2 = new f4.n     // Catch: java.lang.Throwable -> L88
            r8 = r19
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L88
            t.j r8 = r1.f13763D     // Catch: java.lang.Throwable -> L88
            r8.put(r3, r2)     // Catch: java.lang.Throwable -> L88
            r12 = r2
        L64:
            if (r6 == 0) goto L8a
            android.os.IInterface r2 = r1.t()     // Catch: java.lang.Throwable -> L88
            f4.F r2 = (f4.F) r2     // Catch: java.lang.Throwable -> L88
            java.lang.String r13 = r3.a()     // Catch: java.lang.Throwable -> L88
            f4.r r8 = new f4.r     // Catch: java.lang.Throwable -> L88
            if (r7 != 0) goto L76
            r10 = r5
            goto L77
        L76:
            r10 = r7
        L77:
            r9 = 2
            r11 = r12
            r12 = 0
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L88
            f4.l r3 = new f4.l     // Catch: java.lang.Throwable -> L88
            r3.<init>(r5, r0)     // Catch: java.lang.Throwable -> L88
            r10 = r20
            r2.O(r8, r10, r3)     // Catch: java.lang.Throwable -> L88
            goto Lb8
        L88:
            r0 = move-exception
            goto Lba
        L8a:
            r10 = r20
            r2 = r12
            android.os.IInterface r5 = r1.t()     // Catch: java.lang.Throwable -> L88
            f4.F r5 = (f4.F) r5     // Catch: java.lang.Throwable -> L88
            f4.s r9 = new f4.s     // Catch: java.lang.Throwable -> L88
            r13 = 0
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r14 = 0
            r15 = 0
            r11 = 0
            r12 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L88
            f4.i r14 = new f4.i     // Catch: java.lang.Throwable -> L88
            r14.<init>(r0, r2)     // Catch: java.lang.Throwable -> L88
            java.lang.String r15 = r3.a()     // Catch: java.lang.Throwable -> L88
            f4.t r8 = new f4.t     // Catch: java.lang.Throwable -> L88
            r13 = 0
            r10 = r9
            r9 = 1
            r11 = 0
            r12 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L88
            r5.N(r8)     // Catch: java.lang.Throwable -> L88
        Lb8:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L88
            return
        Lba:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L88
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.p.C(f4.m, com.google.android.gms.location.LocationRequest, q4.k):void");
    }

    public final void D(C0241j c0241j, boolean z2, q4.k kVar) {
        com.google.android.gms.common.d dVar;
        synchronized (this.f13763D) {
            try {
                n nVar = (n) this.f13763D.remove(c0241j);
                if (nVar == null) {
                    kVar.b(Boolean.FALSE);
                    return;
                }
                nVar.f13760f.a().a();
                if (z2) {
                    com.google.android.gms.common.d[] k3 = k();
                    if (k3 != null) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= k3.length) {
                                dVar = null;
                                break;
                            }
                            dVar = k3[i3];
                            if (StubApp.getString2("6601").equals(dVar.f11182a)) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (dVar != null && dVar.d() >= 1) {
                            F f10 = (F) t();
                            String string2 = StubApp.getString2("17502");
                            int identityHashCode = System.identityHashCode(nVar);
                            StringBuilder sb2 = new StringBuilder(String.valueOf(identityHashCode).length() + 18);
                            sb2.append(string2);
                            sb2.append(identityHashCode);
                            r rVar = new r(2, null, nVar, null, sb2.toString());
                            l lVar = new l(Boolean.TRUE, kVar);
                            Parcel g10 = f10.g();
                            g.b(g10, rVar);
                            g10.writeStrongBinder(lVar);
                            f10.L(g10, 89);
                        }
                    }
                    ((F) t()).N(new t(2, null, null, nVar, null, new i(Boolean.TRUE, kVar), null));
                } else {
                    kVar.b(Boolean.TRUE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S3.AbstractC0271e, Q3.c
    public final int j() {
        return 11717000;
    }

    @Override // S3.AbstractC0271e
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(StubApp.getString2(17442));
        return queryLocalInterface instanceof F ? (F) queryLocalInterface : new F(iBinder);
    }

    @Override // S3.AbstractC0271e
    public final com.google.android.gms.common.d[] q() {
        return i4.y.f14831c;
    }

    @Override // S3.AbstractC0271e
    public final String u() {
        return StubApp.getString2(17442);
    }

    @Override // S3.AbstractC0271e
    public final String v() {
        return StubApp.getString2(17445);
    }

    @Override // S3.AbstractC0271e
    public final void x() {
        System.currentTimeMillis();
        synchronized (this.f13762C) {
            this.f13762C.clear();
        }
        synchronized (this.f13763D) {
            this.f13763D.clear();
        }
        synchronized (this.f13764E) {
            this.f13764E.clear();
        }
    }
}
