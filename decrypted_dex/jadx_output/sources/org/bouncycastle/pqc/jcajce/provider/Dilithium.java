package org.bouncycastle.pqc.jcajce.provider;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.dilithium.DilithiumKeyFactorySpi;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Dilithium {
    private static final String PREFIX = StubApp.getString2(34429);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(34422), StubApp.getString2(34423));
            configurableProvider.addAlgorithm(StubApp.getString2(34424), StubApp.getString2(34425));
            configurableProvider.addAlgorithm(StubApp.getString2(34426), StubApp.getString2(34427));
            String string2 = StubApp.getString2(34428);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.dilithium;
            String string22 = StubApp.getString2(33849);
            addSignatureAlgorithm(configurableProvider, string22, string2, aSN1ObjectIdentifier);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = BCObjectIdentifiers.dilithium2;
            addSignatureAlias(configurableProvider, string22, aSN1ObjectIdentifier2);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.dilithium3;
            addSignatureAlias(configurableProvider, string22, aSN1ObjectIdentifier3);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.dilithium5;
            addSignatureAlias(configurableProvider, string22, aSN1ObjectIdentifier4);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = BCObjectIdentifiers.dilithium2_aes;
            addSignatureAlias(configurableProvider, string22, aSN1ObjectIdentifier5);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = BCObjectIdentifiers.dilithium3_aes;
            addSignatureAlias(configurableProvider, string22, aSN1ObjectIdentifier6);
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = BCObjectIdentifiers.dilithium5_aes;
            addSignatureAlias(configurableProvider, string22, aSN1ObjectIdentifier7);
            DilithiumKeyFactorySpi dilithiumKeyFactorySpi = new DilithiumKeyFactorySpi();
            registerOid(configurableProvider, aSN1ObjectIdentifier2, string22, dilithiumKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier3, string22, dilithiumKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier4, string22, dilithiumKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier5, string22, dilithiumKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier6, string22, dilithiumKeyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier7, string22, dilithiumKeyFactorySpi);
        }
    }
}
