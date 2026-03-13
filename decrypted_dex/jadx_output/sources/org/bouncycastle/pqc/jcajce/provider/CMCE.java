package org.bouncycastle.pqc.jcajce.provider;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.jcajce.provider.cmce.CMCEKeyFactorySpi;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMCE {
    private static final String PREFIX = StubApp.getString2(34421);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(34413), StubApp.getString2(34414));
            configurableProvider.addAlgorithm(StubApp.getString2(34415), StubApp.getString2(34416));
            configurableProvider.addAlgorithm(StubApp.getString2(34417), StubApp.getString2(34418));
            CMCEKeyFactorySpi cMCEKeyFactorySpi = new CMCEKeyFactorySpi();
            StringBuilder r8 = a.r(configurableProvider, StubApp.getString2(34419), StubApp.getString2(34420), StubApp.getString2(30221));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = BCObjectIdentifiers.pqc_kem_mceliece;
            String string2 = StubApp.getString2(34401);
            a.z(r8, aSN1ObjectIdentifier, configurableProvider, string2);
            registerOid(configurableProvider, aSN1ObjectIdentifier, string2, cMCEKeyFactorySpi);
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier, string2);
        }
    }
}
