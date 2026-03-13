package org.bouncycastle.oer.its.template.ieee1609dot2dot1;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2;
import org.bouncycastle.oer.its.template.ieee1609dot2.basetypes.Ieee1609Dot2BaseTypes;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class Ieee1609Dot2Dot1EeRaInterface {
    public static final OERDefinition.Builder AdditionalParams;
    public static final OERDefinition.Builder ButterflyExpansion;
    public static final OERDefinition.Builder ButterflyParamsOriginal;
    public static final OERDefinition.Builder EeRaCertRequest;

    static {
        OERDefinition.Builder typeName = OERDefinition.choice(OERDefinition.octets(16).label(StubApp.getString2(33606)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33607));
        ButterflyExpansion = typeName;
        OERDefinition.Builder label = typeName.label(StubApp.getString2(33608));
        OERDefinition.Builder builder = Ieee1609Dot2BaseTypes.PublicEncryptionKey;
        String string2 = StubApp.getString2(33374);
        OERDefinition.Builder typeName2 = OERDefinition.seq(label, builder.label(string2), typeName.label(StubApp.getString2(33609))).typeName(StubApp.getString2(33610));
        ButterflyParamsOriginal = typeName2;
        OERDefinition.Builder typeName3 = OERDefinition.choice(typeName2.label(StubApp.getString2(21596)), typeName.label(StubApp.getString2(33611)), typeName.label(StubApp.getString2(33612)), builder.label(string2), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33613));
        AdditionalParams = typeName3;
        EeRaCertRequest = OERDefinition.seq(Ieee1609Dot2BaseTypes.UINT8.label(StubApp.getString2(2155)).validSwitchValue(new ASN1Integer(2L)), Ieee1609Dot2BaseTypes.Time32.label(StubApp.getString2(33473)), IEEE1609dot2.CertificateType.label(StubApp.getString2(660)), IEEE1609dot2.ToBeSignedCertificate.label(StubApp.getString2(33603)), OERDefinition.optional(typeName3.label(StubApp.getString2(33614))), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33615));
    }
}
