package org.bouncycastle.pqc.crypto.picnic;

import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class Tape {
    private PicnicEngine engine;
    int nTapes;
    int pos = 0;
    byte[][] tapes;

    public Tape(PicnicEngine picnicEngine) {
        this.engine = picnicEngine;
        this.tapes = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, picnicEngine.numMPCParties, picnicEngine.andSizeBytes * 2);
        this.nTapes = picnicEngine.numMPCParties;
    }

    private void tapesToParityBits(int[] iArr, int i3) {
        for (int i10 = 0; i10 < i3; i10++) {
            Utils.setBitInWordArray(iArr, i10, Utils.parity16(tapesToWord()));
        }
    }

    public void computeAuxTape(byte[] bArr) {
        PicnicEngine picnicEngine = this.engine;
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = new int[16];
        int[] iArr5 = new int[16];
        iArr5[picnicEngine.stateSizeWords - 1] = 0;
        tapesToParityBits(iArr5, picnicEngine.stateSizeBits);
        KMatricesWithPointer KMatrixInv = LowmcConstants.KMatrixInv(this.engine);
        this.engine.matrix_mul(iArr4, iArr5, KMatrixInv.getData(), KMatrixInv.getMatrixPointer());
        if (bArr != null) {
            Pack.intToLittleEndian(Arrays.copyOf(iArr4, this.engine.stateSizeWords), bArr, 0);
        }
        for (int i3 = this.engine.numRounds; i3 > 0; i3--) {
            KMatricesWithPointer KMatrix = LowmcConstants.KMatrix(this.engine, i3);
            this.engine.matrix_mul(iArr, iArr4, KMatrix.getData(), KMatrix.getMatrixPointer());
            PicnicEngine picnicEngine2 = this.engine;
            picnicEngine2.xor_array(iArr2, iArr2, iArr, 0, picnicEngine2.stateSizeWords);
            int i10 = i3 - 1;
            KMatricesWithPointer LMatrixInv = LowmcConstants.LMatrixInv(this.engine, i10);
            this.engine.matrix_mul(iArr3, iArr2, LMatrixInv.getData(), LMatrixInv.getMatrixPointer());
            if (i3 == 1) {
                System.arraycopy(iArr5, 0, iArr2, 0, 16);
            } else {
                int i11 = this.engine.stateSizeBits;
                this.pos = i11 * 2 * i10;
                tapesToParityBits(iArr2, i11);
            }
            PicnicEngine picnicEngine3 = this.engine;
            int i12 = picnicEngine3.stateSizeBits;
            this.pos = (i12 * 2 * i10) + i12;
            picnicEngine3.aux_mpc_sbox(iArr2, iArr3, this);
        }
        this.pos = 0;
    }

    public void setAuxBits(byte[] bArr) {
        PicnicEngine picnicEngine = this.engine;
        int i3 = picnicEngine.numMPCParties - 1;
        int i10 = picnicEngine.stateSizeBits;
        int i11 = 0;
        for (int i12 = 0; i12 < this.engine.numRounds; i12++) {
            int i13 = 0;
            while (i13 < i10) {
                Utils.setBit(this.tapes[i3], (i10 * 2 * i12) + i10 + i13, Utils.getBit(bArr, i11));
                i13++;
                i11++;
            }
        }
    }

    public int tapesToWord() {
        byte[] bArr = new byte[4];
        for (int i3 = 0; i3 < 16; i3++) {
            Utils.setBit(bArr, i3, Utils.getBit(this.tapes[i3], this.pos));
        }
        this.pos++;
        return Pack.littleEndianToInt(bArr, 0);
    }
}
