package org.bouncycastle.pqc.crypto.picnic;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class KMatrices {
    private int columns;
    private int[] data;
    private int nmatrices;
    private int rows;

    public KMatrices(int i3, int i10, int i11, int[] iArr) {
        this.nmatrices = i3;
        this.rows = i10;
        this.columns = i11;
        this.data = iArr;
    }

    public int getColumns() {
        return this.columns;
    }

    public int[] getData() {
        return this.data;
    }

    public int getNmatrices() {
        return this.nmatrices;
    }

    public int getRows() {
        return this.rows;
    }

    public int getSize() {
        return this.rows * this.columns;
    }
}
