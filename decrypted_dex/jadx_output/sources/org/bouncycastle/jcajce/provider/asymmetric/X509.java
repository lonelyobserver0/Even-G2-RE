package org.bouncycastle.jcajce.provider.asymmetric;

import com.stub.StubApp;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X509 {

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(30476), StubApp.getString2(30477));
            String string2 = StubApp.getString2(30478);
            String string22 = StubApp.getString2(19963);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30479), StubApp.getString2(30480));
            configurableProvider.addAlgorithm(StubApp.getString2(30481), string22);
        }
    }
}
