package org.bouncycastle.asn1.isismtt.x509;

import com.stub.StubApp;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1PrintableString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x500.DirectoryString;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class ProfessionInfo extends ASN1Object {
    public static final ASN1ObjectIdentifier Notar;
    public static final ASN1ObjectIdentifier Notariatsverwalter;
    public static final ASN1ObjectIdentifier Notariatsverwalterin;
    public static final ASN1ObjectIdentifier Notarin;
    public static final ASN1ObjectIdentifier Notarvertreter;
    public static final ASN1ObjectIdentifier Notarvertreterin;
    public static final ASN1ObjectIdentifier Patentanwalt;
    public static final ASN1ObjectIdentifier Patentanwltin;
    public static final ASN1ObjectIdentifier Rechtsanwalt;
    public static final ASN1ObjectIdentifier Rechtsanwltin;
    public static final ASN1ObjectIdentifier Rechtsbeistand;
    public static final ASN1ObjectIdentifier Steuerberater;
    public static final ASN1ObjectIdentifier Steuerberaterin;
    public static final ASN1ObjectIdentifier Steuerbevollmchtigte;
    public static final ASN1ObjectIdentifier Steuerbevollmchtigter;
    public static final ASN1ObjectIdentifier VereidigteBuchprferin;
    public static final ASN1ObjectIdentifier VereidigterBuchprfer;
    public static final ASN1ObjectIdentifier Wirtschaftsprfer;
    public static final ASN1ObjectIdentifier Wirtschaftsprferin;
    private ASN1OctetString addProfessionInfo;
    private NamingAuthority namingAuthority;
    private ASN1Sequence professionItems;
    private ASN1Sequence professionOIDs;
    private String registrationNumber;

    static {
        StringBuilder sb2 = new StringBuilder();
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NamingAuthority.id_isismtt_at_namingAuthorities_RechtWirtschaftSteuern;
        sb2.append(aSN1ObjectIdentifier);
        sb2.append(StubApp.getString2(27125));
        Rechtsanwltin = new ASN1ObjectIdentifier(sb2.toString());
        Rechtsanwalt = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27126));
        Rechtsbeistand = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27127));
        Steuerberaterin = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27128));
        Steuerberater = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27129));
        Steuerbevollmchtigte = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27130));
        Steuerbevollmchtigter = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27131));
        Notarin = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27132));
        Notar = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27133));
        Notarvertreterin = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27134));
        Notarvertreter = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27135));
        Notariatsverwalterin = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27136));
        Notariatsverwalter = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27137));
        Wirtschaftsprferin = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27138));
        Wirtschaftsprfer = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27139));
        VereidigteBuchprferin = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27140));
        VereidigterBuchprfer = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27141));
        Patentanwltin = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27142));
        Patentanwalt = new ASN1ObjectIdentifier(aSN1ObjectIdentifier + StubApp.getString2(27143));
    }

    private ProfessionInfo(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() > 5) {
            throw new IllegalArgumentException(a.k(aSN1Sequence, new StringBuilder(StubApp.getString2(26912))));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        ASN1Encodable aSN1Encodable = (ASN1Encodable) objects.nextElement();
        if (aSN1Encodable instanceof ASN1TaggedObject) {
            ASN1TaggedObject aSN1TaggedObject = (ASN1TaggedObject) aSN1Encodable;
            if (aSN1TaggedObject.getTagNo() != 0) {
                throw new IllegalArgumentException(a.l(aSN1TaggedObject, new StringBuilder(StubApp.getString2(27122))));
            }
            this.namingAuthority = NamingAuthority.getInstance(aSN1TaggedObject, true);
            aSN1Encodable = (ASN1Encodable) objects.nextElement();
        }
        this.professionItems = ASN1Sequence.getInstance(aSN1Encodable);
        boolean hasMoreElements = objects.hasMoreElements();
        String string2 = StubApp.getString2(27123);
        if (hasMoreElements) {
            ASN1Encodable aSN1Encodable2 = (ASN1Encodable) objects.nextElement();
            if (aSN1Encodable2 instanceof ASN1Sequence) {
                this.professionOIDs = ASN1Sequence.getInstance(aSN1Encodable2);
            } else if (aSN1Encodable2 instanceof ASN1PrintableString) {
                this.registrationNumber = ASN1PrintableString.getInstance(aSN1Encodable2).getString();
            } else {
                if (!(aSN1Encodable2 instanceof ASN1OctetString)) {
                    throw new IllegalArgumentException(string2 + aSN1Encodable2.getClass());
                }
                this.addProfessionInfo = ASN1OctetString.getInstance(aSN1Encodable2);
            }
        }
        if (objects.hasMoreElements()) {
            ASN1Encodable aSN1Encodable3 = (ASN1Encodable) objects.nextElement();
            if (aSN1Encodable3 instanceof ASN1PrintableString) {
                this.registrationNumber = ASN1PrintableString.getInstance(aSN1Encodable3).getString();
            } else {
                if (!(aSN1Encodable3 instanceof DEROctetString)) {
                    throw new IllegalArgumentException(string2 + aSN1Encodable3.getClass());
                }
                this.addProfessionInfo = (DEROctetString) aSN1Encodable3;
            }
        }
        if (objects.hasMoreElements()) {
            ASN1Encodable aSN1Encodable4 = (ASN1Encodable) objects.nextElement();
            if (aSN1Encodable4 instanceof DEROctetString) {
                this.addProfessionInfo = (DEROctetString) aSN1Encodable4;
            } else {
                throw new IllegalArgumentException(string2 + aSN1Encodable4.getClass());
            }
        }
    }

    public static ProfessionInfo getInstance(Object obj) {
        if (obj == null || (obj instanceof ProfessionInfo)) {
            return (ProfessionInfo) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ProfessionInfo((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(E1.a.h(obj, StubApp.getString2(26708)));
    }

    public ASN1OctetString getAddProfessionInfo() {
        return this.addProfessionInfo;
    }

    public NamingAuthority getNamingAuthority() {
        return this.namingAuthority;
    }

    public DirectoryString[] getProfessionItems() {
        DirectoryString[] directoryStringArr = new DirectoryString[this.professionItems.size()];
        Enumeration objects = this.professionItems.getObjects();
        int i3 = 0;
        while (objects.hasMoreElements()) {
            directoryStringArr[i3] = DirectoryString.getInstance(objects.nextElement());
            i3++;
        }
        return directoryStringArr;
    }

    public ASN1ObjectIdentifier[] getProfessionOIDs() {
        ASN1Sequence aSN1Sequence = this.professionOIDs;
        int i3 = 0;
        if (aSN1Sequence == null) {
            return new ASN1ObjectIdentifier[0];
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[aSN1Sequence.size()];
        Enumeration objects = this.professionOIDs.getObjects();
        while (objects.hasMoreElements()) {
            aSN1ObjectIdentifierArr[i3] = ASN1ObjectIdentifier.getInstance(objects.nextElement());
            i3++;
        }
        return aSN1ObjectIdentifierArr;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(5);
        NamingAuthority namingAuthority = this.namingAuthority;
        if (namingAuthority != null) {
            aSN1EncodableVector.add(new DERTaggedObject(true, 0, (ASN1Encodable) namingAuthority));
        }
        aSN1EncodableVector.add(this.professionItems);
        ASN1Sequence aSN1Sequence = this.professionOIDs;
        if (aSN1Sequence != null) {
            aSN1EncodableVector.add(aSN1Sequence);
        }
        if (this.registrationNumber != null) {
            aSN1EncodableVector.add(new DERPrintableString(this.registrationNumber, true));
        }
        ASN1OctetString aSN1OctetString = this.addProfessionInfo;
        if (aSN1OctetString != null) {
            aSN1EncodableVector.add(aSN1OctetString);
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public ProfessionInfo(NamingAuthority namingAuthority, DirectoryString[] directoryStringArr, ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr, String str, ASN1OctetString aSN1OctetString) {
        this.namingAuthority = namingAuthority;
        this.professionItems = new DERSequence(directoryStringArr);
        if (aSN1ObjectIdentifierArr != null) {
            this.professionOIDs = new DERSequence(aSN1ObjectIdentifierArr);
        }
        this.registrationNumber = str;
        this.addProfessionInfo = aSN1OctetString;
    }
}
