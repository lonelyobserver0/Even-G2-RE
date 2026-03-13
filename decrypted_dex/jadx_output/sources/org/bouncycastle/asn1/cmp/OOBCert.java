package org.bouncycastle.asn1.cmp;

import E1.a;
import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.x509.AttributeCertificate;
import org.bouncycastle.asn1.x509.Certificate;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OOBCert extends CMPCertificate {
    public OOBCert(int i3, ASN1Object aSN1Object) {
        super(i3, aSN1Object);
    }

    public static OOBCert getInstance(Object obj) {
        if (obj == null || (obj instanceof OOBCert)) {
            return (OOBCert) obj;
        }
        if (obj instanceof CMPCertificate) {
            try {
                return getInstance((Object) ((CMPCertificate) obj).getEncoded());
            } catch (IOException e10) {
                throw new IllegalArgumentException(e10.getMessage(), e10);
            }
        }
        if (obj instanceof byte[]) {
            try {
                obj = ASN1Primitive.fromByteArray((byte[]) obj);
            } catch (IOException unused) {
                throw new IllegalArgumentException(StubApp.getString2(26897));
            }
        }
        if (obj instanceof ASN1Sequence) {
            return new OOBCert(Certificate.getInstance(obj));
        }
        if (!(obj instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException(a.h(obj, StubApp.getString2(26879)));
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
        return new OOBCert(aSN1TaggedObject.getTagNo(), aSN1TaggedObject.getObject());
    }

    public OOBCert(AttributeCertificate attributeCertificate) {
        super(attributeCertificate);
    }

    public OOBCert(Certificate certificate) {
        super(certificate);
    }

    public static OOBCert getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        if (aSN1TaggedObject == null) {
            return null;
        }
        if (z2) {
            return getInstance((Object) aSN1TaggedObject.getObject());
        }
        throw new IllegalArgumentException(StubApp.getString2(26880));
    }
}
