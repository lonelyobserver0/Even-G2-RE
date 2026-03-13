package Ec;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.internal.measurement.L1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class a extends n {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f2135d;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2136c;

    static {
        f2135d = C2.i.y() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) new Fc.m[]{(!C2.i.y() || Build.VERSION.SDK_INT < 29) ? null : new Fc.a(), new Fc.l(Fc.f.f2358f), new Fc.l(Fc.j.f2365a), new Fc.l(Fc.h.f2364a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listOfNotNull) {
            if (((Fc.m) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f2136c = arrayList;
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
    public final void d(SSLSocket sslSocket, String str, List protocols) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Intrinsics.checkNotNullParameter(protocols, "protocols");
        Iterator it = this.f2136c.iterator();
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
    public final String f(SSLSocket sslSocket) {
        Object obj;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        Iterator it = this.f2136c.iterator();
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
    public final boolean h(String hostname) {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
