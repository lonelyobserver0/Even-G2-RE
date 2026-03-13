package Fc;

import com.stub.StubApp;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class e implements k {
    @Override // Fc.k
    public final boolean a(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String name = sslSocket.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "sslSocket.javaClass.name");
        return StringsKt.O(name, Intrinsics.stringPlus(StubApp.getString2(25283), "."));
    }

    @Override // Fc.k
    public final m b(SSLSocket sslSocket) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        e eVar = f.f2358f;
        Class<?> cls = sslSocket.getClass();
        Class<?> cls2 = cls;
        while (!Intrinsics.areEqual(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError(Intrinsics.stringPlus("No OpenSSLSocketImpl superclass of socket of type ", cls));
            }
        }
        Intrinsics.checkNotNull(cls2);
        return new f(cls2);
    }
}
