package org.bouncycastle.jcajce.provider.asymmetric;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.edec.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EdEC {
    private static final String PREFIX = StubApp.getString2(30188);
    private static final Map<String, String> edxAttributes;

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(30099), StubApp.getString2(30100));
            configurableProvider.addAlgorithm(StubApp.getString2(30101), StubApp.getString2(30102));
            configurableProvider.addAlgorithm(StubApp.getString2(30103), StubApp.getString2(30104));
            configurableProvider.addAlgorithm(StubApp.getString2(30105), StubApp.getString2(30106));
            configurableProvider.addAlgorithm(StubApp.getString2(30107), StubApp.getString2(30108));
            configurableProvider.addAlgorithm(StubApp.getString2(30109), StubApp.getString2(30110));
            configurableProvider.addAlgorithm(StubApp.getString2(30111), StubApp.getString2(30112));
            configurableProvider.addAlgorithm(StubApp.getString2(30113), StubApp.getString2(30114));
            configurableProvider.addAlgorithm(StubApp.getString2(30115), StubApp.getString2(30116));
            ASN1ObjectIdentifier aSN1ObjectIdentifier = EdECObjectIdentifiers.id_Ed448;
            String string2 = StubApp.getString2(30117);
            String string22 = StubApp.getString2(30118);
            configurableProvider.addAlgorithm(string22, aSN1ObjectIdentifier, string2);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = EdECObjectIdentifiers.id_Ed25519;
            configurableProvider.addAlgorithm(string22, aSN1ObjectIdentifier2, StubApp.getString2(30119));
            configurableProvider.addAlgorithm(StubApp.getString2(30120), StubApp.getString2(30121));
            String string23 = StubApp.getString2(30122);
            String string24 = StubApp.getString2(30123);
            configurableProvider.addAlgorithm(string23, string24);
            String string25 = StubApp.getString2(30124);
            String string26 = StubApp.getString2(30125);
            configurableProvider.addAlgorithm(string25, string26);
            String string27 = StubApp.getString2(30126);
            configurableProvider.addAlgorithm(string27, aSN1ObjectIdentifier, string24);
            configurableProvider.addAlgorithm(string27, aSN1ObjectIdentifier2, string26);
            configurableProvider.addAlgorithm(StubApp.getString2(30127), StubApp.getString2(30128));
            String string28 = StubApp.getString2(30129);
            String string29 = StubApp.getString2(30130);
            configurableProvider.addAlgorithm(string28, string29);
            String string210 = StubApp.getString2(30131);
            String string211 = StubApp.getString2(30132);
            configurableProvider.addAlgorithm(string210, string211);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = EdECObjectIdentifiers.id_X448;
            String string212 = StubApp.getString2(29664);
            configurableProvider.addAlgorithm(string212, aSN1ObjectIdentifier3, string29);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = EdECObjectIdentifiers.id_X25519;
            configurableProvider.addAlgorithm(string212, aSN1ObjectIdentifier4, string211);
            configurableProvider.addAlgorithm(StubApp.getString2(30133), StubApp.getString2(30134));
            configurableProvider.addAlgorithm(StubApp.getString2(30135), StubApp.getString2(30136));
            configurableProvider.addAlgorithm(StubApp.getString2(30137), StubApp.getString2(30138));
            configurableProvider.addAlgorithm(StubApp.getString2(30139), StubApp.getString2(30140));
            configurableProvider.addAlgorithm(StubApp.getString2(30141), StubApp.getString2(30142));
            configurableProvider.addAlgorithm(StubApp.getString2(30143), StubApp.getString2(30144));
            configurableProvider.addAlgorithm(StubApp.getString2(30145), StubApp.getString2(30146));
            configurableProvider.addAlgorithm(StubApp.getString2(30147), StubApp.getString2(30148));
            configurableProvider.addAlgorithm(StubApp.getString2(30149), StubApp.getString2(30150));
            configurableProvider.addAlgorithm(StubApp.getString2(30151), StubApp.getString2(30152));
            configurableProvider.addAlgorithm(StubApp.getString2(30153), StubApp.getString2(30154));
            String string213 = StubApp.getString2(30155);
            String string214 = StubApp.getString2(30156);
            configurableProvider.addAlgorithm(string213, string214);
            String string215 = StubApp.getString2(30157);
            String string216 = StubApp.getString2(30158);
            configurableProvider.addAlgorithm(string215, string216);
            configurableProvider.addAlgorithm(string27, aSN1ObjectIdentifier3, string214);
            configurableProvider.addAlgorithm(string27, aSN1ObjectIdentifier4, string216);
            String string217 = StubApp.getString2(30159);
            String string218 = StubApp.getString2(30160);
            configurableProvider.addAlgorithm(string217, string218);
            configurableProvider.addAlgorithm(StubApp.getString2(30161), string218);
            configurableProvider.addAlgorithm(StubApp.getString2(30162), string218);
            String string219 = StubApp.getString2(30163);
            String string220 = StubApp.getString2(30164);
            configurableProvider.addAlgorithm(string219, string220);
            configurableProvider.addAlgorithm(StubApp.getString2(30165), string220);
            String string221 = StubApp.getString2(30166);
            String string222 = StubApp.getString2(30167);
            configurableProvider.addAlgorithm(string221, string222);
            configurableProvider.addAlgorithm(StubApp.getString2(30168), string222);
            String string223 = StubApp.getString2(30169);
            String string224 = StubApp.getString2(30170);
            configurableProvider.addAlgorithm(string223, string224);
            configurableProvider.addAlgorithm(StubApp.getString2(30171), string224);
            String string225 = StubApp.getString2(30172);
            String string226 = StubApp.getString2(30173);
            configurableProvider.addAlgorithm(string225, string226);
            configurableProvider.addAlgorithm(StubApp.getString2(30174), string226);
            configurableProvider.addAlgorithm(StubApp.getString2(30175), string226);
            configurableProvider.addAlgorithm(StubApp.getString2(30176), string226);
            String string227 = StubApp.getString2(30177);
            String string228 = StubApp.getString2(30178);
            configurableProvider.addAlgorithm(string227, string228);
            configurableProvider.addAlgorithm(StubApp.getString2(30179), string228);
            String string229 = StubApp.getString2(30180);
            String string230 = StubApp.getString2(30181);
            configurableProvider.addAlgorithm(string229, string230);
            configurableProvider.addAlgorithm(StubApp.getString2(30182), string230);
            String string231 = StubApp.getString2(30183);
            String string232 = StubApp.getString2(30184);
            configurableProvider.addAlgorithm(string231, string232);
            configurableProvider.addAlgorithm(StubApp.getString2(30185), string232);
            KeyFactorySpi.X448 x448 = new KeyFactorySpi.X448();
            String string233 = StubApp.getString2(30186);
            registerOid(configurableProvider, aSN1ObjectIdentifier3, string233, x448);
            registerOid(configurableProvider, aSN1ObjectIdentifier4, string233, new KeyFactorySpi.X25519());
            KeyFactorySpi.Ed448 ed448 = new KeyFactorySpi.Ed448();
            String string234 = StubApp.getString2(30187);
            registerOid(configurableProvider, aSN1ObjectIdentifier, string234, ed448);
            registerOid(configurableProvider, aSN1ObjectIdentifier2, string234, new KeyFactorySpi.Ed25519());
        }
    }

    static {
        HashMap hashMap = new HashMap();
        edxAttributes = hashMap;
        hashMap.put(StubApp.getString2(29653), StubApp.getString2(30048));
        hashMap.put(StubApp.getString2(29655), StubApp.getString2(29656));
    }
}
