package org.bouncycastle.asn1;

import com.stub.StubApp;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.util.io.Streams;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class DefiniteLengthInputStream extends LimitedInputStream {
    private static final byte[] EMPTY_BYTES = new byte[0];
    private final int _originalLength;
    private int _remaining;

    public DefiniteLengthInputStream(InputStream inputStream, int i3, int i10) {
        super(inputStream, i10);
        if (i3 <= 0) {
            if (i3 < 0) {
                throw new IllegalArgumentException(StubApp.getString2(26849));
            }
            setParentEofDetect(true);
        }
        this._originalLength = i3;
        this._remaining = i3;
    }

    public int getRemaining() {
        return this._remaining;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this._remaining == 0) {
            return -1;
        }
        int read = this._in.read();
        if (read >= 0) {
            int i3 = this._remaining - 1;
            this._remaining = i3;
            if (i3 == 0) {
                setParentEofDetect(true);
            }
            return read;
        }
        throw new EOFException(StubApp.getString2(26850) + this._originalLength + StubApp.getString2(26851) + this._remaining);
    }

    public void readAllIntoByteArray(byte[] bArr) throws IOException {
        int i3 = this._remaining;
        if (i3 != bArr.length) {
            throw new IllegalArgumentException(StubApp.getString2(26852));
        }
        if (i3 == 0) {
            return;
        }
        int limit = getLimit();
        int i10 = this._remaining;
        if (i10 >= limit) {
            throw new IOException(StubApp.getString2(26759) + this._remaining + StubApp.getString2(22132) + limit);
        }
        int readFully = i10 - Streams.readFully(this._in, bArr, 0, bArr.length);
        this._remaining = readFully;
        if (readFully == 0) {
            setParentEofDetect(true);
            return;
        }
        throw new EOFException(StubApp.getString2(26850) + this._originalLength + StubApp.getString2(26851) + this._remaining);
    }

    public byte[] toByteArray() throws IOException {
        if (this._remaining == 0) {
            return EMPTY_BYTES;
        }
        int limit = getLimit();
        int i3 = this._remaining;
        if (i3 >= limit) {
            throw new IOException(StubApp.getString2(26759) + this._remaining + StubApp.getString2(22132) + limit);
        }
        byte[] bArr = new byte[i3];
        int readFully = i3 - Streams.readFully(this._in, bArr, 0, i3);
        this._remaining = readFully;
        if (readFully == 0) {
            setParentEofDetect(true);
            return bArr;
        }
        throw new EOFException(StubApp.getString2(26850) + this._originalLength + StubApp.getString2(26851) + this._remaining);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i3, int i10) throws IOException {
        int i11 = this._remaining;
        if (i11 == 0) {
            return -1;
        }
        int read = this._in.read(bArr, i3, Math.min(i10, i11));
        if (read >= 0) {
            int i12 = this._remaining - read;
            this._remaining = i12;
            if (i12 == 0) {
                setParentEofDetect(true);
            }
            return read;
        }
        throw new EOFException(StubApp.getString2(26850) + this._originalLength + StubApp.getString2(26851) + this._remaining);
    }
}
