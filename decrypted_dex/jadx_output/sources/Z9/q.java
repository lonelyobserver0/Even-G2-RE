package Z9;

import H5.Q;
import N.C0160f;
import N.InterfaceC0157c;
import Qb.C0203k;
import T.e0;
import T.f0;
import Tb.InterfaceC0327h;
import Tb.b0;
import Ub.AbstractC0347c;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContentInfo;
import com.mapbox.bindgen.DataRef;
import com.mapbox.common.EventsService;
import com.mapbox.common.LoggingLevel;
import com.mapbox.navigator.ChangeLegCallback;
import com.mapbox.navigator.RerouteError;
import com.mapbox.navigator.RerouteErrorType;
import com.mapbox.navigator.RerouteObserver;
import com.mapbox.navigator.RoadObjectsStoreObserver;
import com.mapbox.navigator.RouteInterface;
import com.mapbox.navigator.RouterError;
import com.mapbox.navigator.RouterErrorType;
import com.mapbox.navigator.RouterOrigin;
import com.stub.StubApp;
import e2.C0838b;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import o0.AbstractC1430e;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import u0.InterfaceC1770a;
import vb.InterfaceC1845b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class q implements InterfaceC1845b, K5.b, D3.b, InterfaceC0157c, RerouteObserver, Ka.b, q4.d, P0.j, InterfaceC0327h, RoadObjectsStoreObserver, X1.n, Y.n, ChangeLegCallback {

    /* renamed from: c, reason: collision with root package name */
    public static q f9141c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9142a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9143b;

    public /* synthetic */ q(Object obj, int i3) {
        this.f9142a = i3;
        this.f9143b = obj;
    }

    public static boolean B(int i3) {
        return i3 == 32 || i3 == 9 || i3 == 13 || i3 == 10;
    }

    public static void M(StringTokenizer stringTokenizer) {
        if (!stringTokenizer.hasMoreTokens()) {
            throw new IOException(StubApp.getString2(8189));
        }
        String nextToken = stringTokenizer.nextToken();
        if (!StubApp.getString2(1262).equals(nextToken)) {
            throw new IOException(E1.a.k(StubApp.getString2(8188), nextToken, StubApp.getString2(620)));
        }
    }

    public int A() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x04e7, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Y9.b C() {
        /*
            Method dump skipped, instructions count: 1273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z9.q.C():Y9.b");
    }

    public boolean D(int i3, int i10, Bundle bundle) {
        return false;
    }

    public float E() {
        return Float.parseFloat(H());
    }

    public int F() {
        try {
            return Integer.parseInt(H());
        } catch (NumberFormatException e10) {
            throw new IOException(StubApp.getString2(8224) + e10);
        }
    }

    public String G() {
        StringBuilder sb2 = new StringBuilder(60);
        BufferedInputStream bufferedInputStream = (BufferedInputStream) this.f9143b;
        int read = bufferedInputStream.read();
        while (B(read)) {
            read = bufferedInputStream.read();
        }
        sb2.append((char) read);
        for (int read2 = bufferedInputStream.read(); read2 != -1 && read2 != 13 && read2 != 10; read2 = bufferedInputStream.read()) {
            sb2.append((char) read2);
        }
        return sb2.toString();
    }

    public String H() {
        StringBuilder sb2 = new StringBuilder(24);
        BufferedInputStream bufferedInputStream = (BufferedInputStream) this.f9143b;
        int read = bufferedInputStream.read();
        while (B(read)) {
            read = bufferedInputStream.read();
        }
        sb2.append((char) read);
        for (int read2 = bufferedInputStream.read(); read2 != -1 && !B(read2); read2 = bufferedInputStream.read()) {
            sb2.append((char) read2);
        }
        return sb2.toString();
    }

    public void I(A0.f fVar) {
    }

    public boolean J(String str) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r7.f6848a > r3.f6848a) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(T.e0 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "newState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
        L5:
            java.lang.Object r0 = r6.f9143b
            Tb.b0 r0 = (Tb.b0) r0
            r0.getClass()
            F5.c r1 = Ub.AbstractC0347c.f7577b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = Tb.b0.f7345f
            java.lang.Object r2 = r2.get(r0)
            if (r2 != r1) goto L17
            r2 = 0
        L17:
            r3 = r2
            T.e0 r3 = (T.e0) r3
            boolean r4 = r3 instanceof T.V
            if (r4 == 0) goto L20
            r4 = 1
            goto L26
        L20:
            T.f0 r4 = T.f0.f6853b
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
        L26:
            if (r4 == 0) goto L29
            goto L33
        L29:
            boolean r4 = r3 instanceof T.C0288d
            if (r4 == 0) goto L35
            int r4 = r7.f6848a
            int r5 = r3.f6848a
            if (r4 <= r5) goto L39
        L33:
            r3 = r7
            goto L39
        L35:
            boolean r4 = r3 instanceof T.S
            if (r4 == 0) goto L47
        L39:
            if (r2 != 0) goto L3c
            r2 = r1
        L3c:
            if (r3 != 0) goto L3f
            goto L40
        L3f:
            r1 = r3
        L40:
            boolean r0 = r0.h(r2, r1)
            if (r0 == 0) goto L5
            return
        L47:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Z9.q.K(T.e0):void");
    }

    public Class L() {
        Class<?> loadClass = ((ClassLoader) this.f9143b).loadClass(StubApp.getString2(8225));
        Intrinsics.checkNotNullExpressionValue(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }

    @Override // X1.n
    public String[] a() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f9143b).getSupportedFeatures();
    }

    @Override // N.InterfaceC0157c
    public void b(Bundle bundle) {
        ((ContentInfo.Builder) this.f9143b).setExtras(bundle);
    }

    @Override // N.InterfaceC0157c
    public C0160f build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f9143b).build();
        return new C0160f(new s2.d(build));
    }

    @Override // N.InterfaceC0157c
    public void c(Uri uri) {
        ((ContentInfo.Builder) this.f9143b).setLinkUri(uri);
    }

    @Override // N.InterfaceC0157c
    public void d(int i3) {
        ((ContentInfo.Builder) this.f9143b).setFlags(i3);
    }

    @Override // Y.n
    public boolean e(CharSequence charSequence, int i3, int i10, Y.u uVar) {
        if (!TextUtils.equals(charSequence.subSequence(i3, i10), (String) this.f9143b)) {
            return true;
        }
        uVar.f8700c = (uVar.f8700c & 3) | 4;
        return false;
    }

    public void f(A0.f fVar) {
    }

    public O.e g(int i3) {
        return null;
    }

    @Override // Pb.a
    public Object get() {
        Object obj = this.f9143b;
        switch (this.f9142a) {
            case 7:
                R4.h firebaseApp = (R4.h) ((K5.c) obj).f3721a;
                Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
                Q q10 = Q.f2792a;
                return Q.a(firebaseApp);
            default:
                String packageName = ((Context) ((F5.c) obj).f2238b).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException(StubApp.getString2(8226));
        }
    }

    @Override // Y.n
    public Object getResult() {
        return this;
    }

    @Override // X1.n
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) Oc.a.i(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f9143b).getStatics());
    }

    @Override // X1.n
    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) Oc.a.i(WebkitToCompatConverterBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f9143b).getWebkitToCompatConverter());
    }

    public Z1.d h(Object obj, KClass clazz, Activity activity, C0838b consumer) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter("addWindowLayoutInfoListener", StubApp.getString2(8227));
        Intrinsics.checkNotNullParameter("removeWindowLayoutInfoListener", StubApp.getString2(8228));
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Z1.c cVar = new Z1.c(clazz, consumer);
        Object newProxyInstance = Proxy.newProxyInstance((ClassLoader) this.f9143b, new Class[]{L()}, cVar);
        Intrinsics.checkNotNullExpressionValue(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, L()).invoke(obj, activity, newProxyInstance);
        return new Z1.d(obj.getClass().getMethod("removeWindowLayoutInfoListener", L()), obj, newProxyInstance);
    }

    @Override // vb.InterfaceC1845b
    public void i(Db.c cVar) {
        Q2.g gVar = (Q2.g) this.f9143b;
        Cb.n.f((Cb.n) gVar.f5713d, (Mb.a) gVar.f5712c, false, true);
    }

    @Override // q4.d
    public void j(q4.j jVar) {
        ((CountDownLatch) this.f9143b).countDown();
    }

    public O.e k(int i3) {
        return null;
    }

    public List l(String str, List list) {
        p w10 = w(str);
        if (w10 != null) {
            ArrayList arrayList = w10.f9139a;
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    @Override // vb.InterfaceC1845b
    public void m(Hb.b bVar) {
        String string2;
        Ib.a aVar = (Ib.a) bVar;
        org.slf4j.a aVar2 = Cb.n.f1183d;
        Q2.g gVar = (Q2.g) this.f9143b;
        Cb.n nVar = (Cb.n) gVar.f5713d;
        int i3 = aVar.mode;
        nVar.getClass();
        switch (i3) {
            case 0:
                string2 = StubApp.getString2(8236);
                break;
            case 1:
                string2 = StubApp.getString2(8235);
                break;
            case 2:
                string2 = StubApp.getString2(8234);
                break;
            case 3:
                string2 = StubApp.getString2(8233);
                break;
            case 4:
                string2 = StubApp.getString2(8232);
                break;
            case 5:
                string2 = StubApp.getString2(8231);
                break;
            case 6:
                string2 = StubApp.getString2(8230);
                break;
            default:
                string2 = Xa.h.g(i3, StubApp.getString2(8229), StubApp.getString2(74));
                break;
        }
        aVar2.k(string2, Boolean.valueOf(aVar.noDowngrade));
        int i10 = aVar.mode;
        Cb.n.f((Cb.n) gVar.f5713d, (Mb.a) gVar.f5712c, i10 == 4 || i10 == 5, i10 != 4);
    }

    public Boolean n(String str) {
        p w10 = w(str);
        boolean z2 = false;
        if (w10 != null) {
            ArrayList arrayList = w10.f9139a;
            if (!arrayList.isEmpty()) {
                Boolean bool = Boolean.FALSE;
                Number number = (Number) arrayList.get(0);
                if (number instanceof Integer) {
                    int intValue = number.intValue();
                    if (intValue != 0) {
                        if (intValue == 1) {
                            bool = Boolean.TRUE;
                        }
                    }
                    z2 = bool.booleanValue();
                }
                Log.w(StubApp.getString2(948), StubApp.getString2(8237) + number + StubApp.getString2(8238) + bool);
                z2 = bool.booleanValue();
            }
        }
        return Boolean.valueOf(z2);
    }

    @Override // P0.j
    public void o(P0.l lVar, long j, long j3, boolean z2) {
    }

    @Override // com.mapbox.navigator.RerouteObserver
    public void onRerouteCancelled() {
        if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
            D9.l.d(StubApp.getString2(8239), StubApp.getString2(4455));
        }
        O8.v vVar = O8.v.f5282c;
        O8.p pVar = (O8.p) this.f9143b;
        pVar.W(vVar);
        pVar.W(O8.u.f5281c);
    }

    @Override // com.mapbox.navigator.RerouteObserver
    public boolean onRerouteDetected(String routeRequest) {
        Intrinsics.checkNotNullParameter(routeRequest, "routeRequest");
        if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
            D9.l.d(StubApp.getString2(8240) + routeRequest, StubApp.getString2(4455));
        }
        ((O8.p) this.f9143b).W(O8.t.f5280c);
        return true;
    }

    @Override // com.mapbox.navigator.RerouteObserver
    public void onRerouteFailed(RerouteError error) {
        Tc.d sVar;
        Intrinsics.checkNotNullParameter(error, "error");
        O8.p pVar = (O8.p) this.f9143b;
        pVar.getClass();
        if (D9.l.a(D9.l.g(), LoggingLevel.ERROR)) {
            D9.l.e(StubApp.getString2(8241) + error.getType() + StubApp.getString2(8242) + error.getMessage() + StubApp.getString2(8243) + error.getRouterErrors(), StubApp.getString2(4455));
        }
        if (error.getType() == RerouteErrorType.CANCELLED) {
            sVar = O8.v.f5282c;
        } else {
            String message = error.getMessage();
            Intrinsics.checkNotNullExpressionValue(message, "rerouteError.message");
            List<RouterError> routerErrors = error.getRouterErrors();
            Intrinsics.checkNotNullExpressionValue(routerErrors, "rerouteError.routerErrors");
            ArrayList arrayList = new ArrayList();
            for (Object obj : routerErrors) {
                if (((RouterError) obj).getType() != RouterErrorType.REQUEST_CANCELLED) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                RouterError routerError = (RouterError) it.next();
                URL url = new URL(routerError.getUrl());
                RouterOrigin routerOrigin = routerError.getRouterOrigin();
                Intrinsics.checkNotNullExpressionValue(routerOrigin, "it.routerOrigin");
                String routerOrigin2 = Y3.a.p(routerOrigin);
                String message2 = routerError.getMessage();
                Intrinsics.checkNotNullExpressionValue(message2, "it.message");
                RouterErrorType type = routerError.getType();
                Intrinsics.checkNotNullExpressionValue(type, "it.type");
                String type2 = Y3.a.q(type);
                boolean isRetryable = routerError.getIsRetryable();
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(routerOrigin2, "routerOrigin");
                Intrinsics.checkNotNullParameter(message2, "message");
                Intrinsics.checkNotNullParameter(type2, "type");
                arrayList2.add(new com.mapbox.navigation.base.route.o(url, routerOrigin2, message2, type2, null, isRetryable));
            }
            sVar = new O8.s(message, null, arrayList2);
        }
        pVar.W(sVar);
        pVar.W(O8.u.f5281c);
    }

    @Override // com.mapbox.navigator.RerouteObserver
    public void onRerouteReceived(DataRef routeResponse, String routeRequest, RouterOrigin origin) {
        Intrinsics.checkNotNullParameter(routeResponse, "routeResponse");
        Intrinsics.checkNotNullParameter(routeRequest, "routeRequest");
        Intrinsics.checkNotNullParameter(origin, "origin");
        if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
            D9.l.d(StubApp.getString2(8244) + routeRequest, StubApp.getString2(4455));
        }
        O8.p pVar = (O8.p) this.f9143b;
        Qb.L.j(pVar.f5267f, null, new O8.o(pVar, routeResponse, routeRequest, origin, null), 3);
    }

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public void onRoadObjectAdded(String roadObjectId) {
        Intrinsics.checkNotNullParameter(roadObjectId, "roadObjectId");
        B3.s.a((B3.s) this.f9143b, new W8.g(roadObjectId, null));
    }

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public void onRoadObjectRemoved(String roadObjectId) {
        Intrinsics.checkNotNullParameter(roadObjectId, "roadObjectId");
        B3.s.a((B3.s) this.f9143b, new W8.h(roadObjectId, null));
    }

    @Override // com.mapbox.navigator.RoadObjectsStoreObserver
    public void onRoadObjectUpdated(String roadObjectId) {
        Intrinsics.checkNotNullParameter(roadObjectId, "roadObjectId");
        B3.s.a((B3.s) this.f9143b, new W8.i(roadObjectId, null));
    }

    @Override // com.mapbox.navigator.RerouteObserver
    public void onSwitchToAlternative(RouteInterface route, int i3) {
        Object obj;
        Intrinsics.checkNotNullParameter(route, "route");
        if (D9.l.a(D9.l.g(), LoggingLevel.DEBUG)) {
            D9.l.d(StubApp.getString2(8245) + route.getRouteId(), StubApp.getString2(4455));
        }
        RouterOrigin routerOrigin = route.getRouterOrigin();
        Intrinsics.checkNotNullExpressionValue(routerOrigin, "route.routerOrigin");
        String p8 = Y3.a.p(routerOrigin);
        O8.p pVar = (O8.p) this.f9143b;
        List mutableList = CollectionsKt.toMutableList((Collection) pVar.f5265d.invoke());
        Iterator it = mutableList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (Intrinsics.areEqual(((com.mapbox.navigation.base.route.g) obj).f12506i, route.getRouteId())) {
                    break;
                }
            }
        }
        com.mapbox.navigation.base.route.g gVar = (com.mapbox.navigation.base.route.g) obj;
        if (gVar == null) {
            return;
        }
        pVar.W(O8.t.f5280c);
        mutableList.remove(gVar);
        mutableList.add(0, gVar);
        pVar.W(new O8.w(p8));
        pVar.f5266e.invoke(mutableList, Integer.valueOf(i3));
        pVar.W(O8.u.f5281c);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // Tb.InterfaceC0327h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(Tb.InterfaceC0328i r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Tb.C0320a
            if (r0 == 0) goto L13
            r0 = r7
            Tb.a r0 = (Tb.C0320a) r0
            int r1 = r0.f7332d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7332d = r1
            goto L18
        L13:
            Tb.a r0 = new Tb.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f7330b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f7332d
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L2d
            Ub.v r6 = r0.f7329a
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L2b
            goto L5f
        L2b:
            r7 = move-exception
            goto L6b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r7 = 275(0x113, float:3.85E-43)
            java.lang.String r7 = com.stub.StubApp.getString2(r7)
            r6.<init>(r7)
            throw r6
        L3a:
            kotlin.ResultKt.throwOnFailure(r7)
            Ub.v r7 = new Ub.v
            kotlin.coroutines.CoroutineContext r2 = r0.get$context()
            r7.<init>(r6, r2)
            r0.f7329a = r7     // Catch: java.lang.Throwable -> L69
            r0.f7332d = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r6 = r5.f9143b     // Catch: java.lang.Throwable -> L69
            kotlin.coroutines.jvm.internal.SuspendLambda r6 = (kotlin.coroutines.jvm.internal.SuspendLambda) r6     // Catch: java.lang.Throwable -> L69
            java.lang.Object r6 = r6.invoke(r7, r0)     // Catch: java.lang.Throwable -> L69
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()     // Catch: java.lang.Throwable -> L69
            if (r6 != r0) goto L59
            goto L5b
        L59:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L69
        L5b:
            if (r6 != r1) goto L5e
            return r1
        L5e:
            r6 = r7
        L5f:
            r6.releaseIntercepted()
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        L65:
            r4 = r7
            r7 = r6
            r6 = r4
            goto L6b
        L69:
            r6 = move-exception
            goto L65
        L6b:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Z9.q.p(Tb.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public InterfaceC1770a q() {
        return null;
    }

    @Override // P0.j
    public void r(P0.l lVar, long j, long j3) {
        boolean z2;
        y0.d dVar = (y0.d) this.f9143b;
        synchronized (Q0.b.f5690b) {
            z2 = Q0.b.f5691c;
        }
        if (z2) {
            dVar.a();
        } else {
            dVar.f23362a.z(new IOException(new ConcurrentModificationException()));
        }
    }

    @Override // com.mapbox.navigator.ChangeLegCallback
    public void run(boolean z2) {
        ((C0203k) this.f9143b).resumeWith(Result.m40constructorimpl(Boolean.valueOf(z2)));
    }

    @Override // P0.j
    public A1.g t(P0.l lVar, long j, long j3, IOException iOException, int i3) {
        ((y0.d) this.f9143b).f23362a.z(iOException);
        return P0.o.f5430e;
    }

    public String toString() {
        switch (this.f9142a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                Xa.h.w(q.class, sb2, StubApp.getString2(8246));
                sb2.append((HashMap) this.f9143b);
                sb2.append(StubApp.getString2(511));
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public e0 u() {
        b0 b0Var = (b0) this.f9143b;
        b0Var.getClass();
        F5.c cVar = AbstractC0347c.f7577b;
        Object obj = b0.f7345f.get(b0Var);
        if (obj == cVar) {
            obj = null;
        }
        return (e0) obj;
    }

    public List v(String str) {
        p w10 = w(str);
        if (w10 == null) {
            return null;
        }
        ArrayList arrayList = w10.f9139a;
        if (arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int i3 = 1; i3 < arrayList2.size(); i3++) {
            Number number = (Number) arrayList2.get(i3 - 1);
            arrayList2.set(i3, Integer.valueOf(((Number) arrayList2.get(i3)).intValue() + number.intValue()));
        }
        return arrayList2;
    }

    public p w(String str) {
        return (p) ((HashMap) this.f9143b).get(str);
    }

    public A0.d x() {
        return (A0.d) this.f9143b;
    }

    public Number y(String str, Number number) {
        p w10 = w(str);
        return (w10 == null || w10.f9139a.isEmpty()) ? number : w10.a(0);
    }

    public UUID z() {
        return AbstractC1430e.f18130a;
    }

    public q(V8.q tripSession, Z8.f nativeNavigator) {
        this.f9142a = 19;
        Intrinsics.checkNotNullParameter(tripSession, "tripSession");
        Intrinsics.checkNotNullParameter(nativeNavigator, "nativeNavigator");
        this.f9143b = new CopyOnWriteArraySet();
    }

    public q(ClassLoader loader) {
        this.f9142a = 28;
        Intrinsics.checkNotNullParameter(loader, "loader");
        this.f9143b = loader;
    }

    public q(EventsService eventsService) {
        this.f9142a = 5;
        Intrinsics.checkNotNullParameter(eventsService, "eventsService");
        this.f9143b = eventsService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q(Function2 function2) {
        this.f9142a = 21;
        this.f9143b = (SuspendLambda) function2;
    }

    public q(ClipData clipData, int i3) {
        this.f9142a = 11;
        this.f9143b = C.n.g(clipData, i3);
    }

    public q(int i3) {
        this.f9142a = i3;
        switch (i3) {
            case 9:
                this.f9143b = new Object();
                new Handler(Looper.getMainLooper(), new J4.e(this, 0));
                break;
            case 13:
                this.f9143b = new O.f(this);
                break;
            case 20:
                f0 f0Var = f0.f6853b;
                Intrinsics.checkNotNull(f0Var, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
                this.f9143b = new b0(f0Var);
                break;
            case 22:
                this.f9143b = new AtomicBoolean(false);
                break;
            default:
                this.f9143b = new HashMap();
                break;
        }
    }
}
