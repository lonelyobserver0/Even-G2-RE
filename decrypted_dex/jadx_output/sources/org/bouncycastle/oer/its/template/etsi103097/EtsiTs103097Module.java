package org.bouncycastle.oer.its.template.etsi103097;

import com.stub.StubApp;
import org.bouncycastle.oer.OERDefinition;
import org.bouncycastle.oer.its.template.ieee1609dot2.IEEE1609dot2;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class EtsiTs103097Module {
    public static final OERDefinition.Builder EtsiTs103097Certificate = IEEE1609dot2.ExplicitCertificate.typeName(StubApp.getString2(33376));
    public static final OERDefinition.Builder EtsiTs103097Data;
    public static final OERDefinition.Builder EtsiTs103097Data_Encrypted;
    public static final OERDefinition.Builder EtsiTs103097Data_Encrypted_Unicast;
    public static final OERDefinition.Builder EtsiTs103097Data_Signed;
    public static final OERDefinition.Builder EtsiTs103097Data_SignedAndEncrypted;
    public static final OERDefinition.Builder EtsiTs103097Data_SignedAndEncrypted_Unicast;
    public static final OERDefinition.Builder EtsiTs103097Data_SignedExternalPayload;
    public static final OERDefinition.Builder EtsiTs103097Data_Unsecured;

    static {
        OERDefinition.Builder typeName = IEEE1609dot2.Ieee1609Dot2Data.typeName(StubApp.getString2(33377));
        EtsiTs103097Data = typeName;
        EtsiTs103097Data_Unsecured = typeName.typeName(StubApp.getString2(33378));
        EtsiTs103097Data_Signed = typeName.typeName(StubApp.getString2(33379));
        EtsiTs103097Data_SignedExternalPayload = typeName.typeName(StubApp.getString2(33380));
        EtsiTs103097Data_Encrypted = typeName.typeName(StubApp.getString2(33381));
        EtsiTs103097Data_SignedAndEncrypted = typeName.typeName(StubApp.getString2(33382));
        EtsiTs103097Data_Encrypted_Unicast = typeName.typeName(StubApp.getString2(33383));
        EtsiTs103097Data_SignedAndEncrypted_Unicast = typeName.typeName(StubApp.getString2(33384));
    }
}
