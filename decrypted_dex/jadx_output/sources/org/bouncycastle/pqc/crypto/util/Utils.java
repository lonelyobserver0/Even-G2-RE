package org.bouncycastle.pqc.crypto.util;

import com.stub.StubApp;
import i2.u;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.asn1.SPHINCS256KeyParams;
import org.bouncycastle.pqc.crypto.bike.BIKEParameters;
import org.bouncycastle.pqc.crypto.cmce.CMCEParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.pqc.crypto.frodo.FrodoParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUParameters;
import org.bouncycastle.pqc.crypto.ntruprime.NTRULPRimeParameters;
import org.bouncycastle.pqc.crypto.ntruprime.SNTRUPrimeParameters;
import org.bouncycastle.pqc.crypto.picnic.PicnicParameters;
import org.bouncycastle.pqc.crypto.saber.SABERParameters;
import org.bouncycastle.pqc.crypto.sike.SIKEParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusParameters;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Utils {
    static final AlgorithmIdentifier AlgID_qTESLA_p_I;
    static final AlgorithmIdentifier AlgID_qTESLA_p_III;
    static final AlgorithmIdentifier SPHINCS_SHA3_256;
    static final AlgorithmIdentifier SPHINCS_SHA512_256;
    static final AlgorithmIdentifier XMSS_SHA256;
    static final AlgorithmIdentifier XMSS_SHA512;
    static final AlgorithmIdentifier XMSS_SHAKE128;
    static final AlgorithmIdentifier XMSS_SHAKE256;
    static final Map bikeOids;
    static final Map bikeParams;
    static final Map categories;
    static final Map dilithiumOids;
    static final Map dilithiumParams;
    static final Map falconOids;
    static final Map falconParams;
    static final Map frodoOids;
    static final Map frodoParams;
    static final Map hqcOids;
    static final Map hqcParams;
    static final Map kyberOids;
    static final Map kyberParams;
    static final Map mcElieceOids;
    static final Map mcElieceParams;
    static final Map ntruOids;
    static final Map ntruParams;
    static final Map ntruprimeOids;
    static final Map ntruprimeParams;
    static final Map picnicOids;
    static final Map picnicParams;
    static final Map saberOids;
    static final Map saberParams;
    static final Map sikeOids;
    static final Map sikeParams;
    static final Map sntruprimeOids;
    static final Map sntruprimeParams;
    static final Map sphincsPlusOids;
    static final Map sphincsPlusParams;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PQCObjectIdentifiers.qTESLA_p_I;
        AlgID_qTESLA_p_I = new AlgorithmIdentifier(aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PQCObjectIdentifiers.qTESLA_p_III;
        AlgID_qTESLA_p_III = new AlgorithmIdentifier(aSN1ObjectIdentifier2);
        SPHINCS_SHA3_256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha3_256);
        SPHINCS_SHA512_256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512_256);
        XMSS_SHA256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        XMSS_SHA512 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512);
        XMSS_SHAKE128 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_shake128);
        XMSS_SHAKE256 = new AlgorithmIdentifier(NISTObjectIdentifiers.id_shake256);
        HashMap hashMap = new HashMap();
        categories = hashMap;
        HashMap hashMap2 = new HashMap();
        picnicOids = hashMap2;
        HashMap hashMap3 = new HashMap();
        picnicParams = hashMap3;
        HashMap hashMap4 = new HashMap();
        frodoOids = hashMap4;
        HashMap hashMap5 = new HashMap();
        frodoParams = hashMap5;
        HashMap hashMap6 = new HashMap();
        saberOids = hashMap6;
        HashMap hashMap7 = new HashMap();
        saberParams = hashMap7;
        HashMap hashMap8 = new HashMap();
        mcElieceOids = hashMap8;
        HashMap hashMap9 = new HashMap();
        mcElieceParams = hashMap9;
        sphincsPlusOids = new HashMap();
        sphincsPlusParams = new HashMap();
        HashMap hashMap10 = new HashMap();
        sikeOids = hashMap10;
        HashMap hashMap11 = new HashMap();
        sikeParams = hashMap11;
        HashMap hashMap12 = new HashMap();
        ntruOids = hashMap12;
        HashMap hashMap13 = new HashMap();
        ntruParams = hashMap13;
        HashMap hashMap14 = new HashMap();
        falconOids = hashMap14;
        HashMap hashMap15 = new HashMap();
        falconParams = hashMap15;
        HashMap hashMap16 = new HashMap();
        kyberOids = hashMap16;
        HashMap hashMap17 = new HashMap();
        kyberParams = hashMap17;
        HashMap hashMap18 = new HashMap();
        ntruprimeOids = hashMap18;
        HashMap hashMap19 = new HashMap();
        ntruprimeParams = hashMap19;
        HashMap hashMap20 = new HashMap();
        sntruprimeOids = hashMap20;
        HashMap hashMap21 = new HashMap();
        sntruprimeParams = hashMap21;
        HashMap hashMap22 = new HashMap();
        dilithiumOids = hashMap22;
        HashMap hashMap23 = new HashMap();
        dilithiumParams = hashMap23;
        HashMap hashMap24 = new HashMap();
        bikeOids = hashMap24;
        HashMap hashMap25 = new HashMap();
        bikeParams = hashMap25;
        HashMap hashMap26 = new HashMap();
        hqcOids = hashMap26;
        HashMap hashMap27 = new HashMap();
        hqcParams = hashMap27;
        hashMap.put(aSN1ObjectIdentifier, Integers.valueOf(5));
        hashMap.put(aSN1ObjectIdentifier2, Integers.valueOf(6));
        CMCEParameters cMCEParameters = CMCEParameters.mceliece348864r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = BCObjectIdentifiers.mceliece348864_r3;
        hashMap8.put(cMCEParameters, aSN1ObjectIdentifier3);
        CMCEParameters cMCEParameters2 = CMCEParameters.mceliece348864fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = BCObjectIdentifiers.mceliece348864f_r3;
        hashMap8.put(cMCEParameters2, aSN1ObjectIdentifier4);
        CMCEParameters cMCEParameters3 = CMCEParameters.mceliece460896r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = BCObjectIdentifiers.mceliece460896_r3;
        hashMap8.put(cMCEParameters3, aSN1ObjectIdentifier5);
        CMCEParameters cMCEParameters4 = CMCEParameters.mceliece460896fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = BCObjectIdentifiers.mceliece460896f_r3;
        hashMap8.put(cMCEParameters4, aSN1ObjectIdentifier6);
        CMCEParameters cMCEParameters5 = CMCEParameters.mceliece6688128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = BCObjectIdentifiers.mceliece6688128_r3;
        hashMap8.put(cMCEParameters5, aSN1ObjectIdentifier7);
        CMCEParameters cMCEParameters6 = CMCEParameters.mceliece6688128fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = BCObjectIdentifiers.mceliece6688128f_r3;
        hashMap8.put(cMCEParameters6, aSN1ObjectIdentifier8);
        CMCEParameters cMCEParameters7 = CMCEParameters.mceliece6960119r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = BCObjectIdentifiers.mceliece6960119_r3;
        hashMap8.put(cMCEParameters7, aSN1ObjectIdentifier9);
        CMCEParameters cMCEParameters8 = CMCEParameters.mceliece6960119fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = BCObjectIdentifiers.mceliece6960119f_r3;
        hashMap8.put(cMCEParameters8, aSN1ObjectIdentifier10);
        CMCEParameters cMCEParameters9 = CMCEParameters.mceliece8192128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = BCObjectIdentifiers.mceliece8192128_r3;
        hashMap8.put(cMCEParameters9, aSN1ObjectIdentifier11);
        CMCEParameters cMCEParameters10 = CMCEParameters.mceliece8192128fr3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = BCObjectIdentifiers.mceliece8192128f_r3;
        hashMap8.put(cMCEParameters10, aSN1ObjectIdentifier12);
        hashMap9.put(aSN1ObjectIdentifier3, cMCEParameters);
        hashMap9.put(aSN1ObjectIdentifier4, cMCEParameters2);
        hashMap9.put(aSN1ObjectIdentifier5, cMCEParameters3);
        hashMap9.put(aSN1ObjectIdentifier6, cMCEParameters4);
        hashMap9.put(aSN1ObjectIdentifier7, cMCEParameters5);
        hashMap9.put(aSN1ObjectIdentifier8, cMCEParameters6);
        hashMap9.put(aSN1ObjectIdentifier9, cMCEParameters7);
        hashMap9.put(aSN1ObjectIdentifier10, cMCEParameters8);
        hashMap9.put(aSN1ObjectIdentifier11, cMCEParameters9);
        hashMap9.put(aSN1ObjectIdentifier12, cMCEParameters10);
        FrodoParameters frodoParameters = FrodoParameters.frodokem640aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = BCObjectIdentifiers.frodokem640aes;
        hashMap4.put(frodoParameters, aSN1ObjectIdentifier13);
        FrodoParameters frodoParameters2 = FrodoParameters.frodokem640shake;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = BCObjectIdentifiers.frodokem640shake;
        hashMap4.put(frodoParameters2, aSN1ObjectIdentifier14);
        FrodoParameters frodoParameters3 = FrodoParameters.frodokem976aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = BCObjectIdentifiers.frodokem976aes;
        hashMap4.put(frodoParameters3, aSN1ObjectIdentifier15);
        FrodoParameters frodoParameters4 = FrodoParameters.frodokem976shake;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = BCObjectIdentifiers.frodokem976shake;
        hashMap4.put(frodoParameters4, aSN1ObjectIdentifier16);
        FrodoParameters frodoParameters5 = FrodoParameters.frodokem1344aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = BCObjectIdentifiers.frodokem1344aes;
        hashMap4.put(frodoParameters5, aSN1ObjectIdentifier17);
        FrodoParameters frodoParameters6 = FrodoParameters.frodokem1344shake;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = BCObjectIdentifiers.frodokem1344shake;
        hashMap4.put(frodoParameters6, aSN1ObjectIdentifier18);
        hashMap5.put(aSN1ObjectIdentifier13, frodoParameters);
        hashMap5.put(aSN1ObjectIdentifier14, frodoParameters2);
        hashMap5.put(aSN1ObjectIdentifier15, frodoParameters3);
        hashMap5.put(aSN1ObjectIdentifier16, frodoParameters4);
        hashMap5.put(aSN1ObjectIdentifier17, frodoParameters5);
        hashMap5.put(aSN1ObjectIdentifier18, frodoParameters6);
        SABERParameters sABERParameters = SABERParameters.lightsaberkem128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = BCObjectIdentifiers.lightsaberkem128r3;
        hashMap6.put(sABERParameters, aSN1ObjectIdentifier19);
        SABERParameters sABERParameters2 = SABERParameters.saberkem128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = BCObjectIdentifiers.saberkem128r3;
        hashMap6.put(sABERParameters2, aSN1ObjectIdentifier20);
        SABERParameters sABERParameters3 = SABERParameters.firesaberkem128r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = BCObjectIdentifiers.firesaberkem128r3;
        hashMap6.put(sABERParameters3, aSN1ObjectIdentifier21);
        SABERParameters sABERParameters4 = SABERParameters.lightsaberkem192r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = BCObjectIdentifiers.lightsaberkem192r3;
        hashMap6.put(sABERParameters4, aSN1ObjectIdentifier22);
        SABERParameters sABERParameters5 = SABERParameters.saberkem192r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = BCObjectIdentifiers.saberkem192r3;
        hashMap6.put(sABERParameters5, aSN1ObjectIdentifier23);
        SABERParameters sABERParameters6 = SABERParameters.firesaberkem192r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = BCObjectIdentifiers.firesaberkem192r3;
        hashMap6.put(sABERParameters6, aSN1ObjectIdentifier24);
        SABERParameters sABERParameters7 = SABERParameters.lightsaberkem256r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier25 = BCObjectIdentifiers.lightsaberkem256r3;
        hashMap6.put(sABERParameters7, aSN1ObjectIdentifier25);
        SABERParameters sABERParameters8 = SABERParameters.saberkem256r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier26 = BCObjectIdentifiers.saberkem256r3;
        hashMap6.put(sABERParameters8, aSN1ObjectIdentifier26);
        SABERParameters sABERParameters9 = SABERParameters.firesaberkem256r3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier27 = BCObjectIdentifiers.firesaberkem256r3;
        hashMap6.put(sABERParameters9, aSN1ObjectIdentifier27);
        hashMap7.put(aSN1ObjectIdentifier19, sABERParameters);
        hashMap7.put(aSN1ObjectIdentifier20, sABERParameters2);
        hashMap7.put(aSN1ObjectIdentifier21, sABERParameters3);
        hashMap7.put(aSN1ObjectIdentifier22, sABERParameters4);
        hashMap7.put(aSN1ObjectIdentifier23, sABERParameters5);
        hashMap7.put(aSN1ObjectIdentifier24, sABERParameters6);
        hashMap7.put(aSN1ObjectIdentifier25, sABERParameters7);
        hashMap7.put(aSN1ObjectIdentifier26, sABERParameters8);
        hashMap7.put(aSN1ObjectIdentifier27, sABERParameters9);
        PicnicParameters picnicParameters = PicnicParameters.picnicl1fs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier28 = BCObjectIdentifiers.picnicl1fs;
        hashMap2.put(picnicParameters, aSN1ObjectIdentifier28);
        PicnicParameters picnicParameters2 = PicnicParameters.picnicl1ur;
        ASN1ObjectIdentifier aSN1ObjectIdentifier29 = BCObjectIdentifiers.picnicl1ur;
        hashMap2.put(picnicParameters2, aSN1ObjectIdentifier29);
        PicnicParameters picnicParameters3 = PicnicParameters.picnicl3fs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier30 = BCObjectIdentifiers.picnicl3fs;
        hashMap2.put(picnicParameters3, aSN1ObjectIdentifier30);
        PicnicParameters picnicParameters4 = PicnicParameters.picnicl3ur;
        ASN1ObjectIdentifier aSN1ObjectIdentifier31 = BCObjectIdentifiers.picnicl3ur;
        hashMap2.put(picnicParameters4, aSN1ObjectIdentifier31);
        PicnicParameters picnicParameters5 = PicnicParameters.picnicl5fs;
        ASN1ObjectIdentifier aSN1ObjectIdentifier32 = BCObjectIdentifiers.picnicl5fs;
        hashMap2.put(picnicParameters5, aSN1ObjectIdentifier32);
        PicnicParameters picnicParameters6 = PicnicParameters.picnicl5ur;
        ASN1ObjectIdentifier aSN1ObjectIdentifier33 = BCObjectIdentifiers.picnicl5ur;
        hashMap2.put(picnicParameters6, aSN1ObjectIdentifier33);
        PicnicParameters picnicParameters7 = PicnicParameters.picnic3l1;
        ASN1ObjectIdentifier aSN1ObjectIdentifier34 = BCObjectIdentifiers.picnic3l1;
        hashMap2.put(picnicParameters7, aSN1ObjectIdentifier34);
        PicnicParameters picnicParameters8 = PicnicParameters.picnic3l3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier35 = BCObjectIdentifiers.picnic3l3;
        hashMap2.put(picnicParameters8, aSN1ObjectIdentifier35);
        PicnicParameters picnicParameters9 = PicnicParameters.picnic3l5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier36 = BCObjectIdentifiers.picnic3l5;
        hashMap2.put(picnicParameters9, aSN1ObjectIdentifier36);
        PicnicParameters picnicParameters10 = PicnicParameters.picnicl1full;
        ASN1ObjectIdentifier aSN1ObjectIdentifier37 = BCObjectIdentifiers.picnicl1full;
        hashMap2.put(picnicParameters10, aSN1ObjectIdentifier37);
        PicnicParameters picnicParameters11 = PicnicParameters.picnicl3full;
        ASN1ObjectIdentifier aSN1ObjectIdentifier38 = BCObjectIdentifiers.picnicl3full;
        hashMap2.put(picnicParameters11, aSN1ObjectIdentifier38);
        PicnicParameters picnicParameters12 = PicnicParameters.picnicl5full;
        ASN1ObjectIdentifier aSN1ObjectIdentifier39 = BCObjectIdentifiers.picnicl5full;
        hashMap2.put(picnicParameters12, aSN1ObjectIdentifier39);
        hashMap3.put(aSN1ObjectIdentifier28, picnicParameters);
        hashMap3.put(aSN1ObjectIdentifier29, picnicParameters2);
        hashMap3.put(aSN1ObjectIdentifier30, picnicParameters3);
        hashMap3.put(aSN1ObjectIdentifier31, picnicParameters4);
        hashMap3.put(aSN1ObjectIdentifier32, picnicParameters5);
        hashMap3.put(aSN1ObjectIdentifier33, picnicParameters6);
        hashMap3.put(aSN1ObjectIdentifier34, picnicParameters7);
        hashMap3.put(aSN1ObjectIdentifier35, picnicParameters8);
        hashMap3.put(aSN1ObjectIdentifier36, picnicParameters9);
        hashMap3.put(aSN1ObjectIdentifier37, picnicParameters10);
        hashMap3.put(aSN1ObjectIdentifier38, picnicParameters11);
        hashMap3.put(aSN1ObjectIdentifier39, picnicParameters12);
        SIKEParameters sIKEParameters = SIKEParameters.sikep434;
        ASN1ObjectIdentifier aSN1ObjectIdentifier40 = BCObjectIdentifiers.sikep434;
        hashMap10.put(sIKEParameters, aSN1ObjectIdentifier40);
        SIKEParameters sIKEParameters2 = SIKEParameters.sikep503;
        ASN1ObjectIdentifier aSN1ObjectIdentifier41 = BCObjectIdentifiers.sikep503;
        hashMap10.put(sIKEParameters2, aSN1ObjectIdentifier41);
        SIKEParameters sIKEParameters3 = SIKEParameters.sikep610;
        ASN1ObjectIdentifier aSN1ObjectIdentifier42 = BCObjectIdentifiers.sikep610;
        hashMap10.put(sIKEParameters3, aSN1ObjectIdentifier42);
        SIKEParameters sIKEParameters4 = SIKEParameters.sikep751;
        ASN1ObjectIdentifier aSN1ObjectIdentifier43 = BCObjectIdentifiers.sikep751;
        hashMap10.put(sIKEParameters4, aSN1ObjectIdentifier43);
        SIKEParameters sIKEParameters5 = SIKEParameters.sikep434_compressed;
        ASN1ObjectIdentifier aSN1ObjectIdentifier44 = BCObjectIdentifiers.sikep434_compressed;
        hashMap10.put(sIKEParameters5, aSN1ObjectIdentifier44);
        SIKEParameters sIKEParameters6 = SIKEParameters.sikep503_compressed;
        ASN1ObjectIdentifier aSN1ObjectIdentifier45 = BCObjectIdentifiers.sikep503_compressed;
        hashMap10.put(sIKEParameters6, aSN1ObjectIdentifier45);
        SIKEParameters sIKEParameters7 = SIKEParameters.sikep610_compressed;
        ASN1ObjectIdentifier aSN1ObjectIdentifier46 = BCObjectIdentifiers.sikep610_compressed;
        hashMap10.put(sIKEParameters7, aSN1ObjectIdentifier46);
        SIKEParameters sIKEParameters8 = SIKEParameters.sikep751_compressed;
        ASN1ObjectIdentifier aSN1ObjectIdentifier47 = BCObjectIdentifiers.sikep751_compressed;
        hashMap10.put(sIKEParameters8, aSN1ObjectIdentifier47);
        hashMap11.put(aSN1ObjectIdentifier40, sIKEParameters);
        hashMap11.put(aSN1ObjectIdentifier41, sIKEParameters2);
        hashMap11.put(aSN1ObjectIdentifier42, sIKEParameters3);
        hashMap11.put(aSN1ObjectIdentifier43, sIKEParameters4);
        hashMap11.put(aSN1ObjectIdentifier44, sIKEParameters5);
        hashMap11.put(aSN1ObjectIdentifier45, sIKEParameters6);
        hashMap11.put(aSN1ObjectIdentifier46, sIKEParameters7);
        hashMap11.put(aSN1ObjectIdentifier47, sIKEParameters8);
        NTRUParameters nTRUParameters = NTRUParameters.ntruhps2048509;
        ASN1ObjectIdentifier aSN1ObjectIdentifier48 = BCObjectIdentifiers.ntruhps2048509;
        hashMap12.put(nTRUParameters, aSN1ObjectIdentifier48);
        NTRUParameters nTRUParameters2 = NTRUParameters.ntruhps2048677;
        ASN1ObjectIdentifier aSN1ObjectIdentifier49 = BCObjectIdentifiers.ntruhps2048677;
        hashMap12.put(nTRUParameters2, aSN1ObjectIdentifier49);
        NTRUParameters nTRUParameters3 = NTRUParameters.ntruhps4096821;
        ASN1ObjectIdentifier aSN1ObjectIdentifier50 = BCObjectIdentifiers.ntruhps4096821;
        hashMap12.put(nTRUParameters3, aSN1ObjectIdentifier50);
        NTRUParameters nTRUParameters4 = NTRUParameters.ntruhrss701;
        ASN1ObjectIdentifier aSN1ObjectIdentifier51 = BCObjectIdentifiers.ntruhrss701;
        hashMap12.put(nTRUParameters4, aSN1ObjectIdentifier51);
        hashMap13.put(aSN1ObjectIdentifier48, nTRUParameters);
        hashMap13.put(aSN1ObjectIdentifier49, nTRUParameters2);
        hashMap13.put(aSN1ObjectIdentifier50, nTRUParameters3);
        hashMap13.put(aSN1ObjectIdentifier51, nTRUParameters4);
        FalconParameters falconParameters = FalconParameters.falcon_512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier52 = BCObjectIdentifiers.falcon_512;
        hashMap14.put(falconParameters, aSN1ObjectIdentifier52);
        FalconParameters falconParameters2 = FalconParameters.falcon_1024;
        ASN1ObjectIdentifier aSN1ObjectIdentifier53 = BCObjectIdentifiers.falcon_1024;
        hashMap14.put(falconParameters2, aSN1ObjectIdentifier53);
        hashMap15.put(aSN1ObjectIdentifier52, falconParameters);
        hashMap15.put(aSN1ObjectIdentifier53, falconParameters2);
        KyberParameters kyberParameters = KyberParameters.kyber512;
        ASN1ObjectIdentifier aSN1ObjectIdentifier54 = BCObjectIdentifiers.kyber512;
        hashMap16.put(kyberParameters, aSN1ObjectIdentifier54);
        KyberParameters kyberParameters2 = KyberParameters.kyber768;
        ASN1ObjectIdentifier aSN1ObjectIdentifier55 = BCObjectIdentifiers.kyber768;
        hashMap16.put(kyberParameters2, aSN1ObjectIdentifier55);
        KyberParameters kyberParameters3 = KyberParameters.kyber1024;
        ASN1ObjectIdentifier aSN1ObjectIdentifier56 = BCObjectIdentifiers.kyber1024;
        hashMap16.put(kyberParameters3, aSN1ObjectIdentifier56);
        KyberParameters kyberParameters4 = KyberParameters.kyber512_aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier57 = BCObjectIdentifiers.kyber512_aes;
        hashMap16.put(kyberParameters4, aSN1ObjectIdentifier57);
        KyberParameters kyberParameters5 = KyberParameters.kyber768_aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier58 = BCObjectIdentifiers.kyber768_aes;
        hashMap16.put(kyberParameters5, aSN1ObjectIdentifier58);
        KyberParameters kyberParameters6 = KyberParameters.kyber1024_aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier59 = BCObjectIdentifiers.kyber1024_aes;
        hashMap16.put(kyberParameters6, aSN1ObjectIdentifier59);
        hashMap17.put(aSN1ObjectIdentifier54, kyberParameters);
        hashMap17.put(aSN1ObjectIdentifier55, kyberParameters2);
        hashMap17.put(aSN1ObjectIdentifier56, kyberParameters3);
        hashMap17.put(aSN1ObjectIdentifier57, kyberParameters4);
        hashMap17.put(aSN1ObjectIdentifier58, kyberParameters5);
        hashMap17.put(aSN1ObjectIdentifier59, kyberParameters6);
        NTRULPRimeParameters nTRULPRimeParameters = NTRULPRimeParameters.ntrulpr653;
        ASN1ObjectIdentifier aSN1ObjectIdentifier60 = BCObjectIdentifiers.ntrulpr653;
        hashMap18.put(nTRULPRimeParameters, aSN1ObjectIdentifier60);
        NTRULPRimeParameters nTRULPRimeParameters2 = NTRULPRimeParameters.ntrulpr761;
        ASN1ObjectIdentifier aSN1ObjectIdentifier61 = BCObjectIdentifiers.ntrulpr761;
        hashMap18.put(nTRULPRimeParameters2, aSN1ObjectIdentifier61);
        NTRULPRimeParameters nTRULPRimeParameters3 = NTRULPRimeParameters.ntrulpr857;
        ASN1ObjectIdentifier aSN1ObjectIdentifier62 = BCObjectIdentifiers.ntrulpr857;
        hashMap18.put(nTRULPRimeParameters3, aSN1ObjectIdentifier62);
        NTRULPRimeParameters nTRULPRimeParameters4 = NTRULPRimeParameters.ntrulpr953;
        ASN1ObjectIdentifier aSN1ObjectIdentifier63 = BCObjectIdentifiers.ntrulpr953;
        hashMap18.put(nTRULPRimeParameters4, aSN1ObjectIdentifier63);
        NTRULPRimeParameters nTRULPRimeParameters5 = NTRULPRimeParameters.ntrulpr1013;
        ASN1ObjectIdentifier aSN1ObjectIdentifier64 = BCObjectIdentifiers.ntrulpr1013;
        hashMap18.put(nTRULPRimeParameters5, aSN1ObjectIdentifier64);
        NTRULPRimeParameters nTRULPRimeParameters6 = NTRULPRimeParameters.ntrulpr1277;
        ASN1ObjectIdentifier aSN1ObjectIdentifier65 = BCObjectIdentifiers.ntrulpr1277;
        hashMap18.put(nTRULPRimeParameters6, aSN1ObjectIdentifier65);
        hashMap19.put(aSN1ObjectIdentifier60, nTRULPRimeParameters);
        hashMap19.put(aSN1ObjectIdentifier61, nTRULPRimeParameters2);
        hashMap19.put(aSN1ObjectIdentifier62, nTRULPRimeParameters3);
        hashMap19.put(aSN1ObjectIdentifier63, nTRULPRimeParameters4);
        hashMap19.put(aSN1ObjectIdentifier64, nTRULPRimeParameters5);
        hashMap19.put(aSN1ObjectIdentifier65, nTRULPRimeParameters6);
        SNTRUPrimeParameters sNTRUPrimeParameters = SNTRUPrimeParameters.sntrup653;
        ASN1ObjectIdentifier aSN1ObjectIdentifier66 = BCObjectIdentifiers.sntrup653;
        hashMap20.put(sNTRUPrimeParameters, aSN1ObjectIdentifier66);
        SNTRUPrimeParameters sNTRUPrimeParameters2 = SNTRUPrimeParameters.sntrup761;
        ASN1ObjectIdentifier aSN1ObjectIdentifier67 = BCObjectIdentifiers.sntrup761;
        hashMap20.put(sNTRUPrimeParameters2, aSN1ObjectIdentifier67);
        SNTRUPrimeParameters sNTRUPrimeParameters3 = SNTRUPrimeParameters.sntrup857;
        ASN1ObjectIdentifier aSN1ObjectIdentifier68 = BCObjectIdentifiers.sntrup857;
        hashMap20.put(sNTRUPrimeParameters3, aSN1ObjectIdentifier68);
        SNTRUPrimeParameters sNTRUPrimeParameters4 = SNTRUPrimeParameters.sntrup953;
        ASN1ObjectIdentifier aSN1ObjectIdentifier69 = BCObjectIdentifiers.sntrup953;
        hashMap20.put(sNTRUPrimeParameters4, aSN1ObjectIdentifier69);
        SNTRUPrimeParameters sNTRUPrimeParameters5 = SNTRUPrimeParameters.sntrup1013;
        ASN1ObjectIdentifier aSN1ObjectIdentifier70 = BCObjectIdentifiers.sntrup1013;
        hashMap20.put(sNTRUPrimeParameters5, aSN1ObjectIdentifier70);
        SNTRUPrimeParameters sNTRUPrimeParameters6 = SNTRUPrimeParameters.sntrup1277;
        ASN1ObjectIdentifier aSN1ObjectIdentifier71 = BCObjectIdentifiers.sntrup1277;
        hashMap20.put(sNTRUPrimeParameters6, aSN1ObjectIdentifier71);
        hashMap21.put(aSN1ObjectIdentifier66, sNTRUPrimeParameters);
        hashMap21.put(aSN1ObjectIdentifier67, sNTRUPrimeParameters2);
        hashMap21.put(aSN1ObjectIdentifier68, sNTRUPrimeParameters3);
        hashMap21.put(aSN1ObjectIdentifier69, sNTRUPrimeParameters4);
        hashMap21.put(aSN1ObjectIdentifier70, sNTRUPrimeParameters5);
        hashMap21.put(aSN1ObjectIdentifier71, sNTRUPrimeParameters6);
        DilithiumParameters dilithiumParameters = DilithiumParameters.dilithium2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier72 = BCObjectIdentifiers.dilithium2;
        hashMap22.put(dilithiumParameters, aSN1ObjectIdentifier72);
        DilithiumParameters dilithiumParameters2 = DilithiumParameters.dilithium3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier73 = BCObjectIdentifiers.dilithium3;
        hashMap22.put(dilithiumParameters2, aSN1ObjectIdentifier73);
        DilithiumParameters dilithiumParameters3 = DilithiumParameters.dilithium5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier74 = BCObjectIdentifiers.dilithium5;
        hashMap22.put(dilithiumParameters3, aSN1ObjectIdentifier74);
        DilithiumParameters dilithiumParameters4 = DilithiumParameters.dilithium2_aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier75 = BCObjectIdentifiers.dilithium2_aes;
        hashMap22.put(dilithiumParameters4, aSN1ObjectIdentifier75);
        DilithiumParameters dilithiumParameters5 = DilithiumParameters.dilithium3_aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier76 = BCObjectIdentifiers.dilithium3_aes;
        hashMap22.put(dilithiumParameters5, aSN1ObjectIdentifier76);
        DilithiumParameters dilithiumParameters6 = DilithiumParameters.dilithium5_aes;
        ASN1ObjectIdentifier aSN1ObjectIdentifier77 = BCObjectIdentifiers.dilithium5_aes;
        hashMap22.put(dilithiumParameters6, aSN1ObjectIdentifier77);
        hashMap23.put(aSN1ObjectIdentifier72, dilithiumParameters);
        hashMap23.put(aSN1ObjectIdentifier73, dilithiumParameters2);
        hashMap23.put(aSN1ObjectIdentifier74, dilithiumParameters3);
        hashMap23.put(aSN1ObjectIdentifier75, dilithiumParameters4);
        hashMap23.put(aSN1ObjectIdentifier76, dilithiumParameters5);
        hashMap23.put(aSN1ObjectIdentifier77, dilithiumParameters6);
        ASN1ObjectIdentifier aSN1ObjectIdentifier78 = BCObjectIdentifiers.bike128;
        BIKEParameters bIKEParameters = BIKEParameters.bike128;
        hashMap25.put(aSN1ObjectIdentifier78, bIKEParameters);
        ASN1ObjectIdentifier aSN1ObjectIdentifier79 = BCObjectIdentifiers.bike192;
        BIKEParameters bIKEParameters2 = BIKEParameters.bike192;
        hashMap25.put(aSN1ObjectIdentifier79, bIKEParameters2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier80 = BCObjectIdentifiers.bike256;
        BIKEParameters bIKEParameters3 = BIKEParameters.bike256;
        hashMap25.put(aSN1ObjectIdentifier80, bIKEParameters3);
        hashMap24.put(bIKEParameters, aSN1ObjectIdentifier78);
        hashMap24.put(bIKEParameters2, aSN1ObjectIdentifier79);
        hashMap24.put(bIKEParameters3, aSN1ObjectIdentifier80);
        ASN1ObjectIdentifier aSN1ObjectIdentifier81 = BCObjectIdentifiers.hqc128;
        HQCParameters hQCParameters = HQCParameters.hqc128;
        hashMap27.put(aSN1ObjectIdentifier81, hQCParameters);
        ASN1ObjectIdentifier aSN1ObjectIdentifier82 = BCObjectIdentifiers.hqc192;
        HQCParameters hQCParameters2 = HQCParameters.hqc192;
        hashMap27.put(aSN1ObjectIdentifier82, hQCParameters2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier83 = BCObjectIdentifiers.hqc256;
        HQCParameters hQCParameters3 = HQCParameters.hqc256;
        hashMap27.put(aSN1ObjectIdentifier83, hQCParameters3);
        hashMap26.put(hQCParameters, aSN1ObjectIdentifier81);
        hashMap26.put(hQCParameters2, aSN1ObjectIdentifier82);
        hashMap26.put(hQCParameters3, aSN1ObjectIdentifier83);
    }

    public static ASN1ObjectIdentifier bikeOidLookup(BIKEParameters bIKEParameters) {
        return (ASN1ObjectIdentifier) bikeOids.get(bIKEParameters);
    }

    public static BIKEParameters bikeParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (BIKEParameters) bikeParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier dilithiumOidLookup(DilithiumParameters dilithiumParameters) {
        return (ASN1ObjectIdentifier) dilithiumOids.get(dilithiumParameters);
    }

    public static DilithiumParameters dilithiumParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (DilithiumParameters) dilithiumParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier falconOidLookup(FalconParameters falconParameters) {
        return (ASN1ObjectIdentifier) falconOids.get(falconParameters);
    }

    public static FalconParameters falconParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (FalconParameters) falconParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier frodoOidLookup(FrodoParameters frodoParameters) {
        return (ASN1ObjectIdentifier) frodoOids.get(frodoParameters);
    }

    public static FrodoParameters frodoParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (FrodoParameters) frodoParams.get(aSN1ObjectIdentifier);
    }

    public static AlgorithmIdentifier getAlgorithmIdentifier(String str) {
        if (str.equals(StubApp.getString2(5778))) {
            return new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);
        }
        if (str.equals(StubApp.getString2(28501))) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha224);
        }
        if (str.equals(StubApp.getString2(1488))) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha256);
        }
        if (str.equals(StubApp.getString2(23704))) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha384);
        }
        if (str.equals(StubApp.getString2(23705))) {
            return new AlgorithmIdentifier(NISTObjectIdentifiers.id_sha512);
        }
        throw new IllegalArgumentException(StubApp.getString2(34236).concat(str));
    }

    public static Digest getDigest(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return new SHA256Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return new SHA512Digest();
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake128)) {
            return new SHAKEDigest(128);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_shake256)) {
            return new SHAKEDigest(256);
        }
        throw new IllegalArgumentException(a.e(StubApp.getString2(34023), aSN1ObjectIdentifier));
    }

    public static String getDigestName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) OIWObjectIdentifiers.idSHA1)) {
            return StubApp.getString2(5778);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha224)) {
            return StubApp.getString2(28501);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha256)) {
            return StubApp.getString2(1488);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha384)) {
            return StubApp.getString2(23704);
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_sha512)) {
            return StubApp.getString2(23705);
        }
        throw new IllegalArgumentException(a.e(StubApp.getString2(34236), aSN1ObjectIdentifier));
    }

    public static ASN1ObjectIdentifier hqcOidLookup(HQCParameters hQCParameters) {
        return (ASN1ObjectIdentifier) hqcOids.get(hQCParameters);
    }

    public static HQCParameters hqcParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (HQCParameters) hqcParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier kyberOidLookup(KyberParameters kyberParameters) {
        return (ASN1ObjectIdentifier) kyberOids.get(kyberParameters);
    }

    public static KyberParameters kyberParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (KyberParameters) kyberParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier mcElieceOidLookup(CMCEParameters cMCEParameters) {
        return (ASN1ObjectIdentifier) mcElieceOids.get(cMCEParameters);
    }

    public static CMCEParameters mcElieceParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (CMCEParameters) mcElieceParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier ntruOidLookup(NTRUParameters nTRUParameters) {
        return (ASN1ObjectIdentifier) ntruOids.get(nTRUParameters);
    }

    public static NTRUParameters ntruParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (NTRUParameters) ntruParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier ntrulprimeOidLookup(NTRULPRimeParameters nTRULPRimeParameters) {
        return (ASN1ObjectIdentifier) ntruprimeOids.get(nTRULPRimeParameters);
    }

    public static NTRULPRimeParameters ntrulprimeParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (NTRULPRimeParameters) ntruprimeParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier picnicOidLookup(PicnicParameters picnicParameters) {
        return (ASN1ObjectIdentifier) picnicOids.get(picnicParameters);
    }

    public static PicnicParameters picnicParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (PicnicParameters) picnicParams.get(aSN1ObjectIdentifier);
    }

    public static AlgorithmIdentifier qTeslaLookupAlgID(int i3) {
        if (i3 == 5) {
            return AlgID_qTESLA_p_I;
        }
        if (i3 == 6) {
            return AlgID_qTESLA_p_III;
        }
        throw new IllegalArgumentException(u.p(i3, StubApp.getString2(34237)));
    }

    public static int qTeslaLookupSecurityCategory(AlgorithmIdentifier algorithmIdentifier) {
        return ((Integer) categories.get(algorithmIdentifier.getAlgorithm())).intValue();
    }

    public static ASN1ObjectIdentifier saberOidLookup(SABERParameters sABERParameters) {
        return (ASN1ObjectIdentifier) saberOids.get(sABERParameters);
    }

    public static SABERParameters saberParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SABERParameters) saberParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier sikeOidLookup(SIKEParameters sIKEParameters) {
        return (ASN1ObjectIdentifier) sikeOids.get(sIKEParameters);
    }

    public static SIKEParameters sikeParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SIKEParameters) sikeParams.get(aSN1ObjectIdentifier);
    }

    public static ASN1ObjectIdentifier sntruprimeOidLookup(SNTRUPrimeParameters sNTRUPrimeParameters) {
        return (ASN1ObjectIdentifier) sntruprimeOids.get(sNTRUPrimeParameters);
    }

    public static SNTRUPrimeParameters sntruprimeParamsLookup(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (SNTRUPrimeParameters) sntruprimeParams.get(aSN1ObjectIdentifier);
    }

    public static AlgorithmIdentifier sphincs256LookupTreeAlgID(String str) {
        if (str.equals(StubApp.getString2(28175))) {
            return SPHINCS_SHA3_256;
        }
        if (str.equals(StubApp.getString2(29285))) {
            return SPHINCS_SHA512_256;
        }
        throw new IllegalArgumentException(StubApp.getString2(34238).concat(str));
    }

    public static String sphincs256LookupTreeAlgName(SPHINCS256KeyParams sPHINCS256KeyParams) {
        AlgorithmIdentifier treeDigest = sPHINCS256KeyParams.getTreeDigest();
        if (treeDigest.getAlgorithm().equals((ASN1Primitive) SPHINCS_SHA3_256.getAlgorithm())) {
            return StubApp.getString2(28175);
        }
        if (treeDigest.getAlgorithm().equals((ASN1Primitive) SPHINCS_SHA512_256.getAlgorithm())) {
            return StubApp.getString2(29285);
        }
        throw new IllegalArgumentException(StubApp.getString2(34238) + treeDigest.getAlgorithm());
    }

    public static ASN1ObjectIdentifier sphincsPlusOidLookup(SPHINCSPlusParameters sPHINCSPlusParameters) {
        int intValue = SPHINCSPlusParameters.getID(sPHINCSPlusParameters).intValue();
        int i3 = intValue & 196608;
        return i3 == 196608 ? BCObjectIdentifiers.sphincsPlus_haraka : i3 == 131072 ? BCObjectIdentifiers.sphincsPlus_shake_256 : ((intValue & 5) == 5 || (intValue & 6) == 6) ? BCObjectIdentifiers.sphincsPlus_sha_512 : BCObjectIdentifiers.sphincsPlus_sha_256;
    }

    public static AlgorithmIdentifier xmssLookupTreeAlgID(String str) {
        if (str.equals(StubApp.getString2(1488))) {
            return XMSS_SHA256;
        }
        if (str.equals(StubApp.getString2(23705))) {
            return XMSS_SHA512;
        }
        if (str.equals(StubApp.getString2(28183))) {
            return XMSS_SHAKE128;
        }
        if (str.equals(StubApp.getString2(28184))) {
            return XMSS_SHAKE256;
        }
        throw new IllegalArgumentException(StubApp.getString2(34238).concat(str));
    }
}
