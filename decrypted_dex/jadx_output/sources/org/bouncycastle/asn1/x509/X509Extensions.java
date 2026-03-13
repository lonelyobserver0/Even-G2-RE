package org.bouncycastle.asn1.x509;

import E1.a;
import com.stub.StubApp;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Boolean;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X509Extensions extends ASN1Object {
    private Hashtable extensions;
    private Vector ordering;
    public static final ASN1ObjectIdentifier SubjectDirectoryAttributes = new ASN1ObjectIdentifier(StubApp.getString2(27748));
    public static final ASN1ObjectIdentifier SubjectKeyIdentifier = new ASN1ObjectIdentifier(StubApp.getString2(27749));
    public static final ASN1ObjectIdentifier KeyUsage = new ASN1ObjectIdentifier(StubApp.getString2(27750));
    public static final ASN1ObjectIdentifier PrivateKeyUsagePeriod = new ASN1ObjectIdentifier(StubApp.getString2(27751));
    public static final ASN1ObjectIdentifier SubjectAlternativeName = new ASN1ObjectIdentifier(StubApp.getString2(27752));
    public static final ASN1ObjectIdentifier IssuerAlternativeName = new ASN1ObjectIdentifier(StubApp.getString2(27753));
    public static final ASN1ObjectIdentifier BasicConstraints = new ASN1ObjectIdentifier(StubApp.getString2(27754));
    public static final ASN1ObjectIdentifier CRLNumber = new ASN1ObjectIdentifier(StubApp.getString2(27755));
    public static final ASN1ObjectIdentifier ReasonCode = new ASN1ObjectIdentifier(StubApp.getString2(27756));
    public static final ASN1ObjectIdentifier InstructionCode = new ASN1ObjectIdentifier(StubApp.getString2(27757));
    public static final ASN1ObjectIdentifier InvalidityDate = new ASN1ObjectIdentifier(StubApp.getString2(27758));
    public static final ASN1ObjectIdentifier DeltaCRLIndicator = new ASN1ObjectIdentifier(StubApp.getString2(27759));
    public static final ASN1ObjectIdentifier IssuingDistributionPoint = new ASN1ObjectIdentifier(StubApp.getString2(27760));
    public static final ASN1ObjectIdentifier CertificateIssuer = new ASN1ObjectIdentifier(StubApp.getString2(27761));
    public static final ASN1ObjectIdentifier NameConstraints = new ASN1ObjectIdentifier(StubApp.getString2(27762));
    public static final ASN1ObjectIdentifier CRLDistributionPoints = new ASN1ObjectIdentifier(StubApp.getString2(27763));
    public static final ASN1ObjectIdentifier CertificatePolicies = new ASN1ObjectIdentifier(StubApp.getString2(27764));
    public static final ASN1ObjectIdentifier PolicyMappings = new ASN1ObjectIdentifier(StubApp.getString2(27765));
    public static final ASN1ObjectIdentifier AuthorityKeyIdentifier = new ASN1ObjectIdentifier(StubApp.getString2(27766));
    public static final ASN1ObjectIdentifier PolicyConstraints = new ASN1ObjectIdentifier(StubApp.getString2(27767));
    public static final ASN1ObjectIdentifier ExtendedKeyUsage = new ASN1ObjectIdentifier(StubApp.getString2(27768));
    public static final ASN1ObjectIdentifier FreshestCRL = new ASN1ObjectIdentifier(StubApp.getString2(27769));
    public static final ASN1ObjectIdentifier InhibitAnyPolicy = new ASN1ObjectIdentifier(StubApp.getString2(27770));
    public static final ASN1ObjectIdentifier AuthorityInfoAccess = new ASN1ObjectIdentifier(StubApp.getString2(27771));
    public static final ASN1ObjectIdentifier SubjectInfoAccess = new ASN1ObjectIdentifier(StubApp.getString2(27772));
    public static final ASN1ObjectIdentifier LogoType = new ASN1ObjectIdentifier(StubApp.getString2(27773));
    public static final ASN1ObjectIdentifier BiometricInfo = new ASN1ObjectIdentifier(StubApp.getString2(27774));
    public static final ASN1ObjectIdentifier QCStatements = new ASN1ObjectIdentifier(StubApp.getString2(27775));
    public static final ASN1ObjectIdentifier AuditIdentity = new ASN1ObjectIdentifier(StubApp.getString2(27776));
    public static final ASN1ObjectIdentifier NoRevAvail = new ASN1ObjectIdentifier(StubApp.getString2(27777));
    public static final ASN1ObjectIdentifier TargetInformation = new ASN1ObjectIdentifier(StubApp.getString2(27778));

    public X509Extensions(Hashtable hashtable) {
        this((Vector) null, hashtable);
    }

    public static X509Extensions getInstance(Object obj) {
        if (obj == null || (obj instanceof X509Extensions)) {
            return (X509Extensions) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new X509Extensions((ASN1Sequence) obj);
        }
        if (obj instanceof Extensions) {
            return new X509Extensions((ASN1Sequence) ((Extensions) obj).toASN1Primitive());
        }
        if (obj instanceof ASN1TaggedObject) {
            return getInstance(((ASN1TaggedObject) obj).getObject());
        }
        throw new IllegalArgumentException(a.h(obj, StubApp.getString2(26708)));
    }

    private ASN1ObjectIdentifier[] toOidArray(Vector vector) {
        int size = vector.size();
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
        for (int i3 = 0; i3 != size; i3++) {
            aSN1ObjectIdentifierArr[i3] = (ASN1ObjectIdentifier) vector.elementAt(i3);
        }
        return aSN1ObjectIdentifierArr;
    }

    public boolean equivalent(X509Extensions x509Extensions) {
        if (this.extensions.size() != x509Extensions.extensions.size()) {
            return false;
        }
        Enumeration keys = this.extensions.keys();
        while (keys.hasMoreElements()) {
            Object nextElement = keys.nextElement();
            if (!this.extensions.get(nextElement).equals(x509Extensions.extensions.get(nextElement))) {
                return false;
            }
        }
        return true;
    }

    public ASN1ObjectIdentifier[] getCriticalExtensionOIDs() {
        return getExtensionOIDs(true);
    }

    public X509Extension getExtension(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (X509Extension) this.extensions.get(aSN1ObjectIdentifier);
    }

    public ASN1ObjectIdentifier[] getExtensionOIDs() {
        return toOidArray(this.ordering);
    }

    public ASN1ObjectIdentifier[] getNonCriticalExtensionOIDs() {
        return getExtensionOIDs(false);
    }

    public Enumeration oids() {
        return this.ordering.elements();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(this.ordering.size());
        Enumeration elements = this.ordering.elements();
        while (elements.hasMoreElements()) {
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector(3);
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) elements.nextElement();
            X509Extension x509Extension = (X509Extension) this.extensions.get(aSN1ObjectIdentifier);
            aSN1EncodableVector2.add(aSN1ObjectIdentifier);
            if (x509Extension.isCritical()) {
                aSN1EncodableVector2.add(ASN1Boolean.TRUE);
            }
            aSN1EncodableVector2.add(x509Extension.getValue());
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public X509Extensions(Vector vector, Hashtable hashtable) {
        this.extensions = new Hashtable();
        this.ordering = new Vector();
        Enumeration keys = vector == null ? hashtable.keys() : vector.elements();
        while (keys.hasMoreElements()) {
            this.ordering.addElement(ASN1ObjectIdentifier.getInstance(keys.nextElement()));
        }
        Enumeration elements = this.ordering.elements();
        while (elements.hasMoreElements()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(elements.nextElement());
            this.extensions.put(aSN1ObjectIdentifier, (X509Extension) hashtable.get(aSN1ObjectIdentifier));
        }
    }

    private ASN1ObjectIdentifier[] getExtensionOIDs(boolean z2) {
        Vector vector = new Vector();
        for (int i3 = 0; i3 != this.ordering.size(); i3++) {
            Object elementAt = this.ordering.elementAt(i3);
            if (((X509Extension) this.extensions.get(elementAt)).isCritical() == z2) {
                vector.addElement(elementAt);
            }
        }
        return toOidArray(vector);
    }

    public X509Extensions(Vector vector, Vector vector2) {
        this.extensions = new Hashtable();
        this.ordering = new Vector();
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()) {
            this.ordering.addElement(elements.nextElement());
        }
        Enumeration elements2 = this.ordering.elements();
        int i3 = 0;
        while (elements2.hasMoreElements()) {
            this.extensions.put((ASN1ObjectIdentifier) elements2.nextElement(), (X509Extension) vector2.elementAt(i3));
            i3++;
        }
    }

    public X509Extensions(ASN1Sequence aSN1Sequence) {
        this.extensions = new Hashtable();
        this.ordering = new Vector();
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(objects.nextElement());
            if (aSN1Sequence2.size() == 3) {
                this.extensions.put(aSN1Sequence2.getObjectAt(0), new X509Extension(ASN1Boolean.getInstance(aSN1Sequence2.getObjectAt(1)), ASN1OctetString.getInstance(aSN1Sequence2.getObjectAt(2))));
            } else {
                if (aSN1Sequence2.size() != 2) {
                    throw new IllegalArgumentException(org.bouncycastle.asn1.a.k(aSN1Sequence2, new StringBuilder(StubApp.getString2(26912))));
                }
                this.extensions.put(aSN1Sequence2.getObjectAt(0), new X509Extension(false, ASN1OctetString.getInstance(aSN1Sequence2.getObjectAt(1))));
            }
            this.ordering.addElement(aSN1Sequence2.getObjectAt(0));
        }
    }

    public static X509Extensions getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }
}
