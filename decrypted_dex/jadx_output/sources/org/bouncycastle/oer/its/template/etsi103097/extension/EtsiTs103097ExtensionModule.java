package org.bouncycastle.oer.its.template.etsi103097.extension;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.oer.Element;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.Switch;
import org.bouncycastle.oer.SwitchIndexer;
import org.bouncycastle.oer.its.template.ieee1609dot2.basetypes.Ieee1609Dot2BaseTypes;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EtsiTs103097ExtensionModule {
    public static final OERDefinition.Builder EtsiOriginatingHeaderInfoExtension;
    public static final OERDefinition.Builder EtsiTs102941CrlRequest;
    public static final OERDefinition.Builder EtsiTs102941CtlRequest;
    public static final OERDefinition.Builder EtsiTs102941DeltaCtlRequest;
    public static final OERDefinition.Builder ExtId;
    public static final OERDefinition.Builder Extension;
    public static final ASN1Integer etsiTs102941CrlRequestId;
    public static final ASN1Integer etsiTs102941DeltaCtlRequestId;
    private static final ASN1Encodable[] extensionKeys;

    static {
        ASN1Integer aSN1Integer = new ASN1Integer(1L);
        etsiTs102941CrlRequestId = aSN1Integer;
        ASN1Integer aSN1Integer2 = new ASN1Integer(2L);
        etsiTs102941DeltaCtlRequestId = aSN1Integer2;
        extensionKeys = new ASN1Encodable[]{aSN1Integer, aSN1Integer2};
        OERDefinition.Builder typeName = OERDefinition.integer(0L, 255L).validSwitchValue(aSN1Integer, aSN1Integer2).typeName(StubApp.getString2(33386));
        ExtId = typeName;
        OERDefinition.Builder builder = Ieee1609Dot2BaseTypes.HashedId8;
        String string2 = StubApp.getString2(33387);
        EtsiTs102941CrlRequest = OERDefinition.seq(builder.label(string2), OERDefinition.optional(Ieee1609Dot2BaseTypes.Time32.label(StubApp.getString2(33388)))).typeName(StubApp.getString2(33389));
        OERDefinition.Builder typeName2 = OERDefinition.seq(builder.label(string2), OERDefinition.optional(OERDefinition.integer(0L, 255L).label(StubApp.getString2(33390)))).typeName(StubApp.getString2(33391));
        EtsiTs102941CtlRequest = typeName2;
        EtsiTs102941DeltaCtlRequest = typeName2.typeName(StubApp.getString2(33392));
        OERDefinition.Builder typeName3 = OERDefinition.seq(typeName.label(StubApp.getString2(290)), OERDefinition.aSwitch(new Switch() { // from class: org.bouncycastle.oer.its.template.etsi103097.extension.EtsiTs103097ExtensionModule.1
            private final Element etsiTs102941CrlRequestIdDef;
            private final Element etsiTs102941DeltaCtlRequestIdDef;

            {
                OERDefinition.Builder builder2 = EtsiTs103097ExtensionModule.EtsiTs102941CrlRequest;
                String string22 = StubApp.getString2(1248);
                this.etsiTs102941CrlRequestIdDef = builder2.label(string22).build();
                this.etsiTs102941DeltaCtlRequestIdDef = EtsiTs103097ExtensionModule.EtsiTs102941DeltaCtlRequest.label(string22).build();
            }

            @Override // org.bouncycastle.oer.Switch
            public ASN1Encodable[] keys() {
                return EtsiTs103097ExtensionModule.extensionKeys;
            }

            @Override // org.bouncycastle.oer.Switch
            public Element result(SwitchIndexer switchIndexer) {
                ASN1Integer aSN1Integer3 = ASN1Integer.getInstance(switchIndexer.get(0).toASN1Primitive());
                if (aSN1Integer3.equals((ASN1Primitive) EtsiTs103097ExtensionModule.etsiTs102941CrlRequestId)) {
                    return this.etsiTs102941CrlRequestIdDef;
                }
                if (aSN1Integer3.equals((ASN1Primitive) EtsiTs103097ExtensionModule.etsiTs102941DeltaCtlRequestId)) {
                    return this.etsiTs102941DeltaCtlRequestIdDef;
                }
                throw new IllegalStateException(StubApp.getString2(33385) + aSN1Integer3);
            }
        }).label(StubApp.getString2(1248))).typeName(StubApp.getString2(33393));
        Extension = typeName3;
        EtsiOriginatingHeaderInfoExtension = typeName3.typeName(StubApp.getString2(33394));
    }
}
