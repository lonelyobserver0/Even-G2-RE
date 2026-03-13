package org.bouncycastle.jcajce.provider.asymmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ua.UAObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.dstu.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSTU4145 {
    private static final String PREFIX = StubApp.getString2(29811);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(29797), StubApp.getString2(29798));
            String string2 = StubApp.getString2(29799);
            String string22 = StubApp.getString2(29292);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(29800), string22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = UAObjectIdentifiers.dstu4145le;
            registerOid(configurableProvider, aSN1ObjectIdentifier, string22, new KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier, string22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = UAObjectIdentifiers.dstu4145be;
            registerOid(configurableProvider, aSN1ObjectIdentifier2, string22, new KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(29801), StubApp.getString2(29802));
            configurableProvider.addAlgorithm(StubApp.getString2(29803), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(29804), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(29805), StubApp.getString2(29806));
            configurableProvider.addAlgorithm(StubApp.getString2(29807), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(29808), string22);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28192), StubApp.getString2(29809), StubApp.getString2(29810), aSN1ObjectIdentifier);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28192), StubApp.getString2(29292), StubApp.getString2(29806), aSN1ObjectIdentifier2);
        }
    }
}
