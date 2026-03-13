package wc;

import com.stub.StubApp;
import f4.C0879c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wc.E, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1880E {

    /* renamed from: a, reason: collision with root package name */
    public z f22313a;

    /* renamed from: b, reason: collision with root package name */
    public y f22314b;

    /* renamed from: d, reason: collision with root package name */
    public String f22316d;

    /* renamed from: e, reason: collision with root package name */
    public r f22317e;

    /* renamed from: g, reason: collision with root package name */
    public da.F f22319g;

    /* renamed from: h, reason: collision with root package name */
    public C1881F f22320h;

    /* renamed from: i, reason: collision with root package name */
    public C1881F f22321i;
    public C1881F j;

    /* renamed from: k, reason: collision with root package name */
    public long f22322k;

    /* renamed from: l, reason: collision with root package name */
    public long f22323l;

    /* renamed from: m, reason: collision with root package name */
    public Ac.e f22324m;

    /* renamed from: c, reason: collision with root package name */
    public int f22315c = -1;

    /* renamed from: f, reason: collision with root package name */
    public C0879c f22318f = new C0879c(22);

    public static void b(String str, C1881F c1881f) {
        if (c1881f == null) {
            return;
        }
        if (c1881f.f22331g != null) {
            throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".body != null").toString());
        }
        if (c1881f.f22332h != null) {
            throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".networkResponse != null").toString());
        }
        if (c1881f.j != null) {
            throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".cacheResponse != null").toString());
        }
        if (c1881f.f22333k != null) {
            throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".priorResponse != null").toString());
        }
    }

    public final C1881F a() {
        int i3 = this.f22315c;
        if (i3 < 0) {
            throw new IllegalStateException(Intrinsics.stringPlus("code < 0: ", Integer.valueOf(i3)).toString());
        }
        z zVar = this.f22313a;
        if (zVar == null) {
            throw new IllegalStateException(StubApp.getString2(35407));
        }
        y yVar = this.f22314b;
        if (yVar == null) {
            throw new IllegalStateException(StubApp.getString2(35406));
        }
        String str = this.f22316d;
        if (str != null) {
            return new C1881F(zVar, yVar, str, i3, this.f22317e, this.f22318f.q(), this.f22319g, this.f22320h, this.f22321i, this.j, this.f22322k, this.f22323l, this.f22324m);
        }
        throw new IllegalStateException(StubApp.getString2(34332));
    }

    public final void c(s headers) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        C0879c c10 = headers.c();
        Intrinsics.checkNotNullParameter(c10, "<set-?>");
        this.f22318f = c10;
    }
}
