package org.bouncycastle.oer.its.template.ieee1609dot2dot1;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2;
import org.bouncycastle.oer.its.template.ieee1609dot2.basetypes.Ieee1609Dot2BaseTypes;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Ieee1609Dot2Dot1EcaEeInterface {
    public static final OERDefinition.Builder EeEcaCertRequest = OERDefinition.seq(Ieee1609Dot2BaseTypes.UINT8.label(StubApp.getString2(2155)).validSwitchValue(new ASN1Integer(2)), Ieee1609Dot2BaseTypes.Time32.label(StubApp.getString2(33473)), IEEE1609dot2.CertificateType.label(StubApp.getString2(660)), IEEE1609dot2.ToBeSignedCertificate.label(StubApp.getString2(33603)), OERDefinition.optional(OERDefinition.ia5String().label(StubApp.getString2(33604))), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33605));
}
