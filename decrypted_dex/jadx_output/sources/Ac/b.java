package Ac;

import com.stub.StubApp;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.ArraysKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import l4.T;
import n.Q0;
import wc.C1890g;
import wc.C1891h;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f297a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f298b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f299c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f300d;

    public b(T t3, int i3, boolean z2, boolean z10) {
        Objects.requireNonNull(t3);
        this.f300d = t3;
        this.f297a = i3;
        this.f298b = z2;
        this.f299c = z10;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.io.Serializable, java.lang.String[]] */
    public wc.k a(SSLSocket sslSocket) {
        wc.k connectionSpec;
        int i3;
        boolean z2;
        String[] enabledCipherSuites;
        String[] tlsVersionsIntersection;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        int i10 = this.f297a;
        List list = (List) this.f300d;
        int size = list.size();
        while (true) {
            if (i10 >= size) {
                connectionSpec = null;
                break;
            }
            int i11 = i10 + 1;
            connectionSpec = (wc.k) list.get(i10);
            if (connectionSpec.b(sslSocket)) {
                this.f297a = i11;
                break;
            }
            i10 = i11;
        }
        if (connectionSpec == null) {
            StringBuilder sb2 = new StringBuilder(StubApp.getString2(24934));
            sb2.append(this.f299c);
            sb2.append(StubApp.getString2(24935));
            sb2.append(list);
            sb2.append(StubApp.getString2(24936));
            String[] enabledProtocols = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNull(enabledProtocols);
            String arrays = Arrays.toString(enabledProtocols);
            Intrinsics.checkNotNullExpressionValue(arrays, "toString(this)");
            sb2.append(arrays);
            throw new UnknownServiceException(sb2.toString());
        }
        int i12 = this.f297a;
        int size2 = list.size();
        while (true) {
            i3 = 0;
            if (i12 >= size2) {
                z2 = false;
                break;
            }
            int i13 = i12 + 1;
            if (((wc.k) list.get(i12)).b(sslSocket)) {
                z2 = true;
                break;
            }
            i12 = i13;
        }
        this.f298b = z2;
        boolean z10 = this.f299c;
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        String[] strArr = connectionSpec.f22397c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sslSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = xc.b.p(enabledCipherSuites2, strArr, C1891h.f22374c);
        } else {
            enabledCipherSuites = sslSocket.getEnabledCipherSuites();
        }
        ?? r72 = connectionSpec.f22398d;
        if (r72 != 0) {
            String[] enabledProtocols2 = sslSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = xc.b.p(enabledProtocols2, r72, ComparisonsKt.naturalOrder());
        } else {
            tlsVersionsIntersection = sslSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        C1890g comparator = C1891h.f22374c;
        byte[] bArr = xc.b.f23179a;
        Intrinsics.checkNotNullParameter(supportedCipherSuites, "<this>");
        String value = StubApp.getString2(24932);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        int length = supportedCipherSuites.length;
        while (true) {
            if (i3 >= length) {
                i3 = -1;
                break;
            }
            if (comparator.compare(supportedCipherSuites[i3], value) == 0) {
                break;
            }
            i3++;
        }
        String string2 = StubApp.getString2(24933);
        if (z10 && i3 != -1) {
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, string2);
            String value2 = supportedCipherSuites[i3];
            Intrinsics.checkNotNullExpressionValue(value2, "supportedCipherSuites[indexOfFallbackScsv]");
            Intrinsics.checkNotNullParameter(enabledCipherSuites, "<this>");
            Intrinsics.checkNotNullParameter(value2, "value");
            Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) copyOf;
            enabledCipherSuites[ArraysKt.getLastIndex(enabledCipherSuites)] = value2;
        }
        Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
        Q0 q02 = new Q0();
        q02.f17457a = connectionSpec.f22395a;
        q02.f17459c = strArr;
        q02.f17460d = r72;
        q02.f17458b = connectionSpec.f22396b;
        Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, string2);
        q02.b((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        q02.d((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        wc.k a3 = q02.a();
        if (a3.c() != null) {
            sslSocket.setEnabledProtocols(a3.f22398d);
        }
        if (a3.a() != null) {
            sslSocket.setEnabledCipherSuites(a3.f22397c);
        }
        return connectionSpec;
    }

    public void b(String str) {
        ((T) this.f300d).t(this.f297a, this.f298b, this.f299c, str, null, null, null);
    }

    public void c(Object obj, String str) {
        ((T) this.f300d).t(this.f297a, this.f298b, this.f299c, str, obj, null, null);
    }

    public void d(String str, Object obj, Object obj2) {
        ((T) this.f300d).t(this.f297a, this.f298b, this.f299c, str, obj, obj2, null);
    }

    public void e(String str, Object obj, Object obj2, Object obj3) {
        ((T) this.f300d).t(this.f297a, this.f298b, this.f299c, str, obj, obj2, obj3);
    }

    public b(List connectionSpecs) {
        Intrinsics.checkNotNullParameter(connectionSpecs, "connectionSpecs");
        this.f300d = connectionSpecs;
    }
}
