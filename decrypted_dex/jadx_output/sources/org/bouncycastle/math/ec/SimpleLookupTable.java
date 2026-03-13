package org.bouncycastle.math.ec;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SimpleLookupTable extends AbstractECLookupTable {
    private final ECPoint[] points;

    public SimpleLookupTable(ECPoint[] eCPointArr, int i3, int i10) {
        this.points = copy(eCPointArr, i3, i10);
    }

    private static ECPoint[] copy(ECPoint[] eCPointArr, int i3, int i10) {
        ECPoint[] eCPointArr2 = new ECPoint[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            eCPointArr2[i11] = eCPointArr[i3 + i11];
        }
        return eCPointArr2;
    }

    @Override // org.bouncycastle.math.ec.ECLookupTable
    public int getSize() {
        return this.points.length;
    }

    @Override // org.bouncycastle.math.ec.ECLookupTable
    public ECPoint lookup(int i3) {
        throw new UnsupportedOperationException(StubApp.getString2(32931));
    }

    @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
    public ECPoint lookupVar(int i3) {
        return this.points[i3];
    }
}
