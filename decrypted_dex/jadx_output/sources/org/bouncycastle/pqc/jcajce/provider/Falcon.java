package org.bouncycastle.pqc.jcajce.provider;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.falcon.FalconKeyFactorySpi;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Falcon {
    private static final String PREFIX = StubApp.getString2(34437);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(34430), StubApp.getString2(34431));
            configurableProvider.addAlgorithm(StubApp.getString2(34432), StubApp.getString2(34433));
            configurableProvider.addAlgorithm(StubApp.getString2(34434), StubApp.getString2(34435));
            String string2 = StubApp.getString2(34436);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.falcon;
            String string22 = StubApp.getString2(33700);
            addSignatureAlgorithm(configurableProvider, string22, string2, aSN1ObjectIdentifier);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.falcon_512;
            addSignatureAlias(configurableProvider, string22, aSN1ObjectIdentifier2);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.falcon_1024;
            addSignatureAlias(configurableProvider, string22, aSN1ObjectIdentifier3);
            FalconKeyFactorySpi falconKeyFactorySpi = new FalconKeyFactorySpi();
            registerOid(configurableProvider, aSN1ObjectIdentifier2, string22, falconKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier3, string22, falconKeyFactorySpi);
        }
    }
}
