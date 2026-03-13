package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DEROctetString extends ASN1OctetString {
    public DEROctetString(ASN1Encodable aSN1Encodable) throws IOException {
        super(aSN1Encodable.toASN1Primitive().getEncoded(StubApp.getString2(26791)));
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        aSN1OutputStream.writeEncodingDL(z2, 4, this.string);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) {
        return ASN1OutputStream.getLengthOfEncodingDL(z2, this.string.length);
    }

    @Override // org.bouncycastle.asn1.ASN1OctetString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1OctetString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public DEROctetString(byte[] bArr) {
        super(bArr);
    }

    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z2, byte[] bArr, int i3, int i10) throws IOException {
        aSN1OutputStream.writeEncodingDL(z2, 4, bArr, i3, i10);
    }

    public static int encodedLength(boolean z2, int i3) {
        return ASN1OutputStream.getLengthOfEncodingDL(z2, i3);
    }
}
