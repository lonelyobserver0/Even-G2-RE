package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.eac.CertificateBody;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ASN1OutputStream {
    private OutputStream os;

    public ASN1OutputStream(OutputStream outputStream) {
        this.os = outputStream;
    }

    public static ASN1OutputStream create(OutputStream outputStream) {
        return new ASN1OutputStream(outputStream);
    }

    public static int getLengthOfDL(int i3) {
        if (i3 < 128) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            i3 >>>= 8;
            if (i3 == 0) {
                return i10;
            }
            i10++;
        }
    }

    public static int getLengthOfEncodingDL(boolean z2, int i3) {
        return getLengthOfDL(i3) + (z2 ? 1 : 0) + i3;
    }

    public static int getLengthOfIdentifier(int i3) {
        if (i3 < 31) {
            return 1;
        }
        int i10 = 2;
        while (true) {
            i3 >>>= 7;
            if (i3 == 0) {
                return i10;
            }
            i10++;
        }
    }

    public void close() throws IOException {
        this.os.close();
    }

    public void flush() throws IOException {
        this.os.flush();
    }

    public void flushInternal() throws IOException {
    }

    public DEROutputStream getDERSubStream() {
        return new DEROutputStream(this.os);
    }

    public DLOutputStream getDLSubStream() {
        return new DLOutputStream(this.os);
    }

    public final void write(int i3) throws IOException {
        this.os.write(i3);
    }

    public final void writeDL(int i3) throws IOException {
        if (i3 < 128) {
            write(i3);
            return;
        }
        int i10 = 5;
        byte[] bArr = new byte[5];
        while (true) {
            int i11 = i10 - 1;
            bArr[i11] = (byte) i3;
            i3 >>>= 8;
            if (i3 == 0) {
                int i12 = i10 - 2;
                bArr[i12] = (byte) ((5 - i11) | 128);
                write(bArr, i12, 6 - i11);
                return;
            }
            i10 = i11;
        }
    }

    public void writeElements(ASN1Encodable[] aSN1EncodableArr) throws IOException {
        for (ASN1Encodable aSN1Encodable : aSN1EncodableArr) {
            aSN1Encodable.toASN1Primitive().encode(this, true);
        }
    }

    public final void writeEncodingDL(boolean z2, int i3, byte b2) throws IOException {
        writeIdentifier(z2, i3);
        writeDL(1);
        write(b2);
    }

    public final void writeEncodingIL(boolean z2, int i3, ASN1Encodable[] aSN1EncodableArr) throws IOException {
        writeIdentifier(z2, i3);
        write(128);
        writeElements(aSN1EncodableArr);
        write(0);
        write(0);
    }

    public final void writeIdentifier(boolean z2, int i3) throws IOException {
        if (z2) {
            write(i3);
        }
    }

    public final void writeObject(ASN1Encodable aSN1Encodable) throws IOException {
        if (aSN1Encodable == null) {
            throw new IOException(StubApp.getString2(26792));
        }
        writePrimitive(aSN1Encodable.toASN1Primitive(), true);
        flushInternal();
    }

    public void writePrimitive(ASN1Primitive aSN1Primitive, boolean z2) throws IOException {
        aSN1Primitive.encode(this, z2);
    }

    public void writePrimitives(ASN1Primitive[] aSN1PrimitiveArr) throws IOException {
        for (ASN1Primitive aSN1Primitive : aSN1PrimitiveArr) {
            aSN1Primitive.encode(this, true);
        }
    }

    public static ASN1OutputStream create(OutputStream outputStream, String str) {
        return str.equals(StubApp.getString2(26791)) ? new DEROutputStream(outputStream) : str.equals(StubApp.getString2(21754)) ? new DLOutputStream(outputStream) : new ASN1OutputStream(outputStream);
    }

    public final void write(byte[] bArr, int i3, int i10) throws IOException {
        this.os.write(bArr, i3, i10);
    }

    public final void writeEncodingDL(boolean z2, int i3, byte b2, byte[] bArr, int i10, int i11) throws IOException {
        writeIdentifier(z2, i3);
        writeDL(i11 + 1);
        write(b2);
        write(bArr, i10, i11);
    }

    public final void writeIdentifier(boolean z2, int i3, int i10) throws IOException {
        if (z2) {
            if (i10 < 31) {
                write(i3 | i10);
                return;
            }
            byte[] bArr = new byte[6];
            int i11 = 5;
            bArr[5] = (byte) (i10 & CertificateBody.profileType);
            while (i10 > 127) {
                i10 >>>= 7;
                i11--;
                bArr[i11] = (byte) ((i10 & CertificateBody.profileType) | 128);
            }
            int i12 = i11 - 1;
            bArr[i12] = (byte) (31 | i3);
            write(bArr, i12, 6 - i12);
        }
    }

    public final void writeObject(ASN1Primitive aSN1Primitive) throws IOException {
        if (aSN1Primitive == null) {
            throw new IOException(StubApp.getString2(26792));
        }
        writePrimitive(aSN1Primitive, true);
        flushInternal();
    }

    public final void writeEncodingDL(boolean z2, int i3, int i10, byte[] bArr) throws IOException {
        writeIdentifier(z2, i3, i10);
        writeDL(bArr.length);
        write(bArr, 0, bArr.length);
    }

    public final void writeEncodingDL(boolean z2, int i3, byte[] bArr) throws IOException {
        writeIdentifier(z2, i3);
        writeDL(bArr.length);
        write(bArr, 0, bArr.length);
    }

    public final void writeEncodingDL(boolean z2, int i3, byte[] bArr, int i10, int i11) throws IOException {
        writeIdentifier(z2, i3);
        writeDL(i11);
        write(bArr, i10, i11);
    }

    public final void writeEncodingDL(boolean z2, int i3, byte[] bArr, int i10, int i11, byte b2) throws IOException {
        writeIdentifier(z2, i3);
        writeDL(i11 + 1);
        write(bArr, i10, i11);
        write(b2);
    }
}
