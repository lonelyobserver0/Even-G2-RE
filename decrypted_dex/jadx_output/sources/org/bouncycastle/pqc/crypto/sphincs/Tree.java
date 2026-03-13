package org.bouncycastle.pqc.crypto.sphincs;

import E1.a;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Tree {

    public static class leafaddr {
        int level;
        long subleaf;
        long subtree;

        public leafaddr() {
        }

        public leafaddr(leafaddr leafaddrVar) {
            this.level = leafaddrVar.level;
            this.subtree = leafaddrVar.subtree;
            this.subleaf = leafaddrVar.subleaf;
        }
    }

    public static void gen_leaf_wots(HashFunctions hashFunctions, byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, leafaddr leafaddrVar) {
        byte[] bArr4 = new byte[32];
        byte[] bArr5 = new byte[2144];
        Wots wots = new Wots();
        Seed.get_seed(hashFunctions, bArr4, 0, bArr3, leafaddrVar);
        wots.wots_pkgen(hashFunctions, bArr5, 0, bArr4, 0, bArr2, i10);
        l_tree(hashFunctions, bArr, i3, bArr5, 0, bArr2, i10);
    }

    public static void l_tree(HashFunctions hashFunctions, byte[] bArr, int i3, byte[] bArr2, int i10, byte[] bArr3, int i11) {
        int i12;
        int i13 = 67;
        for (int i14 = 0; i14 < 7; i14++) {
            int i15 = 0;
            while (true) {
                i12 = i13 >>> 1;
                if (i15 >= i12) {
                    break;
                }
                hashFunctions.hash_2n_n_mask(bArr2, (i15 * 32) + i10, bArr2, (i15 * 64) + i10, bArr3, (i14 * 64) + i11);
                i15++;
            }
            if ((i13 & 1) != 0) {
                System.arraycopy(bArr2, a.f(i13, 1, 32, i10), bArr2, (i12 * 32) + i10, 32);
                i12++;
            }
            i13 = i12;
        }
        System.arraycopy(bArr2, i10, bArr, i3, 32);
    }

    public static void treehash(HashFunctions hashFunctions, byte[] bArr, int i3, int i10, byte[] bArr2, leafaddr leafaddrVar, byte[] bArr3, int i11) {
        leafaddr leafaddrVar2 = new leafaddr(leafaddrVar);
        int i12 = i10 + 1;
        byte[] bArr4 = new byte[i12 * 32];
        int[] iArr = new int[i12];
        int i13 = (int) (leafaddrVar2.subleaf + (1 << i10));
        int i14 = 0;
        while (leafaddrVar2.subleaf < i13) {
            gen_leaf_wots(hashFunctions, bArr4, i14 * 32, bArr3, i11, bArr2, leafaddrVar2);
            iArr[i14] = 0;
            int i15 = i14 + 1;
            while (i15 > 1) {
                int i16 = iArr[i15 - 1];
                int i17 = i15 - 2;
                if (i16 == iArr[i17]) {
                    int i18 = i17 * 32;
                    hashFunctions.hash_2n_n_mask(bArr4, i18, bArr4, i18, bArr3, i11 + ((i16 + 7) * 64));
                    iArr[i17] = iArr[i17] + 1;
                    i15--;
                    i13 = i13;
                }
            }
            leafaddrVar2.subleaf++;
            i14 = i15;
            i13 = i13;
        }
        for (int i19 = 0; i19 < 32; i19++) {
            bArr[i3 + i19] = bArr4[i19];
        }
    }
}
