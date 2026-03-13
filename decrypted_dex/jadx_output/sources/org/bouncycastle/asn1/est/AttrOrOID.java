package org.bouncycastle.asn1.est;

import E1.a;
import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.pkcs.Attribute;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class AttrOrOID extends ASN1Object implements ASN1Choice {
    private final Attribute attribute;
    private final ASN1ObjectIdentifier oid;

    public AttrOrOID(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.oid = aSN1ObjectIdentifier;
        this.attribute = null;
    }

    public static AttrOrOID getInstance(Object obj) {
        if (obj instanceof AttrOrOID) {
            return (AttrOrOID) obj;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1ObjectIdentifier) {
                return new AttrOrOID(ASN1ObjectIdentifier.getInstance(aSN1Primitive));
            }
            if (aSN1Primitive instanceof ASN1Sequence) {
                return new AttrOrOID(Attribute.getInstance(aSN1Primitive));
            }
        }
        if (!(obj instanceof byte[])) {
            throw new IllegalArgumentException(a.h(obj, StubApp.getString2(26868)));
        }
        try {
            return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (IOException unused) {
            throw new IllegalArgumentException(StubApp.getString2(26867));
        }
    }

    public Attribute getAttribute() {
        return this.attribute;
    }

    public ASN1ObjectIdentifier getOid() {
        return this.oid;
    }

    public boolean isOid() {
        return this.oid != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.oid;
        return aSN1ObjectIdentifier != null ? aSN1ObjectIdentifier : this.attribute.toASN1Primitive();
    }

    public AttrOrOID(Attribute attribute) {
        this.oid = null;
        this.attribute = attribute;
    }
}
