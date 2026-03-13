package org.bouncycastle.pqc.jcajce.provider;

import com.stub.StubApp;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.jcajce.provider.newhope.NHKeyFactorySpi;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NH {
    private static final String PREFIX = StubApp.getString2(34496);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(34490), StubApp.getString2(34491));
            configurableProvider.addAlgorithm(StubApp.getString2(34492), StubApp.getString2(34493));
            configurableProvider.addAlgorithm(StubApp.getString2(34494), StubApp.getString2(34495));
            registerOid(configurableProvider, PQCObjectIdentifiers.newHope, StubApp.getString2(34400), new NHKeyFactorySpi());
        }
    }
}
