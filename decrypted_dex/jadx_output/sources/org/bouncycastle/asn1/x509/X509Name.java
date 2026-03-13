package org.bouncycastle.asn1.x509;

import E1.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mapbox.common.b;
import com.stub.StubApp;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import kotlin.UByte;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.ASN1String;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.ASN1UniversalString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class X509Name extends ASN1Object {
    public static final ASN1ObjectIdentifier BUSINESS_CATEGORY;

    /* renamed from: C, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f18705C;
    public static final ASN1ObjectIdentifier CN;
    public static final ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE;
    public static final ASN1ObjectIdentifier DATE_OF_BIRTH;
    public static final ASN1ObjectIdentifier DC;
    public static final ASN1ObjectIdentifier DMD_NAME;
    public static final ASN1ObjectIdentifier DN_QUALIFIER;
    public static final Hashtable DefaultLookUp;
    public static boolean DefaultReverse;
    public static final Hashtable DefaultSymbols;

    /* renamed from: E, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f18706E;
    public static final ASN1ObjectIdentifier EmailAddress;
    private static final Boolean FALSE;
    public static final ASN1ObjectIdentifier GENDER;
    public static final ASN1ObjectIdentifier GENERATION;
    public static final ASN1ObjectIdentifier GIVENNAME;
    public static final ASN1ObjectIdentifier INITIALS;

    /* renamed from: L, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f18707L;
    public static final ASN1ObjectIdentifier NAME;
    public static final ASN1ObjectIdentifier NAME_AT_BIRTH;

    /* renamed from: O, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f18708O;
    public static final Hashtable OIDLookUp;
    public static final ASN1ObjectIdentifier OU;
    public static final ASN1ObjectIdentifier PLACE_OF_BIRTH;
    public static final ASN1ObjectIdentifier POSTAL_ADDRESS;
    public static final ASN1ObjectIdentifier POSTAL_CODE;
    public static final ASN1ObjectIdentifier PSEUDONYM;
    public static final Hashtable RFC1779Symbols;
    public static final Hashtable RFC2253Symbols;
    public static final ASN1ObjectIdentifier SERIALNUMBER;
    public static final ASN1ObjectIdentifier SN;
    public static final ASN1ObjectIdentifier ST;
    public static final ASN1ObjectIdentifier STREET;
    public static final ASN1ObjectIdentifier SURNAME;
    public static final Hashtable SymbolLookUp;

    /* renamed from: T, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f18709T;
    public static final ASN1ObjectIdentifier TELEPHONE_NUMBER;
    private static final Boolean TRUE;
    public static final ASN1ObjectIdentifier UID;
    public static final ASN1ObjectIdentifier UNIQUE_IDENTIFIER;
    public static final ASN1ObjectIdentifier UnstructuredAddress;
    public static final ASN1ObjectIdentifier UnstructuredName;
    private Vector added;
    private X509NameEntryConverter converter;
    private int hashCodeValue;
    private boolean isHashCodeCalculated;
    private Vector ordering;
    private ASN1Sequence seq;
    private Vector values;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier(StubApp.getString2(27555));
        f18705C = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(StubApp.getString2(27556));
        f18708O = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = new ASN1ObjectIdentifier(StubApp.getString2(27557));
        OU = aSN1ObjectIdentifier3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier(StubApp.getString2(27558));
        f18709T = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = new ASN1ObjectIdentifier(StubApp.getString2(27559));
        CN = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = new ASN1ObjectIdentifier(StubApp.getString2(27560));
        SN = aSN1ObjectIdentifier6;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new ASN1ObjectIdentifier(StubApp.getString2(27561));
        STREET = aSN1ObjectIdentifier7;
        SERIALNUMBER = aSN1ObjectIdentifier6;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier(StubApp.getString2(27562));
        f18707L = aSN1ObjectIdentifier8;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = new ASN1ObjectIdentifier(StubApp.getString2(27563));
        ST = aSN1ObjectIdentifier9;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = new ASN1ObjectIdentifier(StubApp.getString2(27564));
        SURNAME = aSN1ObjectIdentifier10;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = new ASN1ObjectIdentifier(StubApp.getString2(27565));
        GIVENNAME = aSN1ObjectIdentifier11;
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = new ASN1ObjectIdentifier(StubApp.getString2(27566));
        INITIALS = aSN1ObjectIdentifier12;
        ASN1ObjectIdentifier aSN1ObjectIdentifier13 = new ASN1ObjectIdentifier(StubApp.getString2(27567));
        GENERATION = aSN1ObjectIdentifier13;
        ASN1ObjectIdentifier aSN1ObjectIdentifier14 = new ASN1ObjectIdentifier(StubApp.getString2(27568));
        UNIQUE_IDENTIFIER = aSN1ObjectIdentifier14;
        ASN1ObjectIdentifier aSN1ObjectIdentifier15 = new ASN1ObjectIdentifier(StubApp.getString2(27570));
        BUSINESS_CATEGORY = aSN1ObjectIdentifier15;
        ASN1ObjectIdentifier aSN1ObjectIdentifier16 = new ASN1ObjectIdentifier(StubApp.getString2(27571));
        POSTAL_CODE = aSN1ObjectIdentifier16;
        ASN1ObjectIdentifier aSN1ObjectIdentifier17 = new ASN1ObjectIdentifier(StubApp.getString2(27572));
        DN_QUALIFIER = aSN1ObjectIdentifier17;
        ASN1ObjectIdentifier aSN1ObjectIdentifier18 = new ASN1ObjectIdentifier(StubApp.getString2(27573));
        PSEUDONYM = aSN1ObjectIdentifier18;
        ASN1ObjectIdentifier aSN1ObjectIdentifier19 = new ASN1ObjectIdentifier(StubApp.getString2(27575));
        DATE_OF_BIRTH = aSN1ObjectIdentifier19;
        ASN1ObjectIdentifier aSN1ObjectIdentifier20 = new ASN1ObjectIdentifier(StubApp.getString2(27576));
        PLACE_OF_BIRTH = aSN1ObjectIdentifier20;
        ASN1ObjectIdentifier aSN1ObjectIdentifier21 = new ASN1ObjectIdentifier(StubApp.getString2(27577));
        GENDER = aSN1ObjectIdentifier21;
        ASN1ObjectIdentifier aSN1ObjectIdentifier22 = new ASN1ObjectIdentifier(StubApp.getString2(27578));
        COUNTRY_OF_CITIZENSHIP = aSN1ObjectIdentifier22;
        ASN1ObjectIdentifier aSN1ObjectIdentifier23 = new ASN1ObjectIdentifier(StubApp.getString2(27579));
        COUNTRY_OF_RESIDENCE = aSN1ObjectIdentifier23;
        ASN1ObjectIdentifier aSN1ObjectIdentifier24 = new ASN1ObjectIdentifier(StubApp.getString2(27580));
        NAME_AT_BIRTH = aSN1ObjectIdentifier24;
        ASN1ObjectIdentifier aSN1ObjectIdentifier25 = new ASN1ObjectIdentifier(StubApp.getString2(27581));
        POSTAL_ADDRESS = aSN1ObjectIdentifier25;
        DMD_NAME = new ASN1ObjectIdentifier(StubApp.getString2(27582));
        ASN1ObjectIdentifier aSN1ObjectIdentifier26 = X509ObjectIdentifiers.id_at_telephoneNumber;
        TELEPHONE_NUMBER = aSN1ObjectIdentifier26;
        ASN1ObjectIdentifier aSN1ObjectIdentifier27 = X509ObjectIdentifiers.id_at_name;
        NAME = aSN1ObjectIdentifier27;
        ASN1ObjectIdentifier aSN1ObjectIdentifier28 = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        EmailAddress = aSN1ObjectIdentifier28;
        ASN1ObjectIdentifier aSN1ObjectIdentifier29 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredName = aSN1ObjectIdentifier29;
        ASN1ObjectIdentifier aSN1ObjectIdentifier30 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        UnstructuredAddress = aSN1ObjectIdentifier30;
        f18706E = aSN1ObjectIdentifier28;
        ASN1ObjectIdentifier aSN1ObjectIdentifier31 = new ASN1ObjectIdentifier(StubApp.getString2(27583));
        DC = aSN1ObjectIdentifier31;
        ASN1ObjectIdentifier aSN1ObjectIdentifier32 = new ASN1ObjectIdentifier(StubApp.getString2(27584));
        UID = aSN1ObjectIdentifier32;
        DefaultReverse = false;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        RFC2253Symbols = hashtable2;
        Hashtable hashtable3 = new Hashtable();
        RFC1779Symbols = hashtable3;
        Hashtable hashtable4 = new Hashtable();
        DefaultLookUp = hashtable4;
        OIDLookUp = hashtable;
        SymbolLookUp = hashtable4;
        TRUE = new Boolean(true);
        FALSE = new Boolean(false);
        String string2 = StubApp.getString2(4907);
        hashtable.put(aSN1ObjectIdentifier, string2);
        String string22 = StubApp.getString2(4919);
        hashtable.put(aSN1ObjectIdentifier2, string22);
        hashtable.put(aSN1ObjectIdentifier4, StubApp.getString2(4923));
        String string23 = StubApp.getString2(27585);
        hashtable.put(aSN1ObjectIdentifier3, string23);
        String string24 = StubApp.getString2(4722);
        hashtable.put(aSN1ObjectIdentifier5, string24);
        String string25 = StubApp.getString2(4916);
        hashtable.put(aSN1ObjectIdentifier8, string25);
        String string26 = StubApp.getString2(4568);
        hashtable.put(aSN1ObjectIdentifier9, string26);
        hashtable.put(aSN1ObjectIdentifier6, StubApp.getString2(27586));
        hashtable.put(aSN1ObjectIdentifier28, StubApp.getString2(4909));
        String string27 = StubApp.getString2(27587);
        hashtable.put(aSN1ObjectIdentifier31, string27);
        String string28 = StubApp.getString2(27588);
        hashtable.put(aSN1ObjectIdentifier32, string28);
        String string29 = StubApp.getString2(27589);
        hashtable.put(aSN1ObjectIdentifier7, string29);
        hashtable.put(aSN1ObjectIdentifier10, StubApp.getString2(27590));
        hashtable.put(aSN1ObjectIdentifier11, StubApp.getString2(27591));
        hashtable.put(aSN1ObjectIdentifier12, StubApp.getString2(27592));
        hashtable.put(aSN1ObjectIdentifier13, StubApp.getString2(27593));
        hashtable.put(aSN1ObjectIdentifier30, StubApp.getString2(27595));
        hashtable.put(aSN1ObjectIdentifier29, StubApp.getString2(27596));
        hashtable.put(aSN1ObjectIdentifier14, StubApp.getString2(27597));
        hashtable.put(aSN1ObjectIdentifier17, StubApp.getString2(27598));
        hashtable.put(aSN1ObjectIdentifier18, StubApp.getString2(27599));
        hashtable.put(aSN1ObjectIdentifier25, StubApp.getString2(27600));
        hashtable.put(aSN1ObjectIdentifier24, StubApp.getString2(27601));
        hashtable.put(aSN1ObjectIdentifier22, StubApp.getString2(27602));
        hashtable.put(aSN1ObjectIdentifier23, StubApp.getString2(27603));
        hashtable.put(aSN1ObjectIdentifier21, StubApp.getString2(15987));
        hashtable.put(aSN1ObjectIdentifier20, StubApp.getString2(27604));
        hashtable.put(aSN1ObjectIdentifier19, StubApp.getString2(27605));
        hashtable.put(aSN1ObjectIdentifier16, StubApp.getString2(27606));
        hashtable.put(aSN1ObjectIdentifier15, StubApp.getString2(27607));
        hashtable.put(aSN1ObjectIdentifier26, StubApp.getString2(27608));
        hashtable.put(aSN1ObjectIdentifier27, StubApp.getString2(3222));
        hashtable2.put(aSN1ObjectIdentifier, string2);
        hashtable2.put(aSN1ObjectIdentifier2, string22);
        hashtable2.put(aSN1ObjectIdentifier3, string23);
        hashtable2.put(aSN1ObjectIdentifier5, string24);
        hashtable2.put(aSN1ObjectIdentifier8, string25);
        hashtable2.put(aSN1ObjectIdentifier9, string26);
        hashtable2.put(aSN1ObjectIdentifier7, string29);
        hashtable2.put(aSN1ObjectIdentifier31, string27);
        hashtable2.put(aSN1ObjectIdentifier32, string28);
        hashtable3.put(aSN1ObjectIdentifier, string2);
        hashtable3.put(aSN1ObjectIdentifier2, string22);
        hashtable3.put(aSN1ObjectIdentifier3, string23);
        hashtable3.put(aSN1ObjectIdentifier5, string24);
        hashtable3.put(aSN1ObjectIdentifier8, string25);
        hashtable3.put(aSN1ObjectIdentifier9, string26);
        hashtable3.put(aSN1ObjectIdentifier7, string29);
        hashtable4.put(StubApp.getString2(2376), aSN1ObjectIdentifier);
        hashtable4.put(StubApp.getString2(2373), aSN1ObjectIdentifier2);
        hashtable4.put(StubApp.getString2(1310), aSN1ObjectIdentifier4);
        hashtable4.put(StubApp.getString2(25269), aSN1ObjectIdentifier3);
        hashtable4.put(StubApp.getString2(27610), aSN1ObjectIdentifier5);
        hashtable4.put(StubApp.getString2(1314), aSN1ObjectIdentifier8);
        hashtable4.put(StubApp.getString2(24035), aSN1ObjectIdentifier9);
        hashtable4.put(StubApp.getString2(11244), aSN1ObjectIdentifier6);
        hashtable4.put(StubApp.getString2(27611), aSN1ObjectIdentifier6);
        hashtable4.put(StubApp.getString2(2050), aSN1ObjectIdentifier7);
        hashtable4.put(StubApp.getString2(27612), aSN1ObjectIdentifier28);
        hashtable4.put(StubApp.getString2(27613), aSN1ObjectIdentifier31);
        hashtable4.put(StubApp.getString2(1958), aSN1ObjectIdentifier28);
        hashtable4.put(StubApp.getString2(27614), aSN1ObjectIdentifier32);
        hashtable4.put(StubApp.getString2(27615), aSN1ObjectIdentifier10);
        hashtable4.put(StubApp.getString2(27616), aSN1ObjectIdentifier11);
        hashtable4.put(StubApp.getString2(27617), aSN1ObjectIdentifier12);
        hashtable4.put(StubApp.getString2(27618), aSN1ObjectIdentifier13);
        hashtable4.put(StubApp.getString2(27619), aSN1ObjectIdentifier30);
        hashtable4.put(StubApp.getString2(27620), aSN1ObjectIdentifier29);
        hashtable4.put(StubApp.getString2(27621), aSN1ObjectIdentifier14);
        hashtable4.put(StubApp.getString2(27622), aSN1ObjectIdentifier17);
        hashtable4.put(StubApp.getString2(27623), aSN1ObjectIdentifier18);
        hashtable4.put(StubApp.getString2(27624), aSN1ObjectIdentifier25);
        hashtable4.put(StubApp.getString2(27857), aSN1ObjectIdentifier24);
        hashtable4.put(StubApp.getString2(27626), aSN1ObjectIdentifier22);
        hashtable4.put(StubApp.getString2(27627), aSN1ObjectIdentifier23);
        hashtable4.put(StubApp.getString2(17903), aSN1ObjectIdentifier21);
        hashtable4.put(StubApp.getString2(27628), aSN1ObjectIdentifier20);
        hashtable4.put(StubApp.getString2(27629), aSN1ObjectIdentifier19);
        hashtable4.put(StubApp.getString2(27630), aSN1ObjectIdentifier16);
        hashtable4.put(StubApp.getString2(27631), aSN1ObjectIdentifier15);
        hashtable4.put(StubApp.getString2(27632), aSN1ObjectIdentifier26);
        hashtable4.put(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), aSN1ObjectIdentifier27);
    }

    public X509Name() {
        this.converter = null;
        this.ordering = new Vector();
        this.values = new Vector();
        this.added = new Vector();
    }

    private void addEntry(Hashtable hashtable, String str, Boolean bool) {
        X509NameTokenizer x509NameTokenizer = new X509NameTokenizer(str, '=');
        String nextToken = x509NameTokenizer.nextToken();
        if (!x509NameTokenizer.hasMoreTokens()) {
            throw new IllegalArgumentException(StubApp.getString2(27638));
        }
        String nextToken2 = x509NameTokenizer.nextToken();
        this.ordering.addElement(decodeOID(nextToken, hashtable));
        this.values.addElement(unescape(nextToken2));
        this.added.addElement(bool);
    }

    private void appendValue(StringBuffer stringBuffer, Hashtable hashtable, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        String string2;
        String str2 = (String) hashtable.get(aSN1ObjectIdentifier);
        if (str2 == null) {
            str2 = aSN1ObjectIdentifier.getId();
        }
        stringBuffer.append(str2);
        stringBuffer.append('=');
        int length = stringBuffer.length();
        stringBuffer.append(str);
        int length2 = stringBuffer.length();
        if (str.length() >= 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
            length += 2;
        }
        while (true) {
            string2 = StubApp.getString2(639);
            if (length >= length2 || stringBuffer.charAt(length) != ' ') {
                break;
            }
            stringBuffer.insert(length, string2);
            length += 2;
            length2++;
        }
        while (true) {
            length2--;
            if (length2 <= length || stringBuffer.charAt(length2) != ' ') {
                break;
            } else {
                stringBuffer.insert(length2, '\\');
            }
        }
        while (length <= length2) {
            char charAt = stringBuffer.charAt(length);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        length++;
                        break;
                }
            }
            stringBuffer.insert(length, string2);
            length += 2;
            length2++;
        }
    }

    private String bytesToString(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i3 = 0; i3 != length; i3++) {
            cArr[i3] = (char) (bArr[i3] & UByte.MAX_VALUE);
        }
        return new String(cArr);
    }

    private String canonicalize(String str) {
        String lowerCase = Strings.toLowerCase(str.trim());
        if (lowerCase.length() <= 0 || lowerCase.charAt(0) != '#') {
            return lowerCase;
        }
        ASN1Encodable decodeObject = decodeObject(lowerCase);
        return decodeObject instanceof ASN1String ? Strings.toLowerCase(((ASN1String) decodeObject).getString().trim()) : lowerCase;
    }

    private ASN1ObjectIdentifier decodeOID(String str, Hashtable hashtable) {
        String trim = str.trim();
        if (Strings.toUpperCase(trim).startsWith(StubApp.getString2(27634))) {
            return new ASN1ObjectIdentifier(trim.substring(4));
        }
        if (trim.charAt(0) >= '0' && trim.charAt(0) <= '9') {
            return new ASN1ObjectIdentifier(trim);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) hashtable.get(Strings.toLowerCase(trim));
        if (aSN1ObjectIdentifier != null) {
            return aSN1ObjectIdentifier;
        }
        throw new IllegalArgumentException(a.k(StubApp.getString2(27635), trim, StubApp.getString2(27636)));
    }

    private ASN1Primitive decodeObject(String str) {
        try {
            return ASN1Primitive.fromByteArray(Hex.decodeStrict(str, 1, str.length() - 1));
        } catch (IOException e10) {
            throw new IllegalStateException(b.h(StubApp.getString2(27637), e10));
        }
    }

    private boolean equivalentStrings(String str, String str2) {
        String canonicalize = canonicalize(str);
        String canonicalize2 = canonicalize(str2);
        return canonicalize.equals(canonicalize2) || stripInternalSpaces(canonicalize).equals(stripInternalSpaces(canonicalize2));
    }

    public static X509Name getInstance(Object obj) {
        if (obj instanceof X509Name) {
            return (X509Name) obj;
        }
        if (obj instanceof X500Name) {
            return new X509Name(ASN1Sequence.getInstance(((X500Name) obj).toASN1Primitive()));
        }
        if (obj != null) {
            return new X509Name(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private String stripInternalSpaces(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            stringBuffer.append(charAt);
            int i3 = 1;
            while (i3 < str.length()) {
                char charAt2 = str.charAt(i3);
                if (charAt != ' ' || charAt2 != ' ') {
                    stringBuffer.append(charAt2);
                }
                i3++;
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    private String unescape(String str) {
        int i3;
        if (str.length() == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (charArray[0] == '\\' && charArray[1] == '#') {
            stringBuffer.append(StubApp.getString2(27639));
            i3 = 2;
        } else {
            i3 = 0;
        }
        boolean z2 = false;
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = false;
        while (i3 != charArray.length) {
            char c10 = charArray[i3];
            if (c10 != ' ') {
                z11 = true;
            }
            if (c10 != '\"') {
                if (c10 == '\\' && !z2 && !z10) {
                    i10 = stringBuffer.length();
                    z2 = true;
                } else if (c10 == ' ' && !z2 && !z11) {
                }
                i3++;
            } else if (!z2) {
                z10 = !z10;
                z2 = false;
                i3++;
            }
            stringBuffer.append(c10);
            z2 = false;
            i3++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i10 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        r3[r9] = true;
        r4 = r4 + r6;
     */
    @Override // org.bouncycastle.asn1.ASN1Object
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 1
            if (r12 != r11) goto L4
            return r0
        L4:
            boolean r1 = r12 instanceof org.bouncycastle.asn1.x509.X509Name
            r2 = 0
            if (r1 != 0) goto Le
            boolean r1 = r12 instanceof org.bouncycastle.asn1.ASN1Sequence
            if (r1 != 0) goto Le
            return r2
        Le:
            r1 = r12
            org.bouncycastle.asn1.ASN1Encodable r1 = (org.bouncycastle.asn1.ASN1Encodable) r1
            org.bouncycastle.asn1.ASN1Primitive r1 = r1.toASN1Primitive()
            org.bouncycastle.asn1.ASN1Primitive r3 = r11.toASN1Primitive()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L20
            return r0
        L20:
            org.bouncycastle.asn1.x509.X509Name r12 = getInstance(r12)     // Catch: java.lang.IllegalArgumentException -> L8e
            java.util.Vector r1 = r11.ordering
            int r1 = r1.size()
            java.util.Vector r3 = r12.ordering
            int r3 = r3.size()
            if (r1 == r3) goto L33
            return r2
        L33:
            boolean[] r3 = new boolean[r1]
            java.util.Vector r4 = r11.ordering
            java.lang.Object r4 = r4.elementAt(r2)
            java.util.Vector r5 = r12.ordering
            java.lang.Object r5 = r5.elementAt(r2)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L4b
            r6 = r0
            r5 = r1
            r4 = r2
            goto L4f
        L4b:
            int r4 = r1 + (-1)
            r5 = -1
            r6 = r5
        L4f:
            if (r4 == r5) goto L8d
            java.util.Vector r7 = r11.ordering
            java.lang.Object r7 = r7.elementAt(r4)
            org.bouncycastle.asn1.ASN1ObjectIdentifier r7 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) r7
            java.util.Vector r8 = r11.values
            java.lang.Object r8 = r8.elementAt(r4)
            java.lang.String r8 = (java.lang.String) r8
            r9 = r2
        L62:
            if (r9 >= r1) goto L8c
            boolean r10 = r3[r9]
            if (r10 == 0) goto L69
            goto L89
        L69:
            java.util.Vector r10 = r12.ordering
            java.lang.Object r10 = r10.elementAt(r9)
            org.bouncycastle.asn1.ASN1ObjectIdentifier r10 = (org.bouncycastle.asn1.ASN1ObjectIdentifier) r10
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L89
            java.util.Vector r10 = r12.values
            java.lang.Object r10 = r10.elementAt(r9)
            java.lang.String r10 = (java.lang.String) r10
            boolean r10 = r11.equivalentStrings(r8, r10)
            if (r10 == 0) goto L89
            r3[r9] = r0
            int r4 = r4 + r6
            goto L4f
        L89:
            int r9 = r9 + 1
            goto L62
        L8c:
            return r2
        L8d:
            return r0
        L8e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.asn1.x509.X509Name.equals(java.lang.Object):boolean");
    }

    public Vector getOIDs() {
        Vector vector = new Vector();
        for (int i3 = 0; i3 != this.ordering.size(); i3++) {
            vector.addElement(this.ordering.elementAt(i3));
        }
        return vector;
    }

    public Vector getValues() {
        Vector vector = new Vector();
        for (int i3 = 0; i3 != this.values.size(); i3++) {
            vector.addElement(this.values.elementAt(i3));
        }
        return vector;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        if (this.isHashCodeCalculated) {
            return this.hashCodeValue;
        }
        this.isHashCodeCalculated = true;
        for (int i3 = 0; i3 != this.ordering.size(); i3++) {
            String stripInternalSpaces = stripInternalSpaces(canonicalize((String) this.values.elementAt(i3)));
            int hashCode = this.hashCodeValue ^ this.ordering.elementAt(i3).hashCode();
            this.hashCodeValue = hashCode;
            this.hashCodeValue = stripInternalSpaces.hashCode() ^ hashCode;
        }
        return this.hashCodeValue;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        DERSequence dERSequence;
        if (this.seq == null) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = null;
            int i3 = 0;
            while (i3 != this.ordering.size()) {
                ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector(2);
                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) this.ordering.elementAt(i3);
                aSN1EncodableVector3.add(aSN1ObjectIdentifier2);
                aSN1EncodableVector3.add(this.converter.getConvertedValue(aSN1ObjectIdentifier2, (String) this.values.elementAt(i3)));
                if (aSN1ObjectIdentifier == null || ((Boolean) this.added.elementAt(i3)).booleanValue()) {
                    dERSequence = new DERSequence(aSN1EncodableVector3);
                } else {
                    aSN1EncodableVector.add(new DERSet(aSN1EncodableVector2));
                    aSN1EncodableVector2 = new ASN1EncodableVector();
                    dERSequence = new DERSequence(aSN1EncodableVector3);
                }
                aSN1EncodableVector2.add(dERSequence);
                i3++;
                aSN1ObjectIdentifier = aSN1ObjectIdentifier2;
            }
            aSN1EncodableVector.add(new DERSet(aSN1EncodableVector2));
            this.seq = new DERSequence(aSN1EncodableVector);
        }
        return this.seq;
    }

    public String toString() {
        return toString(DefaultReverse, DefaultSymbols);
    }

    public X509Name(String str) {
        this(DefaultReverse, DefaultLookUp, str);
    }

    public static X509Name getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z2) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z2));
    }

    public boolean equals(Object obj, boolean z2) {
        if (!z2) {
            return equals(obj);
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X509Name) && !(obj instanceof ASN1Sequence)) {
            return false;
        }
        if (toASN1Primitive().equals(((ASN1Encodable) obj).toASN1Primitive())) {
            return true;
        }
        try {
            X509Name x509Name = getInstance(obj);
            int size = this.ordering.size();
            if (size != x509Name.ordering.size()) {
                return false;
            }
            for (int i3 = 0; i3 < size; i3++) {
                if (!((ASN1ObjectIdentifier) this.ordering.elementAt(i3)).equals((ASN1Primitive) x509Name.ordering.elementAt(i3)) || !equivalentStrings((String) this.values.elementAt(i3), (String) x509Name.values.elementAt(i3))) {
                    return false;
                }
            }
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public Vector getValues(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        Vector vector = new Vector();
        for (int i3 = 0; i3 != this.values.size(); i3++) {
            if (this.ordering.elementAt(i3).equals(aSN1ObjectIdentifier)) {
                String str = (String) this.values.elementAt(i3);
                if (str.length() > 2 && str.charAt(0) == '\\' && str.charAt(1) == '#') {
                    str = str.substring(1);
                }
                vector.addElement(str);
            }
        }
        return vector;
    }

    public String toString(boolean z2, Hashtable hashtable) {
        StringBuffer stringBuffer = new StringBuffer();
        Vector vector = new Vector();
        StringBuffer stringBuffer2 = null;
        for (int i3 = 0; i3 < this.ordering.size(); i3++) {
            if (((Boolean) this.added.elementAt(i3)).booleanValue()) {
                stringBuffer2.append('+');
                appendValue(stringBuffer2, hashtable, (ASN1ObjectIdentifier) this.ordering.elementAt(i3), (String) this.values.elementAt(i3));
            } else {
                stringBuffer2 = new StringBuffer();
                appendValue(stringBuffer2, hashtable, (ASN1ObjectIdentifier) this.ordering.elementAt(i3), (String) this.values.elementAt(i3));
                vector.addElement(stringBuffer2);
            }
        }
        boolean z10 = true;
        if (z2) {
            for (int size = vector.size() - 1; size >= 0; size--) {
                if (z10) {
                    z10 = false;
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append(vector.elementAt(size).toString());
            }
        } else {
            for (int i10 = 0; i10 < vector.size(); i10++) {
                if (z10) {
                    z10 = false;
                } else {
                    stringBuffer.append(',');
                }
                stringBuffer.append(vector.elementAt(i10).toString());
            }
        }
        return stringBuffer.toString();
    }

    public X509Name(String str, X509NameEntryConverter x509NameEntryConverter) {
        this(DefaultReverse, DefaultLookUp, str, x509NameEntryConverter);
    }

    public X509Name(Hashtable hashtable) {
        this((Vector) null, hashtable);
    }

    public X509Name(Vector vector, Hashtable hashtable) {
        this(vector, hashtable, new X509DefaultEntryConverter());
    }

    public X509Name(Vector vector, Hashtable hashtable, X509NameEntryConverter x509NameEntryConverter) {
        this.converter = null;
        this.ordering = new Vector();
        this.values = new Vector();
        this.added = new Vector();
        this.converter = x509NameEntryConverter;
        if (vector != null) {
            for (int i3 = 0; i3 != vector.size(); i3++) {
                this.ordering.addElement(vector.elementAt(i3));
                this.added.addElement(FALSE);
            }
        } else {
            Enumeration keys = hashtable.keys();
            while (keys.hasMoreElements()) {
                this.ordering.addElement(keys.nextElement());
                this.added.addElement(FALSE);
            }
        }
        for (int i10 = 0; i10 != this.ordering.size(); i10++) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) this.ordering.elementAt(i10);
            if (hashtable.get(aSN1ObjectIdentifier) == null) {
                throw new IllegalArgumentException(StubApp.getString2(27858) + aSN1ObjectIdentifier.getId() + StubApp.getString2(27636));
            }
            this.values.addElement(hashtable.get(aSN1ObjectIdentifier));
        }
    }

    public X509Name(Vector vector, Vector vector2) {
        this(vector, vector2, new X509DefaultEntryConverter());
    }

    public X509Name(Vector vector, Vector vector2, X509NameEntryConverter x509NameEntryConverter) {
        this.converter = null;
        this.ordering = new Vector();
        this.values = new Vector();
        this.added = new Vector();
        this.converter = x509NameEntryConverter;
        if (vector.size() != vector2.size()) {
            throw new IllegalArgumentException(StubApp.getString2(27859));
        }
        for (int i3 = 0; i3 < vector.size(); i3++) {
            this.ordering.addElement(vector.elementAt(i3));
            this.values.addElement(vector2.elementAt(i3));
            this.added.addElement(FALSE);
        }
    }

    public X509Name(ASN1Sequence aSN1Sequence) {
        Vector vector;
        this.converter = null;
        this.ordering = new Vector();
        this.values = new Vector();
        this.added = new Vector();
        this.seq = aSN1Sequence;
        Enumeration objects = aSN1Sequence.getObjects();
        while (objects.hasMoreElements()) {
            ASN1Set aSN1Set = ASN1Set.getInstance(((ASN1Encodable) objects.nextElement()).toASN1Primitive());
            int i3 = 0;
            while (i3 < aSN1Set.size()) {
                ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(aSN1Set.getObjectAt(i3).toASN1Primitive());
                if (aSN1Sequence2.size() != 2) {
                    throw new IllegalArgumentException(StubApp.getString2(27861));
                }
                this.ordering.addElement(ASN1ObjectIdentifier.getInstance(aSN1Sequence2.getObjectAt(0)));
                ASN1Encodable objectAt = aSN1Sequence2.getObjectAt(1);
                if (!(objectAt instanceof ASN1String) || (objectAt instanceof ASN1UniversalString)) {
                    try {
                        this.values.addElement(StubApp.getString2("919") + bytesToString(Hex.encode(objectAt.toASN1Primitive().getEncoded(StubApp.getString2("26791")))));
                    } catch (IOException unused) {
                        throw new IllegalArgumentException(StubApp.getString2(27860));
                    }
                } else {
                    String string = ((ASN1String) objectAt).getString();
                    if (string.length() <= 0 || string.charAt(0) != '#') {
                        vector = this.values;
                    } else {
                        vector = this.values;
                        string = StubApp.getString2(639).concat(string);
                    }
                    vector.addElement(string);
                }
                this.added.addElement(i3 != 0 ? TRUE : FALSE);
                i3++;
            }
        }
    }

    public X509Name(boolean z2, String str) {
        this(z2, DefaultLookUp, str);
    }

    public X509Name(boolean z2, String str, X509NameEntryConverter x509NameEntryConverter) {
        this(z2, DefaultLookUp, str, x509NameEntryConverter);
    }

    public X509Name(boolean z2, Hashtable hashtable, String str) {
        this(z2, hashtable, str, new X509DefaultEntryConverter());
    }

    public X509Name(boolean z2, Hashtable hashtable, String str, X509NameEntryConverter x509NameEntryConverter) {
        this.converter = null;
        this.ordering = new Vector();
        this.values = new Vector();
        this.added = new Vector();
        this.converter = x509NameEntryConverter;
        X509NameTokenizer x509NameTokenizer = new X509NameTokenizer(str);
        while (x509NameTokenizer.hasMoreTokens()) {
            String nextToken = x509NameTokenizer.nextToken();
            if (nextToken.indexOf(43) > 0) {
                X509NameTokenizer x509NameTokenizer2 = new X509NameTokenizer(nextToken, '+');
                String nextToken2 = x509NameTokenizer2.nextToken();
                Boolean bool = FALSE;
                while (true) {
                    addEntry(hashtable, nextToken2, bool);
                    if (x509NameTokenizer2.hasMoreTokens()) {
                        nextToken2 = x509NameTokenizer2.nextToken();
                        bool = TRUE;
                    }
                }
            } else {
                addEntry(hashtable, nextToken, FALSE);
            }
        }
        if (z2) {
            Vector vector = new Vector();
            Vector vector2 = new Vector();
            Vector vector3 = new Vector();
            int i3 = 1;
            for (int i10 = 0; i10 < this.ordering.size(); i10++) {
                if (((Boolean) this.added.elementAt(i10)).booleanValue()) {
                    vector.insertElementAt(this.ordering.elementAt(i10), i3);
                    vector2.insertElementAt(this.values.elementAt(i10), i3);
                    vector3.insertElementAt(this.added.elementAt(i10), i3);
                    i3++;
                } else {
                    vector.insertElementAt(this.ordering.elementAt(i10), 0);
                    vector2.insertElementAt(this.values.elementAt(i10), 0);
                    vector3.insertElementAt(this.added.elementAt(i10), 0);
                    i3 = 1;
                }
            }
            this.ordering = vector;
            this.values = vector2;
            this.added = vector3;
        }
    }
}
