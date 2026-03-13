package Bc;

import Ac.j;
import Ac.o;
import Ac.r;
import B3.s;
import Dc.C0052a;
import Kc.AbstractC0095b;
import Kc.q;
import a.AbstractC0378a;
import com.stub.StubApp;
import da.F;
import f4.C0879c;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import wc.AbstractC1879D;
import wc.C1880E;
import wc.C1881F;
import wc.C1882G;
import wc.C1884a;
import wc.C1889f;
import wc.l;
import wc.m;
import wc.t;
import wc.u;
import wc.v;
import wc.x;
import wc.z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f748a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f749b;

    public a(m cookieJar) {
        Intrinsics.checkNotNullParameter(cookieJar, "cookieJar");
        this.f749b = cookieJar;
    }

    public static int d(C1881F c1881f, int i3) {
        String a3 = C1881F.a(StubApp.getString2(25025), c1881f);
        if (a3 == null) {
            return i3;
        }
        if (!new Regex(StubApp.getString2(25026)).matches(a3)) {
            return IntCompanionObject.MAX_VALUE;
        }
        Integer valueOf = Integer.valueOf(a3);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(header)");
        return valueOf.intValue();
    }

    @Override // wc.u
    public final C1881F a(g chain) {
        int i3;
        int i10;
        boolean equals;
        F f10;
        boolean z2;
        SSLSocketFactory sSLSocketFactory;
        Ic.c cVar;
        C1889f c1889f;
        switch (this.f748a) {
            case 0:
                Intrinsics.checkNotNullParameter(chain, "chain");
                z request = chain.f757e;
                s b2 = request.b();
                String string2 = StubApp.getString2(466);
                String string22 = StubApp.getString2(2415);
                AbstractC1879D abstractC1879D = request.f22496d;
                if (abstractC1879D != null) {
                    v contentType = abstractC1879D.getContentType();
                    if (contentType != null) {
                        b2.l(string2, contentType.f22429a);
                    }
                    long contentLength = abstractC1879D.contentLength();
                    String string23 = StubApp.getString2(25031);
                    if (contentLength != -1) {
                        b2.l(string22, String.valueOf(contentLength));
                        b2.o(string23);
                    } else {
                        b2.l(string23, StubApp.getString2(25032));
                        b2.o(string22);
                    }
                }
                String string24 = StubApp.getString2(24972);
                String a3 = request.a(string24);
                t url = request.f22493a;
                if (a3 == null) {
                    i3 = 0;
                    b2.l(string24, xc.b.v(url, false));
                } else {
                    i3 = 0;
                }
                String string25 = StubApp.getString2(2411);
                if (request.a(string25) == null) {
                    b2.l(string25, StubApp.getString2(24974));
                }
                String string26 = StubApp.getString2(23277);
                String a9 = request.a(string26);
                String string27 = StubApp.getString2(20159);
                if (a9 == null && request.a(StubApp.getString2(405)) == null) {
                    b2.l(string26, string27);
                    i10 = 1;
                } else {
                    i10 = i3;
                }
                m mVar = (m) this.f749b;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                List emptyList = CollectionsKt.emptyList();
                if (!emptyList.isEmpty()) {
                    StringBuilder sb2 = new StringBuilder();
                    for (Object obj : emptyList) {
                        int i11 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        l lVar = (l) obj;
                        if (i3 > 0) {
                            sb2.append(StubApp.getString2(5156));
                        }
                        sb2.append(lVar.f22402a);
                        sb2.append('=');
                        sb2.append(lVar.f22403b);
                        i3 = i11;
                    }
                    String sb3 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
                    b2.l(StubApp.getString2(25033), sb3);
                }
                String string28 = StubApp.getString2(2015);
                if (request.a(string28) == null) {
                    b2.l(string28, StubApp.getString2(24975));
                }
                C1881F b10 = chain.b(b2.c());
                wc.s sVar = b10.f22330f;
                f.b(mVar, url, sVar);
                C1880E d8 = b10.d();
                Intrinsics.checkNotNullParameter(request, "request");
                d8.f22313a = request;
                if (i10 != 0) {
                    String string29 = StubApp.getString2(2413);
                    equals = StringsKt__StringsJVMKt.equals(string27, C1881F.a(string29, b10), true);
                    if (equals && f.a(b10) && (f10 = b10.f22331g) != null) {
                        q qVar = new q(f10.I());
                        C0879c c10 = sVar.c();
                        c10.u(string29);
                        c10.u(string22);
                        d8.c(c10.q());
                        C1881F.a(string2, b10);
                        d8.f22319g = new h(-1L, AbstractC0095b.d(qVar));
                    }
                }
                return d8.a();
            default:
                Intrinsics.checkNotNullParameter(chain, "chain");
                z zVar = chain.f757e;
                j jVar = chain.f753a;
                List emptyList2 = CollectionsKt.emptyList();
                C1881F c1881f = null;
                int i12 = 0;
                z request2 = zVar;
                while (true) {
                    boolean z10 = true;
                    while (true) {
                        jVar.getClass();
                        Intrinsics.checkNotNullParameter(request2, "request");
                        if (jVar.f344m != null) {
                            throw new IllegalStateException(StubApp.getString2(6068));
                        }
                        synchronized (jVar) {
                            if (jVar.f346p) {
                                throw new IllegalStateException(StubApp.getString2("25030"));
                            }
                            if (jVar.f345n) {
                                throw new IllegalStateException(StubApp.getString2("6068"));
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                        if (z10) {
                            Ac.q qVar2 = jVar.f337d;
                            t tVar = request2.f22493a;
                            boolean z11 = tVar.f22426i;
                            x xVar = jVar.f334a;
                            if (z11) {
                                SSLSocketFactory sSLSocketFactory2 = xVar.f22476q;
                                if (sSLSocketFactory2 == null) {
                                    throw new IllegalStateException(StubApp.getString2(25027));
                                }
                                Ic.c cVar2 = xVar.f22480v;
                                c1889f = xVar.f22481w;
                                sSLSocketFactory = sSLSocketFactory2;
                                cVar = cVar2;
                            } else {
                                sSLSocketFactory = null;
                                cVar = null;
                                c1889f = null;
                            }
                            jVar.j = new Ac.f(qVar2, new C1884a(tVar.f22421d, tVar.f22422e, xVar.f22472l, xVar.f22475p, sSLSocketFactory, cVar, c1889f, xVar.f22474n, xVar.f22479t, xVar.f22478s, xVar.f22473m), jVar, jVar.f338e);
                        }
                        try {
                            if (jVar.f348r) {
                                throw new IOException(StubApp.getString2("13498"));
                            }
                            try {
                                C1881F b11 = chain.b(request2);
                                if (c1881f != null) {
                                    C1880E d10 = b11.d();
                                    C1880E d11 = c1881f.d();
                                    d11.f22319g = null;
                                    C1881F a10 = d11.a();
                                    if (a10.f22331g != null) {
                                        throw new IllegalArgumentException(StubApp.getString2("25028"));
                                    }
                                    d10.j = a10;
                                    b11 = d10.a();
                                }
                                c1881f = b11;
                                Ac.e eVar = jVar.f344m;
                                request2 = b(c1881f, eVar);
                                if (request2 == null) {
                                    if (eVar != null && eVar.f314a) {
                                        if (jVar.f343l) {
                                            throw new IllegalStateException(StubApp.getString2("6068"));
                                        }
                                        jVar.f343l = true;
                                        jVar.f339f.j();
                                    }
                                    z2 = false;
                                } else {
                                    z2 = false;
                                    AbstractC1879D abstractC1879D2 = request2.f22496d;
                                    if (abstractC1879D2 == null || !abstractC1879D2.isOneShot()) {
                                        F f11 = c1881f.f22331g;
                                        if (f11 != null) {
                                            xc.b.c(f11);
                                        }
                                        i12++;
                                        if (i12 > 20) {
                                            throw new ProtocolException(Intrinsics.stringPlus(StubApp.getString2("25029"), Integer.valueOf(i12)));
                                        }
                                        jVar.g(true);
                                    }
                                }
                            } catch (r e10) {
                                if (!c(e10.f386b, jVar, request2, false)) {
                                    IOException iOException = e10.f385a;
                                    xc.b.z(iOException, emptyList2);
                                    throw iOException;
                                }
                                emptyList2 = CollectionsKt.plus((Collection<? extends IOException>) emptyList2, e10.f385a);
                                jVar.g(true);
                            } catch (IOException e11) {
                                if (!c(e11, jVar, request2, !(e11 instanceof C0052a))) {
                                    xc.b.z(e11, emptyList2);
                                    throw e11;
                                }
                                emptyList2 = CollectionsKt.plus((Collection<? extends IOException>) emptyList2, e11);
                                jVar.g(true);
                            }
                        } catch (Throwable th) {
                            jVar.g(true);
                            throw th;
                        }
                        z10 = false;
                    }
                }
                jVar.g(z2);
                return c1881f;
        }
    }

    public z b(C1881F response, Ac.e eVar) {
        o oVar;
        String link;
        Ac.t tVar;
        AbstractC1879D abstractC1879D;
        C1881F c1881f;
        C1882G c1882g = (eVar == null || (oVar = (o) eVar.f319f) == null) ? null : oVar.f361b;
        int i3 = response.f22328d;
        z zVar = response.f22325a;
        String method = zVar.f22494b;
        if (i3 != 307 && i3 != 308) {
            if (i3 == 401) {
                ((x) this.f749b).f22469g.getClass();
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
            if (i3 == 421) {
                AbstractC1879D abstractC1879D2 = zVar.f22496d;
                if ((abstractC1879D2 == null || !abstractC1879D2.isOneShot()) && eVar != null && !Intrinsics.areEqual(((C1884a) ((Ac.f) eVar.f317d).f324e).f22354h.f22421d, ((o) eVar.f319f).f361b.f22337a.f22354h.f22421d)) {
                    o oVar2 = (o) eVar.f319f;
                    synchronized (oVar2) {
                        oVar2.f369k = true;
                    }
                    return response.f22325a;
                }
            } else if (i3 == 503) {
                C1881F c1881f2 = response.f22333k;
                if ((c1881f2 == null || c1881f2.f22328d != 503) && d(response, IntCompanionObject.MAX_VALUE) == 0) {
                    return response.f22325a;
                }
            } else {
                if (i3 == 407) {
                    Intrinsics.checkNotNull(c1882g);
                    if (c1882g.f22338b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException(StubApp.getString2(25034));
                    }
                    ((x) this.f749b).f22474n.getClass();
                    Intrinsics.checkNotNullParameter(response, "response");
                    return null;
                }
                if (i3 != 408) {
                    switch (i3) {
                    }
                } else if (((x) this.f749b).f22468f && (((abstractC1879D = zVar.f22496d) == null || !abstractC1879D.isOneShot()) && (((c1881f = response.f22333k) == null || c1881f.f22328d != 408) && d(response, 0) <= 0))) {
                    return response.f22325a;
                }
            }
            return null;
        }
        x xVar = (x) this.f749b;
        if (xVar.f22470h && (link = C1881F.a(StubApp.getString2(398), response)) != null) {
            z zVar2 = response.f22325a;
            t tVar2 = zVar2.f22493a;
            tVar2.getClass();
            Intrinsics.checkNotNullParameter(link, "link");
            Intrinsics.checkNotNullParameter(link, "link");
            try {
                tVar = new Ac.t();
                tVar.e(tVar2, link);
            } catch (IllegalArgumentException unused) {
                tVar = null;
            }
            t url = tVar == null ? null : tVar.a();
            if (url != null) {
                if (Intrinsics.areEqual(url.f22418a, zVar2.f22493a.f22418a) || xVar.j) {
                    s b2 = zVar2.b();
                    if (AbstractC0378a.u(method)) {
                        Intrinsics.checkNotNullParameter(method, "method");
                        boolean areEqual = Intrinsics.areEqual(method, "PROPFIND");
                        int i10 = response.f22328d;
                        boolean z2 = areEqual || i10 == 308 || i10 == 307;
                        Intrinsics.checkNotNullParameter(method, "method");
                        if (Intrinsics.areEqual(method, "PROPFIND") || i10 == 308 || i10 == 307) {
                            b2.n(method, z2 ? zVar2.f22496d : null);
                        } else {
                            b2.n(StubApp.getString2(595), null);
                        }
                        if (!z2) {
                            b2.o(StubApp.getString2(25031));
                            b2.o(StubApp.getString2(2415));
                            b2.o(StubApp.getString2(466));
                        }
                    }
                    if (!xc.b.a(zVar2.f22493a, url)) {
                        b2.o(StubApp.getString2(2407));
                    }
                    Intrinsics.checkNotNullParameter(url, "url");
                    b2.f651c = url;
                    return b2.c();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        if (r7 == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(java.io.IOException r4, Ac.j r5, wc.z r6, boolean r7) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f749b
            wc.x r0 = (wc.x) r0
            boolean r0 = r0.f22468f
            r1 = 0
            if (r0 != 0) goto Lb
            goto Lb3
        Lb:
            if (r7 == 0) goto L1c
            wc.D r6 = r6.f22496d
            if (r6 == 0) goto L17
            boolean r6 = r6.isOneShot()
            if (r6 != 0) goto Lb3
        L17:
            boolean r6 = r4 instanceof java.io.FileNotFoundException
            if (r6 == 0) goto L1c
            return r1
        L1c:
            boolean r6 = r4 instanceof java.net.ProtocolException
            if (r6 == 0) goto L21
            return r1
        L21:
            boolean r6 = r4 instanceof java.io.InterruptedIOException
            if (r6 == 0) goto L2c
            boolean r4 = r4 instanceof java.net.SocketTimeoutException
            if (r4 == 0) goto Lb3
            if (r7 != 0) goto Lb3
            goto L3f
        L2c:
            boolean r6 = r4 instanceof javax.net.ssl.SSLHandshakeException
            if (r6 == 0) goto L3a
            java.lang.Throwable r6 = r4.getCause()
            boolean r6 = r6 instanceof java.security.cert.CertificateException
            if (r6 == 0) goto L3a
            goto Lb3
        L3a:
            boolean r4 = r4 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r4 == 0) goto L3f
            return r1
        L3f:
            Ac.f r4 = r5.j
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r5 = r4.f320a
            r6 = 1
            if (r5 != 0) goto L54
            int r7 = r4.f321b
            if (r7 != 0) goto L54
            int r7 = r4.f322c
            if (r7 != 0) goto L54
            r4 = r1
            goto Lb1
        L54:
            java.lang.Object r7 = r4.j
            wc.G r7 = (wc.C1882G) r7
            if (r7 == 0) goto L5b
            goto Lac
        L5b:
            r7 = 0
            if (r5 > r6) goto L92
            int r5 = r4.f321b
            if (r5 > r6) goto L92
            int r5 = r4.f322c
            if (r5 <= 0) goto L67
            goto L92
        L67:
            java.lang.Cloneable r5 = r4.f325f
            Ac.j r5 = (Ac.j) r5
            Ac.o r5 = r5.f342k
            if (r5 != 0) goto L70
            goto L92
        L70:
            monitor-enter(r5)
            int r0 = r5.f370l     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L77
            monitor-exit(r5)
            goto L92
        L77:
            wc.G r0 = r5.f361b     // Catch: java.lang.Throwable -> L8f
            wc.a r0 = r0.f22337a     // Catch: java.lang.Throwable -> L8f
            wc.t r0 = r0.f22354h     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r2 = r4.f324e     // Catch: java.lang.Throwable -> L8f
            wc.a r2 = (wc.C1884a) r2     // Catch: java.lang.Throwable -> L8f
            wc.t r2 = r2.f22354h     // Catch: java.lang.Throwable -> L8f
            boolean r0 = xc.b.a(r0, r2)     // Catch: java.lang.Throwable -> L8f
            if (r0 != 0) goto L8b
            monitor-exit(r5)
            goto L92
        L8b:
            wc.G r7 = r5.f361b     // Catch: java.lang.Throwable -> L8f
            monitor-exit(r5)
            goto L92
        L8f:
            r4 = move-exception
            monitor-exit(r5)
            throw r4
        L92:
            if (r7 == 0) goto L98
            r4.j = r7
        L96:
            r4 = r6
            goto Lb1
        L98:
            java.lang.Object r5 = r4.f327h
            Ac.s r5 = (Ac.s) r5
            if (r5 != 0) goto L9f
            goto La6
        L9f:
            boolean r5 = r5.a()
            if (r5 != r6) goto La6
            goto Lac
        La6:
            java.lang.Object r4 = r4.f328i
            Ac.t r4 = (Ac.t) r4
            if (r4 != 0) goto Lad
        Lac:
            goto L96
        Lad:
            boolean r4 = r4.d()
        Lb1:
            if (r4 != 0) goto Lb4
        Lb3:
            return r1
        Lb4:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Bc.a.c(java.io.IOException, Ac.j, wc.z, boolean):boolean");
    }

    public a(x client) {
        Intrinsics.checkNotNullParameter(client, "client");
        this.f749b = client;
    }
}
