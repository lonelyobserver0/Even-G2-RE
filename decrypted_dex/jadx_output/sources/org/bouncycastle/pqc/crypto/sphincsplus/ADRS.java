package org.bouncycastle.pqc.crypto.sphincsplus;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
class ADRS {
    public static final int FORS_PK = 4;
    public static final int FORS_PRF = 6;
    public static final int FORS_TREE = 3;
    static final int OFFSET_CHAIN_ADDR = 24;
    static final int OFFSET_HASH_ADDR = 28;
    static final int OFFSET_KP_ADDR = 20;
    static final int OFFSET_LAYER = 0;
    static final int OFFSET_TREE = 4;
    static final int OFFSET_TREE_HGT = 24;
    static final int OFFSET_TREE_INDEX = 28;
    static final int OFFSET_TYPE = 16;
    public static final int TREE = 2;
    public static final int WOTS_HASH = 0;
    public static final int WOTS_PK = 1;
    public static final int WOTS_PRF = 5;
    final byte[] value;

    public ADRS() {
        this.value = new byte[32];
    }

    public void changeType(int i3) {
        Pack.intToBigEndian(i3, this.value, 16);
    }

    public int getKeyPairAddress() {
        return Pack.bigEndianToInt(this.value, 20);
    }

    public int getLayerAddress() {
        return Pack.bigEndianToInt(this.value, 0);
    }

    public long getTreeAddress() {
        return Pack.bigEndianToLong(this.value, 8);
    }

    public int getTreeHeight() {
        return Pack.bigEndianToInt(this.value, 24);
    }

    public int getTreeIndex() {
        return Pack.bigEndianToInt(this.value, 28);
    }

    public int getType() {
        return Pack.bigEndianToInt(this.value, 16);
    }

    public void setChainAddress(int i3) {
        Pack.intToBigEndian(i3, this.value, 24);
    }

    public void setHashAddress(int i3) {
        Pack.intToBigEndian(i3, this.value, 28);
    }

    public void setKeyPairAddress(int i3) {
        Pack.intToBigEndian(i3, this.value, 20);
    }

    public void setLayerAddress(int i3) {
        Pack.intToBigEndian(i3, this.value, 0);
    }

    public void setTreeAddress(long j) {
        Pack.longToBigEndian(j, this.value, 8);
    }

    public void setTreeHeight(int i3) {
        Pack.intToBigEndian(i3, this.value, 24);
    }

    public void setTreeIndex(int i3) {
        Pack.intToBigEndian(i3, this.value, 28);
    }

    public void setType(int i3) {
        Pack.intToBigEndian(i3, this.value, 16);
        byte[] bArr = this.value;
        Arrays.fill(bArr, 20, bArr.length, (byte) 0);
    }

    public ADRS(ADRS adrs) {
        byte[] bArr = new byte[32];
        this.value = bArr;
        byte[] bArr2 = adrs.value;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
    }
}
