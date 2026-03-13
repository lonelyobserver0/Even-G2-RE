package Ic;

import Kc.AbstractC0095b;
import com.stub.StubApp;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class c implements HostnameVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final c f3252a = new c();

    public static List a(X509Certificate x509Certificate, int i3) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.areEqual(list.get(0), Integer.valueOf(i3)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return CollectionsKt.emptyList();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0156, code lost:
    
        if (r1 != (-1)) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[LOOP:1: B:26:0x0082->B:58:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ic.c.b(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (host.length() == ((int) AbstractC0095b.k(host))) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                if (certificate != null) {
                    return b(host, (X509Certificate) certificate);
                }
                throw new NullPointerException(StubApp.getString2("25289"));
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
