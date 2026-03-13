package org.bouncycastle.pqc.jcajce.provider;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.hqc.HQCKeyFactorySpi;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class HQC {
    private static final String PREFIX = StubApp.getString2(34456);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(34448), StubApp.getString2(34449));
            configurableProvider.addAlgorithm(StubApp.getString2(34450), StubApp.getString2(34451));
            configurableProvider.addAlgorithm(StubApp.getString2(34452), StubApp.getString2(34453));
            HQCKeyFactorySpi hQCKeyFactorySpi = new HQCKeyFactorySpi();
            StringBuilder r8 = a.r(configurableProvider, StubApp.getString2(34454), StubApp.getString2(34455), StubApp.getString2(30221));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_hqc;
            String string2 = StubApp.getString2(34398);
            a.z(r8, aSN1ObjectIdentifier, configurableProvider, string2);
            registerOid(configurableProvider, aSN1ObjectIdentifier, string2, hQCKeyFactorySpi);
        }
    }
}
