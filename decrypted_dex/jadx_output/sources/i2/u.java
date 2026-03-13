package i2;

import com.stub.StubApp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract /* synthetic */ class u {
    public static void A(int i3, int i10, int i11, int i12, int i13) {
        AbstractC1560u.E(i3);
        AbstractC1560u.E(i10);
        AbstractC1560u.E(i11);
        AbstractC1560u.E(i12);
        AbstractC1560u.E(i13);
    }

    public static void B(HashSet hashSet, String str, String str2, String str3, String str4) {
        hashSet.add(str);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
    }

    public static int C(int i3, int i10, int i11, int i12) {
        return i3 + i10 + i11 + i12;
    }

    public static /* synthetic */ String D(int i3) {
        switch (i3) {
            case 1:
                return StubApp.getString2(18480);
            case 2:
                return StubApp.getString2(5273);
            case 3:
                return StubApp.getString2(18479);
            case 4:
                return StubApp.getString2(13524);
            case 5:
                return StubApp.getString2(18478);
            case 6:
                return StubApp.getString2(13677);
            default:
                return StubApp.getString2(1116);
        }
    }

    public static final boolean a(int i3) {
        return i3 == 3 || i3 == 4 || i3 == 6;
    }

    public static /* synthetic */ int b(int i3) {
        switch (i3) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 8;
            case 5:
                return 16;
            case 6:
                return 32;
            case 7:
                return 64;
            case 8:
                return 128;
            case 9:
                return 256;
            case 10:
                return 512;
            case 11:
                return 1024;
            case 12:
                return 2048;
            case 13:
                return 4096;
            case 14:
                return 8192;
            case 15:
                return 16384;
            case 16:
                return 32768;
            case 17:
                return PKIFailureInfo.notAuthorized;
            case 18:
                return PKIFailureInfo.unsupportedVersion;
            case 19:
                return PKIFailureInfo.transactionIdInUse;
            case 20:
                return PKIFailureInfo.signerNotTrusted;
            case 21:
                return PKIFailureInfo.badCertTemplate;
            case 22:
                return PKIFailureInfo.badSenderNonce;
            case 23:
                return 4194304;
            case 24:
                return 8388608;
            case 25:
                return 16777216;
            case 26:
                return 33554432;
            case 27:
                return 67108864;
            case 28:
                return 134217728;
            case 29:
                return 268435456;
            case 30:
                return PKIFailureInfo.duplicateCertReq;
            case 31:
                return 1073741824;
            default:
                throw null;
        }
    }

    public static int c(int i3, int i10, int i11, int i12) {
        return ((i3 - i10) / i11) + i12;
    }

    public static int d(int i3, int i10, String str) {
        return (str.hashCode() + i3) * i10;
    }

    public static int e(int i3, int i10, boolean z2) {
        return (Boolean.hashCode(z2) + i3) * i10;
    }

    public static int f(CharSequence charSequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return charSequence.length();
    }

    public static int g(UInt uInt, int i3) {
        return UInt.m135constructorimpl(uInt.getData() + i3);
    }

    public static int h(IntRange intRange, int i3) {
        return intRange.getEndInclusive().intValue() + i3;
    }

    public static long i(long j, long j3, long j10, long j11) {
        return (j * j3) + j10 + j11;
    }

    public static Object j(int i3, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i3);
    }

    public static Object k(CharSequence charSequence, int i3, Function1 function1) {
        return function1.invoke(Character.valueOf(charSequence.charAt(i3)));
    }

    public static Object l(byte[] bArr, int i3, Function1 function1) {
        return function1.invoke(UByte.m52boximpl(UByteArray.m116getw2LRezQ(bArr, i3)));
    }

    public static Object m(int[] iArr, int i3, Function1 function1) {
        return function1.invoke(UInt.m129boximpl(UIntArray.m195getpVg5ArA(iArr, i3)));
    }

    public static Object n(long[] jArr, int i3, Function1 function1) {
        return function1.invoke(ULong.m208boximpl(ULongArray.m274getsVKNKU(jArr, i3)));
    }

    public static Object o(short[] sArr, int i3, Function1 function1) {
        return function1.invoke(UShort.m315boximpl(UShortArray.m379getMh2AYeg(sArr, i3)));
    }

    public static String p(int i3, String str) {
        return str + i3;
    }

    public static String q(IOException iOException, StringBuilder sb2) {
        sb2.append(iOException.getMessage());
        return sb2.toString();
    }

    public static String r(Exception exc, StringBuilder sb2) {
        sb2.append(exc.getMessage());
        return sb2.toString();
    }

    public static String s(String str, int i3, char c10) {
        return str + i3 + c10;
    }

    public static StringBuilder t(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        sb2.append(str5);
        return sb2;
    }

    public static ArrayList u(LinkedHashMap linkedHashMap, Object obj) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(obj, arrayList);
        return arrayList;
    }

    public static ArrayList v(Map map, Object obj) {
        ArrayList arrayList = new ArrayList();
        map.put(obj, arrayList);
        return arrayList;
    }

    public static Iterator w(Iterable iterable, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(iterable, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return iterable.iterator();
    }

    public static Iterator x(Sequence sequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(sequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return sequence.iterator();
    }

    public static oa.j y(String str, String str2) {
        new oa.j(str, true);
        return new oa.j(str2, true);
    }

    public static oa.j z(String str, String str2, String str3) {
        new oa.j(str, true);
        new oa.j(str2, true);
        return new oa.j(str3, true);
    }
}
