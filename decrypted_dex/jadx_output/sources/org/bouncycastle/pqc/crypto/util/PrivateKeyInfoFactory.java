package org.bouncycastle.pqc.crypto.util;

import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.DERBitString;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.asn1.CMCEPrivateKey;
import org.bouncycastle.pqc.asn1.CMCEPublicKey;
import org.bouncycastle.pqc.asn1.McElieceCCA2PrivateKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.asn1.XMSSKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTKeyParams;
import org.bouncycastle.pqc.asn1.XMSSMTPrivateKey;
import org.bouncycastle.pqc.asn1.XMSSPrivateKey;
import org.bouncycastle.pqc.crypto.bike.BIKEPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.lms.Composer;
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
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSUtil;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PrivateKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLAPrivateKeyParameters;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PrivateKeyInfoFactory {
    private PrivateKeyInfoFactory() {
    }

    public static PrivateKeyInfo createPrivateKeyInfo(AsymmetricKeyParameter asymmetricKeyParameter) throws IOException {
        return createPrivateKeyInfo(asymmetricKeyParameter, null);
    }

    private static XMSSPrivateKey xmssCreateKeyStructure(XMSSPrivateKeyParameters xMSSPrivateKeyParameters) throws IOException {
        byte[] encoded = xMSSPrivateKeyParameters.getEncoded();
        int treeDigestSize = xMSSPrivateKeyParameters.getParameters().getTreeDigestSize();
        int height = xMSSPrivateKeyParameters.getParameters().getHeight();
        int bytesToXBigEndian = (int) XMSSUtil.bytesToXBigEndian(encoded, 0, 4);
        if (!XMSSUtil.isIndexValid(height, bytesToXBigEndian)) {
            throw new IllegalArgumentException(StubApp.getString2(34233));
        }
        byte[] extractBytesAtOffset = XMSSUtil.extractBytesAtOffset(encoded, 4, treeDigestSize);
        int i3 = 4 + treeDigestSize;
        byte[] extractBytesAtOffset2 = XMSSUtil.extractBytesAtOffset(encoded, i3, treeDigestSize);
        int i10 = i3 + treeDigestSize;
        byte[] extractBytesAtOffset3 = XMSSUtil.extractBytesAtOffset(encoded, i10, treeDigestSize);
        int i11 = i10 + treeDigestSize;
        byte[] extractBytesAtOffset4 = XMSSUtil.extractBytesAtOffset(encoded, i11, treeDigestSize);
        int i12 = i11 + treeDigestSize;
        byte[] extractBytesAtOffset5 = XMSSUtil.extractBytesAtOffset(encoded, i12, encoded.length - i12);
        try {
            BDS bds = (BDS) XMSSUtil.deserialize(extractBytesAtOffset5, BDS.class);
            return bds.getMaxIndex() != (1 << height) - 1 ? new XMSSPrivateKey(bytesToXBigEndian, extractBytesAtOffset, extractBytesAtOffset2, extractBytesAtOffset3, extractBytesAtOffset4, extractBytesAtOffset5, bds.getMaxIndex()) : new XMSSPrivateKey(bytesToXBigEndian, extractBytesAtOffset, extractBytesAtOffset2, extractBytesAtOffset3, extractBytesAtOffset4, extractBytesAtOffset5);
        } catch (ClassNotFoundException e10) {
            throw new IOException(StubApp.getString2(34232) + e10.getMessage());
        }
    }

    private static XMSSMTPrivateKey xmssmtCreateKeyStructure(XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters) throws IOException {
        byte[] encoded = xMSSMTPrivateKeyParameters.getEncoded();
        int treeDigestSize = xMSSMTPrivateKeyParameters.getParameters().getTreeDigestSize();
        int height = xMSSMTPrivateKeyParameters.getParameters().getHeight();
        int i3 = (height + 7) / 8;
        long bytesToXBigEndian = (int) XMSSUtil.bytesToXBigEndian(encoded, 0, i3);
        if (!XMSSUtil.isIndexValid(height, bytesToXBigEndian)) {
            throw new IllegalArgumentException(StubApp.getString2(34233));
        }
        byte[] extractBytesAtOffset = XMSSUtil.extractBytesAtOffset(encoded, i3, treeDigestSize);
        int i10 = i3 + treeDigestSize;
        byte[] extractBytesAtOffset2 = XMSSUtil.extractBytesAtOffset(encoded, i10, treeDigestSize);
        int i11 = i10 + treeDigestSize;
        byte[] extractBytesAtOffset3 = XMSSUtil.extractBytesAtOffset(encoded, i11, treeDigestSize);
        int i12 = i11 + treeDigestSize;
        byte[] extractBytesAtOffset4 = XMSSUtil.extractBytesAtOffset(encoded, i12, treeDigestSize);
        int i13 = i12 + treeDigestSize;
        byte[] extractBytesAtOffset5 = XMSSUtil.extractBytesAtOffset(encoded, i13, encoded.length - i13);
        try {
            BDSStateMap bDSStateMap = (BDSStateMap) XMSSUtil.deserialize(extractBytesAtOffset5, BDSStateMap.class);
            return bDSStateMap.getMaxIndex() != (1 << height) - 1 ? new XMSSMTPrivateKey(bytesToXBigEndian, extractBytesAtOffset, extractBytesAtOffset2, extractBytesAtOffset3, extractBytesAtOffset4, extractBytesAtOffset5, bDSStateMap.getMaxIndex()) : new XMSSMTPrivateKey(bytesToXBigEndian, extractBytesAtOffset, extractBytesAtOffset2, extractBytesAtOffset3, extractBytesAtOffset4, extractBytesAtOffset5);
        } catch (ClassNotFoundException e10) {
            throw new IOException(StubApp.getString2(34234) + e10.getMessage());
        }
    }

    public static PrivateKeyInfo createPrivateKeyInfo(AsymmetricKeyParameter asymmetricKeyParameter, ASN1Set aSN1Set) throws IOException {
        if (asymmetricKeyParameter instanceof QTESLAPrivateKeyParameters) {
            QTESLAPrivateKeyParameters qTESLAPrivateKeyParameters = (QTESLAPrivateKeyParameters) asymmetricKeyParameter;
            return new PrivateKeyInfo(Utils.qTeslaLookupAlgID(qTESLAPrivateKeyParameters.getSecurityCategory()), new DEROctetString(qTESLAPrivateKeyParameters.getSecret()), aSN1Set);
        }
        if (asymmetricKeyParameter instanceof SPHINCSPrivateKeyParameters) {
            SPHINCSPrivateKeyParameters sPHINCSPrivateKeyParameters = (SPHINCSPrivateKeyParameters) asymmetricKeyParameter;
            return new PrivateKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.sphincs256, new SPHINCS256KeyParams(Utils.sphincs256LookupTreeAlgID(sPHINCSPrivateKeyParameters.getTreeDigest()))), new DEROctetString(sPHINCSPrivateKeyParameters.getKeyData()));
        }
        if (asymmetricKeyParameter instanceof NHPrivateKeyParameters) {
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(PQCObjectIdentifiers.newHope);
            short[] secData = ((NHPrivateKeyParameters) asymmetricKeyParameter).getSecData();
            byte[] bArr = new byte[secData.length * 2];
            for (int i3 = 0; i3 != secData.length; i3++) {
                Pack.shortToLittleEndian(secData[i3], bArr, i3 * 2);
            }
            return new PrivateKeyInfo(algorithmIdentifier, new DEROctetString(bArr));
        }
        if (asymmetricKeyParameter instanceof LMSPrivateKeyParameters) {
            LMSPrivateKeyParameters lMSPrivateKeyParameters = (LMSPrivateKeyParameters) asymmetricKeyParameter;
            byte[] build = Composer.compose().u32str(1).bytes(lMSPrivateKeyParameters).build();
            return new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig), new DEROctetString(build), aSN1Set, Composer.compose().u32str(1).bytes(lMSPrivateKeyParameters.getPublicKey()).build());
        }
        if (asymmetricKeyParameter instanceof HSSPrivateKeyParameters) {
            HSSPrivateKeyParameters hSSPrivateKeyParameters = (HSSPrivateKeyParameters) asymmetricKeyParameter;
            byte[] build2 = Composer.compose().u32str(hSSPrivateKeyParameters.getL()).bytes(hSSPrivateKeyParameters).build();
            return new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig), new DEROctetString(build2), aSN1Set, Composer.compose().u32str(hSSPrivateKeyParameters.getL()).bytes(hSSPrivateKeyParameters.getPublicKey().getLMSPublicKey()).build());
        }
        if (asymmetricKeyParameter instanceof SPHINCSPlusPrivateKeyParameters) {
            SPHINCSPlusPrivateKeyParameters sPHINCSPlusPrivateKeyParameters = (SPHINCSPlusPrivateKeyParameters) asymmetricKeyParameter;
            byte[] encoded = sPHINCSPlusPrivateKeyParameters.getEncoded();
            return new PrivateKeyInfo(new AlgorithmIdentifier(Utils.sphincsPlusOidLookup(sPHINCSPlusPrivateKeyParameters.getParameters())), new DEROctetString(encoded), aSN1Set, sPHINCSPlusPrivateKeyParameters.getEncodedPublicKey());
        }
        if (asymmetricKeyParameter instanceof PicnicPrivateKeyParameters) {
            PicnicPrivateKeyParameters picnicPrivateKeyParameters = (PicnicPrivateKeyParameters) asymmetricKeyParameter;
            return new PrivateKeyInfo(new AlgorithmIdentifier(Utils.picnicOidLookup(picnicPrivateKeyParameters.getParameters())), new DEROctetString(picnicPrivateKeyParameters.getEncoded()), aSN1Set);
        }
        if (asymmetricKeyParameter instanceof CMCEPrivateKeyParameters) {
            CMCEPrivateKeyParameters cMCEPrivateKeyParameters = (CMCEPrivateKeyParameters) asymmetricKeyParameter;
            cMCEPrivateKeyParameters.getEncoded();
            return new PrivateKeyInfo(new AlgorithmIdentifier(Utils.mcElieceOidLookup(cMCEPrivateKeyParameters.getParameters())), new CMCEPrivateKey(0, cMCEPrivateKeyParameters.getDelta(), cMCEPrivateKeyParameters.getC(), cMCEPrivateKeyParameters.getG(), cMCEPrivateKeyParameters.getAlpha(), cMCEPrivateKeyParameters.getS(), new CMCEPublicKey(cMCEPrivateKeyParameters.reconstructPublicKey())), aSN1Set);
        }
        if (asymmetricKeyParameter instanceof XMSSPrivateKeyParameters) {
            XMSSPrivateKeyParameters xMSSPrivateKeyParameters = (XMSSPrivateKeyParameters) asymmetricKeyParameter;
            return new PrivateKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.xmss, new XMSSKeyParams(xMSSPrivateKeyParameters.getParameters().getHeight(), Utils.xmssLookupTreeAlgID(xMSSPrivateKeyParameters.getTreeDigest()))), xmssCreateKeyStructure(xMSSPrivateKeyParameters), aSN1Set);
        }
        if (asymmetricKeyParameter instanceof XMSSMTPrivateKeyParameters) {
            XMSSMTPrivateKeyParameters xMSSMTPrivateKeyParameters = (XMSSMTPrivateKeyParameters) asymmetricKeyParameter;
            return new PrivateKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.xmss_mt, new XMSSMTKeyParams(xMSSMTPrivateKeyParameters.getParameters().getHeight(), xMSSMTPrivateKeyParameters.getParameters().getLayers(), Utils.xmssLookupTreeAlgID(xMSSMTPrivateKeyParameters.getTreeDigest()))), xmssmtCreateKeyStructure(xMSSMTPrivateKeyParameters), aSN1Set);
        }
        if (asymmetricKeyParameter instanceof McElieceCCA2PrivateKeyParameters) {
            McElieceCCA2PrivateKeyParameters mcElieceCCA2PrivateKeyParameters = (McElieceCCA2PrivateKeyParameters) asymmetricKeyParameter;
            return new PrivateKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.mcElieceCca2), new McElieceCCA2PrivateKey(mcElieceCCA2PrivateKeyParameters.getN(), mcElieceCCA2PrivateKeyParameters.getK(), mcElieceCCA2PrivateKeyParameters.getField(), mcElieceCCA2PrivateKeyParameters.getGoppaPoly(), mcElieceCCA2PrivateKeyParameters.getP(), Utils.getAlgorithmIdentifier(mcElieceCCA2PrivateKeyParameters.getDigest())));
        }
        if (asymmetricKeyParameter instanceof FrodoPrivateKeyParameters) {
            FrodoPrivateKeyParameters frodoPrivateKeyParameters = (FrodoPrivateKeyParameters) asymmetricKeyParameter;
            return new PrivateKeyInfo(new AlgorithmIdentifier(Utils.frodoOidLookup(frodoPrivateKeyParameters.getParameters())), new DEROctetString(frodoPrivateKeyParameters.getEncoded()), aSN1Set);
        }
        if (asymmetricKeyParameter instanceof SABERPrivateKeyParameters) {
            SABERPrivateKeyParameters sABERPrivateKeyParameters = (SABERPrivateKeyParameters) asymmetricKeyParameter;
            return new PrivateKeyInfo(new AlgorithmIdentifier(Utils.saberOidLookup(sABERPrivateKeyParameters.getParameters())), new DEROctetString(sABERPrivateKeyParameters.getEncoded()), aSN1Set);
        }
        if (asymmetricKeyParameter instanceof SIKEPrivateKeyParameters) {
            SIKEPrivateKeyParameters sIKEPrivateKeyParameters = (SIKEPrivateKeyParameters) asymmetricKeyParameter;
            return new PrivateKeyInfo(new AlgorithmIdentifier(Utils.sikeOidLookup(sIKEPrivateKeyParameters.getParameters())), new DEROctetString(sIKEPrivateKeyParameters.getEncoded()), aSN1Set);
        }
        if (asymmetricKeyParameter instanceof NTRUPrivateKeyParameters) {
            NTRUPrivateKeyParameters nTRUPrivateKeyParameters = (NTRUPrivateKeyParameters) asymmetricKeyParameter;
            return new PrivateKeyInfo(new AlgorithmIdentifier(Utils.ntruOidLookup(nTRUPrivateKeyParameters.getParameters())), new DEROctetString(nTRUPrivateKeyParameters.getEncoded()), aSN1Set);
        }
        if (asymmetricKeyParameter instanceof FalconPrivateKeyParameters) {
            FalconPrivateKeyParameters falconPrivateKeyParameters = (FalconPrivateKeyParameters) asymmetricKeyParameter;
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(new ASN1Integer(1L));
            aSN1EncodableVector.add(new DEROctetString(falconPrivateKeyParameters.getSpolyf()));
            aSN1EncodableVector.add(new DEROctetString(falconPrivateKeyParameters.getG()));
            aSN1EncodableVector.add(new DEROctetString(falconPrivateKeyParameters.getSpolyF()));
            return new PrivateKeyInfo(new AlgorithmIdentifier(Utils.falconOidLookup(falconPrivateKeyParameters.getParameters())), new DERSequence(aSN1EncodableVector), aSN1Set, falconPrivateKeyParameters.getPublicKey());
        }
        if (asymmetricKeyParameter instanceof KyberPrivateKeyParameters) {
            KyberPrivateKeyParameters kyberPrivateKeyParameters = (KyberPrivateKeyParameters) asymmetricKeyParameter;
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(new ASN1Integer(0L));
            aSN1EncodableVector2.add(new DEROctetString(kyberPrivateKeyParameters.getS()));
            aSN1EncodableVector2.add(new DEROctetString(kyberPrivateKeyParameters.getHPK()));
            aSN1EncodableVector2.add(new DEROctetString(kyberPrivateKeyParameters.getNonce()));
            AlgorithmIdentifier algorithmIdentifier2 = new AlgorithmIdentifier(Utils.kyberOidLookup(kyberPrivateKeyParameters.getParameters()));
            ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
            aSN1EncodableVector3.add(new DEROctetString(kyberPrivateKeyParameters.getT()));
            aSN1EncodableVector3.add(new DEROctetString(kyberPrivateKeyParameters.getRho()));
            return new PrivateKeyInfo(algorithmIdentifier2, new DERSequence(aSN1EncodableVector2), aSN1Set, new DERSequence(aSN1EncodableVector3).getEncoded());
        }
        if (asymmetricKeyParameter instanceof NTRULPRimePrivateKeyParameters) {
            NTRULPRimePrivateKeyParameters nTRULPRimePrivateKeyParameters = (NTRULPRimePrivateKeyParameters) asymmetricKeyParameter;
            ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
            aSN1EncodableVector4.add(new DEROctetString(nTRULPRimePrivateKeyParameters.getEnca()));
            aSN1EncodableVector4.add(new DEROctetString(nTRULPRimePrivateKeyParameters.getPk()));
            aSN1EncodableVector4.add(new DEROctetString(nTRULPRimePrivateKeyParameters.getRho()));
            aSN1EncodableVector4.add(new DEROctetString(nTRULPRimePrivateKeyParameters.getHash()));
            return new PrivateKeyInfo(new AlgorithmIdentifier(Utils.ntrulprimeOidLookup(nTRULPRimePrivateKeyParameters.getParameters())), new DERSequence(aSN1EncodableVector4), aSN1Set);
        }
        if (asymmetricKeyParameter instanceof SNTRUPrimePrivateKeyParameters) {
            SNTRUPrimePrivateKeyParameters sNTRUPrimePrivateKeyParameters = (SNTRUPrimePrivateKeyParameters) asymmetricKeyParameter;
            ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
            aSN1EncodableVector5.add(new DEROctetString(sNTRUPrimePrivateKeyParameters.getF()));
            aSN1EncodableVector5.add(new DEROctetString(sNTRUPrimePrivateKeyParameters.getGinv()));
            aSN1EncodableVector5.add(new DEROctetString(sNTRUPrimePrivateKeyParameters.getPk()));
            aSN1EncodableVector5.add(new DEROctetString(sNTRUPrimePrivateKeyParameters.getRho()));
            aSN1EncodableVector5.add(new DEROctetString(sNTRUPrimePrivateKeyParameters.getHash()));
            return new PrivateKeyInfo(new AlgorithmIdentifier(Utils.sntruprimeOidLookup(sNTRUPrimePrivateKeyParameters.getParameters())), new DERSequence(aSN1EncodableVector5), aSN1Set);
        }
        if (!(asymmetricKeyParameter instanceof DilithiumPrivateKeyParameters)) {
            if (asymmetricKeyParameter instanceof BIKEPrivateKeyParameters) {
                BIKEPrivateKeyParameters bIKEPrivateKeyParameters = (BIKEPrivateKeyParameters) asymmetricKeyParameter;
                return new PrivateKeyInfo(new AlgorithmIdentifier(Utils.bikeOidLookup(bIKEPrivateKeyParameters.getParameters())), new DEROctetString(bIKEPrivateKeyParameters.getEncoded()), aSN1Set);
            }
            if (!(asymmetricKeyParameter instanceof HQCPrivateKeyParameters)) {
                throw new IOException(StubApp.getString2(29379));
            }
            HQCPrivateKeyParameters hQCPrivateKeyParameters = (HQCPrivateKeyParameters) asymmetricKeyParameter;
            return new PrivateKeyInfo(new AlgorithmIdentifier(Utils.hqcOidLookup(hQCPrivateKeyParameters.getParameters())), new DEROctetString(hQCPrivateKeyParameters.getPrivateKey()), aSN1Set);
        }
        DilithiumPrivateKeyParameters dilithiumPrivateKeyParameters = (DilithiumPrivateKeyParameters) asymmetricKeyParameter;
        ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
        aSN1EncodableVector6.add(new ASN1Integer(0L));
        aSN1EncodableVector6.add(new DERBitString(dilithiumPrivateKeyParameters.getRho()));
        aSN1EncodableVector6.add(new DERBitString(dilithiumPrivateKeyParameters.getK()));
        aSN1EncodableVector6.add(new DERBitString(dilithiumPrivateKeyParameters.getTr()));
        aSN1EncodableVector6.add(new DERBitString(dilithiumPrivateKeyParameters.getS1()));
        aSN1EncodableVector6.add(new DERBitString(dilithiumPrivateKeyParameters.getS2()));
        aSN1EncodableVector6.add(new DERBitString(dilithiumPrivateKeyParameters.getT0()));
        AlgorithmIdentifier algorithmIdentifier3 = new AlgorithmIdentifier(Utils.dilithiumOidLookup(dilithiumPrivateKeyParameters.getParameters()));
        ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
        aSN1EncodableVector7.add(new DEROctetString(dilithiumPrivateKeyParameters.getRho()));
        aSN1EncodableVector7.add(new DEROctetString(dilithiumPrivateKeyParameters.getT1()));
        return new PrivateKeyInfo(algorithmIdentifier3, new DERSequence(aSN1EncodableVector6), aSN1Set, new DERSequence(aSN1EncodableVector7).getEncoded());
    }
}
