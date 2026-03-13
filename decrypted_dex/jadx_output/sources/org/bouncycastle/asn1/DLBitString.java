package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DLBitString extends ASN1BitString {
    public DLBitString(byte b2, int i3) {
        super(b2, i3);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        aSN1OutputStream.writeEncodingDL(z2, 3, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) {
        return ASN1OutputStream.getLengthOfEncodingDL(z2, this.contents.length);
    }

    @Override // org.bouncycastle.asn1.ASN1BitString, org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return this;
    }

    public DLBitString(int i3) {
        super(ASN1BitString.getBytes(i3), ASN1BitString.getPadBits(i3));
    }

    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z2, byte b2, byte[] bArr, int i3, int i10) throws IOException {
        aSN1OutputStream.writeEncodingDL(z2, 3, b2, bArr, i3, i10);
    }

    public static int encodedLength(boolean z2, int i3) {
        return ASN1OutputStream.getLengthOfEncodingDL(z2, i3);
    }

    public DLBitString(ASN1Encodable aSN1Encodable) throws IOException {
        super(aSN1Encodable.toASN1Primitive().getEncoded(StubApp.getString2(26791)), 0);
    }

    public static void encode(ASN1OutputStream aSN1OutputStream, boolean z2, byte[] bArr, int i3, int i10) throws IOException {
        aSN1OutputStream.writeEncodingDL(z2, 3, bArr, i3, i10);
    }

    public DLBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DLBitString(byte[] bArr, int i3) {
        super(bArr, i3);
    }

    public DLBitString(byte[] bArr, boolean z2) {
        super(bArr, z2);
    }
}
