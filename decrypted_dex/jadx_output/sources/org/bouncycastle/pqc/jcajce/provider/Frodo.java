package org.bouncycastle.pqc.jcajce.provider;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.frodo.FrodoKeyFactorySpi;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Frodo {
    private static final String PREFIX = StubApp.getString2(34447);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(34438), StubApp.getString2(34439));
            configurableProvider.addAlgorithm(StubApp.getString2(34440), StubApp.getString2(34441));
            configurableProvider.addAlgorithm(StubApp.getString2(34442), StubApp.getString2(34443));
            FrodoKeyFactorySpi frodoKeyFactorySpi = new FrodoKeyFactorySpi();
            StringBuilder r8 = a.r(configurableProvider, StubApp.getString2(34444), StubApp.getString2(34445), StubApp.getString2(30221));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_frodo;
            a.z(r8, aSN1ObjectIdentifier, configurableProvider, StubApp.getString2(34446));
            registerOid(configurableProvider, aSN1ObjectIdentifier, StubApp.getString2(34402), frodoKeyFactorySpi);
        }
    }
}
