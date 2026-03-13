package da;

import com.stub.StubApp;
import java.io.EOFException;
import java.io.IOException;
import kotlin.UByte;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class v extends F {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f13536a;

    /* renamed from: b, reason: collision with root package name */
    public int f13537b;

    @Override // da.F
    public final short A() {
        int read = read();
        int read2 = read();
        if ((read | read2) >= 0) {
            return (short) ((read << 8) + read2);
        }
        throw new EOFException();
    }

    @Override // da.F
    public final int G() {
        int read = read();
        int read2 = read();
        if ((read | read2) >= 0) {
            return (read << 8) + read2;
        }
        throw new EOFException();
    }

    public final int J() {
        int read = read();
        int read2 = read();
        int read3 = read();
        int read4 = read();
        if ((read | read2 | read3 | read4) >= 0) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new EOFException();
    }

    @Override // da.F, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // da.F
    public final long d() {
        return this.f13537b;
    }

    @Override // da.F
    public final long e() {
        return this.f13536a.length;
    }

    @Override // da.F
    public final int read() {
        int i3 = this.f13537b;
        byte[] bArr = this.f13536a;
        if (i3 >= bArr.length) {
            return -1;
        }
        byte b2 = bArr[i3];
        this.f13537b = i3 + 1;
        return (b2 + UByte.MIN_VALUE) % 256;
    }

    @Override // da.F
    public final void seek(long j) {
        if (j < 0 || j > 2147483647L) {
            throw new IOException(Xa.h.h(j, StubApp.getString2(17233)));
        }
        this.f13537b = (int) j;
    }

    @Override // da.F
    public final long v() {
        return (J() << 32) + (J() & BodyPartID.bodyIdMax);
    }

    @Override // da.F
    public final int read(byte[] bArr, int i3, int i10) {
        int i11 = this.f13537b;
        byte[] bArr2 = this.f13536a;
        if (i11 >= bArr2.length) {
            return -1;
        }
        int min = Math.min(i10, bArr2.length - i11);
        System.arraycopy(bArr2, this.f13537b, bArr, i3, min);
        this.f13537b += min;
        return min;
    }
}
