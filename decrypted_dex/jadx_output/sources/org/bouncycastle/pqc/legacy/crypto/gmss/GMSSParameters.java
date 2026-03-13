package org.bouncycastle.pqc.legacy.crypto.gmss;

import com.stub.StubApp;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class GMSSParameters {

    /* renamed from: K, reason: collision with root package name */
    private int[] f19508K;
    private int[] heightOfTrees;
    private int numOfLayers;
    private int[] winternitzParameter;

    public GMSSParameters(int i3) throws IllegalArgumentException {
        if (i3 <= 10) {
            init(1, new int[]{10}, new int[]{3}, new int[]{2});
        } else if (i3 <= 20) {
            init(2, new int[]{10, 10}, new int[]{5, 4}, new int[]{2, 2});
        } else {
            init(4, new int[]{10, 10, 10, 10}, new int[]{9, 9, 9, 3}, new int[]{2, 2, 2, 2});
        }
    }

    private void init(int i3, int[] iArr, int[] iArr2, int[] iArr3) throws IllegalArgumentException {
        String string2;
        boolean z2;
        this.numOfLayers = i3;
        if (i3 == iArr2.length && i3 == iArr.length && i3 == iArr3.length) {
            z2 = true;
            string2 = "";
        } else {
            string2 = StubApp.getString2(34758);
            z2 = false;
        }
        for (int i10 = 0; i10 < this.numOfLayers; i10++) {
            int i11 = iArr3[i10];
            if (i11 < 2 || (iArr[i10] - i11) % 2 != 0) {
                string2 = StubApp.getString2(34759);
                z2 = false;
            }
            if (iArr[i10] < 4 || iArr2[i10] < 2) {
                string2 = StubApp.getString2(34760);
                z2 = false;
            }
        }
        if (!z2) {
            throw new IllegalArgumentException(string2);
        }
        this.heightOfTrees = Arrays.clone(iArr);
        this.winternitzParameter = Arrays.clone(iArr2);
        this.f19508K = Arrays.clone(iArr3);
    }

    public int[] getHeightOfTrees() {
        return Arrays.clone(this.heightOfTrees);
    }

    public int[] getK() {
        return Arrays.clone(this.f19508K);
    }

    public int getNumOfLayers() {
        return this.numOfLayers;
    }

    public int[] getWinternitzParameter() {
        return Arrays.clone(this.winternitzParameter);
    }

    public GMSSParameters(int i3, int[] iArr, int[] iArr2, int[] iArr3) throws IllegalArgumentException {
        init(i3, iArr, iArr2, iArr3);
    }
}
