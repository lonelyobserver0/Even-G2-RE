package org.bouncycastle.jcajce.provider.symmetric.util;

import com.stub.StubApp;
import i2.u;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.params.SkeinParameters;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.jcajce.spec.SkeinParameterSpec;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BaseMac extends MacSpi implements PBE {
    private static final Class gcmSpecClass = ClassUtil.loadClass(BaseMac.class, StubApp.getString2(29617));
    private int keySize;
    private Mac macEngine;
    private int pbeHash;
    private int scheme;

    public BaseMac(Mac mac) {
        this.scheme = 2;
        this.pbeHash = 1;
        this.keySize = 160;
        this.macEngine = mac;
    }

    private static Hashtable copyMap(Map map) {
        Hashtable hashtable = new Hashtable();
        for (Object obj : map.keySet()) {
            hashtable.put(obj, map.get(obj));
        }
        return hashtable;
    }

    @Override // javax.crypto.MacSpi
    public byte[] engineDoFinal() {
        byte[] bArr = new byte[engineGetMacLength()];
        this.macEngine.doFinal(bArr, 0);
        return bArr;
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return this.macEngine.getMacSize();
    }

    @Override // javax.crypto.MacSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i3;
        CipherParameters makePBEMacParameters;
        if (key == null) {
            throw new InvalidKeyException(StubApp.getString2(32415));
        }
        if (key instanceof PKCS12Key) {
            try {
                SecretKey secretKey = (SecretKey) key;
                try {
                    PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                    if ((secretKey instanceof PBEKey) && pBEParameterSpec == null) {
                        PBEKey pBEKey = (PBEKey) secretKey;
                        pBEParameterSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                    }
                    int i10 = 256;
                    if (this.macEngine.getAlgorithmName().startsWith(StubApp.getString2(32410))) {
                        i3 = 6;
                    } else {
                        Mac mac = this.macEngine;
                        if (!(mac instanceof HMac) || mac.getAlgorithmName().startsWith(StubApp.getString2(5778))) {
                            i3 = 1;
                        } else if (this.macEngine.getAlgorithmName().startsWith(StubApp.getString2(28501))) {
                            i3 = 7;
                            i10 = BERTags.FLAGS;
                        } else if (this.macEngine.getAlgorithmName().startsWith(StubApp.getString2(1488))) {
                            i3 = 4;
                        } else if (this.macEngine.getAlgorithmName().startsWith(StubApp.getString2(23704))) {
                            i3 = 8;
                            i10 = KyberEngine.KyberPolyBytes;
                        } else if (this.macEngine.getAlgorithmName().startsWith(StubApp.getString2(23705))) {
                            i3 = 9;
                            i10 = 512;
                        } else {
                            if (!this.macEngine.getAlgorithmName().startsWith(StubApp.getString2(21747))) {
                                throw new InvalidAlgorithmParameterException(StubApp.getString2(32411) + this.macEngine.getAlgorithmName());
                            }
                            i3 = 2;
                        }
                        i10 = 160;
                    }
                    makePBEMacParameters = PBE.Util.makePBEMacParameters(secretKey, 2, i3, i10, pBEParameterSpec);
                } catch (Exception unused) {
                    throw new InvalidAlgorithmParameterException(StubApp.getString2(32412));
                }
            } catch (Exception unused2) {
                throw new InvalidKeyException(StubApp.getString2(32383));
            }
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (bCPBEKey.getParam() != null) {
                makePBEMacParameters = bCPBEKey.getParam();
            } else {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException(StubApp.getString2(32370));
                }
                makePBEMacParameters = PBE.Util.makePBEMacParameters(bCPBEKey, algorithmParameterSpec);
            }
        } else {
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(32414).concat(algorithmParameterSpec.getClass().getName()));
            }
            makePBEMacParameters = new KeyParameter(key.getEncoded());
        }
        KeyParameter keyParameter = makePBEMacParameters instanceof ParametersWithIV ? (KeyParameter) ((ParametersWithIV) makePBEMacParameters).getParameters() : (KeyParameter) makePBEMacParameters;
        if (algorithmParameterSpec instanceof AEADParameterSpec) {
            AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
            makePBEMacParameters = new AEADParameters(keyParameter, aEADParameterSpec.getMacSizeInBits(), aEADParameterSpec.getNonce(), aEADParameterSpec.getAssociatedData());
        } else if (algorithmParameterSpec instanceof IvParameterSpec) {
            makePBEMacParameters = new ParametersWithIV(keyParameter, ((IvParameterSpec) algorithmParameterSpec).getIV());
        } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
            RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
            makePBEMacParameters = new ParametersWithIV(new RC2Parameters(keyParameter.getKey(), rC2ParameterSpec.getEffectiveKeyBits()), rC2ParameterSpec.getIV());
        } else if (algorithmParameterSpec instanceof SkeinParameterSpec) {
            makePBEMacParameters = new SkeinParameters.Builder(copyMap(((SkeinParameterSpec) algorithmParameterSpec).getParameters())).setKey(keyParameter.getKey()).build();
        } else if (algorithmParameterSpec == null) {
            makePBEMacParameters = new KeyParameter(key.getEncoded());
        } else {
            Class cls = gcmSpecClass;
            if (cls != null && cls.isAssignableFrom(algorithmParameterSpec.getClass())) {
                makePBEMacParameters = GcmSpecUtil.extractAeadParameters(keyParameter, algorithmParameterSpec);
            } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidAlgorithmParameterException(StubApp.getString2(30800).concat(algorithmParameterSpec.getClass().getName()));
            }
        }
        try {
            this.macEngine.init(makePBEMacParameters);
        } catch (Exception e10) {
            throw new InvalidAlgorithmParameterException(u.r(e10, new StringBuilder(StubApp.getString2(32413))));
        }
    }

    @Override // javax.crypto.MacSpi
    public void engineReset() {
        this.macEngine.reset();
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte b2) {
        this.macEngine.update(b2);
    }

    public BaseMac(Mac mac, int i3, int i10, int i11) {
        this.macEngine = mac;
        this.scheme = i3;
        this.pbeHash = i10;
        this.keySize = i11;
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte[] bArr, int i3, int i10) {
        this.macEngine.update(bArr, i3, i10);
    }
}
