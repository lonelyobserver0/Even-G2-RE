package org.bouncycastle.pqc.crypto.sphincs;

import org.bouncycastle.crypto.engines.ChaChaEngine;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.pqc.crypto.sphincs.Tree;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Seed {
    public static void get_seed(HashFunctions hashFunctions, byte[] bArr, int i3, byte[] bArr2, Tree.leafaddr leafaddrVar) {
        byte[] bArr3 = new byte[40];
        for (int i10 = 0; i10 < 32; i10++) {
            bArr3[i10] = bArr2[i10];
        }
        Pack.longToLittleEndian((leafaddrVar.subleaf << 59) | leafaddrVar.level | (leafaddrVar.subtree << 4), bArr3, 32);
        hashFunctions.varlen_hash(bArr, i3, bArr3, 40);
    }

    public static void prg(byte[] bArr, int i3, long j, byte[] bArr2, int i10) {
        ChaChaEngine chaChaEngine = new ChaChaEngine(12);
        chaChaEngine.init(true, new ParametersWithIV(new KeyParameter(bArr2, i10, 32), new byte[8]));
        chaChaEngine.processBytes(bArr, i3, (int) j, bArr, i3);
    }
}
