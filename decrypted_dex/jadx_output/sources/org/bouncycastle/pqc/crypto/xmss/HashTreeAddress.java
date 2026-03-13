package org.bouncycastle.pqc.crypto.xmss;

import org.bouncycastle.pqc.crypto.xmss.XMSSAddress;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class HashTreeAddress extends XMSSAddress {
    private static final int PADDING = 0;
    private static final int TYPE = 2;
    private final int padding;
    private final int treeHeight;
    private final int treeIndex;

    /* renamed from: org.bouncycastle.pqc.crypto.xmss.HashTreeAddress$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends XMSSAddress.Builder<Builder> {
        private int treeHeight;
        private int treeIndex;

        public Builder() {
            super(2);
            this.treeHeight = 0;
            this.treeIndex = 0;
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        public XMSSAddress build() {
            return new HashTreeAddress(this, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSAddress.Builder
        public Builder getThis() {
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

    private HashTreeAddress(Builder builder) {
        super(builder);
        this.padding = 0;
        this.treeHeight = builder.treeHeight;
        this.treeIndex = builder.treeIndex;
    }

    public int getPadding() {
        return this.padding;
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
        Pack.intToBigEndian(this.padding, byteArray, 16);
        Pack.intToBigEndian(this.treeHeight, byteArray, 20);
        Pack.intToBigEndian(this.treeIndex, byteArray, 24);
        return byteArray;
    }

    public /* synthetic */ HashTreeAddress(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }
}
