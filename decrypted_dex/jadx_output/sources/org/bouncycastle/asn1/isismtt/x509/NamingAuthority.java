package org.bouncycastle.asn1.isismtt.x509;

import E1.a;
import com.stub.StubApp;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.isismtt.ISISMTTObjectIdentifiers;
import org.bouncycastle.asn1.x500.DirectoryString;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class NamingAuthority extends ASN1Object {
    public static final ASN1ObjectIdentifier id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern = new ASN1ObjectIdentifier(ISISMTTObjectIdentifiers.id_isismtt_at_namingAuthorities + StubApp.getString2(27125));
    private ASN1ObjectIdentifier namingAuthorityId;
    private DirectoryString namingAuthorityText;
    private String namingAuthorityUrl;

    public NamingAuthority(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str, DirectoryString directoryString) {
        this.namingAuthorityId = aSN1ObjectIdentifier;
        this.namingAuthorityUrl = str;
        this.namingAuthorityText = directoryString;
    }

    public static NamingAuthority getInstance(Object obj) {
        if (obj == null || (obj instanceof NamingAuthority)) {
            return (NamingAuthority) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new NamingAuthority((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(a.h(obj, StubApp.getString2(26708)));
    }

    public ASN1ObjectIdentifier getNamingAuthorityId() {
        return this.namingAuthorityId;
    }

    public DirectoryString getNamingAuthorityText() {
        return this.namingAuthorityText;
    }

    public String getNamingAuthorityUrl() {
        return this.namingAuthorityUrl;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = this.namingAuthorityId;
        if (aSN1ObjectIdentifier != null) {
            aSN1EncodableVector.add(aSN1ObjectIdentifier);
        }
        if (this.namingAuthorityUrl != null) {
            aSN1EncodableVector.add(new DERIA5String(this.namingAuthorityUrl, true));
        }
        DirectoryString directoryString = this.namingAuthorityText;
        if (directoryString != null) {
            aSN1EncodableVector.add(directoryString);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    private NamingAuthority(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() > 3) {
            throw new IllegalArgumentException(org.bouncycastle.asn1.a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        boolean hasMoreElements = objects.hasMoreElements();
        String string2 = StubApp.getString2(27123);
        if (hasMoreElements) {
            ASN1Encodable aSN1Encodable = (ASN1Encodable) objects.nextElement();
            if (aSN1Encodable instanceof ASN1ObjectIdentifier) {
                this.namingAuthorityId = (ASN1ObjectIdentifier) aSN1Encodable;
            } else if (aSN1Encodable instanceof ASN1IA5String) {
                this.namingAuthorityUrl = ASN1IA5String.getInstance(aSN1Encodable).getString();
            } else {
                if (!(aSN1Encodable instanceof ASN1String)) {
                    throw new IllegalArgumentException(string2 + aSN1Encodable.getClass());
                }
                this.namingAuthorityText = DirectoryString.getInstance(aSN1Encodable);
            }
        }
        if (objects.hasMoreElements()) {
            ASN1Encodable aSN1Encodable2 = (ASN1Encodable) objects.nextElement();
            if (aSN1Encodable2 instanceof ASN1IA5String) {
                this.namingAuthorityUrl = ASN1IA5String.getInstance(aSN1Encodable2).getString();
            } else {
                if (!(aSN1Encodable2 instanceof ASN1String)) {
                    throw new IllegalArgumentException(string2 + aSN1Encodable2.getClass());
                }
                this.namingAuthorityText = DirectoryString.getInstance(aSN1Encodable2);
            }
        }
        if (objects.hasMoreElements()) {
            ASN1Encodable aSN1Encodable3 = (ASN1Encodable) objects.nextElement();
            if (aSN1Encodable3 instanceof ASN1String) {
                this.namingAuthorityText = DirectoryString.getInstance(aSN1Encodable3);
            } else {
                throw new IllegalArgumentException(string2 + aSN1Encodable3.getClass());
            }
        }
    }

    public static NamingAuthority getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }
}
