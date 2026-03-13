package org.bouncycastle.pqc.crypto.util;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1BitString;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.asn1.CMCEPrivateKey;
import org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.asn1.XMSSKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTPrivateKey;
import org.bouncycastle.pqc.asn1.XMSSPrivateKey;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.pqc.crypto.bike.BIKEPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.HSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.newhope.NHPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimePrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimePrivateKeyParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.saber.SABERPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sike.SIKEPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSUtil;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PrivateKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLAPrivateKeyParameters;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PrivateKeyFactory {
    private static short[] convert(byte[] bArr) {
        int length = bArr.length / 2;
        short[] sArr = new short[length];
        for (int i3 = 0; i3 != length; i3++) {
            sArr[i3] = Pack.littleEndianToShort(bArr, i3 * 2);
        }
        return sArr;
    }

    public static AsymmetricKeyParameter createKey(InputStream inputStream) throws IOException {
        return createKey(PrivateKeyInfo.getInstance(new ASN1InputStream(inputStream).readObject()));
    }

    public static AsymmetricKeyParameter createKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (algorithm.on(BCObjectIdentifiers.qTESLA)) {
            return new QTESLAPrivateKeyParameters(Utils.qTeslaLookupSecurityCategory(privateKeyInfo.getPrivateKeyAlgorithm()), ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.equals((ASN1Primitive) BCObjectIdentifiers.sphincs256)) {
            return new SPHINCSPrivateKeyParameters(ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets(), Utils.sphincs256LookupTreeAlgName(SPHINCS256KeyParams.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters())));
        }
        if (algorithm.equals((ASN1Primitive) BCObjectIdentifiers.newHope)) {
            return new NHPrivateKeyParameters(convert(ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets()));
        }
        if (algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.id_alg_hss_lms_hashsig)) {
            byte[] octets = ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets();
            ASN1BitString publicKeyData = privateKeyInfo.getPublicKeyData();
            if (Pack.bigEndianToInt(octets, 0) != 1) {
                if (publicKeyData != null) {
                    return HSSPrivateKeyParameters.getInstance(Arrays.copyOfRange(octets, 4, octets.length), publicKeyData.getOctets());
                }
                return HSSPrivateKeyParameters.getInstance(Arrays.copyOfRange(octets, 4, octets.length));
            }
            if (publicKeyData == null) {
                return LMSPrivateKeyParameters.getInstance(Arrays.copyOfRange(octets, 4, octets.length));
            }
            byte[] octets2 = publicKeyData.getOctets();
            return LMSPrivateKeyParameters.getInstance(Arrays.copyOfRange(octets, 4, octets.length), Arrays.copyOfRange(octets2, 4, octets2.length));
        }
        if (algorithm.on(BCObjectIdentifiers.sphincsPlus)) {
            byte[] octets3 = ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets();
            return new SPHINCSPlusPrivateKeyParameters(SPHINCSPlusParameters.getParams(Integers.valueOf(Pack.bigEndianToInt(octets3, 0))), Arrays.copyOfRange(octets3, 4, octets3.length));
        }
        if (algorithm.on(BCObjectIdentifiers.picnic)) {
            return new PicnicPrivateKeyParameters(Utils.picnicParamsLookup(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()), ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_mceliece)) {
            CMCEPrivateKey cMCEPrivateKey = CMCEPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            return new CMCEPrivateKeyParameters(Utils.mcElieceParamsLookup(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()), cMCEPrivateKey.getDelta(), cMCEPrivateKey.getC(), cMCEPrivateKey.getG(), cMCEPrivateKey.getAlpha(), cMCEPrivateKey.getS());
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_frodo)) {
            return new FrodoPrivateKeyParameters(Utils.frodoParamsLookup(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()), ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_saber)) {
            return new SABERPrivateKeyParameters(Utils.saberParamsLookup(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()), ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_sike)) {
            return new SIKEPrivateKeyParameters(Utils.sikeParamsLookup(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()), ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_ntru)) {
            return new NTRUPrivateKeyParameters(Utils.ntruParamsLookup(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()), ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        boolean on = algorithm.on(BCObjectIdentifiers.pqc_kem_kyber);
        String string2 = StubApp.getString2(34230);
        if (on) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(privateKeyInfo.parsePrivateKey());
            KyberParameters kyberParamsLookup = Utils.kyberParamsLookup(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
            int a3 = a.a(aSN1Sequence, 0);
            if (a3 != 0) {
                throw new IOException(u.p(a3, string2));
            }
            if (privateKeyInfo.getPublicKeyData() == null) {
                return new KyberPrivateKeyParameters(kyberParamsLookup, a.D(aSN1Sequence, 1), a.D(aSN1Sequence, 2), a.D(aSN1Sequence, 3), null, null);
            }
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(privateKeyInfo.getPublicKeyData().getOctets());
            return new KyberPrivateKeyParameters(kyberParamsLookup, a.D(aSN1Sequence, 1), a.D(aSN1Sequence, 2), a.D(aSN1Sequence, 3), a.D(aSN1Sequence2, 0), a.D(aSN1Sequence2, 1));
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_ntrulprime)) {
            ASN1Sequence aSN1Sequence3 = ASN1Sequence.getInstance(privateKeyInfo.parsePrivateKey());
            return new NTRULPRimePrivateKeyParameters(Utils.ntrulprimeParamsLookup(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()), a.D(aSN1Sequence3, 0), a.D(aSN1Sequence3, 1), a.D(aSN1Sequence3, 2), a.D(aSN1Sequence3, 3));
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_sntruprime)) {
            ASN1Sequence aSN1Sequence4 = ASN1Sequence.getInstance(privateKeyInfo.parsePrivateKey());
            return new SNTRUPrimePrivateKeyParameters(Utils.sntruprimeParamsLookup(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()), a.D(aSN1Sequence4, 0), a.D(aSN1Sequence4, 1), a.D(aSN1Sequence4, 2), a.D(aSN1Sequence4, 3), a.D(aSN1Sequence4, 4));
        }
        if (algorithm.equals((ASN1Primitive) BCObjectIdentifiers.dilithium2) || algorithm.equals((ASN1Primitive) BCObjectIdentifiers.dilithium3) || algorithm.equals((ASN1Primitive) BCObjectIdentifiers.dilithium5) || algorithm.equals((ASN1Primitive) BCObjectIdentifiers.dilithium2_aes) || algorithm.equals((ASN1Primitive) BCObjectIdentifiers.dilithium3_aes) || algorithm.equals((ASN1Primitive) BCObjectIdentifiers.dilithium5_aes)) {
            ASN1Sequence aSN1Sequence5 = ASN1Sequence.getInstance(privateKeyInfo.parsePrivateKey());
            DilithiumParameters dilithiumParamsLookup = Utils.dilithiumParamsLookup(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
            int a9 = a.a(aSN1Sequence5, 0);
            if (a9 != 0) {
                throw new IOException(u.p(a9, string2));
            }
            if (privateKeyInfo.getPublicKeyData() != null) {
                return new DilithiumPrivateKeyParameters(dilithiumParamsLookup, ASN1BitString.getInstance(aSN1Sequence5.getObjectAt(1)).getOctets(), ASN1BitString.getInstance(aSN1Sequence5.getObjectAt(2)).getOctets(), ASN1BitString.getInstance(aSN1Sequence5.getObjectAt(3)).getOctets(), ASN1BitString.getInstance(aSN1Sequence5.getObjectAt(4)).getOctets(), ASN1BitString.getInstance(aSN1Sequence5.getObjectAt(5)).getOctets(), ASN1BitString.getInstance(aSN1Sequence5.getObjectAt(6)).getOctets(), a.D(ASN1Sequence.getInstance(privateKeyInfo.getPublicKeyData().getOctets()), 1));
            }
            return new DilithiumPrivateKeyParameters(dilithiumParamsLookup, ASN1BitString.getInstance(aSN1Sequence5.getObjectAt(1)).getOctets(), ASN1BitString.getInstance(aSN1Sequence5.getObjectAt(2)).getOctets(), ASN1BitString.getInstance(aSN1Sequence5.getObjectAt(3)).getOctets(), ASN1BitString.getInstance(aSN1Sequence5.getObjectAt(4)).getOctets(), ASN1BitString.getInstance(aSN1Sequence5.getObjectAt(5)).getOctets(), ASN1BitString.getInstance(aSN1Sequence5.getObjectAt(6)).getOctets(), null);
        }
        if (algorithm.equals((ASN1Primitive) BCObjectIdentifiers.falcon_512) || algorithm.equals((ASN1Primitive) BCObjectIdentifiers.falcon_1024)) {
            ASN1Sequence aSN1Sequence6 = ASN1Sequence.getInstance(privateKeyInfo.parsePrivateKey());
            FalconParameters falconParamsLookup = Utils.falconParamsLookup(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
            ASN1BitString publicKeyData2 = privateKeyInfo.getPublicKeyData();
            int a10 = a.a(aSN1Sequence6, 0);
            if (a10 == 1) {
                return privateKeyInfo.getPublicKeyData() != null ? new FalconPrivateKeyParameters(falconParamsLookup, a.D(aSN1Sequence6, 1), a.D(aSN1Sequence6, 2), a.D(aSN1Sequence6, 3), publicKeyData2.getOctets()) : new FalconPrivateKeyParameters(falconParamsLookup, a.D(aSN1Sequence6, 1), a.D(aSN1Sequence6, 2), a.D(aSN1Sequence6, 3), null);
            }
            throw new IOException(u.p(a10, string2));
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_bike)) {
            byte[] octets4 = ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets();
            BIKEParameters bikeParamsLookup = Utils.bikeParamsLookup(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm());
            return new BIKEPrivateKeyParameters(bikeParamsLookup, Arrays.copyOfRange(octets4, 0, bikeParamsLookup.getRByte()), Arrays.copyOfRange(octets4, bikeParamsLookup.getRByte(), bikeParamsLookup.getRByte() * 2), Arrays.copyOfRange(octets4, bikeParamsLookup.getRByte() * 2, octets4.length));
        }
        if (algorithm.on(BCObjectIdentifiers.pqc_kem_hqc)) {
            return new HQCPrivateKeyParameters(Utils.hqcParamsLookup(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()), ASN1OctetString.getInstance(privateKeyInfo.parsePrivateKey()).getOctets());
        }
        boolean equals = algorithm.equals((ASN1Primitive) BCObjectIdentifiers.xmss);
        String string22 = StubApp.getString2(34231);
        if (equals) {
            XMSSKeyParams xMSSKeyParams = XMSSKeyParams.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
            ASN1ObjectIdentifier algorithm2 = xMSSKeyParams.getTreeDigest().getAlgorithm();
            XMSSPrivateKey xMSSPrivateKey = XMSSPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            try {
                XMSSPrivateKeyParameters.Builder withRoot = new XMSSPrivateKeyParameters.Builder(new XMSSParameters(xMSSKeyParams.getHeight(), Utils.getDigest(algorithm2))).withIndex(xMSSPrivateKey.getIndex()).withSecretKeySeed(xMSSPrivateKey.getSecretKeySeed()).withSecretKeyPRF(xMSSPrivateKey.getSecretKeyPRF()).withPublicSeed(xMSSPrivateKey.getPublicSeed()).withRoot(xMSSPrivateKey.getRoot());
                if (xMSSPrivateKey.getVersion() != 0) {
                    withRoot.withMaxIndex(xMSSPrivateKey.getMaxIndex());
                }
                if (xMSSPrivateKey.getBdsState() != null) {
                    withRoot.withBDSState(((BDS) XMSSUtil.deserialize(xMSSPrivateKey.getBdsState(), BDS.class)).withWOTSDigest(algorithm2));
                }
                return withRoot.build();
            } catch (ClassNotFoundException e10) {
                throw new IOException(string22 + e10.getMessage());
            }
        }
        if (!algorithm.equals((ASN1Primitive) PQCObjectIdentifiers.xmss_mt)) {
            if (!algorithm.equals((ASN1Primitive) PQCObjectIdentifiers.mcElieceCca2)) {
                throw new RuntimeException(StubApp.getString2(29378));
            }
            McElieceCCA2PrivateKey mcElieceCCA2PrivateKey = McElieceCCA2PrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            return new McElieceCCA2PrivateKeyParameters(mcElieceCCA2PrivateKey.getN(), mcElieceCCA2PrivateKey.getK(), mcElieceCCA2PrivateKey.getField(), mcElieceCCA2PrivateKey.getGoppaPoly(), mcElieceCCA2PrivateKey.getP(), Utils.getDigestName(mcElieceCCA2PrivateKey.getDigest().getAlgorithm()));
        }
        XMSSMTKeyParams xMSSMTKeyParams = XMSSMTKeyParams.getInstance(privateKeyInfo.getPrivateKeyAlgorithm().getParameters());
        ASN1ObjectIdentifier algorithm3 = xMSSMTKeyParams.getTreeDigest().getAlgorithm();
        try {
            XMSSMTPrivateKey xMSSMTPrivateKey = XMSSMTPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            XMSSMTPrivateKeyParameters.Builder withRoot2 = new XMSSMTPrivateKeyParameters.Builder(new XMSSMTParameters(xMSSMTKeyParams.getHeight(), xMSSMTKeyParams.getLayers(), Utils.getDigest(algorithm3))).withIndex(xMSSMTPrivateKey.getIndex()).withSecretKeySeed(xMSSMTPrivateKey.getSecretKeySeed()).withSecretKeyPRF(xMSSMTPrivateKey.getSecretKeyPRF()).withPublicSeed(xMSSMTPrivateKey.getPublicSeed()).withRoot(xMSSMTPrivateKey.getRoot());
            if (xMSSMTPrivateKey.getVersion() != 0) {
                withRoot2.withMaxIndex(xMSSMTPrivateKey.getMaxIndex());
            }
            if (xMSSMTPrivateKey.getBdsState() != null) {
                withRoot2.withBDSState(((BDSStateMap) XMSSUtil.deserialize(xMSSMTPrivateKey.getBdsState(), BDSStateMap.class)).withWOTSDigest(algorithm3));
            }
            return withRoot2.build();
        } catch (ClassNotFoundException e11) {
            throw new IOException(string22 + e11.getMessage());
        }
    }

    public static AsymmetricKeyParameter createKey(byte[] bArr) throws IOException {
        return createKey(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr)));
    }
}
