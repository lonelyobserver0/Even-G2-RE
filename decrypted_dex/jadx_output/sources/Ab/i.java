package Ab;

import com.stub.StubApp;
import l4.E0;
import org.slf4j.LoggerFactory;
import rc.C1589d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i {

    /* renamed from: i, reason: collision with root package name */
    public static final org.slf4j.a f285i = LoggerFactory.getLogger((Class<?>) i.class);

    /* renamed from: a, reason: collision with root package name */
    public final j f286a;

    /* renamed from: b, reason: collision with root package name */
    public final wb.f f287b;

    /* renamed from: c, reason: collision with root package name */
    public final C1589d f288c;

    /* renamed from: d, reason: collision with root package name */
    public f f289d = f.f271c;

    /* renamed from: e, reason: collision with root package name */
    public int f290e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f291f = 1;

    /* renamed from: g, reason: collision with root package name */
    public int f292g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final E0 f293h;

    public i(wb.f fVar, C1589d c1589d) {
        E0 e02 = new E0(this);
        this.f293h = e02;
        this.f287b = fVar;
        this.f288c = c1589d;
        this.f286a = new j(e02);
    }

    public final void a(int i3) {
        if (this.f286a.g()) {
            f285i.n(StubApp.getString2(456));
        } else {
            this.f290e = Math.max(i3, 0);
        }
    }

    public final void b(int i3) {
        if (i3 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(457));
        }
        if (this.f286a.g()) {
            f285i.n(StubApp.getString2(456));
        } else {
            this.f292g = i3;
        }
    }

    public final void c(int i3) {
        if (i3 <= 0) {
            throw new IllegalArgumentException(StubApp.getString2(458));
        }
        if (this.f286a.g()) {
            f285i.n(StubApp.getString2(456));
        } else {
            this.f291f = i3;
        }
    }

    public final synchronized void d(Bb.a aVar, boolean z2) {
        if (this.f286a.g()) {
            f285i.n(StubApp.getString2("456"));
            return;
        }
        E0 e02 = this.f293h;
        C1589d c1589d = ((i) e02.f16038c).f288c;
        e02.B().execute(new a(e02, this));
        g gVar = new g(this.f287b, Math.max(0, this.f290e), Math.max(0, this.f291f), Math.max(1, this.f292g));
        j jVar = this.f286a;
        f fVar = this.f289d;
        jVar.getClass();
        j.f294c.c(fVar.name(), StubApp.getString2("459"));
        Cb.f fVar2 = new Cb.f(fVar, aVar, z2);
        Mb.a aVar2 = new Mb.a(jVar, gVar);
        jVar.f4728a = aVar2;
        fVar2.e(aVar2);
    }
}
