package org.bouncycastle.jce.provider;

import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPathBuilderException;
import java.security.cert.CertPathBuilderResult;
import java.security.cert.CertPathBuilderSpi;
import java.security.cert.CertPathParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import org.bouncycastle.jcajce.PKIXCertStore;
import org.bouncycastle.jcajce.PKIXExtendedBuilderParameters;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.x509.ExtendedPKIXBuilderParameters;
import org.bouncycastle.x509.ExtendedPKIXParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIXCertPathBuilderSpi extends CertPathBuilderSpi {
    private Exception certPathException;
    private final boolean isForCRLCheck;

    public PKIXCertPathBuilderSpi() {
        this(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.security.cert.CertPathBuilderResult build(java.security.cert.X509Certificate r6, org.bouncycastle.jcajce.PKIXExtendedBuilderParameters r7, java.util.List r8) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jce.provider.PKIXCertPathBuilderSpi.build(java.security.cert.X509Certificate, org.bouncycastle.jcajce.PKIXExtendedBuilderParameters, java.util.List):java.security.cert.CertPathBuilderResult");
    }

    @Override // java.security.cert.CertPathBuilderSpi
    public CertPathBuilderResult engineBuild(CertPathParameters certPathParameters) throws CertPathBuilderException, InvalidAlgorithmParameterException {
        PKIXExtendedBuilderParameters pKIXExtendedBuilderParameters;
        Exception exc;
        PKIXExtendedBuilderParameters.Builder builder;
        if (certPathParameters instanceof PKIXBuilderParameters) {
            PKIXBuilderParameters pKIXBuilderParameters = (PKIXBuilderParameters) certPathParameters;
            PKIXExtendedParameters.Builder builder2 = new PKIXExtendedParameters.Builder(pKIXBuilderParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXBuilderParameters extendedPKIXBuilderParameters = (ExtendedPKIXBuilderParameters) certPathParameters;
                Iterator it = extendedPKIXBuilderParameters.getAdditionalStores().iterator();
                while (it.hasNext()) {
                    builder2.addCertificateStore((PKIXCertStore) it.next());
                }
                builder = new PKIXExtendedBuilderParameters.Builder(builder2.build());
                builder.addExcludedCerts(extendedPKIXBuilderParameters.getExcludedCerts());
                builder.setMaxPathLength(extendedPKIXBuilderParameters.getMaxPathLength());
            } else {
                builder = new PKIXExtendedBuilderParameters.Builder(pKIXBuilderParameters);
            }
            pKIXExtendedBuilderParameters = builder.build();
        } else {
            if (!(certPathParameters instanceof PKIXExtendedBuilderParameters)) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(32699) + PKIXBuilderParameters.class.getName() + StubApp.getString2(32700) + PKIXExtendedBuilderParameters.class.getName() + StubApp.getString2(1));
            }
            pKIXExtendedBuilderParameters = (PKIXExtendedBuilderParameters) certPathParameters;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = CertPathValidatorUtilities.findTargets(pKIXExtendedBuilderParameters).iterator();
        CertPathBuilderResult certPathBuilderResult = null;
        while (it2.hasNext() && certPathBuilderResult == null) {
            certPathBuilderResult = build((X509Certificate) it2.next(), pKIXExtendedBuilderParameters, arrayList);
        }
        if (certPathBuilderResult == null && (exc = this.certPathException) != null) {
            if (exc instanceof AnnotatedException) {
                throw new CertPathBuilderException(this.certPathException.getMessage(), this.certPathException.getCause());
            }
            throw new CertPathBuilderException(StubApp.getString2(32707), this.certPathException);
        }
        if (certPathBuilderResult == null && this.certPathException == null) {
            throw new CertPathBuilderException(StubApp.getString2(32708));
        }
        return certPathBuilderResult;
    }

    public PKIXCertPathBuilderSpi(boolean z2) {
        this.isForCRLCheck = z2;
    }
}
