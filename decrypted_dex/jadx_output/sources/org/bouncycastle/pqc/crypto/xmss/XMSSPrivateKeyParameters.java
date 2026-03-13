package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.pqc.crypto.xmss.OTSHashAddress;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;
import org.bouncycastle.util.Pack;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class XMSSPrivateKeyParameters extends XMSSKeyParameters implements XMSSStoreableObjectInterface, Encodable {
    private volatile BDS bdsState;
    private final XMSSParameters params;
    private final byte[] publicSeed;
    private final byte[] root;
    private final byte[] secretKeyPRF;
    private final byte[] secretKeySeed;

    /* renamed from: org.bouncycastle.pqc.crypto.xmss.XMSSPrivateKeyParameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private final XMSSParameters params;
        private int index = 0;
        private int maxIndex = -1;
        private byte[] secretKeySeed = null;
        private byte[] secretKeyPRF = null;
        private byte[] publicSeed = null;
        private byte[] root = null;
        private BDS bdsState = null;
        private byte[] privateKey = null;

        public Builder(XMSSParameters xMSSParameters) {
            this.params = xMSSParameters;
        }

        public XMSSPrivateKeyParameters build() {
            return new XMSSPrivateKeyParameters(this, null);
        }

        public Builder withBDSState(BDS bds) {
            this.bdsState = bds;
            return this;
        }

        public Builder withIndex(int i3) {
            this.index = i3;
            return this;
        }

        public Builder withMaxIndex(int i3) {
            this.maxIndex = i3;
            return this;
        }

        public Builder withPrivateKey(byte[] bArr) {
            this.privateKey = XMSSUtil.cloneArray(bArr);
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

        public Builder withSecretKeyPRF(byte[] bArr) {
            this.secretKeyPRF = XMSSUtil.cloneArray(bArr);
            return this;
        }

        public Builder withSecretKeySeed(byte[] bArr) {
            this.secretKeySeed = XMSSUtil.cloneArray(bArr);
            return this;
        }
    }

    private XMSSPrivateKeyParameters(Builder builder) {
        super(true, builder.params.getTreeDigest());
        XMSSParameters xMSSParameters = builder.params;
        this.params = xMSSParameters;
        if (xMSSParameters == null) {
            throw new NullPointerException(StubApp.getString2(34299));
        }
        int treeDigestSize = xMSSParameters.getTreeDigestSize();
        byte[] bArr = builder.privateKey;
        if (bArr != null) {
            int height = xMSSParameters.getHeight();
            int bigEndianToInt = Pack.bigEndianToInt(bArr, 0);
            if (!XMSSUtil.isIndexValid(height, bigEndianToInt)) {
                throw new IllegalArgumentException(StubApp.getString2(34233));
            }
            this.secretKeySeed = XMSSUtil.extractBytesAtOffset(bArr, 4, treeDigestSize);
            int i3 = 4 + treeDigestSize;
            this.secretKeyPRF = XMSSUtil.extractBytesAtOffset(bArr, i3, treeDigestSize);
            int i10 = i3 + treeDigestSize;
            this.publicSeed = XMSSUtil.extractBytesAtOffset(bArr, i10, treeDigestSize);
            int i11 = i10 + treeDigestSize;
            this.root = XMSSUtil.extractBytesAtOffset(bArr, i11, treeDigestSize);
            int i12 = i11 + treeDigestSize;
            try {
                BDS bds = (BDS) XMSSUtil.deserialize(XMSSUtil.extractBytesAtOffset(bArr, i12, bArr.length - i12), BDS.class);
                if (bds.getIndex() != bigEndianToInt) {
                    throw new IllegalStateException(StubApp.getString2("34359"));
                }
                this.bdsState = bds.withWOTSDigest(builder.params.getTreeDigestOID());
                return;
            } catch (IOException e10) {
                throw new IllegalArgumentException(e10.getMessage(), e10);
            } catch (ClassNotFoundException e11) {
                throw new IllegalArgumentException(e11.getMessage(), e11);
            }
        }
        byte[] bArr2 = builder.secretKeySeed;
        if (bArr2 == null) {
            this.secretKeySeed = new byte[treeDigestSize];
        } else {
            if (bArr2.length != treeDigestSize) {
                throw new IllegalArgumentException(StubApp.getString2(34337));
            }
            this.secretKeySeed = bArr2;
        }
        byte[] bArr3 = builder.secretKeyPRF;
        if (bArr3 == null) {
            this.secretKeyPRF = new byte[treeDigestSize];
        } else {
            if (bArr3.length != treeDigestSize) {
                throw new IllegalArgumentException(StubApp.getString2(34338));
            }
            this.secretKeyPRF = bArr3;
        }
        byte[] bArr4 = builder.publicSeed;
        if (bArr4 == null) {
            this.publicSeed = new byte[treeDigestSize];
        } else {
            if (bArr4.length != treeDigestSize) {
                throw new IllegalArgumentException(StubApp.getString2(34339));
            }
            this.publicSeed = bArr4;
        }
        byte[] bArr5 = builder.root;
        if (bArr5 == null) {
            this.root = new byte[treeDigestSize];
        } else {
            if (bArr5.length != treeDigestSize) {
                throw new IllegalArgumentException(StubApp.getString2(34340));
            }
            this.root = bArr5;
        }
        BDS bds2 = builder.bdsState;
        if (bds2 == null) {
            if (builder.index < (1 << xMSSParameters.getHeight()) - 2 && bArr4 != null && bArr2 != null) {
                this.bdsState = new BDS(xMSSParameters, bArr4, bArr2, (OTSHashAddress) new OTSHashAddress.Builder().build(), builder.index);
                if (builder.maxIndex < 0 && builder.maxIndex != this.bdsState.getMaxIndex()) {
                    throw new IllegalArgumentException(StubApp.getString2(34341));
                }
            }
            bds2 = new BDS(xMSSParameters, (1 << xMSSParameters.getHeight()) - 1, builder.index);
        }
        this.bdsState = bds2;
        if (builder.maxIndex < 0) {
        }
    }

    public XMSSPrivateKeyParameters extractKeyShard(int i3) {
        XMSSPrivateKeyParameters build;
        if (i3 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(34342));
        }
        synchronized (this) {
            long j = i3;
            try {
                if (j > getUsagesRemaining()) {
                    throw new IllegalArgumentException(StubApp.getString2("34041"));
                }
                build = new Builder(this.params).withSecretKeySeed(this.secretKeySeed).withSecretKeyPRF(this.secretKeyPRF).withPublicSeed(this.publicSeed).withRoot(this.root).withIndex(getIndex()).withBDSState(this.bdsState.withMaxIndex((this.bdsState.getIndex() + i3) - 1, this.params.getTreeDigestOID())).build();
                if (j == getUsagesRemaining()) {
                    this.bdsState = new BDS(this.params, this.bdsState.getMaxIndex(), getIndex() + i3);
                } else {
                    OTSHashAddress oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().build();
                    for (int i10 = 0; i10 != i3; i10++) {
                        this.bdsState = this.bdsState.getNextState(this.publicSeed, this.secretKeySeed, oTSHashAddress);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return build;
    }

    public BDS getBDSState() {
        return this.bdsState;
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        byte[] byteArray;
        synchronized (this) {
            byteArray = toByteArray();
        }
        return byteArray;
    }

    public int getIndex() {
        return this.bdsState.getIndex();
    }

    public XMSSPrivateKeyParameters getNextKey() {
        XMSSPrivateKeyParameters extractKeyShard;
        synchronized (this) {
            extractKeyShard = extractKeyShard(1);
        }
        return extractKeyShard;
    }

    public XMSSParameters getParameters() {
        return this.params;
    }

    public byte[] getPublicSeed() {
        return XMSSUtil.cloneArray(this.publicSeed);
    }

    public byte[] getRoot() {
        return XMSSUtil.cloneArray(this.root);
    }

    public byte[] getSecretKeyPRF() {
        return XMSSUtil.cloneArray(this.secretKeyPRF);
    }

    public byte[] getSecretKeySeed() {
        return XMSSUtil.cloneArray(this.secretKeySeed);
    }

    public long getUsagesRemaining() {
        long maxIndex;
        synchronized (this) {
            maxIndex = (this.bdsState.getMaxIndex() - getIndex()) + 1;
        }
        return maxIndex;
    }

    public XMSSPrivateKeyParameters rollKey() {
        synchronized (this) {
            try {
                this.bdsState = this.bdsState.getIndex() < this.bdsState.getMaxIndex() ? this.bdsState.getNextState(this.publicSeed, this.secretKeySeed, (OTSHashAddress) new OTSHashAddress.Builder().build()) : new BDS(this.params, this.bdsState.getMaxIndex(), this.bdsState.getMaxIndex() + 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    @Override // org.bouncycastle.pqc.crypto.xmss.XMSSStoreableObjectInterface
    public byte[] toByteArray() {
        byte[] concatenate;
        String string2 = StubApp.getString2(34343);
        synchronized (this) {
            try {
                int treeDigestSize = this.params.getTreeDigestSize();
                byte[] bArr = new byte[treeDigestSize + 4 + treeDigestSize + treeDigestSize + treeDigestSize];
                Pack.intToBigEndian(this.bdsState.getIndex(), bArr, 0);
                XMSSUtil.copyBytesAtOffset(bArr, this.secretKeySeed, 4);
                int i3 = 4 + treeDigestSize;
                XMSSUtil.copyBytesAtOffset(bArr, this.secretKeyPRF, i3);
                int i10 = i3 + treeDigestSize;
                XMSSUtil.copyBytesAtOffset(bArr, this.publicSeed, i10);
                XMSSUtil.copyBytesAtOffset(bArr, this.root, i10 + treeDigestSize);
                try {
                    concatenate = Arrays.concatenate(bArr, XMSSUtil.serialize(this.bdsState));
                } catch (IOException e10) {
                    throw new RuntimeException(string2 + e10.getMessage());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return concatenate;
    }

    public /* synthetic */ XMSSPrivateKeyParameters(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }
}
