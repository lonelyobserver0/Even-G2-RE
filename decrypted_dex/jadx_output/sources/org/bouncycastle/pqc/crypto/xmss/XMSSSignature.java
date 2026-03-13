package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class XMSSSignature extends XMSSReducedSignature implements XMSSStoreableObjectInterface, Encodable {
    private final int index;
    private final byte[] random;

    /* renamed from: org.bouncycastle.pqc.crypto.xmss.XMSSSignature$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends XMSSReducedSignature.Builder {
        private int index;
        private final XMSSParameters params;
        private byte[] random;

        public Builder(XMSSParameters xMSSParameters) {
            super(xMSSParameters);
            this.index = 0;
            this.random = null;
            this.params = xMSSParameters;
        }

        public Builder withIndex(int i3) {
            this.index = i3;
            return this;
        }

        public Builder withRandom(byte[] bArr) {
            this.random = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withSignature(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException(StubApp.getString2(34307));
            }
            int treeDigestSize = this.params.getTreeDigestSize();
            int len = this.params.getWOTSPlus().getParams().getLen();
            int height = this.params.getHeight() * treeDigestSize;
            this.index = Pack.bigEndianToInt(bArr, 0);
            this.random = XMSSUtil.extractBytesAtOffset(bArr, 4, treeDigestSize);
            withReducedSignature(XMSSUtil.extractBytesAtOffset(bArr, 4 + treeDigestSize, (len * treeDigestSize) + height));
            return this;
        }

        @Override // org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature.Builder
        public XMSSSignature build() {
            return new XMSSSignature(this, null);
        }
    }

    private XMSSSignature(Builder builder) {
        super(builder);
        this.index = builder.index;
        int treeDigestSize = getParams().getTreeDigestSize();
        byte[] bArr = builder.random;
        if (bArr == null) {
            this.random = new byte[treeDigestSize];
        } else {
            if (bArr.length != treeDigestSize) {
                throw new IllegalArgumentException(StubApp.getString2(34348));
            }
            this.random = bArr;
        }
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return toByteArray();
    }

    public int getIndex() {
        return this.index;
    }

    public byte[] getRandom() {
        return XMSSUtil.cloneArray(this.random);
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSReducedSignature, org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public byte[] toByteArray() {
        int treeDigestSize = getParams().getTreeDigestSize();
        byte[] bArr = new byte[u.C(treeDigestSize, 4, getParams().getWOTSPlus().getParams().getLen() * treeDigestSize, getParams().getHeight() * treeDigestSize)];
        Pack.intToBigEndian(this.index, bArr, 0);
        XMSSUtil.copyBytesAtOffset(bArr, this.random, 4);
        int i3 = 4 + treeDigestSize;
        for (byte[] bArr2 : getWOTSPlusSignature().toByteArray()) {
            XMSSUtil.copyBytesAtOffset(bArr, bArr2, i3);
            i3 += treeDigestSize;
        }
        for (int i10 = 0; i10 < getAuthPath().size(); i10++) {
            XMSSUtil.copyBytesAtOffset(bArr, getAuthPath().get(i10).getValue(), i3);
            i3 += treeDigestSize;
        }
        return bArr;
    }

    public /* synthetic */ XMSSSignature(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }
}
