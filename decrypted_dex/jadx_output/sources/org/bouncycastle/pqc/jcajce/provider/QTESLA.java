package org.bouncycastle.pqc.jcajce.provider;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.jcajce.provider.qtesla.QTESLAKeyFactorySpi;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class QTESLA {
    private static final String PREFIX = StubApp.getString2(34546);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(34536), StubApp.getString2(34537));
            configurableProvider.addAlgorithm(StubApp.getString2(34538), StubApp.getString2(34539));
            configurableProvider.addAlgorithm(StubApp.getString2(34540), StubApp.getString2(34541));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PQCObjectIdentifiers.qTESLA_p_I;
            String string2 = StubApp.getString2(34542);
            addSignatureAlgorithm(configurableProvider, string2, StubApp.getString2(34543), aSN1ObjectIdentifier);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PQCObjectIdentifiers.qTESLA_p_III;
            String string22 = StubApp.getString2(34544);
            addSignatureAlgorithm(configurableProvider, string22, StubApp.getString2(34545), aSN1ObjectIdentifier2);
            QTESLAKeyFactorySpi qTESLAKeyFactorySpi = new QTESLAKeyFactorySpi();
            registerOid(configurableProvider, aSN1ObjectIdentifier, string2, qTESLAKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier2, string22, qTESLAKeyFactorySpi);
        }
    }
}
