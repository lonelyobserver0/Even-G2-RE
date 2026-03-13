package org.bouncycastle.pqc.jcajce.provider;

import com.stub.StubApp;
import org.bouncycastle.asn1.a;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class McEliece {
    private static final String PREFIX = StubApp.getString2(34489);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String string2 = StubApp.getString2(34467);
            String string22 = StubApp.getString2(34468);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(34469), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(34470), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(34471), StubApp.getString2(34472));
            configurableProvider.addAlgorithm(StubApp.getString2(34473), string22);
            String string23 = StubApp.getString2(34474);
            String string24 = StubApp.getString2(34475);
            configurableProvider.addAlgorithm(string23, string24);
            configurableProvider.addAlgorithm(StubApp.getString2(34476), string24);
            configurableProvider.addAlgorithm(StubApp.getString2(34477), string24);
            String string25 = StubApp.getString2(34478);
            String string26 = StubApp.getString2(34479);
            configurableProvider.addAlgorithm(string25, string26);
            configurableProvider.addAlgorithm(StubApp.getString2(34480), string24);
            String string27 = StubApp.getString2(29651);
            a.z(a.q(new StringBuilder(string27), PQCObjectIdentifiers.mcElieceCca2, configurableProvider, string24, string27), PQCObjectIdentifiers.mcEliece, configurableProvider, string26);
            configurableProvider.addAlgorithm(StubApp.getString2(34481), StubApp.getString2(34482));
            configurableProvider.addAlgorithm(StubApp.getString2(34483), StubApp.getString2(34484));
            configurableProvider.addAlgorithm(StubApp.getString2(34485), StubApp.getString2(34486));
            configurableProvider.addAlgorithm(StubApp.getString2(34487), StubApp.getString2(34488));
        }
    }
}
