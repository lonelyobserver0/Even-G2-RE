package org.bouncycastle.pqc.legacy.crypto.rainbow;

import com.stub.StubApp;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RainbowParameters implements CipherParameters {
    private final int[] DEFAULT_VI;
    private int[] vi;

    public RainbowParameters() {
        int[] iArr = {6, 12, 17, 22, 33};
        this.DEFAULT_VI = iArr;
        this.vi = iArr;
    }

    private void checkParams() {
        int[] iArr;
        int i3;
        int[] iArr2 = this.vi;
        if (iArr2 == null) {
            throw new IllegalArgumentException(StubApp.getString2(34752));
        }
        if (iArr2.length <= 1) {
            throw new IllegalArgumentException(StubApp.getString2(34751));
        }
        int i10 = 0;
        do {
            iArr = this.vi;
            if (i10 >= iArr.length - 1) {
                return;
            }
            i3 = iArr[i10];
            i10++;
        } while (i3 < iArr[i10]);
        throw new IllegalArgumentException(StubApp.getString2(34750));
    }

    public int getDocLength() {
        int[] iArr = this.vi;
        return iArr[iArr.length - 1] - iArr[0];
    }

    public int getNumOfLayers() {
        return this.vi.length - 1;
    }

    public int[] getVi() {
        return this.vi;
    }

    public RainbowParameters(int[] iArr) {
        this.DEFAULT_VI = new int[]{6, 12, 17, 22, 33};
        this.vi = iArr;
        checkParams();
    }
}
