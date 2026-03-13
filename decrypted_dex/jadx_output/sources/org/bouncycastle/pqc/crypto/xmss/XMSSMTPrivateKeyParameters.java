package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Encodable;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class XMSSMTPrivateKeyParameters extends XMSSMTKeyParameters implements XMSSStoreableObjectInterface, Encodable {
    private volatile BDSStateMap bdsState;
    private volatile long index;
    private final XMSSMTParameters params;
    private final byte[] publicSeed;
    private final byte[] root;
    private final byte[] secretKeyPRF;
    private final byte[] secretKeySeed;
    private volatile boolean used;

    /* renamed from: org.bouncycastle.pqc.crypto.xmss.XMSSMTPrivateKeyParameters$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder {
        private final XMSSMTParameters params;
        private long index = 0;
        private long maxIndex = -1;
        private byte[] secretKeySeed = null;
        private byte[] secretKeyPRF = null;
        private byte[] publicSeed = null;
        private byte[] root = null;
        private BDSStateMap bdsState = null;
        private byte[] privateKey = null;
        private XMSSParameters xmss = null;

        public Builder(XMSSMTParameters xMSSMTParameters) {
            this.params = xMSSMTParameters;
        }

        public XMSSMTPrivateKeyParameters build() {
            return new XMSSMTPrivateKeyParameters(this, null);
        }

        public Builder withBDSState(BDSStateMap bDSStateMap) {
            if (bDSStateMap.getMaxIndex() == 0) {
                this.bdsState = new BDSStateMap(bDSStateMap, (1 << this.params.getHeight()) - 1);
                return this;
            }
            this.bdsState = bDSStateMap;
            return this;
        }

        public Builder withIndex(long j) {
            this.index = j;
            return this;
        }

        public Builder withMaxIndex(long j) {
            this.maxIndex = j;
            return this;
        }

        public Builder withPrivateKey(byte[] bArr) {
            this.privateKey = XMSSUtil.cloneArray(bArr);
            this.xmss = this.params.getXMSSParameters();
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

    private XMSSMTPrivateKeyParameters(Builder builder) {
        super(true, builder.params.getTreeDigest());
        XMSSMTParameters xMSSMTParameters = builder.params;
        this.params = xMSSMTParameters;
        if (xMSSMTParameters == null) {
            throw new NullPointerException(StubApp.getString2(34299));
        }
        int treeDigestSize = xMSSMTParameters.getTreeDigestSize();
        byte[] bArr = builder.privateKey;
        if (bArr != null) {
            if (builder.xmss == null) {
                throw new NullPointerException(StubApp.getString2(34336));
            }
            int height = xMSSMTParameters.getHeight();
            int i3 = (height + 7) / 8;
            this.index = XMSSUtil.bytesToXBigEndian(bArr, 0, i3);
            if (!XMSSUtil.isIndexValid(height, this.index)) {
                throw new IllegalArgumentException(StubApp.getString2(34233));
            }
            this.secretKeySeed = XMSSUtil.extractBytesAtOffset(bArr, i3, treeDigestSize);
            int i10 = i3 + treeDigestSize;
            this.secretKeyPRF = XMSSUtil.extractBytesAtOffset(bArr, i10, treeDigestSize);
            int i11 = i10 + treeDigestSize;
            this.publicSeed = XMSSUtil.extractBytesAtOffset(bArr, i11, treeDigestSize);
            int i12 = i11 + treeDigestSize;
            this.root = XMSSUtil.extractBytesAtOffset(bArr, i12, treeDigestSize);
            int i13 = i12 + treeDigestSize;
            try {
                this.bdsState = ((BDSStateMap) XMSSUtil.deserialize(XMSSUtil.extractBytesAtOffset(bArr, i13, bArr.length - i13), BDSStateMap.class)).withWOTSDigest(builder.xmss.getTreeDigestOID());
                return;
            } catch (IOException e10) {
                throw new IllegalArgumentException(e10.getMessage(), e10);
            } catch (ClassNotFoundException e11) {
                throw new IllegalArgumentException(e11.getMessage(), e11);
            }
        }
        this.index = builder.index;
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
        BDSStateMap bDSStateMap = builder.bdsState;
        if (bDSStateMap == null) {
            if (XMSSUtil.isIndexValid(xMSSMTParameters.getHeight(), builder.index) && bArr4 != null && bArr2 != null) {
                this.bdsState = new BDSStateMap(xMSSMTParameters, builder.index, bArr4, bArr2);
                if (builder.maxIndex < 0 && builder.maxIndex != this.bdsState.getMaxIndex()) {
                    throw new IllegalArgumentException(StubApp.getString2(34341));
                }
            }
            bDSStateMap = new BDSStateMap(builder.maxIndex + 1);
        }
        this.bdsState = bDSStateMap;
        if (builder.maxIndex < 0) {
        }
    }

    public XMSSMTPrivateKeyParameters extractKeyShard(int i3) {
        XMSSMTPrivateKeyParameters build;
        if (i3 < 1) {
            throw new IllegalArgumentException(StubApp.getString2(34342));
        }
        synchronized (this) {
            long j = i3;
            try {
                if (j > getUsagesRemaining()) {
                    throw new IllegalArgumentException(StubApp.getString2("34041"));
                }
                build = new Builder(this.params).withSecretKeySeed(this.secretKeySeed).withSecretKeyPRF(this.secretKeyPRF).withPublicSeed(this.publicSeed).withRoot(this.root).withIndex(getIndex()).withBDSState(new BDSStateMap(this.bdsState, (getIndex() + j) - 1)).build();
                for (int i10 = 0; i10 != i3; i10++) {
                    rollKey();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return build;
    }

    public BDSStateMap getBDSState() {
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

    public long getIndex() {
        return this.index;
    }

    public XMSSMTPrivateKeyParameters getNextKey() {
        XMSSMTPrivateKeyParameters extractKeyShard;
        synchronized (this) {
            extractKeyShard = extractKeyShard(1);
        }
        return extractKeyShard;
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

    public XMSSMTPrivateKeyParameters rollKey() {
        synchronized (this) {
            try {
                if (getIndex() < this.bdsState.getMaxIndex()) {
                    this.bdsState.updateState(this.params, this.index, this.publicSeed, this.secretKeySeed);
                    this.index++;
                } else {
                    this.index = this.bdsState.getMaxIndex() + 1;
                    this.bdsState = new BDSStateMap(this.bdsState.getMaxIndex());
                }
                this.used = false;
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
                int height = (this.params.getHeight() + 7) / 8;
                byte[] bArr = new byte[height + treeDigestSize + treeDigestSize + treeDigestSize + treeDigestSize];
                XMSSUtil.copyBytesAtOffset(bArr, XMSSUtil.toBytesBigEndian(this.index, height), 0);
                XMSSUtil.copyBytesAtOffset(bArr, this.secretKeySeed, height);
                int i3 = height + treeDigestSize;
                XMSSUtil.copyBytesAtOffset(bArr, this.secretKeyPRF, i3);
                int i10 = i3 + treeDigestSize;
                XMSSUtil.copyBytesAtOffset(bArr, this.publicSeed, i10);
                XMSSUtil.copyBytesAtOffset(bArr, this.root, i10 + treeDigestSize);
                try {
                    concatenate = Arrays.concatenate(bArr, XMSSUtil.serialize(this.bdsState));
                } catch (IOException e10) {
                    throw new IllegalStateException(string2 + e10.getMessage(), e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return concatenate;
    }

    public /* synthetic */ XMSSMTPrivateKeyParameters(Builder builder, AnonymousClass1 anonymousClass1) {
        this(builder);
    }
}
