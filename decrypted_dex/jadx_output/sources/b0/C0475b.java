package b0;

import android.util.Log;
import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class C0475b extends InputStream implements DataInput {

    /* renamed from: a, reason: collision with root package name */
    public final DataInputStream f10404a;

    /* renamed from: b, reason: collision with root package name */
    public int f10405b;

    /* renamed from: c, reason: collision with root package name */
    public ByteOrder f10406c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f10407d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10408e;

    public C0475b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f10408e = bArr.length;
    }

    public final void a(int i3) {
        int i10 = 0;
        while (i10 < i3) {
            DataInputStream dataInputStream = this.f10404a;
            int i11 = i3 - i10;
            int skip = (int) dataInputStream.skip(i11);
            if (skip <= 0) {
                if (this.f10407d == null) {
                    this.f10407d = new byte[8192];
                }
                skip = dataInputStream.read(this.f10407d, 0, Math.min(8192, i11));
                if (skip == -1) {
                    throw new EOFException(Xa.h.g(i3, StubApp.getString2(8608), StubApp.getString2(8609)));
                }
            }
            i10 += skip;
        }
        this.f10405b += i10;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f10404a.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i3) {
        throw new UnsupportedOperationException(StubApp.getString2(8610));
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f10405b++;
        return this.f10404a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f10405b++;
        return this.f10404a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f10405b++;
        int read = this.f10404a.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f10405b += 2;
        return this.f10404a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i3, int i10) {
        this.f10405b += i10;
        this.f10404a.readFully(bArr, i3, i10);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f10405b += 4;
        DataInputStream dataInputStream = this.f10404a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10406c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException(StubApp.getString2(8611) + this.f10406c);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d(StubApp.getString2(8612), StubApp.getString2(8613));
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j;
        long j3;
        this.f10405b += 8;
        DataInputStream dataInputStream = this.f10404a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10406c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j3 = read;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException(StubApp.getString2(8611) + this.f10406c);
            }
            j = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j3 = read8;
        }
        return j + j3;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f10405b += 2;
        DataInputStream dataInputStream = this.f10404a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10406c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException(StubApp.getString2(8611) + this.f10406c);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f10405b += 2;
        return this.f10404a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f10405b++;
        return this.f10404a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f10405b += 2;
        DataInputStream dataInputStream = this.f10404a;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f10406c;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException(StubApp.getString2(8611) + this.f10406c);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException(StubApp.getString2(8614));
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i3) {
        throw new UnsupportedOperationException(StubApp.getString2(8615));
    }

    public C0475b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i3, int i10) {
        int read = this.f10404a.read(bArr, i3, i10);
        this.f10405b += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f10405b += bArr.length;
        this.f10404a.readFully(bArr);
    }

    public C0475b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f10404a = dataInputStream;
        dataInputStream.mark(0);
        this.f10405b = 0;
        this.f10406c = byteOrder;
        this.f10408e = inputStream instanceof C0475b ? ((C0475b) inputStream).f10408e : -1;
    }
}
