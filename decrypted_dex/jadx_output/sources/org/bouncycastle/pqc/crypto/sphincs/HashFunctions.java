package org.bouncycastle.pqc.crypto.sphincs;

import com.stub.StubApp;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Strings;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class HashFunctions {
    private static final byte[] hashc = Strings.toByteArray(StubApp.getString2(34182));
    private final Digest dig256;
    private final Digest dig512;
    private final Permute perm;

    public HashFunctions(Digest digest) {
        this(digest, null);
    }

    public Digest getMessageHash() {
        return this.dig512;
    }

    public int hash_2n_n(byte[] bArr, int i3, byte[] bArr2, int i10) {
        byte[] bArr3 = new byte[64];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr3[i11] = bArr2[i10 + i11];
            bArr3[i11 + 32] = hashc[i11];
        }
        this.perm.chacha_permute(bArr3, bArr3);
        for (int i12 = 0; i12 < 32; i12++) {
            bArr3[i12] = (byte) (bArr3[i12] ^ bArr2[(i10 + i12) + 32]);
        }
        this.perm.chacha_permute(bArr3, bArr3);
        for (int i13 = 0; i13 < 32; i13++) {
            bArr[i3 + i13] = bArr3[i13];
        }
        return 0;
    }

    public int hash_2n_n_mask(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, int i11) {
        byte[] bArr4 = new byte[64];
        for (int i12 = 0; i12 < 64; i12++) {
            bArr4[i12] = (byte) (bArr2[i10 + i12] ^ bArr3[i11 + i12]);
        }
        return hash_2n_n(bArr, i3, bArr4, 0);
    }

    public int hash_n_n(byte[] bArr, int i3, byte[] bArr2, int i10) {
        byte[] bArr3 = new byte[64];
        for (int i11 = 0; i11 < 32; i11++) {
            bArr3[i11] = bArr2[i10 + i11];
            bArr3[i11 + 32] = hashc[i11];
        }
        this.perm.chacha_permute(bArr3, bArr3);
        for (int i12 = 0; i12 < 32; i12++) {
            bArr[i3 + i12] = bArr3[i12];
        }
        return 0;
    }

    public int hash_n_n_mask(byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, int i11) {
        byte[] bArr4 = new byte[32];
        for (int i12 = 0; i12 < 32; i12++) {
            bArr4[i12] = (byte) (bArr2[i10 + i12] ^ bArr3[i11 + i12]);
        }
        return hash_n_n(bArr, i3, bArr4, 0);
    }

    public int varlen_hash(byte[] bArr, int i3, byte[] bArr2, int i10) {
        this.dig256.update(bArr2, 0, i10);
        this.dig256.doFinal(bArr, i3);
        return 0;
    }

    public HashFunctions(Digest digest, Digest digest2) {
        this.perm = new Permute();
        this.dig256 = digest;
        this.dig512 = digest2;
    }
}
