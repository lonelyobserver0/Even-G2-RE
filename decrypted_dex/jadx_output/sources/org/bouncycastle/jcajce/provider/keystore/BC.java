package org.bouncycastle.jcajce.provider.keystore;

import com.stub.StubApp;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.util.Properties;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BC {
    private static final String PREFIX = StubApp.getString2(31299);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(31288), StubApp.getString2(31289));
            if (Properties.isOverrideSet(StubApp.getString2(31290))) {
                configurableProvider.addAlgorithm(StubApp.getString2(31291), StubApp.getString2(31292));
            }
            configurableProvider.addAlgorithm(StubApp.getString2(31293), StubApp.getString2(31294));
            String string2 = StubApp.getString2(31295);
            String string22 = StubApp.getString2(31296);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31297), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(31298), string22);
        }
    }
}
