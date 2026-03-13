package org.bouncycastle.jcajce.provider.asymmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.elgamal.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ElGamal {
    private static final String PREFIX = StubApp.getString2(30211);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String string2 = StubApp.getString2(30189);
            String string22 = StubApp.getString2(30190);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30191), string22);
            String string23 = StubApp.getString2(30192);
            String string24 = StubApp.getString2(30193);
            configurableProvider.addAlgorithm(string23, string24);
            configurableProvider.addAlgorithm(StubApp.getString2(30194), string24);
            String string25 = StubApp.getString2(30195);
            String string26 = StubApp.getString2(30196);
            configurableProvider.addAlgorithm(string25, string26);
            configurableProvider.addAlgorithm(StubApp.getString2(30197), string26);
            String string27 = StubApp.getString2(30198);
            String string28 = StubApp.getString2(30199);
            configurableProvider.addAlgorithm(string27, string28);
            configurableProvider.addAlgorithm(StubApp.getString2(30200), string28);
            String string29 = StubApp.getString2(30201);
            String string210 = StubApp.getString2(30202);
            configurableProvider.addAlgorithm(string29, string210);
            configurableProvider.addAlgorithm(StubApp.getString2(30203), StubApp.getString2(30204));
            String string211 = StubApp.getString2(30205);
            String string212 = StubApp.getString2(30206);
            configurableProvider.addAlgorithm(string211, string212);
            configurableProvider.addAlgorithm(StubApp.getString2(30207), string212);
            String string213 = StubApp.getString2(30208);
            String string214 = StubApp.getString2(30209);
            configurableProvider.addAlgorithm(string213, string214);
            configurableProvider.addAlgorithm(StubApp.getString2(30210), string214);
            KeyFactorySpi keyFactorySpi = new KeyFactorySpi();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.elGamalAlgorithm;
            registerOid(configurableProvider, aSN1ObjectIdentifier, string210, keyFactorySpi);
            registerOidAlgorithmParameterGenerator(configurableProvider, aSN1ObjectIdentifier, string210);
        }
    }
}
