package org.bouncycastle.pkcs.jcajce;

import com.stub.StubApp;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Hashtable;
import org.bouncycastle.asn1.pkcs.CertificationRequest;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaPKCS10CertificationRequest extends PKCS10CertificationRequest {
    private static Hashtable keyAlgorithms;
    private JcaJceHelper helper;

    static {
        Hashtable hashtable = new Hashtable();
        keyAlgorithms = hashtable;
        hashtable.put(PKCSObjectIdentifiers.rsaEncryption, StubApp.getString2(24659));
        keyAlgorithms.put(X9ObjectIdentifiers.id_dsa, StubApp.getString2(28060));
    }

    public JcaPKCS10CertificationRequest(CertificationRequest certificationRequest) {
        super(certificationRequest);
        this.helper = new DefaultJcaJceHelper();
    }

    public PublicKey getPublicKey() throws InvalidKeyException, NoSuchAlgorithmException {
        KeyFactory createKeyFactory;
        try {
            SubjectPublicKeyInfo subjectPublicKeyInfo = getSubjectPublicKeyInfo();
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded());
            try {
                createKeyFactory = this.helper.createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm().getId());
            } catch (NoSuchAlgorithmException e10) {
                if (keyAlgorithms.get(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()) == null) {
                    throw e10;
                }
                createKeyFactory = this.helper.createKeyFactory((String) keyAlgorithms.get(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()));
            }
            return createKeyFactory.generatePublic(x509EncodedKeySpec);
        } catch (IOException unused) {
            throw new InvalidKeyException(StubApp.getString2(33902));
        } catch (NoSuchProviderException e11) {
            throw new NoSuchAlgorithmException(StubApp.getString2(29422) + e11.getMessage());
        } catch (InvalidKeySpecException unused2) {
            throw new InvalidKeyException(StubApp.getString2(32511));
        }
    }

    public JcaPKCS10CertificationRequest setProvider(String str) {
        this.helper = new NamedJcaJceHelper(str);
        return this;
    }

    public JcaPKCS10CertificationRequest(PKCS10CertificationRequest pKCS10CertificationRequest) {
        super(pKCS10CertificationRequest.toASN1Structure());
        this.helper = new DefaultJcaJceHelper();
    }

    public JcaPKCS10CertificationRequest setProvider(Provider provider) {
        this.helper = new ProviderJcaJceHelper(provider);
        return this;
    }

    public JcaPKCS10CertificationRequest(byte[] bArr) throws IOException {
        super(bArr);
        this.helper = new DefaultJcaJceHelper();
    }
}
