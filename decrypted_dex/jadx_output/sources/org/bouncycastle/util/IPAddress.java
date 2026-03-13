package org.bouncycastle.util;

import com.stub.StubApp;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public class IPAddress {
    private static boolean isMaskValue(String str, int i3) {
        int parseInt;
        try {
            parseInt = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        return parseInt >= 0 && parseInt <= i3;
    }

    public static boolean isValid(String str) {
        return isValidIPv4(str) || isValidIPv6(str);
    }

    public static boolean isValidIPv4(String str) {
        int indexOf;
        if (str.length() == 0) {
            return false;
        }
        String concat = str.concat(StubApp.getString2(1));
        int i3 = 0;
        int i10 = 0;
        while (i3 < concat.length() && (indexOf = concat.indexOf(46, i3)) > i3) {
            if (i10 == 4) {
                return false;
            }
            try {
                int parseInt = Integer.parseInt(concat.substring(i3, indexOf));
                if (parseInt >= 0 && parseInt <= 255) {
                    i3 = indexOf + 1;
                    i10++;
                }
            } catch (NumberFormatException unused) {
            }
            return false;
        }
        return i10 == 4;
    }

    public static boolean isValidIPv4WithNetmask(String str) {
        int indexOf = str.indexOf(StubApp.getString2(601));
        String substring = str.substring(indexOf + 1);
        return indexOf > 0 && isValidIPv4(str.substring(0, indexOf)) && (isValidIPv4(substring) || isMaskValue(substring, 32));
    }

    public static boolean isValidIPv6(String str) {
        int indexOf;
        if (str.length() == 0) {
            return false;
        }
        String concat = str.concat(StubApp.getString2(478));
        int i3 = 0;
        int i10 = 0;
        boolean z2 = false;
        while (i3 < concat.length() && (indexOf = concat.indexOf(58, i3)) >= i3) {
            if (i10 == 8) {
                return false;
            }
            if (i3 != indexOf) {
                String substring = concat.substring(i3, indexOf);
                if (indexOf != concat.length() - 1 || substring.indexOf(46) <= 0) {
                    try {
                        int parseInt = Integer.parseInt(concat.substring(i3, indexOf), 16);
                        if (parseInt >= 0 && parseInt <= 65535) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                    return false;
                }
                if (!isValidIPv4(substring)) {
                    return false;
                }
                i10++;
            } else {
                if (indexOf != 1 && indexOf != concat.length() - 1 && z2) {
                    return false;
                }
                z2 = true;
            }
            i3 = indexOf + 1;
            i10++;
        }
        return i10 == 8 || z2;
    }

    public static boolean isValidIPv6WithNetmask(String str) {
        int indexOf = str.indexOf(StubApp.getString2(601));
        String substring = str.substring(indexOf + 1);
        return indexOf > 0 && isValidIPv6(str.substring(0, indexOf)) && (isValidIPv6(substring) || isMaskValue(substring, 128));
    }

    public static boolean isValidWithNetMask(String str) {
        return isValidIPv4WithNetmask(str) || isValidIPv6WithNetmask(str);
    }
}
