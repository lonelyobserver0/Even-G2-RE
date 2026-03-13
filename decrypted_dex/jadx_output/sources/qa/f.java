package qa;

import Xa.h;
import com.stub.StubApp;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class f implements InterfaceC1533d, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final int f20120a;

    /* renamed from: b, reason: collision with root package name */
    public e f20121b;

    /* renamed from: d, reason: collision with root package name */
    public int f20123d;

    /* renamed from: e, reason: collision with root package name */
    public long f20124e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f20125f;

    /* renamed from: g, reason: collision with root package name */
    public int f20126g;

    /* renamed from: c, reason: collision with root package name */
    public long f20122c = 0;

    /* renamed from: h, reason: collision with root package name */
    public boolean f20127h = false;
    public int[] j = new int[16];

    /* renamed from: k, reason: collision with root package name */
    public int f20128k = 0;

    public f(e eVar) {
        eVar.a();
        this.f20121b = eVar;
        this.f20120a = 4096;
        a();
    }

    public final void a() {
        int nextSetBit;
        int i3 = this.f20128k;
        int i10 = i3 + 1;
        int[] iArr = this.j;
        if (i10 >= iArr.length) {
            int length = iArr.length * 2;
            if (length < iArr.length) {
                if (iArr.length == Integer.MAX_VALUE) {
                    throw new IOException(StubApp.getString2(22340));
                }
                length = Integer.MAX_VALUE;
            }
            int[] iArr2 = new int[length];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.j = iArr2;
        }
        e eVar = this.f20121b;
        synchronized (eVar.f20114c) {
            try {
                nextSetBit = eVar.f20114c.nextSetBit(0);
                if (nextSetBit < 0) {
                    eVar.d();
                    nextSetBit = eVar.f20114c.nextSetBit(0);
                    if (nextSetBit < 0) {
                        throw new IOException(StubApp.getString2("22341"));
                    }
                }
                eVar.f20114c.clear(nextSetBit);
                if (nextSetBit >= eVar.f20113b) {
                    eVar.f20113b = nextSetBit + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr3 = this.j;
        int i11 = this.f20128k;
        iArr3[i11] = nextSetBit;
        this.f20123d = i11;
        int i12 = this.f20120a;
        this.f20124e = i11 * i12;
        this.f20128k = i11 + 1;
        this.f20125f = new byte[i12];
        this.f20126g = 0;
    }

    @Override // qa.InterfaceC1533d
    public final boolean c() {
        d();
        return this.f20124e + ((long) this.f20126g) >= this.f20122c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        e eVar = this.f20121b;
        if (eVar != null) {
            int[] iArr = this.j;
            int i3 = this.f20128k;
            synchronized (eVar.f20114c) {
                for (int i10 = 0; i10 < i3; i10++) {
                    try {
                        int i11 = iArr[i10];
                        if (i11 >= 0 && i11 < eVar.f20113b && !eVar.f20114c.get(i11)) {
                            eVar.f20114c.set(i11);
                            if (i11 < eVar.f20116e) {
                                eVar.f20115d[i11] = null;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f20121b = null;
            this.j = null;
            this.f20125f = null;
            this.f20124e = 0L;
            this.f20123d = -1;
            this.f20126g = 0;
            this.f20122c = 0L;
        }
    }

    public final void d() {
        e eVar = this.f20121b;
        if (eVar == null) {
            throw new IOException(StubApp.getString2(22342));
        }
        eVar.a();
    }

    public final boolean e(boolean z2) {
        int i3 = this.f20126g;
        int i10 = this.f20120a;
        if (i3 < i10) {
            return true;
        }
        if (this.f20127h) {
            this.f20121b.h(this.j[this.f20123d], this.f20125f);
            this.f20127h = false;
        }
        int i11 = this.f20123d + 1;
        if (i11 >= this.f20128k) {
            if (!z2) {
                return false;
            }
            a();
            return true;
        }
        e eVar = this.f20121b;
        int[] iArr = this.j;
        this.f20123d = i11;
        this.f20125f = eVar.e(iArr[i11]);
        this.f20124e = this.f20123d * i10;
        this.f20126g = 0;
        return true;
    }

    public final void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // qa.InterfaceC1533d
    public final long getPosition() {
        d();
        return this.f20124e + this.f20126g;
    }

    public final void h(byte[] bArr, int i3, int i10) {
        d();
        while (i10 > 0) {
            e(true);
            int min = Math.min(i10, this.f20120a - this.f20126g);
            System.arraycopy(bArr, i3, this.f20125f, this.f20126g, min);
            this.f20126g += min;
            this.f20127h = true;
            i3 += min;
            i10 -= min;
        }
        long j = this.f20124e + this.f20126g;
        if (j > this.f20122c) {
            this.f20122c = j;
        }
    }

    @Override // qa.InterfaceC1533d
    public final long length() {
        return this.f20122c;
    }

    @Override // qa.InterfaceC1533d
    public final int read() {
        d();
        if (this.f20124e + this.f20126g >= this.f20122c) {
            return -1;
        }
        if (!e(false)) {
            throw new IOException(StubApp.getString2(22343));
        }
        byte[] bArr = this.f20125f;
        int i3 = this.f20126g;
        this.f20126g = i3 + 1;
        return bArr[i3] & UByte.MAX_VALUE;
    }

    @Override // qa.InterfaceC1533d
    public final void seek(long j) {
        d();
        if (j > this.f20122c) {
            throw new EOFException();
        }
        if (j < 0) {
            throw new IOException(h.h(j, StubApp.getString2(22344)));
        }
        long j3 = this.f20124e;
        int i3 = this.f20120a;
        if (j >= j3 && j <= i3 + j3) {
            this.f20126g = (int) (j - j3);
            return;
        }
        if (this.f20127h) {
            this.f20121b.h(this.j[this.f20123d], this.f20125f);
            this.f20127h = false;
        }
        long j10 = i3;
        int i10 = (int) (j / j10);
        if (j % j10 == 0 && j == this.f20122c) {
            i10--;
        }
        this.f20125f = this.f20121b.e(this.j[i10]);
        this.f20123d = i10;
        long j11 = i10 * j10;
        this.f20124e = j11;
        this.f20126g = (int) (j - j11);
    }

    @Override // qa.InterfaceC1533d
    public final int read(byte[] bArr, int i3, int i10) {
        d();
        long j = this.f20124e + this.f20126g;
        long j3 = this.f20122c;
        if (j >= j3) {
            return -1;
        }
        int min = (int) Math.min(i10, j3 - j);
        int i11 = 0;
        while (min > 0) {
            if (e(false)) {
                int min2 = Math.min(min, this.f20120a - this.f20126g);
                System.arraycopy(this.f20125f, this.f20126g, bArr, i3, min2);
                this.f20126g += min2;
                i11 += min2;
                i3 += min2;
                min -= min2;
            } else {
                throw new IOException(StubApp.getString2(22343));
            }
        }
        return i11;
    }
}
