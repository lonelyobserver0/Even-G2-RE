package org.bouncycastle.asn1.isismtt.ocsp;

import E1.a;
import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RequestedCertificate extends ASN1Object implements ASN1Choice {
    public static final int attributeCertificate = 1;
    public static final int certificate = -1;
    public static final int publicKeyCertificate = 0;
    private byte[] attributeCert;
    private Certificate cert;
    private byte[] publicKeyCert;

    public RequestedCertificate(int i3, byte[] bArr) {
        this(new DERTaggedObject(i3, new DEROctetString(bArr)));
    }

    public static RequestedCertificate getInstance(Object obj) {
        if (obj == null || (obj instanceof RequestedCertificate)) {
            return (RequestedCertificate) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new RequestedCertificate(Certificate.getInstance(obj));
        }
        if (obj instanceof ASN1TaggedObject) {
            return new RequestedCertificate((ASN1TaggedObject) obj);
        }
        throw new IllegalArgumentException(a.h(obj, StubApp.getString2(26708)));
    }

    public byte[] getCertificateBytes() {
        Certificate certificate2 = this.cert;
        if (certificate2 == null) {
            byte[] bArr = this.publicKeyCert;
            return bArr != null ? Arrays.clone(bArr) : Arrays.clone(this.attributeCert);
        }
        try {
            return certificate2.getEncoded();
        } catch (IOException e10) {
            throw new IllegalStateException(b.h(StubApp.getString2(27121), e10));
        }
    }

    public int getType() {
        if (this.cert != null) {
            return -1;
        }
        return this.publicKeyCert != null ? 0 : 1;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.publicKeyCert != null ? new DERTaggedObject(0, new DEROctetString(this.publicKeyCert)) : this.attributeCert != null ? new DERTaggedObject(1, new DEROctetString(this.attributeCert)) : this.cert.toASN1Primitive();
    }

    private RequestedCertificate(ASN1TaggedObject aSN1TaggedObject) {
        if (aSN1TaggedObject.getTagNo() == 0) {
            this.publicKeyCert = ASN1OctetString.getInstance(aSN1TaggedObject, true).getOctets();
        } else {
            if (aSN1TaggedObject.getTagNo() != 1) {
                throw new IllegalArgumentException(org.bouncycastle.asn1.a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(26896))));
            }
            this.attributeCert = ASN1OctetString.getInstance(aSN1TaggedObject, true).getOctets();
        }
    }

    public static RequestedCertificate getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        if (z2) {
            return getInstance(aSN1TaggedObject.getObject());
        }
        throw new IllegalArgumentException(StubApp.getString2(27120));
    }

    public RequestedCertificate(Certificate certificate2) {
        this.cert = certificate2;
    }
}
