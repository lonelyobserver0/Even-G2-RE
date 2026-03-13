package Dc;

import Kc.C0104k;
import Kc.H;
import com.stub.StubApp;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import wc.C1880E;
import wc.C1881F;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class s implements Bc.e {

    /* renamed from: g, reason: collision with root package name */
    public static final List f1640g = xc.b.l(StubApp.getString2(15685), StubApp.getString2(5873), StubApp.getString2(25166), StubApp.getString2(25167), StubApp.getString2(25168), StubApp.getString2(25137), StubApp.getString2(25169), StubApp.getString2(25170), StubApp.getString2(25106), StubApp.getString2(25107), StubApp.getString2(25108), StubApp.getString2(25109));

    /* renamed from: h, reason: collision with root package name */
    public static final List f1641h = xc.b.l(StubApp.getString2(15685), StubApp.getString2(5873), StubApp.getString2(25166), StubApp.getString2(25167), StubApp.getString2(25168), StubApp.getString2(25137), StubApp.getString2(25169), StubApp.getString2(25170));

    /* renamed from: a, reason: collision with root package name */
    public final Ac.o f1642a;

    /* renamed from: b, reason: collision with root package name */
    public final Bc.g f1643b;

    /* renamed from: c, reason: collision with root package name */
    public final r f1644c;

    /* renamed from: d, reason: collision with root package name */
    public volatile z f1645d;

    /* renamed from: e, reason: collision with root package name */
    public final wc.y f1646e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f1647f;

    public s(wc.x client, Ac.o connection, Bc.g chain, r http2Connection) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(connection, "connection");
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(http2Connection, "http2Connection");
        this.f1642a = connection;
        this.f1643b = chain;
        this.f1644c = http2Connection;
        List list = client.f22479t;
        wc.y yVar = wc.y.f22489f;
        this.f1646e = list.contains(yVar) ? yVar : wc.y.f22488e;
    }

    @Override // Bc.e
    public final void a() {
        z zVar = this.f1645d;
        Intrinsics.checkNotNull(zVar);
        zVar.g().close();
    }

    @Override // Bc.e
    public final H b(C1881F response) {
        Intrinsics.checkNotNullParameter(response, "response");
        z zVar = this.f1645d;
        Intrinsics.checkNotNull(zVar);
        return zVar.f1677i;
    }

    @Override // Bc.e
    public final long c(C1881F response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (Bc.f.a(response)) {
            return xc.b.k(response);
        }
        return 0L;
    }

    @Override // Bc.e
    public final void cancel() {
        this.f1647f = true;
        z zVar = this.f1645d;
        if (zVar == null) {
            return;
        }
        zVar.e(EnumC0053b.f1554g);
    }

    @Override // Bc.e
    public final C1880E d(boolean z2) {
        wc.s headerBlock;
        CharSequence trim;
        z zVar = this.f1645d;
        Intrinsics.checkNotNull(zVar);
        synchronized (zVar) {
            zVar.f1678k.i();
            while (zVar.f1675g.isEmpty() && zVar.f1680m == null) {
                try {
                    zVar.l();
                } catch (Throwable th) {
                    zVar.f1678k.l();
                    throw th;
                }
            }
            zVar.f1678k.l();
            if (zVar.f1675g.isEmpty()) {
                IOException iOException = zVar.f1681n;
                if (iOException != null) {
                    throw iOException;
                }
                EnumC0053b enumC0053b = zVar.f1680m;
                Intrinsics.checkNotNull(enumC0053b);
                throw new F(enumC0053b);
            }
            Object removeFirst = zVar.f1675g.removeFirst();
            Intrinsics.checkNotNullExpressionValue(removeFirst, "headersQueue.removeFirst()");
            headerBlock = (wc.s) removeFirst;
        }
        wc.y protocol = this.f1646e;
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        ArrayList arrayList = new ArrayList(20);
        int size = headerBlock.size();
        Bc.i iVar = null;
        int i3 = 0;
        while (i3 < size) {
            int i10 = i3 + 1;
            String name = headerBlock.b(i3);
            String value = headerBlock.d(i3);
            if (Intrinsics.areEqual(name, ":status")) {
                iVar = a4.f.u(Intrinsics.stringPlus("HTTP/1.1 ", value));
            } else if (!f1641h.contains(name)) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                arrayList.add(name);
                trim = StringsKt__StringsKt.trim((CharSequence) value);
                arrayList.add(trim.toString());
            }
            i3 = i10;
        }
        if (iVar == null) {
            throw new ProtocolException(StubApp.getString2(25171));
        }
        C1880E c1880e = new C1880E();
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        c1880e.f22314b = protocol;
        c1880e.f22315c = iVar.f766b;
        String message = (String) iVar.f768d;
        Intrinsics.checkNotNullParameter(message, "message");
        c1880e.f22316d = message;
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException(StubApp.getString2(11601));
        }
        c1880e.c(new wc.s((String[]) array));
        if (z2 && c1880e.f22315c == 100) {
            return null;
        }
        return c1880e;
    }

    @Override // Bc.e
    public final Ac.o e() {
        return this.f1642a;
    }

    @Override // Bc.e
    public final void f(wc.z request) {
        int i3;
        z zVar;
        boolean z2 = true;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f1645d != null) {
            return;
        }
        boolean z10 = request.f22496d != null;
        Intrinsics.checkNotNullParameter(request, "request");
        wc.s sVar = request.f22495c;
        ArrayList requestHeaders = new ArrayList(sVar.size() + 4);
        requestHeaders.add(new C0054c(C0054c.f1559f, request.f22494b));
        C0104k c0104k = C0054c.f1560g;
        String string2 = StubApp.getString2(1904);
        wc.t tVar = request.f22493a;
        Intrinsics.checkNotNullParameter(tVar, string2);
        String b2 = tVar.b();
        String d8 = tVar.d();
        if (d8 != null) {
            b2 = b2 + '?' + ((Object) d8);
        }
        requestHeaders.add(new C0054c(c0104k, b2));
        String a3 = request.a(StubApp.getString2(24972));
        if (a3 != null) {
            requestHeaders.add(new C0054c(C0054c.f1562i, a3));
        }
        requestHeaders.add(new C0054c(C0054c.f1561h, tVar.f22418a));
        int size = sVar.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            String b10 = sVar.b(i10);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = b10.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (!f1640g.contains(lowerCase) || (Intrinsics.areEqual(lowerCase, "te") && Intrinsics.areEqual(sVar.d(i10), "trailers"))) {
                requestHeaders.add(new C0054c(lowerCase, sVar.d(i10)));
            }
            i10 = i11;
        }
        r rVar = this.f1644c;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z11 = !z10;
        synchronized (rVar.f1615A) {
            synchronized (rVar) {
                try {
                    if (rVar.f1622e > 1073741823) {
                        rVar.k(EnumC0053b.f1553f);
                    }
                    if (rVar.f1623f) {
                        throw new C0052a();
                    }
                    i3 = rVar.f1622e;
                    rVar.f1622e = i3 + 2;
                    zVar = new z(i3, rVar, z11, false, null);
                    if (z10 && rVar.f1637x < rVar.f1638y && zVar.f1673e < zVar.f1674f) {
                        z2 = false;
                    }
                    if (zVar.i()) {
                        rVar.f1619b.put(Integer.valueOf(i3), zVar);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            rVar.f1615A.k(z11, i3, requestHeaders);
        }
        if (z2) {
            rVar.f1615A.flush();
        }
        this.f1645d = zVar;
        if (this.f1647f) {
            z zVar2 = this.f1645d;
            Intrinsics.checkNotNull(zVar2);
            zVar2.e(EnumC0053b.f1554g);
            throw new IOException(StubApp.getString2(13498));
        }
        z zVar3 = this.f1645d;
        Intrinsics.checkNotNull(zVar3);
        y yVar = zVar3.f1678k;
        long j = this.f1643b.f759g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        yVar.g(j, timeUnit);
        z zVar4 = this.f1645d;
        Intrinsics.checkNotNull(zVar4);
        zVar4.f1679l.g(this.f1643b.f760h, timeUnit);
    }

    @Override // Bc.e
    public final void g() {
        this.f1644c.flush();
    }

    @Override // Bc.e
    public final Kc.F h(wc.z request, long j) {
        Intrinsics.checkNotNullParameter(request, "request");
        z zVar = this.f1645d;
        Intrinsics.checkNotNull(zVar);
        return zVar.g();
    }
}
