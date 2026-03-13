package org.bouncycastle.pqc.jcajce.provider;

import com.stub.StubApp;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.jcajce.provider.rainbow.RainbowKeyFactorySpi;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Rainbow {
    private static final String PREFIX = StubApp.getString2(34556);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(34547), StubApp.getString2(34548));
            configurableProvider.addAlgorithm(StubApp.getString2(34549), StubApp.getString2(34550));
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28054), StubApp.getString2(34552), StubApp.getString2(34551), PQCObjectIdentifiers.rainbowWithSha224);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(21749), StubApp.getString2(34552), StubApp.getString2(34553), PQCObjectIdentifiers.rainbowWithSha256);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(21750), StubApp.getString2(34552), StubApp.getString2(34554), PQCObjectIdentifiers.rainbowWithSha384);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(21751), StubApp.getString2(34552), StubApp.getString2(34555), PQCObjectIdentifiers.rainbowWithSha512);
            registerOid(configurableProvider, PQCObjectIdentifiers.rainbow, StubApp.getString2(34552), new RainbowKeyFactorySpi());
        }
    }
}
