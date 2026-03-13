package org.bouncycastle.oer.its.template.etsi102941;

import com.stub.StubApp;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.etsi102941.basetypes.EtsiTs102941BaseTypes;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EtsiTs102941TypesCaManagement {
    public static final OERDefinition.Builder CaCertificateRequest = OERDefinition.seq(EtsiTs102941BaseTypes.PublicKeys.label(StubApp.getString2(33336)), EtsiTs102941BaseTypes.CertificateSubjectAttributes.label(StubApp.getString2(33334))).typeName(StubApp.getString2(33351));
}
