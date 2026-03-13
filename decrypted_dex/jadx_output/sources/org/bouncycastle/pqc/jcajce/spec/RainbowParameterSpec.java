package org.bouncycastle.pqc.jcajce.spec;

import com.stub.StubApp;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RainbowParameterSpec implements AlgorithmParameterSpec {
    private static final int[] DEFAULT_VI = {6, 12, 17, 22, 33};
    private int[] vi;

    public RainbowParameterSpec() {
        this.vi = DEFAULT_VI;
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

    public int getDocumentLength() {
        int[] iArr = this.vi;
        return iArr[iArr.length - 1] - iArr[0];
    }

    public int getNumOfLayers() {
        return this.vi.length - 1;
    }

    public int[] getVi() {
        return Arrays.clone(this.vi);
    }

    public RainbowParameterSpec(int[] iArr) {
        this.vi = iArr;
        checkParams();
    }
}
