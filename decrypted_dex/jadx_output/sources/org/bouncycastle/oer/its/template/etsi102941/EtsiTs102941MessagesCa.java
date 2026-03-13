package org.bouncycastle.oer.its.template.etsi102941;

import com.stub.StubApp;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.etsi102941.basetypes.EtsiTs102941BaseTypes;
import org.bouncycastle.oer.its.template.etsi103097.EtsiTs103097Module;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EtsiTs102941MessagesCa {
    public static final OERDefinition.Builder AuthorizationRequestMessage;
    public static final OERDefinition.Builder AuthorizationRequestMessageWithPop;
    public static final OERDefinition.Builder AuthorizationResponseMessage;
    public static final OERDefinition.Builder AuthorizationValidationRequestMessage;
    public static final OERDefinition.Builder CaCertificateRekeyingMessage;
    public static final OERDefinition.Builder CaCertificateRequestMessage;
    public static final OERDefinition.Builder CertificateRevocationListMessage;
    public static final OERDefinition.Builder EnrolmentRequestMessage;
    public static final OERDefinition.Builder EnrolmentResponseMessage;
    public static final OERDefinition.Builder EtsiTs102941Data;
    public static final OERDefinition.Builder EtsiTs102941DataContent;
    public static final OERDefinition.Builder RcaCertificateTrustListMessage;
    public static final OERDefinition.Builder RcaDoubleSignedLinkCertificateMessage;
    public static final OERDefinition.Builder RcaSingleSignedLinkCertificateMessage;
    public static final OERDefinition.Builder TlmCertificateTrustListMessage;
    public static final OERDefinition.Builder TlmLinkCertificateMessage;

    static {
        OERDefinition.Builder builder = EtsiTs103097Module.EtsiTs103097Data_SignedAndEncrypted_Unicast;
        EnrolmentRequestMessage = builder.typeName(StubApp.getString2(33236));
        EnrolmentResponseMessage = builder.typeName(StubApp.getString2(33237));
        AuthorizationRequestMessage = EtsiTs103097Module.EtsiTs103097Data_Encrypted_Unicast.typeName(StubApp.getString2(33238));
        AuthorizationRequestMessageWithPop = builder.typeName(StubApp.getString2(33239));
        AuthorizationResponseMessage = builder.typeName(StubApp.getString2(33240));
        OERDefinition.Builder builder2 = EtsiTs103097Module.EtsiTs103097Data_Signed;
        CertificateRevocationListMessage = builder2.typeName(StubApp.getString2(33241));
        TlmCertificateTrustListMessage = builder2.typeName(StubApp.getString2(33242));
        RcaCertificateTrustListMessage = builder2.typeName(StubApp.getString2(33243));
        OERDefinition.Builder typeName = builder2.typeName(StubApp.getString2(33244));
        RcaSingleSignedLinkCertificateMessage = typeName;
        OERDefinition.Builder typeName2 = OERDefinition.choice(EtsiTs102941TypesEnrolment.InnerEcRequestSignedForPop.label(StubApp.getString2(33245)), EtsiTs102941TypesEnrolment.InnerEcResponse.label(StubApp.getString2(33246)), EtsiTs102941TypesAuthorization.InnerAtRequest.label(StubApp.getString2(33247)), EtsiTs102941TypesAuthorization.InnerAtResponse.label(StubApp.getString2(33248)), EtsiTs102941TrustLists.ToBeSignedCrl.label(StubApp.getString2(32516)), EtsiTs102941TrustLists.ToBeSignedTlmCtl.label(StubApp.getString2(33249)), EtsiTs102941TrustLists.ToBeSignedRcaCtl.label(StubApp.getString2(33250)), EtsiTs102941TypesAuthorizationValidation.AuthorizationValidationRequest.label(StubApp.getString2(33251)), EtsiTs102941TypesAuthorizationValidation.AuthorizationValidationResponse.label(StubApp.getString2(33252)), EtsiTs102941TypesCaManagement.CaCertificateRequest.label(StubApp.getString2(33253)), OERDefinition.extension(EtsiTs102941TypesLinkCertificate.ToBeSignedLinkCertificateTlm.label(StubApp.getString2(33254)), EtsiTs102941TypesLinkCertificate.ToBeSignedLinkCertificateRca.label(StubApp.getString2(33255)), typeName.label(StubApp.getString2(33256)))).typeName(StubApp.getString2(33257));
        EtsiTs102941DataContent = typeName2;
        EtsiTs102941Data = OERDefinition.seq(EtsiTs102941BaseTypes.Version.label(StubApp.getString2(2155)), typeName2.label(StubApp.getString2(1248))).typeName(StubApp.getString2(33258));
        AuthorizationValidationRequestMessage = builder.typeName(StubApp.getString2(33259));
        CaCertificateRequestMessage = builder2.typeName(StubApp.getString2(33260));
        CaCertificateRekeyingMessage = builder2.typeName(StubApp.getString2(33261));
        TlmLinkCertificateMessage = builder2.typeName(StubApp.getString2(33262));
        RcaDoubleSignedLinkCertificateMessage = builder2.typeName(StubApp.getString2(33263));
    }
}
