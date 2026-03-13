package org.bouncycastle.pqc.crypto.sphincs;

import com.stub.StubApp;
import kotlin.UByte;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.pqc.crypto.sphincs.Tree;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SPHINCS256Signer implements MessageSigner {
    private final HashFunctions hashFunctions;
    private byte[] keyData;

    public SPHINCS256Signer(Digest digest, Digest digest2) {
        if (digest.getDigestSize() != 32) {
            throw new IllegalArgumentException(StubApp.getString2(34184));
        }
        if (digest2.getDigestSize() != 64) {
            throw new IllegalArgumentException(StubApp.getString2(34183));
        }
        this.hashFunctions = new HashFunctions(digest, digest2);
    }

    public static void compute_authpath_wots(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i3, Tree.leafaddr leafaddrVar, byte[] bArr3, byte[] bArr4, int i10) {
        long j;
        long j3;
        Tree.leafaddr leafaddrVar2 = new Tree.leafaddr(leafaddrVar);
        byte[] bArr5 = new byte[2048];
        byte[] bArr6 = new byte[1024];
        byte[] bArr7 = new byte[68608];
        long j10 = 0;
        leafaddrVar2.subleaf = 0L;
        while (true) {
            long j11 = leafaddrVar2.subleaf;
            j = 32;
            if (j11 >= 32) {
                break;
            }
            Seed.get_seed(hashFunctions, bArr6, (int) (j11 * 32), bArr3, leafaddrVar2);
            leafaddrVar2.subleaf++;
        }
        HashFunctions hashFunctions2 = hashFunctions;
        Wots wots = new Wots();
        leafaddrVar2.subleaf = 0L;
        while (true) {
            long j12 = leafaddrVar2.subleaf;
            j3 = j;
            if (j12 >= j) {
                break;
            }
            HashFunctions hashFunctions3 = hashFunctions2;
            byte[] bArr8 = bArr7;
            wots.wots_pkgen(hashFunctions3, bArr8, (int) (j12 * 2144), bArr6, (int) (j12 * j3), bArr4, 0);
            bArr7 = bArr8;
            leafaddrVar2.subleaf++;
            hashFunctions2 = hashFunctions;
            j = j3;
        }
        while (true) {
            leafaddrVar2.subleaf = j10;
            long j13 = leafaddrVar2.subleaf;
            if (j13 >= j3) {
                break;
            }
            Tree.l_tree(hashFunctions, bArr5, (int) ((j13 * j3) + 1024), bArr7, (int) (j13 * 2144), bArr4, 0);
            j10 = leafaddrVar2.subleaf + 1;
        }
        int i11 = 0;
        for (int i12 = 32; i12 > 0; i12 >>>= 1) {
            for (int i13 = 0; i13 < i12; i13 += 2) {
                hashFunctions.hash_2n_n_mask(bArr5, ((i13 >>> 1) * 32) + ((i12 >>> 1) * 32), bArr5, (i13 * 32) + (i12 * 32), bArr4, (i11 + 7) * 64);
            }
            i11++;
        }
        int i14 = (int) leafaddrVar.subleaf;
        for (int i15 = 0; i15 < i10; i15++) {
            System.arraycopy(bArr5, (((i14 >>> i15) ^ 1) * 32) + ((32 >>> i15) * 32), bArr2, (i15 * 32) + i3, 32);
        }
        System.arraycopy(bArr5, 32, bArr, 0, 32);
    }

    public static void validate_authpath(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i3, byte[] bArr3, int i10, byte[] bArr4, int i11) {
        byte[] bArr5 = new byte[64];
        if ((i3 & 1) != 0) {
            for (int i12 = 0; i12 < 32; i12++) {
                bArr5[i12 + 32] = bArr2[i12];
            }
            for (int i13 = 0; i13 < 32; i13++) {
                bArr5[i13] = bArr3[i10 + i13];
            }
        } else {
            for (int i14 = 0; i14 < 32; i14++) {
                bArr5[i14] = bArr2[i14];
            }
            for (int i15 = 0; i15 < 32; i15++) {
                bArr5[i15 + 32] = bArr3[i10 + i15];
            }
        }
        int i16 = i10 + 32;
        int i17 = i3;
        int i18 = 0;
        while (i18 < i11 - 1) {
            int i19 = i17 >>> 1;
            if ((i19 & 1) != 0) {
                hashFunctions.hash_2n_n_mask(bArr5, 32, bArr5, 0, bArr4, (i18 + 7) * 64);
                for (int i20 = 0; i20 < 32; i20++) {
                    bArr5[i20] = bArr3[i16 + i20];
                }
            } else {
                hashFunctions.hash_2n_n_mask(bArr5, 0, bArr5, 0, bArr4, (i18 + 7) * 64);
                for (int i21 = 0; i21 < 32; i21++) {
                    bArr5[i21 + 32] = bArr3[i16 + i21];
                }
            }
            i16 += 32;
            i18++;
            i17 = i19;
        }
        hashFunctions.hash_2n_n_mask(bArr, 0, bArr5, 0, bArr4, (i11 + 6) * 64);
    }

    private void zerobytes(byte[] bArr, int i3, int i10) {
        for (int i11 = 0; i11 != i10; i11++) {
            bArr[i3 + i11] = 0;
        }
    }

    public byte[] crypto_sign(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[41000];
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[64];
        long[] jArr = new long[8];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[32];
        byte[] bArr8 = new byte[1024];
        byte[] bArr9 = new byte[1088];
        for (int i3 = 0; i3 < 1088; i3++) {
            bArr9[i3] = bArr2[i3];
        }
        System.arraycopy(bArr9, 1056, bArr3, 40968, 32);
        Digest messageHash = hashFunctions.getMessageHash();
        byte[] bArr10 = new byte[messageHash.getDigestSize()];
        messageHash.update(bArr3, 40968, 32);
        messageHash.update(bArr, 0, bArr.length);
        messageHash.doFinal(bArr10, 0);
        zerobytes(bArr3, 40968, 32);
        for (int i10 = 0; i10 != 8; i10++) {
            jArr[i10] = Pack.littleEndianToLong(bArr10, i10 * 8);
        }
        long j = jArr[0] & 1152921504606846975L;
        System.arraycopy(bArr10, 16, bArr4, 0, 32);
        System.arraycopy(bArr4, 0, bArr3, 39912, 32);
        Tree.leafaddr leafaddrVar = new Tree.leafaddr();
        leafaddrVar.level = 11;
        leafaddrVar.subtree = 0L;
        leafaddrVar.subleaf = 0L;
        System.arraycopy(bArr9, 32, bArr3, 39944, 1024);
        HashFunctions hashFunctions2 = hashFunctions;
        Tree.treehash(hashFunctions2, bArr3, 40968, 5, bArr9, leafaddrVar, bArr3, 39944);
        byte[] bArr11 = bArr9;
        Digest messageHash2 = hashFunctions2.getMessageHash();
        messageHash2.update(bArr3, 39912, 1088);
        messageHash2.update(bArr, 0, bArr.length);
        messageHash2.doFinal(bArr5, 0);
        Tree.leafaddr leafaddrVar2 = new Tree.leafaddr();
        int i11 = 12;
        leafaddrVar2.level = 12;
        leafaddrVar2.subleaf = (int) (r19 & 31);
        leafaddrVar2.subtree = j >>> 5;
        int i12 = 32;
        for (int i13 = 0; i13 < 32; i13++) {
            bArr3[i13] = bArr4[i13];
        }
        System.arraycopy(bArr11, 32, bArr8, 0, 1024);
        int i14 = 0;
        while (i14 < 8) {
            bArr3[i12 + i14] = (byte) ((j >>> (i14 * 8)) & 255);
            i14++;
            i12 = 32;
        }
        Seed.get_seed(hashFunctions2, bArr7, 0, bArr11, leafaddrVar2);
        new Horst();
        byte[] bArr12 = bArr8;
        byte[] bArr13 = bArr6;
        byte[] bArr14 = bArr7;
        int i15 = 0;
        int horst_sign = 40 + Horst.horst_sign(hashFunctions2, bArr3, 40, bArr13, bArr14, bArr12, bArr5);
        Wots wots = new Wots();
        int i16 = 0;
        while (i16 < i11) {
            leafaddrVar2.level = i16;
            Seed.get_seed(hashFunctions2, bArr14, i15, bArr11, leafaddrVar2);
            byte[] bArr15 = bArr3;
            HashFunctions hashFunctions3 = hashFunctions2;
            Wots wots2 = wots;
            byte[] bArr16 = bArr12;
            byte[] bArr17 = bArr14;
            byte[] bArr18 = bArr13;
            int i17 = horst_sign;
            wots2.wots_sign(hashFunctions3, bArr15, i17, bArr18, bArr17, bArr16);
            byte[] bArr19 = bArr11;
            Tree.leafaddr leafaddrVar3 = leafaddrVar2;
            compute_authpath_wots(hashFunctions, bArr18, bArr15, i17 + 2144, leafaddrVar3, bArr19, bArr16, 5);
            bArr13 = bArr18;
            bArr3 = bArr15;
            horst_sign = i17 + 2304;
            long j3 = leafaddrVar3.subtree;
            leafaddrVar3.subleaf = (int) (j3 & 31);
            leafaddrVar3.subtree = j3 >>> 5;
            i16++;
            leafaddrVar2 = leafaddrVar3;
            bArr11 = bArr19;
            bArr12 = bArr16;
            bArr14 = bArr17;
            i15 = 0;
            i11 = 12;
            hashFunctions2 = hashFunctions;
            wots = wots2;
        }
        zerobytes(bArr11, i15, 1088);
        return bArr3;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        return crypto_sign(this.hashFunctions, bArr, this.keyData);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z2, CipherParameters cipherParameters) {
        if (!z2) {
            this.keyData = ((SPHINCSPublicKeyParameters) cipherParameters).getKeyData();
        } else if (cipherParameters instanceof ParametersWithRandom) {
            this.keyData = ((SPHINCSPrivateKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters()).getKeyData();
        } else {
            this.keyData = ((SPHINCSPrivateKeyParameters) cipherParameters).getKeyData();
        }
    }

    public boolean verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArr4 = new byte[2144];
        byte[] bArr5 = new byte[32];
        byte[] bArr6 = new byte[32];
        byte[] bArr7 = new byte[41000];
        byte[] bArr8 = new byte[1056];
        if (bArr2.length != 41000) {
            throw new IllegalArgumentException(StubApp.getString2(34185));
        }
        byte[] bArr9 = new byte[64];
        for (int i3 = 0; i3 < 1056; i3++) {
            bArr8[i3] = bArr3[i3];
        }
        byte[] bArr10 = new byte[32];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr10[i10] = bArr2[i10];
        }
        System.arraycopy(bArr2, 0, bArr7, 0, 41000);
        Digest messageHash = hashFunctions.getMessageHash();
        messageHash.update(bArr10, 0, 32);
        messageHash.update(bArr8, 0, 1056);
        messageHash.update(bArr, 0, bArr.length);
        messageHash.doFinal(bArr9, 0);
        long j = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            j ^= (bArr7[32 + i11] & UByte.MAX_VALUE) << (i11 * 8);
        }
        new Horst();
        Horst.horst_verify(hashFunctions, bArr6, bArr7, 40, bArr8, bArr9);
        Wots wots = new Wots();
        int i12 = 13352;
        int i13 = 0;
        while (i13 < 12) {
            wots.wots_verify(hashFunctions, bArr4, bArr7, i12, bArr6, bArr8);
            int i14 = i12;
            byte[] bArr11 = bArr4;
            byte[] bArr12 = bArr5;
            Tree.l_tree(hashFunctions, bArr12, 0, bArr11, 0, bArr8, 0);
            bArr4 = bArr11;
            byte[] bArr13 = bArr7;
            byte[] bArr14 = bArr6;
            validate_authpath(hashFunctions, bArr14, bArr12, (int) (31 & j), bArr13, i14 + 2144, bArr8, 5);
            bArr7 = bArr13;
            bArr6 = bArr14;
            j >>= 5;
            i12 = i14 + 2304;
            i13++;
            bArr5 = bArr12;
            wots = wots;
        }
        boolean z2 = true;
        for (int i15 = 0; i15 < 32; i15++) {
            if (bArr6[i15] != bArr8[i15 + 1024]) {
                z2 = false;
            }
        }
        return z2;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        return verify(this.hashFunctions, bArr, bArr2, this.keyData);
    }
}
