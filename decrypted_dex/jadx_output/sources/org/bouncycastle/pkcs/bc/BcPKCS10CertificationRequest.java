package org.bouncycastle.pkcs.bc;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import org.bouncycastle.asn1.pkcs.CertificationRequest;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.util.PublicKeyFactory;
import org.bouncycastle.pkcs.PKCS10CertificationRequest;
import org.bouncycastle.pkcs.PKCSException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BcPKCS10CertificationRequest extends PKCS10CertificationRequest {
    public BcPKCS10CertificationRequest(CertificationRequest certificationRequest) {
        super(certificationRequest);
    }

    public AsymmetricKeyParameter getPublicKey() throws PKCSException {
        try {
            return PublicKeyFactory.createKey(getSubjectPublicKeyInfo());
        } catch (IOException e10) {
            throw new PKCSException(u.q(e10, new StringBuilder(StubApp.getString2(33901))), e10);
        }
    }

    public BcPKCS10CertificationRequest(PKCS10CertificationRequest pKCS10CertificationRequest) {
        super(pKCS10CertificationRequest.toASN1Structure());
    }

    public BcPKCS10CertificationRequest(byte[] bArr) throws IOException {
        super(bArr);
    }
}
