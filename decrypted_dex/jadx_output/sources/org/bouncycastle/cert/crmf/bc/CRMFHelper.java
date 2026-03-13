package org.bouncycastle.cert.crmf.bc;

import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.cert.crmf.CRMFException;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.util.AlgorithmIdentifierFactory;
import org.bouncycastle.crypto.util.CipherFactory;
import org.bouncycastle.crypto.util.CipherKeyGeneratorFactory;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class CRMFHelper {
    public static Object createContentCipher(boolean z2, CipherParameters cipherParameters, AlgorithmIdentifier algorithmIdentifier) throws CRMFException {
        try {
            return CipherFactory.createContentCipher(z2, cipherParameters, algorithmIdentifier);
        } catch (IllegalArgumentException e10) {
            throw new CRMFException(e10.getMessage(), e10);
        }
    }

    public CipherKeyGenerator createKeyGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier, SecureRandom secureRandom) throws CRMFException {
        try {
            return CipherKeyGeneratorFactory.createKeyGenerator(aSN1ObjectIdentifier, secureRandom);
        } catch (IllegalArgumentException e10) {
            throw new CRMFException(e10.getMessage(), e10);
        }
    }

    public AlgorithmIdentifier generateEncryptionAlgID(ASN1ObjectIdentifier aSN1ObjectIdentifier, KeyParameter keyParameter, SecureRandom secureRandom) throws CRMFException {
        try {
            return AlgorithmIdentifierFactory.generateEncryptionAlgID(aSN1ObjectIdentifier, keyParameter.getKey().length * 8, secureRandom);
        } catch (IllegalArgumentException e10) {
            throw new CRMFException(e10.getMessage(), e10);
        }
    }
}
