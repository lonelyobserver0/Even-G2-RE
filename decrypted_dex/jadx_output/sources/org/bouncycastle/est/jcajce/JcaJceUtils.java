package org.bouncycastle.est.jcajce;

import com.stub.StubApp;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CRL;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertStore;
import java.security.cert.CertificateException;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.TrustAnchor;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.X509TrustManager;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x509.ExtendedKeyUsage;
import org.bouncycastle.asn1.x509.KeyPurposeId;
import org.bouncycastle.asn1.x509.KeyUsage;
import org.bouncycastle.cert.X509CertificateHolder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaJceUtils {
    public static KeyManagerFactory createKeyManagerFactory(String str, String str2, KeyStore keyStore, char[] cArr) throws UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        KeyManagerFactory keyManagerFactory;
        if (str == null && str2 == null) {
            str = KeyManagerFactory.getDefaultAlgorithm();
        } else if (str2 != null) {
            keyManagerFactory = KeyManagerFactory.getInstance(str, str2);
            keyManagerFactory.init(keyStore, cArr);
            return keyManagerFactory;
        }
        keyManagerFactory = KeyManagerFactory.getInstance(str);
        keyManagerFactory.init(keyStore, cArr);
        return keyManagerFactory;
    }

    public static X509TrustManager[] getCertPathTrustManager(final Set<TrustAnchor> set, final CRL[] crlArr) {
        final X509Certificate[] x509CertificateArr = new X509Certificate[set.size()];
        Iterator<TrustAnchor> it = set.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            x509CertificateArr[i3] = it.next().getTrustedCert();
            i3++;
        }
        return new X509TrustManager[]{new X509TrustManager() { // from class: org.bouncycastle.est.jcajce.JcaJceUtils.2
            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr2, String str) throws CertificateException {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr2, String str) throws CertificateException {
                String string2 = StubApp.getString2(21668);
                String string22 = StubApp.getString2(10691);
                try {
                    CertStore certStore = CertStore.getInstance(string22, new CollectionCertStoreParameters(Arrays.asList(x509CertificateArr2)), string2);
                    CertPathBuilder certPathBuilder = CertPathBuilder.getInstance(StubApp.getString2("25235"), string2);
                    X509CertSelector x509CertSelector = new X509CertSelector();
                    x509CertSelector.setCertificate(x509CertificateArr2[0]);
                    PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters((Set<TrustAnchor>) set, x509CertSelector);
                    pKIXBuilderParameters.addCertStore(certStore);
                    if (crlArr != null) {
                        pKIXBuilderParameters.setRevocationEnabled(true);
                        pKIXBuilderParameters.addCertStore(CertStore.getInstance(string22, new CollectionCertStoreParameters(Arrays.asList(crlArr))));
                    } else {
                        pKIXBuilderParameters.setRevocationEnabled(false);
                    }
                    JcaJceUtils.validateServerCertUsage(x509CertificateArr2[0]);
                } catch (CertificateException e10) {
                    throw e10;
                } catch (GeneralSecurityException e11) {
                    throw new CertificateException(a.h(e11, new StringBuilder(StubApp.getString2(29554))), e11);
                }
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                X509Certificate[] x509CertificateArr2 = x509CertificateArr;
                int length = x509CertificateArr2.length;
                X509Certificate[] x509CertificateArr3 = new X509Certificate[length];
                System.arraycopy(x509CertificateArr2, 0, x509CertificateArr3, 0, length);
                return x509CertificateArr3;
            }
        }};
    }

    public static X509TrustManager getTrustAllTrustManager() {
        return new X509TrustManager() { // from class: org.bouncycastle.est.jcajce.JcaJceUtils.1
            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        };
    }

    public static void validateServerCertUsage(X509Certificate x509Certificate) throws CertificateException {
        try {
            X509CertificateHolder x509CertificateHolder = new X509CertificateHolder(x509Certificate.getEncoded());
            KeyUsage fromExtensions = KeyUsage.fromExtensions(x509CertificateHolder.getExtensions());
            if (fromExtensions != null) {
                if (fromExtensions.hasUsages(4)) {
                    throw new CertificateException(StubApp.getString2("29556"));
                }
                if (!fromExtensions.hasUsages(128) && !fromExtensions.hasUsages(32)) {
                    throw new CertificateException(StubApp.getString2("29555"));
                }
            }
            ExtendedKeyUsage fromExtensions2 = ExtendedKeyUsage.fromExtensions(x509CertificateHolder.getExtensions());
            if (fromExtensions2 != null && !fromExtensions2.hasKeyPurposeId(KeyPurposeId.id_kp_serverAuth) && !fromExtensions2.hasKeyPurposeId(KeyPurposeId.id_kp_msSGC) && !fromExtensions2.hasKeyPurposeId(KeyPurposeId.id_kp_nsSGC)) {
                throw new CertificateException(StubApp.getString2("29557"));
            }
        } catch (CertificateException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new CertificateException(e11.getMessage(), e11);
        }
    }
}
