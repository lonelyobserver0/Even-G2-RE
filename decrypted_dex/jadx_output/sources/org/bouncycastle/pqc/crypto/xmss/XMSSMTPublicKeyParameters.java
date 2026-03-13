package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class XMSSMTPublicKeyParameters extends XMSSMTKeyParameters implements XMSSStoreableObjectInterface, Encodable {
    private final int oid;
    private final XMSSMTParameters params;
    private final byte[] publicSeed;
    private final byte[] root;

    /* renamed from: org.bouncycastle.pqc.crypto.xmss.XMSSMTPublicKeyParameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private final XMSSMTParameters params;
        private byte[] root = null;
        private byte[] publicSeed = null;
        private byte[] publicKey = null;

        public Builder(XMSSMTParameters xMSSMTParameters) {
            this.params = xMSSMTParameters;
        }

        public XMSSMTPublicKeyParameters build() {
            return new XMSSMTPublicKeyParameters(this, null);
        }

        public Builder withPublicKey(byte[] bArr) {
            this.publicKey = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withPublicSeed(byte[] bArr) {
            this.publicSeed = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withRoot(byte[] bArr) {
            this.root = XMSSUtil.cloneArray(bArr);
            return this;
        }
    }

    private XMSSMTPublicKeyParameters(Builder builder) {
        super(false, builder.params.getTreeDigest());
        XMSSMTParameters xMSSMTParameters = builder.params;
        this.params = xMSSMTParameters;
        if (xMSSMTParameters == null) {
            throw new NullPointerException(StubApp.getString2(34299));
        }
        int treeDigestSize = xMSSMTParameters.getTreeDigestSize();
        byte[] bArr = builder.publicKey;
        if (bArr != null) {
            if (bArr.length == treeDigestSize + treeDigestSize) {
                this.oid = 0;
                this.root = XMSSUtil.extractBytesAtOffset(bArr, 0, treeDigestSize);
                this.publicSeed = XMSSUtil.extractBytesAtOffset(bArr, treeDigestSize, treeDigestSize);
                return;
            } else {
                if (bArr.length != treeDigestSize + 4 + treeDigestSize) {
                    throw new IllegalArgumentException(StubApp.getString2(34344));
                }
                this.oid = Pack.bigEndianToInt(bArr, 0);
                this.root = XMSSUtil.extractBytesAtOffset(bArr, 4, treeDigestSize);
                this.publicSeed = XMSSUtil.extractBytesAtOffset(bArr, 4 + treeDigestSize, treeDigestSize);
                return;
            }
        }
        if (xMSSMTParameters.getOid() != null) {
            this.oid = xMSSMTParameters.getOid().getOid();
        } else {
            this.oid = 0;
        }
        byte[] bArr2 = builder.root;
        if (bArr2 == null) {
            this.root = new byte[treeDigestSize];
        } else {
            if (bArr2.length != treeDigestSize) {
                throw new IllegalArgumentException(StubApp.getString2(34345));
            }
            this.root = bArr2;
        }
        byte[] bArr3 = builder.publicSeed;
        if (bArr3 == null) {
            this.publicSeed = new byte[treeDigestSize];
        } else {
            if (bArr3.length != treeDigestSize) {
                throw new IllegalArgumentException(StubApp.getString2(34346));
            }
            this.publicSeed = bArr3;
        }
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return toByteArray();
    }

    public XMSSMTParameters getParameters() {
        return this.params;
    }

    public byte[] getPublicSeed() {
        return XMSSUtil.cloneArray(this.publicSeed);
    }

    public byte[] getRoot() {
        return XMSSUtil.cloneArray(this.root);
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public byte[] toByteArray() {
        byte[] bArr;
        int treeDigestSize = this.params.getTreeDigestSize();
        int i3 = this.oid;
        int i10 = 0;
        if (i3 != 0) {
            bArr = new byte[treeDigestSize + 4 + treeDigestSize];
            Pack.intToBigEndian(i3, bArr, 0);
            i10 = 4;
        } else {
            bArr = new byte[treeDigestSize + treeDigestSize];
        }
        XMSSUtil.copyBytesAtOffset(bArr, this.root, i10);
        XMSSUtil.copyBytesAtOffset(bArr, this.publicSeed, i10 + treeDigestSize);
        return bArr;
    }

    public /* synthetic */ XMSSMTPublicKeyParameters(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }
}
