package Cc;

import Ac.o;
import Bc.i;
import Kc.A;
import Kc.B;
import Kc.F;
import Kc.H;
import Kc.I;
import Kc.J;
import Kc.p;
import com.stub.StubApp;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p0.AbstractC1482f;
import wc.AbstractC1879D;
import wc.C1880E;
import wc.C1881F;
import wc.s;
import wc.t;
import wc.x;
import wc.y;
import wc.z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class h implements Bc.e {

    /* renamed from: a, reason: collision with root package name */
    public Object f1207a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1208b;

    /* renamed from: c, reason: collision with root package name */
    public int f1209c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1210d;

    /* renamed from: e, reason: collision with root package name */
    public Object f1211e;

    /* renamed from: f, reason: collision with root package name */
    public Object f1212f;

    /* renamed from: g, reason: collision with root package name */
    public Object f1213g;

    public h(x xVar, o connection, B source, A sink) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f1210d = xVar;
        this.f1211e = connection;
        this.f1207a = source;
        this.f1208b = sink;
        this.f1212f = new a(source);
    }

    public static final void i(h hVar, p pVar) {
        hVar.getClass();
        J j = pVar.f3838e;
        I delegate = J.f3789d;
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        pVar.f3838e = delegate;
        j.a();
        j.b();
    }

    @Override // Bc.e
    public void a() {
        ((A) this.f1208b).flush();
    }

    @Override // Bc.e
    public H b(C1881F response) {
        boolean equals;
        Intrinsics.checkNotNullParameter(response, "response");
        if (!Bc.f.a(response)) {
            return k(0L);
        }
        equals = StringsKt__StringsJVMKt.equals(StubApp.getString2(25032), C1881F.a(StubApp.getString2(25031), response), true);
        String string2 = StubApp.getString2(25083);
        if (equals) {
            t tVar = response.f22325a.f22493a;
            int i3 = this.f1209c;
            if (i3 != 4) {
                throw new IllegalStateException(Intrinsics.stringPlus(string2, Integer.valueOf(i3)).toString());
            }
            this.f1209c = 5;
            return new d(this, tVar);
        }
        long k3 = xc.b.k(response);
        if (k3 != -1) {
            return k(k3);
        }
        int i10 = this.f1209c;
        if (i10 != 4) {
            throw new IllegalStateException(Intrinsics.stringPlus(string2, Integer.valueOf(i10)).toString());
        }
        this.f1209c = 5;
        ((o) this.f1211e).k();
        Intrinsics.checkNotNullParameter(this, "this$0");
        return new g(this);
    }

    @Override // Bc.e
    public long c(C1881F response) {
        boolean equals;
        Intrinsics.checkNotNullParameter(response, "response");
        if (!Bc.f.a(response)) {
            return 0L;
        }
        equals = StringsKt__StringsJVMKt.equals(StubApp.getString2(25032), C1881F.a(StubApp.getString2(25031), response), true);
        if (equals) {
            return -1L;
        }
        return xc.b.k(response);
    }

    @Override // Bc.e
    public void cancel() {
        Socket socket = ((o) this.f1211e).f362c;
        if (socket == null) {
            return;
        }
        xc.b.d(socket);
    }

    @Override // Bc.e
    public C1880E d(boolean z2) {
        a aVar = (a) this.f1212f;
        int i3 = this.f1209c;
        if (i3 != 1 && i3 != 3) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i3)).toString());
        }
        try {
            String C10 = ((B) aVar.f1189c).C(aVar.f1188b);
            aVar.f1188b -= C10.length();
            i u2 = a4.f.u(C10);
            int i10 = u2.f766b;
            C1880E c1880e = new C1880E();
            y protocol = (y) u2.f767c;
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            c1880e.f22314b = protocol;
            c1880e.f22315c = i10;
            String message = (String) u2.f768d;
            Intrinsics.checkNotNullParameter(message, "message");
            c1880e.f22316d = message;
            c1880e.c(aVar.K());
            if (z2 && i10 == 100) {
                return null;
            }
            if (i10 == 100) {
                this.f1209c = 3;
                return c1880e;
            }
            this.f1209c = 4;
            return c1880e;
        } catch (EOFException e10) {
            throw new IOException(Intrinsics.stringPlus("unexpected end of stream on ", ((o) this.f1211e).f361b.f22337a.f22354h.g()), e10);
        }
    }

    @Override // Bc.e
    public o e() {
        return (o) this.f1211e;
    }

    @Override // Bc.e
    public void f(z request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Proxy.Type proxyType = ((o) this.f1211e).f361b.f22338b.type();
        Intrinsics.checkNotNullExpressionValue(proxyType, "connection.route().proxy.type()");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.f22494b);
        sb2.append(' ');
        t url = request.f22493a;
        if (url.f22426i || proxyType != Proxy.Type.HTTP) {
            Intrinsics.checkNotNullParameter(url, "url");
            String b2 = url.b();
            String d8 = url.d();
            if (d8 != null) {
                b2 = b2 + '?' + ((Object) d8);
            }
            sb2.append(b2);
        } else {
            sb2.append(url);
        }
        sb2.append(StubApp.getString2(24978));
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        l(request.f22495c, sb3);
    }

    @Override // Bc.e
    public void g() {
        ((A) this.f1208b).flush();
    }

    @Override // Bc.e
    public F h(z request, long j) {
        boolean equals;
        Intrinsics.checkNotNullParameter(request, "request");
        AbstractC1879D abstractC1879D = request.f22496d;
        if (abstractC1879D != null && abstractC1879D.isDuplex()) {
            throw new ProtocolException(StubApp.getString2(25084));
        }
        equals = StringsKt__StringsJVMKt.equals(StubApp.getString2(25032), request.a(StubApp.getString2(25031)), true);
        String string2 = StubApp.getString2(25083);
        if (equals) {
            int i3 = this.f1209c;
            if (i3 != 1) {
                throw new IllegalStateException(Intrinsics.stringPlus(string2, Integer.valueOf(i3)).toString());
            }
            this.f1209c = 2;
            return new c(this);
        }
        if (j == -1) {
            throw new IllegalStateException(StubApp.getString2(25085));
        }
        int i10 = this.f1209c;
        if (i10 != 1) {
            throw new IllegalStateException(Intrinsics.stringPlus(string2, Integer.valueOf(i10)).toString());
        }
        this.f1209c = 2;
        return new f(this);
    }

    public y5.a j() {
        String string2 = this.f1209c == 0 ? StubApp.getString2(22993) : "";
        if (((Long) this.f1208b) == null) {
            string2 = string2.concat(StubApp.getString2(25086));
        }
        if (((Long) this.f1212f) == null) {
            string2 = AbstractC1482f.g(string2, StubApp.getString2(25087));
        }
        if (string2.isEmpty()) {
            return new y5.a((String) this.f1210d, this.f1209c, (String) this.f1211e, (String) this.f1207a, ((Long) this.f1208b).longValue(), ((Long) this.f1212f).longValue(), (String) this.f1213g);
        }
        throw new IllegalStateException(StubApp.getString2(555).concat(string2));
    }

    public e k(long j) {
        int i3 = this.f1209c;
        if (i3 != 4) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i3)).toString());
        }
        this.f1209c = 5;
        return new e(this, j);
    }

    public void l(s headers, String requestLine) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(requestLine, "requestLine");
        int i3 = this.f1209c;
        if (i3 != 0) {
            throw new IllegalStateException(Intrinsics.stringPlus("state: ", Integer.valueOf(i3)).toString());
        }
        A a3 = (A) this.f1208b;
        a3.r(requestLine);
        String string2 = StubApp.getString2(4962);
        a3.r(string2);
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            a3.r(headers.b(i10));
            a3.r(StubApp.getString2(994));
            a3.r(headers.d(i10));
            a3.r(string2);
        }
        a3.r(string2);
        this.f1209c = 1;
    }
}
