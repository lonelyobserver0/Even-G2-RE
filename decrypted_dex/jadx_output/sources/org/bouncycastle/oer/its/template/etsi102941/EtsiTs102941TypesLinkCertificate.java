package org.bouncycastle.oer.its.template.etsi102941;

import com.stub.StubApp;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2;
import org.bouncycastle.oer.its.template.ieee1609dot2.basetypes.Ieee1609Dot2BaseTypes;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EtsiTs102941TypesLinkCertificate {
    public static final OERDefinition.Builder ToBeSignedLinkCertificate;
    public static final OERDefinition.Builder ToBeSignedLinkCertificateRca;
    public static final OERDefinition.Builder ToBeSignedLinkCertificateTlm;

    static {
        OERDefinition.Builder typeName = OERDefinition.seq(Ieee1609Dot2BaseTypes.Time32.label(StubApp.getString2(33360)), IEEE1609dot2.HashedData.label(StubApp.getString2(33361)), OERDefinition.extension(new Object[0])).typeName(StubApp.getString2(33362));
        ToBeSignedLinkCertificate = typeName;
        ToBeSignedLinkCertificateTlm = typeName.typeName(StubApp.getString2(33363));
        ToBeSignedLinkCertificateRca = typeName.typeName(StubApp.getString2(33364));
    }
}
