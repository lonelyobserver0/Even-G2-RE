package org.bouncycastle.util.encoders;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BufferedEncoder {
    protected byte[] buf;
    protected int bufOff;
    protected Translator translator;

    public BufferedEncoder(Translator translator, int i3) {
        this.translator = translator;
        if (i3 % translator.getEncodedBlockSize() != 0) {
            throw new IllegalArgumentException(StubApp.getString2(34998));
        }
        this.buf = new byte[i3];
        this.bufOff = 0;
    }

    public int processByte(byte b2, byte[] bArr, int i3) {
        byte[] bArr2 = this.buf;
        int i10 = this.bufOff;
        int i11 = i10 + 1;
        this.bufOff = i11;
        bArr2[i10] = b2;
        if (i11 != bArr2.length) {
            return 0;
        }
        int encode = this.translator.encode(bArr2, 0, bArr2.length, bArr, i3);
        this.bufOff = 0;
        return encode;
    }

    public int processBytes(byte[] bArr, int i3, int i10, byte[] bArr2, int i11) {
        byte[] bArr3;
        if (i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(28301));
        }
        byte[] bArr4 = this.buf;
        int length = bArr4.length;
        int i12 = this.bufOff;
        int i13 = length - i12;
        int i14 = 0;
        if (i10 > i13) {
            System.arraycopy(bArr, i3, bArr4, i12, i13);
            Translator translator = this.translator;
            byte[] bArr5 = this.buf;
            int encode = translator.encode(bArr5, 0, bArr5.length, bArr2, i11);
            this.bufOff = 0;
            int i15 = i10 - i13;
            int i16 = i3 + i13;
            int length2 = i15 - (i15 % this.buf.length);
            bArr3 = bArr;
            i14 = encode + this.translator.encode(bArr3, i16, length2, bArr2, i11 + encode);
            i10 = i15 - length2;
            i3 = i16 + length2;
        } else {
            bArr3 = bArr;
        }
        if (i10 != 0) {
            System.arraycopy(bArr3, i3, this.buf, this.bufOff, i10);
            this.bufOff += i10;
        }
        return i14;
    }
}
