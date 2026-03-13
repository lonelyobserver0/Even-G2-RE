package ra;

import java.io.BufferedOutputStream;

/* renamed from: ra.b, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1583b extends BufferedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20502a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20503b;

    /* renamed from: c, reason: collision with root package name */
    public int f20504c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20505d;

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final synchronized void flush() {
        try {
            if (this.f20502a && !this.f20503b) {
                write(13);
                this.f20504c++;
            }
            this.f20502a = false;
            this.f20503b = false;
            super.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i3, int i10) {
        try {
            if (this.f20504c == 0 && i10 > 10) {
                this.f20505d = false;
                for (int i11 = 0; i11 < 10; i11++) {
                    byte b2 = bArr[i11];
                    if (b2 >= 9 && (b2 <= 10 || b2 >= 32 || b2 == 13)) {
                    }
                    this.f20505d = true;
                    break;
                }
            }
            if (this.f20505d) {
                if (this.f20502a) {
                    this.f20502a = false;
                    if (!this.f20503b && i10 == 1 && bArr[i3] == 10) {
                        return;
                    } else {
                        write(13);
                    }
                }
                if (this.f20503b) {
                    write(10);
                    this.f20503b = false;
                }
                if (i10 > 0) {
                    byte b10 = bArr[(i3 + i10) - 1];
                    if (b10 == 13) {
                        this.f20502a = true;
                        i10--;
                    } else if (b10 == 10) {
                        this.f20503b = true;
                        int i12 = i10 - 1;
                        if (i12 <= 0 || bArr[(i3 + i12) - 1] != 13) {
                            i10 = i12;
                        } else {
                            this.f20502a = true;
                            i10 -= 2;
                        }
                    }
                }
            }
            super.write(bArr, i3, i10);
            this.f20504c += i10;
        } catch (Throwable th) {
            throw th;
        }
    }
}
