package org.bouncycastle.dvcs;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.cms.ContentInfo;
import org.bouncycastle.asn1.dvcs.DVCSObjectIdentifiers;
import org.bouncycastle.asn1.dvcs.DVCSRequestInformationBuilder;
import org.bouncycastle.asn1.dvcs.Data;
import org.bouncycastle.asn1.x509.ExtensionsGenerator;
import org.bouncycastle.asn1.x509.GeneralName;
import org.bouncycastle.asn1.x509.GeneralNames;
import org.bouncycastle.cms.CMSSignedDataGenerator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public abstract class DVCSRequestBuilder {
    protected final DVCSRequestInformationBuilder requestInformationBuilder;
    private final ExtensionsGenerator extGenerator = new ExtensionsGenerator();
    private final CMSSignedDataGenerator signedDataGen = new CMSSignedDataGenerator();

    public DVCSRequestBuilder(DVCSRequestInformationBuilder dVCSRequestInformationBuilder) {
        this.requestInformationBuilder = dVCSRequestInformationBuilder;
    }

    public void addExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier, boolean z2, ASN1Encodable aSN1Encodable) throws DVCSException {
        try {
            this.extGenerator.addExtension(aSN1ObjectIdentifier, z2, aSN1Encodable);
        } catch (IOException e10) {
            throw new DVCSException(u.q(e10, new StringBuilder(StubApp.getString2(28004))), e10);
        }
    }

    public DVCSRequest createDVCRequest(Data data) throws DVCSException {
        if (!this.extGenerator.isEmpty()) {
            this.requestInformationBuilder.setExtensions(this.extGenerator.generate());
        }
        return new DVCSRequest(new ContentInfo(DVCSObjectIdentifiers.id_ct_DVCSRequestData, new org.bouncycastle.asn1.dvcs.DVCSRequest(this.requestInformationBuilder.build(), data)));
    }

    public void setDVCS(GeneralName generalName) {
        this.requestInformationBuilder.setDVCS(generalName);
    }

    public void setDataLocations(GeneralName generalName) {
        this.requestInformationBuilder.setDataLocations(generalName);
    }

    public void setNonce(BigInteger bigInteger) {
        this.requestInformationBuilder.setNonce(bigInteger);
    }

    public void setRequester(GeneralName generalName) {
        this.requestInformationBuilder.setRequester(generalName);
    }

    public void setDVCS(GeneralNames generalNames) {
        this.requestInformationBuilder.setDVCS(generalNames);
    }

    public void setDataLocations(GeneralNames generalNames) {
        this.requestInformationBuilder.setDataLocations(generalNames);
    }
}
