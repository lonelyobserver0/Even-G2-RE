package org.bouncycastle.openssl.jcajce;

import com.stub.StubApp;
import java.io.IOException;
import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.CRLException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.cert.jcajce.JcaX509CRLHolder;
import org.bouncycastle.cert.jcajce.JcaX509CertificateHolder;
import org.bouncycastle.openssl.MiscPEMGenerator;
import org.bouncycastle.openssl.PEMEncryptor;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class JcaMiscPEMGenerator extends MiscPEMGenerator {
    private String algorithm;
    private Object obj;
    private char[] password;
    private Provider provider;
    private SecureRandom random;

    public JcaMiscPEMGenerator(Object obj) throws IOException {
        super(convertObject(obj));
    }

    private static Object convertObject(Object obj) throws IOException {
        boolean z2 = obj instanceof X509Certificate;
        String string2 = StubApp.getString2(33672);
        if (z2) {
            try {
                return new JcaX509CertificateHolder((X509Certificate) obj);
            } catch (CertificateEncodingException e10) {
                throw new IllegalArgumentException(string2 + e10.toString());
            }
        }
        if (!(obj instanceof X509CRL)) {
            return obj instanceof KeyPair ? convertObject(((KeyPair) obj).getPrivate()) : obj instanceof PrivateKey ? PrivateKeyInfo.getInstance(((Key) obj).getEncoded()) : obj instanceof PublicKey ? SubjectPublicKeyInfo.getInstance(((PublicKey) obj).getEncoded()) : obj;
        }
        try {
            return new JcaX509CRLHolder((X509CRL) obj);
        } catch (CRLException e11) {
            throw new IllegalArgumentException(string2 + e11.toString());
        }
    }

    public JcaMiscPEMGenerator(Object obj, PEMEncryptor pEMEncryptor) throws IOException {
        super(convertObject(obj), pEMEncryptor);
    }
}
