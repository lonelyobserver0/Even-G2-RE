package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class KeyPurposeId extends ASN1Object {
    public static final KeyPurposeId anyExtendedKeyUsage;
    private static final ASN1ObjectIdentifier id_kp;
    public static final KeyPurposeId id_kp_OCSPSigning;
    public static final KeyPurposeId id_kp_capwapAC;
    public static final KeyPurposeId id_kp_capwapWTP;
    public static final KeyPurposeId id_kp_clientAuth;
    public static final KeyPurposeId id_kp_cmKGA;
    public static final KeyPurposeId id_kp_cmcCA;
    public static final KeyPurposeId id_kp_cmcRA;
    public static final KeyPurposeId id_kp_codeSigning;
    public static final KeyPurposeId id_kp_dvcs;
    public static final KeyPurposeId id_kp_eapOverLAN;
    public static final KeyPurposeId id_kp_eapOverPPP;
    public static final KeyPurposeId id_kp_emailProtection;
    public static final KeyPurposeId id_kp_ipsecEndSystem;
    public static final KeyPurposeId id_kp_ipsecIKE;
    public static final KeyPurposeId id_kp_ipsecTunnel;
    public static final KeyPurposeId id_kp_ipsecUser;
    public static final KeyPurposeId id_kp_macAddress;
    public static final KeyPurposeId id_kp_msSGC;
    public static final KeyPurposeId id_kp_nsSGC;
    public static final KeyPurposeId id_kp_sbgpCertAAServerAuth;
    public static final KeyPurposeId id_kp_scvpClient;
    public static final KeyPurposeId id_kp_scvpServer;
    public static final KeyPurposeId id_kp_scvp_responder;
    public static final KeyPurposeId id_kp_serverAuth;
    public static final KeyPurposeId id_kp_smartcardlogon;
    public static final KeyPurposeId id_kp_timeStamping;
    private ASN1ObjectIdentifier id;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(StubApp.getString2(27803));
        id_kp = aSN1ObjectIdentifier;
        anyExtendedKeyUsage = new KeyPurposeId(Extension.extendedKeyUsage.branch(StubApp.getString2(824)));
        id_kp_serverAuth = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(878)));
        id_kp_clientAuth = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(4967)));
        id_kp_codeSigning = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(4968)));
        id_kp_emailProtection = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(4969)));
        id_kp_ipsecEndSystem = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(4970)));
        id_kp_ipsecTunnel = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(4971)));
        id_kp_ipsecUser = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(4972)));
        id_kp_timeStamping = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(4973)));
        id_kp_OCSPSigning = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(4974)));
        id_kp_dvcs = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(1708)));
        id_kp_sbgpCertAAServerAuth = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(1724)));
        id_kp_scvp_responder = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(1723)));
        id_kp_eapOverPPP = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(1722)));
        id_kp_eapOverLAN = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(27804)));
        id_kp_scvpServer = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(16823)));
        id_kp_scvpClient = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(27805)));
        id_kp_ipsecIKE = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(16824)));
        id_kp_capwapAC = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(27806)));
        id_kp_capwapWTP = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(26824)));
        id_kp_cmcCA = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(27807)));
        id_kp_cmcRA = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(27808)));
        id_kp_cmKGA = new KeyPurposeId(aSN1ObjectIdentifier.branch(StubApp.getString2(27809)));
        id_kp_smartcardlogon = new KeyPurposeId(new ASN1ObjectIdentifier(StubApp.getString2(27810)));
        id_kp_macAddress = new KeyPurposeId(new ASN1ObjectIdentifier(StubApp.getString2(27811)));
        id_kp_msSGC = new KeyPurposeId(new ASN1ObjectIdentifier(StubApp.getString2(27812)));
        id_kp_nsSGC = new KeyPurposeId(new ASN1ObjectIdentifier(StubApp.getString2(27813)));
    }

    private KeyPurposeId(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.id = aSN1ObjectIdentifier;
    }

    public static KeyPurposeId getInstance(Object obj) {
        if (obj instanceof KeyPurposeId) {
            return (KeyPurposeId) obj;
        }
        if (obj != null) {
            return new KeyPurposeId(ASN1ObjectIdentifier.getInstance(obj));
        }
        return null;
    }

    public String getId() {
        return this.id.getId();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.id;
    }

    public ASN1ObjectIdentifier toOID() {
        return this.id;
    }

    public String toString() {
        return this.id.toString();
    }
}
