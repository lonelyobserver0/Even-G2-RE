package Ac;

import Dc.E;
import Dc.EnumC0053b;
import Dc.z;
import Kc.A;
import Kc.AbstractC0095b;
import Kc.B;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import f4.C0879c;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt__IndentKt;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import wc.C1880E;
import wc.C1881F;
import wc.C1882G;
import wc.C1884a;
import wc.C1889f;
import wc.C1891h;
import wc.InterfaceC1887d;
import wc.InterfaceC1892i;
import wc.x;
import wc.y;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class o extends Dc.i implements InterfaceC1892i {

    /* renamed from: b, reason: collision with root package name */
    public final C1882G f361b;

    /* renamed from: c, reason: collision with root package name */
    public Socket f362c;

    /* renamed from: d, reason: collision with root package name */
    public Socket f363d;

    /* renamed from: e, reason: collision with root package name */
    public wc.r f364e;

    /* renamed from: f, reason: collision with root package name */
    public y f365f;

    /* renamed from: g, reason: collision with root package name */
    public Dc.r f366g;

    /* renamed from: h, reason: collision with root package name */
    public B f367h;

    /* renamed from: i, reason: collision with root package name */
    public A f368i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f369k;

    /* renamed from: l, reason: collision with root package name */
    public int f370l;

    /* renamed from: m, reason: collision with root package name */
    public int f371m;

    /* renamed from: n, reason: collision with root package name */
    public int f372n;

    /* renamed from: o, reason: collision with root package name */
    public int f373o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f374p;

    /* renamed from: q, reason: collision with root package name */
    public long f375q;

    public o(q connectionPool, C1882G route) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(route, "route");
        this.f361b = route;
        this.f373o = 1;
        this.f374p = new ArrayList();
        this.f375q = LongCompanionObject.MAX_VALUE;
    }

    public static void d(x client, C1882G failedRoute, IOException failure) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
        Intrinsics.checkNotNullParameter(failure, "failure");
        if (failedRoute.f22338b.type() != Proxy.Type.DIRECT) {
            C1884a c1884a = failedRoute.f22337a;
            c1884a.f22353g.connectFailed(c1884a.f22354h.h(), failedRoute.f22338b.address(), failure);
        }
        A0.c cVar = client.f22462D;
        synchronized (cVar) {
            Intrinsics.checkNotNullParameter(failedRoute, "failedRoute");
            ((LinkedHashSet) cVar.f29a).add(failedRoute);
        }
    }

    @Override // Dc.i
    public final synchronized void a(Dc.r connection, E settings) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(settings, "settings");
        this.f373o = (settings.f1546a & 16) != 0 ? settings.f1547b[4] : IntCompanionObject.MAX_VALUE;
    }

    @Override // Dc.i
    public final void b(z stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        stream.c(EnumC0053b.f1553f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
    
        r15 = r14.f361b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
    
        if (r15.f22337a.f22349c == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
    
        if (r15.f22338b.type() != java.net.Proxy.Type.HTTP) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
    
        if (r14.f362c == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f4, code lost:
    
        throw new Ac.r(new java.net.ProtocolException(com.stub.StubApp.getString2(24968)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f5, code lost:
    
        r14.f375q = java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r15, int r16, int r17, int r18, boolean r19, wc.InterfaceC1887d r20, wc.q r21) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ac.o.c(int, int, int, int, boolean, wc.d, wc.q):void");
    }

    public final void e(int i3, int i10, InterfaceC1887d interfaceC1887d, wc.q qVar) {
        Socket createSocket;
        C1882G c1882g = this.f361b;
        Proxy proxy = c1882g.f22338b;
        C1884a c1884a = c1882g.f22337a;
        Proxy.Type type = proxy.type();
        int i11 = type == null ? -1 : k.f351a[type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            createSocket = c1884a.f22348b.createSocket();
            Intrinsics.checkNotNull(createSocket);
        } else {
            createSocket = new Socket(proxy);
        }
        this.f362c = createSocket;
        qVar.connectStart(interfaceC1887d, this.f361b.f22339c, proxy);
        createSocket.setSoTimeout(i10);
        try {
            Ec.n nVar = Ec.n.f2161a;
            Ec.n.f2161a.e(createSocket, this.f361b.f22339c, i3);
            try {
                this.f367h = AbstractC0095b.d(AbstractC0095b.l(createSocket));
                this.f368i = AbstractC0095b.c(AbstractC0095b.j(createSocket));
            } catch (NullPointerException e10) {
                if (Intrinsics.areEqual(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException(Intrinsics.stringPlus("Failed to connect to ", this.f361b.f22339c));
            connectException.initCause(e11);
            throw connectException;
        }
    }

    public final void f(int i3, int i10, int i11, InterfaceC1887d interfaceC1887d, wc.q qVar) {
        B3.s sVar = new B3.s(14);
        C1882G c1882g = this.f361b;
        C1884a c1884a = c1882g.f22337a;
        String string2 = StubApp.getString2(1904);
        wc.t tVar = c1884a.f22354h;
        Intrinsics.checkNotNullParameter(tVar, string2);
        sVar.f651c = tVar;
        sVar.n(StubApp.getString2(24971), null);
        C1884a c1884a2 = c1882g.f22337a;
        sVar.l(StubApp.getString2(24972), xc.b.v(c1884a2.f22354h, true));
        sVar.l(StubApp.getString2(24973), StubApp.getString2(24974));
        sVar.l(StubApp.getString2(2015), StubApp.getString2(24975));
        wc.z request = sVar.c();
        C0879c c0879c = new C0879c(22);
        Intrinsics.checkNotNullParameter(request, "request");
        y protocol = y.f22486c;
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter("Preemptive Authenticate", StubApp.getString2(1905));
        Bc.h hVar = xc.b.f23181c;
        String name = StubApp.getString2(2419);
        Intrinsics.checkNotNullParameter(name, "name");
        String value = StubApp.getString2(24976);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        android.support.v4.media.session.b.f(name);
        android.support.v4.media.session.b.g(value, name);
        c0879c.u(name);
        c0879c.k(name, value);
        C1881F response = new C1881F(request, protocol, "Preemptive Authenticate", 407, null, c0879c.q(), hVar, null, null, null, -1L, -1L, null);
        c1884a2.f22352f.getClass();
        Intrinsics.checkNotNullParameter(response, "response");
        e(i3, i10, interfaceC1887d, qVar);
        String str = StubApp.getString2(24977) + xc.b.v(request.f22493a, true) + StubApp.getString2(24978);
        B b2 = this.f367h;
        Intrinsics.checkNotNull(b2);
        A a3 = this.f368i;
        Intrinsics.checkNotNull(a3);
        Cc.h hVar2 = new Cc.h(null, this, b2, a3);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b2.f3773a.b().g(i10, timeUnit);
        a3.f3770a.b().g(i11, timeUnit);
        hVar2.l(request.f22495c, str);
        hVar2.a();
        C1880E d8 = hVar2.d(false);
        Intrinsics.checkNotNull(d8);
        d8.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        d8.f22313a = request;
        C1881F response2 = d8.a();
        Intrinsics.checkNotNullParameter(response2, "response");
        long k3 = xc.b.k(response2);
        if (k3 != -1) {
            Cc.e k4 = hVar2.k(k3);
            xc.b.t(k4, IntCompanionObject.MAX_VALUE);
            k4.close();
        }
        int i12 = response2.f22328d;
        if (i12 == 200) {
            if (!b2.f3774b.e() || !a3.f3771b.e()) {
                throw new IOException(StubApp.getString2(24980));
            }
        } else {
            if (i12 != 407) {
                throw new IOException(Intrinsics.stringPlus("Unexpected response code for CONNECT: ", Integer.valueOf(i12)));
            }
            c1884a2.f22352f.getClass();
            Intrinsics.checkNotNullParameter(response2, "response");
            throw new IOException(StubApp.getString2(24979));
        }
    }

    public final void g(b bVar, int i3, InterfaceC1887d interfaceC1887d, wc.q qVar) {
        SSLSocket sSLSocket;
        String str;
        String trimMargin$default;
        int i10 = 0;
        C1884a c1884a = this.f361b.f22337a;
        SSLSocketFactory sSLSocketFactory = c1884a.f22349c;
        y yVar = y.f22486c;
        if (sSLSocketFactory == null) {
            List list = c1884a.f22355i;
            y yVar2 = y.f22489f;
            if (!list.contains(yVar2)) {
                this.f363d = this.f362c;
                this.f365f = yVar;
                return;
            } else {
                this.f363d = this.f362c;
                this.f365f = yVar2;
                l(i3);
                return;
            }
        }
        qVar.secureConnectStart(interfaceC1887d);
        String string2 = StubApp.getString2(24981);
        String string22 = StubApp.getString2(24982);
        C1884a c1884a2 = this.f361b.f22337a;
        SSLSocketFactory sSLSocketFactory2 = c1884a2.f22349c;
        try {
            Intrinsics.checkNotNull(sSLSocketFactory2);
            Socket socket = this.f362c;
            wc.t tVar = c1884a2.f22354h;
            Socket createSocket = sSLSocketFactory2.createSocket(socket, tVar.f22421d, tVar.f22422e, true);
            if (createSocket == null) {
                throw new NullPointerException(StubApp.getString2("24988"));
            }
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                wc.k a3 = bVar.a(sSLSocket2);
                if (a3.f22396b) {
                    Ec.n nVar = Ec.n.f2161a;
                    Ec.n.f2161a.d(sSLSocket2, c1884a2.f22354h.f22421d, c1884a2.f22355i);
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                Intrinsics.checkNotNullExpressionValue(sslSocketSession, "sslSocketSession");
                wc.r n10 = a4.f.n(sslSocketSession);
                HostnameVerifier hostnameVerifier = c1884a2.f22350d;
                Intrinsics.checkNotNull(hostnameVerifier);
                if (!hostnameVerifier.verify(c1884a2.f22354h.f22421d, sslSocketSession)) {
                    List a9 = n10.a();
                    if (a9.isEmpty()) {
                        throw new SSLPeerUnverifiedException(string2 + c1884a2.f22354h.f22421d + StubApp.getString2("24987"));
                    }
                    X509Certificate certificate = (X509Certificate) a9.get(0);
                    StringBuilder sb2 = new StringBuilder(string22);
                    sb2.append(c1884a2.f22354h.f22421d);
                    sb2.append(StubApp.getString2("24983"));
                    C1889f c1889f = C1889f.f22370c;
                    sb2.append(Y3.a.r(certificate));
                    sb2.append(StubApp.getString2("24984"));
                    sb2.append((Object) certificate.getSubjectDN().getName());
                    sb2.append(StubApp.getString2("24985"));
                    Intrinsics.checkNotNullParameter(certificate, "certificate");
                    sb2.append(CollectionsKt___CollectionsKt.plus((Collection) Ic.c.a(certificate, 7), (Iterable) Ic.c.a(certificate, 2)));
                    sb2.append(StubApp.getString2("24986"));
                    trimMargin$default = StringsKt__IndentKt.trimMargin$default(sb2.toString(), null, 1, null);
                    throw new SSLPeerUnverifiedException(trimMargin$default);
                }
                C1889f c1889f2 = c1884a2.f22351e;
                Intrinsics.checkNotNull(c1889f2);
                this.f364e = new wc.r(n10.f22413a, n10.f22414b, n10.f22415c, new l(c1889f2, n10, c1884a2, i10));
                c1889f2.a(c1884a2.f22354h.f22421d, new m(this, i10));
                if (a3.f22396b) {
                    Ec.n nVar2 = Ec.n.f2161a;
                    str = Ec.n.f2161a.f(sSLSocket2);
                } else {
                    str = null;
                }
                this.f363d = sSLSocket2;
                this.f367h = AbstractC0095b.d(AbstractC0095b.l(sSLSocket2));
                this.f368i = AbstractC0095b.c(AbstractC0095b.j(sSLSocket2));
                if (str != null) {
                    yVar = F1.o(str);
                }
                this.f365f = yVar;
                Ec.n nVar3 = Ec.n.f2161a;
                Ec.n.f2161a.a(sSLSocket2);
                qVar.secureConnectEnd(interfaceC1887d, this.f364e);
                if (this.f365f == y.f22488e) {
                    l(i3);
                }
            } catch (Throwable th) {
                th = th;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    Ec.n nVar4 = Ec.n.f2161a;
                    Ec.n.f2161a.a(sSLSocket);
                }
                if (sSLSocket != null) {
                    xc.b.d(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sSLSocket = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ae, code lost:
    
        if (Ic.c.b(r0, (java.security.cert.X509Certificate) r10.get(0)) != false) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(wc.C1884a r9, java.util.ArrayList r10) {
        /*
            r8 = this;
            java.lang.String r0 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            byte[] r0 = xc.b.f23179a
            java.util.ArrayList r0 = r8.f374p
            int r0 = r0.size()
            int r1 = r8.f373o
            r2 = 0
            if (r0 >= r1) goto Ld5
            boolean r0 = r8.j
            if (r0 == 0) goto L18
            goto Ld5
        L18:
            wc.G r0 = r8.f361b
            wc.a r1 = r0.f22337a
            boolean r1 = r1.a(r9)
            if (r1 != 0) goto L24
            goto Ld5
        L24:
            wc.t r1 = r9.f22354h
            java.lang.String r3 = r1.f22421d
            wc.a r4 = r0.f22337a
            wc.t r5 = r4.f22354h
            java.lang.String r5 = r5.f22421d
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)
            r5 = 1
            if (r3 == 0) goto L36
            return r5
        L36:
            Dc.r r3 = r8.f366g
            if (r3 != 0) goto L3c
            goto Ld5
        L3c:
            if (r10 == 0) goto Ld5
            boolean r3 = r10.isEmpty()
            if (r3 == 0) goto L46
            goto Ld5
        L46:
            java.util.Iterator r10 = r10.iterator()
        L4a:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Ld5
            java.lang.Object r3 = r10.next()
            wc.G r3 = (wc.C1882G) r3
            java.net.Proxy r6 = r3.f22338b
            java.net.Proxy$Type r6 = r6.type()
            java.net.Proxy$Type r7 = java.net.Proxy.Type.DIRECT
            if (r6 != r7) goto L4a
            java.net.Proxy r6 = r0.f22338b
            java.net.Proxy$Type r6 = r6.type()
            if (r6 != r7) goto L4a
            java.net.InetSocketAddress r3 = r3.f22339c
            java.net.InetSocketAddress r6 = r0.f22339c
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r6, r3)
            if (r3 == 0) goto L4a
            Ic.c r10 = Ic.c.f3252a
            javax.net.ssl.HostnameVerifier r0 = r9.f22350d
            if (r0 == r10) goto L79
            goto Ld5
        L79:
            byte[] r10 = xc.b.f23179a
            wc.t r10 = r4.f22354h
            int r0 = r10.f22422e
            int r3 = r1.f22422e
            if (r3 == r0) goto L84
            goto Ld5
        L84:
            java.lang.String r10 = r10.f22421d
            java.lang.String r0 = r1.f22421d
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r10)
            if (r10 == 0) goto L8f
            goto Lb0
        L8f:
            boolean r10 = r8.f369k
            if (r10 != 0) goto Ld5
            wc.r r10 = r8.f364e
            if (r10 == 0) goto Ld5
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
            java.util.List r10 = r10.a()
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto Ld5
            java.lang.Object r10 = r10.get(r2)
            java.security.cert.X509Certificate r10 = (java.security.cert.X509Certificate) r10
            boolean r10 = Ic.c.b(r0, r10)
            if (r10 == 0) goto Ld5
        Lb0:
            wc.f r9 = r9.f22351e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            kotlin.jvm.internal.Intrinsics.checkNotNull(r9)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            wc.r r10 = r8.f364e     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            java.util.List r10 = r10.a()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            r9.getClass()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            java.lang.String r1 = "hostname"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            java.lang.String r1 = "peerCertificates"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            Ac.l r1 = new Ac.l     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            r3 = 4
            r1.<init>(r9, r10, r0, r3)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            r9.a(r0, r1)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Ld5
            return r5
        Ld5:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Ac.o.h(wc.a, java.util.ArrayList):boolean");
    }

    public final boolean i(boolean z2) {
        long j;
        byte[] bArr = xc.b.f23179a;
        long nanoTime = System.nanoTime();
        Socket socket = this.f362c;
        Intrinsics.checkNotNull(socket);
        Socket socket2 = this.f363d;
        Intrinsics.checkNotNull(socket2);
        B source = this.f367h;
        Intrinsics.checkNotNull(source);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        Dc.r rVar = this.f366g;
        if (rVar != null) {
            synchronized (rVar) {
                if (rVar.f1623f) {
                    return false;
                }
                if (rVar.f1631q < rVar.f1630p) {
                    if (nanoTime >= rVar.f1632r) {
                        return false;
                    }
                }
                return true;
            }
        }
        synchronized (this) {
            j = nanoTime - this.f375q;
        }
        if (j < 10000000000L || !z2) {
            return true;
        }
        Intrinsics.checkNotNullParameter(socket2, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket2.getSoTimeout();
            try {
                socket2.setSoTimeout(1);
                return !source.a();
            } finally {
                socket2.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final Bc.e j(x client, Bc.g chain) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Socket socket = this.f363d;
        Intrinsics.checkNotNull(socket);
        B b2 = this.f367h;
        Intrinsics.checkNotNull(b2);
        A a3 = this.f368i;
        Intrinsics.checkNotNull(a3);
        Dc.r rVar = this.f366g;
        if (rVar != null) {
            return new Dc.s(client, this, chain, rVar);
        }
        int i3 = chain.f759g;
        socket.setSoTimeout(i3);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        b2.f3773a.b().g(i3, timeUnit);
        a3.f3770a.b().g(chain.f760h, timeUnit);
        return new Cc.h(client, this, b2, a3);
    }

    public final synchronized void k() {
        this.j = true;
    }

    public final void l(int i3) {
        Socket socket = this.f363d;
        Intrinsics.checkNotNull(socket);
        B source = this.f367h;
        Intrinsics.checkNotNull(source);
        A sink = this.f368i;
        Intrinsics.checkNotNull(sink);
        socket.setSoTimeout(0);
        zc.c taskRunner = zc.c.f24147h;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Cc.h hVar = new Cc.h();
        hVar.f1210d = taskRunner;
        hVar.f1213g = Dc.i.f1587a;
        String peerName = this.f361b.f22337a.f22354h.f22421d;
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(peerName, "peerName");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(socket, "<set-?>");
        hVar.f1211e = socket;
        String str = xc.b.f23184f + ' ' + peerName;
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        hVar.f1212f = str;
        Intrinsics.checkNotNullParameter(source, "<set-?>");
        hVar.f1207a = source;
        Intrinsics.checkNotNullParameter(sink, "<set-?>");
        hVar.f1208b = sink;
        Intrinsics.checkNotNullParameter(this, "listener");
        Intrinsics.checkNotNullParameter(this, "<set-?>");
        hVar.f1213g = this;
        hVar.f1209c = i3;
        Dc.r rVar = new Dc.r(hVar);
        this.f366g = rVar;
        E e10 = Dc.r.f1614D;
        this.f373o = (e10.f1546a & 16) != 0 ? e10.f1547b[4] : IntCompanionObject.MAX_VALUE;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Dc.A a3 = rVar.f1615A;
        synchronized (a3) {
            try {
                if (a3.f1537d) {
                    throw new IOException(StubApp.getString2("1551"));
                }
                Logger logger = Dc.A.f1533f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(xc.b.i(Intrinsics.stringPlus(StubApp.getString2("24989"), Dc.g.f1583a.f()), new Object[0]));
                }
                a3.f1534a.q(Dc.g.f1583a);
                a3.f1534a.flush();
            } finally {
            }
        }
        Dc.A a9 = rVar.f1615A;
        E settings = rVar.f1633s;
        synchronized (a9) {
            try {
                Intrinsics.checkNotNullParameter(settings, "settings");
                if (a9.f1537d) {
                    throw new IOException(StubApp.getString2("1551"));
                }
                a9.e(0, Integer.bitCount(settings.f1546a) * 6, 4, 0);
                int i10 = 0;
                while (i10 < 10) {
                    int i11 = i10 + 1;
                    boolean z2 = true;
                    if (((1 << i10) & settings.f1546a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        a9.f1534a.writeShort(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                        a9.f1534a.writeInt(settings.f1547b[i10]);
                    }
                    i10 = i11;
                }
                a9.f1534a.flush();
            } finally {
            }
        }
        if (rVar.f1633s.a() != 65535) {
            rVar.f1615A.A(0, r0 - Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
        }
        taskRunner.e().c(new p(rVar.f1616B, 2, rVar.f1620c), 0L);
    }

    public final String toString() {
        C1891h c1891h;
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(24990));
        C1882G c1882g = this.f361b;
        sb2.append(c1882g.f22337a.f22354h.f22421d);
        sb2.append(':');
        sb2.append(c1882g.f22337a.f22354h.f22422e);
        sb2.append(StubApp.getString2(24991));
        sb2.append(c1882g.f22338b);
        sb2.append(StubApp.getString2(24992));
        sb2.append(c1882g.f22339c);
        sb2.append(StubApp.getString2(24993));
        wc.r rVar = this.f364e;
        Object string2 = StubApp.getString2(1337);
        if (rVar != null && (c1891h = rVar.f22414b) != null) {
            string2 = c1891h;
        }
        sb2.append(string2);
        sb2.append(StubApp.getString2(24994));
        sb2.append(this.f365f);
        sb2.append('}');
        return sb2.toString();
    }
}
