package org.bouncycastle.jcajce.provider.asymmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.gost.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GOST {
    private static final String PREFIX = StubApp.getString2(30273);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(30252), StubApp.getString2(30253));
            String string2 = StubApp.getString2(30254);
            String string22 = StubApp.getString2(28165);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30255), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30256), StubApp.getString2(30257));
            configurableProvider.addAlgorithm(StubApp.getString2(30258), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30259), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30260), StubApp.getString2(30261));
            configurableProvider.addAlgorithm(StubApp.getString2(30262), StubApp.getString2(30263));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.gostR3410_94;
            registerOid(configurableProvider, aSN1ObjectIdentifier, string22, new KeyFactorySpi());
            registerOidAlgorithmParameterGenerator(configurableProvider, aSN1ObjectIdentifier, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30264), StubApp.getString2(30265));
            configurableProvider.addAlgorithm(StubApp.getString2(30266), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30267), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30268), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30269), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30270), string22);
            a.z(new StringBuilder(StubApp.getString2(29795)), CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_94, configurableProvider, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30271), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30272), string22);
        }
    }
}
