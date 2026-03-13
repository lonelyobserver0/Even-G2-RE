package org.bouncycastle.asn1.cmc;

import E1.a;
import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BodyPartReference extends ASN1Object implements ASN1Choice {
    private final BodyPartID bodyPartID;
    private final BodyPartPath bodyPartPath;

    public BodyPartReference(BodyPartID bodyPartID) {
        this.bodyPartID = bodyPartID;
        this.bodyPartPath = null;
    }

    public static BodyPartReference getInstance(Object obj) {
        if (obj instanceof BodyPartReference) {
            return (BodyPartReference) obj;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1Integer) {
                return new BodyPartReference(BodyPartID.getInstance(aSN1Primitive));
            }
            if (aSN1Primitive instanceof ASN1Sequence) {
                return new BodyPartReference(BodyPartPath.getInstance(aSN1Primitive));
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

    public BodyPartID getBodyPartID() {
        return this.bodyPartID;
    }

    public BodyPartPath getBodyPartPath() {
        return this.bodyPartPath;
    }

    public boolean isBodyPartID() {
        return this.bodyPartID != null;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        BodyPartID bodyPartID = this.bodyPartID;
        return bodyPartID != null ? bodyPartID.toASN1Primitive() : this.bodyPartPath.toASN1Primitive();
    }

    public BodyPartReference(BodyPartPath bodyPartPath) {
        this.bodyPartID = null;
        this.bodyPartPath = bodyPartPath;
    }
}
