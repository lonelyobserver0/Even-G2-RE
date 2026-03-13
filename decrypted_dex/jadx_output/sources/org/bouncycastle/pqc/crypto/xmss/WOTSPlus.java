package org.bouncycastle.pqc.crypto.xmss;

import Xa.h;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.xmss.OTSHashAddress;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class WOTSPlus {
    private final KeyedHashFunctions khf;
    private final WOTSPlusParameters params;
    private byte[] publicSeed;
    private byte[] secretKeySeed;

    public WOTSPlus(WOTSPlusParameters wOTSPlusParameters) {
        if (wOTSPlusParameters == null) {
            throw new NullPointerException(StubApp.getString2(34299));
        }
        this.params = wOTSPlusParameters;
        int treeDigestSize = wOTSPlusParameters.getTreeDigestSize();
        this.khf = new KeyedHashFunctions(wOTSPlusParameters.getTreeDigest(), treeDigestSize);
        this.secretKeySeed = new byte[treeDigestSize];
        this.publicSeed = new byte[treeDigestSize];
    }

    private byte[] chain(byte[] bArr, int i3, int i10, OTSHashAddress oTSHashAddress) {
        int treeDigestSize = this.params.getTreeDigestSize();
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(34303));
        }
        if (bArr.length != treeDigestSize) {
            throw new IllegalArgumentException(h.g(treeDigestSize, StubApp.getString2(34302), StubApp.getString2(1034)));
        }
        if (oTSHashAddress == null) {
            throw new NullPointerException(StubApp.getString2(34240));
        }
        if (oTSHashAddress.toByteArray() == null) {
            throw new NullPointerException(StubApp.getString2(34301));
        }
        int i11 = i3 + i10;
        if (i11 > this.params.getWinternitzParameter() - 1) {
            throw new IllegalArgumentException(StubApp.getString2(34300));
        }
        if (i10 == 0) {
            return bArr;
        }
        byte[] chain = chain(bArr, i3, i10 - 1, oTSHashAddress);
        OTSHashAddress oTSHashAddress2 = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(oTSHashAddress.getChainAddress()).withHashAddress(i11 - 1).withKeyAndMask(0).build();
        byte[] PRF = this.khf.PRF(this.publicSeed, oTSHashAddress2.toByteArray());
        byte[] PRF2 = this.khf.PRF(this.publicSeed, ((OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress2.getLayerAddress()).withTreeAddress(oTSHashAddress2.getTreeAddress()).withOTSAddress(oTSHashAddress2.getOTSAddress()).withChainAddress(oTSHashAddress2.getChainAddress()).withHashAddress(oTSHashAddress2.getHashAddress()).withKeyAndMask(1).build()).toByteArray());
        byte[] bArr2 = new byte[treeDigestSize];
        for (int i12 = 0; i12 < treeDigestSize; i12++) {
            bArr2[i12] = (byte) (chain[i12] ^ PRF2[i12]);
        }
        return this.khf.F(PRF, bArr2);
    }

    private List<Integer> convertToBaseW(byte[] bArr, int i3, int i10) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(34306));
        }
        if (i3 != 4 && i3 != 16) {
            throw new IllegalArgumentException(StubApp.getString2(34304));
        }
        int log2 = XMSSUtil.log2(i3);
        if (i10 > (bArr.length * 8) / log2) {
            throw new IllegalArgumentException(StubApp.getString2(34305));
        }
        ArrayList arrayList = new ArrayList();
        loop0: for (int i11 : bArr) {
            for (int i12 = 8 - log2; i12 >= 0; i12 -= log2) {
                arrayList.add(Integer.valueOf((i11 >> i12) & (i3 - 1)));
                if (arrayList.size() == i10) {
                    break loop0;
                }
            }
        }
        return arrayList;
    }

    private byte[] expandSecretKeySeed(int i3) {
        if (i3 < 0 || i3 >= this.params.getLen()) {
            throw new IllegalArgumentException(StubApp.getString2(34233));
        }
        return this.khf.PRF(this.secretKeySeed, XMSSUtil.toBytesBigEndian(i3, 32));
    }

    public KeyedHashFunctions getKhf() {
        return this.khf;
    }

    public WOTSPlusParameters getParams() {
        return this.params;
    }

    public WOTSPlusPrivateKeyParameters getPrivateKey() {
        int len = this.params.getLen();
        byte[][] bArr = new byte[len][];
        for (int i3 = 0; i3 < len; i3++) {
            bArr[i3] = expandSecretKeySeed(i3);
        }
        return new WOTSPlusPrivateKeyParameters(this.params, bArr);
    }

    public WOTSPlusPublicKeyParameters getPublicKey(OTSHashAddress oTSHashAddress) {
        if (oTSHashAddress == null) {
            throw new NullPointerException(StubApp.getString2(34240));
        }
        byte[][] bArr = new byte[this.params.getLen()][];
        for (int i3 = 0; i3 < this.params.getLen(); i3++) {
            oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(i3).withHashAddress(oTSHashAddress.getHashAddress()).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr[i3] = chain(expandSecretKeySeed(i3), 0, this.params.getWinternitzParameter() - 1, oTSHashAddress);
        }
        return new WOTSPlusPublicKeyParameters(this.params, bArr);
    }

    public WOTSPlusPublicKeyParameters getPublicKeyFromSignature(byte[] bArr, WOTSPlusSignature wOTSPlusSignature, OTSHashAddress oTSHashAddress) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(34309));
        }
        if (bArr.length != this.params.getTreeDigestSize()) {
            throw new IllegalArgumentException(StubApp.getString2(34308));
        }
        if (wOTSPlusSignature == null) {
            throw new NullPointerException(StubApp.getString2(34307));
        }
        if (oTSHashAddress == null) {
            throw new NullPointerException(StubApp.getString2(34240));
        }
        List<Integer> convertToBaseW = convertToBaseW(bArr, this.params.getWinternitzParameter(), this.params.getLen1());
        int i3 = 0;
        for (int i10 = 0; i10 < this.params.getLen1(); i10++) {
            i3 += (this.params.getWinternitzParameter() - 1) - convertToBaseW.get(i10).intValue();
        }
        convertToBaseW.addAll(convertToBaseW(XMSSUtil.toBytesBigEndian(i3 << (8 - ((XMSSUtil.log2(this.params.getWinternitzParameter()) * this.params.getLen2()) % 8)), (int) Math.ceil((XMSSUtil.log2(this.params.getWinternitzParameter()) * this.params.getLen2()) / 8.0d)), this.params.getWinternitzParameter(), this.params.getLen2()));
        byte[][] bArr2 = new byte[this.params.getLen()][];
        for (int i11 = 0; i11 < this.params.getLen(); i11++) {
            oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(i11).withHashAddress(oTSHashAddress.getHashAddress()).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr2[i11] = chain(wOTSPlusSignature.toByteArray()[i11], convertToBaseW.get(i11).intValue(), (this.params.getWinternitzParameter() - 1) - convertToBaseW.get(i11).intValue(), oTSHashAddress);
        }
        return new WOTSPlusPublicKeyParameters(this.params, bArr2);
    }

    public byte[] getPublicSeed() {
        return Arrays.clone(this.publicSeed);
    }

    public byte[] getSecretKeySeed() {
        return Arrays.clone(this.secretKeySeed);
    }

    public byte[] getWOTSPlusSecretKey(byte[] bArr, OTSHashAddress oTSHashAddress) {
        return this.khf.PRF(bArr, ((OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).build()).toByteArray());
    }

    public void importKeys(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(34313));
        }
        if (bArr.length != this.params.getTreeDigestSize()) {
            throw new IllegalArgumentException(StubApp.getString2(34312));
        }
        if (bArr2 == null) {
            throw new NullPointerException(StubApp.getString2(34311));
        }
        if (bArr2.length != this.params.getTreeDigestSize()) {
            throw new IllegalArgumentException(StubApp.getString2(34310));
        }
        this.secretKeySeed = bArr;
        this.publicSeed = bArr2;
    }

    public WOTSPlusSignature sign(byte[] bArr, OTSHashAddress oTSHashAddress) {
        if (bArr == null) {
            throw new NullPointerException(StubApp.getString2(34309));
        }
        if (bArr.length != this.params.getTreeDigestSize()) {
            throw new IllegalArgumentException(StubApp.getString2(34308));
        }
        if (oTSHashAddress == null) {
            throw new NullPointerException(StubApp.getString2(34240));
        }
        List<Integer> convertToBaseW = convertToBaseW(bArr, this.params.getWinternitzParameter(), this.params.getLen1());
        int i3 = 0;
        for (int i10 = 0; i10 < this.params.getLen1(); i10++) {
            i3 += (this.params.getWinternitzParameter() - 1) - convertToBaseW.get(i10).intValue();
        }
        convertToBaseW.addAll(convertToBaseW(XMSSUtil.toBytesBigEndian(i3 << (8 - ((XMSSUtil.log2(this.params.getWinternitzParameter()) * this.params.getLen2()) % 8)), (int) Math.ceil((XMSSUtil.log2(this.params.getWinternitzParameter()) * this.params.getLen2()) / 8.0d)), this.params.getWinternitzParameter(), this.params.getLen2()));
        byte[][] bArr2 = new byte[this.params.getLen()][];
        for (int i11 = 0; i11 < this.params.getLen(); i11++) {
            oTSHashAddress = (OTSHashAddress) new OTSHashAddress.Builder().withLayerAddress(oTSHashAddress.getLayerAddress()).withTreeAddress(oTSHashAddress.getTreeAddress()).withOTSAddress(oTSHashAddress.getOTSAddress()).withChainAddress(i11).withHashAddress(oTSHashAddress.getHashAddress()).withKeyAndMask(oTSHashAddress.getKeyAndMask()).build();
            bArr2[i11] = chain(expandSecretKeySeed(i11), 0, convertToBaseW.get(i11).intValue(), oTSHashAddress);
        }
        return new WOTSPlusSignature(this.params, bArr2);
    }
}
