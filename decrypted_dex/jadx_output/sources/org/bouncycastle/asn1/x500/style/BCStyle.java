package org.bouncycastle.asn1.x500.style;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.a;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class BCStyle extends AbstractX500NameStyle {
    public static final ASN1ObjectIdentifier BUSINESS_CATEGORY;

    /* renamed from: C, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f18693C;
    public static final ASN1ObjectIdentifier CN;
    public static final ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE;
    public static final ASN1ObjectIdentifier DATE_OF_BIRTH;
    public static final ASN1ObjectIdentifier DC;
    public static final ASN1ObjectIdentifier DESCRIPTION;
    public static final ASN1ObjectIdentifier DMD_NAME;
    public static final ASN1ObjectIdentifier DN_QUALIFIER;
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;

    /* renamed from: E, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f18694E;
    public static final ASN1ObjectIdentifier EmailAddress;
    public static final ASN1ObjectIdentifier GENDER;
    public static final ASN1ObjectIdentifier GENERATION;
    public static final ASN1ObjectIdentifier GIVENNAME;
    public static final ASN1ObjectIdentifier INITIALS;
    public static final X500NameStyle INSTANCE;

    /* renamed from: L, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f18695L;
    public static final ASN1ObjectIdentifier NAME;
    public static final ASN1ObjectIdentifier NAME_AT_BIRTH;

    /* renamed from: O, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f18696O;
    public static final ASN1ObjectIdentifier ORGANIZATION_IDENTIFIER;
    public static final ASN1ObjectIdentifier OU;
    public static final ASN1ObjectIdentifier PLACE_OF_BIRTH;
    public static final ASN1ObjectIdentifier POSTAL_ADDRESS;
    public static final ASN1ObjectIdentifier POSTAL_CODE;
    public static final ASN1ObjectIdentifier PSEUDONYM;
    public static final ASN1ObjectIdentifier ROLE;
    public static final ASN1ObjectIdentifier SERIALNUMBER;
    public static final ASN1ObjectIdentifier SN;
    public static final ASN1ObjectIdentifier ST;
    public static final ASN1ObjectIdentifier STREET;
    public static final ASN1ObjectIdentifier SURNAME;

    /* renamed from: T, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f18697T;
    public static final ASN1ObjectIdentifier TELEPHONE_NUMBER;
    public static final ASN1ObjectIdentifier UID;
    public static final ASN1ObjectIdentifier UNIQUE_IDENTIFIER;
    public static final ASN1ObjectIdentifier UnstructuredAddress;
    public static final ASN1ObjectIdentifier UnstructuredName;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier u2 = a.u(StubApp.getString2(27555));
        f18693C = u2;
        ASN1ObjectIdentifier u10 = a.u(StubApp.getString2(27556));
        f18696O = u10;
        ASN1ObjectIdentifier u11 = a.u(StubApp.getString2(27557));
        OU = u11;
        ASN1ObjectIdentifier u12 = a.u(StubApp.getString2(27558));
        f18697T = u12;
        ASN1ObjectIdentifier u13 = a.u(StubApp.getString2(27559));
        CN = u13;
        String string2 = StubApp.getString2(27560);
        SN = a.u(string2);
        ASN1ObjectIdentifier u14 = a.u(StubApp.getString2(27561));
        STREET = u14;
        ASN1ObjectIdentifier u15 = a.u(string2);
        SERIALNUMBER = u15;
        ASN1ObjectIdentifier u16 = a.u(StubApp.getString2(27562));
        f18695L = u16;
        ASN1ObjectIdentifier u17 = a.u(StubApp.getString2(27563));
        ST = u17;
        ASN1ObjectIdentifier u18 = a.u(StubApp.getString2(27564));
        SURNAME = u18;
        ASN1ObjectIdentifier u19 = a.u(StubApp.getString2(27565));
        GIVENNAME = u19;
        ASN1ObjectIdentifier u20 = a.u(StubApp.getString2(27566));
        INITIALS = u20;
        ASN1ObjectIdentifier u21 = a.u(StubApp.getString2(27567));
        GENERATION = u21;
        ASN1ObjectIdentifier u22 = a.u(StubApp.getString2(27568));
        UNIQUE_IDENTIFIER = u22;
        ASN1ObjectIdentifier u23 = a.u(StubApp.getString2(27569));
        DESCRIPTION = u23;
        ASN1ObjectIdentifier u24 = a.u(StubApp.getString2(27570));
        BUSINESS_CATEGORY = u24;
        ASN1ObjectIdentifier u25 = a.u(StubApp.getString2(27571));
        POSTAL_CODE = u25;
        ASN1ObjectIdentifier u26 = a.u(StubApp.getString2(27572));
        DN_QUALIFIER = u26;
        ASN1ObjectIdentifier u27 = a.u(StubApp.getString2(27573));
        PSEUDONYM = u27;
        ASN1ObjectIdentifier u28 = a.u(StubApp.getString2(27574));
        ROLE = u28;
        ASN1ObjectIdentifier u29 = a.u(StubApp.getString2(27575));
        DATE_OF_BIRTH = u29;
        ASN1ObjectIdentifier u30 = a.u(StubApp.getString2(27576));
        PLACE_OF_BIRTH = u30;
        ASN1ObjectIdentifier u31 = a.u(StubApp.getString2(27577));
        GENDER = u31;
        ASN1ObjectIdentifier u32 = a.u(StubApp.getString2(27578));
        COUNTRY_OF_CITIZENSHIP = u32;
        ASN1ObjectIdentifier u33 = a.u(StubApp.getString2(27579));
        COUNTRY_OF_RESIDENCE = u33;
        ASN1ObjectIdentifier u34 = a.u(StubApp.getString2(27580));
        NAME_AT_BIRTH = u34;
        ASN1ObjectIdentifier u35 = a.u(StubApp.getString2(27581));
        POSTAL_ADDRESS = u35;
        DMD_NAME = a.u(StubApp.getString2(27582));
        ASN1ObjectIdentifier aSN1ObjectIdentifier = X509ObjectIdentifiers.id_at_telephoneNumber;
        TELEPHONE_NUMBER = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = X509ObjectIdentifiers.id_at_name;
        NAME = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = X509ObjectIdentifiers.id_at_organizationIdentifier;
        ORGANIZATION_IDENTIFIER = aSN1ObjectIdentifier3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        EmailAddress = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredName = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        UnstructuredAddress = aSN1ObjectIdentifier6;
        f18694E = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new ASN1ObjectIdentifier(StubApp.getString2(27583));
        DC = aSN1ObjectIdentifier7;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier(StubApp.getString2(27584));
        UID = aSN1ObjectIdentifier8;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(u2, StubApp.getString2(4907));
        hashtable.put(u10, StubApp.getString2(4919));
        hashtable.put(u12, StubApp.getString2(4923));
        hashtable.put(u11, StubApp.getString2(27585));
        hashtable.put(u13, StubApp.getString2(4722));
        hashtable.put(u16, StubApp.getString2(4916));
        hashtable.put(u17, StubApp.getString2(4568));
        hashtable.put(u15, StubApp.getString2(27586));
        hashtable.put(aSN1ObjectIdentifier4, StubApp.getString2(4909));
        hashtable.put(aSN1ObjectIdentifier7, StubApp.getString2(27587));
        hashtable.put(aSN1ObjectIdentifier8, StubApp.getString2(27588));
        hashtable.put(u14, StubApp.getString2(27589));
        hashtable.put(u18, StubApp.getString2(27590));
        hashtable.put(u19, StubApp.getString2(27591));
        hashtable.put(u20, StubApp.getString2(27592));
        hashtable.put(u21, StubApp.getString2(27593));
        hashtable.put(u23, StubApp.getString2(17403));
        hashtable.put(u28, StubApp.getString2(27594));
        hashtable.put(aSN1ObjectIdentifier6, StubApp.getString2(27595));
        hashtable.put(aSN1ObjectIdentifier5, StubApp.getString2(27596));
        hashtable.put(u22, StubApp.getString2(27597));
        hashtable.put(u26, StubApp.getString2(27598));
        hashtable.put(u27, StubApp.getString2(27599));
        hashtable.put(u35, StubApp.getString2(27600));
        hashtable.put(u34, StubApp.getString2(27601));
        hashtable.put(u32, StubApp.getString2(27602));
        hashtable.put(u33, StubApp.getString2(27603));
        hashtable.put(u31, StubApp.getString2(15987));
        hashtable.put(u30, StubApp.getString2(27604));
        hashtable.put(u29, StubApp.getString2(27605));
        hashtable.put(u25, StubApp.getString2(27606));
        hashtable.put(u24, StubApp.getString2(27607));
        hashtable.put(aSN1ObjectIdentifier, StubApp.getString2(27608));
        hashtable.put(aSN1ObjectIdentifier2, StubApp.getString2(3222));
        hashtable.put(aSN1ObjectIdentifier3, StubApp.getString2(27609));
        hashtable2.put(StubApp.getString2(2376), u2);
        hashtable2.put(StubApp.getString2(2373), u10);
        hashtable2.put(StubApp.getString2(1310), u12);
        hashtable2.put(StubApp.getString2(25269), u11);
        hashtable2.put(StubApp.getString2(27610), u13);
        hashtable2.put(StubApp.getString2(1314), u16);
        hashtable2.put(StubApp.getString2(24035), u17);
        hashtable2.put(StubApp.getString2(11244), u18);
        hashtable2.put(StubApp.getString2(27611), u15);
        hashtable2.put(StubApp.getString2(2050), u14);
        hashtable2.put(StubApp.getString2(27612), aSN1ObjectIdentifier4);
        hashtable2.put(StubApp.getString2(27613), aSN1ObjectIdentifier7);
        hashtable2.put(StubApp.getString2(1958), aSN1ObjectIdentifier4);
        hashtable2.put(StubApp.getString2(27614), aSN1ObjectIdentifier8);
        hashtable2.put(StubApp.getString2(27615), u18);
        hashtable2.put(StubApp.getString2(27616), u19);
        hashtable2.put(StubApp.getString2(27617), u20);
        hashtable2.put(StubApp.getString2(27618), u21);
        hashtable2.put(StubApp.getString2(659), u23);
        hashtable2.put(StubApp.getString2(9755), u28);
        hashtable2.put(StubApp.getString2(27619), aSN1ObjectIdentifier6);
        hashtable2.put(StubApp.getString2(27620), aSN1ObjectIdentifier5);
        hashtable2.put(StubApp.getString2(27621), u22);
        hashtable2.put(StubApp.getString2(27622), u26);
        hashtable2.put(StubApp.getString2(27623), u27);
        hashtable2.put(StubApp.getString2(27624), u35);
        hashtable2.put(StubApp.getString2(27625), u34);
        hashtable2.put(StubApp.getString2(27626), u32);
        hashtable2.put(StubApp.getString2(27627), u33);
        hashtable2.put(StubApp.getString2(17903), u31);
        hashtable2.put(StubApp.getString2(27628), u30);
        hashtable2.put(StubApp.getString2(27629), u29);
        hashtable2.put(StubApp.getString2(27630), u25);
        hashtable2.put(StubApp.getString2(27631), u24);
        hashtable2.put(StubApp.getString2(27632), aSN1ObjectIdentifier);
        hashtable2.put(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), aSN1ObjectIdentifier2);
        hashtable2.put(StubApp.getString2(27633), aSN1ObjectIdentifier3);
        INSTANCE = new BCStyle();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return (aSN1ObjectIdentifier.equals((ASN1Primitive) EmailAddress) || aSN1ObjectIdentifier.equals((ASN1Primitive) DC)) ? new DERIA5String(str) : aSN1ObjectIdentifier.equals((ASN1Primitive) DATE_OF_BIRTH) ? new ASN1GeneralizedTime(str) : (aSN1ObjectIdentifier.equals((ASN1Primitive) f18693C) || aSN1ObjectIdentifier.equals((ASN1Primitive) SN) || aSN1ObjectIdentifier.equals((ASN1Primitive) DN_QUALIFIER) || aSN1ObjectIdentifier.equals((ASN1Primitive) TELEPHONE_NUMBER)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        return IETFUtils.rDNsFromString(str, this);
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
        boolean z2 = true;
        for (RDN rdn : x500Name.getRDNs()) {
            if (z2) {
                z2 = false;
            } else {
                stringBuffer.append(',');
            }
            IETFUtils.appendRDN(stringBuffer, rdn, this.defaultSymbols);
        }
        return stringBuffer.toString();
    }
}
