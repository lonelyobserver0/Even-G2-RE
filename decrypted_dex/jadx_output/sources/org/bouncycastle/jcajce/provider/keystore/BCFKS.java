package org.bouncycastle.jcajce.provider.keystore;

import com.stub.StubApp;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCFKS {
    private static final String PREFIX = StubApp.getString2(31316);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(31300), StubApp.getString2(31301));
            configurableProvider.addAlgorithm(StubApp.getString2(31302), StubApp.getString2(31303));
            configurableProvider.addAlgorithm(StubApp.getString2(31304), StubApp.getString2(31305));
            configurableProvider.addAlgorithm(StubApp.getString2(31306), StubApp.getString2(31307));
            configurableProvider.addAlgorithm(StubApp.getString2(31308), StubApp.getString2(31309));
            configurableProvider.addAlgorithm(StubApp.getString2(31310), StubApp.getString2(31311));
            configurableProvider.addAlgorithm(StubApp.getString2(31312), StubApp.getString2(31313));
            configurableProvider.addAlgorithm(StubApp.getString2(31314), StubApp.getString2(31315));
        }
    }
}
