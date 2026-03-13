package org.bouncycastle.pqc.crypto.util;

import com.stub.StubApp;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.isara.IsaraObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.asn1.CMCEPublicKey;
import org.bouncycastle.pqc.asn1.McElieceCCA2PublicKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.asn1.XMSSKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTKeyParams;
import org.bouncycastle.pqc.asn1.XMSSPublicKey;
import org.bouncycastle.pqc.crypto.bike.BIKEPublicKeyParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEPublicKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPublicKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPublicKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPublicKeyParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoPublicKeyParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.HSSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUPublicKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimePublicKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimePublicKeyParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicPublicKeyParameters;
import org.bouncycastle.pqc.crypto.saber.SABERPublicKeyParameters;
import org.bouncycastle.pqc.crypto.sike.SIKEPublicKeyParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPublicKeyParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPublicKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PublicKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLAPublicKeyParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PublicKeyFactory {
    private static Map converters;

    /* renamed from: org.bouncycastle.pqc.crypto.util.PublicKeyFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class BIKEConverter extends SubjectPublicKeyInfoConverter {
        private BIKEConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            return new BIKEPublicKeyParameters(Utils.bikeParamsLookup(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()), ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets());
        }

        public /* synthetic */ BIKEConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class CMCEConverter extends SubjectPublicKeyInfoConverter {
        private CMCEConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            return new CMCEPublicKeyParameters(Utils.mcElieceParamsLookup(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()), CMCEPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey()).getT());
        }

        public /* synthetic */ CMCEConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class DilithiumConverter extends SubjectPublicKeyInfoConverter {
        private DilithiumConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            DilithiumParameters dilithiumParamsLookup = Utils.dilithiumParamsLookup(subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
            ASN1Primitive parsePublicKey = subjectPublicKeyInfo.parsePublicKey();
            if (!(parsePublicKey instanceof ASN1Sequence)) {
                return new DilithiumPublicKeyParameters(dilithiumParamsLookup, ASN1OctetString.getInstance(parsePublicKey).getOctets());
            }
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(parsePublicKey);
            return new DilithiumPublicKeyParameters(dilithiumParamsLookup, a.D(aSN1Sequence, 0), a.D(aSN1Sequence, 1));
        }

        public /* synthetic */ DilithiumConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class FalconConverter extends SubjectPublicKeyInfoConverter {
        private FalconConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            FalconParameters falconParamsLookup = Utils.falconParamsLookup(subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
            ASN1Primitive parsePublicKey = subjectPublicKeyInfo.parsePublicKey();
            if (parsePublicKey instanceof ASN1Sequence) {
                return new FalconPublicKeyParameters(falconParamsLookup, ASN1OctetString.getInstance(ASN1Sequence.getInstance(parsePublicKey).getObjectAt(0)).getOctets());
            }
            byte[] octets = ASN1OctetString.getInstance(parsePublicKey).getOctets();
            if (octets[0] == ((byte) falconParamsLookup.getLogN())) {
                return new FalconPublicKeyParameters(falconParamsLookup, Arrays.copyOfRange(octets, 1, octets.length));
            }
            throw new IllegalArgumentException(StubApp.getString2(34235));
        }

        public /* synthetic */ FalconConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class FrodoConverter extends SubjectPublicKeyInfoConverter {
        private FrodoConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            return new FrodoPublicKeyParameters(Utils.frodoParamsLookup(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()), ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets());
        }

        public /* synthetic */ FrodoConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class HQCConverter extends SubjectPublicKeyInfoConverter {
        private HQCConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            return new HQCPublicKeyParameters(Utils.hqcParamsLookup(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()), ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets());
        }

        public /* synthetic */ HQCConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class KyberConverter extends SubjectPublicKeyInfoConverter {
        private KyberConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            KyberParameters kyberParamsLookup = Utils.kyberParamsLookup(subjectPublicKeyInfo.getAlgorithm().getAlgorithm());
            ASN1Primitive parsePublicKey = subjectPublicKeyInfo.parsePublicKey();
            if (!(parsePublicKey instanceof ASN1Sequence)) {
                return new KyberPublicKeyParameters(kyberParamsLookup, ASN1OctetString.getInstance(parsePublicKey).getOctets());
            }
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(parsePublicKey);
            return new KyberPublicKeyParameters(kyberParamsLookup, a.D(aSN1Sequence, 0), a.D(aSN1Sequence, 1));
        }

        public /* synthetic */ KyberConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class LMSConverter extends SubjectPublicKeyInfoConverter {
        private LMSConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            byte[] octets = ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets();
            if (Pack.bigEndianToInt(octets, 0) == 1) {
                return LMSPublicKeyParameters.getInstance(Arrays.copyOfRange(octets, 4, octets.length));
            }
            if (octets.length == 64) {
                octets = Arrays.copyOfRange(octets, 4, octets.length);
            }
            return HSSPublicKeyParameters.getInstance(octets);
        }

        public /* synthetic */ LMSConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class McElieceCCA2Converter extends SubjectPublicKeyInfoConverter {
        private McElieceCCA2Converter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            McElieceCCA2PublicKey mcElieceCCA2PublicKey = McElieceCCA2PublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
            return new McElieceCCA2PublicKeyParameters(mcElieceCCA2PublicKey.getN(), mcElieceCCA2PublicKey.getT(), mcElieceCCA2PublicKey.getG(), Utils.getDigestName(mcElieceCCA2PublicKey.getDigest().getAlgorithm()));
        }

        public /* synthetic */ McElieceCCA2Converter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class NHConverter extends SubjectPublicKeyInfoConverter {
        private NHConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            return new NHPublicKeyParameters(subjectPublicKeyInfo.getPublicKeyData().getBytes());
        }

        public /* synthetic */ NHConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class NTRULPrimeConverter extends SubjectPublicKeyInfoConverter {
        private NTRULPrimeConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            return new NTRULPRimePublicKeyParameters(Utils.ntrulprimeParamsLookup(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()), ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets());
        }

        public /* synthetic */ NTRULPrimeConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class NtruConverter extends SubjectPublicKeyInfoConverter {
        private NtruConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            return new NTRUPublicKeyParameters(Utils.ntruParamsLookup(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()), ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets());
        }

        public /* synthetic */ NtruConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class PicnicConverter extends SubjectPublicKeyInfoConverter {
        private PicnicConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            return new PicnicPublicKeyParameters(Utils.picnicParamsLookup(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()), ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets());
        }

        public /* synthetic */ PicnicConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class QTeslaConverter extends SubjectPublicKeyInfoConverter {
        private QTeslaConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            return new QTESLAPublicKeyParameters(Utils.qTeslaLookupSecurityCategory(subjectPublicKeyInfo.getAlgorithm()), subjectPublicKeyInfo.getPublicKeyData().getOctets());
        }

        public /* synthetic */ QTeslaConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class SABERConverter extends SubjectPublicKeyInfoConverter {
        private SABERConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            return new SABERPublicKeyParameters(Utils.saberParamsLookup(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()), ASN1OctetString.getInstance(ASN1Sequence.getInstance(subjectPublicKeyInfo.parsePublicKey()).getObjectAt(0)).getOctets());
        }

        public /* synthetic */ SABERConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class SIKEConverter extends SubjectPublicKeyInfoConverter {
        private SIKEConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            return new SIKEPublicKeyParameters(Utils.sikeParamsLookup(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()), ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets());
        }

        public /* synthetic */ SIKEConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class SNTRUPrimeConverter extends SubjectPublicKeyInfoConverter {
        private SNTRUPrimeConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            return new SNTRUPrimePublicKeyParameters(Utils.sntruprimeParamsLookup(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()), ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets());
        }

        public /* synthetic */ SNTRUPrimeConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class SPHINCSConverter extends SubjectPublicKeyInfoConverter {
        private SPHINCSConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            return new SPHINCSPublicKeyParameters(subjectPublicKeyInfo.getPublicKeyData().getBytes(), Utils.sphincs256LookupTreeAlgName(SPHINCS256KeyParams.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters())));
        }

        public /* synthetic */ SPHINCSConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class SPHINCSPlusConverter extends SubjectPublicKeyInfoConverter {
        private SPHINCSPlusConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            byte[] octets = ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets();
            return new SPHINCSPlusPublicKeyParameters(SPHINCSPlusParameters.getParams(Integers.valueOf(Pack.bigEndianToInt(octets, 0))), Arrays.copyOfRange(octets, 4, octets.length));
        }

        public /* synthetic */ SPHINCSPlusConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static abstract class SubjectPublicKeyInfoConverter {
        private SubjectPublicKeyInfoConverter() {
        }

        public abstract AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException;

        public /* synthetic */ SubjectPublicKeyInfoConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class XMSSConverter extends SubjectPublicKeyInfoConverter {
        private XMSSConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            XMSSPublicKeyParameters.Builder withPublicKey;
            XMSSKeyParams xMSSKeyParams = XMSSKeyParams.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            if (xMSSKeyParams != null) {
                ASN1ObjectIdentifier algorithm = xMSSKeyParams.getTreeDigest().getAlgorithm();
                XMSSPublicKey xMSSPublicKey = XMSSPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
                withPublicKey = new XMSSPublicKeyParameters.Builder(new XMSSParameters(xMSSKeyParams.getHeight(), Utils.getDigest(algorithm))).withPublicSeed(xMSSPublicKey.getPublicSeed()).withRoot(xMSSPublicKey.getRoot());
            } else {
                byte[] octets = ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets();
                withPublicKey = new XMSSPublicKeyParameters.Builder(XMSSParameters.lookupByOID(Pack.bigEndianToInt(octets, 0))).withPublicKey(octets);
            }
            return withPublicKey.build();
        }

        public /* synthetic */ XMSSConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public static class XMSSMTConverter extends SubjectPublicKeyInfoConverter {
        private XMSSMTConverter() {
            super(null);
        }

        @Override // org.bouncycastle.pqc.crypto.util.PublicKeyFactory.SubjectPublicKeyInfoConverter
        public AsymmetricKeyParameter getPublicKeyParameters(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
            XMSSMTPublicKeyParameters.Builder withPublicKey;
            XMSSMTKeyParams xMSSMTKeyParams = XMSSMTKeyParams.getInstance(subjectPublicKeyInfo.getAlgorithm().getParameters());
            if (xMSSMTKeyParams != null) {
                ASN1ObjectIdentifier algorithm = xMSSMTKeyParams.getTreeDigest().getAlgorithm();
                XMSSPublicKey xMSSPublicKey = XMSSPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
                withPublicKey = new XMSSMTPublicKeyParameters.Builder(new XMSSMTParameters(xMSSMTKeyParams.getHeight(), xMSSMTKeyParams.getLayers(), Utils.getDigest(algorithm))).withPublicSeed(xMSSPublicKey.getPublicSeed()).withRoot(xMSSPublicKey.getRoot());
            } else {
                byte[] octets = ASN1OctetString.getInstance(subjectPublicKeyInfo.parsePublicKey()).getOctets();
                withPublicKey = new XMSSMTPublicKeyParameters.Builder(XMSSMTParameters.lookupByOID(Pack.bigEndianToInt(octets, 0))).withPublicKey(octets);
            }
            return withPublicKey.build();
        }

        public /* synthetic */ XMSSMTConverter(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        converters = hashMap;
        AnonymousClass1 anonymousClass1 = null;
        hashMap.put(PQCObjectIdentifiers.qTESLA_p_I, new QTeslaConverter(anonymousClass1));
        converters.put(PQCObjectIdentifiers.qTESLA_p_III, new QTeslaConverter(anonymousClass1));
        converters.put(PQCObjectIdentifiers.sphincs256, new SPHINCSConverter(anonymousClass1));
        converters.put(PQCObjectIdentifiers.newHope, new NHConverter(anonymousClass1));
        converters.put(PQCObjectIdentifiers.xmss, new XMSSConverter(anonymousClass1));
        converters.put(PQCObjectIdentifiers.xmss_mt, new XMSSMTConverter(anonymousClass1));
        converters.put(IsaraObjectIdentifiers.id_alg_xmss, new XMSSConverter(anonymousClass1));
        converters.put(IsaraObjectIdentifiers.id_alg_xmssmt, new XMSSMTConverter(anonymousClass1));
        converters.put(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig, new LMSConverter(anonymousClass1));
        converters.put(PQCObjectIdentifiers.mcElieceCca2, new McElieceCCA2Converter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sphincsPlus, new SPHINCSPlusConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sphincsPlus_shake_256, new SPHINCSPlusConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sphincsPlus_sha_256, new SPHINCSPlusConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sphincsPlus_sha_512, new SPHINCSPlusConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sphincsPlus_haraka, new SPHINCSPlusConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.mceliece348864_r3, new CMCEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.mceliece348864f_r3, new CMCEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.mceliece460896_r3, new CMCEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.mceliece460896f_r3, new CMCEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.mceliece6688128_r3, new CMCEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.mceliece6688128f_r3, new CMCEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.mceliece6960119_r3, new CMCEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.mceliece6960119f_r3, new CMCEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.mceliece8192128_r3, new CMCEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.mceliece8192128f_r3, new CMCEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.frodokem640aes, new FrodoConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.frodokem640shake, new FrodoConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.frodokem976aes, new FrodoConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.frodokem976shake, new FrodoConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.frodokem1344aes, new FrodoConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.frodokem1344shake, new FrodoConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.lightsaberkem128r3, new SABERConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.saberkem128r3, new SABERConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.firesaberkem128r3, new SABERConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.lightsaberkem192r3, new SABERConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.saberkem192r3, new SABERConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.firesaberkem192r3, new SABERConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.lightsaberkem256r3, new SABERConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.saberkem256r3, new SABERConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.firesaberkem256r3, new SABERConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.picnicl1fs, new PicnicConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.picnicl1ur, new PicnicConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.picnicl3fs, new PicnicConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.picnicl3ur, new PicnicConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.picnicl5fs, new PicnicConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.picnicl5ur, new PicnicConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.picnic3l1, new PicnicConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.picnic3l3, new PicnicConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.picnic3l5, new PicnicConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.picnicl1full, new PicnicConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.picnicl3full, new PicnicConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.picnicl5full, new PicnicConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sikep434, new SIKEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sikep503, new SIKEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sikep610, new SIKEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sikep751, new SIKEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sikep434_compressed, new SIKEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sikep503_compressed, new SIKEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sikep610_compressed, new SIKEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sikep751_compressed, new SIKEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.ntruhps2048509, new NtruConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.ntruhps2048677, new NtruConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.ntruhps4096821, new NtruConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.ntruhrss701, new NtruConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.falcon_512, new FalconConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.falcon_1024, new FalconConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.kyber512, new KyberConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.kyber768, new KyberConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.kyber1024, new KyberConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.kyber512_aes, new KyberConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.kyber768_aes, new KyberConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.kyber1024_aes, new KyberConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.ntrulpr653, new NTRULPrimeConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.ntrulpr761, new NTRULPrimeConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.ntrulpr857, new NTRULPrimeConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.ntrulpr953, new NTRULPrimeConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.ntrulpr1013, new NTRULPrimeConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.ntrulpr1277, new NTRULPrimeConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sntrup653, new SNTRUPrimeConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sntrup761, new SNTRUPrimeConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sntrup857, new SNTRUPrimeConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sntrup953, new SNTRUPrimeConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sntrup1013, new SNTRUPrimeConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.sntrup1277, new SNTRUPrimeConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.dilithium2, new DilithiumConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.dilithium3, new DilithiumConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.dilithium5, new DilithiumConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.dilithium2_aes, new DilithiumConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.dilithium3_aes, new DilithiumConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.dilithium5_aes, new DilithiumConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.bike128, new BIKEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.bike192, new BIKEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.bike256, new BIKEConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.hqc128, new HQCConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.hqc192, new HQCConverter(anonymousClass1));
        converters.put(BCObjectIdentifiers.hqc256, new HQCConverter(anonymousClass1));
    }

    public static AsymmetricKeyParameter createKey(InputStream inputStream) throws IOException {
        return createKey(SubjectPublicKeyInfo.getInstance(new ASN1InputStream(inputStream).readObject()));
    }

    public static AsymmetricKeyParameter createKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        return createKey(subjectPublicKeyInfo, null);
    }

    public static AsymmetricKeyParameter createKey(SubjectPublicKeyInfo subjectPublicKeyInfo, Object obj) throws IOException {
        AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
        SubjectPublicKeyInfoConverter subjectPublicKeyInfoConverter = (SubjectPublicKeyInfoConverter) converters.get(algorithm.getAlgorithm());
        if (subjectPublicKeyInfoConverter != null) {
            return subjectPublicKeyInfoConverter.getPublicKeyParameters(subjectPublicKeyInfo, obj);
        }
        throw new IOException(StubApp.getString2(29386) + algorithm.getAlgorithm());
    }

    public static AsymmetricKeyParameter createKey(byte[] bArr) throws IOException {
        return createKey(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr)));
    }
}
