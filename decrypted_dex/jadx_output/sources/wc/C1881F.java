package wc;

import com.stub.StubApp;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wc.F, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1881F implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final z f22325a;

    /* renamed from: b, reason: collision with root package name */
    public final y f22326b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22327c;

    /* renamed from: d, reason: collision with root package name */
    public final int f22328d;

    /* renamed from: e, reason: collision with root package name */
    public final r f22329e;

    /* renamed from: f, reason: collision with root package name */
    public final s f22330f;

    /* renamed from: g, reason: collision with root package name */
    public final da.F f22331g;

    /* renamed from: h, reason: collision with root package name */
    public final C1881F f22332h;
    public final C1881F j;

    /* renamed from: k, reason: collision with root package name */
    public final C1881F f22333k;

    /* renamed from: l, reason: collision with root package name */
    public final long f22334l;

    /* renamed from: m, reason: collision with root package name */
    public final long f22335m;

    /* renamed from: n, reason: collision with root package name */
    public final Ac.e f22336n;

    public C1881F(z request, y protocol, String message, int i3, r rVar, s headers, da.F f10, C1881F c1881f, C1881F c1881f2, C1881F c1881f3, long j, long j3, Ac.e eVar) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f22325a = request;
        this.f22326b = protocol;
        this.f22327c = message;
        this.f22328d = i3;
        this.f22329e = rVar;
        this.f22330f = headers;
        this.f22331g = f10;
        this.f22332h = c1881f;
        this.j = c1881f2;
        this.f22333k = c1881f3;
        this.f22334l = j;
        this.f22335m = j3;
        this.f22336n = eVar;
    }

    public static String a(String name, C1881F c1881f) {
        c1881f.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        String a3 = c1881f.f22330f.a(name);
        if (a3 == null) {
            return null;
        }
        return a3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        da.F f10 = this.f22331g;
        if (f10 == null) {
            throw new IllegalStateException(StubApp.getString2(35408));
        }
        f10.close();
    }

    public final C1880E d() {
        Intrinsics.checkNotNullParameter(this, "response");
        C1880E c1880e = new C1880E();
        c1880e.f22313a = this.f22325a;
        c1880e.f22314b = this.f22326b;
        c1880e.f22315c = this.f22328d;
        c1880e.f22316d = this.f22327c;
        c1880e.f22317e = this.f22329e;
        c1880e.f22318f = this.f22330f.c();
        c1880e.f22319g = this.f22331g;
        c1880e.f22320h = this.f22332h;
        c1880e.f22321i = this.j;
        c1880e.j = this.f22333k;
        c1880e.f22322k = this.f22334l;
        c1880e.f22323l = this.f22335m;
        c1880e.f22324m = this.f22336n;
        return c1880e;
    }

    public final String toString() {
        return StubApp.getString2(35409) + this.f22326b + StubApp.getString2(573) + this.f22328d + StubApp.getString2(2061) + this.f22327c + StubApp.getString2(9615) + this.f22325a.f22493a + '}';
    }
}
