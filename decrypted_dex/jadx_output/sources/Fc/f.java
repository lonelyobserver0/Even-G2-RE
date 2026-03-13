package Fc;

import com.stub.StubApp;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class f implements m {

    /* renamed from: f, reason: collision with root package name */
    public static final e f2358f;

    /* renamed from: a, reason: collision with root package name */
    public final Class f2359a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f2360b;

    /* renamed from: c, reason: collision with root package name */
    public final Method f2361c;

    /* renamed from: d, reason: collision with root package name */
    public final Method f2362d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f2363e;

    static {
        Intrinsics.checkNotNullParameter("com.google.android.gms.org.conscrypt", StubApp.getString2(1415));
        f2358f = new e();
    }

    public f(Class sslSocketClass) {
        Intrinsics.checkNotNullParameter(sslSocketClass, "sslSocketClass");
        this.f2359a = sslSocketClass;
        Method declaredMethod = sslSocketClass.getDeclaredMethod(StubApp.getString2(25284), Boolean.TYPE);
        Intrinsics.checkNotNullExpressionValue(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f2360b = declaredMethod;
        this.f2361c = sslSocketClass.getMethod(StubApp.getString2(25285), String.class);
        this.f2362d = sslSocketClass.getMethod(StubApp.getString2(25286), new Class[0]);
        this.f2363e = sslSocketClass.getMethod(StubApp.getString2(25287), byte[].class);
    }

    @Override // Fc.m
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        return this.f2359a.isInstance(sslSocket);
    }

    @Override // Fc.m
    public final boolean b() {
        boolean z2 = Ec.c.f2139e;
        return Ec.c.f2139e;
    }

    @Override // Fc.m
    public final String c(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        if (!a(sslSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f2362d.invoke(sslSocket, new Object[0]);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, Charsets.UTF_8);
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && Intrinsics.areEqual(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // Fc.m
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        if (a(sslSocket)) {
            try {
                this.f2360b.invoke(sslSocket, Boolean.TRUE);
                if (str != null) {
                    this.f2361c.invoke(sslSocket, str);
                }
                Method method = this.f2363e;
                Ec.n nVar = Ec.n.f2161a;
                method.invoke(sslSocket, C2.i.u(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
