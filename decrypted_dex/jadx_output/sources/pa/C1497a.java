package pa;

import com.stub.StubApp;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: pa.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1497a extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f19718a;

    /* renamed from: b, reason: collision with root package name */
    public int f19719b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19720c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f19721d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f19722e;

    public C1497a(InputStream inputStream) {
        super(inputStream);
        this.f19718a = 0;
        this.f19719b = 0;
        this.f19720c = false;
        this.f19721d = new byte[5];
        this.f19722e = new byte[4];
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return 0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f19721d = null;
        this.f19720c = true;
        this.f19722e = null;
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i3) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0069, code lost:
    
        r13 = r14.f19721d;
        r13[r2] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        if (r12 != 126) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006f, code lost:
    
        r13[r2] = 117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        r4 = r2 - 1;
        r14.f19719b = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
    
        if (r4 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007b, code lost:
    
        r14.f19720c = true;
        r14.f19721d = null;
        r14.f19722e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0081, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0082, code lost:
    
        if (r2 >= 5) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0084, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0085, code lost:
    
        if (r2 >= 5) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0087, code lost:
    
        r14.f19721d[r2] = 117;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008e, code lost:
    
        r14.f19720c = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
    
        r1 = 0;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
    
        if (r4 >= 5) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
    
        r5 = (byte) (r14.f19721d[r4] - 33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009c, code lost:
    
        if (r5 < 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a0, code lost:
    
        if (r5 > 93) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00a2, code lost:
    
        r1 = (r1 * 85) + r5;
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00aa, code lost:
    
        r14.f19719b = 0;
        r14.f19720c = true;
        r14.f19721d = null;
        r14.f19722e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00be, code lost:
    
        throw new java.io.IOException(com.stub.StubApp.getString2(22128));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00bf, code lost:
    
        if (r10 < 0) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c1, code lost:
    
        r14.f19722e[r10] = (byte) (255 & r1);
        r1 = r1 >>> 8;
        r10 = r10 - 1;
     */
    @Override // java.io.FilterInputStream, java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read() {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pa.C1497a.read():int");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        throw new IOException(StubApp.getString2("22129"));
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        return 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i3, int i10) {
        if (this.f19720c && this.f19718a >= this.f19719b) {
            return -1;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = this.f19718a;
            if (i12 < this.f19719b) {
                byte[] bArr2 = this.f19722e;
                this.f19718a = i12 + 1;
                bArr[i11 + i3] = bArr2[i12];
            } else {
                int read = read();
                if (read == -1) {
                    return i11;
                }
                bArr[i11 + i3] = (byte) read;
            }
        }
        return i10;
    }
}
