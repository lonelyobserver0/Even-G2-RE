package e5;

import aa.C0398e;
import com.stub.StubApp;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class l implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f13624g = Logger.getLogger(l.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f13625a;

    /* renamed from: b, reason: collision with root package name */
    public int f13626b;

    /* renamed from: c, reason: collision with root package name */
    public int f13627c;

    /* renamed from: d, reason: collision with root package name */
    public i f13628d;

    /* renamed from: e, reason: collision with root package name */
    public i f13629e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f13630f;

    public l(File file) {
        byte[] bArr = new byte[16];
        this.f13630f = bArr;
        boolean exists = file.exists();
        String string2 = StubApp.getString2(17307);
        if (!exists) {
            File file2 = new File(file.getPath() + StubApp.getString2(6465));
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, string2);
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i3 = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    I(i3, iArr[i10], bArr2);
                    i3 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException(StubApp.getString2(17308));
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, string2);
        this.f13625a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int p8 = p(0, bArr);
        this.f13626b = p8;
        if (p8 > randomAccessFile2.length()) {
            throw new IOException(StubApp.getString2(17309) + this.f13626b + StubApp.getString2(17310) + randomAccessFile2.length());
        }
        this.f13627c = p(4, bArr);
        int p9 = p(8, bArr);
        int p10 = p(12, bArr);
        this.f13628d = k(p9);
        this.f13629e = k(p10);
    }

    public static void I(int i3, int i10, byte[] bArr) {
        bArr[i3] = (byte) (i10 >> 24);
        bArr[i3 + 1] = (byte) (i10 >> 16);
        bArr[i3 + 2] = (byte) (i10 >> 8);
        bArr[i3 + 3] = (byte) i10;
    }

    public static int p(int i3, byte[] bArr) {
        return ((bArr[i3] & UByte.MAX_VALUE) << 24) + ((bArr[i3 + 1] & UByte.MAX_VALUE) << 16) + ((bArr[i3 + 2] & UByte.MAX_VALUE) << 8) + (bArr[i3 + 3] & UByte.MAX_VALUE);
    }

    public final void A(int i3, int i10, byte[] bArr, int i11) {
        int G4 = G(i3);
        int i12 = G4 + i11;
        int i13 = this.f13626b;
        RandomAccessFile randomAccessFile = this.f13625a;
        if (i12 <= i13) {
            randomAccessFile.seek(G4);
            randomAccessFile.readFully(bArr, i10, i11);
            return;
        }
        int i14 = i13 - G4;
        randomAccessFile.seek(G4);
        randomAccessFile.readFully(bArr, i10, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i10 + i14, i11 - i14);
    }

    public final void C(int i3, int i10, byte[] bArr) {
        int G4 = G(i3);
        int i11 = G4 + i10;
        int i12 = this.f13626b;
        RandomAccessFile randomAccessFile = this.f13625a;
        if (i11 <= i12) {
            randomAccessFile.seek(G4);
            randomAccessFile.write(bArr, 0, i10);
            return;
        }
        int i13 = i12 - G4;
        randomAccessFile.seek(G4);
        randomAccessFile.write(bArr, 0, i13);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i13, i10 - i13);
    }

    public final int F() {
        if (this.f13627c == 0) {
            return 16;
        }
        i iVar = this.f13629e;
        int i3 = iVar.f13619a;
        int i10 = this.f13628d.f13619a;
        return i3 >= i10 ? (i3 - i10) + 4 + iVar.f13620b + 16 : (((i3 + 4) + iVar.f13620b) + this.f13626b) - i10;
    }

    public final int G(int i3) {
        int i10 = this.f13626b;
        return i3 < i10 ? i3 : (i3 + 16) - i10;
    }

    public final void H(int i3, int i10, int i11, int i12) {
        int[] iArr = {i3, i10, i11, i12};
        byte[] bArr = this.f13630f;
        int i13 = 0;
        for (int i14 = 0; i14 < 4; i14++) {
            I(i13, iArr[i14], bArr);
            i13 += 4;
        }
        RandomAccessFile randomAccessFile = this.f13625a;
        randomAccessFile.seek(0L);
        randomAccessFile.write(bArr);
    }

    public final void a(byte[] bArr) {
        int G4;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    d(length);
                    boolean h2 = h();
                    if (h2) {
                        G4 = 16;
                    } else {
                        i iVar = this.f13629e;
                        G4 = G(iVar.f13619a + 4 + iVar.f13620b);
                    }
                    i iVar2 = new i(G4, length);
                    I(0, length, this.f13630f);
                    C(G4, 4, this.f13630f);
                    C(G4 + 4, length, bArr);
                    H(this.f13626b, this.f13627c + 1, h2 ? G4 : this.f13628d.f13619a, G4);
                    this.f13629e = iVar2;
                    this.f13627c++;
                    if (h2) {
                        this.f13628d = iVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f13625a.close();
    }

    public final void d(int i3) {
        int i10 = i3 + 4;
        int F3 = this.f13626b - F();
        if (F3 >= i10) {
            return;
        }
        int i11 = this.f13626b;
        do {
            F3 += i11;
            i11 <<= 1;
        } while (F3 < i10);
        RandomAccessFile randomAccessFile = this.f13625a;
        randomAccessFile.setLength(i11);
        randomAccessFile.getChannel().force(true);
        i iVar = this.f13629e;
        int G4 = G(iVar.f13619a + 4 + iVar.f13620b);
        if (G4 < this.f13628d.f13619a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f13626b);
            long j = G4 - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError(StubApp.getString2(17311));
            }
        }
        int i12 = this.f13629e.f13619a;
        int i13 = this.f13628d.f13619a;
        if (i12 < i13) {
            int i14 = (this.f13626b + i12) - 16;
            H(i11, this.f13627c, i13, i14);
            this.f13629e = new i(i14, this.f13629e.f13620b);
        } else {
            H(i11, this.f13627c, i13, i12);
        }
        this.f13626b = i11;
    }

    public final synchronized void e(k kVar) {
        int i3 = this.f13628d.f13619a;
        for (int i10 = 0; i10 < this.f13627c; i10++) {
            i k3 = k(i3);
            kVar.a(new j(this, k3), k3.f13620b);
            i3 = G(k3.f13619a + 4 + k3.f13620b);
        }
    }

    public final synchronized boolean h() {
        return this.f13627c == 0;
    }

    public final i k(int i3) {
        if (i3 == 0) {
            return i.f13618c;
        }
        RandomAccessFile randomAccessFile = this.f13625a;
        randomAccessFile.seek(i3);
        return new i(i3, randomAccessFile.readInt());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(l.class.getSimpleName());
        sb2.append(StubApp.getString2(17312));
        sb2.append(this.f13626b);
        sb2.append(StubApp.getString2(14652));
        sb2.append(this.f13627c);
        sb2.append(StubApp.getString2(17313));
        sb2.append(this.f13628d);
        sb2.append(StubApp.getString2(17314));
        sb2.append(this.f13629e);
        sb2.append(StubApp.getString2(17315));
        try {
            C0398e c0398e = new C0398e();
            c0398e.f9344b = sb2;
            c0398e.f9343a = true;
            e(c0398e);
        } catch (IOException e10) {
            f13624g.log(Level.WARNING, StubApp.getString2(17316), (Throwable) e10);
        }
        sb2.append(StubApp.getString2(17317));
        return sb2.toString();
    }

    public final synchronized void v() {
        if (h()) {
            throw new NoSuchElementException();
        }
        if (this.f13627c == 1) {
            synchronized (this) {
                H(4096, 0, 0, 0);
                this.f13627c = 0;
                i iVar = i.f13618c;
                this.f13628d = iVar;
                this.f13629e = iVar;
                if (this.f13626b > 4096) {
                    RandomAccessFile randomAccessFile = this.f13625a;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.f13626b = 4096;
            }
        } else {
            i iVar2 = this.f13628d;
            int G4 = G(iVar2.f13619a + 4 + iVar2.f13620b);
            A(G4, 0, this.f13630f, 4);
            int p8 = p(0, this.f13630f);
            H(this.f13626b, this.f13627c - 1, G4, this.f13629e.f13619a);
            this.f13627c--;
            this.f13628d = new i(G4, p8);
        }
    }
}
