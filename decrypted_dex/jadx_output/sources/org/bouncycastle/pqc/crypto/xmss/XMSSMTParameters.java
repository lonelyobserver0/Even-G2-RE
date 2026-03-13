package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class XMSSMTParameters {
    private static final Map<Integer, XMSSMTParameters> paramsLookupTable;
    private final int height;
    private final int layers;
    private final XMSSOid oid;
    private final XMSSParameters xmssParams;

    static {
        HashMap hashMap = new HashMap();
        Integer valueOf = Integers.valueOf(1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        hashMap.put(valueOf, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier));
        a.w(20, 4, aSN1ObjectIdentifier, hashMap, Integers.valueOf(2));
        a.w(40, 2, aSN1ObjectIdentifier, hashMap, Integers.valueOf(3));
        a.w(40, 4, aSN1ObjectIdentifier, hashMap, Integers.valueOf(4));
        a.w(40, 8, aSN1ObjectIdentifier, hashMap, Integers.valueOf(5));
        a.w(60, 3, aSN1ObjectIdentifier, hashMap, Integers.valueOf(6));
        a.w(60, 6, aSN1ObjectIdentifier, hashMap, Integers.valueOf(7));
        a.w(60, 12, aSN1ObjectIdentifier, hashMap, Integers.valueOf(8));
        Integer valueOf2 = Integers.valueOf(9);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha512;
        hashMap.put(valueOf2, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier2));
        a.w(20, 4, aSN1ObjectIdentifier2, hashMap, Integers.valueOf(10));
        a.w(40, 2, aSN1ObjectIdentifier2, hashMap, Integers.valueOf(11));
        a.w(40, 4, aSN1ObjectIdentifier2, hashMap, Integers.valueOf(12));
        a.w(40, 8, aSN1ObjectIdentifier2, hashMap, Integers.valueOf(13));
        a.w(60, 3, aSN1ObjectIdentifier2, hashMap, Integers.valueOf(14));
        a.w(60, 6, aSN1ObjectIdentifier2, hashMap, Integers.valueOf(15));
        a.w(60, 12, aSN1ObjectIdentifier2, hashMap, Integers.valueOf(16));
        Integer valueOf3 = Integers.valueOf(17);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_shake128;
        hashMap.put(valueOf3, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier3));
        a.w(20, 4, aSN1ObjectIdentifier3, hashMap, Integers.valueOf(18));
        a.w(40, 2, aSN1ObjectIdentifier3, hashMap, Integers.valueOf(19));
        a.w(40, 4, aSN1ObjectIdentifier3, hashMap, Integers.valueOf(20));
        a.w(40, 8, aSN1ObjectIdentifier3, hashMap, Integers.valueOf(21));
        a.w(60, 3, aSN1ObjectIdentifier3, hashMap, Integers.valueOf(22));
        a.w(60, 6, aSN1ObjectIdentifier3, hashMap, Integers.valueOf(23));
        a.w(60, 12, aSN1ObjectIdentifier3, hashMap, Integers.valueOf(24));
        Integer valueOf4 = Integers.valueOf(25);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_shake256;
        hashMap.put(valueOf4, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier4));
        a.w(20, 4, aSN1ObjectIdentifier4, hashMap, Integers.valueOf(26));
        a.w(40, 2, aSN1ObjectIdentifier4, hashMap, Integers.valueOf(27));
        a.w(40, 4, aSN1ObjectIdentifier4, hashMap, Integers.valueOf(28));
        a.w(40, 8, aSN1ObjectIdentifier4, hashMap, Integers.valueOf(29));
        a.w(60, 3, aSN1ObjectIdentifier4, hashMap, Integers.valueOf(30));
        a.w(60, 6, aSN1ObjectIdentifier4, hashMap, Integers.valueOf(31));
        a.w(60, 12, aSN1ObjectIdentifier4, hashMap, Integers.valueOf(32));
        paramsLookupTable = Collections.unmodifiableMap(hashMap);
    }

    public XMSSMTParameters(int i3, int i10, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.height = i3;
        this.layers = i10;
        this.xmssParams = new XMSSParameters(xmssTreeHeight(i3, i10), aSN1ObjectIdentifier);
        this.oid = DefaultXMSSMTOid.lookup(getTreeDigest(), getTreeDigestSize(), getWinternitzParameter(), getLen(), getHeight(), i10);
    }

    public static XMSSMTParameters lookupByOID(int i3) {
        return paramsLookupTable.get(Integers.valueOf(i3));
    }

    private static int xmssTreeHeight(int i3, int i10) throws IllegalArgumentException {
        if (i3 < 2) {
            throw new IllegalArgumentException(StubApp.getString2(34335));
        }
        if (i3 % i10 != 0) {
            throw new IllegalArgumentException(StubApp.getString2(34334));
        }
        int i11 = i3 / i10;
        if (i11 != 1) {
            return i11;
        }
        throw new IllegalArgumentException(StubApp.getString2(34333));
    }

    public int getHeight() {
        return this.height;
    }

    public int getLayers() {
        return this.layers;
    }

    public int getLen() {
        return this.xmssParams.getLen();
    }

    public XMSSOid getOid() {
        return this.oid;
    }

    public String getTreeDigest() {
        return this.xmssParams.getTreeDigest();
    }

    public ASN1ObjectIdentifier getTreeDigestOID() {
        return this.xmssParams.getTreeDigestOID();
    }

    public int getTreeDigestSize() {
        return this.xmssParams.getTreeDigestSize();
    }

    public WOTSPlus getWOTSPlus() {
        return this.xmssParams.getWOTSPlus();
    }

    public int getWinternitzParameter() {
        return this.xmssParams.getWinternitzParameter();
    }

    public XMSSParameters getXMSSParameters() {
        return this.xmssParams;
    }

    public XMSSMTParameters(int i3, int i10, Digest digest) {
        this(i3, i10, DigestUtil.getDigestOID(digest.getAlgorithmName()));
    }
}
