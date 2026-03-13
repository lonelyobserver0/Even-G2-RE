package org.bouncycastle.tsp.ers;

import java.util.Comparator;
import kotlin.UByte;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class ByteArrayComparator implements Comparator {
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        for (int i3 = 0; i3 < bArr.length && i3 < bArr2.length; i3++) {
            int i10 = bArr[i3] & UByte.MAX_VALUE;
            int i11 = bArr2[i3] & UByte.MAX_VALUE;
            if (i10 != i11) {
                return i10 - i11;
            }
        }
        return bArr.length - bArr2.length;
    }
}
