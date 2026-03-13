package org.bouncycastle.crypto.modes.gcm;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Tables1kGCMExponentiator implements GCMExponentiator {
    private List lookupPowX2;

    private long[] getPowX2(int i3) {
        int size = this.lookupPowX2.size() - 1;
        if (size < i3) {
            long[] jArr = (long[]) this.lookupPowX2.get(size);
            while (true) {
                long[] jArr2 = new long[2];
                GCMUtil.square(jArr, jArr2);
                this.lookupPowX2.add(jArr2);
                size++;
                if (size >= i3) {
                    break;
                }
                jArr = jArr2;
            }
        }
        return (long[]) this.lookupPowX2.get(i3);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void exponentiateX(long j, byte[] bArr) {
        long[] oneAsLongs = GCMUtil.oneAsLongs();
        int i3 = 0;
        while (j > 0) {
            if ((1 & j) != 0) {
                GCMUtil.multiply(oneAsLongs, getPowX2(i3));
            }
            i3++;
            j >>>= 1;
        }
        GCMUtil.asBytes(oneAsLongs, bArr);
    }

    @Override // org.bouncycastle.crypto.modes.gcm.GCMExponentiator
    public void init(byte[] bArr) {
        long[] asLongs = GCMUtil.asLongs(bArr);
        List list = this.lookupPowX2;
        if (list == null || 0 == GCMUtil.areEqual(asLongs, (long[]) list.get(0))) {
            ArrayList arrayList = new ArrayList(8);
            this.lookupPowX2 = arrayList;
            arrayList.add(asLongs);
        }
    }
}
