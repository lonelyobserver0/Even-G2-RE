package org.bouncycastle.pqc.jcajce.provider;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.jcajce.provider.sphincs.Sphincs256KeyFactorySpi;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SPHINCS {
    private static final String PREFIX = StubApp.getString2(34582);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(34576), StubApp.getString2(34577));
            configurableProvider.addAlgorithm(StubApp.getString2(34578), StubApp.getString2(34579));
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(21751), StubApp.getString2(28190), StubApp.getString2(34580), PQCObjectIdentifiers.sphincs256_with_SHA512);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28177), StubApp.getString2(28190), StubApp.getString2(34581), PQCObjectIdentifiers.sphincs256_with_SHA3_512);
            Sphincs256KeyFactorySpi sphincs256KeyFactorySpi = new Sphincs256KeyFactorySpi();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PQCObjectIdentifiers.sphincs256;
            String string2 = StubApp.getString2(28190);
            registerOid(configurableProvider, aSN1ObjectIdentifier, string2, sphincs256KeyFactorySpi);
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier, string2);
        }
    }
}
