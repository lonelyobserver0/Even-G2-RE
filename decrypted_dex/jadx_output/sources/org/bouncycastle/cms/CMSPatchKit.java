package org.bouncycastle.cms;

import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.cms.SignerInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CMSPatchKit {

    public static class DLSignerInformation extends SignerInformation {
        public DLSignerInformation(SignerInformation signerInformation) {
            super(signerInformation);
        }

        @Override // org.bouncycastle.cms.SignerInformation
        public byte[] getEncodedSignedAttributes() throws IOException {
            return this.signedAttributeSet.getEncoded(StubApp.getString2(21754));
        }
    }

    public static class ModEncAlgSignerInformation extends SignerInformation {
        public ModEncAlgSignerInformation(SignerInformation signerInformation, AlgorithmIdentifier algorithmIdentifier) {
            super(signerInformation, editEncAlg(signerInformation.info, algorithmIdentifier));
        }

        private static SignerInfo editEncAlg(SignerInfo signerInfo, AlgorithmIdentifier algorithmIdentifier) {
            return new SignerInfo(signerInfo.getSID(), signerInfo.getDigestAlgorithm(), signerInfo.getAuthenticatedAttributes(), algorithmIdentifier, signerInfo.getEncryptedDigest(), signerInfo.getUnauthenticatedAttributes());
        }
    }

    public static SignerInformation createNonDERSignerInfo(SignerInformation signerInformation) {
        return new DLSignerInformation(signerInformation);
    }

    public static SignerInformation createWithSignatureAlgorithm(SignerInformation signerInformation, AlgorithmIdentifier algorithmIdentifier) {
        return new ModEncAlgSignerInformation(signerInformation, algorithmIdentifier);
    }
}
