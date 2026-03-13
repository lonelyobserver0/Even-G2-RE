package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class XMSSAddress {
    private final int keyAndMask;
    private final int layerAddress;
    private final long treeAddress;
    private final int type;

    public static abstract class Builder<T extends Builder> {
        private final int type;
        private int layerAddress = 0;
        private long treeAddress = 0;
        private int keyAndMask = 0;

        public Builder(int i3) {
            this.type = i3;
        }

        public abstract XMSSAddress build();

        public abstract T getThis();

        public T withKeyAndMask(int i3) {
            this.keyAndMask = i3;
            return getThis();
        }

        public T withLayerAddress(int i3) {
            this.layerAddress = i3;
            return getThis();
        }

        public T withTreeAddress(long j) {
            this.treeAddress = j;
            return getThis();
        }
    }

    public XMSSAddress(Builder builder) {
        this.layerAddress = builder.layerAddress;
        this.treeAddress = builder.treeAddress;
        this.type = builder.type;
        this.keyAndMask = builder.keyAndMask;
    }

    public final int getKeyAndMask() {
        return this.keyAndMask;
    }

    public final int getLayerAddress() {
        return this.layerAddress;
    }

    public final long getTreeAddress() {
        return this.treeAddress;
    }

    public final int getType() {
        return this.type;
    }

    public byte[] toByteArray() {
        byte[] bArr = new byte[32];
        Pack.intToBigEndian(this.layerAddress, bArr, 0);
        Pack.longToBigEndian(this.treeAddress, bArr, 4);
        Pack.intToBigEndian(this.type, bArr, 12);
        Pack.intToBigEndian(this.keyAndMask, bArr, 28);
        return bArr;
    }
}
