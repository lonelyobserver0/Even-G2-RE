package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BEROctetStringGenerator extends BERGenerator {

    public class BufferedBEROctetStream extends OutputStream {
        private byte[] _buf;
        private DEROutputStream _derOut;
        private int _off = 0;

        public BufferedBEROctetStream(byte[] bArr) {
            this._buf = bArr;
            this._derOut = new DEROutputStream(BEROctetStringGenerator.this._out);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            int i3 = this._off;
            if (i3 != 0) {
                DEROctetString.encode(this._derOut, true, this._buf, 0, i3);
            }
            this._derOut.flushInternal();
            BEROctetStringGenerator.this.writeBEREnd();
        }

        @Override // java.io.OutputStream
        public void write(int i3) throws IOException {
            byte[] bArr = this._buf;
            int i10 = this._off;
            int i11 = i10 + 1;
            this._off = i11;
            bArr[i10] = (byte) i3;
            if (i11 == bArr.length) {
                DEROctetString.encode(this._derOut, true, bArr, 0, bArr.length);
                this._off = 0;
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i3, int i10) throws IOException {
            byte[] bArr2 = this._buf;
            int length = bArr2.length;
            int i11 = this._off;
            int i12 = length - i11;
            if (i10 < i12) {
                System.arraycopy(bArr, i3, bArr2, i11, i10);
                this._off += i10;
                return;
            }
            if (i11 > 0) {
                System.arraycopy(bArr, i3, bArr2, i11, i12);
                DEROctetString.encode(this._derOut, true, this._buf, 0, length);
            } else {
                i12 = 0;
            }
            while (true) {
                int i13 = i10 - i12;
                if (i13 < length) {
                    System.arraycopy(bArr, i3 + i12, this._buf, 0, i13);
                    this._off = i13;
                    return;
                } else {
                    DEROctetString.encode(this._derOut, true, bArr, i3 + i12, length);
                    i12 += length;
                }
            }
        }
    }

    public BEROctetStringGenerator(OutputStream outputStream) throws IOException {
        super(outputStream);
        writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream() {
        return getOctetOutputStream(new byte[1000]);
    }

    public BEROctetStringGenerator(OutputStream outputStream, int i3, boolean z2) throws IOException {
        super(outputStream, i3, z2);
        writeBERHeader(36);
    }

    public OutputStream getOctetOutputStream(byte[] bArr) {
        return new BufferedBEROctetStream(bArr);
    }
}
