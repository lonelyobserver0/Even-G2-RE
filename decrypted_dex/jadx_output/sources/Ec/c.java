package Ec;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.internal.measurement.L1;
import com.stub.StubApp;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class c extends n {

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f2139e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2140c;

    /* renamed from: d, reason: collision with root package name */
    public final Q2.g f2141d;

    static {
        boolean z2 = false;
        if (C2.i.y() && Build.VERSION.SDK_INT < 30) {
            z2 = true;
        }
        f2139e = z2;
    }

    public c() {
        Fc.n nVar;
        Method method;
        Method method2;
        int i3 = Fc.n.f2368g;
        String packageName = StubApp.getString2(25215);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Method method3 = null;
        try {
            Class<?> sslSocketClass = Class.forName(Intrinsics.stringPlus(packageName, ".OpenSSLSocketImpl"));
            Class<?> sslSocketFactoryClass = Class.forName(Intrinsics.stringPlus(packageName, ".OpenSSLSocketFactoryImpl"));
            Class<?> paramClass = Class.forName(Intrinsics.stringPlus(packageName, ".SSLParametersImpl"));
            Intrinsics.checkNotNullExpressionValue(paramClass, "paramsClass");
            Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
            Intrinsics.checkNotNullParameter(sslSocketFactoryClass, "sslSocketFactoryClass");
            Intrinsics.checkNotNullParameter(paramClass, "paramClass");
            nVar = new Fc.n(sslSocketClass);
        } catch (Exception e10) {
            n.f2161a.getClass();
            n.i(StubApp.getString2(25216), 5, e10);
            nVar = null;
        }
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) new Fc.m[]{nVar, new Fc.l(Fc.f.f2358f), new Fc.l(Fc.j.f2365a), new Fc.l(Fc.h.f2364a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOfNotNull) {
            if (((Fc.m) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f2140c = arrayList;
        try {
            Class<?> cls = Class.forName(StubApp.getString2("25217"));
            Method method4 = cls.getMethod(StubApp.getString2("6443"), new Class[0]);
            method2 = cls.getMethod(StubApp.getString2("23755"), String.class);
            method = cls.getMethod(StubApp.getString2("25218"), new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f2141d = new Q2.g(method3, method2, method, 13);
    }

    @Override // Ec.n
    public final L1 b(X509TrustManager trustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        Fc.b bVar = x509TrustManagerExtensions != null ? new Fc.b(trustManager, x509TrustManagerExtensions) : null;
        return bVar == null ? super.b(trustManager) : bVar;
    }

    @Override // Ec.n
    public final Ic.d c(X509TrustManager trustManager) {
        Intrinsics.checkNotNullParameter(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod(StubApp.getString2("25219"), X509Certificate.class);
            method.setAccessible(true);
            Intrinsics.checkNotNullExpressionValue(method, "method");
            return new b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.c(trustManager);
        }
    }

    @Override // Ec.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f2140c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Fc.m) obj).a(sslSocket)) {
                    break;
                }
            }
        }
        Fc.m mVar = (Fc.m) obj;
        if (mVar == null) {
            return;
        }
        mVar.d(sslSocket, str, protocols);
    }

    @Override // Ec.n
    public final void e(Socket socket, InetSocketAddress address, int i3) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        Intrinsics.checkNotNullParameter(address, "address");
        socket.connect(address, i3);
    }

    @Override // Ec.n
    public final String f(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f2140c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Fc.m) obj).a(sslSocket)) {
                break;
            }
        }
        Fc.m mVar = (Fc.m) obj;
        if (mVar == null) {
            return null;
        }
        return mVar.c(sslSocket);
    }

    @Override // Ec.n
    public final Object g() {
        String closer = StubApp.getString2(25220);
        Intrinsics.checkNotNullParameter(closer, "closer");
        Q2.g gVar = this.f2141d;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(closer, "closer");
        Method method = (Method) gVar.f5711b;
        if (method != null) {
            try {
                Object invoke = method.invoke(null, new Object[0]);
                Method method2 = (Method) gVar.f5712c;
                Intrinsics.checkNotNull(method2);
                method2.invoke(invoke, closer);
                return invoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Override // Ec.n
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // Ec.n
    public final void j(Object obj, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Q2.g gVar = this.f2141d;
        gVar.getClass();
        if (obj != null) {
            try {
                Method method = (Method) gVar.f5713d;
                Intrinsics.checkNotNull(method);
                method.invoke(obj, new Object[0]);
                return;
            } catch (Exception unused) {
            }
        }
        n.i(message, 5, null);
    }
}
