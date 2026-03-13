package com.google.firebase.sessions;

import B3.s;
import D5.B;
import H5.AbstractC0088v;
import H5.C0076i;
import H5.C0080m;
import H5.C0084q;
import H5.C0087u;
import H5.C0091y;
import H5.C0092z;
import H5.InterfaceC0086t;
import Qb.C;
import R4.h;
import V4.a;
import V4.b;
import W4.c;
import W4.i;
import W4.q;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.stub.StubApp;
import f5.u0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;
import x5.InterfaceC1913d;
import y3.f;

@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\b\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006 \u0007*\u0014\u0012\u000e\b\u0001\u0012\n \u0007*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00050\u00050\u0004H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "LW4/b;", "", "kotlin.jvm.PlatformType", "getComponents", "()Ljava/util/List;", "Companion", "H5/z", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final q appContext;
    private static final q backgroundDispatcher;
    private static final q blockingDispatcher;
    private static final q firebaseApp;
    private static final q firebaseInstallationsApi;
    private static final q firebaseSessionsComponent;
    private static final q transportFactory;

    @Deprecated
    public static final String LIBRARY_NAME = StubApp.getString2(12600);

    @Deprecated
    public static final String TAG = StubApp.getString2(2668);
    private static final C0092z Companion = new C0092z();

    static {
        q a3 = q.a(Context.class);
        Intrinsics.checkNotNullExpressionValue(a3, "unqualified(Context::class.java)");
        appContext = a3;
        q a9 = q.a(h.class);
        Intrinsics.checkNotNullExpressionValue(a9, "unqualified(FirebaseApp::class.java)");
        firebaseApp = a9;
        q a10 = q.a(InterfaceC1913d.class);
        Intrinsics.checkNotNullExpressionValue(a10, "unqualified(FirebaseInstallationsApi::class.java)");
        firebaseInstallationsApi = a10;
        q qVar = new q(a.class, C.class);
        Intrinsics.checkNotNullExpressionValue(qVar, "qualified(Background::cl…neDispatcher::class.java)");
        backgroundDispatcher = qVar;
        q qVar2 = new q(b.class, C.class);
        Intrinsics.checkNotNullExpressionValue(qVar2, "qualified(Blocking::clas…neDispatcher::class.java)");
        blockingDispatcher = qVar2;
        q a11 = q.a(f.class);
        Intrinsics.checkNotNullExpressionValue(a11, "unqualified(TransportFactory::class.java)");
        transportFactory = a11;
        q a12 = q.a(InterfaceC0086t.class);
        Intrinsics.checkNotNullExpressionValue(a12, "unqualified(FirebaseSessionsComponent::class.java)");
        firebaseSessionsComponent = a12;
        try {
            C0091y.f2924a.getClass();
        } catch (NoClassDefFoundError unused) {
            Log.w(StubApp.getString2(2668), StubApp.getString2(12599));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0084q getComponents$lambda$0(c cVar) {
        return (C0084q) ((C0076i) ((InterfaceC0086t) cVar.e(firebaseSessionsComponent))).f2889i.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC0086t getComponents$lambda$1(c cVar) {
        Object e10 = cVar.e(appContext);
        Intrinsics.checkNotNullExpressionValue(e10, "container[appContext]");
        Context context = (Context) e10;
        context.getClass();
        Object e11 = cVar.e(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(e11, "container[backgroundDispatcher]");
        CoroutineContext coroutineContext = (CoroutineContext) e11;
        coroutineContext.getClass();
        Object e12 = cVar.e(blockingDispatcher);
        Intrinsics.checkNotNullExpressionValue(e12, "container[blockingDispatcher]");
        ((CoroutineContext) e12).getClass();
        Object e13 = cVar.e(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(e13, "container[firebaseApp]");
        h hVar = (h) e13;
        hVar.getClass();
        Object e14 = cVar.e(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(e14, "container[firebaseInstallationsApi]");
        InterfaceC1913d interfaceC1913d = (InterfaceC1913d) e14;
        interfaceC1913d.getClass();
        w5.b d8 = cVar.d(transportFactory);
        Intrinsics.checkNotNullExpressionValue(d8, "container.getProvider(transportFactory)");
        d8.getClass();
        C0076i c0076i = new C0076i();
        c0076i.f2881a = K5.c.a(hVar);
        K5.c a3 = K5.c.a(context);
        c0076i.f2882b = a3;
        c0076i.f2883c = K5.a.a(new C0087u(a3, 1));
        c0076i.f2884d = K5.c.a(coroutineContext);
        c0076i.f2885e = K5.c.a(interfaceC1913d);
        Pb.a a9 = K5.a.a(new Z9.q(c0076i.f2881a, 7));
        c0076i.f2886f = a9;
        c0076i.f2887g = K5.a.a(new Z9.C(16, a9, c0076i.f2884d));
        int i3 = 14;
        c0076i.f2888h = K5.a.a(new E0(i3, c0076i.f2883c, K5.a.a(new s(c0076i.f2884d, c0076i.f2885e, c0076i.f2886f, c0076i.f2887g, K5.a.a(new F5.c(K5.a.a(new C0087u(c0076i.f2882b, 0)), 12)), 4))));
        Pb.a a10 = K5.a.a(new C0080m(c0076i.f2882b, 1));
        K5.c cVar2 = c0076i.f2881a;
        Pb.a aVar = c0076i.f2888h;
        K5.c cVar3 = c0076i.f2884d;
        B b2 = new B();
        b2.f1340a = cVar2;
        b2.f1341b = aVar;
        b2.f1342c = cVar3;
        b2.f1343d = a10;
        c0076i.f2889i = K5.a.a(b2);
        int i10 = 10;
        c0076i.j = K5.a.a(new E0(i10, c0076i.f2884d, K5.a.a(new F5.c(c0076i.f2882b, 9))));
        c0076i.f2890k = K5.a.a(new s(c0076i.f2881a, c0076i.f2885e, c0076i.f2888h, K5.a.a(new C0080m(K5.c.a(d8), 0)), c0076i.f2884d, 3));
        c0076i.f2891l = K5.a.a(AbstractC0088v.f2920a);
        int i11 = 13;
        c0076i.f2892m = K5.a.a(new Z9.C(i11, c0076i.f2891l, K5.a.a(AbstractC0088v.f2921b)));
        return c0076i;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<W4.b> getComponents() {
        U9.h b2 = W4.b.b(C0084q.class);
        String string2 = StubApp.getString2(12600);
        b2.f7520a = string2;
        b2.b(i.a(firebaseSessionsComponent));
        b2.f7525f = new A1.a(13);
        b2.g(2);
        W4.b e10 = b2.e();
        U9.h b10 = W4.b.b(InterfaceC0086t.class);
        b10.f7520a = StubApp.getString2(12601);
        b10.b(i.a(appContext));
        b10.b(i.a(backgroundDispatcher));
        b10.b(i.a(blockingDispatcher));
        b10.b(i.a(firebaseApp));
        b10.b(i.a(firebaseInstallationsApi));
        b10.b(new i(transportFactory, 1, 1));
        b10.f7525f = new A1.a(14);
        return CollectionsKt.listOf((Object[]) new W4.b[]{e10, b10.e(), u0.g(string2, StubApp.getString2(2638))});
    }
}
