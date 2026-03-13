package Ac;

import com.stub.StubApp;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.math.Primes;
import wc.C1884a;
import wc.InterfaceC1887d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f389a;

    /* renamed from: b, reason: collision with root package name */
    public int f390b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f391c;

    /* renamed from: d, reason: collision with root package name */
    public Object f392d;

    /* renamed from: e, reason: collision with root package name */
    public Object f393e;

    /* renamed from: f, reason: collision with root package name */
    public Object f394f;

    /* renamed from: g, reason: collision with root package name */
    public Object f395g;

    /* renamed from: h, reason: collision with root package name */
    public List f396h;

    /* renamed from: i, reason: collision with root package name */
    public Object f397i;

    public t(C1884a address, A0.c routeDatabase, InterfaceC1887d call, wc.q eventListener) {
        List<Proxy> l9;
        this.f389a = 0;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(routeDatabase, "routeDatabase");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f392d = address;
        this.f393e = routeDatabase;
        this.f394f = call;
        this.f395g = eventListener;
        this.f396h = CollectionsKt.emptyList();
        this.f397i = CollectionsKt.emptyList();
        this.f391c = new ArrayList();
        wc.t tVar = address.f22354h;
        eventListener.proxySelectStart(call, tVar);
        URI h2 = tVar.h();
        if (h2.getHost() == null) {
            l9 = xc.b.l(Proxy.NO_PROXY);
        } else {
            List<Proxy> proxiesOrNull = address.f22353g.select(h2);
            if (proxiesOrNull == null || proxiesOrNull.isEmpty()) {
                l9 = xc.b.l(Proxy.NO_PROXY);
            } else {
                Intrinsics.checkNotNullExpressionValue(proxiesOrNull, "proxiesOrNull");
                l9 = xc.b.w(proxiesOrNull);
            }
        }
        this.f396h = l9;
        this.f390b = 0;
        eventListener.proxySelectEnd(call, tVar, l9);
    }

    public wc.t a() {
        ArrayList arrayList;
        String str = (String) this.f392d;
        if (str == null) {
            throw new IllegalStateException(StubApp.getString2(25008));
        }
        String e10 = wc.m.e(0, 0, 7, (String) this.f393e);
        String e11 = wc.m.e(0, 0, 7, (String) this.f394f);
        String str2 = (String) this.f395g;
        if (str2 == null) {
            throw new IllegalStateException(StubApp.getString2(25007));
        }
        int b2 = b();
        ArrayList arrayList2 = this.f391c;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.f(arrayList2));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(wc.m.e(0, 0, 7, (String) it.next()));
        }
        ArrayList<String> arrayList4 = (ArrayList) this.f396h;
        if (arrayList4 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList5 = new ArrayList(CollectionsKt.f(arrayList4));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 == null ? null : wc.m.e(0, 0, 3, str3));
            }
            arrayList = arrayList5;
        }
        String str4 = (String) this.f397i;
        return new wc.t(str, e10, e11, str2, b2, arrayList3, arrayList, str4 != null ? wc.m.e(0, 0, 7, str4) : null, toString());
    }

    public int b() {
        int i3 = this.f390b;
        if (i3 != -1) {
            return i3;
        }
        String scheme = (String) this.f392d;
        Intrinsics.checkNotNull(scheme);
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        if (Intrinsics.areEqual(scheme, "http")) {
            return 80;
        }
        return Intrinsics.areEqual(scheme, "https") ? 443 : -1;
    }

    public void c(String str) {
        String b2;
        ArrayList arrayList = null;
        if (str != null && (b2 = wc.m.b(str, 0, 0, StubApp.getString2(25009), Primes.SMALL_FACTOR_LIMIT)) != null) {
            arrayList = wc.m.f(b2);
        }
        this.f396h = arrayList;
    }

    public boolean d() {
        return this.f390b < this.f396h.size() || !this.f391c.isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x0223, code lost:
    
        if (r3 < 65536) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0082, code lost:
    
        if (r3 == ':') goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x036e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x036a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(wc.t r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 1013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ac.t.e(wc.t, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00be, code lost:
    
        if (r1 != r3) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ac.t.toString():java.lang.String");
    }

    public t() {
        this.f389a = 1;
        this.f393e = "";
        this.f394f = "";
        this.f390b = -1;
        ArrayList arrayList = new ArrayList();
        this.f391c = arrayList;
        arrayList.add("");
    }
}
