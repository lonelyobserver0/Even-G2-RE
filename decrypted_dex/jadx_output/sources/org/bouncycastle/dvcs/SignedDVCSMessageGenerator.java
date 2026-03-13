package org.bouncycastle.dvcs;

import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSProcessableByteArray;
import org.bouncycastle.cms.CMSSignedData;
import org.bouncycastle.cms.CMSSignedDataGenerator;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class SignedDVCSMessageGenerator {
    private final CMSSignedDataGenerator signedDataGen;

    public SignedDVCSMessageGenerator(CMSSignedDataGenerator cMSSignedDataGenerator) {
        this.signedDataGen = cMSSignedDataGenerator;
    }

    public CMSSignedData build(DVCSMessage dVCSMessage) throws DVCSException {
        try {
            return this.signedDataGen.generate(new CMSProcessableByteArray(dVCSMessage.getContentType(), dVCSMessage.getContent().toASN1Primitive().getEncoded(StubApp.getString2("26791"))), true);
        } catch (IOException e10) {
            throw new DVCSException(StubApp.getString2(29414), e10);
        } catch (CMSException e11) {
            throw new DVCSException(StubApp.getString2(29415), e11);
        }
    }
}
