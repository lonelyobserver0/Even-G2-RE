package org.bouncycastle.asn1.eac;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.util.Arrays;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CVCertificate extends ASN1Object {
    private static int bodyValid = 1;
    private static int signValid = 2;
    private CertificateBody certificateBody;
    private byte[] signature;
    private int valid;

    private CVCertificate(ASN1ApplicationSpecific aSN1ApplicationSpecific) throws IOException {
        setPrivateData(aSN1ApplicationSpecific);
    }

    public static CVCertificate getInstance(Object obj) {
        if (obj instanceof CVCertificate) {
            return (CVCertificate) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            return new CVCertificate(ASN1ApplicationSpecific.getInstance(obj));
        } catch (IOException e10) {
            throw new ASN1ParsingException(u.q(e10, new StringBuilder(StubApp.getString2(27054))), e10);
        }
    }

    private void initFrom(ASN1InputStream aSN1InputStream) throws IOException {
        while (true) {
            ASN1Primitive readObject = aSN1InputStream.readObject();
            if (readObject == null) {
                return;
            }
            if (!(readObject instanceof ASN1ApplicationSpecific)) {
                throw new IOException(StubApp.getString2(27055));
            }
            setPrivateData((ASN1ApplicationSpecific) readObject);
        }
    }

    private void setPrivateData(ASN1ApplicationSpecific aSN1ApplicationSpecific) throws IOException {
        int i3;
        int i10;
        this.valid = 0;
        if (aSN1ApplicationSpecific.getApplicationTag() != 33) {
            throw new IOException(StubApp.getString2(27059) + aSN1ApplicationSpecific.getApplicationTag());
        }
        ASN1InputStream aSN1InputStream = new ASN1InputStream(aSN1ApplicationSpecific.getContents());
        while (true) {
            ASN1Primitive readObject = aSN1InputStream.readObject();
            if (readObject == null) {
                aSN1InputStream.close();
                if (this.valid == (signValid | bodyValid)) {
                    return;
                }
                throw new IOException(StubApp.getString2(27058) + aSN1ApplicationSpecific.getApplicationTag());
            }
            if (!(readObject instanceof ASN1ApplicationSpecific)) {
                throw new IOException(StubApp.getString2(27057));
            }
            ASN1ApplicationSpecific aSN1ApplicationSpecific2 = (ASN1ApplicationSpecific) readObject;
            int applicationTag = aSN1ApplicationSpecific2.getApplicationTag();
            if (applicationTag == 55) {
                this.signature = aSN1ApplicationSpecific2.getContents();
                i3 = this.valid;
                i10 = signValid;
            } else {
                if (applicationTag != 78) {
                    throw new IOException(StubApp.getString2(27056) + aSN1ApplicationSpecific2.getApplicationTag());
                }
                this.certificateBody = CertificateBody.getInstance(aSN1ApplicationSpecific2);
                i3 = this.valid;
                i10 = bodyValid;
            }
            this.valid = i3 | i10;
        }
    }

    public CertificationAuthorityReference getAuthorityReference() throws IOException {
        return this.certificateBody.getCertificationAuthorityReference();
    }

    public CertificateBody getBody() {
        return this.certificateBody;
    }

    public int getCertificateType() {
        return this.certificateBody.getCertificateType();
    }

    public PackedDate getEffectiveDate() throws IOException {
        return this.certificateBody.getCertificateEffectiveDate();
    }

    public PackedDate getExpirationDate() throws IOException {
        return this.certificateBody.getCertificateExpirationDate();
    }

    public ASN1ObjectIdentifier getHolderAuthorization() throws IOException {
        return this.certificateBody.getCertificateHolderAuthorization().getOid();
    }

    public Flags getHolderAuthorizationRights() throws IOException {
        return new Flags(this.certificateBody.getCertificateHolderAuthorization().getAccessRights() & 31);
    }

    public int getHolderAuthorizationRole() throws IOException {
        return this.certificateBody.getCertificateHolderAuthorization().getAccessRights() & 192;
    }

    public CertificateHolderReference getHolderReference() throws IOException {
        return this.certificateBody.getCertificateHolderReference();
    }

    public int getRole() throws IOException {
        return this.certificateBody.getCertificateHolderAuthorization().getAccessRights();
    }

    public byte[] getSignature() {
        return Arrays.clone(this.signature);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.certificateBody);
        try {
            aSN1EncodableVector.add(new DERApplicationSpecific(false, 55, new DEROctetString(this.signature)));
            return new DERApplicationSpecific(33, aSN1EncodableVector);
        } catch (IOException unused) {
            throw new IllegalStateException(StubApp.getString2(27060));
        }
    }

    public CVCertificate(ASN1InputStream aSN1InputStream) throws IOException {
        initFrom(aSN1InputStream);
    }

    public CVCertificate(CertificateBody certificateBody, byte[] bArr) throws IOException {
        this.certificateBody = certificateBody;
        this.signature = Arrays.clone(bArr);
        this.valid = this.valid | bodyValid | signValid;
    }
}
