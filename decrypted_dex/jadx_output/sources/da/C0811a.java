package da;

import com.stub.StubApp;
import java.io.File;
import java.io.RandomAccessFile;
import kotlin.UByte;

/* renamed from: da.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0811a extends RandomAccessFile {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f13490a;

    /* renamed from: b, reason: collision with root package name */
    public int f13491b;

    /* renamed from: c, reason: collision with root package name */
    public int f13492c;

    /* renamed from: d, reason: collision with root package name */
    public long f13493d;

    public C0811a(File file) {
        super(file, StubApp.getString2(1269));
        this.f13491b = 0;
        this.f13492c = 0;
        this.f13493d = 0L;
        this.f13490a = new byte[16384];
    }

    @Override // java.io.RandomAccessFile
    public final long getFilePointer() {
        return (this.f13493d - this.f13491b) + this.f13492c;
    }

    @Override // java.io.RandomAccessFile
    public final int read() {
        int i3 = this.f13492c;
        int i10 = this.f13491b;
        byte[] bArr = this.f13490a;
        if (i3 >= i10) {
            int read = read(bArr);
            if (read >= 0) {
                this.f13493d += read;
                this.f13491b = read;
                this.f13492c = 0;
            }
            if (read < 0) {
                return -1;
            }
        }
        if (this.f13491b == 0) {
            return -1;
        }
        int i11 = this.f13492c;
        this.f13492c = i11 + 1;
        return (bArr[i11] + UByte.MIN_VALUE) & 255;
    }

    @Override // java.io.RandomAccessFile
    public final void seek(long j) {
        int i3;
        int i10 = (int) (this.f13493d - j);
        if (i10 >= 0 && i10 <= (i3 = this.f13491b)) {
            this.f13492c = i3 - i10;
            return;
        }
        super.seek(j);
        this.f13491b = 0;
        this.f13492c = 0;
        this.f13493d = super.getFilePointer();
    }

    @Override // java.io.RandomAccessFile
    public final int read(byte[] bArr, int i3, int i10) {
        int i11 = 0;
        while (true) {
            int i12 = this.f13491b;
            int i13 = this.f13492c;
            int i14 = i12 - i13;
            byte[] bArr2 = this.f13490a;
            if (i10 <= i14) {
                System.arraycopy(bArr2, i13, bArr, i3, i10);
                this.f13492c += i10;
                return i11 + i10;
            }
            System.arraycopy(bArr2, i13, bArr, i3, i14);
            i11 += i14;
            this.f13492c += i14;
            int read = read(bArr2);
            if (read >= 0) {
                this.f13493d += read;
                this.f13491b = read;
                this.f13492c = 0;
            }
            if (read <= 0) {
                if (i11 == 0) {
                    return -1;
                }
                return i11;
            }
            i3 += i14;
            i10 -= i14;
        }
    }
}
