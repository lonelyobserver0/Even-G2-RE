package wc;

import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import sb.C1644e0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes5.dex */
public final class w {

    /* renamed from: A, reason: collision with root package name */
    public A0.c f22431A;

    /* renamed from: a, reason: collision with root package name */
    public C.E f22432a = new C.E();

    /* renamed from: b, reason: collision with root package name */
    public C1893j f22433b = new C1893j();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f22434c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f22435d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public p f22436e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f22437f;

    /* renamed from: g, reason: collision with root package name */
    public m f22438g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22439h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f22440i;
    public m j;

    /* renamed from: k, reason: collision with root package name */
    public m f22441k;

    /* renamed from: l, reason: collision with root package name */
    public ProxySelector f22442l;

    /* renamed from: m, reason: collision with root package name */
    public m f22443m;

    /* renamed from: n, reason: collision with root package name */
    public SocketFactory f22444n;

    /* renamed from: o, reason: collision with root package name */
    public SSLSocketFactory f22445o;

    /* renamed from: p, reason: collision with root package name */
    public X509TrustManager f22446p;

    /* renamed from: q, reason: collision with root package name */
    public List f22447q;

    /* renamed from: r, reason: collision with root package name */
    public List f22448r;

    /* renamed from: s, reason: collision with root package name */
    public Ic.c f22449s;

    /* renamed from: t, reason: collision with root package name */
    public C1889f f22450t;

    /* renamed from: u, reason: collision with root package name */
    public L1 f22451u;

    /* renamed from: v, reason: collision with root package name */
    public int f22452v;

    /* renamed from: w, reason: collision with root package name */
    public int f22453w;

    /* renamed from: x, reason: collision with root package name */
    public int f22454x;

    /* renamed from: y, reason: collision with root package name */
    public int f22455y;

    /* renamed from: z, reason: collision with root package name */
    public long f22456z;

    public w() {
        q qVar = q.NONE;
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        this.f22436e = new C1644e0(qVar, 17);
        this.f22437f = true;
        m mVar = InterfaceC1885b.f22356a;
        this.f22438g = mVar;
        this.f22439h = true;
        this.f22440i = true;
        this.j = m.f22411b;
        this.f22441k = m.f22412c;
        this.f22443m = mVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
        this.f22444n = socketFactory;
        this.f22447q = x.f22458F;
        this.f22448r = x.f22457E;
        this.f22449s = Ic.c.f3252a;
        this.f22450t = C1889f.f22370c;
        this.f22452v = 10000;
        this.f22453w = 10000;
        this.f22454x = 10000;
        this.f22456z = 1024L;
    }

    public final void a(long j, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        this.f22452v = xc.b.b(StubApp.getString2(1987), j, unit);
    }

    public final void b(List protocols) {
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        List mutableList = CollectionsKt.toMutableList((Collection) protocols);
        y yVar = y.f22489f;
        if (!mutableList.contains(yVar) && !mutableList.contains(y.f22486c)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("protocols must contain h2_prior_knowledge or http/1.1: ", mutableList).toString());
        }
        if (mutableList.contains(yVar) && mutableList.size() > 1) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("protocols containing h2_prior_knowledge cannot use other protocols: ", mutableList).toString());
        }
        if (mutableList.contains(y.f22485b)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("protocols must not contain http/1.0: ", mutableList).toString());
        }
        if (mutableList.contains(null)) {
            throw new IllegalArgumentException(StubApp.getString2(35581));
        }
        mutableList.remove(y.f22487d);
        if (!Intrinsics.areEqual(mutableList, this.f22448r)) {
            this.f22431A = null;
        }
        List unmodifiableList = Collections.unmodifiableList(mutableList);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "unmodifiableList(protocolsCopy)");
        Intrinsics.checkNotNullParameter(unmodifiableList, "<set-?>");
        this.f22448r = unmodifiableList;
    }
}
