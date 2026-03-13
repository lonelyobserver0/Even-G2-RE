package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class XMSSReducedSignature implements XMSSStoreableObjectInterface {
    private final List<XMSSNode> authPath;
    private final XMSSParameters params;
    private final WOTSPlusSignature wotsPlusSignature;

    public static class Builder {
        private final XMSSParameters params;
        private WOTSPlusSignature wotsPlusSignature = null;
        private List<XMSSNode> authPath = null;
        private byte[] reducedSignature = null;

        public Builder(XMSSParameters xMSSParameters) {
            this.params = xMSSParameters;
        }

        public XMSSReducedSignature build() {
            return new XMSSReducedSignature(this);
        }

        public Builder withAuthPath(List<XMSSNode> list) {
            this.authPath = list;
            return this;
        }

        public Builder withReducedSignature(byte[] bArr) {
            this.reducedSignature = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withWOTSPlusSignature(WOTSPlusSignature wOTSPlusSignature) {
            this.wotsPlusSignature = wOTSPlusSignature;
            return this;
        }
    }

    public XMSSReducedSignature(Builder builder) {
        XMSSParameters xMSSParameters = builder.params;
        this.params = xMSSParameters;
        if (xMSSParameters == null) {
            throw new NullPointerException(StubApp.getString2(34299));
        }
        int treeDigestSize = xMSSParameters.getTreeDigestSize();
        int len = xMSSParameters.getWOTSPlus().getParams().getLen();
        int height = xMSSParameters.getHeight();
        byte[] bArr = builder.reducedSignature;
        if (bArr == null) {
            WOTSPlusSignature wOTSPlusSignature = builder.wotsPlusSignature;
            this.wotsPlusSignature = wOTSPlusSignature == null ? new WOTSPlusSignature(xMSSParameters.getWOTSPlus().getParams(), (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, len, treeDigestSize)) : wOTSPlusSignature;
            List<XMSSNode> list = builder.authPath;
            if (list == null) {
                this.authPath = new ArrayList();
                return;
            } else {
                if (list.size() != height) {
                    throw new IllegalArgumentException(StubApp.getString2(34360));
                }
                this.authPath = list;
                return;
            }
        }
        if (bArr.length != (height * treeDigestSize) + (len * treeDigestSize)) {
            throw new IllegalArgumentException(StubApp.getString2(34347));
        }
        byte[][] bArr2 = new byte[len][];
        int i3 = 0;
        for (int i10 = 0; i10 < len; i10++) {
            bArr2[i10] = XMSSUtil.extractBytesAtOffset(bArr, i3, treeDigestSize);
            i3 += treeDigestSize;
        }
        this.wotsPlusSignature = new WOTSPlusSignature(this.params.getWOTSPlus().getParams(), bArr2);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < height; i11++) {
            arrayList.add(new XMSSNode(i11, XMSSUtil.extractBytesAtOffset(bArr, i3, treeDigestSize)));
            i3 += treeDigestSize;
        }
        this.authPath = arrayList;
    }

    public List<XMSSNode> getAuthPath() {
        return this.authPath;
    }

    public XMSSParameters getParams() {
        return this.params;
    }

    public WOTSPlusSignature getWOTSPlusSignature() {
        return this.wotsPlusSignature;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public byte[] toByteArray() {
        int treeDigestSize = this.params.getTreeDigestSize();
        byte[] bArr = new byte[(this.params.getHeight() * treeDigestSize) + (this.params.getWOTSPlus().getParams().getLen() * treeDigestSize)];
        int i3 = 0;
        for (byte[] bArr2 : this.wotsPlusSignature.toByteArray()) {
            XMSSUtil.copyBytesAtOffset(bArr, bArr2, i3);
            i3 += treeDigestSize;
        }
        for (int i10 = 0; i10 < this.authPath.size(); i10++) {
            XMSSUtil.copyBytesAtOffset(bArr, this.authPath.get(i10).getValue(), i3);
            i3 += treeDigestSize;
        }
        return bArr;
    }
}
