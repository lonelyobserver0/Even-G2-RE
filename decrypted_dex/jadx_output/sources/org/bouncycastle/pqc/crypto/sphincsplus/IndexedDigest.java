package org.bouncycastle.pqc.crypto.sphincsplus;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class IndexedDigest {
    final byte[] digest;
    final int idx_leaf;
    final long idx_tree;

    public IndexedDigest(long j, int i3, byte[] bArr) {
        this.idx_tree = j;
        this.idx_leaf = i3;
        this.digest = bArr;
    }
}
