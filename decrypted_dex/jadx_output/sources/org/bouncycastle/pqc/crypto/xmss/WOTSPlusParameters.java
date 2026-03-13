package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.Digest;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
final class WOTSPlusParameters {
    private final int digestSize;
    private final int len;
    private final int len1;
    private final int len2;
    private final XMSSOid oid;
    private final ASN1ObjectIdentifier treeDigest;
    private final int winternitzParameter;

    public WOTSPlusParameters(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier == null) {
            throw new NullPointerException(StubApp.getString2(34319));
        }
        this.treeDigest = aSN1ObjectIdentifier;
        Digest digest = DigestUtil.getDigest(aSN1ObjectIdentifier);
        int digestSize = XMSSUtil.getDigestSize(digest);
        this.digestSize = digestSize;
        this.winternitzParameter = 16;
        int ceil = (int) Math.ceil((digestSize * 8) / XMSSUtil.log2(16));
        this.len1 = ceil;
        int floor = ((int) Math.floor(XMSSUtil.log2((16 - 1) * ceil) / XMSSUtil.log2(16))) + 1;
        this.len2 = floor;
        int i3 = ceil + floor;
        this.len = i3;
        WOTSPlusOid lookup = WOTSPlusOid.lookup(digest.getAlgorithmName(), digestSize, 16, i3);
        this.oid = lookup;
        if (lookup != null) {
            return;
        }
        throw new IllegalArgumentException(StubApp.getString2(34318) + digest.getAlgorithmName());
    }

    public int getLen() {
        return this.len;
    }

    public int getLen1() {
        return this.len1;
    }

    public int getLen2() {
        return this.len2;
    }

    public XMSSOid getOid() {
        return this.oid;
    }

    public ASN1ObjectIdentifier getTreeDigest() {
        return this.treeDigest;
    }

    public int getTreeDigestSize() {
        return this.digestSize;
    }

    public int getWinternitzParameter() {
        return this.winternitzParameter;
    }
}
