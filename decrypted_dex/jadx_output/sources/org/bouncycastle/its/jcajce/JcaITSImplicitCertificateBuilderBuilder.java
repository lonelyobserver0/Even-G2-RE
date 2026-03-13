package org.bouncycastle.its.jcajce;

import java.security.Provider;
import org.bouncycastle.its.ITSCertificate;
import org.bouncycastle.its.ITSImplicitCertificateBuilder;
import org.bouncycastle.oer.its.ieee1609dot2.ToBeSignedCertificate;
import org.bouncycastle.operator.OperatorCreationException;
import org.bouncycastle.operator.jcajce.JcaDigestCalculatorProviderBuilder;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaITSImplicitCertificateBuilderBuilder {
    private final JcaDigestCalculatorProviderBuilder digestCalculatorProviderBuilder = new JcaDigestCalculatorProviderBuilder();

    public ITSImplicitCertificateBuilder build(ITSCertificate iTSCertificate, ToBeSignedCertificate.Builder builder) throws OperatorCreationException {
        return new ITSImplicitCertificateBuilder(iTSCertificate, this.digestCalculatorProviderBuilder.build(), builder);
    }

    public JcaITSImplicitCertificateBuilderBuilder setProvider(String str) {
        this.digestCalculatorProviderBuilder.setProvider(str);
        return this;
    }

    public JcaITSImplicitCertificateBuilderBuilder setProvider(Provider provider) {
        this.digestCalculatorProviderBuilder.setProvider(provider);
        return this;
    }
}
