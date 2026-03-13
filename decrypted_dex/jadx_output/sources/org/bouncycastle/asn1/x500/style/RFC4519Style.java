package org.bouncycastle.asn1.x500.style;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class RFC4519Style extends AbstractX500NameStyle {
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier businessCategory;

    /* renamed from: c, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f18698c;
    public static final ASN1ObjectIdentifier cn;

    /* renamed from: dc, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f18699dc;
    public static final ASN1ObjectIdentifier description;
    public static final ASN1ObjectIdentifier destinationIndicator;
    public static final ASN1ObjectIdentifier distinguishedName;
    public static final ASN1ObjectIdentifier dnQualifier;
    public static final ASN1ObjectIdentifier enhancedSearchGuide;
    public static final ASN1ObjectIdentifier facsimileTelephoneNumber;
    public static final ASN1ObjectIdentifier generationQualifier;
    public static final ASN1ObjectIdentifier givenName;
    public static final ASN1ObjectIdentifier houseIdentifier;
    public static final ASN1ObjectIdentifier initials;
    public static final ASN1ObjectIdentifier internationalISDNNumber;

    /* renamed from: l, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f18700l;
    public static final ASN1ObjectIdentifier member;
    public static final ASN1ObjectIdentifier name;

    /* renamed from: o, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f18701o;
    public static final ASN1ObjectIdentifier ou;
    public static final ASN1ObjectIdentifier owner;
    public static final ASN1ObjectIdentifier physicalDeliveryOfficeName;
    public static final ASN1ObjectIdentifier postOfficeBox;
    public static final ASN1ObjectIdentifier postalAddress;
    public static final ASN1ObjectIdentifier postalCode;
    public static final ASN1ObjectIdentifier preferredDeliveryMethod;
    public static final ASN1ObjectIdentifier registeredAddress;
    public static final ASN1ObjectIdentifier roleOccupant;
    public static final ASN1ObjectIdentifier searchGuide;
    public static final ASN1ObjectIdentifier seeAlso;
    public static final ASN1ObjectIdentifier serialNumber;
    public static final ASN1ObjectIdentifier sn;
    public static final ASN1ObjectIdentifier st;
    public static final ASN1ObjectIdentifier street;
    public static final ASN1ObjectIdentifier telephoneNumber;
    public static final ASN1ObjectIdentifier teletexTerminalIdentifier;
    public static final ASN1ObjectIdentifier telexNumber;
    public static final ASN1ObjectIdentifier title;
    public static final ASN1ObjectIdentifier uid;
    public static final ASN1ObjectIdentifier uniqueMember;
    public static final ASN1ObjectIdentifier userPassword;
    public static final ASN1ObjectIdentifier x121Address;
    public static final ASN1ObjectIdentifier x500UniqueIdentifier;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier u2 = a.u(StubApp.getString2(27570));
        businessCategory = u2;
        ASN1ObjectIdentifier u10 = a.u(StubApp.getString2(27555));
        f18698c = u10;
        ASN1ObjectIdentifier u11 = a.u(StubApp.getString2(27559));
        cn = u11;
        ASN1ObjectIdentifier u12 = a.u(StubApp.getString2(27583));
        f18699dc = u12;
        ASN1ObjectIdentifier u13 = a.u(StubApp.getString2(27569));
        description = u13;
        ASN1ObjectIdentifier u14 = a.u(StubApp.getString2(27641));
        destinationIndicator = u14;
        ASN1ObjectIdentifier u15 = a.u(StubApp.getString2(27642));
        distinguishedName = u15;
        ASN1ObjectIdentifier u16 = a.u(StubApp.getString2(27572));
        dnQualifier = u16;
        ASN1ObjectIdentifier u17 = a.u(StubApp.getString2(27643));
        enhancedSearchGuide = u17;
        ASN1ObjectIdentifier u18 = a.u(StubApp.getString2(27644));
        facsimileTelephoneNumber = u18;
        ASN1ObjectIdentifier u19 = a.u(StubApp.getString2(27567));
        generationQualifier = u19;
        ASN1ObjectIdentifier u20 = a.u(StubApp.getString2(27565));
        givenName = u20;
        ASN1ObjectIdentifier u21 = a.u(StubApp.getString2(27645));
        houseIdentifier = u21;
        ASN1ObjectIdentifier u22 = a.u(StubApp.getString2(27566));
        initials = u22;
        ASN1ObjectIdentifier u23 = a.u(StubApp.getString2(27646));
        internationalISDNNumber = u23;
        ASN1ObjectIdentifier u24 = a.u(StubApp.getString2(27562));
        f18700l = u24;
        ASN1ObjectIdentifier u25 = a.u(StubApp.getString2(27647));
        member = u25;
        ASN1ObjectIdentifier u26 = a.u(StubApp.getString2(27648));
        name = u26;
        ASN1ObjectIdentifier u27 = a.u(StubApp.getString2(27556));
        f18701o = u27;
        ASN1ObjectIdentifier u28 = a.u(StubApp.getString2(27557));
        ou = u28;
        ASN1ObjectIdentifier u29 = a.u(StubApp.getString2(27649));
        owner = u29;
        ASN1ObjectIdentifier u30 = a.u(StubApp.getString2(27650));
        physicalDeliveryOfficeName = u30;
        ASN1ObjectIdentifier u31 = a.u(StubApp.getString2(27581));
        postalAddress = u31;
        ASN1ObjectIdentifier u32 = a.u(StubApp.getString2(27571));
        postalCode = u32;
        ASN1ObjectIdentifier u33 = a.u(StubApp.getString2(27651));
        postOfficeBox = u33;
        ASN1ObjectIdentifier u34 = a.u(StubApp.getString2(27652));
        preferredDeliveryMethod = u34;
        ASN1ObjectIdentifier u35 = a.u(StubApp.getString2(27653));
        registeredAddress = u35;
        ASN1ObjectIdentifier u36 = a.u(StubApp.getString2(27654));
        roleOccupant = u36;
        ASN1ObjectIdentifier u37 = a.u(StubApp.getString2(27655));
        searchGuide = u37;
        ASN1ObjectIdentifier u38 = a.u(StubApp.getString2(27656));
        seeAlso = u38;
        ASN1ObjectIdentifier u39 = a.u(StubApp.getString2(27560));
        serialNumber = u39;
        ASN1ObjectIdentifier u40 = a.u(StubApp.getString2(27564));
        sn = u40;
        ASN1ObjectIdentifier u41 = a.u(StubApp.getString2(27563));
        st = u41;
        ASN1ObjectIdentifier u42 = a.u(StubApp.getString2(27561));
        street = u42;
        ASN1ObjectIdentifier u43 = a.u(StubApp.getString2(27657));
        telephoneNumber = u43;
        ASN1ObjectIdentifier u44 = a.u(StubApp.getString2(27658));
        teletexTerminalIdentifier = u44;
        ASN1ObjectIdentifier u45 = a.u(StubApp.getString2(27659));
        telexNumber = u45;
        ASN1ObjectIdentifier u46 = a.u(StubApp.getString2(27558));
        title = u46;
        ASN1ObjectIdentifier u47 = a.u(StubApp.getString2(27584));
        uid = u47;
        ASN1ObjectIdentifier u48 = a.u(StubApp.getString2(27660));
        uniqueMember = u48;
        ASN1ObjectIdentifier u49 = a.u(StubApp.getString2(27661));
        userPassword = u49;
        ASN1ObjectIdentifier u50 = a.u(StubApp.getString2(27662));
        x121Address = u50;
        ASN1ObjectIdentifier u51 = a.u(StubApp.getString2(27568));
        x500UniqueIdentifier = u51;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(u2, StubApp.getString2(27663));
        String string2 = StubApp.getString2(2376);
        hashtable.put(u10, string2);
        String string22 = StubApp.getString2(27610);
        hashtable.put(u11, string22);
        String string23 = StubApp.getString2(27613);
        hashtable.put(u12, string23);
        String string24 = StubApp.getString2(659);
        hashtable.put(u13, string24);
        hashtable.put(u14, StubApp.getString2(27664));
        hashtable.put(u15, StubApp.getString2(27665));
        hashtable.put(u16, StubApp.getString2(27666));
        hashtable.put(u17, StubApp.getString2(27667));
        hashtable.put(u18, StubApp.getString2(27668));
        hashtable.put(u19, StubApp.getString2(27669));
        hashtable.put(u20, StubApp.getString2(11428));
        hashtable.put(u21, StubApp.getString2(27670));
        String string25 = StubApp.getString2(27617);
        hashtable.put(u22, string25);
        hashtable.put(u23, StubApp.getString2(27671));
        String string26 = StubApp.getString2(1314);
        hashtable.put(u24, string26);
        String string27 = StubApp.getString2(27672);
        hashtable.put(u25, string27);
        String string28 = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
        hashtable.put(u26, string28);
        String string29 = StubApp.getString2(2373);
        hashtable.put(u27, string29);
        String string210 = StubApp.getString2(25269);
        hashtable.put(u28, string210);
        String string211 = StubApp.getString2(9619);
        hashtable.put(u29, string211);
        hashtable.put(u30, StubApp.getString2(27673));
        hashtable.put(u31, StubApp.getString2(17949));
        hashtable.put(u32, StubApp.getString2(7505));
        hashtable.put(u33, StubApp.getString2(27674));
        hashtable.put(u34, StubApp.getString2(27675));
        hashtable.put(u35, StubApp.getString2(27676));
        hashtable.put(u36, StubApp.getString2(27677));
        hashtable.put(u37, StubApp.getString2(27678));
        hashtable.put(u38, StubApp.getString2(27679));
        hashtable.put(u39, StubApp.getString2(27680));
        String string212 = StubApp.getString2(11244);
        hashtable.put(u40, string212);
        String string213 = StubApp.getString2(24035);
        hashtable.put(u41, string213);
        String string214 = StubApp.getString2(2050);
        hashtable.put(u42, string214);
        hashtable.put(u43, StubApp.getString2(17951));
        hashtable.put(u44, StubApp.getString2(27681));
        hashtable.put(u45, StubApp.getString2(27682));
        String string215 = StubApp.getString2(616);
        hashtable.put(u46, string215);
        String string216 = StubApp.getString2(27614);
        hashtable.put(u47, string216);
        hashtable.put(u48, StubApp.getString2(27683));
        hashtable.put(u49, StubApp.getString2(27684));
        hashtable.put(u50, StubApp.getString2(27685));
        hashtable.put(u51, StubApp.getString2(27686));
        hashtable2.put(StubApp.getString2(27631), u2);
        hashtable2.put(string2, u10);
        hashtable2.put(string22, u11);
        hashtable2.put(string23, u12);
        hashtable2.put(string24, u13);
        hashtable2.put(StubApp.getString2(27687), u14);
        hashtable2.put(StubApp.getString2(27688), u15);
        hashtable2.put(StubApp.getString2(27689), u16);
        hashtable2.put(StubApp.getString2(27690), u17);
        hashtable2.put(StubApp.getString2(27691), u18);
        hashtable2.put(StubApp.getString2(27692), u19);
        hashtable2.put(StubApp.getString2(27616), u20);
        hashtable2.put(StubApp.getString2(27693), u21);
        hashtable2.put(string25, u22);
        hashtable2.put(StubApp.getString2(27694), u23);
        hashtable2.put(string26, u24);
        hashtable2.put(string27, u25);
        hashtable2.put(string28, u26);
        hashtable2.put(string29, u27);
        hashtable2.put(string210, u28);
        hashtable2.put(string211, u29);
        hashtable2.put(StubApp.getString2(27695), u30);
        hashtable2.put(StubApp.getString2(27624), u31);
        hashtable2.put(StubApp.getString2(27630), u32);
        hashtable2.put(StubApp.getString2(27696), u33);
        hashtable2.put(StubApp.getString2(27697), u34);
        hashtable2.put(StubApp.getString2(27698), u35);
        hashtable2.put(StubApp.getString2(27699), u36);
        hashtable2.put(StubApp.getString2(27700), u37);
        hashtable2.put(StubApp.getString2(27701), u38);
        hashtable2.put(StubApp.getString2(27611), u39);
        hashtable2.put(string212, u40);
        hashtable2.put(string213, u41);
        hashtable2.put(string214, u42);
        hashtable2.put(StubApp.getString2(27632), u43);
        hashtable2.put(StubApp.getString2(27702), u44);
        hashtable2.put(StubApp.getString2(27703), u45);
        hashtable2.put(string215, u46);
        hashtable2.put(string216, u47);
        hashtable2.put(StubApp.getString2(27704), u48);
        hashtable2.put(StubApp.getString2(27705), u49);
        hashtable2.put(StubApp.getString2(27706), u50);
        hashtable2.put(StubApp.getString2(27707), u51);
        INSTANCE = new RFC4519Style();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return aSN1ObjectIdentifier.equals((ASN1Primitive) f18699dc) ? new DERIA5String(str) : (aSN1ObjectIdentifier.equals((ASN1Primitive) f18698c) || aSN1ObjectIdentifier.equals((ASN1Primitive) serialNumber) || aSN1ObjectIdentifier.equals((ASN1Primitive) dnQualifier) || aSN1ObjectIdentifier.equals((ASN1Primitive) telephoneNumber)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        RDN[] rDNsFromString = IETFUtils.rDNsFromString(str, this);
        RDN[] rdnArr = new RDN[rDNsFromString.length];
        for (int i3 = 0; i3 != rDNsFromString.length; i3++) {
            rdnArr[(r0 - i3) - 1] = rDNsFromString[i3];
        }
        return rdnArr;
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String[] oidToAttrNames(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String oidToDisplayName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) this.defaultSymbols.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) {
        StringBuffer stringBuffer = new StringBuffer();
        RDN[] rDNs = x500Name.getRDNs();
        boolean z2 = true;
        for (int length = rDNs.length - 1; length >= 0; length--) {
            if (z2) {
                z2 = false;
            } else {
                stringBuffer.append(',');
            }
            IETFUtils.appendRDN(stringBuffer, rDNs[length], this.defaultSymbols);
        }
        return stringBuffer.toString();
    }
}
