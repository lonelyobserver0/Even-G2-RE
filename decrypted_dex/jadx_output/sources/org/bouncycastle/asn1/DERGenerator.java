package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class DERGenerator extends ASN1Generator {
    private boolean _isExplicit;
    private int _tagNo;
    private boolean _tagged;

    public DERGenerator(OutputStream outputStream) {
        super(outputStream);
        this._tagged = false;
    }

    private void writeLength(OutputStream outputStream, int i3) throws IOException {
        if (i3 <= 127) {
            outputStream.write((byte) i3);
            return;
        }
        int i10 = i3;
        int i11 = 1;
        while (true) {
            i10 >>>= 8;
            if (i10 == 0) {
                break;
            } else {
                i11++;
            }
        }
        outputStream.write((byte) (i11 | 128));
        for (int i12 = (i11 - 1) * 8; i12 >= 0; i12 -= 8) {
            outputStream.write((byte) (i3 >> i12));
        }
    }

    public void writeDEREncoded(int i3, byte[] bArr) throws IOException {
        if (!this._tagged) {
            writeDEREncoded(this._out, i3, bArr);
            return;
        }
        int i10 = this._tagNo;
        int i11 = i10 | 128;
        if (this._isExplicit) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            writeDEREncoded(byteArrayOutputStream, i3, bArr);
            writeDEREncoded(this._out, i10 | 160, byteArrayOutputStream.toByteArray());
            return;
        }
        if ((i3 & 32) != 0) {
            writeDEREncoded(this._out, i10 | 160, bArr);
        } else {
            writeDEREncoded(this._out, i11, bArr);
        }
    }

    public DERGenerator(OutputStream outputStream, int i3, boolean z2) {
        super(outputStream);
        this._tagged = true;
        this._isExplicit = z2;
        this._tagNo = i3;
    }

    public void writeDEREncoded(OutputStream outputStream, int i3, byte[] bArr) throws IOException {
        outputStream.write(i3);
        writeLength(outputStream, bArr.length);
        outputStream.write(bArr);
    }
}
