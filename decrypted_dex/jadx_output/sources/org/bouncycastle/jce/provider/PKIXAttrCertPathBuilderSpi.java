package org.bouncycastle.jce.provider;

import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.PKIXBuilderParameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.util.Store;
import org.bouncycastle.util.StoreException;
import org.bouncycastle.x509.ExtendedPKIXBuilderParameters;
import org.bouncycastle.x509.ExtendedPKIXParameters;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIXAttrCertPathBuilderSpi extends CertPathBuilderSpi {
    private Exception certPathException;

    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.security.cert.CertPathBuilderResult build(org.bouncycastle.x509.X509AttributeCertificate r7, java.security.cert.X509Certificate r8, org.bouncycastle.jcajce.PKIXExtendedBuilderParameters r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.PKIXAttrCertPathBuilderSpi.build(org.bouncycastle.x509.X509AttributeCertificate, java.security.cert.X509Certificate, org.bouncycastle.jcajce.PKIXExtendedBuilderParameters, java.util.List):java.security.cert.CertPathBuilderResult");
    }

    public static Collection findCertificates(X509AttributeCertStoreSelector x509AttributeCertStoreSelector, List list) throws AnnotatedException {
        HashSet hashSet = new HashSet();
        for (Object obj : list) {
            if (obj instanceof Store) {
                try {
                    hashSet.addAll(((Store) obj).getMatches(x509AttributeCertStoreSelector));
                } catch (StoreException e10) {
                    throw new AnnotatedException(StubApp.getString2(32633), e10);
                }
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.CertPathBuilderSpi
    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        PKIXExtendedBuilderParameters pKIXExtendedBuilderParameters;
        boolean z2 = certPathParameters instanceof PKIXBuilderParameters;
        if (!z2 && !(certPathParameters instanceof ExtendedPKIXBuilderParameters) && !(certPathParameters instanceof PKIXExtendedBuilderParameters)) {
            throw new InvalidAlgorithmParameterException(StubApp.getString2(32699) + PKIXBuilderParameters.class.getName() + StubApp.getString2(32700) + PKIXExtendedBuilderParameters.class.getName() + StubApp.getString2(1));
        }
        new ArrayList();
        if (z2) {
            PKIXExtendedBuilderParameters.Builder builder = new PKIXExtendedBuilderParameters.Builder((PKIXBuilderParameters) certPathParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXBuilderParameters extendedPKIXBuilderParameters = (ExtendedPKIXBuilderParameters) certPathParameters;
                builder.addExcludedCerts(extendedPKIXBuilderParameters.getExcludedCerts());
                builder.setMaxPathLength(extendedPKIXBuilderParameters.getMaxPathLength());
                extendedPKIXBuilderParameters.getStores();
            }
            pKIXExtendedBuilderParameters = builder.build();
        } else {
            pKIXExtendedBuilderParameters = (PKIXExtendedBuilderParameters) certPathParameters;
        }
        new ArrayList();
        pKIXExtendedBuilderParameters.getBaseParameters().getTargetConstraints();
        throw new CertPathBuilderException(StubApp.getString2(32701) + X509AttributeCertStoreSelector.class.getName() + StubApp.getString2(6035) + getClass().getName() + StubApp.getString2(32702));
    }
}
