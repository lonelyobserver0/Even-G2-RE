package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BERBitString extends ASN1BitString {
    private static final int DEFAULT_SEGMENT_LIMIT = 1000;
    private final ASN1BitString[] elements;
    private final int segmentLimit;

    public BERBitString(byte b2, int i3) {
        super(b2, i3);
        this.elements = null;
        this.segmentLimit = DEFAULT_SEGMENT_LIMIT;
    }

    public static byte[] flattenBitStrings(ASN1BitString[] aSN1BitStringArr) {
        int length = aSN1BitStringArr.length;
        if (length == 0) {
            return new byte[]{0};
        }
        if (length == 1) {
            return aSN1BitStringArr[0].contents;
        }
        int i3 = length - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            byte[] bArr = aSN1BitStringArr[i11].contents;
            if (bArr[0] != 0) {
                throw new IllegalArgumentException(StubApp.getString2(26838));
            }
            i10 += bArr.length - 1;
        }
        byte[] bArr2 = aSN1BitStringArr[i3].contents;
        byte b2 = bArr2[0];
        byte[] bArr3 = new byte[i10 + bArr2.length];
        bArr3[0] = b2;
        int i12 = 1;
        for (ASN1BitString aSN1BitString : aSN1BitStringArr) {
            byte[] bArr4 = aSN1BitString.contents;
            int length2 = bArr4.length - 1;
            System.arraycopy(bArr4, 1, bArr3, i12, length2);
            i12 += length2;
        }
        return bArr3;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream, boolean z2) throws IOException {
        ASN1OutputStream aSN1OutputStream2;
        if (!encodeConstructed()) {
            byte[] bArr = this.contents;
            DLBitString.encode(aSN1OutputStream, z2, bArr, 0, bArr.length);
            return;
        }
        aSN1OutputStream.writeIdentifier(z2, 35);
        aSN1OutputStream.write(128);
        ASN1BitString[] aSN1BitStringArr = this.elements;
        if (aSN1BitStringArr != null) {
            aSN1OutputStream.writePrimitives(aSN1BitStringArr);
        } else {
            byte[] bArr2 = this.contents;
            if (bArr2.length >= 2) {
                byte b2 = bArr2[0];
                int length = bArr2.length;
                int i3 = length - 1;
                int i10 = this.segmentLimit - 1;
                while (i3 > i10) {
                    ASN1OutputStream aSN1OutputStream3 = aSN1OutputStream;
                    DLBitString.encode(aSN1OutputStream3, true, (byte) 0, this.contents, length - i3, i10);
                    i3 -= i10;
                    aSN1OutputStream = aSN1OutputStream3;
                }
                aSN1OutputStream2 = aSN1OutputStream;
                DLBitString.encode(aSN1OutputStream2, true, b2, this.contents, length - i3, i3);
                aSN1OutputStream2.write(0);
                aSN1OutputStream2.write(0);
            }
        }
        aSN1OutputStream2 = aSN1OutputStream;
        aSN1OutputStream2.write(0);
        aSN1OutputStream2.write(0);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean encodeConstructed() {
        return this.elements != null || this.contents.length > this.segmentLimit;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public int encodedLength(boolean z2) throws IOException {
        if (!encodeConstructed()) {
            return DLBitString.encodedLength(z2, this.contents.length);
        }
        int i3 = z2 ? 4 : 3;
        if (this.elements == null) {
            byte[] bArr = this.contents;
            if (bArr.length < 2) {
                return i3;
            }
            int length = bArr.length - 2;
            int i10 = this.segmentLimit;
            int i11 = length / (i10 - 1);
            return DLBitString.encodedLength(true, this.contents.length - ((this.segmentLimit - 1) * i11)) + (DLBitString.encodedLength(true, i10) * i11) + i3;
        }
        int i12 = 0;
        while (true) {
            ASN1BitString[] aSN1BitStringArr = this.elements;
            if (i12 >= aSN1BitStringArr.length) {
                return i3;
            }
            i3 += aSN1BitStringArr[i12].encodedLength(true);
            i12++;
        }
    }

    public BERBitString(ASN1Encodable aSN1Encodable) throws IOException {
        this(aSN1Encodable.toASN1Primitive().getEncoded(StubApp.getString2(26791)), 0);
    }

    public BERBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public BERBitString(byte[] bArr, int i3) {
        this(bArr, i3, DEFAULT_SEGMENT_LIMIT);
    }

    public BERBitString(byte[] bArr, int i3, int i10) {
        super(bArr, i3);
        this.elements = null;
        this.segmentLimit = i10;
    }

    public BERBitString(byte[] bArr, boolean z2) {
        super(bArr, z2);
        this.elements = null;
        this.segmentLimit = DEFAULT_SEGMENT_LIMIT;
    }

    public BERBitString(ASN1BitString[] aSN1BitStringArr) {
        this(aSN1BitStringArr, DEFAULT_SEGMENT_LIMIT);
    }

    public BERBitString(ASN1BitString[] aSN1BitStringArr, int i3) {
        super(flattenBitStrings(aSN1BitStringArr), false);
        this.elements = aSN1BitStringArr;
        this.segmentLimit = i3;
    }
}
