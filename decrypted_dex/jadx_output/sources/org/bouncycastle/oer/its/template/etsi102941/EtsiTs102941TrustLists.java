package org.bouncycastle.oer.its.template.etsi102941;

import com.stub.StubApp;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.etsi102941.basetypes.EtsiTs102941BaseTypes;
import org.bouncycastle.oer.its.template.etsi103097.EtsiTs103097Module;
import org.bouncycastle.oer.its.template.ieee1609dot2.basetypes.Ieee1609Dot2BaseTypes;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EtsiTs102941TrustLists {
    public static final OERDefinition.Builder AaEntry;
    public static final OERDefinition.Builder CrlEntry;
    public static final OERDefinition.Builder CtlCommand;
    public static final OERDefinition.Builder CtlDelete;
    public static final OERDefinition.Builder CtlEntry;
    public static final OERDefinition.Builder CtlFormat;
    public static final OERDefinition.Builder DcDelete;
    public static final OERDefinition.Builder DcEntry;
    public static final OERDefinition.Builder DeltaCtl;
    public static final OERDefinition.Builder EaEntry;
    public static final OERDefinition.Builder FullCtl;
    public static final OERDefinition.Builder RootCaEntry;
    public static final OERDefinition.Builder SequenceOfCrlEntry;
    public static final OERDefinition.Builder SequenceOfCtlCommand;
    public static final OERDefinition.Builder TlmEntry;
    public static final OERDefinition.Builder ToBeSignedCrl;
    public static final OERDefinition.Builder ToBeSignedRcaCtl;
    public static final OERDefinition.Builder ToBeSignedTlmCtl;
    public static final OERDefinition.Builder Url;

    static {
        OERDefinition.Builder builder = Ieee1609Dot2BaseTypes.HashedId8;
        OERDefinition.Builder typeName = builder.typeName(StubApp.getString2(33264));
        CrlEntry = typeName;
        OERDefinition.Builder typeName2 = OERDefinition.seqof(typeName).typeName(StubApp.getString2(33265));
        SequenceOfCrlEntry = typeName2;
        OERDefinition.Builder builder2 = EtsiTs102941BaseTypes.Version;
        String string2 = StubApp.getString2(2155);
        OERDefinition.Builder label = builder2.label(string2);
        OERDefinition.Builder builder3 = Ieee1609Dot2BaseTypes.Time32;
        OERDefinition.Builder label2 = builder3.label(StubApp.getString2(33266));
        String string22 = StubApp.getString2(33267);
        ToBeSignedCrl = OERDefinition.seq(label, label2, builder3.label(string22), typeName2.label(StubApp.getString2(33268)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33269));
        OERDefinition.Builder typeName3 = OERDefinition.ia5String().typeName(StubApp.getString2(3236));
        Url = typeName3;
        OERDefinition.Builder typeName4 = typeName3.typeName(StubApp.getString2(33270));
        DcDelete = typeName4;
        OERDefinition.Builder label3 = typeName3.label(StubApp.getString2(1904));
        OERDefinition.Builder builder4 = Ieee1609Dot2BaseTypes.SequenceOfHashedId8;
        String string23 = StubApp.getString2(31416);
        OERDefinition.Builder typeName5 = OERDefinition.seq(label3, builder4.label(string23)).typeName(StubApp.getString2(33271));
        DcEntry = typeName5;
        OERDefinition.Builder builder5 = EtsiTs103097Module.EtsiTs103097Certificate;
        OERDefinition.Builder label4 = builder5.label(StubApp.getString2(33272));
        String string24 = StubApp.getString2(33273);
        OERDefinition.Builder typeName6 = OERDefinition.seq(label4, typeName3.label(string24)).typeName(StubApp.getString2(33274));
        AaEntry = typeName6;
        OERDefinition.Builder typeName7 = OERDefinition.seq(builder5.label(StubApp.getString2(33275)), typeName3.label(StubApp.getString2(33276)), OERDefinition.optional(typeName3.label(StubApp.getString2(33277)))).typeName(StubApp.getString2(33278));
        EaEntry = typeName7;
        OERDefinition.Builder label5 = builder5.label(StubApp.getString2(33279));
        String string25 = StubApp.getString2(33280);
        OERDefinition.Builder typeName8 = OERDefinition.seq(label5, OERDefinition.optional(builder5.label(string25))).typeName(StubApp.getString2(33281));
        RootCaEntry = typeName8;
        OERDefinition.Builder typeName9 = OERDefinition.seq(builder5.label(StubApp.getString2(33282)), OERDefinition.optional(builder5.label(string25)), typeName3.label(string24)).typeName(StubApp.getString2(33283));
        TlmEntry = typeName9;
        OERDefinition.Builder label6 = builder.label(string23);
        String string26 = StubApp.getString2(27613);
        OERDefinition.Builder typeName10 = OERDefinition.choice(label6, typeName4.label(string26), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33284));
        CtlDelete = typeName10;
        OERDefinition.Builder typeName11 = OERDefinition.choice(typeName8.label(StubApp.getString2(33285)), typeName7.label(StubApp.getString2(33286)), typeName6.label(StubApp.getString2(33287)), typeName5.label(string26), typeName9.label(StubApp.getString2(33288)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33289));
        CtlEntry = typeName11;
        OERDefinition.Builder typeName12 = OERDefinition.choice(typeName11.label(StubApp.getString2(6889)), typeName10.label(StubApp.getString2(1378)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33290));
        CtlCommand = typeName12;
        OERDefinition.Builder typeName13 = OERDefinition.seqof(typeName12).typeName(StubApp.getString2(33291));
        SequenceOfCtlCommand = typeName13;
        OERDefinition.Builder typeName14 = OERDefinition.seq(builder2.label(string2), builder3.label(string22), OERDefinition.bool().label(StubApp.getString2(33292)), OERDefinition.integer(0L, 255L).label(StubApp.getString2(33293)), typeName13.label(StubApp.getString2(33294)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33295));
        CtlFormat = typeName14;
        DeltaCtl = typeName14.typeName(StubApp.getString2(33296));
        FullCtl = typeName14.typeName(StubApp.getString2(33297));
        String string27 = StubApp.getString2(33298);
        ToBeSignedTlmCtl = typeName14.typeName(string27);
        ToBeSignedRcaCtl = typeName14.typeName(string27);
    }
}
