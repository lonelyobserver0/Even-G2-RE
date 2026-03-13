package qa;

import com.stub.StubApp;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import kotlin.UByte;

/* renamed from: qa.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1531b extends InputStream implements InterfaceC1533d {
    public final RandomAccessFile j;

    /* renamed from: k, reason: collision with root package name */
    public final long f20108k;

    /* renamed from: a, reason: collision with root package name */
    public final int f20100a = 4096;

    /* renamed from: b, reason: collision with root package name */
    public final long f20101b = -4096;

    /* renamed from: c, reason: collision with root package name */
    public final int f20102c = 1000;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f20103d = null;

    /* renamed from: e, reason: collision with root package name */
    public final C1530a f20104e = new C1530a(this);

    /* renamed from: f, reason: collision with root package name */
    public long f20105f = -1;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f20106g = new byte[4096];

    /* renamed from: h, reason: collision with root package name */
    public int f20107h = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f20109l = 0;

    public C1531b(File file) {
        this.j = new RandomAccessFile(file, StubApp.getString2(1269));
        this.f20108k = file.length();
        seek(0L);
    }

    public final void a(int i3) {
        seek(this.f20109l - i3);
    }

    @Override // java.io.InputStream
    public final int available() {
        return (int) Math.min(this.f20108k - this.f20109l, 2147483647L);
    }

    @Override // qa.InterfaceC1533d
    public final boolean c() {
        return peek() == -1;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j.close();
        this.f20104e.clear();
    }

    @Override // qa.InterfaceC1533d
    public final long getPosition() {
        return this.f20109l;
    }

    @Override // qa.InterfaceC1533d
    public final long length() {
        return this.f20108k;
    }

    public final int peek() {
        int read = read();
        if (read != -1) {
            a(1);
        }
        return read;
    }

    @Override // java.io.InputStream, qa.InterfaceC1533d
    public final int read() {
        long j = this.f20109l;
        if (j >= this.f20108k) {
            return -1;
        }
        if (this.f20107h == this.f20100a) {
            seek(j);
        }
        this.f20109l++;
        byte[] bArr = this.f20106g;
        int i3 = this.f20107h;
        this.f20107h = i3 + 1;
        return bArr[i3] & UByte.MAX_VALUE;
    }

    @Override // qa.InterfaceC1533d
    public final void seek(long j) {
        long j3 = this.f20101b & j;
        if (j3 != this.f20105f) {
            Long valueOf = Long.valueOf(j3);
            C1530a c1530a = this.f20104e;
            byte[] bArr = (byte[]) c1530a.get(valueOf);
            if (bArr == null) {
                RandomAccessFile randomAccessFile = this.j;
                randomAccessFile.seek(j3);
                byte[] bArr2 = this.f20103d;
                int i3 = this.f20100a;
                if (bArr2 != null) {
                    this.f20103d = null;
                } else {
                    bArr2 = new byte[i3];
                }
                int i10 = 0;
                while (i10 < i3) {
                    int read = randomAccessFile.read(bArr2, i10, i3 - i10);
                    if (read < 0) {
                        break;
                    } else {
                        i10 += read;
                    }
                }
                c1530a.put(Long.valueOf(j3), bArr2);
                bArr = bArr2;
            }
            this.f20105f = j3;
            this.f20106g = bArr;
        }
        this.f20107h = (int) (j - this.f20105f);
        this.f20109l = j;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long j3 = this.f20109l;
        long j10 = this.f20108k;
        if (j10 - j3 < j) {
            j = j10 - j3;
        }
        int i3 = this.f20100a;
        if (j < i3) {
            int i10 = this.f20107h;
            if (i10 + j <= i3) {
                this.f20107h = (int) (i10 + j);
                this.f20109l = j3 + j;
                return j;
            }
        }
        seek(j3 + j);
        return j;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream, qa.InterfaceC1533d
    public final int read(byte[] bArr, int i3, int i10) {
        long j = this.f20109l;
        long j3 = this.f20108k;
        if (j >= j3) {
            return -1;
        }
        int i11 = this.f20107h;
        int i12 = this.f20100a;
        if (i11 == i12) {
            seek(j);
        }
        int min = Math.min(i12 - this.f20107h, i10);
        long j10 = this.f20109l;
        if (j3 - j10 < i12) {
            min = Math.min(min, (int) (j3 - j10));
        }
        System.arraycopy(this.f20106g, this.f20107h, bArr, i3, min);
        this.f20107h += min;
        this.f20109l += min;
        return min;
    }
}
