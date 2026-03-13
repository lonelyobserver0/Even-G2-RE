package org.bouncycastle.jce.provider;

import Xa.h;
import com.stub.StubApp;
import java.security.InvalidAlgorithmParameterException;
import java.security.cert.CertPath;
import java.security.cert.CertPathParameters;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertPathValidatorResult;
import java.security.cert.CertPathValidatorSpi;
import java.security.cert.PKIXParameters;
import java.util.Date;
import java.util.HashSet;
import org.bouncycastle.jcajce.PKIXExtendedParameters;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.x509.ExtendedPKIXParameters;
import org.bouncycastle.x509.X509AttributeCertStoreSelector;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIXAttrCertPathValidatorSpi extends CertPathValidatorSpi {
    private final JcaJceHelper helper = new BCJcaJceHelper();

    @Override // java.security.cert.CertPathValidatorSpi
    public CertPathValidatorResult engineValidate(CertPath certPath, CertPathParameters certPathParameters) throws CertPathValidatorException, InvalidAlgorithmParameterException {
        PKIXExtendedParameters pKIXExtendedParameters;
        if (!(certPathParameters instanceof ExtendedPKIXParameters) && !(certPathParameters instanceof PKIXExtendedParameters)) {
            throw new InvalidAlgorithmParameterException(h.k(ExtendedPKIXParameters.class, new StringBuilder(StubApp.getString2(32703)), StubApp.getString2(32704)));
        }
        new HashSet();
        new HashSet();
        new HashSet();
        new HashSet();
        if (certPathParameters instanceof PKIXParameters) {
            PKIXExtendedParameters.Builder builder = new PKIXExtendedParameters.Builder((PKIXParameters) certPathParameters);
            if (certPathParameters instanceof ExtendedPKIXParameters) {
                ExtendedPKIXParameters extendedPKIXParameters = (ExtendedPKIXParameters) certPathParameters;
                builder.setUseDeltasEnabled(extendedPKIXParameters.isUseDeltasEnabled());
                builder.setValidityModel(extendedPKIXParameters.getValidityModel());
                extendedPKIXParameters.getAttrCertCheckers();
                extendedPKIXParameters.getProhibitedACAttributes();
                extendedPKIXParameters.getNecessaryACAttributes();
            }
            pKIXExtendedParameters = builder.build();
        } else {
            pKIXExtendedParameters = (PKIXExtendedParameters) certPathParameters;
        }
        CertPathValidatorUtilities.getValidityDate(pKIXExtendedParameters, new Date());
        pKIXExtendedParameters.getTargetConstraints();
        throw new InvalidAlgorithmParameterException(StubApp.getString2(32701) + X509AttributeCertStoreSelector.class.getName() + StubApp.getString2(6035) + getClass().getName() + StubApp.getString2(32702));
    }
}
