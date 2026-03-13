package org.bouncycastle.jcajce.provider.asymmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.ecgost.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ECGOST {
    private static final String PREFIX = StubApp.getString2(30092);
    private static final String PREFIX_COMMON = StubApp.getString2(30049);
    private static final String PREFIX_GOST_2012 = StubApp.getString2(30093);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(30050), StubApp.getString2(30051));
            String string2 = StubApp.getString2(30052);
            String string22 = StubApp.getString2(28166);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30053), string22);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.gostR3410_2001;
            registerOid(configurableProvider, aSN1ObjectIdentifier, string22, new KeyFactorySpi());
            registerOid(configurableProvider, CryptoProObjectIdentifiers.gostR3410_2001DH, string22, new KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30054), StubApp.getString2(30055));
            configurableProvider.addAlgorithm(StubApp.getString2(30056), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30057), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30058), StubApp.getString2(30059));
            configurableProvider.addAlgorithm(StubApp.getString2(30060), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30061), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30062), StubApp.getString2(30063));
            String string23 = StubApp.getString2(30064);
            configurableProvider.addAlgorithm(string23 + aSN1ObjectIdentifier, string22);
            a.z(a.r(configurableProvider, StubApp.getString2(30065), string22, string23), CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_ESDH, configurableProvider, string22);
            String string24 = StubApp.getString2(30066);
            String string25 = StubApp.getString2(29813);
            configurableProvider.addAlgorithm(string24, string25);
            configurableProvider.addAlgorithm(StubApp.getString2(30067), string25);
            configurableProvider.addAlgorithm(StubApp.getString2(30068), string22);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28192), StubApp.getString2(28166), StubApp.getString2(30059), CryptoProObjectIdentifiers.gostR3411_94_with_gostR3410_2001);
            configurableProvider.addAlgorithm(StubApp.getString2(30069), StubApp.getString2(30070));
            String string26 = StubApp.getString2(30071);
            String string27 = StubApp.getString2(30072);
            configurableProvider.addAlgorithm(string26, string27);
            configurableProvider.addAlgorithm(StubApp.getString2(30073), string27);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256;
            registerOid(configurableProvider, aSN1ObjectIdentifier2, string27, new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_256;
            registerOid(configurableProvider, aSN1ObjectIdentifier3, string27, new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier2, string27);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512;
            registerOid(configurableProvider, aSN1ObjectIdentifier4, string27, new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_512;
            registerOid(configurableProvider, aSN1ObjectIdentifier5, string27, new org.bouncycastle.jcajce.provider.asymmetric.ecgost12.KeyFactorySpi());
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier4, string27);
            configurableProvider.addAlgorithm(StubApp.getString2(30074), StubApp.getString2(30075));
            configurableProvider.addAlgorithm(StubApp.getString2(30076), string27);
            configurableProvider.addAlgorithm(StubApp.getString2(30077), string27);
            configurableProvider.addAlgorithm(StubApp.getString2(30078), StubApp.getString2(30079));
            String string28 = StubApp.getString2(30080);
            String string29 = StubApp.getString2(28169);
            configurableProvider.addAlgorithm(string28, string29);
            configurableProvider.addAlgorithm(StubApp.getString2(30081), string29);
            configurableProvider.addAlgorithm(StubApp.getString2(30082), string29);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28194), StubApp.getString2(28169), StubApp.getString2(30079), RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_256);
            configurableProvider.addAlgorithm(StubApp.getString2(30083), StubApp.getString2(30084));
            String string210 = StubApp.getString2(30085);
            String string211 = StubApp.getString2(28170);
            configurableProvider.addAlgorithm(string210, string211);
            configurableProvider.addAlgorithm(StubApp.getString2(30086), string211);
            configurableProvider.addAlgorithm(StubApp.getString2(30087), string211);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28195), StubApp.getString2(28170), StubApp.getString2(30084), RosstandartObjectIdentifiers.id_tc26_signwithdigest_gost_3410_12_512);
            configurableProvider.addAlgorithm(StubApp.getString2(30088), StubApp.getString2(30089));
            configurableProvider.addAlgorithm(StubApp.getString2(30090), StubApp.getString2(30091));
            configurableProvider.addAlgorithm(string23 + aSN1ObjectIdentifier3, string29);
            a.z(a.q(a.q(new StringBuilder(string23), aSN1ObjectIdentifier5, configurableProvider, string211, string23), aSN1ObjectIdentifier2, configurableProvider, string29, string23), aSN1ObjectIdentifier4, configurableProvider, string211);
        }
    }
}
