package Ac;

import C.E;
import com.stub.StubApp;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import wc.C1881F;
import wc.InterfaceC1887d;
import wc.InterfaceC1888e;
import wc.x;
import wc.z;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class j implements InterfaceC1887d {

    /* renamed from: a, reason: collision with root package name */
    public final x f334a;

    /* renamed from: b, reason: collision with root package name */
    public final z f335b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f336c;

    /* renamed from: d, reason: collision with root package name */
    public final q f337d;

    /* renamed from: e, reason: collision with root package name */
    public final wc.q f338e;

    /* renamed from: f, reason: collision with root package name */
    public final i f339f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f340g;

    /* renamed from: h, reason: collision with root package name */
    public Object f341h;
    public f j;

    /* renamed from: k, reason: collision with root package name */
    public o f342k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f343l;

    /* renamed from: m, reason: collision with root package name */
    public e f344m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f345n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f346p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f347q;

    /* renamed from: r, reason: collision with root package name */
    public volatile boolean f348r;

    /* renamed from: s, reason: collision with root package name */
    public volatile e f349s;

    /* renamed from: t, reason: collision with root package name */
    public volatile o f350t;

    public j(x client, z originalRequest, boolean z2) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f334a = client;
        this.f335b = originalRequest;
        this.f336c = z2;
        this.f337d = client.f22464b.f22392a;
        this.f338e = client.f22467e.a(this);
        i iVar = new i(this);
        iVar.g(0, TimeUnit.MILLISECONDS);
        this.f339f = iVar;
        this.f340g = new AtomicBoolean();
        this.f347q = true;
    }

    public static final String a(j jVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jVar.f348r ? StubApp.getString2(24947) : "");
        sb2.append(jVar.f336c ? StubApp.getString2(24948) : StubApp.getString2(814));
        sb2.append(StubApp.getString2(1632));
        sb2.append(jVar.f335b.f22493a.g());
        return sb2.toString();
    }

    public final void b(o connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr = xc.b.f23179a;
        if (this.f342k != null) {
            throw new IllegalStateException(StubApp.getString2(6068));
        }
        this.f342k = connection;
        connection.f374p.add(new h(this, this.f341h));
    }

    public final IOException c(IOException iOException) {
        IOException iOException2;
        Socket k3;
        byte[] bArr = xc.b.f23179a;
        o oVar = this.f342k;
        if (oVar != null) {
            synchronized (oVar) {
                k3 = k();
            }
            if (this.f342k == null) {
                if (k3 != null) {
                    xc.b.d(k3);
                }
                this.f338e.connectionReleased(this, oVar);
            } else if (k3 != null) {
                throw new IllegalStateException(StubApp.getString2(6068));
            }
        }
        if (!this.f343l && this.f339f.j()) {
            iOException2 = new InterruptedIOException(StubApp.getString2(1987));
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException == null) {
            this.f338e.callEnd(this);
            return iOException2;
        }
        wc.q qVar = this.f338e;
        Intrinsics.checkNotNull(iOException2);
        qVar.callFailed(this, iOException2);
        return iOException2;
    }

    public final Object clone() {
        return new j(this.f334a, this.f335b, this.f336c);
    }

    public final void d() {
        Socket socket;
        if (this.f348r) {
            return;
        }
        this.f348r = true;
        e eVar = this.f349s;
        if (eVar != null) {
            ((Bc.e) eVar.f318e).cancel();
        }
        o oVar = this.f350t;
        if (oVar != null && (socket = oVar.f362c) != null) {
            xc.b.d(socket);
        }
        this.f338e.canceled(this);
    }

    public final void e(InterfaceC1888e responseCallback) {
        g other;
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.f340g.compareAndSet(false, true)) {
            throw new IllegalStateException(StubApp.getString2(24949));
        }
        Ec.n nVar = Ec.n.f2161a;
        this.f341h = Ec.n.f2161a.g();
        this.f338e.callStart(this);
        E e10 = this.f334a.f22463a;
        g call = new g(this, responseCallback);
        e10.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (e10) {
            ((ArrayDeque) e10.f786c).add(call);
            if (!this.f336c) {
                String str = this.f335b.f22493a.f22421d;
                Iterator it = ((ArrayDeque) e10.f787d).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = ((ArrayDeque) e10.f786c).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                other = null;
                                break;
                            } else {
                                other = (g) it2.next();
                                if (Intrinsics.areEqual(other.f331c.f335b.f22493a.f22421d, str)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        other = (g) it.next();
                        if (Intrinsics.areEqual(other.f331c.f335b.f22493a.f22421d, str)) {
                            break;
                        }
                    }
                }
                if (other != null) {
                    Intrinsics.checkNotNullParameter(other, "other");
                    call.f330b = other.f330b;
                }
            }
            Unit unit = Unit.INSTANCE;
        }
        e10.h();
    }

    public final C1881F f() {
        if (!this.f340g.compareAndSet(false, true)) {
            throw new IllegalStateException(StubApp.getString2(24949));
        }
        this.f339f.i();
        Ec.n nVar = Ec.n.f2161a;
        this.f341h = Ec.n.f2161a.g();
        this.f338e.callStart(this);
        try {
            E e10 = this.f334a.f22463a;
            synchronized (e10) {
                Intrinsics.checkNotNullParameter(this, "call");
                ((ArrayDeque) e10.f788e).add(this);
            }
            return h();
        } finally {
            E e11 = this.f334a.f22463a;
            e11.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            e11.f((ArrayDeque) e11.f788e, this);
        }
    }

    public final void g(boolean z2) {
        e eVar;
        synchronized (this) {
            if (!this.f347q) {
                throw new IllegalStateException(StubApp.getString2("24931"));
            }
            Unit unit = Unit.INSTANCE;
        }
        if (z2 && (eVar = this.f349s) != null) {
            ((Bc.e) eVar.f318e).cancel();
            ((j) eVar.f315b).i(eVar, true, true, null);
        }
        this.f344m = null;
    }

    public final C1881F h() {
        ArrayList arrayList = new ArrayList();
        CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.f334a.f22465c);
        arrayList.add(new Bc.a(this.f334a));
        arrayList.add(new Bc.a(this.f334a.f22471k));
        this.f334a.getClass();
        arrayList.add(new yc.b());
        arrayList.add(a.f296a);
        if (!this.f336c) {
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, this.f334a.f22466d);
        }
        arrayList.add(new Bc.b(this.f336c));
        z zVar = this.f335b;
        x xVar = this.f334a;
        try {
            try {
                C1881F b2 = new Bc.g(this, arrayList, 0, null, zVar, xVar.f22483y, xVar.f22484z, xVar.f22459A).b(this.f335b);
                if (this.f348r) {
                    xc.b.c(b2);
                    throw new IOException(StubApp.getString2("13498"));
                }
                j(null);
                return b2;
            } catch (IOException e10) {
                IOException j = j(e10);
                if (j == null) {
                    throw new NullPointerException(StubApp.getString2("24950"));
                }
                throw j;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                j(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:49:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:25:0x0042, B:7:0x001c), top: B:48:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:49:0x0013, B:10:0x0022, B:12:0x0026, B:13:0x0028, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:25:0x0042, B:7:0x001c), top: B:48:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException i(Ac.e r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            java.lang.String r0 = "exchange"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            Ac.e r0 = r2.f349s
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r0)
            if (r3 != 0) goto Le
            goto L61
        Le:
            monitor-enter(r2)
            r3 = 1
            r0 = 0
            if (r4 == 0) goto L1a
            boolean r1 = r2.f345n     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L20
            goto L1a
        L18:
            r3 = move-exception
            goto L62
        L1a:
            if (r5 == 0) goto L41
            boolean r1 = r2.f346p     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L41
        L20:
            if (r4 == 0) goto L24
            r2.f345n = r0     // Catch: java.lang.Throwable -> L18
        L24:
            if (r5 == 0) goto L28
            r2.f346p = r0     // Catch: java.lang.Throwable -> L18
        L28:
            boolean r4 = r2.f345n     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L32
            boolean r5 = r2.f346p     // Catch: java.lang.Throwable -> L18
            if (r5 != 0) goto L32
            r5 = r3
            goto L33
        L32:
            r5 = r0
        L33:
            if (r4 != 0) goto L3e
            boolean r4 = r2.f346p     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3e
            boolean r4 = r2.f347q     // Catch: java.lang.Throwable -> L18
            if (r4 != 0) goto L3e
            r0 = r3
        L3e:
            r4 = r0
            r0 = r5
            goto L42
        L41:
            r4 = r0
        L42:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L18
            monitor-exit(r2)
            if (r0 == 0) goto L5a
            r5 = 0
            r2.f349s = r5
            Ac.o r5 = r2.f342k
            if (r5 != 0) goto L4f
            goto L5a
        L4f:
            monitor-enter(r5)
            int r0 = r5.f371m     // Catch: java.lang.Throwable -> L57
            int r0 = r0 + r3
            r5.f371m = r0     // Catch: java.lang.Throwable -> L57
            monitor-exit(r5)
            goto L5a
        L57:
            r3 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L57
            throw r3
        L5a:
            if (r4 == 0) goto L61
            java.io.IOException r3 = r2.c(r6)
            return r3
        L61:
            return r6
        L62:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: Ac.j.i(Ac.e, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException j(IOException iOException) {
        boolean z2;
        synchronized (this) {
            try {
                z2 = false;
                if (this.f347q) {
                    this.f347q = false;
                    if (!this.f345n && !this.f346p) {
                        z2 = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2 ? c(iOException) : iOException;
    }

    public final Socket k() {
        o connection = this.f342k;
        Intrinsics.checkNotNull(connection);
        byte[] bArr = xc.b.f23179a;
        ArrayList arrayList = connection.f374p;
        Iterator it = arrayList.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (Intrinsics.areEqual(((Reference) it.next()).get(), this)) {
                break;
            }
            i3++;
        }
        if (i3 == -1) {
            throw new IllegalStateException(StubApp.getString2(6068));
        }
        arrayList.remove(i3);
        this.f342k = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        connection.f375q = System.nanoTime();
        q qVar = this.f337d;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(connection, "connection");
        byte[] bArr2 = xc.b.f23179a;
        boolean z2 = connection.j;
        zc.b bVar = (zc.b) qVar.f382c;
        if (!z2) {
            bVar.c((p) qVar.f383d, 0L);
            return null;
        }
        connection.j = true;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) qVar.f384e;
        concurrentLinkedQueue.remove(connection);
        if (concurrentLinkedQueue.isEmpty()) {
            bVar.a();
        }
        Socket socket = connection.f363d;
        Intrinsics.checkNotNull(socket);
        return socket;
    }
}
