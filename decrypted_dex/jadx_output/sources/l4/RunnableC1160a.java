package l4;

import com.stub.StubApp;
import java.util.Objects;
import t.C1692e;

/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class RunnableC1160a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f16340c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC1146B f16341d;

    public RunnableC1160a(C1219x c1219x, String str, long j, int i3) {
        this.f16338a = i3;
        switch (i3) {
            case 1:
                this.f16339b = str;
                this.f16340c = j;
                Objects.requireNonNull(c1219x);
                this.f16341d = c1219x;
                break;
            default:
                this.f16339b = str;
                this.f16340c = j;
                Objects.requireNonNull(c1219x);
                this.f16341d = c1219x;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16338a) {
            case 0:
                C1219x c1219x = (C1219x) this.f16341d;
                c1219x.k();
                String str = (String) this.f16339b;
                S3.D.e(str);
                C1692e c1692e = c1219x.f16653c;
                boolean isEmpty = c1692e.isEmpty();
                long j = this.f16340c;
                if (isEmpty) {
                    c1219x.f16654d = j;
                }
                Integer num = (Integer) c1692e.get(str);
                if (num == null) {
                    if (c1692e.f21040c < 100) {
                        c1692e.put(str, 1);
                        c1219x.f16652b.put(str, Long.valueOf(j));
                        break;
                    } else {
                        T t3 = ((C1200n0) c1219x.f4728a).f16541f;
                        C1200n0.l(t3);
                        t3.j.b(StubApp.getString2(20327));
                        break;
                    }
                } else {
                    c1692e.put(str, Integer.valueOf(num.intValue() + 1));
                    break;
                }
            case 1:
                C1219x c1219x2 = (C1219x) this.f16341d;
                c1219x2.k();
                String str2 = (String) this.f16339b;
                S3.D.e(str2);
                C1692e c1692e2 = c1219x2.f16653c;
                Integer num2 = (Integer) c1692e2.get(str2);
                C1200n0 c1200n0 = (C1200n0) c1219x2.f4728a;
                if (num2 == null) {
                    T t10 = c1200n0.f16541f;
                    C1200n0.l(t10);
                    t10.f16242f.c(str2, StubApp.getString2(20326));
                    break;
                } else {
                    C1162a1 c1162a1 = c1200n0.f16546m;
                    C1200n0.k(c1162a1);
                    X0 q10 = c1162a1.q(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue != 0) {
                        c1692e2.put(str2, Integer.valueOf(intValue));
                        break;
                    } else {
                        c1692e2.remove(str2);
                        C1692e c1692e3 = c1219x2.f16652b;
                        Long l9 = (Long) c1692e3.get(str2);
                        long j3 = this.f16340c;
                        T t11 = c1200n0.f16541f;
                        if (l9 == null) {
                            C1200n0.l(t11);
                            t11.f16242f.b(StubApp.getString2(20324));
                        } else {
                            long longValue = j3 - l9.longValue();
                            c1692e3.remove(str2);
                            c1219x2.p(str2, longValue, q10);
                        }
                        if (c1692e2.isEmpty()) {
                            long j10 = c1219x2.f16654d;
                            if (j10 != 0) {
                                c1219x2.o(j3 - j10, q10);
                                c1219x2.f16654d = 0L;
                                break;
                            } else {
                                C1200n0.l(t11);
                                t11.f16242f.b(StubApp.getString2(20325));
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                X0 x02 = (X0) this.f16339b;
                long j11 = this.f16340c;
                C1162a1 c1162a12 = (C1162a1) this.f16341d;
                c1162a12.o(x02, false, j11);
                c1162a12.f16349e = null;
                C1189j1 o5 = ((C1200n0) c1162a12.f4728a).o();
                o5.k();
                o5.l();
                o5.y(new O0(o5, (X0) null));
                break;
        }
    }

    public RunnableC1160a(C1162a1 c1162a1, X0 x02, long j) {
        this.f16338a = 2;
        this.f16339b = x02;
        this.f16340c = j;
        Objects.requireNonNull(c1162a1);
        this.f16341d = c1162a1;
    }
}
