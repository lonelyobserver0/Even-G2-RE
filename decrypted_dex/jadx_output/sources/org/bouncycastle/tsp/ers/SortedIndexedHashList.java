package org.bouncycastle.tsp.ers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SortedIndexedHashList {
    private static final Comparator<byte[]> hashComp = new ByteArrayComparator();
    private final LinkedList<IndexedHash> baseList = new LinkedList<>();

    public void add(IndexedHash indexedHash) {
        if (this.baseList.size() == 0) {
            this.baseList.addFirst(indexedHash);
            return;
        }
        if (hashComp.compare(indexedHash.digest, this.baseList.get(0).digest) < 0) {
            this.baseList.addFirst(indexedHash);
            return;
        }
        int i3 = 1;
        while (i3 < this.baseList.size() && hashComp.compare(this.baseList.get(i3).digest, indexedHash.digest) <= 0) {
            i3++;
        }
        if (i3 == this.baseList.size()) {
            this.baseList.add(indexedHash);
        } else {
            this.baseList.add(i3, indexedHash);
        }
    }

    public IndexedHash getFirst() {
        return this.baseList.getFirst();
    }

    public int size() {
        return this.baseList.size();
    }

    public List<IndexedHash> toList() {
        return new ArrayList(this.baseList);
    }
}
