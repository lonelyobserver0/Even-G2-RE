package org.bouncycastle.jcajce.provider.asymmetric;

import com.stub.StubApp;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.internal.asn1.cms.CMSObjectIdentifiers;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.KeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import p0.AbstractC1482f;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RSA {
    private static final String PREFIX = StubApp.getString2(30465);
    private static final Map<String, String> generalRsaAttributes;

    static {
        HashMap hashMap = new HashMap();
        generalRsaAttributes = hashMap;
        hashMap.put(StubApp.getString2(29653), StubApp.getString2(30464));
        hashMap.put(StubApp.getString2(29655), StubApp.getString2(29656));
    }

    public static class Mappings extends AsymmetricAlgorithmProvider {
        private void addDigestSignature(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            String g10 = AbstractC1482f.g(str, StubApp.getString2(30287));
            String g11 = AbstractC1482f.g(str, StubApp.getString2(29329));
            String g12 = AbstractC1482f.g(str, StubApp.getString2(30288));
            String g13 = AbstractC1482f.g(str, StubApp.getString2(30289));
            String g14 = AbstractC1482f.g(str, StubApp.getString2(30290));
            String g15 = AbstractC1482f.g(str, StubApp.getString2(30291));
            String g16 = AbstractC1482f.g(str, StubApp.getString2(30292));
            String string2 = StubApp.getString2(30293);
            configurableProvider.addAlgorithm(string2 + g10, str2);
            String string22 = StubApp.getString2(29795);
            configurableProvider.addAlgorithm(string22 + g11, g10);
            configurableProvider.addAlgorithm(string22 + g12, g10);
            configurableProvider.addAlgorithm(string22 + g14, g10);
            configurableProvider.addAlgorithm(string22 + g15, g10);
            configurableProvider.addAlgorithm(string22 + g16, g10);
            configurableProvider.addAlgorithm(string22 + g13, g10);
            if (aSN1ObjectIdentifier != null) {
                configurableProvider.addAlgorithm(string22 + aSN1ObjectIdentifier, g10);
                a.z(new StringBuilder(StubApp.getString2(30294)), aSN1ObjectIdentifier, configurableProvider, g10);
            }
            configurableProvider.addAttributes(E1.a.j(string2, g10), RSA.generalRsaAttributes);
        }

        private void addISO9796Signature(ConfigurableProvider configurableProvider, String str, String str2) {
            String string2 = StubApp.getString2(29795);
            String k3 = E1.a.k(string2, str, StubApp.getString2(30295));
            String string22 = StubApp.getString2(30296);
            String k4 = AbstractC1482f.k(a.m(str, string22, k3, string2, configurableProvider), str, StubApp.getString2(30297));
            String string23 = StubApp.getString2(30293);
            StringBuilder m4 = a.m(str, string22, k4, string23, configurableProvider);
            m4.append(str);
            m4.append(string22);
            configurableProvider.addAlgorithm(m4.toString(), str2);
            configurableProvider.addAttributes(E1.a.k(string23, str, string22), RSA.generalRsaAttributes);
        }

        private void addPSSSignature(ConfigurableProvider configurableProvider, String str, String str2, String str3) {
            String string2 = StubApp.getString2(30298);
            String j = E1.a.j(string2, str2);
            boolean equals = str2.equals(StubApp.getString2(30299));
            String string22 = StubApp.getString2(29795);
            if (equals) {
                configurableProvider.addAlgorithm(AbstractC1482f.k(a.m(str, j, AbstractC1482f.k(a.m(str, j, AbstractC1482f.k(a.m(str, j, AbstractC1482f.k(a.m(str, j, AbstractC1482f.k(a.m(str, j, E1.a.k(string22, str, StubApp.getString2(30300)), string22, configurableProvider), str, StubApp.getString2(30301)), string22, configurableProvider), str, StubApp.getString2(30302)), string22, configurableProvider), str, StubApp.getString2(30303)), string22, configurableProvider), str, StubApp.getString2(30304)), string22, configurableProvider), str, StubApp.getString2(30305)), str + j);
            }
            String n10 = E1.a.n(a.m(str, j, AbstractC1482f.i(string22, str, StubApp.getString2(30306), str2), string22, configurableProvider), str, StubApp.getString2(30307), str2);
            String string23 = StubApp.getString2(30293);
            configurableProvider.addAlgorithm(E1.a.n(a.m(str, j, n10, string23, configurableProvider), str, string2, str2), str3);
            StringBuilder sb2 = new StringBuilder(string23);
            sb2.append(str);
            configurableProvider.addAttributes(AbstractC1482f.k(sb2, string2, str2), RSA.generalRsaAttributes);
        }

        private void addX931Signature(ConfigurableProvider configurableProvider, String str, String str2) {
            String string2 = StubApp.getString2(29795);
            String k3 = E1.a.k(string2, str, StubApp.getString2(30310));
            String string22 = StubApp.getString2(30311);
            String k4 = AbstractC1482f.k(a.m(str, string22, k3, string2, configurableProvider), str, StubApp.getString2(30312));
            String string23 = StubApp.getString2(30293);
            StringBuilder m4 = a.m(str, string22, k4, string23, configurableProvider);
            m4.append(str);
            m4.append(string22);
            configurableProvider.addAlgorithm(m4.toString(), str2);
            configurableProvider.addAttributes(E1.a.k(string23, str, string22), RSA.generalRsaAttributes);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str;
            String str2;
            configurableProvider.addAlgorithm(StubApp.getString2(30313), StubApp.getString2(30314));
            configurableProvider.addAlgorithm(StubApp.getString2(30315), StubApp.getString2(30316));
            String string2 = StubApp.getString2(30317);
            String string22 = StubApp.getString2(30318);
            configurableProvider.addAlgorithm(string2, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30319), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30320), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30321), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30322), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30323), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30324), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30325), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30326), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30327), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30328), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30329), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30330), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30331), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30332), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30333), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30334), string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30335), string22);
            configurableProvider.addAttributes(StubApp.getString2(30336), RSA.generalRsaAttributes);
            configurableProvider.addAlgorithm(StubApp.getString2(30336), StubApp.getString2(30337));
            configurableProvider.addAlgorithm(StubApp.getString2(30338), StubApp.getString2(30337));
            String string23 = StubApp.getString2(30339);
            String string24 = StubApp.getString2(30340);
            configurableProvider.addAlgorithm(string23, string24);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.rsaEncryption;
            Map<String, String> map = RSA.generalRsaAttributes;
            String string25 = StubApp.getString2(30341);
            configurableProvider.addAlgorithm(string25, aSN1ObjectIdentifier, string24, map);
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = X509ObjectIdentifiers.id_ea_rsa;
            configurableProvider.addAlgorithm(string25, aSN1ObjectIdentifier2, string24, RSA.generalRsaAttributes);
            configurableProvider.addAlgorithm(StubApp.getString2(30342), StubApp.getString2(30343));
            configurableProvider.addAlgorithm(StubApp.getString2(30344), StubApp.getString2(30345));
            configurableProvider.addAlgorithm(StubApp.getString2(30347), StubApp.getString2(30346), RSA.generalRsaAttributes);
            ASN1ObjectIdentifier aSN1ObjectIdentifier3 = PKCSObjectIdentifiers.id_RSAES_OAEP;
            configurableProvider.addAlgorithm(string25, aSN1ObjectIdentifier3, StubApp.getString2(30346), RSA.generalRsaAttributes);
            configurableProvider.addAlgorithm(StubApp.getString2(30349), StubApp.getString2(30348), RSA.generalRsaAttributes);
            String string26 = StubApp.getString2(30350);
            String string27 = StubApp.getString2(24659);
            configurableProvider.addAlgorithm(string26, string27);
            configurableProvider.addAlgorithm(StubApp.getString2(30351), string27);
            configurableProvider.addAlgorithm(StubApp.getString2(30352), StubApp.getString2(30353));
            configurableProvider.addAlgorithm(StubApp.getString2(30354), StubApp.getString2(30355));
            configurableProvider.addAlgorithm(StubApp.getString2(30356), StubApp.getString2(30357));
            configurableProvider.addAlgorithm(StubApp.getString2(30358), StubApp.getString2(30359));
            configurableProvider.addAlgorithm(StubApp.getString2(30360), StubApp.getString2(30361));
            configurableProvider.addAlgorithm(StubApp.getString2(30362), StubApp.getString2(30359));
            configurableProvider.addAlgorithm(StubApp.getString2(30363), StubApp.getString2(30364));
            KeyFactorySpi keyFactorySpi = new KeyFactorySpi();
            registerOid(configurableProvider, aSN1ObjectIdentifier, string27, keyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier2, string27, keyFactorySpi);
            registerOid(configurableProvider, aSN1ObjectIdentifier3, string27, keyFactorySpi);
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.id_RSASSA_PSS;
            registerOid(configurableProvider, aSN1ObjectIdentifier4, string27, keyFactorySpi);
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier, string27);
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier2, string27);
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier3, StubApp.getString2(30365));
            registerOidAlgorithmParameters(configurableProvider, aSN1ObjectIdentifier4, string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30367), StubApp.getString2(30366), RSA.generalRsaAttributes);
            String str3 = StubApp.getString2(29795) + aSN1ObjectIdentifier4;
            String string28 = StubApp.getString2(30368);
            configurableProvider.addAlgorithm(str3, string28);
            configurableProvider.addAlgorithm(StubApp.getString2(30294) + aSN1ObjectIdentifier4, string28);
            configurableProvider.addAlgorithm(StubApp.getString2(30370), StubApp.getString2(30369), RSA.generalRsaAttributes);
            configurableProvider.addAlgorithm(StubApp.getString2(30372), StubApp.getString2(30371), RSA.generalRsaAttributes);
            configurableProvider.addAlgorithm(StubApp.getString2(30373), string27);
            configurableProvider.addAlgorithm(StubApp.getString2(30374), string27);
            String string29 = StubApp.getString2(30375);
            String string210 = StubApp.getString2(30376);
            configurableProvider.addAlgorithm(string29, string210);
            configurableProvider.addAlgorithm(StubApp.getString2(30377), string210);
            configurableProvider.addAlgorithm(StubApp.getString2(30378), string210);
            configurableProvider.addAlgorithm(StubApp.getString2(30379), string210);
            configurableProvider.addAlgorithm(StubApp.getString2(30380), string28);
            String string211 = StubApp.getString2(30381);
            String string212 = StubApp.getString2(28054);
            String string213 = StubApp.getString2(30299);
            addPSSSignature(configurableProvider, string212, string213, string211);
            String string214 = StubApp.getString2(30382);
            String string215 = StubApp.getString2(21749);
            addPSSSignature(configurableProvider, string215, string213, string214);
            String string216 = StubApp.getString2(30383);
            String string217 = StubApp.getString2(21750);
            addPSSSignature(configurableProvider, string217, string213, string216);
            String string218 = StubApp.getString2(30384);
            String string219 = StubApp.getString2(21751);
            addPSSSignature(configurableProvider, string219, string213, string218);
            String string220 = StubApp.getString2(30385);
            String string221 = StubApp.getString2(28180);
            addPSSSignature(configurableProvider, string221, string213, string220);
            String string222 = StubApp.getString2(30386);
            String string223 = StubApp.getString2(28181);
            addPSSSignature(configurableProvider, string223, string213, string222);
            String string224 = StubApp.getString2(30387);
            String string225 = StubApp.getString2(28174);
            addPSSSignature(configurableProvider, string225, string213, string224);
            String string226 = StubApp.getString2(30388);
            String string227 = StubApp.getString2(28175);
            addPSSSignature(configurableProvider, string227, string213, string226);
            String string228 = StubApp.getString2(30389);
            String string229 = StubApp.getString2(28176);
            addPSSSignature(configurableProvider, string229, string213, string228);
            String string230 = StubApp.getString2(30390);
            String string231 = StubApp.getString2(28177);
            addPSSSignature(configurableProvider, string231, string213, string230);
            String string232 = StubApp.getString2(30391);
            ASN1ObjectIdentifier aSN1ObjectIdentifier5 = CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE128;
            String string233 = StubApp.getString2(28183);
            addPSSSignature(configurableProvider, string233, string232, aSN1ObjectIdentifier5);
            String string234 = StubApp.getString2(30392);
            ASN1ObjectIdentifier aSN1ObjectIdentifier6 = CMSObjectIdentifiers.id_RSASSA_PSS_SHAKE256;
            String string235 = StubApp.getString2(28184);
            addPSSSignature(configurableProvider, string235, string234, aSN1ObjectIdentifier6);
            addPSSSignature(configurableProvider, string212, string233, StubApp.getString2(30393));
            addPSSSignature(configurableProvider, string215, string233, StubApp.getString2(30394));
            addPSSSignature(configurableProvider, string217, string233, StubApp.getString2(30395));
            addPSSSignature(configurableProvider, string219, string233, StubApp.getString2(30396));
            addPSSSignature(configurableProvider, string221, string233, StubApp.getString2(30397));
            addPSSSignature(configurableProvider, string223, string233, StubApp.getString2(30398));
            addPSSSignature(configurableProvider, string212, string235, StubApp.getString2(30399));
            addPSSSignature(configurableProvider, string215, string235, StubApp.getString2(30400));
            addPSSSignature(configurableProvider, string217, string235, StubApp.getString2(30401));
            addPSSSignature(configurableProvider, string219, string235, StubApp.getString2(30402));
            addPSSSignature(configurableProvider, string221, string235, StubApp.getString2(30403));
            addPSSSignature(configurableProvider, string223, string235, StubApp.getString2(30404));
            addPSSSignature(configurableProvider, string225, string233, StubApp.getString2(30405));
            addPSSSignature(configurableProvider, string227, string233, StubApp.getString2(30406));
            addPSSSignature(configurableProvider, string229, string233, StubApp.getString2(30407));
            addPSSSignature(configurableProvider, string231, string233, StubApp.getString2(30408));
            addPSSSignature(configurableProvider, string225, string235, StubApp.getString2(30409));
            addPSSSignature(configurableProvider, string227, string235, StubApp.getString2(30410));
            addPSSSignature(configurableProvider, string229, string235, StubApp.getString2(30411));
            addPSSSignature(configurableProvider, string231, string235, StubApp.getString2(30412));
            String string236 = StubApp.getString2(28179);
            String string237 = StubApp.getString2(30413);
            if (configurableProvider.hasAlgorithm(string237, string236)) {
                str2 = string231;
                str = string229;
                addDigestSignature(configurableProvider, StubApp.getString2(28179), StubApp.getString2(30414), PKCSObjectIdentifiers.md2WithRSAEncryption);
            } else {
                str = string229;
                str2 = string231;
            }
            if (configurableProvider.hasAlgorithm(string237, StubApp.getString2(28178))) {
                addDigestSignature(configurableProvider, StubApp.getString2(28178), StubApp.getString2(30415), PKCSObjectIdentifiers.md4WithRSAEncryption);
            }
            String string238 = StubApp.getString2(4894);
            if (configurableProvider.hasAlgorithm(string237, string238)) {
                addDigestSignature(configurableProvider, string238, StubApp.getString2(30416), PKCSObjectIdentifiers.md5WithRSAEncryption);
                addISO9796Signature(configurableProvider, string238, StubApp.getString2(30417));
            }
            String string239 = StubApp.getString2(21748);
            if (configurableProvider.hasAlgorithm(string237, string239)) {
                configurableProvider.addAlgorithm(StubApp.getString2(30418), string22);
                configurableProvider.addAlgorithm(StubApp.getString2(30419), string22);
                addPSSSignature(configurableProvider, string239, string213, StubApp.getString2(30420));
                addPSSSignature(configurableProvider, string239, string233, StubApp.getString2(30421));
                addPSSSignature(configurableProvider, string239, string235, StubApp.getString2(30422));
                addDigestSignature(configurableProvider, string239, StubApp.getString2(30423), PKCSObjectIdentifiers.sha1WithRSAEncryption);
                addISO9796Signature(configurableProvider, string239, StubApp.getString2(30424));
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(29795));
                ASN1ObjectIdentifier aSN1ObjectIdentifier7 = OIWObjectIdentifiers.sha1WithRSA;
                a.z(a.q(sb2, aSN1ObjectIdentifier7, configurableProvider, StubApp.getString2(30425), StubApp.getString2(30294)), aSN1ObjectIdentifier7, configurableProvider, StubApp.getString2(30425));
                addX931Signature(configurableProvider, string239, StubApp.getString2(30426));
            }
            addDigestSignature(configurableProvider, string212, StubApp.getString2(30427), PKCSObjectIdentifiers.sha224WithRSAEncryption);
            addDigestSignature(configurableProvider, string215, StubApp.getString2(30428), PKCSObjectIdentifiers.sha256WithRSAEncryption);
            addDigestSignature(configurableProvider, string217, StubApp.getString2(30429), PKCSObjectIdentifiers.sha384WithRSAEncryption);
            addDigestSignature(configurableProvider, string219, StubApp.getString2(30430), PKCSObjectIdentifiers.sha512WithRSAEncryption);
            addDigestSignature(configurableProvider, string221, StubApp.getString2(30431), PKCSObjectIdentifiers.sha512_224WithRSAEncryption);
            addDigestSignature(configurableProvider, string223, StubApp.getString2(30432), PKCSObjectIdentifiers.sha512_256WithRSAEncryption);
            addDigestSignature(configurableProvider, string225, StubApp.getString2(30433), NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_224);
            addDigestSignature(configurableProvider, string227, StubApp.getString2(30434), NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_256);
            addDigestSignature(configurableProvider, str, StubApp.getString2(30435), NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_384);
            addDigestSignature(configurableProvider, str2, StubApp.getString2(30436), NISTObjectIdentifiers.id_rsassa_pkcs1_v1_5_with_sha3_512);
            addISO9796Signature(configurableProvider, string212, StubApp.getString2(30437));
            addISO9796Signature(configurableProvider, string215, StubApp.getString2(30438));
            addISO9796Signature(configurableProvider, string217, StubApp.getString2(30439));
            addISO9796Signature(configurableProvider, string219, StubApp.getString2(30440));
            addISO9796Signature(configurableProvider, string221, StubApp.getString2(30441));
            addISO9796Signature(configurableProvider, string223, StubApp.getString2(30442));
            addX931Signature(configurableProvider, string212, StubApp.getString2(30443));
            addX931Signature(configurableProvider, string215, StubApp.getString2(30444));
            addX931Signature(configurableProvider, string217, StubApp.getString2(30445));
            addX931Signature(configurableProvider, string219, StubApp.getString2(30446));
            addX931Signature(configurableProvider, string221, StubApp.getString2(30447));
            addX931Signature(configurableProvider, string223, StubApp.getString2(30448));
            if (configurableProvider.hasAlgorithm(string237, StubApp.getString2(28185))) {
                addDigestSignature(configurableProvider, StubApp.getString2(28185), StubApp.getString2(30449), TeleTrusTObjectIdentifiers.rsaSignatureWithripemd128);
                addDigestSignature(configurableProvider, StubApp.getString2(30450), StubApp.getString2(30449), null);
                addX931Signature(configurableProvider, StubApp.getString2(30450), StubApp.getString2(30451));
                addX931Signature(configurableProvider, StubApp.getString2(28185), StubApp.getString2(30451));
            }
            if (configurableProvider.hasAlgorithm(string237, StubApp.getString2(21747))) {
                addDigestSignature(configurableProvider, StubApp.getString2(21747), StubApp.getString2(30452), TeleTrusTObjectIdentifiers.rsaSignatureWithripemd160);
                addDigestSignature(configurableProvider, StubApp.getString2(30453), StubApp.getString2(30452), null);
                configurableProvider.addAlgorithm(StubApp.getString2(30454), StubApp.getString2(30455));
                configurableProvider.addAlgorithm(StubApp.getString2(30456), StubApp.getString2(30457));
                addX931Signature(configurableProvider, StubApp.getString2(30453), StubApp.getString2(30458));
                addX931Signature(configurableProvider, StubApp.getString2(21747), StubApp.getString2(30458));
            }
            if (configurableProvider.hasAlgorithm(string237, StubApp.getString2(28186))) {
                addDigestSignature(configurableProvider, StubApp.getString2(28186), StubApp.getString2(30459), TeleTrusTObjectIdentifiers.rsaSignatureWithripemd256);
                addDigestSignature(configurableProvider, StubApp.getString2(30460), StubApp.getString2(30459), null);
            }
            if (configurableProvider.hasAlgorithm(string237, StubApp.getString2(30461))) {
                addISO9796Signature(configurableProvider, StubApp.getString2(28525), StubApp.getString2(30462));
                addISO9796Signature(configurableProvider, StubApp.getString2(30461), StubApp.getString2(30462));
                addX931Signature(configurableProvider, StubApp.getString2(28525), StubApp.getString2(30463));
                addX931Signature(configurableProvider, StubApp.getString2(30461), StubApp.getString2(30463));
            }
        }

        private void addPSSSignature(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
            String string2 = StubApp.getString2(29795);
            String k3 = E1.a.k(string2, str, StubApp.getString2(30300));
            String string22 = StubApp.getString2(30308);
            configurableProvider.addAlgorithm(AbstractC1482f.k(a.m(str, string22, AbstractC1482f.k(a.m(str, string22, AbstractC1482f.k(a.m(str, string22, AbstractC1482f.k(a.m(str, string22, k3, string2, configurableProvider), str, StubApp.getString2(30301)), string2, configurableProvider), str, StubApp.getString2(30303)), string2, configurableProvider), str, StubApp.getString2(30304)), string2, configurableProvider), str, StubApp.getString2(30305)), str + string22);
            configurableProvider.addAlgorithm(StubApp.getString2(30309), aSN1ObjectIdentifier, str2);
            String string23 = StubApp.getString2(30293);
            configurableProvider.addAlgorithm(string23 + str + string22, str2);
            configurableProvider.addAttributes(E1.a.k(string23, str, string22), RSA.generalRsaAttributes);
        }
    }
}
