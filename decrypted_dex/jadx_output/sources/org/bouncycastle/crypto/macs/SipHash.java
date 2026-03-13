package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SipHash implements Mac {

    /* renamed from: c, reason: collision with root package name */
    protected final int f19004c;

    /* renamed from: d, reason: collision with root package name */
    protected final int f19005d;

    /* renamed from: k0, reason: collision with root package name */
    protected long f19006k0;

    /* renamed from: k1, reason: collision with root package name */
    protected long f19007k1;

    /* renamed from: m, reason: collision with root package name */
    protected long f19008m;

    /* renamed from: v0, reason: collision with root package name */
    protected long f19009v0;

    /* renamed from: v1, reason: collision with root package name */
    protected long f19010v1;
    protected long v2;

    /* renamed from: v3, reason: collision with root package name */
    protected long f19011v3;
    protected int wordCount;
    protected int wordPos;

    public SipHash() {
        this.f19008m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f19004c = 2;
        this.f19005d = 4;
    }

    public static long rotateLeft(long j, int i3) {
        return (j >>> (-i3)) | (j << i3);
    }

    public void applySipRounds(int i3) {
        long j = this.f19009v0;
        long j3 = this.f19010v1;
        long j10 = this.v2;
        long j11 = this.f19011v3;
        for (int i10 = 0; i10 < i3; i10++) {
            long j12 = j + j3;
            long j13 = j10 + j11;
            long rotateLeft = rotateLeft(j3, 13) ^ j12;
            long rotateLeft2 = rotateLeft(j11, 16) ^ j13;
            long j14 = j13 + rotateLeft;
            j = rotateLeft(j12, 32) + rotateLeft2;
            j3 = rotateLeft(rotateLeft, 17) ^ j14;
            j11 = rotateLeft(rotateLeft2, 21) ^ j;
            j10 = rotateLeft(j14, 32);
        }
        this.f19009v0 = j;
        this.f19010v1 = j3;
        this.v2 = j10;
        this.f19011v3 = j11;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i3) throws DataLengthException, IllegalStateException {
        Pack.longToLittleEndian(doFinal(), bArr, i3);
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        return StubApp.getString2(29052) + this.f19004c + StubApp.getString2(999) + this.f19005d;
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 8;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(StubApp.getString2(29054));
        }
        byte[] key = ((KeyParameter) cipherParameters).getKey();
        if (key.length != 16) {
            throw new IllegalArgumentException(StubApp.getString2(29053));
        }
        this.f19006k0 = Pack.littleEndianToLong(key, 0);
        this.f19007k1 = Pack.littleEndianToLong(key, 8);
        reset();
    }

    public void processMessageWord() {
        this.wordCount++;
        this.f19011v3 ^= this.f19008m;
        applySipRounds(this.f19004c);
        this.f19009v0 ^= this.f19008m;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        long j = this.f19006k0;
        this.f19009v0 = 8317987319222330741L ^ j;
        long j3 = this.f19007k1;
        this.f19010v1 = 7237128888997146477L ^ j3;
        this.v2 = j ^ 7816392313619706465L;
        this.f19011v3 = 8387220255154660723L ^ j3;
        this.f19008m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b2) throws IllegalStateException {
        this.f19008m = (this.f19008m >>> 8) | ((b2 & 255) << 56);
        int i3 = this.wordPos + 1;
        this.wordPos = i3;
        if (i3 == 8) {
            processMessageWord();
            this.wordPos = 0;
        }
    }

    public SipHash(int i3, int i10) {
        this.f19008m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f19004c = i3;
        this.f19005d = i10;
    }

    public long doFinal() throws DataLengthException, IllegalStateException {
        this.f19008m = ((this.f19008m >>> ((7 - this.wordPos) << 3)) >>> 8) | ((((this.wordCount << 3) + r2) & 255) << 56);
        processMessageWord();
        this.v2 ^= 255;
        applySipRounds(this.f19005d);
        long j = ((this.f19009v0 ^ this.f19010v1) ^ this.v2) ^ this.f19011v3;
        reset();
        return j;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalStateException {
        int i11 = i10 & (-8);
        int i12 = this.wordPos;
        char c10 = '8';
        long j = 255;
        int i13 = 0;
        if (i12 == 0) {
            while (i13 < i11) {
                this.f19008m = Pack.littleEndianToLong(bArr, i3 + i13);
                processMessageWord();
                i13 += 8;
            }
            while (i13 < i10) {
                long j3 = this.f19008m >>> 8;
                this.f19008m = j3;
                this.f19008m = j3 | ((bArr[i3 + i13] & 255) << 56);
                i13++;
            }
            this.wordPos = i10 - i11;
            return;
        }
        int i14 = i12 << 3;
        int i15 = 0;
        while (i15 < i11) {
            long littleEndianToLong = Pack.littleEndianToLong(bArr, i3 + i15);
            this.f19008m = (this.f19008m >>> (-i14)) | (littleEndianToLong << i14);
            processMessageWord();
            this.f19008m = littleEndianToLong;
            i15 += 8;
            c10 = c10;
            j = j;
        }
        char c11 = c10;
        long j10 = j;
        while (i15 < i10) {
            long j11 = this.f19008m >>> 8;
            this.f19008m = j11;
            this.f19008m = j11 | ((bArr[i3 + i15] & j10) << c11);
            int i16 = this.wordPos + 1;
            this.wordPos = i16;
            if (i16 == 8) {
                processMessageWord();
                this.wordPos = 0;
            }
            i15++;
        }
    }
}
