package org.bouncycastle.asn1.x509.sigi;

import E1.a;
import com.stub.StubApp;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.DirectoryString;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NameOrPseudonym extends ASN1Object implements ASN1Choice {
    private ASN1Sequence givenName;
    private DirectoryString pseudonym;
    private DirectoryString surname;

    public NameOrPseudonym(String str) {
        this(new DirectoryString(str));
    }

    public static NameOrPseudonym getInstance(Object obj) {
        if (obj == null || (obj instanceof NameOrPseudonym)) {
            return (NameOrPseudonym) obj;
        }
        if (obj instanceof ASN1String) {
            return new NameOrPseudonym(DirectoryString.getInstance(obj));
        }
        if (obj instanceof ASN1Sequence) {
            return new NameOrPseudonym((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(a.h(obj, StubApp.getString2(26708)));
    }

    public DirectoryString[] getGivenName() {
        DirectoryString[] directoryStringArr = new DirectoryString[this.givenName.size()];
        Enumeration objects = this.givenName.getObjects();
        int i3 = 0;
        while (objects.hasMoreElements()) {
            directoryStringArr[i3] = DirectoryString.getInstance(objects.nextElement());
            i3++;
        }
        return directoryStringArr;
    }

    public DirectoryString getPseudonym() {
        return this.pseudonym;
    }

    public DirectoryString getSurname() {
        return this.surname;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        DirectoryString directoryString = this.pseudonym;
        if (directoryString != null) {
            return directoryString.toASN1Primitive();
        }
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.surname);
        aSN1EncodableVector.add(this.givenName);
        return new DERSequence(aSN1EncodableVector);
    }

    private NameOrPseudonym(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 2) {
            throw new IllegalArgumentException(org.bouncycastle.asn1.a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        if (aSN1Sequence.getObjectAt(0) instanceof ASN1String) {
            this.surname = DirectoryString.getInstance(aSN1Sequence.getObjectAt(0));
            this.givenName = ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(1));
        } else {
            throw new IllegalArgumentException(StubApp.getString2(27123) + aSN1Sequence.getObjectAt(0).getClass());
        }
    }

    public NameOrPseudonym(DirectoryString directoryString) {
        this.pseudonym = directoryString;
    }

    public NameOrPseudonym(DirectoryString directoryString, ASN1Sequence aSN1Sequence) {
        this.surname = directoryString;
        this.givenName = aSN1Sequence;
    }
}
