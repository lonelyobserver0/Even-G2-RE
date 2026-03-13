package org.bouncycastle.cert.ocsp;

import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.ocsp.OCSPObjectIdentifiers;
import org.bouncycastle.asn1.ocsp.OCSPResponse;
import org.bouncycastle.asn1.ocsp.OCSPResponseStatus;
import org.bouncycastle.asn1.ocsp.ResponseBytes;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class OCSPRespBuilder {
    public static final int INTERNAL_ERROR = 2;
    public static final int MALFORMED_REQUEST = 1;
    public static final int SIG_REQUIRED = 5;
    public static final int SUCCESSFUL = 0;
    public static final int TRY_LATER = 3;
    public static final int UNAUTHORIZED = 6;

    public OCSPResp build(int i3, Object obj) throws OCSPException {
        if (obj == null) {
            return new OCSPResp(new OCSPResponse(new OCSPResponseStatus(i3), null));
        }
        if (!(obj instanceof BasicOCSPResp)) {
            throw new OCSPException(StubApp.getString2(28112));
        }
        try {
            return new OCSPResp(new OCSPResponse(new OCSPResponseStatus(i3), new ResponseBytes(OCSPObjectIdentifiers.id_pkix_ocsp_basic, new DEROctetString(((BasicOCSPResp) obj).getEncoded()))));
        } catch (IOException e10) {
            throw new OCSPException(StubApp.getString2(28111), e10);
        }
    }
}
