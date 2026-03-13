package org.bouncycastle.oer.its.template.etsi102941;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.etsi102941.basetypes.EtsiTs102941BaseTypes;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EtsiTs102941TypesAuthorizationValidation {
    public static final OERDefinition.Builder AuthorizationValidationRequest;
    public static final OERDefinition.Builder AuthorizationValidationResponse;
    public static final OERDefinition.Builder AuthorizationValidationResponseCode;

    static {
        OERDefinition.Builder typeName = OERDefinition.enumeration(OERDefinition.enumItem(StubApp.getString2(33299), BigInteger.ZERO), StubApp.getString2(33342), StubApp.getString2(33343), StubApp.getString2(33344), StubApp.getString2(33345), StubApp.getString2(33346), StubApp.getString2(33320), StubApp.getString2(33321), StubApp.getString2(33322), StubApp.getString2(33323), StubApp.getString2(33324), StubApp.getString2(33325), StubApp.getString2(33300), StubApp.getString2(33301), StubApp.getString2(33341)).typeName(StubApp.getString2(33347));
        AuthorizationValidationResponseCode = typeName;
        AuthorizationValidationRequest = OERDefinition.seq(EtsiTs102941TypesAuthorization.SharedAtRequest.label(StubApp.getString2(33338)), EtsiTs102941BaseTypes.EcSignature.label(StubApp.getString2(33339)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33348));
        AuthorizationValidationResponse = OERDefinition.seq(OERDefinition.octets(16).label(StubApp.getString2(33327)), typeName.label(StubApp.getString2(33328)), OERDefinition.optional(EtsiTs102941BaseTypes.CertificateSubjectAttributes.label(StubApp.getString2(33349))), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33350));
    }
}
