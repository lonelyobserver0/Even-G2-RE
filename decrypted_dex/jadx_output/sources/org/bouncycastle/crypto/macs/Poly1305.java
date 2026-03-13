package org.bouncycastle.crypto.macs;

import com.stub.StubApp;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Poly1305 implements Mac {
    private static final int BLOCK_SIZE = 16;
    private final BlockCipher cipher;
    private final byte[] currentBlock;
    private int currentBlockOffset;
    private int h0;

    /* renamed from: h1, reason: collision with root package name */
    private int f18990h1;
    private int h2;

    /* renamed from: h3, reason: collision with root package name */
    private int f18991h3;
    private int h4;

    /* renamed from: k0, reason: collision with root package name */
    private int f18992k0;

    /* renamed from: k1, reason: collision with root package name */
    private int f18993k1;

    /* renamed from: k2, reason: collision with root package name */
    private int f18994k2;
    private int k3;

    /* renamed from: r0, reason: collision with root package name */
    private int f18995r0;

    /* renamed from: r1, reason: collision with root package name */
    private int f18996r1;

    /* renamed from: r2, reason: collision with root package name */
    private int f18997r2;

    /* renamed from: r3, reason: collision with root package name */
    private int f18998r3;

    /* renamed from: r4, reason: collision with root package name */
    private int f18999r4;

    /* renamed from: s1, reason: collision with root package name */
    private int f19000s1;

    /* renamed from: s2, reason: collision with root package name */
    private int f19001s2;

    /* renamed from: s3, reason: collision with root package name */
    private int f19002s3;

    /* renamed from: s4, reason: collision with root package name */
    private int f19003s4;
    private final byte[] singleByte;

    public Poly1305() {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        this.cipher = null;
    }

    private static final long mul32x32_64(int i3, int i10) {
        return (i3 & BodyPartID.bodyIdMax) * i10;
    }

    private void processBlock() {
        int i3 = this.currentBlockOffset;
        if (i3 < 16) {
            this.currentBlock[i3] = 1;
            for (int i10 = i3 + 1; i10 < 16; i10++) {
                this.currentBlock[i10] = 0;
            }
        }
        long littleEndianToInt = Pack.littleEndianToInt(this.currentBlock, 0);
        long j = littleEndianToInt & BodyPartID.bodyIdMax;
        long littleEndianToInt2 = Pack.littleEndianToInt(this.currentBlock, 4) & BodyPartID.bodyIdMax;
        long littleEndianToInt3 = Pack.littleEndianToInt(this.currentBlock, 8) & BodyPartID.bodyIdMax;
        long littleEndianToInt4 = BodyPartID.bodyIdMax & Pack.littleEndianToInt(this.currentBlock, 12);
        int i11 = (int) (this.h0 + (littleEndianToInt & 67108863));
        this.h0 = i11;
        this.f18990h1 = (int) (this.f18990h1 + ((((littleEndianToInt2 << 32) | j) >>> 26) & 67108863));
        this.h2 = (int) (this.h2 + (((littleEndianToInt2 | (littleEndianToInt3 << 32)) >>> 20) & 67108863));
        this.f18991h3 = (int) (this.f18991h3 + ((((littleEndianToInt4 << 32) | littleEndianToInt3) >>> 14) & 67108863));
        int i12 = (int) (this.h4 + (littleEndianToInt4 >>> 8));
        this.h4 = i12;
        if (this.currentBlockOffset == 16) {
            this.h4 = i12 + 16777216;
        }
        long mul32x32_64 = mul32x32_64(i11, this.f18995r0) + mul32x32_64(this.f18990h1, this.f19003s4) + mul32x32_64(this.h2, this.f19002s3) + mul32x32_64(this.f18991h3, this.f19001s2) + mul32x32_64(this.h4, this.f19000s1);
        long mul32x32_642 = mul32x32_64(this.h0, this.f18996r1) + mul32x32_64(this.f18990h1, this.f18995r0) + mul32x32_64(this.h2, this.f19003s4) + mul32x32_64(this.f18991h3, this.f19002s3) + mul32x32_64(this.h4, this.f19001s2);
        long mul32x32_643 = mul32x32_64(this.h0, this.f18997r2) + mul32x32_64(this.f18990h1, this.f18996r1) + mul32x32_64(this.h2, this.f18995r0) + mul32x32_64(this.f18991h3, this.f19003s4) + mul32x32_64(this.h4, this.f19002s3);
        long mul32x32_644 = mul32x32_64(this.h0, this.f18998r3) + mul32x32_64(this.f18990h1, this.f18997r2) + mul32x32_64(this.h2, this.f18996r1) + mul32x32_64(this.f18991h3, this.f18995r0) + mul32x32_64(this.h4, this.f19003s4);
        long mul32x32_645 = mul32x32_64(this.h0, this.f18999r4) + mul32x32_64(this.f18990h1, this.f18998r3) + mul32x32_64(this.h2, this.f18997r2) + mul32x32_64(this.f18991h3, this.f18996r1) + mul32x32_64(this.h4, this.f18995r0);
        long j3 = mul32x32_642 + (mul32x32_64 >>> 26);
        long j10 = mul32x32_643 + (j3 >>> 26);
        this.h2 = ((int) j10) & 67108863;
        long j11 = mul32x32_644 + (j10 >>> 26);
        this.f18991h3 = ((int) j11) & 67108863;
        long j12 = mul32x32_645 + (j11 >>> 26);
        this.h4 = ((int) j12) & 67108863;
        int i13 = (((int) (j12 >>> 26)) * 5) + (((int) mul32x32_64) & 67108863);
        this.f18990h1 = (((int) j3) & 67108863) + (i13 >>> 26);
        this.h0 = i13 & 67108863;
    }

    private void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException(StubApp.getString2(28983));
        }
        int i3 = 16;
        if (this.cipher != null && (bArr2 == null || bArr2.length != 16)) {
            throw new IllegalArgumentException(StubApp.getString2(29044));
        }
        int littleEndianToInt = Pack.littleEndianToInt(bArr, 0);
        int littleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
        int littleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
        int littleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
        this.f18995r0 = 67108863 & littleEndianToInt;
        int i10 = ((littleEndianToInt >>> 26) | (littleEndianToInt2 << 6)) & 67108611;
        this.f18996r1 = i10;
        int i11 = ((littleEndianToInt2 >>> 20) | (littleEndianToInt3 << 12)) & 67092735;
        this.f18997r2 = i11;
        int i12 = ((littleEndianToInt3 >>> 14) | (littleEndianToInt4 << 18)) & 66076671;
        this.f18998r3 = i12;
        int i13 = (littleEndianToInt4 >>> 8) & 1048575;
        this.f18999r4 = i13;
        this.f19000s1 = i10 * 5;
        this.f19001s2 = i11 * 5;
        this.f19002s3 = i12 * 5;
        this.f19003s4 = i13 * 5;
        BlockCipher blockCipher = this.cipher;
        if (blockCipher != null) {
            byte[] bArr3 = new byte[16];
            blockCipher.init(true, new KeyParameter(bArr, 16, 16));
            this.cipher.processBlock(bArr2, 0, bArr3, 0);
            i3 = 0;
            bArr = bArr3;
        }
        this.f18992k0 = Pack.littleEndianToInt(bArr, i3);
        this.f18993k1 = Pack.littleEndianToInt(bArr, i3 + 4);
        this.f18994k2 = Pack.littleEndianToInt(bArr, i3 + 8);
        this.k3 = Pack.littleEndianToInt(bArr, i3 + 12);
    }

    @Override // org.bouncycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i3) throws DataLengthException, IllegalStateException {
        if (i3 + 16 > bArr.length) {
            throw new OutputLengthException(StubApp.getString2(29045));
        }
        if (this.currentBlockOffset > 0) {
            processBlock();
        }
        int i10 = this.f18990h1;
        int i11 = this.h0;
        int i12 = i10 + (i11 >>> 26);
        int i13 = this.h2 + (i12 >>> 26);
        int i14 = this.f18991h3 + (i13 >>> 26);
        int i15 = i13 & 67108863;
        int i16 = this.h4 + (i14 >>> 26);
        int i17 = i14 & 67108863;
        int i18 = ((i16 >>> 26) * 5) + (i11 & 67108863);
        int i19 = i16 & 67108863;
        int i20 = (i12 & 67108863) + (i18 >>> 26);
        int i21 = i18 & 67108863;
        int i22 = i21 + 5;
        int i23 = (i22 >>> 26) + i20;
        int i24 = (i23 >>> 26) + i15;
        int i25 = (i24 >>> 26) + i17;
        int i26 = 67108863 & i25;
        int i27 = ((i25 >>> 26) + i19) - 67108864;
        int i28 = (i27 >>> 31) - 1;
        int i29 = ~i28;
        this.h0 = (i21 & i29) | (i22 & 67108863 & i28);
        this.f18990h1 = (i20 & i29) | (i23 & 67108863 & i28);
        this.h2 = (i15 & i29) | (i24 & 67108863 & i28);
        this.f18991h3 = (i26 & i28) | (i17 & i29);
        this.h4 = (i19 & i29) | (i27 & i28);
        long j = (((r3 << 26) | r8) & BodyPartID.bodyIdMax) + (this.f18992k0 & BodyPartID.bodyIdMax);
        long j3 = (((r3 >>> 6) | (r6 << 20)) & BodyPartID.bodyIdMax) + (this.f18993k1 & BodyPartID.bodyIdMax);
        long j10 = (((r6 >>> 12) | (r5 << 14)) & BodyPartID.bodyIdMax) + (this.f18994k2 & BodyPartID.bodyIdMax);
        long j11 = (((r5 >>> 18) | (r4 << 8)) & BodyPartID.bodyIdMax) + (this.k3 & BodyPartID.bodyIdMax);
        Pack.intToLittleEndian((int) j, bArr, i3);
        long j12 = j3 + (j >>> 32);
        Pack.intToLittleEndian((int) j12, bArr, i3 + 4);
        long j13 = j10 + (j12 >>> 32);
        Pack.intToLittleEndian((int) j13, bArr, i3 + 8);
        Pack.intToLittleEndian((int) (j11 + (j13 >>> 32)), bArr, i3 + 12);
        reset();
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public String getAlgorithmName() {
        if (this.cipher == null) {
            return StubApp.getString2(29046);
        }
        return StubApp.getString2(29047) + this.cipher.getAlgorithmName();
    }

    @Override // org.bouncycastle.crypto.Mac
    public int getMacSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) throws IllegalArgumentException {
        byte[] bArr;
        if (this.cipher == null) {
            bArr = null;
        } else {
            if (!(cipherParameters instanceof ParametersWithIV)) {
                throw new IllegalArgumentException(StubApp.getString2(29048));
            }
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            bArr = parametersWithIV.getIV();
            cipherParameters = parametersWithIV.getParameters();
        }
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException(StubApp.getString2(29049));
        }
        setKey(((KeyParameter) cipherParameters).getKey(), bArr);
        reset();
    }

    @Override // org.bouncycastle.crypto.Mac
    public void reset() {
        this.currentBlockOffset = 0;
        this.h4 = 0;
        this.f18991h3 = 0;
        this.h2 = 0;
        this.f18990h1 = 0;
        this.h0 = 0;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte b2) throws IllegalStateException {
        byte[] bArr = this.singleByte;
        bArr[0] = b2;
        update(bArr, 0, 1);
    }

    public Poly1305(BlockCipher blockCipher) {
        this.singleByte = new byte[1];
        this.currentBlock = new byte[16];
        this.currentBlockOffset = 0;
        if (blockCipher.getBlockSize() != 16) {
            throw new IllegalArgumentException(StubApp.getString2(29043));
        }
        this.cipher = blockCipher;
    }

    @Override // org.bouncycastle.crypto.Mac
    public void update(byte[] bArr, int i3, int i10) throws DataLengthException, IllegalStateException {
        int i11 = 0;
        while (i10 > i11) {
            if (this.currentBlockOffset == 16) {
                processBlock();
                this.currentBlockOffset = 0;
            }
            int min = Math.min(i10 - i11, 16 - this.currentBlockOffset);
            System.arraycopy(bArr, i11 + i3, this.currentBlock, this.currentBlockOffset, min);
            i11 += min;
            this.currentBlockOffset += min;
        }
    }
}
