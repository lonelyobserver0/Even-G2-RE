package org.bouncycastle.oer.its.template.etsi102941.basetypes;

import com.stub.StubApp;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.etsi103097.EtsiTs103097Module;
import org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2;
import org.bouncycastle.oer.its.template.ieee1609dot2.basetypes.Ieee1609Dot2BaseTypes;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EtsiTs102941BaseTypes {
    public static final OERDefinition.Builder CertificateFormat = OERDefinition.integer(0, 255).typeName(StubApp.getString2(33365));
    public static final OERDefinition.Builder CertificateSubjectAttributes = OERDefinition.seq(OERDefinition.optional(IEEE1609dot2.CertificateId.label(StubApp.getString2(290)), Ieee1609Dot2BaseTypes.ValidityPeriod.label(StubApp.getString2(33366)), Ieee1609Dot2BaseTypes.GeographicRegion.label(StubApp.getString2(2051)), Ieee1609Dot2BaseTypes.SubjectAssurance.label(StubApp.getString2(33367)), Ieee1609Dot2BaseTypes.SequenceOfPsidSsp.label(StubApp.getString2(33368)), IEEE1609dot2.SequenceOfPsidGroupPermissions.label(StubApp.getString2(33369)), OERDefinition.extension(new Object[0]))).typeName(StubApp.getString2(33370));
    public static final OERDefinition.Builder EcSignature = OERDefinition.choice(EtsiTs103097Module.EtsiTs103097Data_Encrypted.label(StubApp.getString2(33371)), EtsiTs103097Module.EtsiTs103097Data_SignedExternalPayload.label(StubApp.getString2(33339))).typeName(StubApp.getString2(33372));
    public static final OERDefinition.Builder PublicKeys = OERDefinition.seq(Ieee1609Dot2BaseTypes.PublicVerificationKey.label(StubApp.getString2(33373)), OERDefinition.optional(Ieee1609Dot2BaseTypes.PublicEncryptionKey.label(StubApp.getString2(33374)))).typeName(StubApp.getString2(33375));
    public static final OERDefinition.Builder Version = OERDefinition.integer(0, 255).typeName(StubApp.getString2(8192));
}
