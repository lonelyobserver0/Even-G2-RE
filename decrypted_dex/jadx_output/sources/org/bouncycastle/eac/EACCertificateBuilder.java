package org.bouncycastle.eac;

import com.stub.StubApp;
import i2.u;
import java.io.OutputStream;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.asn1.eac.CVCertificate;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.eac.CertificateHolderAuthorization;
import org.bouncycastle.asn1.eac.CertificateHolderReference;
import org.bouncycastle.asn1.eac.CertificationAuthorityReference;
import org.bouncycastle.asn1.eac.PackedDate;
import org.bouncycastle.asn1.eac.PublicKeyDataObject;
import org.bouncycastle.eac.operator.EACSigner;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EACCertificateBuilder {
    private static final byte[] ZeroArray = {0};
    private PackedDate certificateEffectiveDate;
    private PackedDate certificateExpirationDate;
    private CertificateHolderAuthorization certificateHolderAuthorization;
    private CertificateHolderReference certificateHolderReference;
    private CertificationAuthorityReference certificationAuthorityReference;
    private PublicKeyDataObject publicKey;

    public EACCertificateBuilder(CertificationAuthorityReference certificationAuthorityReference, PublicKeyDataObject publicKeyDataObject, CertificateHolderReference certificateHolderReference, CertificateHolderAuthorization certificateHolderAuthorization, PackedDate packedDate, PackedDate packedDate2) {
        this.certificationAuthorityReference = certificationAuthorityReference;
        this.publicKey = publicKeyDataObject;
        this.certificateHolderReference = certificateHolderReference;
        this.certificateHolderAuthorization = certificateHolderAuthorization;
        this.certificateEffectiveDate = packedDate;
        this.certificateExpirationDate = packedDate2;
    }

    private CertificateBody buildBody() {
        return new CertificateBody(new DERApplicationSpecific(41, ZeroArray), this.certificationAuthorityReference, this.publicKey, this.certificateHolderReference, this.certificateHolderAuthorization, this.certificateEffectiveDate, this.certificateExpirationDate);
    }

    public EACCertificateHolder build(EACSigner eACSigner) throws EACException {
        try {
            CertificateBody buildBody = buildBody();
            OutputStream outputStream = eACSigner.getOutputStream();
            outputStream.write(buildBody.getEncoded(StubApp.getString2("26791")));
            outputStream.close();
            return new EACCertificateHolder(new CVCertificate(buildBody, eACSigner.getSignature()));
        } catch (Exception e10) {
            throw new EACException(u.r(e10, new StringBuilder(StubApp.getString2(28013))), e10);
        }
    }
}
