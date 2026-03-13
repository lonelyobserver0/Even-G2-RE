package org.bouncycastle.pqc.legacy.crypto.qtesla;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class IntSlicer {
    private int base;
    private final int[] values;

    public IntSlicer(int[] iArr, int i3) {
        this.values = iArr;
        this.base = i3;
    }

    public final int at(int i3) {
        return this.values[this.base + i3];
    }

    public final IntSlicer copy() {
        return new IntSlicer(this.values, this.base);
    }

    public final IntSlicer from(int i3) {
        return new IntSlicer(this.values, this.base + i3);
    }

    public final void incBase(int i3) {
        this.base += i3;
    }

    public final int at(int i3, int i10) {
        this.values[this.base + i3] = i10;
        return i10;
    }

    public final int at(int i3, long j) {
        int[] iArr = this.values;
        int i10 = this.base + i3;
        int i11 = (int) j;
        iArr[i10] = i11;
        return i11;
    }
}
