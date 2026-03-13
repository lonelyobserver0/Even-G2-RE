package org.bouncycastle.pqc.crypto.cmce;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
abstract class GF {
    protected final int GFBITS;
    protected final int GFMASK;

    public GF(int i3) {
        this.GFBITS = i3;
        this.GFMASK = (1 << i3) - 1;
    }

    public short gf_add(short s10, short s11) {
        return (short) (s10 ^ s11);
    }

    public abstract short gf_frac(short s10, short s11);

    public abstract short gf_inv(short s10);

    public short gf_iszero(short s10) {
        return (short) ((s10 - 1) >>> 19);
    }

    public abstract short gf_mul(short s10, short s11);
}
