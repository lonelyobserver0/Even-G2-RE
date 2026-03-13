package org.bouncycastle.jcajce.provider.symmetric.util;

import com.stub.StubApp;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PBESecretKeyFactory extends BaseSecretKeyFactory implements PBE {
    private int digest;
    private boolean forCipher;
    private int ivSize;
    private int keySize;
    private int scheme;

    public PBESecretKeyFactory(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, int i3, int i10, int i11, int i12) {
        super(str, aSN1ObjectIdentifier);
        this.forCipher = z2;
        this.scheme = i3;
        this.digest = i10;
        this.keySize = i11;
        this.ivSize = i12;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
    public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
        if (!(keySpec instanceof PBEKeySpec)) {
            throw new InvalidKeySpecException(StubApp.getString2(31733));
        }
        PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
        if (pBEKeySpec.getSalt() == null) {
            return new BCPBEKey(this.algName, this.algOid, this.scheme, this.digest, this.keySize, this.ivSize, pBEKeySpec, null);
        }
        return new BCPBEKey(this.algName, this.algOid, this.scheme, this.digest, this.keySize, this.ivSize, pBEKeySpec, this.forCipher ? PBE.Util.makePBEParameters(pBEKeySpec, this.scheme, this.digest, this.keySize, this.ivSize) : PBE.Util.makePBEMacParameters(pBEKeySpec, this.scheme, this.digest, this.keySize));
    }
}
