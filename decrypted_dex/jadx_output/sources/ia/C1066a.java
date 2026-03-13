package ia;

import com.stub.StubApp;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.ArrayList;
import kotlin.UByte;
import kotlin.UShort;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: ia.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1066a implements DataInput {

    /* renamed from: a, reason: collision with root package name */
    public ByteOrder f14961a = ByteOrder.BIG_ENDIAN;

    /* renamed from: b, reason: collision with root package name */
    public long f14962b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f14963c = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14964d = false;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f14965e = new byte[8];

    /* renamed from: f, reason: collision with root package name */
    public final InputStream f14966f;

    /* renamed from: g, reason: collision with root package name */
    public final Cc.a f14967g;

    public C1066a(InputStream inputStream) {
        Cc.a aVar = new Cc.a(6);
        aVar.f1189c = new ArrayList();
        this.f14967g = aVar;
        this.f14966f = inputStream;
    }

    public final void a() {
        if (this.f14964d) {
            throw new IOException(StubApp.getString2(18608));
        }
    }

    public final void b(long j) {
        a();
        if (j < 0) {
            throw new IllegalArgumentException(StubApp.getString2(18609));
        }
        this.f14963c = 0;
        this.f14962b = j;
    }

    public final void finalize() {
        if (this.f14964d) {
            return;
        }
        try {
            a();
            this.f14964d = true;
            Cc.a aVar = this.f14967g;
            ((ArrayList) aVar.f1189c).clear();
            aVar.f1188b = 0L;
        } finally {
            super.finalize();
        }
    }

    public final int read() {
        this.f14963c = 0;
        long j = this.f14962b;
        Cc.a aVar = this.f14967g;
        long j3 = aVar.f1188b;
        if (j >= j3) {
            int i3 = (int) ((j - j3) + 1);
            if (aVar.E(this.f14966f, i3) < i3) {
                return -1;
            }
        }
        long j10 = this.f14962b;
        int i10 = j10 < aVar.f1188b ? ((byte[]) ((ArrayList) aVar.f1189c).get((int) (j10 >> 9)))[(int) (j10 & 511)] & UByte.MAX_VALUE : -1;
        if (i10 >= 0) {
            this.f14962b++;
        }
        return i10;
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        int read = read();
        if (read >= 0) {
            return read != 0;
        }
        throw new EOFException(StubApp.getString2(18610));
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        int read = read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException(StubApp.getString2(18610));
    }

    @Override // java.io.DataInput
    public final char readChar() {
        return (char) readShort();
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
        if (i3 < 0 || i10 < 0 || i3 + i10 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        while (i10 > 0) {
            int read = read(bArr, i3, i10);
            if (read == -1) {
                throw new EOFException();
            }
            i3 += read;
            i10 -= read;
        }
    }

    @Override // java.io.DataInput
    public final int readInt() {
        int i3;
        byte b2;
        byte[] bArr = this.f14965e;
        if (read(bArr, 0, 4) < 0) {
            throw new EOFException();
        }
        if (this.f14961a == ByteOrder.BIG_ENDIAN) {
            i3 = ((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16) | ((bArr[2] & UByte.MAX_VALUE) << 8);
            b2 = bArr[3];
        } else {
            i3 = ((bArr[3] & UByte.MAX_VALUE) << 24) | ((bArr[2] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8);
            b2 = bArr[0];
        }
        return i3 | (b2 & UByte.MAX_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        r1 = false;
     */
    @Override // java.io.DataInput
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String readLine() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 80
            r0.<init>(r1)
            r1 = 1
        L8:
            int r2 = r7.read()
            r3 = -1
            if (r2 == r3) goto L34
            r1 = 10
            r4 = 0
            if (r2 != r1) goto L15
            goto L2c
        L15:
            r5 = 13
            if (r2 != r5) goto L2e
            int r2 = r7.read()
            if (r2 == r1) goto L2c
            if (r2 == r3) goto L2c
            r7.a()
            long r1 = r7.f14962b
            r5 = 1
            long r1 = r1 - r5
            r7.b(r1)
        L2c:
            r1 = r4
            goto L34
        L2e:
            char r1 = (char) r2
            r0.append(r1)
            r1 = r4
            goto L8
        L34:
            if (r1 == 0) goto L38
            r0 = 0
            return r0
        L38:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.C1066a.readLine():java.lang.String");
    }

    @Override // java.io.DataInput
    public final long readLong() {
        byte[] bArr = this.f14965e;
        if (read(bArr, 0, 8) < 0) {
            throw new EOFException();
        }
        if (this.f14961a == ByteOrder.BIG_ENDIAN) {
            return (((((((bArr[0] & UByte.MAX_VALUE) << 24) | ((bArr[1] & UByte.MAX_VALUE) << 16)) | ((bArr[2] & UByte.MAX_VALUE) << 8)) | (bArr[3] & UByte.MAX_VALUE)) & BodyPartID.bodyIdMax) << 32) | (((bArr[7] & UByte.MAX_VALUE) | ((bArr[6] & UByte.MAX_VALUE) << 8) | ((bArr[4] & UByte.MAX_VALUE) << 24) | ((bArr[5] & UByte.MAX_VALUE) << 16)) & BodyPartID.bodyIdMax);
        }
        return (((bArr[0] & UByte.MAX_VALUE) | ((bArr[3] & UByte.MAX_VALUE) << 24) | ((bArr[2] & UByte.MAX_VALUE) << 16) | ((bArr[1] & UByte.MAX_VALUE) << 8)) & BodyPartID.bodyIdMax) | ((((bArr[4] & UByte.MAX_VALUE) | (((bArr[5] & UByte.MAX_VALUE) << 8) | (((bArr[7] & UByte.MAX_VALUE) << 24) | ((bArr[6] & UByte.MAX_VALUE) << 16)))) & BodyPartID.bodyIdMax) << 32);
    }

    @Override // java.io.DataInput
    public final short readShort() {
        int i3;
        byte b2;
        byte[] bArr = this.f14965e;
        if (read(bArr, 0, 2) < 0) {
            throw new EOFException();
        }
        if (this.f14961a == ByteOrder.BIG_ENDIAN) {
            i3 = bArr[0] << 8;
            b2 = bArr[1];
        } else {
            i3 = bArr[1] << 8;
            b2 = bArr[0];
        }
        return (short) (i3 | (b2 & UByte.MAX_VALUE));
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        ByteOrder byteOrder = this.f14961a;
        this.f14961a = ByteOrder.BIG_ENDIAN;
        int readUnsignedShort = readUnsignedShort();
        char[] cArr = new char[readUnsignedShort];
        readFully(new byte[readUnsignedShort], 0, readUnsignedShort);
        this.f14961a = byteOrder;
        return new DataInputStream(new ByteArrayInputStream(this.f14965e)).readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        int read = read();
        if (read >= 0) {
            return read;
        }
        throw new EOFException(StubApp.getString2(18610));
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        return readShort() & UShort.MAX_VALUE;
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i3) {
        long j = i3;
        a();
        b(this.f14962b + j);
        return (int) j;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        readFully(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i3, int i10) {
        int i11 = 0;
        this.f14963c = 0;
        long j = this.f14962b;
        Cc.a aVar = this.f14967g;
        long j3 = aVar.f1188b;
        if (j >= j3) {
            aVar.E(this.f14966f, (int) ((j - j3) + i10));
        }
        long j10 = this.f14962b;
        aVar.getClass();
        if (i10 > bArr.length - i3 || i10 < 0 || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 != 0) {
            long j11 = aVar.f1188b;
            if (j10 >= j11) {
                i11 = -1;
            } else {
                if (i10 + j10 > j11) {
                    i10 = (int) (j11 - j10);
                }
                byte[] bArr2 = (byte[]) ((ArrayList) aVar.f1189c).get((int) (j10 >> 9));
                int i12 = (int) (j10 & 511);
                int min = Math.min(i10, 512 - i12);
                System.arraycopy(bArr2, i12, bArr, i3, min);
                i11 = min;
            }
        }
        if (i11 > 0) {
            this.f14962b += i11;
        }
        return i11;
    }
}
