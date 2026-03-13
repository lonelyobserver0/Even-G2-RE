package org.bouncycastle.asn1.x9;

import E1.a;
import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1TaggedObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class DHPublicKey extends ASN1Object {

    /* renamed from: y, reason: collision with root package name */
    private ASN1Integer f18713y;

    public DHPublicKey(BigInteger bigInteger) {
        if (bigInteger == null) {
            throw new IllegalArgumentException(StubApp.getString2(27870));
        }
        this.f18713y = new ASN1Integer(bigInteger);
    }

    public static DHPublicKey getInstance(Object obj) {
        if (obj == null || (obj instanceof DHPublicKey)) {
            return (DHPublicKey) obj;
        }
        if (obj instanceof ASN1Integer) {
            return new DHPublicKey((ASN1Integer) obj);
        }
        throw new IllegalArgumentException(a.h(obj, StubApp.getString2(27871)));
    }

    public BigInteger getY() {
        return this.f18713y.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.f18713y;
    }

    private DHPublicKey(ASN1Integer aSN1Integer) {
        if (aSN1Integer == null) {
            throw new IllegalArgumentException(StubApp.getString2(27870));
        }
        this.f18713y = aSN1Integer;
    }

    public static DHPublicKey getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Integer.getInstance(aSN1TaggedObject, z2));
    }
}
