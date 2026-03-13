package org.bouncycastle.oer.its.template.etsi102941;

import com.stub.StubApp;
import java.math.BigInteger;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.etsi102941.basetypes.EtsiTs102941BaseTypes;
import org.bouncycastle.oer.its.template.etsi103097.EtsiTs103097Module;
import org.bouncycastle.oer.its.template.ieee1609dot2.basetypes.Ieee1609Dot2BaseTypes;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EtsiTs102941TypesAuthorization {
    public static final OERDefinition.Builder AuthorizationResponseCode;
    public static final OERDefinition.Builder InnerAtRequest;
    public static final OERDefinition.Builder InnerAtResponse;
    public static final OERDefinition.Builder SharedAtRequest;

    static {
        OERDefinition.Builder typeName = OERDefinition.enumeration(OERDefinition.enumItem(StubApp.getString2(33299), BigInteger.ZERO), StubApp.getString2(33302), StubApp.getString2(33303), StubApp.getString2(33304), StubApp.getString2(33305), StubApp.getString2(33306), StubApp.getString2(33307), StubApp.getString2(33308), StubApp.getString2(33309), StubApp.getString2(33310), StubApp.getString2(33311), StubApp.getString2(33312), StubApp.getString2(33313), StubApp.getString2(33314), StubApp.getString2(33315), StubApp.getString2(33316), StubApp.getString2(33317), StubApp.getString2(33318), StubApp.getString2(33319), StubApp.getString2(33320), StubApp.getString2(33321), StubApp.getString2(33322), StubApp.getString2(33323), StubApp.getString2(33324), StubApp.getString2(33325), StubApp.getString2(33300), StubApp.getString2(33301)).typeName(StubApp.getString2(33326));
        AuthorizationResponseCode = typeName;
        InnerAtResponse = OERDefinition.seq(OERDefinition.octets(16).label(StubApp.getString2(33327)), typeName.label(StubApp.getString2(33328)), OERDefinition.optional(EtsiTs103097Module.EtsiTs103097Certificate.label(StubApp.getString2(33329))), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33330));
        OERDefinition.Builder typeName2 = OERDefinition.seq(Ieee1609Dot2BaseTypes.HashedId8.label(StubApp.getString2(33331)), OERDefinition.octets(16).label(StubApp.getString2(33332)), EtsiTs102941BaseTypes.CertificateFormat.label(StubApp.getString2(33333)), EtsiTs102941BaseTypes.CertificateSubjectAttributes.label(StubApp.getString2(33334)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33335));
        SharedAtRequest = typeName2;
        InnerAtRequest = OERDefinition.seq(EtsiTs102941BaseTypes.PublicKeys.label(StubApp.getString2(33336)), OERDefinition.octets(32).label(StubApp.getString2(33337)), typeName2.label(StubApp.getString2(33338)), EtsiTs102941BaseTypes.EcSignature.label(StubApp.getString2(33339))).typeName(StubApp.getString2(33340));
    }
}
