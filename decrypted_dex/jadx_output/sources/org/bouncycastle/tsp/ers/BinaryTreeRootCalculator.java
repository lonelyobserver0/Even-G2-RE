package org.bouncycastle.tsp.ers;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.tsp.PartialHashtree;
import org.bouncycastle.operator.DigestCalculator;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BinaryTreeRootCalculator implements ERSRootNodeCalculator {
    private List<List<byte[]>> tree;

    @Override // org.bouncycastle.tsp.ers.ERSRootNodeCalculator
    public PartialHashtree[] computePathToRoot(DigestCalculator digestCalculator, PartialHashtree partialHashtree, int i3) {
        List<byte[]> list;
        int i10;
        ArrayList arrayList = new ArrayList();
        byte[] computeNodeHash = ERSUtil.computeNodeHash(digestCalculator, partialHashtree);
        arrayList.add(partialHashtree);
        int i11 = 0;
        while (i11 < this.tree.size() - 1) {
            if (i3 == this.tree.get(i11).size() - 1) {
                while (true) {
                    int i12 = i11 + 1;
                    if (!Arrays.areEqual(computeNodeHash, this.tree.get(i12).get(r3.size() - 1))) {
                        break;
                    }
                    i3 = this.tree.get(i12).size() - 1;
                    i11 = i12;
                }
            }
            if ((i3 & 1) == 0) {
                list = this.tree.get(i11);
                i10 = i3 + 1;
            } else {
                list = this.tree.get(i11);
                i10 = i3 - 1;
            }
            byte[] bArr = list.get(i10);
            arrayList.add(new PartialHashtree(bArr));
            computeNodeHash = ERSUtil.calculateBranchHash(digestCalculator, computeNodeHash, bArr);
            i3 /= 2;
            i11++;
        }
        return (PartialHashtree[]) arrayList.toArray(new PartialHashtree[0]);
    }

    @Override // org.bouncycastle.tsp.ers.ERSRootNodeCalculator
    public byte[] computeRootHash(DigestCalculator digestCalculator, PartialHashtree[] partialHashtreeArr) {
        ArrayList arrayList;
        SortedHashList sortedHashList = new SortedHashList();
        for (PartialHashtree partialHashtree : partialHashtreeArr) {
            sortedHashList.add(ERSUtil.computeNodeHash(digestCalculator, partialHashtree));
        }
        List<byte[]> list = sortedHashList.toList();
        ArrayList arrayList2 = new ArrayList();
        this.tree = arrayList2;
        arrayList2.add(list);
        if (list.size() > 1) {
            while (true) {
                arrayList = new ArrayList((list.size() / 2) + 1);
                for (int i3 = 0; i3 <= list.size() - 2; i3 += 2) {
                    arrayList.add(ERSUtil.calculateBranchHash(digestCalculator, list.get(i3), list.get(i3 + 1)));
                }
                if (list.size() % 2 == 1) {
                    arrayList.add(list.get(list.size() - 1));
                }
                this.tree.add(arrayList);
                if (arrayList.size() <= 1) {
                    break;
                }
                list = arrayList;
            }
            list = arrayList;
        }
        return list.get(0);
    }

    @Override // org.bouncycastle.tsp.ers.ERSRootNodeCalculator
    public byte[] recoverRootHash(DigestCalculator digestCalculator, PartialHashtree[] partialHashtreeArr) {
        byte[] computeNodeHash = ERSUtil.computeNodeHash(digestCalculator, partialHashtreeArr[0]);
        for (int i3 = 1; i3 < partialHashtreeArr.length; i3++) {
            computeNodeHash = ERSUtil.calculateBranchHash(digestCalculator, computeNodeHash, ERSUtil.computeNodeHash(digestCalculator, partialHashtreeArr[i3]));
        }
        return computeNodeHash;
    }
}
