package org.bouncycastle.tsp.ers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SortedHashList {
    private static final Comparator<byte[]> hashComp = new ByteArrayComparator();
    private final LinkedList<byte[]> baseList = new LinkedList<>();

    public void add(byte[] bArr) {
        if (this.baseList.size() == 0) {
            this.baseList.addFirst(bArr);
            return;
        }
        if (hashComp.compare(bArr, this.baseList.get(0)) < 0) {
            this.baseList.addFirst(bArr);
            return;
        }
        int i3 = 1;
        while (i3 < this.baseList.size() && hashComp.compare(this.baseList.get(i3), bArr) <= 0) {
            i3++;
        }
        if (i3 == this.baseList.size()) {
            this.baseList.add(bArr);
        } else {
            this.baseList.add(i3, bArr);
        }
    }

    public byte[] getFirst() {
        return this.baseList.getFirst();
    }

    public int size() {
        return this.baseList.size();
    }

    public List<byte[]> toList() {
        return new ArrayList(this.baseList);
    }
}
