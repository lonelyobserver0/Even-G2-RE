package org.bouncycastle.pqc.jcajce.provider;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.jcajce.provider.xmss.XMSSKeyFactorySpi;
import org.bouncycastle.pqc.jcajce.provider.xmss.XMSSMTKeyFactorySpi;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XMSS {
    private static final String PREFIX = StubApp.getString2(34619);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(34583), StubApp.getString2(34584));
            configurableProvider.addAlgorithm(StubApp.getString2(34585), StubApp.getString2(34586));
            configurableProvider.addAlgorithm(StubApp.getString2(34587), StubApp.getString2(34588));
            String string2 = StubApp.getString2(29795);
            StringBuilder sb2 = new StringBuilder(string2);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = IsaraObjectIdentifiers.id_alg_xmss;
            String string22 = StubApp.getString2(32734);
            String string23 = StubApp.getString2(30294);
            a.z(a.q(sb2, aSN1ObjectIdentifier, configurableProvider, string22, string23), aSN1ObjectIdentifier, configurableProvider, string22);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(33815), StubApp.getString2(34589), BCObjectIdentifiers.xmss_SHA256);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(33817), StubApp.getString2(34590), BCObjectIdentifiers.xmss_SHAKE128);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(33816), StubApp.getString2(34591), BCObjectIdentifiers.xmss_SHA512);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(33818), StubApp.getString2(34592), BCObjectIdentifiers.xmss_SHAKE256);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(21749), StubApp.getString2(33815), StubApp.getString2(34593), BCObjectIdentifiers.xmss_SHA256ph);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28183), StubApp.getString2(33817), StubApp.getString2(34594), BCObjectIdentifiers.xmss_SHAKE128ph);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(21751), StubApp.getString2(33816), StubApp.getString2(34595), BCObjectIdentifiers.xmss_SHA512ph);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28184), StubApp.getString2(33818), StubApp.getString2(34596), BCObjectIdentifiers.xmss_SHAKE256ph);
            configurableProvider.addAlgorithm(StubApp.getString2(34597), StubApp.getString2(33807));
            configurableProvider.addAlgorithm(StubApp.getString2(34598), StubApp.getString2(33809));
            configurableProvider.addAlgorithm(StubApp.getString2(34599), StubApp.getString2(33808));
            configurableProvider.addAlgorithm(StubApp.getString2(34600), StubApp.getString2(33810));
            configurableProvider.addAlgorithm(StubApp.getString2(34601), StubApp.getString2(34602));
            configurableProvider.addAlgorithm(StubApp.getString2(34603), StubApp.getString2(34604));
            configurableProvider.addAlgorithm(StubApp.getString2(34605), StubApp.getString2(34606));
            StringBuilder sb3 = new StringBuilder(string2);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = IsaraObjectIdentifiers.id_alg_xmssmt;
            String string24 = StubApp.getString2(32735);
            a.z(a.q(sb3, aSN1ObjectIdentifier2, configurableProvider, string24, string23), aSN1ObjectIdentifier2, configurableProvider, string24);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(33819), StubApp.getString2(34607), BCObjectIdentifiers.xmss_mt_SHA256);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(33821), StubApp.getString2(34608), BCObjectIdentifiers.xmss_mt_SHAKE128);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(33820), StubApp.getString2(34609), BCObjectIdentifiers.xmss_mt_SHA512);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(33822), StubApp.getString2(34610), BCObjectIdentifiers.xmss_mt_SHAKE256);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(21749), StubApp.getString2(33819), StubApp.getString2(34611), BCObjectIdentifiers.xmss_mt_SHA256ph);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28183), StubApp.getString2(33821), StubApp.getString2(34612), BCObjectIdentifiers.xmss_mt_SHAKE128ph);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(21751), StubApp.getString2(33820), StubApp.getString2(34613), BCObjectIdentifiers.xmss_mt_SHA512ph);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28184), StubApp.getString2(33822), StubApp.getString2(34614), BCObjectIdentifiers.xmss_mt_SHAKE256ph);
            configurableProvider.addAlgorithm(StubApp.getString2(34615), StubApp.getString2(33811));
            configurableProvider.addAlgorithm(StubApp.getString2(34616), StubApp.getString2(33813));
            configurableProvider.addAlgorithm(StubApp.getString2(34617), StubApp.getString2(33812));
            configurableProvider.addAlgorithm(StubApp.getString2(34618), StubApp.getString2(33814));
            registerOid(configurableProvider, PQCObjectIdentifiers.xmss, string22, new XMSSKeyFactorySpi());
            registerOid(configurableProvider, aSN1ObjectIdentifier, string22, new XMSSKeyFactorySpi());
            registerOid(configurableProvider, PQCObjectIdentifiers.xmss_mt, string24, new XMSSMTKeyFactorySpi());
            registerOid(configurableProvider, aSN1ObjectIdentifier2, string24, new XMSSMTKeyFactorySpi());
        }
    }
}
