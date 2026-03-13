package org.bouncycastle.pqc.crypto.xmss;

import com.stub.StubApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class XMSSParameters {
    private static final Map<Integer, XMSSParameters> paramsLookupTable;
    private final int height;

    /* renamed from: k, reason: collision with root package name */
    private final int f19496k;
    private final XMSSOid oid;
    private final String treeDigest;
    private final ASN1ObjectIdentifier treeDigestOID;
    private final int treeDigestSize;
    private final int winternitzParameter;
    private final WOTSPlusParameters wotsPlusParams;

    static {
        HashMap hashMap = new HashMap();
        Integer valueOf = Integers.valueOf(1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        hashMap.put(valueOf, new XMSSParameters(10, aSN1ObjectIdentifier));
        hashMap.put(Integers.valueOf(2), new XMSSParameters(16, aSN1ObjectIdentifier));
        hashMap.put(Integers.valueOf(3), new XMSSParameters(20, aSN1ObjectIdentifier));
        Integer valueOf2 = Integers.valueOf(4);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha512;
        hashMap.put(valueOf2, new XMSSParameters(10, aSN1ObjectIdentifier2));
        hashMap.put(Integers.valueOf(5), new XMSSParameters(16, aSN1ObjectIdentifier2));
        hashMap.put(Integers.valueOf(6), new XMSSParameters(20, aSN1ObjectIdentifier2));
        Integer valueOf3 = Integers.valueOf(7);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_shake128;
        hashMap.put(valueOf3, new XMSSParameters(10, aSN1ObjectIdentifier3));
        hashMap.put(Integers.valueOf(8), new XMSSParameters(16, aSN1ObjectIdentifier3));
        hashMap.put(Integers.valueOf(9), new XMSSParameters(20, aSN1ObjectIdentifier3));
        Integer valueOf4 = Integers.valueOf(10);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_shake256;
        hashMap.put(valueOf4, new XMSSParameters(10, aSN1ObjectIdentifier4));
        hashMap.put(Integers.valueOf(11), new XMSSParameters(16, aSN1ObjectIdentifier4));
        hashMap.put(Integers.valueOf(12), new XMSSParameters(20, aSN1ObjectIdentifier4));
        paramsLookupTable = Collections.unmodifiableMap(hashMap);
    }

    public XMSSParameters(int i3, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (i3 < 2) {
            throw new IllegalArgumentException(StubApp.getString2(34357));
        }
        if (aSN1ObjectIdentifier == null) {
            throw new NullPointerException(StubApp.getString2(34295));
        }
        this.height = i3;
        this.f19496k = determineMinK();
        String digestName = DigestUtil.getDigestName(aSN1ObjectIdentifier);
        this.treeDigest = digestName;
        this.treeDigestOID = aSN1ObjectIdentifier;
        WOTSPlusParameters wOTSPlusParameters = new WOTSPlusParameters(aSN1ObjectIdentifier);
        this.wotsPlusParams = wOTSPlusParameters;
        int treeDigestSize = wOTSPlusParameters.getTreeDigestSize();
        this.treeDigestSize = treeDigestSize;
        int winternitzParameter = wOTSPlusParameters.getWinternitzParameter();
        this.winternitzParameter = winternitzParameter;
        this.oid = DefaultXMSSOid.lookup(digestName, treeDigestSize, winternitzParameter, wOTSPlusParameters.getLen(), i3);
    }

    private int determineMinK() {
        int i3 = 2;
        while (true) {
            int i10 = this.height;
            if (i3 > i10) {
                throw new IllegalStateException(StubApp.getString2(34358));
            }
            if ((i10 - i3) % 2 == 0) {
                return i3;
            }
            i3++;
        }
    }

    public static XMSSParameters lookupByOID(int i3) {
        return paramsLookupTable.get(Integers.valueOf(i3));
    }

    public int getHeight() {
        return this.height;
    }

    public int getK() {
        return this.f19496k;
    }

    public int getLen() {
        return this.wotsPlusParams.getLen();
    }

    public XMSSOid getOid() {
        return this.oid;
    }

    public String getTreeDigest() {
        return this.treeDigest;
    }

    public ASN1ObjectIdentifier getTreeDigestOID() {
        return this.treeDigestOID;
    }

    public int getTreeDigestSize() {
        return this.treeDigestSize;
    }

    public WOTSPlus getWOTSPlus() {
        return new WOTSPlus(this.wotsPlusParams);
    }

    public int getWinternitzParameter() {
        return this.winternitzParameter;
    }

    public XMSSParameters(int i3, Digest digest) {
        this(i3, DigestUtil.getDigestOID(digest.getAlgorithmName()));
    }
}
