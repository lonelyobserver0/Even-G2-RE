package org.bouncycastle.eac;

import Xa.h;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.eac.CVCertificate;
import org.bouncycastle.asn1.eac.PublicKeyDataObject;
import org.bouncycastle.eac.operator.EACSignatureVerifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EACCertificateHolder {
    private CVCertificate cvCertificate;

    public EACCertificateHolder(CVCertificate cVCertificate) {
        this.cvCertificate = cVCertificate;
    }

    private static CVCertificate parseBytes(byte[] bArr) throws IOException {
        String string2 = StubApp.getString2(28012);
        try {
            return CVCertificate.getInstance(bArr);
        } catch (ClassCastException e10) {
            throw new EACIOException(string2 + e10.getMessage(), e10);
        } catch (IllegalArgumentException e11) {
            throw new EACIOException(h.l(e11, new StringBuilder(string2)), e11);
        } catch (ASN1ParsingException e12) {
            if (e12.getCause() instanceof IOException) {
                throw ((IOException) e12.getCause());
            }
            throw new EACIOException(string2 + e12.getMessage(), e12);
        }
    }

    public PublicKeyDataObject getPublicKeyDataObject() {
        return this.cvCertificate.getBody().getPublicKey();
    }

    public boolean isSignatureValid(EACSignatureVerifier eACSignatureVerifier) throws EACException {
        try {
            OutputStream outputStream = eACSignatureVerifier.getOutputStream();
            outputStream.write(this.cvCertificate.getBody().getEncoded(StubApp.getString2("26791")));
            outputStream.close();
            return eACSignatureVerifier.verify(this.cvCertificate.getSignature());
        } catch (Exception e10) {
            throw new EACException(u.r(e10, new StringBuilder(StubApp.getString2(28013))), e10);
        }
    }

    public CVCertificate toASN1Structure() {
        return this.cvCertificate;
    }

    public EACCertificateHolder(byte[] bArr) throws IOException {
        this(parseBytes(bArr));
    }
}
