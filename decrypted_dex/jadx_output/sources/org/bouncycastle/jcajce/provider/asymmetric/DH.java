package org.bouncycastle.jcajce.provider.asymmetric;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.dh.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DH {
    private static final String PREFIX = StubApp.getString2(29737);
    private static final Map<String, String> generalDhAttributes;

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(29658), StubApp.getString2(29659));
            String string2 = StubApp.getString2(29660);
            String string22 = StubApp.getString2(28348);
            configurableProvider.addAlgorithm(string2, string22);
            Map<String, String> map = DH.generalDhAttributes;
            String string23 = StubApp.getString2(29661);
            configurableProvider.addAttributes(string23, map);
            configurableProvider.addAlgorithm(string23, StubApp.getString2(29662));
            configurableProvider.addAlgorithm(StubApp.getString2(29663), string22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_alg_ESDH;
            String string24 = StubApp.getString2(29664);
            String string25 = StubApp.getString2(29665);
            configurableProvider.addAlgorithm(string24, aSN1ObjectIdentifier, string25);
            configurableProvider.addAlgorithm(string24, PKCSObjectIdentifiers.id_alg_SSDH, string25);
            configurableProvider.addAlgorithm(StubApp.getString2(29666), StubApp.getString2(29667));
            configurableProvider.addAlgorithm(StubApp.getString2(29668), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(29669), StubApp.getString2(29670));
            configurableProvider.addAlgorithm(StubApp.getString2(29671), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(29672), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(29673), StubApp.getString2(29674));
            String string26 = StubApp.getString2(29675);
            String string27 = StubApp.getString2(29676);
            configurableProvider.addAlgorithm(string26, string27);
            String string28 = StubApp.getString2(29677);
            String string29 = StubApp.getString2(29678);
            configurableProvider.addAlgorithm(string28, string29);
            configurableProvider.addAlgorithm(StubApp.getString2(29679), string29);
            String string210 = StubApp.getString2(29680);
            String string211 = StubApp.getString2(29681);
            configurableProvider.addAlgorithm(string210, string211);
            configurableProvider.addAlgorithm(StubApp.getString2(29682), string27);
            configurableProvider.addAlgorithm(StubApp.getString2(29683), string29);
            configurableProvider.addAlgorithm(StubApp.getString2(29684), string29);
            configurableProvider.addAlgorithm(StubApp.getString2(29685), string211);
            configurableProvider.addAlgorithm(StubApp.getString2(29686), StubApp.getString2(29687));
            configurableProvider.addAlgorithm(StubApp.getString2(29688), StubApp.getString2(29689));
            configurableProvider.addAlgorithm(StubApp.getString2(29690), StubApp.getString2(29691));
            configurableProvider.addAlgorithm(StubApp.getString2(29692), StubApp.getString2(29693));
            configurableProvider.addAlgorithm(StubApp.getString2(29694), StubApp.getString2(29695));
            configurableProvider.addAlgorithm(StubApp.getString2(29696), StubApp.getString2(29697));
            configurableProvider.addAlgorithm(StubApp.getString2(29698), StubApp.getString2(29699));
            configurableProvider.addAlgorithm(StubApp.getString2(29700), StubApp.getString2(29701));
            configurableProvider.addAlgorithm(StubApp.getString2(29702), StubApp.getString2(29703));
            configurableProvider.addAlgorithm(StubApp.getString2(29704), StubApp.getString2(29705));
            configurableProvider.addAlgorithm(StubApp.getString2(29706), StubApp.getString2(29707));
            configurableProvider.addAlgorithm(StubApp.getString2(29708), StubApp.getString2(29709));
            configurableProvider.addAlgorithm(StubApp.getString2(29710), StubApp.getString2(29711));
            configurableProvider.addAlgorithm(StubApp.getString2(29712), StubApp.getString2(29713));
            configurableProvider.addAlgorithm(StubApp.getString2(29714), StubApp.getString2(29715));
            configurableProvider.addAlgorithm(StubApp.getString2(29716), StubApp.getString2(29717));
            configurableProvider.addAlgorithm(StubApp.getString2(29718), StubApp.getString2(29719));
            configurableProvider.addAlgorithm(StubApp.getString2(29720), StubApp.getString2(29721));
            configurableProvider.addAlgorithm(StubApp.getString2(29722), StubApp.getString2(29723));
            configurableProvider.addAlgorithm(StubApp.getString2(29724), StubApp.getString2(29725));
            configurableProvider.addAlgorithm(StubApp.getString2(29726), StubApp.getString2(29727));
            configurableProvider.addAlgorithm(StubApp.getString2(29728), StubApp.getString2(29729));
            configurableProvider.addAlgorithm(StubApp.getString2(29730), StubApp.getString2(29731));
            configurableProvider.addAlgorithm(StubApp.getString2(29732), StubApp.getString2(29733));
            configurableProvider.addAlgorithm(StubApp.getString2(29734), StubApp.getString2(29735));
            registerOid(configurableProvider, PKCSObjectIdentifiers.dhKeyAgreement, string22, new KeyFactorySpi());
            registerOid(configurableProvider, X9ObjectIdentifiers.dhpublicnumber, string22, new KeyFactorySpi());
        }
    }

    static {
        HashMap hashMap = new HashMap();
        generalDhAttributes = hashMap;
        hashMap.put(StubApp.getString2(29653), StubApp.getString2(29736));
        hashMap.put(StubApp.getString2(29655), StubApp.getString2(29656));
    }
}
