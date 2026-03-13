package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import com.stub.StubApp;
import java.io.IOException;
import java.security.SignatureException;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DEROctetString;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SignatureSpiLe extends SignatureSpi {
    @Override // org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi, java.security.SignatureSpi
    public byte[] engineSign() throws SignatureException {
        byte[] octets = ASN1OctetString.getInstance(super.engineSign()).getOctets();
        reverseBytes(octets);
        try {
            return new DEROctetString(octets).getEncoded();
        } catch (Exception e10) {
            throw new SignatureException(e10.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi, java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) throws SignatureException {
        try {
            byte[] octets = ((ASN1OctetString) ASN1Primitive.fromByteArray(bArr)).getOctets();
            reverseBytes(octets);
            try {
                return super.engineVerify(new DEROctetString(octets).getEncoded());
            } catch (SignatureException e10) {
                throw e10;
            } catch (Exception e11) {
                throw new SignatureException(e11.toString());
            }
        } catch (IOException unused) {
            throw new SignatureException(StubApp.getString2(30580));
        }
    }

    public void reverseBytes(byte[] bArr) {
        for (int i3 = 0; i3 < bArr.length / 2; i3++) {
            byte b2 = bArr[i3];
            bArr[i3] = bArr[(bArr.length - 1) - i3];
            bArr[(bArr.length - 1) - i3] = b2;
        }
    }
}
