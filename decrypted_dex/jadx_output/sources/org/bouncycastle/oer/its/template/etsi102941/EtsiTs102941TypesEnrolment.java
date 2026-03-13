package org.bouncycastle.oer.its.template.etsi102941;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.etsi102941.basetypes.EtsiTs102941BaseTypes;
import org.bouncycastle.oer.its.template.etsi103097.EtsiTs103097Module;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EtsiTs102941TypesEnrolment {
    public static final OERDefinition.Builder EnrolmentResponseCode;
    public static final OERDefinition.Builder InnerEcRequest;
    public static final OERDefinition.Builder InnerEcRequestSignedForPop;
    public static final OERDefinition.Builder InnerEcResponse;

    static {
        OERDefinition.Builder typeName = OERDefinition.enumeration(OERDefinition.enumItem(StubApp.getString2(33299), BigInteger.ZERO), StubApp.getString2(33342), StubApp.getString2(33343), StubApp.getString2(33344), StubApp.getString2(33345), StubApp.getString2(33346), StubApp.getString2(33323), StubApp.getString2(33324), StubApp.getString2(33325), StubApp.getString2(33352), StubApp.getString2(33353), StubApp.getString2(33300), StubApp.getString2(33354), StubApp.getString2(33341), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33355));
        EnrolmentResponseCode = typeName;
        InnerEcResponse = OERDefinition.seq(OERDefinition.octets(16).label(StubApp.getString2(33327)), typeName.label(StubApp.getString2(33328)), OERDefinition.optional(EtsiTs103097Module.EtsiTs103097Certificate.label(StubApp.getString2(33329))), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33356));
        InnerEcRequest = OERDefinition.seq(OERDefinition.octets().label(StubApp.getString2(33357)), EtsiTs102941BaseTypes.CertificateFormat.label(StubApp.getString2(33333)), EtsiTs102941BaseTypes.PublicKeys.label(StubApp.getString2(33336)), EtsiTs102941BaseTypes.CertificateSubjectAttributes.label(StubApp.getString2(33334)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33358));
        InnerEcRequestSignedForPop = EtsiTs103097Module.EtsiTs103097Data_Signed.typeName(StubApp.getString2(33359));
    }
}
