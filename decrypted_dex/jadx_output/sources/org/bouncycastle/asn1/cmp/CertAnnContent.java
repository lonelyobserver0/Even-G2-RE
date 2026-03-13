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
public class CertAnnContent extends CMPCertificate {
    public CertAnnContent(int i3, ASN1Object aSN1Object) {
        super(i3, aSN1Object);
    }

    public static CertAnnContent getInstance(Object obj) {
        if (obj == null || (obj instanceof CertAnnContent)) {
            return (CertAnnContent) obj;
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
                throw new IllegalArgumentException(StubApp.getString2(26883));
            }
        }
        if (obj instanceof ASN1Sequence) {
            return new CertAnnContent(Certificate.getInstance(obj));
        }
        if (!(obj instanceof ASN1TaggedObject)) {
            throw new IllegalArgumentException(a.h(obj, StubApp.getString2(26879)));
        }
        ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) obj;
        return new CertAnnContent(aSN1TaggedObject.getTagNo(), aSN1TaggedObject.getObject());
    }

    public CertAnnContent(AttributeCertificate attributeCertificate) {
        super(attributeCertificate);
    }

    public CertAnnContent(Certificate certificate) {
        super(certificate);
    }

    public static CertAnnContent getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        if (aSN1TaggedObject == null) {
            return null;
        }
        if (z2) {
            return getInstance((Object) aSN1TaggedObject.getObject());
        }
        throw new IllegalArgumentException(StubApp.getString2(26880));
    }
}
