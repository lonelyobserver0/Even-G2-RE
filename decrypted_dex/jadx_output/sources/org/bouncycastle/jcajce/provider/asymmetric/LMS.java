package org.bouncycastle.jcajce.provider.asymmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class LMS {
    private static final String PREFIX = StubApp.getString2(30286);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder r8 = a.r(configurableProvider, StubApp.getString2(30278), StubApp.getString2(30279), StubApp.getString2(30280));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_alg_hss_lms_hashsig;
            String string2 = StubApp.getString2(28198);
            a.z(r8, aSN1ObjectIdentifier, configurableProvider, string2);
            configurableProvider.addAlgorithm(StubApp.getString2(30281), StubApp.getString2(30282));
            configurableProvider.addAlgorithm(StubApp.getString2(30283) + aSN1ObjectIdentifier, string2);
            configurableProvider.addAlgorithm(StubApp.getString2(30284), StubApp.getString2(30285));
            configurableProvider.addAlgorithm(StubApp.getString2(29795) + aSN1ObjectIdentifier, string2);
        }
    }
}
