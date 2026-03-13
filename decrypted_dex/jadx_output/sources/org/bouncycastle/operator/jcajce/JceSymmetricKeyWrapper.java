package org.bouncycastle.operator.jcajce;

import com.stub.StubApp;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.operator.SymmetricKeyWrapper;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JceSymmetricKeyWrapper extends SymmetricKeyWrapper {
    private OperatorHelper helper;
    private SecureRandom random;
    private SecretKey wrappingKey;

    public JceSymmetricKeyWrapper(SecretKey secretKey) {
        super(determineKeyEncAlg(secretKey));
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.wrappingKey = secretKey;
    }

    public static AlgorithmIdentifier determineKeyEncAlg(String str, int i3) {
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2;
        if (str.startsWith(StubApp.getString2(28171)) || str.startsWith(StubApp.getString2(33869))) {
            return new AlgorithmIdentifier(PKCSObjectIdentifiers.id_alg_CMS3DESwrap, DERNull.INSTANCE);
        }
        if (str.startsWith(StubApp.getString2(28256))) {
            return new AlgorithmIdentifier(new ASN1ObjectIdentifier(StubApp.getString2(33870)), new ASN1Integer(58L));
        }
        if (str.startsWith(StubApp.getString2(461))) {
            if (i3 == 128) {
                aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes128_wrap;
            } else if (i3 == 192) {
                aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes192_wrap;
            } else {
                if (i3 != 256) {
                    throw new IllegalArgumentException(StubApp.getString2(33837));
                }
                aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_aes256_wrap;
            }
            return new AlgorithmIdentifier(aSN1ObjectIdentifier2);
        }
        if (str.startsWith(StubApp.getString2(28259))) {
            return new AlgorithmIdentifier(KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap);
        }
        if (!str.startsWith(StubApp.getString2(28258))) {
            throw new IllegalArgumentException(StubApp.getString2(33871));
        }
        if (i3 == 128) {
            aSN1ObjectIdentifier = NTTObjectIdentifiers.id_camellia128_wrap;
        } else if (i3 == 192) {
            aSN1ObjectIdentifier = NTTObjectIdentifiers.id_camellia192_wrap;
        } else {
            if (i3 != 256) {
                throw new IllegalArgumentException(StubApp.getString2(33843));
            }
            aSN1ObjectIdentifier = NTTObjectIdentifiers.id_camellia256_wrap;
        }
        return new AlgorithmIdentifier(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.operator.KeyWrapper
    public byte[] generateWrappedKey(GenericKey genericKey) throws OperatorException {
        Key jceKey = OperatorUtils.getJceKey(genericKey);
        Cipher createSymmetricWrapper = this.helper.createSymmetricWrapper(getAlgorithmIdentifier().getAlgorithm());
        try {
            createSymmetricWrapper.init(3, this.wrappingKey, this.random);
            return createSymmetricWrapper.wrap(jceKey);
        } catch (GeneralSecurityException e10) {
            throw new OperatorException(a.h(e10, new StringBuilder(StubApp.getString2(28034))), e10);
        }
    }

    public JceSymmetricKeyWrapper setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JceSymmetricKeyWrapper setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    private static AlgorithmIdentifier determineKeyEncAlg(SecretKey secretKey) {
        return determineKeyEncAlg(secretKey.getAlgorithm(), secretKey.getEncoded().length * 8);
    }

    public JceSymmetricKeyWrapper setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }
}
