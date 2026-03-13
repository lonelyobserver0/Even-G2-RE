package org.bouncycastle.pqc.jcajce.provider;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.bike.BIKEKeyFactorySpi;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BIKE {
    private static final String PREFIX = StubApp.getString2(34397);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(34388), StubApp.getString2(34389));
            configurableProvider.addAlgorithm(StubApp.getString2(34390), StubApp.getString2(34391));
            configurableProvider.addAlgorithm(StubApp.getString2(34392), StubApp.getString2(34393));
            BIKEKeyFactorySpi bIKEKeyFactorySpi = new BIKEKeyFactorySpi();
            StringBuilder r8 = a.r(configurableProvider, StubApp.getString2(34394), StubApp.getString2(34395), StubApp.getString2(30221));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_bike;
            String string2 = StubApp.getString2(34396);
            a.z(r8, aSN1ObjectIdentifier, configurableProvider, string2);
            registerOid(configurableProvider, aSN1ObjectIdentifier, string2, bIKEKeyFactorySpi);
        }
    }
}
