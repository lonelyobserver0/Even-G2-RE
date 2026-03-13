package org.bouncycastle.asn1.x509;

import E1.a;
import com.stub.StubApp;
import java.math.BigInteger;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Enumerated;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CRLReason extends ASN1Object {
    public static final int AA_COMPROMISE = 10;
    public static final int AFFILIATION_CHANGED = 3;
    public static final int CA_COMPROMISE = 2;
    public static final int CERTIFICATE_HOLD = 6;
    public static final int CESSATION_OF_OPERATION = 5;
    public static final int KEY_COMPROMISE = 1;
    public static final int PRIVILEGE_WITHDRAWN = 9;
    public static final int REMOVE_FROM_CRL = 8;
    public static final int SUPERSEDED = 4;
    public static final int UNSPECIFIED = 0;
    public static final int aACompromise = 10;
    public static final int affiliationChanged = 3;
    public static final int cACompromise = 2;
    public static final int certificateHold = 6;
    public static final int cessationOfOperation = 5;
    public static final int keyCompromise = 1;
    public static final int privilegeWithdrawn = 9;
    public static final int removeFromCRL = 8;
    public static final int superseded = 4;
    public static final int unspecified = 0;
    private ASN1Enumerated value;
    private static final String[] reasonString = {StubApp.getString2(27723), StubApp.getString2(27724), StubApp.getString2(27725), StubApp.getString2(27726), StubApp.getString2(27727), StubApp.getString2(27728), StubApp.getString2(27729), StubApp.getString2(351), StubApp.getString2(27730), StubApp.getString2(27721), StubApp.getString2(27722)};
    private static final Hashtable table = new Hashtable();

    private CRLReason(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(27731));
        }
        this.value = new ASN1Enumerated(i3);
    }

    public static CRLReason getInstance(Object obj) {
        if (obj instanceof CRLReason) {
            return (CRLReason) obj;
        }
        if (obj != null) {
            return lookup(ASN1Enumerated.getInstance(obj).intValueExact());
        }
        return null;
    }

    public static CRLReason lookup(int i3) {
        Integer valueOf = Integers.valueOf(i3);
        Hashtable hashtable = table;
        if (!hashtable.containsKey(valueOf)) {
            hashtable.put(valueOf, new CRLReason(i3));
        }
        return (CRLReason) hashtable.get(valueOf);
    }

    public BigInteger getValue() {
        return this.value.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.value;
    }

    public String toString() {
        int intValue = getValue().intValue();
        return a.j(StubApp.getString2(27733), (intValue < 0 || intValue > 10) ? StubApp.getString2(27732) : reasonString[intValue]);
    }
}
