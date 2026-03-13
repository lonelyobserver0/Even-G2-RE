package org.bouncycastle.jcajce.provider.keystore;

import com.stub.StubApp;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKCS12 {
    private static final String PREFIX = StubApp.getString2(31328);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String string2 = StubApp.getString2(31317);
            String string22 = StubApp.getString2(31318);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31319), string22);
            String string23 = StubApp.getString2(31320);
            String string24 = StubApp.getString2(31321);
            configurableProvider.addAlgorithm(string23, string24);
            configurableProvider.addAlgorithm(StubApp.getString2(31322), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31323), StubApp.getString2(31324));
            configurableProvider.addAlgorithm(StubApp.getString2(31325), string24);
            configurableProvider.addAlgorithm(StubApp.getString2(31326), StubApp.getString2(31327));
        }
    }
}
