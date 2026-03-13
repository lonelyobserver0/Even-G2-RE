package Ac;

import Dc.C0052a;
import Dc.EnumC0053b;
import Dc.F;
import Kc.B;
import L0.A;
import L0.C0119o;
import R3.C0233b;
import R3.C0236e;
import S3.InterfaceC0270d;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import l4.C1145A;
import wc.AbstractC1879D;
import wc.C1880E;
import wc.z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class e implements InterfaceC0270d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f314a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f315b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f316c;

    /* renamed from: d, reason: collision with root package name */
    public Object f317d;

    /* renamed from: e, reason: collision with root package name */
    public Object f318e;

    /* renamed from: f, reason: collision with root package name */
    public Object f319f;

    public e(C0236e c0236e, Q3.c cVar, C0233b c0233b) {
        this.f319f = c0236e;
        this.f317d = null;
        this.f318e = null;
        this.f314a = false;
        this.f315b = cVar;
        this.f316c = c0233b;
    }

    @Override // S3.InterfaceC0270d
    public void a(com.google.android.gms.common.b bVar) {
        ((C0236e) this.f319f).f6135p.post(new Q4.b(this, bVar, 11, false));
    }

    public IOException b(long j, boolean z2, boolean z10, IOException iOException) {
        if (iOException != null) {
            g(iOException);
        }
        wc.q qVar = (wc.q) this.f316c;
        j jVar = (j) this.f315b;
        if (z10) {
            if (iOException != null) {
                qVar.requestFailed(jVar, iOException);
            } else {
                qVar.requestBodyEnd(jVar, j);
            }
        }
        if (z2) {
            if (iOException != null) {
                qVar.responseFailed(jVar, iOException);
            } else {
                qVar.responseBodyEnd(jVar, j);
            }
        }
        return jVar.i(this, z10, z2, iOException);
    }

    public c c(z request, boolean z2) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f314a = z2;
        AbstractC1879D abstractC1879D = request.f22496d;
        Intrinsics.checkNotNull(abstractC1879D);
        long contentLength = abstractC1879D.contentLength();
        ((wc.q) this.f316c).requestBodyStart((j) this.f315b);
        return new c(this, ((Bc.e) this.f318e).h(request, contentLength), contentLength);
    }

    public L4.k d(int i3) {
        L4.k kVar;
        L4.k kVar2;
        HashMap hashMap = (HashMap) this.f316c;
        L4.k kVar3 = (L4.k) hashMap.get(Integer.valueOf(i3));
        if (kVar3 != null) {
            return kVar3;
        }
        final Y.m mVar = (Y.m) this.f318e;
        mVar.getClass();
        if (i3 == 0) {
            final Class asSubclass = DashMediaSource$Factory.class.asSubclass(A.class);
            final int i10 = 0;
            kVar = new L4.k() { // from class: L0.n
                @Override // L4.k
                public final Object get() {
                    switch (i10) {
                        case 0:
                            return C0120p.d((Class) asSubclass, mVar);
                        case 1:
                            return C0120p.d((Class) asSubclass, mVar);
                        case 2:
                            return C0120p.d((Class) asSubclass, mVar);
                        default:
                            return new S(mVar, (T0.m) ((Ac.e) asSubclass).f315b);
                    }
                }
            };
        } else if (i3 == 1) {
            final Class asSubclass2 = SsMediaSource$Factory.class.asSubclass(A.class);
            final int i11 = 1;
            kVar = new L4.k() { // from class: L0.n
                @Override // L4.k
                public final Object get() {
                    switch (i11) {
                        case 0:
                            return C0120p.d((Class) asSubclass2, mVar);
                        case 1:
                            return C0120p.d((Class) asSubclass2, mVar);
                        case 2:
                            return C0120p.d((Class) asSubclass2, mVar);
                        default:
                            return new S(mVar, (T0.m) ((Ac.e) asSubclass2).f315b);
                    }
                }
            };
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    kVar2 = new C0119o(RtspMediaSource$Factory.class.asSubclass(A.class), 0);
                } else {
                    if (i3 != 4) {
                        throw new IllegalArgumentException(u.p(i3, StubApp.getString2(24940)));
                    }
                    final int i12 = 3;
                    kVar2 = new L4.k() { // from class: L0.n
                        @Override // L4.k
                        public final Object get() {
                            switch (i12) {
                                case 0:
                                    return C0120p.d((Class) this, mVar);
                                case 1:
                                    return C0120p.d((Class) this, mVar);
                                case 2:
                                    return C0120p.d((Class) this, mVar);
                                default:
                                    return new S(mVar, (T0.m) ((Ac.e) this).f315b);
                            }
                        }
                    };
                }
                hashMap.put(Integer.valueOf(i3), kVar2);
                return kVar2;
            }
            final Class asSubclass3 = HlsMediaSource$Factory.class.asSubclass(A.class);
            final int i13 = 2;
            kVar = new L4.k() { // from class: L0.n
                @Override // L4.k
                public final Object get() {
                    switch (i13) {
                        case 0:
                            return C0120p.d((Class) asSubclass3, mVar);
                        case 1:
                            return C0120p.d((Class) asSubclass3, mVar);
                        case 2:
                            return C0120p.d((Class) asSubclass3, mVar);
                        default:
                            return new S(mVar, (T0.m) ((Ac.e) asSubclass3).f315b);
                    }
                }
            };
        }
        kVar2 = kVar;
        hashMap.put(Integer.valueOf(i3), kVar2);
        return kVar2;
    }

    public n e() {
        j jVar = (j) this.f315b;
        if (jVar.f343l) {
            throw new IllegalStateException(StubApp.getString2(6068));
        }
        jVar.f343l = true;
        jVar.f339f.j();
        o e10 = ((Bc.e) this.f318e).e();
        e10.getClass();
        Intrinsics.checkNotNullParameter(this, "exchange");
        Socket socket = e10.f363d;
        Intrinsics.checkNotNull(socket);
        B b2 = e10.f367h;
        Intrinsics.checkNotNull(b2);
        Kc.A a3 = e10.f368i;
        Intrinsics.checkNotNull(a3);
        socket.setSoTimeout(0);
        e10.k();
        return new n(b2, a3, this);
    }

    public C1880E f(boolean z2) {
        try {
            C1880E d8 = ((Bc.e) this.f318e).d(z2);
            if (d8 == null) {
                return d8;
            }
            Intrinsics.checkNotNullParameter(this, "deferredTrailers");
            d8.f22324m = this;
            return d8;
        } catch (IOException e10) {
            ((wc.q) this.f316c).responseFailed((j) this.f315b, e10);
            g(e10);
            throw e10;
        }
    }

    public void g(IOException iOException) {
        ((f) this.f317d).c(iOException);
        o e10 = ((Bc.e) this.f318e).e();
        j call = (j) this.f315b;
        synchronized (e10) {
            try {
                Intrinsics.checkNotNullParameter(call, "call");
                if (!(iOException instanceof F)) {
                    if (!(e10.f366g != null) || (iOException instanceof C0052a)) {
                        e10.j = true;
                        if (e10.f371m == 0) {
                            o.d(call.f334a, e10.f361b, iOException);
                            e10.f370l++;
                        }
                    }
                } else if (((F) iOException).f1548a == EnumC0053b.f1553f) {
                    int i3 = e10.f372n + 1;
                    e10.f372n = i3;
                    if (i3 > 1) {
                        e10.j = true;
                        e10.f370l++;
                    }
                } else if (((F) iOException).f1548a != EnumC0053b.f1554g || !call.f348r) {
                    e10.j = true;
                    e10.f370l++;
                }
            } finally {
            }
        }
    }

    public void h(com.google.android.gms.common.b bVar) {
        R3.r rVar = (R3.r) ((C0236e) this.f319f).f6131k.get((C0233b) this.f316c);
        if (rVar != null) {
            rVar.p(bVar);
        }
    }

    public e(j call, wc.q eventListener, f finder, Bc.e codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.f315b = call;
        this.f316c = eventListener;
        this.f317d = finder;
        this.f318e = codec;
        this.f319f = codec.e();
    }

    public e(T0.m mVar, C1145A c1145a) {
        this.f315b = mVar;
        this.f319f = c1145a;
        this.f316c = new HashMap();
        this.f317d = new HashMap();
        this.f314a = true;
    }
}
