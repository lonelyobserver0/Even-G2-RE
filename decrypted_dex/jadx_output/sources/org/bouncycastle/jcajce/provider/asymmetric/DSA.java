package org.bouncycastle.jcajce.provider.asymmetric;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSAUtil;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DSA {
    private static final String PREFIX = StubApp.getString2(29796);

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            configurableProvider.addAlgorithm(StubApp.getString2(29738), StubApp.getString2(29739));
            configurableProvider.addAlgorithm(StubApp.getString2(29740), StubApp.getString2(29741));
            configurableProvider.addAlgorithm(StubApp.getString2(29742), StubApp.getString2(29743));
            configurableProvider.addAlgorithm(StubApp.getString2(29744), StubApp.getString2(29745));
            configurableProvider.addAlgorithm(StubApp.getString2(29746), StubApp.getString2(29747));
            configurableProvider.addAlgorithm(StubApp.getString2(29748), StubApp.getString2(29749));
            configurableProvider.addAlgorithm(StubApp.getString2(29750), StubApp.getString2(29751));
            String string2 = StubApp.getString2(29752);
            String string22 = StubApp.getString2(29753);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(29754), string22);
            String string23 = StubApp.getString2(29755);
            String string24 = StubApp.getString2(29756);
            configurableProvider.addAlgorithm(string23, string24);
            String string25 = StubApp.getString2(29757);
            String string26 = StubApp.getString2(29758);
            configurableProvider.addAlgorithm(string25, string26);
            String string27 = StubApp.getString2(29759);
            String string28 = StubApp.getString2(29760);
            configurableProvider.addAlgorithm(string27, string28);
            String string29 = StubApp.getString2(29761);
            String string210 = StubApp.getString2(29762);
            configurableProvider.addAlgorithm(string29, string210);
            configurableProvider.addAlgorithm(StubApp.getString2(29763), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(29764), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(29765), string24);
            configurableProvider.addAlgorithm(StubApp.getString2(29766), string26);
            configurableProvider.addAlgorithm(StubApp.getString2(29767), string28);
            configurableProvider.addAlgorithm(StubApp.getString2(29768), string210);
            configurableProvider.addAlgorithm(StubApp.getString2(29769), StubApp.getString2(29770));
            configurableProvider.addAlgorithm(StubApp.getString2(29771), StubApp.getString2(29772));
            configurableProvider.addAlgorithm(StubApp.getString2(29773), StubApp.getString2(29774));
            configurableProvider.addAlgorithm(StubApp.getString2(29775), StubApp.getString2(29776));
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28054), StubApp.getString2(28060), StubApp.getString2(29777), NISTObjectIdentifiers.dsa_with_sha224);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(21749), StubApp.getString2(28060), StubApp.getString2(29778), NISTObjectIdentifiers.dsa_with_sha256);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(21750), StubApp.getString2(28060), StubApp.getString2(29779), NISTObjectIdentifiers.dsa_with_sha384);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(21751), StubApp.getString2(28060), StubApp.getString2(29780), NISTObjectIdentifiers.dsa_with_sha512);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28174), StubApp.getString2(28060), StubApp.getString2(29781), NISTObjectIdentifiers.id_dsa_with_sha3_224);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28175), StubApp.getString2(28060), StubApp.getString2(29782), NISTObjectIdentifiers.id_dsa_with_sha3_256);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28176), StubApp.getString2(28060), StubApp.getString2(29783), NISTObjectIdentifiers.id_dsa_with_sha3_384);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(28177), StubApp.getString2(28060), StubApp.getString2(29784), NISTObjectIdentifiers.id_dsa_with_sha3_512);
            String string211 = StubApp.getString2(29785);
            String string212 = StubApp.getString2(28060);
            configurableProvider.addAlgorithm(string211, string212);
            configurableProvider.addAlgorithm(StubApp.getString2(29786), string212);
            configurableProvider.addAlgorithm(StubApp.getString2(29787), string212);
            configurableProvider.addAlgorithm(StubApp.getString2(29788), string212);
            configurableProvider.addAlgorithm(StubApp.getString2(29789), string212);
            configurableProvider.addAlgorithm(StubApp.getString2(29790), string212);
            configurableProvider.addAlgorithm(StubApp.getString2(29791), string212);
            configurableProvider.addAlgorithm(StubApp.getString2(29792), string212);
            configurableProvider.addAlgorithm(StubApp.getString2(29793), string212);
            addSignatureAlgorithm(configurableProvider, StubApp.getString2(21747), string212, StubApp.getString2(29794));
            KeyFactorySpi keyFactorySpi = new KeyFactorySpi();
            int i3 = 0;
            while (true) {
                ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = DSAUtil.dsaOids;
                if (i3 == aSN1ObjectIdentifierArr.length) {
                    return;
                }
                a.z(new StringBuilder(StubApp.getString2(29795)), aSN1ObjectIdentifierArr[i3], configurableProvider, string212);
                registerOid(configurableProvider, aSN1ObjectIdentifierArr[i3], string212, keyFactorySpi);
                registerOidAlgorithmParameterGenerator(configurableProvider, aSN1ObjectIdentifierArr[i3], string212);
                i3++;
            }
        }
    }
}
