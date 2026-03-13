package wc;

import com.stub.StubApp;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* renamed from: wc.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class C1884a {

    /* renamed from: a, reason: collision with root package name */
    public final m f22347a;

    /* renamed from: b, reason: collision with root package name */
    public final SocketFactory f22348b;

    /* renamed from: c, reason: collision with root package name */
    public final SSLSocketFactory f22349c;

    /* renamed from: d, reason: collision with root package name */
    public final HostnameVerifier f22350d;

    /* renamed from: e, reason: collision with root package name */
    public final C1889f f22351e;

    /* renamed from: f, reason: collision with root package name */
    public final m f22352f;

    /* renamed from: g, reason: collision with root package name */
    public final ProxySelector f22353g;

    /* renamed from: h, reason: collision with root package name */
    public final t f22354h;

    /* renamed from: i, reason: collision with root package name */
    public final List f22355i;
    public final List j;

    public C1884a(String host, int i3, m dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C1889f c1889f, m proxyAuthenticator, List protocols, List connectionSpecs, ProxySelector proxySelector) {
        boolean equals;
        boolean equals2;
        Intrinsics.checkNotNullParameter(host, "uriHost");
        Intrinsics.checkNotNullParameter(dns, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(proxyAuthenticator, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f22347a = dns;
        this.f22348b = socketFactory;
        this.f22349c = sSLSocketFactory;
        this.f22350d = hostnameVerifier;
        this.f22351e = c1889f;
        this.f22352f = proxyAuthenticator;
        this.f22353g = proxySelector;
        Ac.t tVar = new Ac.t();
        String string2 = StubApp.getString2(3589);
        String string22 = StubApp.getString2(3396);
        String scheme = sSLSocketFactory != null ? string22 : string2;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        equals = StringsKt__StringsJVMKt.equals(scheme, string2, true);
        if (equals) {
            tVar.f392d = string2;
        } else {
            equals2 = StringsKt__StringsJVMKt.equals(scheme, string22, true);
            if (!equals2) {
                throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected scheme: ", scheme));
            }
            tVar.f392d = string22;
        }
        Intrinsics.checkNotNullParameter(host, "host");
        String u2 = Ec.l.u(m.e(0, 0, 7, host));
        if (u2 == null) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected host: ", host));
        }
        tVar.f395g = u2;
        if (1 > i3 || i3 >= 65536) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("unexpected port: ", Integer.valueOf(i3)).toString());
        }
        tVar.f390b = i3;
        this.f22354h = tVar.a();
        this.f22355i = xc.b.w(protocols);
        this.j = xc.b.w(connectionSpecs);
    }

    public final boolean a(C1884a that) {
        Intrinsics.checkNotNullParameter(that, "that");
        return Intrinsics.areEqual(this.f22347a, that.f22347a) && Intrinsics.areEqual(this.f22352f, that.f22352f) && Intrinsics.areEqual(this.f22355i, that.f22355i) && Intrinsics.areEqual(this.j, that.j) && Intrinsics.areEqual(this.f22353g, that.f22353g) && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f22349c, that.f22349c) && Intrinsics.areEqual(this.f22350d, that.f22350d) && Intrinsics.areEqual(this.f22351e, that.f22351e) && this.f22354h.f22422e == that.f22354h.f22422e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1884a)) {
            return false;
        }
        C1884a c1884a = (C1884a) obj;
        return Intrinsics.areEqual(this.f22354h, c1884a.f22354h) && a(c1884a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f22351e) + ((Objects.hashCode(this.f22350d) + ((Objects.hashCode(this.f22349c) + ((this.f22353g.hashCode() + E1.a.g(E1.a.g((this.f22352f.hashCode() + ((this.f22347a.hashCode() + i2.u.d(527, 31, this.f22354h.f22425h)) * 31)) * 31, 31, this.f22355i), 31, this.j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(35416));
        t tVar = this.f22354h;
        sb2.append(tVar.f22421d);
        sb2.append(':');
        sb2.append(tVar.f22422e);
        sb2.append(StubApp.getString2(81));
        sb2.append(Intrinsics.stringPlus(StubApp.getString2(35417), this.f22353g));
        sb2.append('}');
        return sb2.toString();
    }
}
