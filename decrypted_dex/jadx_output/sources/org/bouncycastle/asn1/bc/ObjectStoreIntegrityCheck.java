package org.bouncycastle.asn1.bc;

import com.stub.StubApp;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERTaggedObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ObjectStoreIntegrityCheck extends ASN1Object implements ASN1Choice {
    public static final int PBKD_MAC_CHECK = 0;
    public static final int SIG_CHECK = 1;
    private final ASN1Object integrityCheck;
    private final int type;

    private ObjectStoreIntegrityCheck(ASN1Encodable aSN1Encodable) {
        ASN1Object pbkdMacIntegrityCheck;
        if ((aSN1Encodable instanceof ASN1Sequence) || (aSN1Encodable instanceof PbkdMacIntegrityCheck)) {
            this.type = 0;
            pbkdMacIntegrityCheck = PbkdMacIntegrityCheck.getInstance(aSN1Encodable);
        } else {
            if (!(aSN1Encodable instanceof ASN1TaggedObject)) {
                throw new IllegalArgumentException(StubApp.getString2(26864));
            }
            this.type = 1;
            pbkdMacIntegrityCheck = SignatureCheck.getInstance(((ASN1TaggedObject) aSN1Encodable).getObject());
        }
        this.integrityCheck = pbkdMacIntegrityCheck;
    }

    public static ObjectStoreIntegrityCheck getInstance(Object obj) {
        if (obj instanceof ObjectStoreIntegrityCheck) {
            return (ObjectStoreIntegrityCheck) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return new ObjectStoreIntegrityCheck(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException(StubApp.getString2(26865));
            }
        }
        if (obj != null) {
            return new ObjectStoreIntegrityCheck((ASN1Encodable) obj);
        }
        return null;
    }

    public ASN1Object getIntegrityCheck() {
        return this.integrityCheck;
    }

    public int getType() {
        return this.type;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1Object aSN1Object = this.integrityCheck;
        return aSN1Object instanceof SignatureCheck ? new DERTaggedObject(0, aSN1Object) : aSN1Object.toASN1Primitive();
    }

    public ObjectStoreIntegrityCheck(PbkdMacIntegrityCheck pbkdMacIntegrityCheck) {
        this((ASN1Encodable) pbkdMacIntegrityCheck);
    }

    public ObjectStoreIntegrityCheck(SignatureCheck signatureCheck) {
        this(new DERTaggedObject(0, signatureCheck));
    }
}
