package Ec;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import wc.y;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class k extends n {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f2158c;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r0.intValue() >= 9) goto L13;
     */
    static {
        /*
            r0 = 25245(0x629d, float:3.5376E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            java.lang.String r0 = java.lang.System.getProperty(r0)
            if (r0 != 0) goto Lf
            r0 = 0
            goto L13
        Lf:
            java.lang.Integer r0 = kotlin.text.StringsKt.toIntOrNull(r0)
        L13:
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L22
            int r0 = r0.intValue()
            r3 = 9
            if (r0 < r3) goto L20
            goto L2f
        L20:
            r1 = r2
            goto L2f
        L22:
            java.lang.Class<javax.net.ssl.SSLSocket> r0 = javax.net.ssl.SSLSocket.class
            java.lang.String r3 = "25246"
            java.lang.String r3 = com.stub.StubApp.getString2(r3)     // Catch: java.lang.NoSuchMethodException -> L20
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L20
            r0.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L20
        L2f:
            Ec.k.f2158c = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Ec.k.<clinit>():void");
    }

    @Override // Ec.n
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
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
        Object[] array = arrayList2.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException(StubApp.getString2(11601));
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // Ec.n
    public final String f(SSLSocket sslSocket) {
        String applicationProtocol;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        try {
            applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : Intrinsics.areEqual(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
