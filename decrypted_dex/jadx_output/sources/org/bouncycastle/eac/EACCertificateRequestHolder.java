package org.bouncycastle.eac;

import Xa.h;
import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.eac.CVCertificateRequest;
import org.bouncycastle.asn1.eac.PublicKeyDataObject;
import org.bouncycastle.eac.operator.EACSignatureVerifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EACCertificateRequestHolder {
    private CVCertificateRequest request;

    public EACCertificateRequestHolder(CVCertificateRequest cVCertificateRequest) {
        this.request = cVCertificateRequest;
    }

    private static CVCertificateRequest parseBytes(byte[] bArr) throws IOException {
        String string2 = StubApp.getString2(28012);
        try {
            return CVCertificateRequest.getInstance(bArr);
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
        return this.request.getPublicKey();
    }

    public boolean isInnerSignatureValid(EACSignatureVerifier eACSignatureVerifier) throws EACException {
        try {
            OutputStream outputStream = eACSignatureVerifier.getOutputStream();
            outputStream.write(this.request.getCertificateBody().getEncoded(StubApp.getString2("26791")));
            outputStream.close();
            return eACSignatureVerifier.verify(this.request.getInnerSignature());
        } catch (Exception e10) {
            throw new EACException(u.r(e10, new StringBuilder(StubApp.getString2(28013))), e10);
        }
    }

    public CVCertificateRequest toASN1Structure() {
        return this.request;
    }

    public EACCertificateRequestHolder(byte[] bArr) throws IOException {
        this(parseBytes(bArr));
    }
}
