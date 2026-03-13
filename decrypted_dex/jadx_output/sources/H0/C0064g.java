package H0;

import com.stub.StubApp;
import r0.C1553n;

/* renamed from: H0.g, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class C0064g implements T0.o {

    /* renamed from: a, reason: collision with root package name */
    public final I0.i f2554a;

    /* renamed from: b, reason: collision with root package name */
    public final C1553n f2555b;

    /* renamed from: c, reason: collision with root package name */
    public final C1553n f2556c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2557d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2558e;

    /* renamed from: f, reason: collision with root package name */
    public final l f2559f;

    /* renamed from: g, reason: collision with root package name */
    public T0.q f2560g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2561h;

    /* renamed from: i, reason: collision with root package name */
    public volatile long f2562i;
    public volatile int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2563k;

    /* renamed from: l, reason: collision with root package name */
    public long f2564l;

    /* renamed from: m, reason: collision with root package name */
    public long f2565m;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public C0064g(m mVar, int i3) {
        char c10;
        I0.i dVar;
        I0.i iVar;
        this.f2557d = i3;
        String str = mVar.f2588c.f18216n;
        str.getClass();
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals(StubApp.getString2(2393))) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case -1662541442:
                if (str.equals(StubApp.getString2(1610))) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case -1606874997:
                if (str.equals(StubApp.getString2(1625))) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case -53558318:
                if (str.equals(StubApp.getString2(468))) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 187078296:
                if (str.equals(StubApp.getString2(1629))) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 187094639:
                if (str.equals(StubApp.getString2(76))) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 1187890754:
                if (str.equals(StubApp.getString2(2392))) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 1331836730:
                if (str.equals(StubApp.getString2(469))) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            case 1503095341:
                if (str.equals(StubApp.getString2(1624))) {
                    c10 = '\b';
                    break;
                }
                c10 = 65535;
                break;
            case 1504891608:
                if (str.equals(StubApp.getString2(1609))) {
                    c10 = '\t';
                    break;
                }
                c10 = 65535;
                break;
            case 1599127256:
                if (str.equals(StubApp.getString2(2391))) {
                    c10 = '\n';
                    break;
                }
                c10 = 65535;
                break;
            case 1599127257:
                if (str.equals(StubApp.getString2(1614))) {
                    c10 = 11;
                    break;
                }
                c10 = 65535;
                break;
            case 1903231877:
                if (str.equals(StubApp.getString2(83))) {
                    c10 = '\f';
                    break;
                }
                c10 = 65535;
                break;
            case 1903589369:
                if (str.equals(StubApp.getString2(84))) {
                    c10 = '\r';
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
                dVar = new I0.d(mVar, 0);
                iVar = dVar;
                break;
            case 1:
                dVar = new I0.e(mVar, 1);
                iVar = dVar;
                break;
            case 2:
            case '\b':
                dVar = new I0.c(mVar);
                iVar = dVar;
                break;
            case 3:
                dVar = mVar.f2590e.equals(StubApp.getString2(2394)) ? new I0.f(mVar) : new I0.a(mVar);
                iVar = dVar;
                break;
            case 4:
                dVar = new I0.b(mVar);
                iVar = dVar;
                break;
            case 5:
            case '\f':
            case '\r':
                dVar = new I0.j(mVar);
                iVar = dVar;
                break;
            case 6:
                dVar = new I0.g(mVar);
                iVar = dVar;
                break;
            case 7:
                dVar = new I0.e(mVar, 0);
                iVar = dVar;
                break;
            case '\t':
                dVar = new I0.h(mVar);
                iVar = dVar;
                break;
            case '\n':
                dVar = new I0.k(mVar);
                iVar = dVar;
                break;
            case 11:
                dVar = new I0.d(mVar, 1);
                iVar = dVar;
                break;
            default:
                iVar = null;
                break;
        }
        iVar.getClass();
        this.f2554a = iVar;
        this.f2555b = new C1553n(65507);
        this.f2556c = new C1553n();
        this.f2558e = new Object();
        this.f2559f = new l();
        this.f2562i = -9223372036854775807L;
        this.j = -1;
        this.f2564l = -9223372036854775807L;
        this.f2565m = -9223372036854775807L;
    }

    @Override // T0.o
    public final void b(long j, long j3) {
        synchronized (this.f2558e) {
            try {
                if (!this.f2563k) {
                    this.f2563k = true;
                }
                this.f2564l = j;
                this.f2565m = j3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00cc  */
    @Override // T0.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(T0.p r18, T0.s r19) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.C0064g.c(T0.p, T0.s):int");
    }

    @Override // T0.o
    public final void f(T0.q qVar) {
        this.f2554a.e(qVar, this.f2557d);
        qVar.q();
        qVar.D(new T0.t(-9223372036854775807L));
        this.f2560g = qVar;
    }

    @Override // T0.o
    public final boolean h(T0.p pVar) {
        throw new UnsupportedOperationException(StubApp.getString2(2396));
    }

    @Override // T0.o
    public final void release() {
    }
}
