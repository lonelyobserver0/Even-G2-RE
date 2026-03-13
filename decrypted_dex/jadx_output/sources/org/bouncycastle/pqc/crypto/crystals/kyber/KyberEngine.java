package org.bouncycastle.pqc.crypto.crystals.kyber;

import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class KyberEngine {
    private static final int KyberEta2 = 2;
    private static final int KyberIndCpaMsgBytes = 32;
    public static final int KyberN = 256;
    public static final int KyberPolyBytes = 384;
    public static final int KyberQ = 3329;
    public static final int KyberQinv = 62209;
    private static final int KyberSharedSecretBytes = 32;
    public static final int KyberSymBytes = 32;
    private final int CryptoBytes;
    private final int CryptoCipherTextBytes;
    private final int CryptoPublicKeyBytes;
    private final int CryptoSecretKeyBytes;
    private final int KyberCipherTextBytes;
    private final int KyberEta1;
    private final int KyberIndCpaBytes;
    private final int KyberIndCpaPublicKeyBytes;
    private final int KyberIndCpaSecretKeyBytes;
    private final int KyberK;
    private final int KyberPolyCompressedBytes;
    private final int KyberPolyVecBytes;
    private final int KyberPolyVecCompressedBytes;
    private final int KyberPublicKeyBytes;
    private final int KyberSecretKeyBytes;
    private KyberIndCpa indCpa;
    private SecureRandom random;
    private final int sessionKeyLength;
    private final Symmetric symmetric;

    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public KyberEngine(int r5, boolean r6) {
        /*
            r4 = this;
            r4.<init>()
            r4.KyberK = r5
            r0 = 128(0x80, float:1.8E-43)
            r1 = 3
            r2 = 32
            r3 = 2
            if (r5 == r3) goto L44
            if (r5 == r1) goto L37
            r0 = 4
            if (r5 != r0) goto L1f
            r4.KyberEta1 = r3
            r0 = 160(0xa0, float:2.24E-43)
            r4.KyberPolyCompressedBytes = r0
            int r0 = r5 * 352
            r4.KyberPolyVecCompressedBytes = r0
            r4.sessionKeyLength = r2
            goto L4f
        L1f:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r0 = 33989(0x84c5, float:4.7629E-41)
            java.lang.String r0 = com.stub.StubApp.getString2(r0)
            r1 = 33990(0x84c6, float:4.763E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            java.lang.String r5 = Xa.h.g(r5, r0, r1)
            r6.<init>(r5)
            throw r6
        L37:
            r4.KyberEta1 = r3
            r4.KyberPolyCompressedBytes = r0
            int r0 = r5 * 320
            r4.KyberPolyVecCompressedBytes = r0
            r0 = 24
        L41:
            r4.sessionKeyLength = r0
            goto L4f
        L44:
            r4.KyberEta1 = r1
            r4.KyberPolyCompressedBytes = r0
            int r0 = r5 * 320
            r4.KyberPolyVecCompressedBytes = r0
            r0 = 16
            goto L41
        L4f:
            int r5 = r5 * 384
            r4.KyberPolyVecBytes = r5
            int r0 = r5 + 32
            r4.KyberIndCpaPublicKeyBytes = r0
            r4.KyberIndCpaSecretKeyBytes = r5
            int r1 = r4.KyberPolyVecCompressedBytes
            int r3 = r4.KyberPolyCompressedBytes
            int r1 = r1 + r3
            r4.KyberIndCpaBytes = r1
            r4.KyberPublicKeyBytes = r0
            int r5 = r5 + r0
            int r5 = r5 + 64
            r4.KyberSecretKeyBytes = r5
            r4.KyberCipherTextBytes = r1
            r4.CryptoBytes = r2
            r4.CryptoSecretKeyBytes = r5
            r4.CryptoPublicKeyBytes = r0
            r4.CryptoCipherTextBytes = r1
            if (r6 == 0) goto L7b
            org.bouncycastle.pqc.crypto.crystals.kyber.Symmetric$AesSymmetric r5 = new org.bouncycastle.pqc.crypto.crystals.kyber.Symmetric$AesSymmetric
            r5.<init>()
        L78:
            r4.symmetric = r5
            goto L81
        L7b:
            org.bouncycastle.pqc.crypto.crystals.kyber.Symmetric$ShakeSymmetric r5 = new org.bouncycastle.pqc.crypto.crystals.kyber.Symmetric$ShakeSymmetric
            r5.<init>()
            goto L78
        L81:
            org.bouncycastle.pqc.crypto.crystals.kyber.KyberIndCpa r5 = new org.bouncycastle.pqc.crypto.crystals.kyber.KyberIndCpa
            r5.<init>(r4)
            r4.indCpa = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine.<init>(int, boolean):void");
    }

    private void cmov(byte[] bArr, byte[] bArr2, int i3, boolean z2) {
        if (z2) {
            System.arraycopy(bArr2, 0, bArr, 0, i3);
        } else {
            System.arraycopy(bArr, 0, bArr, 0, i3);
        }
    }

    public static int getKyberEta2() {
        return 2;
    }

    public static int getKyberIndCpaMsgBytes() {
        return 32;
    }

    public byte[][] generateKemKeyPair() {
        byte[][] generateKeyPair = this.indCpa.generateKeyPair();
        int i3 = this.KyberIndCpaSecretKeyBytes;
        byte[] bArr = new byte[i3];
        System.arraycopy(generateKeyPair[1], 0, bArr, 0, i3);
        byte[] bArr2 = new byte[32];
        this.symmetric.hash_h(bArr2, generateKeyPair[0], 0);
        byte[] bArr3 = new byte[32];
        this.random.nextBytes(bArr3);
        int i10 = this.KyberIndCpaPublicKeyBytes;
        byte[] bArr4 = new byte[i10];
        System.arraycopy(generateKeyPair[0], 0, bArr4, 0, i10);
        int i11 = i10 - 32;
        return new byte[][]{Arrays.copyOfRange(bArr4, 0, i11), Arrays.copyOfRange(bArr4, i11, i10), bArr, bArr2, bArr3};
    }

    public int getCryptoBytes() {
        return this.CryptoBytes;
    }

    public int getCryptoCipherTextBytes() {
        return this.CryptoCipherTextBytes;
    }

    public int getCryptoPublicKeyBytes() {
        return this.CryptoPublicKeyBytes;
    }

    public int getCryptoSecretKeyBytes() {
        return this.CryptoSecretKeyBytes;
    }

    public int getKyberCipherTextBytes() {
        return this.KyberCipherTextBytes;
    }

    public int getKyberEta1() {
        return this.KyberEta1;
    }

    public int getKyberIndCpaBytes() {
        return this.KyberIndCpaBytes;
    }

    public int getKyberIndCpaPublicKeyBytes() {
        return this.KyberIndCpaPublicKeyBytes;
    }

    public int getKyberIndCpaSecretKeyBytes() {
        return this.KyberIndCpaSecretKeyBytes;
    }

    public int getKyberK() {
        return this.KyberK;
    }

    public int getKyberPolyCompressedBytes() {
        return this.KyberPolyCompressedBytes;
    }

    public int getKyberPolyVecBytes() {
        return this.KyberPolyVecBytes;
    }

    public int getKyberPolyVecCompressedBytes() {
        return this.KyberPolyVecCompressedBytes;
    }

    public int getKyberPublicKeyBytes() {
        return this.KyberPublicKeyBytes;
    }

    public int getKyberSecretKeyBytes() {
        return this.KyberSecretKeyBytes;
    }

    public void getRandomBytes(byte[] bArr) {
        this.random.nextBytes(bArr);
    }

    public Symmetric getSymmetric() {
        return this.symmetric;
    }

    public void init(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public byte[] kemDecrypt(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[64];
        byte[] copyOfRange = Arrays.copyOfRange(bArr2, this.KyberIndCpaSecretKeyBytes, bArr2.length);
        System.arraycopy(this.indCpa.decrypt(bArr, bArr2), 0, bArr3, 0, 32);
        System.arraycopy(bArr2, this.KyberSecretKeyBytes - 64, bArr3, 32, 32);
        this.symmetric.hash_g(bArr4, bArr3);
        boolean z2 = !Arrays.constantTimeAreEqual(bArr, this.indCpa.encrypt(Arrays.copyOfRange(bArr3, 0, 32), copyOfRange, Arrays.copyOfRange(bArr4, 32, 64)));
        this.symmetric.hash_h(bArr4, bArr, 32);
        int i3 = this.KyberSecretKeyBytes;
        cmov(bArr4, Arrays.copyOfRange(bArr2, i3 - 32, i3), 32, z2);
        byte[] bArr5 = new byte[this.sessionKeyLength];
        this.symmetric.kdf(bArr5, bArr4);
        return bArr5;
    }

    public byte[][] kemEncrypt(byte[] bArr) {
        byte[] bArr2 = new byte[64];
        byte[] bArr3 = new byte[64];
        byte[] bArr4 = new byte[32];
        this.random.nextBytes(bArr4);
        this.symmetric.hash_h(bArr4, bArr4, 0);
        System.arraycopy(bArr4, 0, bArr2, 0, 32);
        this.symmetric.hash_h(bArr2, bArr, 32);
        this.symmetric.hash_g(bArr3, bArr2);
        byte[] encrypt = this.indCpa.encrypt(Arrays.copyOfRange(bArr2, 0, 32), bArr, Arrays.copyOfRange(bArr3, 32, 64));
        this.symmetric.hash_h(bArr3, encrypt, 32);
        byte[] bArr5 = new byte[this.sessionKeyLength];
        this.symmetric.kdf(bArr5, bArr3);
        return new byte[][]{bArr5, encrypt};
    }
}
