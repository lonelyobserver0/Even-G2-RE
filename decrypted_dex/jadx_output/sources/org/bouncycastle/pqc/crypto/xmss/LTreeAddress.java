package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.XMSSAddress;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class LTreeAddress extends XMSSAddress {
    private static final int TYPE = 1;
    private final int lTreeAddress;
    private final int treeHeight;
    private final int treeIndex;

    /* renamed from: org.bouncycastle.pqc.crypto.xmss.LTreeAddress$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends XMSSAddress.Builder<Builder> {
        private int lTreeAddress;
        private int treeHeight;
        private int treeIndex;

        public Builder() {
            super(1);
            this.lTreeAddress = 0;
            this.treeHeight = 0;
            this.treeIndex = 0;
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        public XMSSAddress build() {
            return new LTreeAddress(this, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        public Builder getThis() {
            return this;
        }

        public Builder withLTreeAddress(int i3) {
            this.lTreeAddress = i3;
            return this;
        }

        public Builder withTreeHeight(int i3) {
            this.treeHeight = i3;
            return this;
        }

        public Builder withTreeIndex(int i3) {
            this.treeIndex = i3;
            return this;
        }
    }

    private LTreeAddress(Builder builder) {
        super(builder);
        this.lTreeAddress = builder.lTreeAddress;
        this.treeHeight = builder.treeHeight;
        this.treeIndex = builder.treeIndex;
    }

    public int getLTreeAddress() {
        return this.lTreeAddress;
    }

    public int getTreeHeight() {
        return this.treeHeight;
    }

    public int getTreeIndex() {
        return this.treeIndex;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress
    public byte[] toByteArray() {
        byte[] byteArray = super.toByteArray();
        Pack.intToBigEndian(this.lTreeAddress, byteArray, 16);
        Pack.intToBigEndian(this.treeHeight, byteArray, 20);
        Pack.intToBigEndian(this.treeIndex, byteArray, 24);
        return byteArray;
    }

    public /* synthetic */ LTreeAddress(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }
}
