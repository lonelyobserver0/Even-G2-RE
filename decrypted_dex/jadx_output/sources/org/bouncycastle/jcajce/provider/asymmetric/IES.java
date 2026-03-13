package org.bouncycastle.jcajce.provider.asymmetric;

import com.stub.StubApp;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IES {
    private static final String PREFIX = StubApp.getString2(30277);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String string2 = StubApp.getString2(30274);
            String string22 = StubApp.getString2(30275);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30276), string22);
        }
    }
}
