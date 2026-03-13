package l4;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Objects;

/* renamed from: l4.o0, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1203o0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ M1 f16566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC1212t0 f16567c;

    public /* synthetic */ RunnableC1203o0(BinderC1212t0 binderC1212t0, M1 m12, int i3, boolean z2) {
        this.f16565a = i3;
        this.f16567c = binderC1212t0;
        this.f16566b = m12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16565a) {
            case 0:
                BinderC1212t0 binderC1212t0 = this.f16567c;
                binderC1212t0.f16629e.A();
                binderC1212t0.f16629e.W(this.f16566b);
                break;
            case 1:
                BinderC1212t0 binderC1212t02 = this.f16567c;
                binderC1212t02.f16629e.A();
                F1 f12 = binderC1212t02.f16629e;
                f12.b().k();
                f12.k0();
                M1 m12 = this.f16566b;
                S3.D.h(m12);
                String str = m12.f16165a;
                S3.D.e(str);
                int i3 = 0;
                if (f12.d0().u(null, AbstractC1148D.f16031z0)) {
                    f12.f().getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int s10 = f12.d0().s(null, AbstractC1148D.f15996i0);
                    f12.d0();
                    long longValue = currentTimeMillis - ((Long) AbstractC1148D.f15984e.a(null)).longValue();
                    while (i3 < s10 && f12.G(longValue, null)) {
                        i3++;
                    }
                } else {
                    f12.d0();
                    long intValue = ((Integer) AbstractC1148D.f16002l.a(null)).intValue();
                    while (i3 < intValue && f12.G(0L, str)) {
                        i3++;
                    }
                }
                if (f12.d0().u(null, AbstractC1148D.f15923A0)) {
                    f12.b().k();
                    f12.F();
                }
                int a3 = Xa.h.a(m12.f16164H);
                C1 c12 = f12.f16067k;
                c12.k();
                if (a3 == 2 && !C1.n(str)) {
                    C1179g0 c1179g0 = c12.f16651b.f16059a;
                    F1.S(c1179g0);
                    com.google.android.gms.internal.measurement.J0 w10 = c1179g0.w(str);
                    if (w10 != null && w10.D() && !w10.E().q().isEmpty()) {
                        f12.a().f16249p.c(str, StubApp.getString2(20868));
                        f12.f().getClass();
                        f12.r(System.currentTimeMillis(), str);
                        break;
                    }
                }
                break;
            case 2:
                BinderC1212t0 binderC1212t03 = this.f16567c;
                binderC1212t03.f16629e.A();
                F1 f13 = binderC1212t03.f16629e;
                f13.b().k();
                f13.k0();
                M1 m13 = this.f16566b;
                S3.D.e(m13.f16165a);
                f13.a0(m13);
                break;
            case 3:
                BinderC1212t0 binderC1212t04 = this.f16567c;
                binderC1212t04.f16629e.A();
                String string2 = StubApp.getString2(19778);
                F1 f14 = binderC1212t04.f16629e;
                if (f14.f16047B != null) {
                    ArrayList arrayList = new ArrayList();
                    f14.f16048C = arrayList;
                    arrayList.addAll(f14.f16047B);
                }
                C1199n c1199n = f14.f16061c;
                F1.S(c1199n);
                C1200n0 c1200n0 = (C1200n0) c1199n.f4728a;
                M1 m14 = this.f16566b;
                String str2 = m14.f16165a;
                S3.D.h(str2);
                S3.D.e(str2);
                c1199n.k();
                c1199n.l();
                try {
                    SQLiteDatabase b02 = c1199n.b0();
                    String[] strArr = {str2};
                    int delete = b02.delete(StubApp.getString2("19782"), string2, strArr) + b02.delete(StubApp.getString2("973"), string2, strArr) + b02.delete(StubApp.getString2("20572"), string2, strArr) + b02.delete(StubApp.getString2("19780"), string2, strArr) + b02.delete(StubApp.getString2("19781"), string2, strArr) + b02.delete(StubApp.getString2("19783"), string2, strArr) + b02.delete(StubApp.getString2("19784"), string2, strArr) + b02.delete(StubApp.getString2("20581"), string2, strArr) + b02.delete(StubApp.getString2("19787"), string2, strArr) + b02.delete(StubApp.getString2("20595"), string2, strArr) + b02.delete(StubApp.getString2("3809"), string2, strArr) + b02.delete(StubApp.getString2("18357"), string2, strArr) + b02.delete(StubApp.getString2("3130"), string2, strArr);
                    if (c1200n0.f16539d.u(null, AbstractC1148D.f15997i1)) {
                        delete += b02.delete(StubApp.getString2("19789"), string2, strArr);
                    }
                    if (delete > 0) {
                        T t3 = c1200n0.f16541f;
                        C1200n0.l(t3);
                        t3.f16249p.d(StubApp.getString2("20866"), str2, Integer.valueOf(delete));
                    }
                } catch (SQLiteException e10) {
                    T t10 = c1200n0.f16541f;
                    C1200n0.l(t10);
                    t10.f16242f.d(StubApp.getString2(20867), T.s(str2), e10);
                }
                if (m14.f16172h) {
                    f14.W(m14);
                    break;
                }
                break;
            case 4:
                BinderC1212t0 binderC1212t05 = this.f16567c;
                binderC1212t05.f16629e.A();
                F1 f15 = binderC1212t05.f16629e;
                f15.b().k();
                f15.k0();
                M1 m15 = this.f16566b;
                S3.D.e(m15.f16165a);
                f15.l0(m15);
                f15.m0(m15);
                break;
            case 5:
                F1 f16 = this.f16567c.f16629e;
                f16.A();
                f16.m0(this.f16566b);
                break;
            default:
                F1 f17 = this.f16567c.f16629e;
                f17.A();
                f17.l0(this.f16566b);
                break;
        }
    }

    public RunnableC1203o0(BinderC1212t0 binderC1212t0, M1 m12, int i3) {
        this.f16565a = i3;
        switch (i3) {
            case 1:
                this.f16566b = m12;
                Objects.requireNonNull(binderC1212t0);
                this.f16567c = binderC1212t0;
                break;
            case 2:
                this.f16566b = m12;
                Objects.requireNonNull(binderC1212t0);
                this.f16567c = binderC1212t0;
                break;
            case 3:
                this.f16566b = m12;
                Objects.requireNonNull(binderC1212t0);
                this.f16567c = binderC1212t0;
                break;
            case 4:
                this.f16566b = m12;
                Objects.requireNonNull(binderC1212t0);
                this.f16567c = binderC1212t0;
                break;
            default:
                this.f16566b = m12;
                Objects.requireNonNull(binderC1212t0);
                this.f16567c = binderC1212t0;
                break;
        }
    }
}
