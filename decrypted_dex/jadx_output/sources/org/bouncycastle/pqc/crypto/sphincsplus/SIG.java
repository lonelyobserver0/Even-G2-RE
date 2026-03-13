package org.bouncycastle.pqc.crypto.sphincsplus;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class SIG {

    /* renamed from: r, reason: collision with root package name */
    private final byte[] f19469r;
    private final SIG_FORS[] sig_fors;
    private final SIG_XMSS[] sig_ht;

    public SIG(int i3, int i10, int i11, int i12, int i13, int i14, byte[] bArr) {
        byte[] bArr2 = new byte[i3];
        this.f19469r = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        this.sig_fors = new SIG_FORS[i10];
        int i15 = i3;
        for (int i16 = 0; i16 != i10; i16++) {
            byte[] bArr3 = new byte[i3];
            System.arraycopy(bArr, i15, bArr3, 0, i3);
            i15 += i3;
            byte[][] bArr4 = new byte[i11][];
            for (int i17 = 0; i17 != i11; i17++) {
                byte[] bArr5 = new byte[i3];
                bArr4[i17] = bArr5;
                System.arraycopy(bArr, i15, bArr5, 0, i3);
                i15 += i3;
            }
            this.sig_fors[i16] = new SIG_FORS(bArr3, bArr4);
        }
        this.sig_ht = new SIG_XMSS[i12];
        for (int i18 = 0; i18 != i12; i18++) {
            int i19 = i14 * i3;
            byte[] bArr6 = new byte[i19];
            System.arraycopy(bArr, i15, bArr6, 0, i19);
            i15 += i19;
            byte[][] bArr7 = new byte[i13][];
            for (int i20 = 0; i20 != i13; i20++) {
                byte[] bArr8 = new byte[i3];
                bArr7[i20] = bArr8;
                System.arraycopy(bArr, i15, bArr8, 0, i3);
                i15 += i3;
            }
            this.sig_ht[i18] = new SIG_XMSS(bArr6, bArr7);
        }
        if (i15 != bArr.length) {
            throw new IllegalArgumentException(StubApp.getString2(34189));
        }
    }

    public byte[] getR() {
        return this.f19469r;
    }

    public SIG_FORS[] getSIG_FORS() {
        return this.sig_fors;
    }

    public SIG_XMSS[] getSIG_HT() {
        return this.sig_ht;
    }
}
