package Ec;

import com.stub.StubApp;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import wc.y;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class j extends n {

    /* renamed from: c, reason: collision with root package name */
    public final Method f2153c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f2154d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f2155e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f2156f;

    /* renamed from: g, reason: collision with root package name */
    public final Class f2157g;

    public j(Method putMethod, Method getMethod, Method removeMethod, Class clientProviderClass, Class serverProviderClass) {
        Intrinsics.checkNotNullParameter(putMethod, "putMethod");
        Intrinsics.checkNotNullParameter(getMethod, "getMethod");
        Intrinsics.checkNotNullParameter(removeMethod, "removeMethod");
        Intrinsics.checkNotNullParameter(clientProviderClass, "clientProviderClass");
        Intrinsics.checkNotNullParameter(serverProviderClass, "serverProviderClass");
        this.f2153c = putMethod;
        this.f2154d = getMethod;
        this.f2155e = removeMethod;
        this.f2156f = clientProviderClass;
        this.f2157g = serverProviderClass;
    }

    @Override // Ec.n
    public final void a(SSLSocket sslSocket) {
        String string2 = StubApp.getString2(25240);
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            this.f2155e.invoke(null, sslSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(string2, e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError(string2, e11);
        }
    }

    @Override // Ec.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        String string2 = StubApp.getString2(25241);
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((y) obj) != y.f22485b) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((y) it.next()).f22492a);
        }
        try {
            this.f2153c.invoke(null, sslSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f2156f, this.f2157g}, new i(arrayList2)));
        } catch (IllegalAccessException e10) {
            throw new AssertionError(string2, e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError(string2, e11);
        }
    }

    @Override // Ec.n
    public final String f(SSLSocket sslSocket) {
        String string2 = StubApp.getString2(25242);
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f2154d.invoke(null, sslSocket));
            if (invocationHandler == null) {
                throw new NullPointerException(StubApp.getString2("25244"));
            }
            i iVar = (i) invocationHandler;
            boolean z2 = iVar.f2151b;
            if (!z2 && iVar.f2152c == null) {
                n.i(StubApp.getString2("25243"), 4, null);
                return null;
            }
            if (z2) {
                return null;
            }
            return iVar.f2152c;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(string2, e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError(string2, e11);
        }
    }
}
