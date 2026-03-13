package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.pqc.math.linearalgebra.GF2mField;
import org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class HQCEngine {
    private int K_BYTE;
    private int K_BYTE_64;
    private int N1N2_BYTE;
    private int N1N2_BYTE_64;
    private int N1_BYTE;
    private int N1_BYTE_64;
    private int N_BYTE;
    private int N_BYTE_64;
    private int delta;
    private int fft;
    private GF2mField field;

    /* renamed from: g, reason: collision with root package name */
    private int f19409g;
    private int[] generatorPoly;

    /* renamed from: k, reason: collision with root package name */
    private int f19410k;
    private int mulParam;

    /* renamed from: n, reason: collision with root package name */
    private int f19411n;

    /* renamed from: n1, reason: collision with root package name */
    private int f19412n1;
    private int n1n2;

    /* renamed from: n2, reason: collision with root package name */
    private int f19413n2;
    private PolynomialGF2mSmallM reductionPoly;
    private int rejectionThreshold;

    /* renamed from: w, reason: collision with root package name */
    private int f19414w;
    private int we;
    private int wr;
    private int SEED_SIZE = 40;
    private byte G_FCT_DOMAIN = 3;
    private byte H_FCT_DOMAIN = 4;
    private byte K_FCT_DOMAIN = 5;
    private int SHA512_BYTES = 64;

    public HQCEngine(int i3, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int[] iArr) {
        this.f19411n = i3;
        this.f19410k = i12;
        this.delta = i14;
        this.f19414w = i15;
        this.wr = i16;
        this.we = i17;
        this.f19412n1 = i10;
        this.f19413n2 = i11;
        int i20 = i10 * i11;
        this.n1n2 = i20;
        this.generatorPoly = iArr;
        this.f19409g = i13;
        this.rejectionThreshold = i18;
        this.fft = i19;
        this.mulParam = (int) Math.ceil(i11 / 128);
        this.N_BYTE = Utils.getByteSizeFromBitSize(i3);
        this.K_BYTE = i12;
        this.N_BYTE_64 = Utils.getByte64SizeFromBitSize(i3);
        this.K_BYTE_64 = Utils.getByteSizeFromBitSize(i12);
        this.N1_BYTE_64 = Utils.getByteSizeFromBitSize(i10);
        this.N1N2_BYTE_64 = Utils.getByte64SizeFromBitSize(i20);
        this.N1N2_BYTE = Utils.getByteSizeFromBitSize(i20);
        this.N1_BYTE = Utils.getByteSizeFromBitSize(i10);
        GF2mField gF2mField = new GF2mField(1);
        this.field = gF2mField;
        this.reductionPoly = new PolynomialGF2mSmallM(gF2mField, i3).addMonomial(0);
    }

    private void decrypt(long[] jArr, long[] jArr2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[this.f19411n];
        Utils.fromByteArrayToBitArray(bArr4, bArr);
        byte[] bArr5 = new byte[this.n1n2];
        Utils.fromByteArrayToBitArray(bArr5, bArr2);
        Utils.fromBitArrayToLongArray(new long[this.N_BYTE_64], bArr4);
        Utils.fromBitArrayToLongArray(new long[this.N1N2_BYTE_64], bArr5);
        PolynomialGF2mSmallM add = new PolynomialGF2mSmallM(this.field, Utils.removeLast0Bits(bArr5)).add(new PolynomialGF2mSmallM(this.field, Utils.removeLast0Bits(bArr4)).modKaratsubaMultiplyBigDeg(new PolynomialGF2mSmallM(this.field, Utils.removeLast0Bits(bArr3)), this.reductionPoly));
        long[] jArr3 = new long[this.N_BYTE_64];
        Utils.fromBitArrayToLongArray(jArr3, add.getEncoded());
        long[] jArr4 = new long[this.N1_BYTE_64];
        ReedMuller.decode(jArr4, jArr3, this.f19412n1, this.mulParam);
        ReedSolomon.decode(jArr2, jArr4, this.f19412n1, this.fft, this.delta, this.f19410k, this.f19409g);
        System.arraycopy(jArr2, 0, jArr, 0, jArr.length);
    }

    private void encrypt(long[] jArr, long[] jArr2, long[] jArr3, byte[] bArr, long[] jArr4, byte[] bArr2) {
        HQCKeccakRandomGenerator hQCKeccakRandomGenerator = new HQCKeccakRandomGenerator(256);
        hQCKeccakRandomGenerator.seedExpanderInit(bArr2, this.SEED_SIZE);
        int i3 = this.N_BYTE_64;
        long[] jArr5 = new long[i3];
        long[] jArr6 = new long[i3];
        int i10 = this.wr;
        int[] iArr = new int[i10];
        generateSecretKey(jArr6, hQCKeccakRandomGenerator, i10);
        generateSecretKeyByCoordinates(iArr, hQCKeccakRandomGenerator, this.wr);
        generateSecretKey(jArr5, hQCKeccakRandomGenerator, this.we);
        byte[] bArr3 = new byte[this.f19411n];
        Utils.fromLongArrayToBitArray(bArr3, jArr3);
        byte[] bArr4 = new byte[this.f19411n];
        Utils.fromLongArrayToBitArray(bArr4, jArr6);
        int i11 = this.f19411n;
        byte[] bArr5 = new byte[i11];
        byte[] fromListOfPos1ToBitArray = Utils.fromListOfPos1ToBitArray(iArr, i11);
        byte[] bArr6 = new byte[this.f19411n];
        Utils.fromLongArrayToBitArray(bArr6, jArr5);
        byte[] bArr7 = new byte[this.f19411n];
        Utils.fromByteArrayToBitArray(bArr7, bArr);
        PolynomialGF2mSmallM polynomialGF2mSmallM = new PolynomialGF2mSmallM(this.field, Utils.removeLast0Bits(bArr4));
        PolynomialGF2mSmallM polynomialGF2mSmallM2 = new PolynomialGF2mSmallM(this.field, Utils.removeLast0Bits(fromListOfPos1ToBitArray));
        Utils.fromBitArrayToLongArray(jArr, polynomialGF2mSmallM.add(polynomialGF2mSmallM2.modKaratsubaMultiplyBigDeg(new PolynomialGF2mSmallM(this.field, Utils.removeLast0Bits(bArr3)), this.reductionPoly)).getEncoded());
        PolynomialGF2mSmallM polynomialGF2mSmallM3 = new PolynomialGF2mSmallM(this.field, Utils.removeLast0Bits(bArr7));
        PolynomialGF2mSmallM polynomialGF2mSmallM4 = new PolynomialGF2mSmallM(this.field, Utils.removeLast0Bits(bArr6));
        long[] jArr7 = new long[this.N1_BYTE_64];
        ReedSolomon.encode(jArr7, jArr4, this.K_BYTE * 8, this.f19412n1, this.f19410k, this.f19409g, this.generatorPoly);
        ReedMuller.encode(jArr2, jArr7, this.f19412n1, this.mulParam);
        byte[] bArr8 = new byte[this.n1n2];
        Utils.fromLongArrayToBitArray(bArr8, jArr2);
        PolynomialGF2mSmallM add = new PolynomialGF2mSmallM(this.field, Utils.removeLast0Bits(bArr8)).add(polynomialGF2mSmallM3.modKaratsubaMultiplyBigDeg(polynomialGF2mSmallM2, this.reductionPoly)).add(polynomialGF2mSmallM4);
        long[] jArr8 = new long[this.N_BYTE_64];
        Utils.fromBitArrayToLongArray(jArr8, add.getEncoded());
        int i12 = this.n1n2;
        int i13 = this.f19411n;
        int i14 = this.N1N2_BYTE_64;
        Utils.resizeArray(jArr2, i12, jArr8, i13, i14, i14);
    }

    private void extractCiphertexts(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        System.arraycopy(bArr4, 0, bArr, 0, bArr.length);
        System.arraycopy(bArr4, bArr.length, bArr2, 0, bArr2.length);
        System.arraycopy(bArr4, bArr.length + bArr2.length, bArr3, 0, bArr3.length);
    }

    private void extractKeysFromSecretKeys(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i3 = this.SEED_SIZE;
        byte[] bArr4 = new byte[i3];
        System.arraycopy(bArr3, 0, bArr4, 0, i3);
        HQCKeccakRandomGenerator hQCKeccakRandomGenerator = new HQCKeccakRandomGenerator(256);
        hQCKeccakRandomGenerator.seedExpanderInit(bArr4, i3);
        long[] jArr = new long[this.N_BYTE_64];
        int i10 = this.f19414w;
        int[] iArr = new int[i10];
        generateSecretKey(jArr, hQCKeccakRandomGenerator, i10);
        generateSecretKeyByCoordinates(iArr, hQCKeccakRandomGenerator, this.f19414w);
        System.arraycopy(Utils.fromListOfPos1ToBitArray(iArr, this.f19411n), 0, bArr, 0, bArr.length);
        System.arraycopy(bArr3, this.SEED_SIZE, bArr2, 0, bArr2.length);
    }

    private void extractPublicKeys(long[] jArr, byte[] bArr, byte[] bArr2) {
        int i3 = this.SEED_SIZE;
        byte[] bArr3 = new byte[i3];
        System.arraycopy(bArr2, 0, bArr3, 0, i3);
        HQCKeccakRandomGenerator hQCKeccakRandomGenerator = new HQCKeccakRandomGenerator(256);
        hQCKeccakRandomGenerator.seedExpanderInit(bArr3, i3);
        long[] jArr2 = new long[this.N_BYTE_64];
        generatePublicKeyH(jArr2, hQCKeccakRandomGenerator);
        System.arraycopy(jArr2, 0, jArr, 0, jArr.length);
        System.arraycopy(bArr2, 40, bArr, 0, bArr.length);
    }

    private void generateSecretKey(long[] jArr, HQCKeccakRandomGenerator hQCKeccakRandomGenerator, int i3) {
        int[] iArr = new int[i3];
        generateSecretKeyByCoordinates(iArr, hQCKeccakRandomGenerator, i3);
        for (int i10 = 0; i10 < i3; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 / 64;
            jArr[i12] = (1 << (i11 % 64)) | jArr[i12];
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private void generateSecretKeyByCoordinates(int[] r10, org.bouncycastle.pqc.crypto.hqc.HQCKeccakRandomGenerator r11, int r12) {
        /*
            r9 = this;
            int r0 = r12 * 3
            int r1 = r9.wr
            int r1 = r1 * 3
            byte[] r1 = new byte[r1]
            r2 = 0
            r4 = r0
            r3 = r2
        Lb:
            if (r3 >= r12) goto L4a
        Ld:
            if (r4 != r0) goto L13
            r11.expandSeed(r1, r0)
            r4 = r2
        L13:
            int r5 = r4 + 1
            r6 = r1[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 16
            r10[r3] = r6
            int r7 = r4 + 2
            r5 = r1[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 8
            r5 = r5 | r6
            r10[r3] = r5
            int r4 = r4 + 3
            r6 = r1[r7]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            r10[r3] = r5
            int r6 = r9.rejectionThreshold
            if (r5 >= r6) goto Ld
            int r6 = r9.f19411n
            int r5 = r5 % r6
            r10[r3] = r5
            r5 = 1
            r6 = r2
        L3c:
            if (r6 >= r3) goto L48
            r7 = r10[r6]
            r8 = r10[r3]
            if (r7 != r8) goto L45
            r5 = r2
        L45:
            int r6 = r6 + 1
            goto L3c
        L48:
            int r3 = r3 + r5
            goto Lb
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.hqc.HQCEngine.generateSecretKeyByCoordinates(int[], org.bouncycastle.pqc.crypto.hqc.HQCKeccakRandomGenerator, int):void");
    }

    public void decaps(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[this.f19411n];
        byte[] bArr5 = new byte[this.N_BYTE + 40];
        extractKeysFromSecretKeys(bArr4, bArr5, bArr3);
        byte[] bArr6 = new byte[this.N_BYTE];
        byte[] bArr7 = new byte[this.N1N2_BYTE];
        byte[] bArr8 = new byte[this.SHA512_BYTES];
        extractCiphertexts(bArr6, bArr7, bArr8, bArr2);
        long[] jArr = new long[this.K_BYTE_64];
        decrypt(jArr, jArr, bArr6, bArr7, bArr4);
        int i3 = this.f19410k;
        byte[] bArr9 = new byte[i3];
        Utils.fromLongArrayToByteArray(bArr9, jArr, i3 * 8);
        byte[] bArr10 = new byte[this.SHA512_BYTES];
        HQCKeccakRandomGenerator hQCKeccakRandomGenerator = new HQCKeccakRandomGenerator(256);
        hQCKeccakRandomGenerator.SHAKE256_512_ds(bArr10, bArr9, i3, new byte[]{this.G_FCT_DOMAIN});
        long[] jArr2 = new long[this.N_BYTE_64];
        byte[] bArr11 = new byte[this.N_BYTE];
        extractPublicKeys(jArr2, bArr11, bArr5);
        long[] jArr3 = new long[this.N_BYTE_64];
        long[] jArr4 = new long[this.N1N2_BYTE_64];
        encrypt(jArr3, jArr4, jArr2, bArr11, jArr, bArr10);
        byte[] bArr12 = new byte[this.N_BYTE];
        byte[] bArr13 = new byte[this.N1N2_BYTE];
        Utils.fromLongArrayToByteArray(bArr12, jArr3, this.f19411n);
        Utils.fromLongArrayToByteArray(bArr13, jArr4, this.n1n2);
        byte[] bArr14 = new byte[this.SHA512_BYTES];
        hQCKeccakRandomGenerator.SHAKE256_512_ds(bArr14, bArr9, i3, new byte[]{this.H_FCT_DOMAIN});
        byte[] bArr15 = new byte[this.K_BYTE + this.N_BYTE + this.N1N2_BYTE];
        byte[] concatenate = Arrays.concatenate(Arrays.concatenate(bArr9, bArr6), bArr7);
        hQCKeccakRandomGenerator.SHAKE256_512_ds(bArr, concatenate, concatenate.length, new byte[]{this.K_FCT_DOMAIN});
        boolean areEqual = Arrays.areEqual(bArr6, bArr12);
        if (!Arrays.areEqual(bArr7, bArr13)) {
            areEqual = false;
        }
        if (!Arrays.areEqual(bArr8, bArr14)) {
            areEqual = false;
        }
        if (areEqual) {
            return;
        }
        for (int i10 = 0; i10 < getSessionKeySize(); i10++) {
            bArr[i10] = 0;
        }
    }

    public void encaps(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        int i3 = this.K_BYTE;
        byte[] bArr7 = new byte[i3];
        byte[] bArr8 = new byte[this.SEED_SIZE];
        HQCKeccakRandomGenerator hQCKeccakRandomGenerator = new HQCKeccakRandomGenerator(256);
        hQCKeccakRandomGenerator.randomGeneratorInit(bArr6, null, bArr6.length, 0);
        hQCKeccakRandomGenerator.squeeze(bArr8, 40);
        hQCKeccakRandomGenerator.squeeze(new byte[this.SEED_SIZE], 40);
        hQCKeccakRandomGenerator.squeeze(bArr7, this.K_BYTE);
        long[] jArr = new long[this.K_BYTE_64];
        Utils.fromByteArrayToLongArray(jArr, bArr7);
        byte[] bArr9 = new byte[this.SHA512_BYTES];
        HQCKeccakRandomGenerator hQCKeccakRandomGenerator2 = new HQCKeccakRandomGenerator(256);
        hQCKeccakRandomGenerator2.SHAKE256_512_ds(bArr9, bArr7, i3, new byte[]{this.G_FCT_DOMAIN});
        long[] jArr2 = new long[this.N_BYTE_64];
        byte[] bArr10 = new byte[this.N_BYTE];
        extractPublicKeys(jArr2, bArr10, bArr5);
        long[] jArr3 = new long[this.N_BYTE_64];
        long[] jArr4 = new long[this.N1N2_BYTE_64];
        encrypt(jArr3, jArr4, jArr2, bArr10, jArr, bArr9);
        Utils.fromLongArrayToByteArray(bArr2, jArr4, this.n1n2);
        Utils.fromLongArrayToByteArray(bArr, jArr3, this.f19411n);
        hQCKeccakRandomGenerator2.SHAKE256_512_ds(bArr4, bArr7, i3, new byte[]{this.H_FCT_DOMAIN});
        byte[] bArr11 = new byte[this.K_BYTE + this.N_BYTE + this.N1N2_BYTE];
        byte[] concatenate = Arrays.concatenate(Arrays.concatenate(bArr7, bArr), bArr2);
        hQCKeccakRandomGenerator2.SHAKE256_512_ds(bArr3, concatenate, concatenate.length, new byte[]{this.K_FCT_DOMAIN});
    }

    public void genKeyPair(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int i3 = this.SEED_SIZE;
        byte[] bArr4 = new byte[i3];
        HQCKeccakRandomGenerator hQCKeccakRandomGenerator = new HQCKeccakRandomGenerator(256);
        hQCKeccakRandomGenerator.randomGeneratorInit(bArr3, null, bArr3.length, 0);
        hQCKeccakRandomGenerator.squeeze(bArr4, 40);
        HQCKeccakRandomGenerator hQCKeccakRandomGenerator2 = new HQCKeccakRandomGenerator(256);
        hQCKeccakRandomGenerator2.seedExpanderInit(bArr4, i3);
        long[] jArr = new long[this.N_BYTE_64];
        int i10 = this.f19414w;
        int[] iArr = new int[i10];
        generateSecretKey(jArr, hQCKeccakRandomGenerator2, i10);
        generateSecretKeyByCoordinates(iArr, hQCKeccakRandomGenerator2, this.f19414w);
        byte[] fromListOfPos1ToBitArray = Utils.fromListOfPos1ToBitArray(iArr, this.f19411n);
        byte[] bArr5 = new byte[this.f19411n];
        Utils.fromLongArrayToBitArray(bArr5, jArr);
        int i11 = this.SEED_SIZE;
        byte[] bArr6 = new byte[i11];
        hQCKeccakRandomGenerator.squeeze(bArr6, 40);
        HQCKeccakRandomGenerator hQCKeccakRandomGenerator3 = new HQCKeccakRandomGenerator(256);
        hQCKeccakRandomGenerator3.seedExpanderInit(bArr6, i11);
        long[] jArr2 = new long[this.N_BYTE_64];
        generatePublicKeyH(jArr2, hQCKeccakRandomGenerator3);
        byte[] bArr7 = new byte[this.f19411n];
        Utils.fromLongArrayToBitArray(bArr7, jArr2);
        byte[] encoded = new PolynomialGF2mSmallM(this.field, Utils.removeLast0Bits(bArr5)).add(new PolynomialGF2mSmallM(this.field, Utils.removeLast0Bits(bArr7)).modKaratsubaMultiplyBigDeg(new PolynomialGF2mSmallM(this.field, Utils.removeLast0Bits(fromListOfPos1ToBitArray)), this.reductionPoly)).getEncoded();
        byte[] bArr8 = new byte[this.N_BYTE];
        Utils.fromBitArrayToByteArray(bArr8, encoded);
        byte[] concatenate = Arrays.concatenate(bArr6, bArr8);
        byte[] concatenate2 = Arrays.concatenate(bArr4, concatenate);
        System.arraycopy(concatenate, 0, bArr, 0, concatenate.length);
        System.arraycopy(concatenate2, 0, bArr2, 0, concatenate2.length);
    }

    public void generatePublicKeyH(long[] jArr, HQCKeccakRandomGenerator hQCKeccakRandomGenerator) {
        int i3 = this.N_BYTE;
        byte[] bArr = new byte[i3];
        hQCKeccakRandomGenerator.expandSeed(bArr, i3);
        long[] jArr2 = new long[this.N_BYTE_64];
        Utils.fromByteArrayToLongArray(jArr2, bArr);
        int i10 = this.N_BYTE_64 - 1;
        jArr2[i10] = jArr2[i10] & Utils.bitMask(this.f19411n, 64L);
        System.arraycopy(jArr2, 0, jArr, 0, jArr.length);
    }

    public int getSessionKeySize() {
        return this.SHA512_BYTES;
    }
}
