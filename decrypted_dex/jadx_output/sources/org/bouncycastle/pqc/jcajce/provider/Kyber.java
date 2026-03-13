package org.bouncycastle.pqc.jcajce.provider;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.kyber.KyberKeyFactorySpi;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Kyber {
    private static final String PREFIX = StubApp.getString2(34466);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(34457), StubApp.getString2(34458));
            configurableProvider.addAlgorithm(StubApp.getString2(34459), StubApp.getString2(34460));
            configurableProvider.addAlgorithm(StubApp.getString2(34461), StubApp.getString2(34462));
            KyberKeyFactorySpi kyberKeyFactorySpi = new KyberKeyFactorySpi();
            StringBuilder r8 = a.r(configurableProvider, StubApp.getString2(34463), StubApp.getString2(34464), StubApp.getString2(30221));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_kyber;
            String string2 = StubApp.getString2(34465);
            a.z(r8, aSN1ObjectIdentifier, configurableProvider, string2);
            registerOid(configurableProvider, aSN1ObjectIdentifier, string2, kyberKeyFactorySpi);
        }
    }
}
