package org.bouncycastle.pqc.crypto.util;

import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
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
import org.bouncycastle.pqc.asn1.XMSSMTPublicKey;
import org.bouncycastle.pqc.asn1.XMSSPublicKey;
import org.bouncycastle.pqc.crypto.bike.BIKEPublicKeyParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEPublicKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPublicKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberPublicKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPublicKeyParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoPublicKeyParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCPublicKeyParameters;
import org.bouncycastle.pqc.crypto.lms.Composer;
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
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPublicKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters;
import org.bouncycastle.pqc.crypto.xmss.XMSSPublicKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McElieceCCA2PublicKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.qtesla.QTESLAPublicKeyParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SubjectPublicKeyInfoFactory {
    private SubjectPublicKeyInfoFactory() {
    }

    public static SubjectPublicKeyInfo createSubjectPublicKeyInfo(AsymmetricKeyParameter asymmetricKeyParameter) throws IOException {
        if (asymmetricKeyParameter instanceof QTESLAPublicKeyParameters) {
            QTESLAPublicKeyParameters qTESLAPublicKeyParameters = (QTESLAPublicKeyParameters) asymmetricKeyParameter;
            return new SubjectPublicKeyInfo(Utils.qTeslaLookupAlgID(qTESLAPublicKeyParameters.getSecurityCategory()), qTESLAPublicKeyParameters.getPublicData());
        }
        if (asymmetricKeyParameter instanceof SPHINCSPublicKeyParameters) {
            SPHINCSPublicKeyParameters sPHINCSPublicKeyParameters = (SPHINCSPublicKeyParameters) asymmetricKeyParameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.sphincs256, new SPHINCS256KeyParams(Utils.sphincs256LookupTreeAlgID(sPHINCSPublicKeyParameters.getTreeDigest()))), sPHINCSPublicKeyParameters.getKeyData());
        }
        if (asymmetricKeyParameter instanceof NHPublicKeyParameters) {
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.newHope), ((NHPublicKeyParameters) asymmetricKeyParameter).getPubData());
        }
        if (asymmetricKeyParameter instanceof LMSPublicKeyParameters) {
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig), new DEROctetString(Composer.compose().u32str(1).bytes((LMSPublicKeyParameters) asymmetricKeyParameter).build()));
        }
        if (asymmetricKeyParameter instanceof HSSPublicKeyParameters) {
            HSSPublicKeyParameters hSSPublicKeyParameters = (HSSPublicKeyParameters) asymmetricKeyParameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_hss_lms_hashsig), new DEROctetString(Composer.compose().u32str(hSSPublicKeyParameters.getL()).bytes(hSSPublicKeyParameters.getLMSPublicKey()).build()));
        }
        if (asymmetricKeyParameter instanceof SPHINCSPlusPublicKeyParameters) {
            SPHINCSPlusPublicKeyParameters sPHINCSPlusPublicKeyParameters = (SPHINCSPlusPublicKeyParameters) asymmetricKeyParameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(Utils.sphincsPlusOidLookup(sPHINCSPlusPublicKeyParameters.getParameters())), new DEROctetString(sPHINCSPlusPublicKeyParameters.getEncoded()));
        }
        if (asymmetricKeyParameter instanceof CMCEPublicKeyParameters) {
            CMCEPublicKeyParameters cMCEPublicKeyParameters = (CMCEPublicKeyParameters) asymmetricKeyParameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(Utils.mcElieceOidLookup(cMCEPublicKeyParameters.getParameters())), new CMCEPublicKey(cMCEPublicKeyParameters.getEncoded()));
        }
        if (asymmetricKeyParameter instanceof XMSSPublicKeyParameters) {
            XMSSPublicKeyParameters xMSSPublicKeyParameters = (XMSSPublicKeyParameters) asymmetricKeyParameter;
            byte[] publicSeed = xMSSPublicKeyParameters.getPublicSeed();
            byte[] root = xMSSPublicKeyParameters.getRoot();
            byte[] encoded = xMSSPublicKeyParameters.getEncoded();
            return encoded.length > publicSeed.length + root.length ? new SubjectPublicKeyInfo(new AlgorithmIdentifier(IsaraObjectIdentifiers.id_alg_xmss), new DEROctetString(encoded)) : new SubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.xmss, new XMSSKeyParams(xMSSPublicKeyParameters.getParameters().getHeight(), Utils.xmssLookupTreeAlgID(xMSSPublicKeyParameters.getTreeDigest()))), new XMSSPublicKey(publicSeed, root));
        }
        if (asymmetricKeyParameter instanceof XMSSMTPublicKeyParameters) {
            XMSSMTPublicKeyParameters xMSSMTPublicKeyParameters = (XMSSMTPublicKeyParameters) asymmetricKeyParameter;
            byte[] publicSeed2 = xMSSMTPublicKeyParameters.getPublicSeed();
            byte[] root2 = xMSSMTPublicKeyParameters.getRoot();
            byte[] encoded2 = xMSSMTPublicKeyParameters.getEncoded();
            return encoded2.length > publicSeed2.length + root2.length ? new SubjectPublicKeyInfo(new AlgorithmIdentifier(IsaraObjectIdentifiers.id_alg_xmssmt), new DEROctetString(encoded2)) : new SubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.xmss_mt, new XMSSMTKeyParams(xMSSMTPublicKeyParameters.getParameters().getHeight(), xMSSMTPublicKeyParameters.getParameters().getLayers(), Utils.xmssLookupTreeAlgID(xMSSMTPublicKeyParameters.getTreeDigest()))), new XMSSMTPublicKey(xMSSMTPublicKeyParameters.getPublicSeed(), xMSSMTPublicKeyParameters.getRoot()));
        }
        if (asymmetricKeyParameter instanceof McElieceCCA2PublicKeyParameters) {
            McElieceCCA2PublicKeyParameters mcElieceCCA2PublicKeyParameters = (McElieceCCA2PublicKeyParameters) asymmetricKeyParameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(PQCObjectIdentifiers.mcElieceCca2), new McElieceCCA2PublicKey(mcElieceCCA2PublicKeyParameters.getN(), mcElieceCCA2PublicKeyParameters.getT(), mcElieceCCA2PublicKeyParameters.getG(), Utils.getAlgorithmIdentifier(mcElieceCCA2PublicKeyParameters.getDigest())));
        }
        if (asymmetricKeyParameter instanceof FrodoPublicKeyParameters) {
            FrodoPublicKeyParameters frodoPublicKeyParameters = (FrodoPublicKeyParameters) asymmetricKeyParameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(Utils.frodoOidLookup(frodoPublicKeyParameters.getParameters())), new DEROctetString(frodoPublicKeyParameters.getEncoded()));
        }
        if (asymmetricKeyParameter instanceof SABERPublicKeyParameters) {
            SABERPublicKeyParameters sABERPublicKeyParameters = (SABERPublicKeyParameters) asymmetricKeyParameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(Utils.saberOidLookup(sABERPublicKeyParameters.getParameters())), new DERSequence(new DEROctetString(sABERPublicKeyParameters.getEncoded())));
        }
        if (asymmetricKeyParameter instanceof PicnicPublicKeyParameters) {
            PicnicPublicKeyParameters picnicPublicKeyParameters = (PicnicPublicKeyParameters) asymmetricKeyParameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(Utils.picnicOidLookup(picnicPublicKeyParameters.getParameters())), new DEROctetString(picnicPublicKeyParameters.getEncoded()));
        }
        if (asymmetricKeyParameter instanceof SIKEPublicKeyParameters) {
            SIKEPublicKeyParameters sIKEPublicKeyParameters = (SIKEPublicKeyParameters) asymmetricKeyParameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(Utils.sikeOidLookup(sIKEPublicKeyParameters.getParameters())), new DEROctetString(sIKEPublicKeyParameters.getEncoded()));
        }
        if (asymmetricKeyParameter instanceof NTRUPublicKeyParameters) {
            NTRUPublicKeyParameters nTRUPublicKeyParameters = (NTRUPublicKeyParameters) asymmetricKeyParameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(Utils.ntruOidLookup(nTRUPublicKeyParameters.getParameters())), new DEROctetString(nTRUPublicKeyParameters.getEncoded()));
        }
        if (asymmetricKeyParameter instanceof FalconPublicKeyParameters) {
            FalconPublicKeyParameters falconPublicKeyParameters = (FalconPublicKeyParameters) asymmetricKeyParameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(Utils.falconOidLookup(falconPublicKeyParameters.getParameters())), new DERSequence(new DEROctetString(falconPublicKeyParameters.getH())));
        }
        if (asymmetricKeyParameter instanceof KyberPublicKeyParameters) {
            KyberPublicKeyParameters kyberPublicKeyParameters = (KyberPublicKeyParameters) asymmetricKeyParameter;
            AlgorithmIdentifier algorithmIdentifier = new AlgorithmIdentifier(Utils.kyberOidLookup(kyberPublicKeyParameters.getParameters()));
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(new DEROctetString(kyberPublicKeyParameters.getT()));
            aSN1EncodableVector.add(new DEROctetString(kyberPublicKeyParameters.getRho()));
            return new SubjectPublicKeyInfo(algorithmIdentifier, new DERSequence(aSN1EncodableVector));
        }
        if (asymmetricKeyParameter instanceof NTRULPRimePublicKeyParameters) {
            NTRULPRimePublicKeyParameters nTRULPRimePublicKeyParameters = (NTRULPRimePublicKeyParameters) asymmetricKeyParameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(Utils.ntrulprimeOidLookup(nTRULPRimePublicKeyParameters.getParameters())), new DEROctetString(nTRULPRimePublicKeyParameters.getEncoded()));
        }
        if (asymmetricKeyParameter instanceof SNTRUPrimePublicKeyParameters) {
            SNTRUPrimePublicKeyParameters sNTRUPrimePublicKeyParameters = (SNTRUPrimePublicKeyParameters) asymmetricKeyParameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(Utils.sntruprimeOidLookup(sNTRUPrimePublicKeyParameters.getParameters())), new DEROctetString(sNTRUPrimePublicKeyParameters.getEncoded()));
        }
        if (asymmetricKeyParameter instanceof DilithiumPublicKeyParameters) {
            DilithiumPublicKeyParameters dilithiumPublicKeyParameters = (DilithiumPublicKeyParameters) asymmetricKeyParameter;
            AlgorithmIdentifier algorithmIdentifier2 = new AlgorithmIdentifier(Utils.dilithiumOidLookup(dilithiumPublicKeyParameters.getParameters()));
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(new DEROctetString(dilithiumPublicKeyParameters.getRho()));
            aSN1EncodableVector2.add(new DEROctetString(dilithiumPublicKeyParameters.getT1()));
            return new SubjectPublicKeyInfo(algorithmIdentifier2, new DERSequence(aSN1EncodableVector2));
        }
        if (asymmetricKeyParameter instanceof BIKEPublicKeyParameters) {
            BIKEPublicKeyParameters bIKEPublicKeyParameters = (BIKEPublicKeyParameters) asymmetricKeyParameter;
            return new SubjectPublicKeyInfo(new AlgorithmIdentifier(Utils.bikeOidLookup(bIKEPublicKeyParameters.getParameters())), new DEROctetString(bIKEPublicKeyParameters.getEncoded()));
        }
        if (!(asymmetricKeyParameter instanceof HQCPublicKeyParameters)) {
            throw new IOException(StubApp.getString2(29379));
        }
        HQCPublicKeyParameters hQCPublicKeyParameters = (HQCPublicKeyParameters) asymmetricKeyParameter;
        return new SubjectPublicKeyInfo(new AlgorithmIdentifier(Utils.hqcOidLookup(hQCPublicKeyParameters.getParameters())), new DEROctetString(hQCPublicKeyParameters.getEncoded()));
    }
}
