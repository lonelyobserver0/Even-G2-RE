package H0;

import M4.e0;
import android.net.Uri;
import android.util.SparseArray;
import com.stub.StubApp;
import java.io.Closeable;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Locale;
import javax.net.SocketFactory;
import r0.AbstractC1550k;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class o implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final A0.c f2595a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.c f2596b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2597c;

    /* renamed from: d, reason: collision with root package name */
    public final SocketFactory f2598d;

    /* renamed from: h, reason: collision with root package name */
    public Uri f2602h;

    /* renamed from: k, reason: collision with root package name */
    public C2.a f2603k;

    /* renamed from: l, reason: collision with root package name */
    public String f2604l;

    /* renamed from: n, reason: collision with root package name */
    public n f2606n;

    /* renamed from: p, reason: collision with root package name */
    public P3.m f2607p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2609r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2610s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2611t;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayDeque f2599e = new ArrayDeque();

    /* renamed from: f, reason: collision with root package name */
    public final SparseArray f2600f = new SparseArray();

    /* renamed from: g, reason: collision with root package name */
    public final Bc.i f2601g = new Bc.i(this);
    public A j = new A(new Z9.C(this));

    /* renamed from: m, reason: collision with root package name */
    public long f2605m = 60000;

    /* renamed from: v, reason: collision with root package name */
    public long f2612v = -9223372036854775807L;

    /* renamed from: q, reason: collision with root package name */
    public int f2608q = -1;

    public o(A0.c cVar, A0.c cVar2, String str, Uri uri, SocketFactory socketFactory) {
        this.f2595a = cVar;
        this.f2596b = cVar2;
        this.f2597c = str;
        this.f2598d = socketFactory;
        this.f2602h = B.f(uri);
        this.f2603k = B.d(uri);
    }

    public static void a(o oVar, B0.v vVar) {
        oVar.getClass();
        if (oVar.f2609r) {
            oVar.f2596b.k(vVar);
            return;
        }
        String message = vVar.getMessage();
        if (message == null) {
            message = "";
        }
        oVar.f2595a.q(message, vVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n nVar = this.f2606n;
        if (nVar != null) {
            nVar.close();
            this.f2606n = null;
            Uri uri = this.f2602h;
            String str = this.f2604l;
            str.getClass();
            Bc.i iVar = this.f2601g;
            o oVar = (o) iVar.f768d;
            int i3 = oVar.f2608q;
            if (i3 != -1 && i3 != 0) {
                oVar.f2608q = 0;
                iVar.t(iVar.k(12, str, e0.f4606g, uri));
            }
        }
        this.j.close();
    }

    public final void d() {
        long V10;
        r rVar = (r) this.f2599e.pollFirst();
        if (rVar == null) {
            t tVar = (t) this.f2596b.f29a;
            long j = tVar.f2638p;
            if (j != -9223372036854775807L) {
                V10 = AbstractC1560u.V(j);
            } else {
                long j3 = tVar.f2639q;
                V10 = j3 != -9223372036854775807L ? AbstractC1560u.V(j3) : 0L;
            }
            tVar.f2629d.k(V10);
            return;
        }
        Uri uri = rVar.f2617b.f2544b.f2657b;
        AbstractC1550k.h(rVar.f2618c);
        String str = rVar.f2618c;
        String str2 = this.f2604l;
        Bc.i iVar = this.f2601g;
        ((o) iVar.f768d).f2608q = 0;
        String string2 = StubApp.getString2(396);
        M4.r.c(string2, str);
        iVar.t(iVar.k(10, str2, e0.b(1, new Object[]{string2, str}, null), uri));
    }

    public final Socket e(Uri uri) {
        AbstractC1550k.c(uri.getHost() != null);
        int port = uri.getPort() > 0 ? uri.getPort() : 554;
        String host = uri.getHost();
        host.getClass();
        return this.f2598d.createSocket(host, port);
    }

    public final void h(long j) {
        if (this.f2608q == 2 && !this.f2611t) {
            Uri uri = this.f2602h;
            String str = this.f2604l;
            str.getClass();
            Bc.i iVar = this.f2601g;
            o oVar = (o) iVar.f768d;
            AbstractC1550k.g(oVar.f2608q == 2);
            iVar.t(iVar.k(5, str, e0.f4606g, uri));
            oVar.f2611t = true;
        }
        this.f2612v = j;
    }

    public final void k(long j) {
        Uri uri = this.f2602h;
        String str = this.f2604l;
        str.getClass();
        Bc.i iVar = this.f2601g;
        int i3 = ((o) iVar.f768d).f2608q;
        AbstractC1550k.g(i3 == 1 || i3 == 2);
        D d8 = D.f2482c;
        Object[] objArr = {Double.valueOf(j / 1000.0d)};
        int i10 = AbstractC1560u.f20190a;
        iVar.t(iVar.k(6, str, e0.b(1, new Object[]{StubApp.getString2(405), String.format(Locale.US, StubApp.getString2(2405), objArr)}, null), uri));
    }
}
