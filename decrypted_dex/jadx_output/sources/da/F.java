package da;

import Kc.InterfaceC0103j;
import com.stub.StubApp;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class F implements Closeable {
    public abstract short A();

    public String C(int i3, Charset charset) {
        return new String(h(i3), charset);
    }

    public long F() {
        long read = read();
        long read2 = read();
        long read3 = read();
        long read4 = read();
        if (read4 >= 0) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new EOFException();
    }

    public abstract int G();

    public int[] H(int i3) {
        int[] iArr = new int[i3];
        for (int i10 = 0; i10 < i3; i10++) {
            iArr[i10] = G();
        }
        return iArr;
    }

    public abstract InterfaceC0103j I();

    public abstract long a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        xc.b.c(I());
    }

    public abstract long d();

    public abstract long e();

    public byte[] h(int i3) {
        byte[] bArr = new byte[i3];
        int i10 = 0;
        while (i10 < i3) {
            int read = read(bArr, i10, i3 - i10);
            if (read == -1) {
                break;
            }
            i10 += read;
        }
        if (i10 == i3) {
            return bArr;
        }
        throw new IOException(StubApp.getString2(17127));
    }

    public float k() {
        return (G() / 65536.0f) + A();
    }

    public void p() {
        long v2 = v();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(StubApp.getString2(8779)));
        calendar.set(1904, 0, 1, 0, 0, 0);
        calendar.set(14, 0);
        calendar.setTimeInMillis((v2 * 1000) + calendar.getTimeInMillis());
    }

    public abstract int read();

    public abstract int read(byte[] bArr, int i3, int i10);

    public abstract void seek(long j);

    public abstract long v();
}
