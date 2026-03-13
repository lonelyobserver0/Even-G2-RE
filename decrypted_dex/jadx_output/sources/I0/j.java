package I0;

import H0.C0066i;
import H0.m;
import R3.C0233b;
import R3.C0236e;
import R3.r;
import R3.y;
import S3.AbstractC0271e;
import S3.C0273g;
import S3.C0279m;
import S3.C0280n;
import S3.C0281o;
import S3.K;
import T0.H;
import T0.q;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.stub.StubApp;
import java.util.Locale;
import p0.AbstractC1482f;
import r0.AbstractC1560u;
import r0.C1553n;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j implements i, q4.d {

    /* renamed from: a, reason: collision with root package name */
    public int f3088a;

    /* renamed from: b, reason: collision with root package name */
    public long f3089b;

    /* renamed from: c, reason: collision with root package name */
    public long f3090c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3091d;

    /* renamed from: e, reason: collision with root package name */
    public Object f3092e;

    public j(C0236e c0236e, int i3, C0233b c0233b, long j, long j3) {
        this.f3091d = c0236e;
        this.f3088a = i3;
        this.f3092e = c0233b;
        this.f3089b = j;
        this.f3090c = j3;
    }

    public static C0273g a(r rVar, AbstractC0271e abstractC0271e, int i3) {
        K k3 = abstractC0271e.f6511y;
        C0273g c0273g = k3 == null ? null : k3.f6466d;
        if (c0273g != null && c0273g.f6516b) {
            int[] iArr = c0273g.f6518d;
            int i10 = 0;
            if (iArr == null) {
                int[] iArr2 = c0273g.f6520f;
                if (iArr2 != null) {
                    while (i10 < iArr2.length) {
                        if (iArr2[i10] == i3) {
                            return null;
                        }
                        i10++;
                    }
                }
            } else {
                while (i10 < iArr.length) {
                    if (iArr[i10] != i3) {
                        i10++;
                    }
                }
            }
            if (rVar.f6158p < c0273g.f6519e) {
                return c0273g;
            }
        }
        return null;
    }

    @Override // I0.i
    public void b(long j, long j3) {
        this.f3089b = j;
        this.f3090c = j3;
    }

    @Override // I0.i
    public void c(C1553n c1553n, long j, int i3, boolean z2) {
        int a3;
        ((H) this.f3092e).getClass();
        int i10 = this.f3088a;
        if (i10 != -1 && i3 != (a3 = C0066i.a(i10))) {
            int i11 = AbstractC1560u.f20190a;
            Locale locale = Locale.US;
            Log.w(StubApp.getString2(2813), AbstractC1482f.e(a3, StubApp.getString2(2778), i3, StubApp.getString2(2779), StubApp.getString2(1)));
        }
        long B7 = android.support.v4.media.session.b.B(this.f3090c, j, this.f3089b, ((m) this.f3091d).f2587b);
        int a9 = c1553n.a();
        ((H) this.f3092e).a(c1553n, a9, 0);
        ((H) this.f3092e).c(B7, 1, a9, 0, null);
        this.f3088a = i3;
    }

    @Override // I0.i
    public void d(long j) {
        this.f3089b = j;
    }

    @Override // I0.i
    public void e(q qVar, int i3) {
        H w10 = qVar.w(i3, 1);
        this.f3092e = w10;
        w10.d(((m) this.f3091d).f2588c);
    }

    @Override // q4.d
    public void j(q4.j jVar) {
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j;
        long j3;
        C0236e c0236e = (C0236e) this.f3091d;
        if (c0236e.b()) {
            C0281o c0281o = (C0281o) C0280n.b().f6548a;
            if (c0281o == null || c0281o.f6550b) {
                r rVar = (r) c0236e.f6131k.get((C0233b) this.f3092e);
                if (rVar != null) {
                    Object obj = rVar.f6149f;
                    if (obj instanceof AbstractC0271e) {
                        AbstractC0271e abstractC0271e = (AbstractC0271e) obj;
                        long j10 = this.f3089b;
                        int i15 = 0;
                        boolean z2 = j10 > 0;
                        int i16 = abstractC0271e.f6506s;
                        if (c0281o != null) {
                            z2 &= c0281o.f6551c;
                            boolean z10 = abstractC0271e.f6511y != null;
                            i3 = c0281o.f6552d;
                            i10 = c0281o.f6549a;
                            if (!z10 || abstractC0271e.f()) {
                                i11 = c0281o.f6553e;
                            } else {
                                C0273g a3 = a(rVar, abstractC0271e, this.f3088a);
                                if (a3 == null) {
                                    return;
                                }
                                boolean z11 = a3.f6517c && j10 > 0;
                                i11 = a3.f6519e;
                                z2 = z11;
                            }
                        } else {
                            i3 = 5000;
                            i10 = 0;
                            i11 = 100;
                        }
                        int i17 = -1;
                        if (jVar.isSuccessful()) {
                            i13 = 0;
                        } else if (jVar.isCanceled()) {
                            i15 = -1;
                            i13 = 100;
                        } else {
                            Exception exception = jVar.getException();
                            if (exception instanceof Q3.e) {
                                Status status = ((Q3.e) exception).f5717a;
                                i12 = status.f11170a;
                                com.google.android.gms.common.b bVar = status.f11173d;
                                if (bVar != null) {
                                    i13 = i12;
                                    i15 = bVar.f11176b;
                                }
                            } else {
                                i12 = 101;
                            }
                            i13 = i12;
                            i15 = -1;
                        }
                        if (z2) {
                            long currentTimeMillis = System.currentTimeMillis();
                            i14 = i11;
                            i17 = (int) (SystemClock.elapsedRealtime() - this.f3090c);
                            j3 = currentTimeMillis;
                            j = j10;
                        } else {
                            i14 = i11;
                            j = 0;
                            j3 = 0;
                        }
                        y yVar = new y(new C0279m(this.f3088a, i13, i15, j, j3, null, null, i16, i17), i10, i3, i14);
                        c4.h hVar = c0236e.f6135p;
                        hVar.sendMessage(hVar.obtainMessage(18, yVar));
                    }
                }
            }
        }
    }

    public j(m mVar) {
        this.f3091d = mVar;
        this.f3089b = -9223372036854775807L;
        this.f3090c = 0L;
        this.f3088a = -1;
    }
}
