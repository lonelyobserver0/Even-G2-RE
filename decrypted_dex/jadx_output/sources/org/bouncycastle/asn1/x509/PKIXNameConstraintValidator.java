package org.bouncycastle.asn1.x509;

import com.stub.StubApp;
import i2.u;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.UByte;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.style.IETFUtils;
import org.bouncycastle.asn1.x500.style.RFC4519Style;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class PKIXNameConstraintValidator implements NameConstraintValidator {
    private Set permittedSubtreesDN;
    private Set permittedSubtreesDNS;
    private Set permittedSubtreesEmail;
    private Set permittedSubtreesIP;
    private Set permittedSubtreesOtherName;
    private Set permittedSubtreesURI;
    private Set excludedSubtreesDN = new HashSet();
    private Set excludedSubtreesDNS = new HashSet();
    private Set excludedSubtreesEmail = new HashSet();
    private Set excludedSubtreesURI = new HashSet();
    private Set excludedSubtreesIP = new HashSet();
    private Set excludedSubtreesOtherName = new HashSet();

    private final void addLine(StringBuilder sb2, String str) {
        sb2.append(str);
        sb2.append(Strings.lineSeparator());
    }

    private void checkExcludedDN(Set set, ASN1Sequence aSN1Sequence) throws NameConstraintValidatorException {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (withinDNSubtree(aSN1Sequence, (ASN1Sequence) it.next())) {
                throw new NameConstraintValidatorException(StubApp.getString2(27815));
            }
        }
    }

    private void checkExcludedDNS(Set set, String str) throws NameConstraintValidatorException {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (withinDomain(str, str2) || str.equalsIgnoreCase(str2)) {
                throw new NameConstraintValidatorException(StubApp.getString2(27816));
            }
        }
    }

    private void checkExcludedEmail(Set set, String str) throws NameConstraintValidatorException {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (emailIsConstrained(str, (String) it.next())) {
                throw new NameConstraintValidatorException(StubApp.getString2(27817));
            }
        }
    }

    private void checkExcludedIP(Set set, byte[] bArr) throws NameConstraintValidatorException {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (isIPConstrained(bArr, (byte[]) it.next())) {
                throw new NameConstraintValidatorException(StubApp.getString2(27818));
            }
        }
    }

    private void checkExcludedOtherName(Set set, OtherName otherName) throws NameConstraintValidatorException {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (otherNameIsConstrained(otherName, OtherName.getInstance(it.next()))) {
                throw new NameConstraintValidatorException(StubApp.getString2(27819));
            }
        }
    }

    private void checkExcludedURI(Set set, String str) throws NameConstraintValidatorException {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (isUriConstrained(str, (String) it.next())) {
                throw new NameConstraintValidatorException(StubApp.getString2(27820));
            }
        }
    }

    private void checkPermittedDN(Set set, ASN1Sequence aSN1Sequence) throws NameConstraintValidatorException {
        if (set == null) {
            return;
        }
        if (set.isEmpty() && aSN1Sequence.size() == 0) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (withinDNSubtree(aSN1Sequence, (ASN1Sequence) it.next())) {
                return;
            }
        }
        throw new NameConstraintValidatorException(StubApp.getString2(27821));
    }

    private void checkPermittedDNS(Set set, String str) throws NameConstraintValidatorException {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (withinDomain(str, str2) || str.equalsIgnoreCase(str2)) {
                return;
            }
        }
        if (str.length() != 0 || set.size() != 0) {
            throw new NameConstraintValidatorException(StubApp.getString2(27822));
        }
    }

    private void checkPermittedEmail(Set set, String str) throws NameConstraintValidatorException {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (emailIsConstrained(str, (String) it.next())) {
                return;
            }
        }
        if (str.length() != 0 || set.size() != 0) {
            throw new NameConstraintValidatorException(StubApp.getString2(27823));
        }
    }

    private void checkPermittedIP(Set set, byte[] bArr) throws NameConstraintValidatorException {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (isIPConstrained(bArr, (byte[]) it.next())) {
                return;
            }
        }
        if (bArr.length != 0 || set.size() != 0) {
            throw new NameConstraintValidatorException(StubApp.getString2(27824));
        }
    }

    private void checkPermittedOtherName(Set set, OtherName otherName) throws NameConstraintValidatorException {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (otherNameIsConstrained(otherName, OtherName.getInstance(it.next()))) {
                return;
            }
        }
        throw new NameConstraintValidatorException(StubApp.getString2(27825));
    }

    private void checkPermittedURI(Set set, String str) throws NameConstraintValidatorException {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (isUriConstrained(str, (String) it.next())) {
                return;
            }
        }
        if (str.length() != 0 || set.size() != 0) {
            throw new NameConstraintValidatorException(StubApp.getString2(27826));
        }
    }

    private boolean collectionsAreEqual(Collection collection, Collection collection2) {
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        for (Object obj : collection) {
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                if (equals(obj, it.next())) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    private static int compareTo(byte[] bArr, byte[] bArr2) {
        if (Arrays.areEqual(bArr, bArr2)) {
            return 0;
        }
        return Arrays.areEqual(max(bArr, bArr2), bArr) ? 1 : -1;
    }

    private boolean emailIsConstrained(String str, String str2) {
        String substring = str.substring(str.indexOf(64) + 1);
        if (str2.indexOf(64) != -1) {
            if (str.equalsIgnoreCase(str2) || substring.equalsIgnoreCase(str2.substring(1))) {
                return true;
            }
        } else if (str2.charAt(0) != '.') {
            if (substring.equalsIgnoreCase(str2)) {
                return true;
            }
        } else if (withinDomain(substring, str2)) {
            return true;
        }
        return false;
    }

    private static String extractHostFromURL(String str) {
        String substring = str.substring(str.indexOf(58) + 1);
        String string2 = StubApp.getString2(5146);
        if (substring.indexOf(string2) != -1) {
            substring = substring.substring(substring.indexOf(string2) + 2);
        }
        if (substring.lastIndexOf(58) != -1) {
            substring = substring.substring(0, substring.lastIndexOf(58));
        }
        String substring2 = substring.substring(substring.indexOf(58) + 1);
        String substring3 = substring2.substring(substring2.indexOf(64) + 1);
        return substring3.indexOf(47) != -1 ? substring3.substring(0, substring3.indexOf(47)) : substring3;
    }

    private byte[][] extractIPsAndSubnetMasks(byte[] bArr, byte[] bArr2) {
        int length = bArr.length / 2;
        byte[] bArr3 = new byte[length];
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr, length, bArr4, 0, length);
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, length);
        System.arraycopy(bArr2, length, bArr6, 0, length);
        return new byte[][]{bArr3, bArr4, bArr5, bArr6};
    }

    private String extractNameAsString(GeneralName generalName) {
        return ASN1IA5String.getInstance(generalName.getName()).getString();
    }

    private int hashCollection(Collection collection) {
        int i3 = 0;
        if (collection == null) {
            return 0;
        }
        for (Object obj : collection) {
            i3 = (obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj.hashCode()) + i3;
        }
        return i3;
    }

    private Set intersectDN(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(((GeneralSubtree) it.next()).getBase().getName().toASN1Primitive());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    ASN1Sequence aSN1Sequence2 = (ASN1Sequence) it2.next();
                    if (withinDNSubtree(aSN1Sequence, aSN1Sequence2)) {
                        hashSet.add(aSN1Sequence);
                    } else if (withinDNSubtree(aSN1Sequence2, aSN1Sequence)) {
                        hashSet.add(aSN1Sequence2);
                    }
                }
            } else if (aSN1Sequence != null) {
                hashSet.add(aSN1Sequence);
            }
        }
        return hashSet;
    }

    private Set intersectDNS(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String extractNameAsString = extractNameAsString(((GeneralSubtree) it.next()).getBase());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (withinDomain(str, extractNameAsString)) {
                        hashSet.add(str);
                    } else if (withinDomain(extractNameAsString, str)) {
                        hashSet.add(extractNameAsString);
                    }
                }
            } else if (extractNameAsString != null) {
                hashSet.add(extractNameAsString);
            }
        }
        return hashSet;
    }

    private Set intersectEmail(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String extractNameAsString = extractNameAsString(((GeneralSubtree) it.next()).getBase());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    intersectEmail(extractNameAsString, (String) it2.next(), hashSet);
                }
            } else if (extractNameAsString != null) {
                hashSet.add(extractNameAsString);
            }
        }
        return hashSet;
    }

    private Set intersectIP(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            byte[] octets = ASN1OctetString.getInstance(((GeneralSubtree) it.next()).getBase().getName()).getOctets();
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    hashSet.addAll(intersectIPRange((byte[]) it2.next(), octets));
                }
            } else if (octets != null) {
                hashSet.add(octets);
            }
        }
        return hashSet;
    }

    private Set intersectIPRange(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return Collections.EMPTY_SET;
        }
        byte[][] extractIPsAndSubnetMasks = extractIPsAndSubnetMasks(bArr, bArr2);
        byte[] bArr3 = extractIPsAndSubnetMasks[0];
        byte[] bArr4 = extractIPsAndSubnetMasks[1];
        byte[] bArr5 = extractIPsAndSubnetMasks[2];
        byte[] bArr6 = extractIPsAndSubnetMasks[3];
        byte[][] minMaxIPs = minMaxIPs(bArr3, bArr4, bArr5, bArr6);
        return compareTo(max(minMaxIPs[0], minMaxIPs[2]), min(minMaxIPs[1], minMaxIPs[3])) == 1 ? Collections.EMPTY_SET : Collections.singleton(ipWithSubnetMask(or(minMaxIPs[0], minMaxIPs[2]), or(bArr4, bArr6)));
    }

    private Set intersectOtherName(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            OtherName otherName = OtherName.getInstance(((GeneralSubtree) it.next()).getBase().getName());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    intersectOtherName(otherName, OtherName.getInstance(it2.next()), hashSet);
                }
            } else if (otherName != null) {
                hashSet.add(otherName);
            }
        }
        return hashSet;
    }

    private Set intersectURI(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String extractNameAsString = extractNameAsString(((GeneralSubtree) it.next()).getBase());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    intersectURI((String) it2.next(), extractNameAsString, hashSet);
                }
            } else if (extractNameAsString != null) {
                hashSet.add(extractNameAsString);
            }
        }
        return hashSet;
    }

    private byte[] ipWithSubnetMask(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length * 2];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length);
        return bArr3;
    }

    private boolean isIPConstrained(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length / 2) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            bArr4[i3] = (byte) (bArr2[i3] & bArr3[i3]);
            bArr5[i3] = (byte) (bArr[i3] & bArr3[i3]);
        }
        return Arrays.areEqual(bArr4, bArr5);
    }

    private boolean isUriConstrained(String str, String str2) {
        String extractHostFromURL = extractHostFromURL(str);
        return !str2.startsWith(StubApp.getString2(1)) ? extractHostFromURL.equalsIgnoreCase(str2) : withinDomain(extractHostFromURL, str2);
    }

    private static byte[] max(byte[] bArr, byte[] bArr2) {
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if ((bArr[i3] & UByte.MAX_VALUE) > (65535 & bArr2[i3])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private static byte[] min(byte[] bArr, byte[] bArr2) {
        for (int i3 = 0; i3 < bArr.length; i3++) {
            if ((bArr[i3] & UByte.MAX_VALUE) < (65535 & bArr2[i3])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private byte[][] minMaxIPs(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        byte[] bArr7 = new byte[length];
        byte[] bArr8 = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            bArr5[i3] = (byte) (bArr[i3] & bArr2[i3]);
            byte b2 = bArr[i3];
            byte b10 = bArr2[i3];
            bArr6[i3] = (byte) ((b2 & b10) | (~b10));
            bArr7[i3] = (byte) (bArr3[i3] & bArr4[i3]);
            byte b11 = bArr3[i3];
            byte b12 = bArr4[i3];
            bArr8[i3] = (byte) ((b11 & b12) | (~b12));
        }
        return new byte[][]{bArr5, bArr6, bArr7, bArr8};
    }

    private static byte[] or(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i3 = 0; i3 < bArr.length; i3++) {
            bArr3[i3] = (byte) (bArr[i3] | bArr2[i3]);
        }
        return bArr3;
    }

    private boolean otherNameIsConstrained(OtherName otherName, OtherName otherName2) {
        return otherName2.equals(otherName);
    }

    private String stringifyIP(byte[] bArr) {
        String string2;
        StringBuilder sb2 = new StringBuilder();
        int i3 = 0;
        while (true) {
            int length = bArr.length / 2;
            string2 = StubApp.getString2(1);
            if (i3 >= length) {
                break;
            }
            if (sb2.length() > 0) {
                sb2.append(string2);
            }
            sb2.append(Integer.toString(bArr[i3] & UByte.MAX_VALUE));
            i3++;
        }
        sb2.append(StubApp.getString2(601));
        boolean z2 = true;
        for (int length2 = bArr.length / 2; length2 < bArr.length; length2++) {
            if (z2) {
                z2 = false;
            } else {
                sb2.append(string2);
            }
            sb2.append(Integer.toString(bArr[length2] & UByte.MAX_VALUE));
        }
        return sb2.toString();
    }

    private String stringifyIPCollection(Set set) {
        StringBuilder b2 = AbstractC1856e.b(StubApp.getString2(1557));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (b2.length() > 1) {
                b2.append(StubApp.getString2(321));
            }
            b2.append(stringifyIP((byte[]) it.next()));
        }
        b2.append(StubApp.getString2(511));
        return b2.toString();
    }

    private String stringifyOtherNameCollection(Set set) {
        StringBuilder b2 = AbstractC1856e.b(StubApp.getString2(1557));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (b2.length() > 1) {
                b2.append(StubApp.getString2(321));
            }
            OtherName otherName = OtherName.getInstance(it.next());
            b2.append(otherName.getTypeID().getId());
            b2.append(StubApp.getString2(478));
            try {
                b2.append(Hex.toHexString(otherName.getValue().toASN1Primitive().getEncoded()));
            } catch (IOException e10) {
                b2.append(e10.toString());
            }
        }
        b2.append(StubApp.getString2(511));
        return b2.toString();
    }

    private Set unionDN(Set set, ASN1Sequence aSN1Sequence) {
        if (set.isEmpty()) {
            if (aSN1Sequence == null) {
                return set;
            }
            set.add(aSN1Sequence);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(it.next());
            if (withinDNSubtree(aSN1Sequence, aSN1Sequence2)) {
                hashSet.add(aSN1Sequence2);
            } else {
                if (!withinDNSubtree(aSN1Sequence2, aSN1Sequence)) {
                    hashSet.add(aSN1Sequence2);
                }
                hashSet.add(aSN1Sequence);
            }
        }
        return hashSet;
    }

    private Set unionDNS(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!withinDomain(str2, str)) {
                boolean withinDomain = withinDomain(str, str2);
                hashSet.add(str2);
                if (withinDomain) {
                }
            }
            hashSet.add(str);
        }
        return hashSet;
    }

    private Set unionEmail(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            unionEmail((String) it.next(), str, hashSet);
        }
        return hashSet;
    }

    private Set unionIP(Set set, byte[] bArr) {
        if (set.isEmpty()) {
            if (bArr == null) {
                return set;
            }
            set.add(bArr);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.addAll(unionIPRange((byte[]) it.next(), bArr));
        }
        return hashSet;
    }

    private Set unionIPRange(byte[] bArr, byte[] bArr2) {
        HashSet hashSet = new HashSet();
        boolean areEqual = Arrays.areEqual(bArr, bArr2);
        hashSet.add(bArr);
        if (areEqual) {
            return hashSet;
        }
        hashSet.add(bArr2);
        return hashSet;
    }

    private Set unionOtherName(Set set, OtherName otherName) {
        HashSet hashSet = set != null ? new HashSet(set) : new HashSet();
        hashSet.add(otherName);
        return hashSet;
    }

    private Set unionURI(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            unionURI((String) it.next(), str, hashSet);
        }
        return hashSet;
    }

    private static boolean withinDNSubtree(ASN1Sequence aSN1Sequence, ASN1Sequence aSN1Sequence2) {
        if (aSN1Sequence2.size() < 1 || aSN1Sequence2.size() > aSN1Sequence.size()) {
            return false;
        }
        RDN rdn = RDN.getInstance(aSN1Sequence2.getObjectAt(0));
        int i3 = 0;
        int i10 = 0;
        while (true) {
            if (i3 >= aSN1Sequence.size()) {
                i3 = i10;
                break;
            }
            if (IETFUtils.rDNAreEqual(rdn, RDN.getInstance(aSN1Sequence.getObjectAt(i3)))) {
                break;
            }
            i10 = i3;
            i3++;
        }
        if (aSN1Sequence2.size() > aSN1Sequence.size() - i3) {
            return false;
        }
        for (int i11 = 0; i11 < aSN1Sequence2.size(); i11++) {
            RDN rdn2 = RDN.getInstance(aSN1Sequence2.getObjectAt(i11));
            RDN rdn3 = RDN.getInstance(aSN1Sequence.getObjectAt(i3 + i11));
            if (rdn2.size() != rdn3.size() || !rdn2.getFirst().getType().equals((ASN1Primitive) rdn3.getFirst().getType())) {
                return false;
            }
            if (rdn2.size() == 1 && rdn2.getFirst().getType().equals((ASN1Primitive) RFC4519Style.serialNumber)) {
                if (!rdn3.getFirst().getValue().toString().startsWith(rdn2.getFirst().getValue().toString())) {
                    return false;
                }
            } else if (!IETFUtils.rDNAreEqual(rdn2, rdn3)) {
                return false;
            }
        }
        return true;
    }

    private boolean withinDomain(String str, String str2) {
        if (str2.startsWith(StubApp.getString2(1))) {
            str2 = str2.substring(1);
        }
        String[] split = Strings.split(str2, '.');
        String[] split2 = Strings.split(str, '.');
        if (split2.length <= split.length) {
            return false;
        }
        int length = split2.length - split.length;
        for (int i3 = -1; i3 < split.length; i3++) {
            if (i3 == -1) {
                if (split2[i3 + length].equals("")) {
                    return false;
                }
            } else if (!split[i3].equalsIgnoreCase(split2[i3 + length])) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void addExcludedSubtree(GeneralSubtree generalSubtree) {
        GeneralName base = generalSubtree.getBase();
        int tagNo = base.getTagNo();
        if (tagNo == 0) {
            this.excludedSubtreesOtherName = unionOtherName(this.excludedSubtreesOtherName, OtherName.getInstance(base.getName()));
            return;
        }
        if (tagNo == 1) {
            this.excludedSubtreesEmail = unionEmail(this.excludedSubtreesEmail, extractNameAsString(base));
            return;
        }
        if (tagNo == 2) {
            this.excludedSubtreesDNS = unionDNS(this.excludedSubtreesDNS, extractNameAsString(base));
            return;
        }
        if (tagNo == 4) {
            this.excludedSubtreesDN = unionDN(this.excludedSubtreesDN, (ASN1Sequence) base.getName().toASN1Primitive());
            return;
        }
        if (tagNo == 6) {
            this.excludedSubtreesURI = unionURI(this.excludedSubtreesURI, extractNameAsString(base));
        } else if (tagNo == 7) {
            this.excludedSubtreesIP = unionIP(this.excludedSubtreesIP, ASN1OctetString.getInstance(base.getName()).getOctets());
        } else {
            throw new IllegalStateException(StubApp.getString2(26939) + base.getTagNo());
        }
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void checkExcluded(GeneralName generalName) throws NameConstraintValidatorException {
        int tagNo = generalName.getTagNo();
        if (tagNo == 0) {
            checkExcludedOtherName(this.excludedSubtreesOtherName, OtherName.getInstance(generalName.getName()));
            return;
        }
        if (tagNo == 1) {
            checkExcludedEmail(this.excludedSubtreesEmail, extractNameAsString(generalName));
            return;
        }
        if (tagNo == 2) {
            checkExcludedDNS(this.excludedSubtreesDNS, extractNameAsString(generalName));
            return;
        }
        if (tagNo == 4) {
            checkExcludedDN(X500Name.getInstance(generalName.getName()));
        } else if (tagNo == 6) {
            checkExcludedURI(this.excludedSubtreesURI, extractNameAsString(generalName));
        } else {
            if (tagNo != 7) {
                return;
            }
            checkExcludedIP(this.excludedSubtreesIP, ASN1OctetString.getInstance(generalName.getName()).getOctets());
        }
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void checkPermitted(GeneralName generalName) throws NameConstraintValidatorException {
        int tagNo = generalName.getTagNo();
        if (tagNo == 0) {
            checkPermittedOtherName(this.permittedSubtreesOtherName, OtherName.getInstance(generalName.getName()));
            return;
        }
        if (tagNo == 1) {
            checkPermittedEmail(this.permittedSubtreesEmail, extractNameAsString(generalName));
            return;
        }
        if (tagNo == 2) {
            checkPermittedDNS(this.permittedSubtreesDNS, extractNameAsString(generalName));
            return;
        }
        if (tagNo == 4) {
            checkPermittedDN(X500Name.getInstance(generalName.getName()));
        } else if (tagNo == 6) {
            checkPermittedURI(this.permittedSubtreesURI, extractNameAsString(generalName));
        } else {
            if (tagNo != 7) {
                return;
            }
            checkPermittedIP(this.permittedSubtreesIP, ASN1OctetString.getInstance(generalName.getName()).getOctets());
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PKIXNameConstraintValidator)) {
            return false;
        }
        PKIXNameConstraintValidator pKIXNameConstraintValidator = (PKIXNameConstraintValidator) obj;
        return collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesDN, this.excludedSubtreesDN) && collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesDNS, this.excludedSubtreesDNS) && collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesEmail, this.excludedSubtreesEmail) && collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesIP, this.excludedSubtreesIP) && collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesURI, this.excludedSubtreesURI) && collectionsAreEqual(pKIXNameConstraintValidator.excludedSubtreesOtherName, this.excludedSubtreesOtherName) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesDN, this.permittedSubtreesDN) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesDNS, this.permittedSubtreesDNS) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesEmail, this.permittedSubtreesEmail) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesIP, this.permittedSubtreesIP) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesURI, this.permittedSubtreesURI) && collectionsAreEqual(pKIXNameConstraintValidator.permittedSubtreesOtherName, this.permittedSubtreesOtherName);
    }

    public int hashCode() {
        return hashCollection(this.excludedSubtreesDN) + hashCollection(this.excludedSubtreesDNS) + hashCollection(this.excludedSubtreesEmail) + hashCollection(this.excludedSubtreesIP) + hashCollection(this.excludedSubtreesURI) + hashCollection(this.excludedSubtreesOtherName) + hashCollection(this.permittedSubtreesDN) + hashCollection(this.permittedSubtreesDNS) + hashCollection(this.permittedSubtreesEmail) + hashCollection(this.permittedSubtreesIP) + hashCollection(this.permittedSubtreesURI) + hashCollection(this.permittedSubtreesOtherName);
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void intersectEmptyPermittedSubtree(int i3) {
        if (i3 == 0) {
            this.permittedSubtreesOtherName = new HashSet();
            return;
        }
        if (i3 == 1) {
            this.permittedSubtreesEmail = new HashSet();
            return;
        }
        if (i3 == 2) {
            this.permittedSubtreesDNS = new HashSet();
            return;
        }
        if (i3 == 4) {
            this.permittedSubtreesDN = new HashSet();
        } else if (i3 == 6) {
            this.permittedSubtreesURI = new HashSet();
        } else {
            if (i3 != 7) {
                throw new IllegalStateException(u.p(i3, StubApp.getString2(26939)));
            }
            this.permittedSubtreesIP = new HashSet();
        }
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void intersectPermittedSubtree(GeneralSubtree generalSubtree) {
        intersectPermittedSubtree(new GeneralSubtree[]{generalSubtree});
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        addLine(sb2, StubApp.getString2(27827));
        Set set = this.permittedSubtreesDN;
        String string2 = StubApp.getString2(27828);
        if (set != null) {
            addLine(sb2, string2);
            addLine(sb2, this.permittedSubtreesDN.toString());
        }
        Set set2 = this.permittedSubtreesDNS;
        String string22 = StubApp.getString2(27829);
        if (set2 != null) {
            addLine(sb2, string22);
            addLine(sb2, this.permittedSubtreesDNS.toString());
        }
        Set set3 = this.permittedSubtreesEmail;
        String string23 = StubApp.getString2(27830);
        if (set3 != null) {
            addLine(sb2, string23);
            addLine(sb2, this.permittedSubtreesEmail.toString());
        }
        Set set4 = this.permittedSubtreesURI;
        String string24 = StubApp.getString2(27831);
        if (set4 != null) {
            addLine(sb2, string24);
            addLine(sb2, this.permittedSubtreesURI.toString());
        }
        Set set5 = this.permittedSubtreesIP;
        String string25 = StubApp.getString2(27832);
        if (set5 != null) {
            addLine(sb2, string25);
            addLine(sb2, stringifyIPCollection(this.permittedSubtreesIP));
        }
        Set set6 = this.permittedSubtreesOtherName;
        String string26 = StubApp.getString2(27833);
        if (set6 != null) {
            addLine(sb2, string26);
            addLine(sb2, stringifyOtherNameCollection(this.permittedSubtreesOtherName));
        }
        addLine(sb2, StubApp.getString2(27834));
        if (!this.excludedSubtreesDN.isEmpty()) {
            addLine(sb2, string2);
            addLine(sb2, this.excludedSubtreesDN.toString());
        }
        if (!this.excludedSubtreesDNS.isEmpty()) {
            addLine(sb2, string22);
            addLine(sb2, this.excludedSubtreesDNS.toString());
        }
        if (!this.excludedSubtreesEmail.isEmpty()) {
            addLine(sb2, string23);
            addLine(sb2, this.excludedSubtreesEmail.toString());
        }
        if (!this.excludedSubtreesURI.isEmpty()) {
            addLine(sb2, string24);
            addLine(sb2, this.excludedSubtreesURI.toString());
        }
        if (!this.excludedSubtreesIP.isEmpty()) {
            addLine(sb2, string25);
            addLine(sb2, stringifyIPCollection(this.excludedSubtreesIP));
        }
        if (!this.excludedSubtreesOtherName.isEmpty()) {
            addLine(sb2, string26);
            addLine(sb2, stringifyOtherNameCollection(this.excludedSubtreesOtherName));
        }
        return sb2.toString();
    }

    private boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.areEqual((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    private void intersectEmail(String str, String str2, Set set) {
        int indexOf = str.indexOf(64);
        String string2 = StubApp.getString2(1);
        if (indexOf != -1) {
            String substring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else if (str2.startsWith(string2)) {
                if (withinDomain(substring, str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else {
                if (substring.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            }
        }
        if (!str.startsWith(string2)) {
            if (str2.indexOf(64) != -1) {
                if (str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                    set.add(str2);
                    return;
                }
                return;
            } else if (str2.startsWith(string2)) {
                if (withinDomain(str, str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            }
        }
        if (str2.indexOf(64) != -1) {
            if (withinDomain(str2.substring(str.indexOf(64) + 1), str)) {
                set.add(str2);
            }
        } else if (!str2.startsWith(string2)) {
            if (withinDomain(str2, str)) {
                set.add(str2);
            }
        } else if (withinDomain(str, str2) || str.equalsIgnoreCase(str2)) {
            set.add(str);
        } else if (withinDomain(str2, str)) {
            set.add(str2);
        }
    }

    private void intersectOtherName(OtherName otherName, OtherName otherName2, Set set) {
        if (otherName.equals(otherName2)) {
            set.add(otherName);
        }
    }

    private void intersectURI(String str, String str2, Set set) {
        int indexOf = str.indexOf(64);
        String string2 = StubApp.getString2(1);
        if (indexOf != -1) {
            String substring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else if (str2.startsWith(string2)) {
                if (withinDomain(substring, str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else {
                if (substring.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            }
        }
        if (!str.startsWith(string2)) {
            if (str2.indexOf(64) != -1) {
                if (str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                    set.add(str2);
                    return;
                }
                return;
            } else if (str2.startsWith(string2)) {
                if (withinDomain(str, str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            }
        }
        if (str2.indexOf(64) != -1) {
            if (withinDomain(str2.substring(str.indexOf(64) + 1), str)) {
                set.add(str2);
            }
        } else if (!str2.startsWith(string2)) {
            if (withinDomain(str2, str)) {
                set.add(str2);
            }
        } else if (withinDomain(str, str2) || str.equalsIgnoreCase(str2)) {
            set.add(str);
        } else if (withinDomain(str2, str)) {
            set.add(str2);
        }
    }

    private void unionEmail(String str, String str2, Set set) {
        int indexOf = str.indexOf(64);
        String string2 = StubApp.getString2(1);
        if (indexOf != -1) {
            String substring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                boolean equalsIgnoreCase = str.equalsIgnoreCase(str2);
                set.add(str);
                if (equalsIgnoreCase) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (str2.startsWith(string2)) {
                if (withinDomain(substring, str2)) {
                    set.add(str2);
                    return;
                }
            } else if (substring.equalsIgnoreCase(str2)) {
                set.add(str2);
                return;
            }
        } else {
            if (str.startsWith(string2)) {
                if (str2.indexOf(64) != -1) {
                    boolean withinDomain = withinDomain(str2.substring(str.indexOf(64) + 1), str);
                    set.add(str);
                    if (withinDomain) {
                        return;
                    }
                    set.add(str2);
                    return;
                }
                if (!str2.startsWith(string2)) {
                    boolean withinDomain2 = withinDomain(str2, str);
                    set.add(str);
                    if (withinDomain2) {
                        return;
                    }
                    set.add(str2);
                    return;
                }
                if (withinDomain(str, str2) || str.equalsIgnoreCase(str2)) {
                    set.add(str2);
                    return;
                }
                boolean withinDomain3 = withinDomain(str2, str);
                set.add(str);
                if (withinDomain3) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (str2.indexOf(64) != -1) {
                boolean equalsIgnoreCase2 = str2.substring(str.indexOf(64) + 1).equalsIgnoreCase(str);
                set.add(str);
                if (equalsIgnoreCase2) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (!str2.startsWith(string2)) {
                boolean equalsIgnoreCase3 = str.equalsIgnoreCase(str2);
                set.add(str);
                if (equalsIgnoreCase3) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (withinDomain(str, str2)) {
                set.add(str2);
                return;
            }
        }
        set.add(str);
        set.add(str2);
    }

    private void unionURI(String str, String str2, Set set) {
        int indexOf = str.indexOf(64);
        String string2 = StubApp.getString2(1);
        if (indexOf != -1) {
            String substring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                boolean equalsIgnoreCase = str.equalsIgnoreCase(str2);
                set.add(str);
                if (equalsIgnoreCase) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (str2.startsWith(string2)) {
                if (withinDomain(substring, str2)) {
                    set.add(str2);
                    return;
                }
            } else if (substring.equalsIgnoreCase(str2)) {
                set.add(str2);
                return;
            }
        } else {
            if (str.startsWith(string2)) {
                if (str2.indexOf(64) != -1) {
                    boolean withinDomain = withinDomain(str2.substring(str.indexOf(64) + 1), str);
                    set.add(str);
                    if (withinDomain) {
                        return;
                    }
                    set.add(str2);
                    return;
                }
                if (!str2.startsWith(string2)) {
                    boolean withinDomain2 = withinDomain(str2, str);
                    set.add(str);
                    if (withinDomain2) {
                        return;
                    }
                    set.add(str2);
                    return;
                }
                if (withinDomain(str, str2) || str.equalsIgnoreCase(str2)) {
                    set.add(str2);
                    return;
                }
                boolean withinDomain3 = withinDomain(str2, str);
                set.add(str);
                if (withinDomain3) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (str2.indexOf(64) != -1) {
                boolean equalsIgnoreCase2 = str2.substring(str.indexOf(64) + 1).equalsIgnoreCase(str);
                set.add(str);
                if (equalsIgnoreCase2) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (!str2.startsWith(string2)) {
                boolean equalsIgnoreCase3 = str.equalsIgnoreCase(str2);
                set.add(str);
                if (equalsIgnoreCase3) {
                    return;
                }
                set.add(str2);
                return;
            }
            if (withinDomain(str, str2)) {
                set.add(str2);
                return;
            }
        }
        set.add(str);
        set.add(str2);
    }

    public void checkExcludedDN(X500Name x500Name) throws NameConstraintValidatorException {
        checkExcludedDN(this.excludedSubtreesDN, ASN1Sequence.getInstance(x500Name));
    }

    public void checkPermittedDN(X500Name x500Name) throws NameConstraintValidatorException {
        checkPermittedDN(this.permittedSubtreesDN, ASN1Sequence.getInstance(x500Name.toASN1Primitive()));
    }

    @Override // org.bouncycastle.asn1.x509.NameConstraintValidator
    public void intersectPermittedSubtree(GeneralSubtree[] generalSubtreeArr) {
        HashMap hashMap = new HashMap();
        for (int i3 = 0; i3 != generalSubtreeArr.length; i3++) {
            GeneralSubtree generalSubtree = generalSubtreeArr[i3];
            Integer valueOf = Integers.valueOf(generalSubtree.getBase().getTagNo());
            if (hashMap.get(valueOf) == null) {
                hashMap.put(valueOf, new HashSet());
            }
            ((Set) hashMap.get(valueOf)).add(generalSubtree);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if (intValue == 0) {
                this.permittedSubtreesOtherName = intersectOtherName(this.permittedSubtreesOtherName, (Set) entry.getValue());
            } else if (intValue == 1) {
                this.permittedSubtreesEmail = intersectEmail(this.permittedSubtreesEmail, (Set) entry.getValue());
            } else if (intValue == 2) {
                this.permittedSubtreesDNS = intersectDNS(this.permittedSubtreesDNS, (Set) entry.getValue());
            } else if (intValue == 4) {
                this.permittedSubtreesDN = intersectDN(this.permittedSubtreesDN, (Set) entry.getValue());
            } else if (intValue == 6) {
                this.permittedSubtreesURI = intersectURI(this.permittedSubtreesURI, (Set) entry.getValue());
            } else {
                if (intValue != 7) {
                    throw new IllegalStateException(u.p(intValue, StubApp.getString2(26939)));
                }
                this.permittedSubtreesIP = intersectIP(this.permittedSubtreesIP, (Set) entry.getValue());
            }
        }
    }
}
