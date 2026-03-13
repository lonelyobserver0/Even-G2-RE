package org.bouncycastle.asn1.eac;

import E1.a;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Hashtable;
import kotlin.UByte;
import org.bouncycastle.asn1.ASN1ApplicationSpecific;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERApplicationSpecific;
import org.bouncycastle.util.Integers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class CertificateHolderAuthorization extends ASN1Object {
    public static final int CVCA = 192;
    public static final int DV_DOMESTIC = 128;
    public static final int DV_FOREIGN = 64;
    public static final int IS = 0;
    public static final int RADG3 = 1;
    public static final int RADG4 = 2;
    ASN1ApplicationSpecific accessRights;
    ASN1ObjectIdentifier oid;
    public static final ASN1ObjectIdentifier id_role_EAC = EACObjectIdentifiers.bsi_de.branch(StubApp.getString2(27076));
    static Hashtable RightsDecodeMap = new Hashtable();
    static BidirectionalMap AuthorizationRole = new BidirectionalMap();
    static Hashtable ReverseMap = new Hashtable();

    static {
        RightsDecodeMap.put(Integers.valueOf(2), StubApp.getString2(27077));
        RightsDecodeMap.put(Integers.valueOf(1), StubApp.getString2(27078));
        AuthorizationRole.put(Integers.valueOf(192), StubApp.getString2(27079));
        AuthorizationRole.put(Integers.valueOf(128), StubApp.getString2(27080));
        AuthorizationRole.put(Integers.valueOf(64), StubApp.getString2(27081));
        AuthorizationRole.put(Integers.valueOf(0), StubApp.getString2(4665));
    }

    public CertificateHolderAuthorization(ASN1ApplicationSpecific aSN1ApplicationSpecific) throws IOException {
        if (aSN1ApplicationSpecific.getApplicationTag() == 76) {
            setPrivateData(new ASN1InputStream(aSN1ApplicationSpecific.getContents()));
        }
    }

    public static int getFlag(String str) {
        Integer num = (Integer) AuthorizationRole.getReverse(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException(a.j(StubApp.getString2(27082), str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String getRoleDescription(int i3) {
        return (String) AuthorizationRole.get(Integers.valueOf(i3));
    }

    private void setAccessRights(byte b2) {
        this.accessRights = new DERApplicationSpecific(19, new byte[]{b2});
    }

    private void setOid(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.oid = aSN1ObjectIdentifier;
    }

    private void setPrivateData(ASN1InputStream aSN1InputStream) throws IOException {
        ASN1Primitive readObject = aSN1InputStream.readObject();
        if (!(readObject instanceof ASN1ObjectIdentifier)) {
            throw new IllegalArgumentException(StubApp.getString2(27084));
        }
        this.oid = (ASN1ObjectIdentifier) readObject;
        ASN1Primitive readObject2 = aSN1InputStream.readObject();
        if (!(readObject2 instanceof ASN1ApplicationSpecific)) {
            throw new IllegalArgumentException(StubApp.getString2(27083));
        }
        this.accessRights = (ASN1ApplicationSpecific) readObject2;
    }

    public int getAccessRights() {
        return this.accessRights.getContents()[0] & UByte.MAX_VALUE;
    }

    public ASN1ObjectIdentifier getOid() {
        return this.oid;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.oid);
        aSN1EncodableVector.add(this.accessRights);
        return new DERApplicationSpecific(76, aSN1EncodableVector);
    }

    public CertificateHolderAuthorization(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i3) throws IOException {
        setOid(aSN1ObjectIdentifier);
        setAccessRights((byte) i3);
    }
}
