package org.bouncycastle.tsp.ers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class IndexedHash {
    final byte[] digest;
    final int order;

    public IndexedHash(int i3, byte[] bArr) {
        this.order = i3;
        this.digest = bArr;
    }
}
