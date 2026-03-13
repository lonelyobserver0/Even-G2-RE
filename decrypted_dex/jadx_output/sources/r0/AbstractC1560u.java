package r0;

import E0.x;
import M4.I;
import android.app.UiModeManager;
import android.content.Context;
import android.media.AudioFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.IntCompanionObject;
import no.nordicsemi.android.dfu.DfuBaseService;
import o0.AbstractC1405B;
import o0.C1406C;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.math.Primes;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumEngine;
import p0.AbstractC1482f;
import w.AbstractC1856e;

/* renamed from: r0.u, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1560u {

    /* renamed from: a, reason: collision with root package name */
    public static final int f20190a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f20191b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f20192c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f20193d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f20194e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f20195f;

    /* renamed from: g, reason: collision with root package name */
    public static final long[] f20196g;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f20197h;

    /* renamed from: i, reason: collision with root package name */
    public static final Pattern f20198i;
    public static final Pattern j;

    /* renamed from: k, reason: collision with root package name */
    public static HashMap f20199k;

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f20200l;

    /* renamed from: m, reason: collision with root package name */
    public static final String[] f20201m;

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f20202n;

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f20203o;

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f20204p;

    static {
        int i3 = Build.VERSION.SDK_INT;
        f20190a = i3;
        String str = Build.DEVICE;
        f20191b = str;
        String str2 = Build.MANUFACTURER;
        f20192c = str2;
        String str3 = Build.MODEL;
        f20193d = str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String string2 = StubApp.getString2(81);
        sb2.append(string2);
        sb2.append(str3);
        sb2.append(string2);
        sb2.append(str2);
        sb2.append(string2);
        sb2.append(i3);
        f20194e = sb2.toString();
        f20195f = new byte[0];
        f20196g = new long[0];
        f20197h = Pattern.compile(StubApp.getString2(22547));
        f20198i = Pattern.compile(StubApp.getString2(22548));
        Pattern.compile(StubApp.getString2(22549));
        j = Pattern.compile(StubApp.getString2(22550), 2);
        f20200l = new String[]{StubApp.getString2(22553), StubApp.getString2(22554), StubApp.getString2(22555), StubApp.getString2(22556), StubApp.getString2(22557), StubApp.getString2(22558), StubApp.getString2(22559), StubApp.getString2(22560), StubApp.getString2(22561), StubApp.getString2(22562), StubApp.getString2(22563), StubApp.getString2(9110), StubApp.getString2(22564), StubApp.getString2(22565), StubApp.getString2(22566), StubApp.getString2(22567), StubApp.getString2(22568), StubApp.getString2(22569), StubApp.getString2(22570), StubApp.getString2(22571), StubApp.getString2(22572), StubApp.getString2(22573), StubApp.getString2(22574), StubApp.getString2(22575), StubApp.getString2(22576), StubApp.getString2(10803), StubApp.getString2(22577), StubApp.getString2(22578), StubApp.getString2(22579), StubApp.getString2(22580), StubApp.getString2(22581), StubApp.getString2(6642), StubApp.getString2(22582), StubApp.getString2(22583), StubApp.getString2(22584), StubApp.getString2(22585), StubApp.getString2(22586), StubApp.getString2(22587), StubApp.getString2(22588), StubApp.getString2(22589), StubApp.getString2(22590), StubApp.getString2(22591), StubApp.getString2(290), StubApp.getString2(22592), StubApp.getString2(22593), StubApp.getString2(22594), StubApp.getString2(22595), StubApp.getString2(22594), StubApp.getString2(22596), StubApp.getString2(22597), StubApp.getString2(22598), StubApp.getString2(22599), StubApp.getString2(13121), StubApp.getString2(22592), StubApp.getString2(22600), StubApp.getString2(22592), StubApp.getString2(22601), StubApp.getString2(22602), StubApp.getString2(22603), StubApp.getString2(22602), StubApp.getString2(22604), StubApp.getString2(22605), StubApp.getString2(22606), StubApp.getString2(22605), StubApp.getString2(22607), StubApp.getString2(22608), StubApp.getString2(22609), StubApp.getString2(22608), StubApp.getString2(22610), StubApp.getString2(22611), StubApp.getString2(22612), StubApp.getString2(22611), StubApp.getString2(22613), StubApp.getString2(22614), StubApp.getString2(22615), StubApp.getString2(22614), StubApp.getString2(22616), StubApp.getString2(22587), StubApp.getString2(22617), StubApp.getString2(22587), StubApp.getString2(22618), StubApp.getString2(22619), StubApp.getString2(22620), StubApp.getString2(22621), StubApp.getString2(22622), StubApp.getString2(22623), StubApp.getString2(22551), StubApp.getString2(22552)};
        f20201m = new String[]{StubApp.getString2(22625), StubApp.getString2(22626), StubApp.getString2(22627), StubApp.getString2(22621), StubApp.getString2(22628), StubApp.getString2(22629), StubApp.getString2(22630), StubApp.getString2(22602), StubApp.getString2(22631), StubApp.getString2(22605), StubApp.getString2(22632), StubApp.getString2(22619), StubApp.getString2(22633), StubApp.getString2(22621), StubApp.getString2(22634), StubApp.getString2(22623), StubApp.getString2(22624), StubApp.getString2(22552)};
        f20202n = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        f20203o = new int[]{0, 4129, 8258, 12387, 16516, 20645, 24774, 28903, 33032, 37161, 41290, 45419, 49548, 53677, 57806, 61935};
        f20204p = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, BERTags.FLAGS, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 221, 218, Primes.SMALL_FACTOR_LIMIT, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, CertificateBody.profileType, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, ModuleDescriptor.MODULE_VERSION, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static long A(float f10, long j3) {
        return f10 == 1.0f ? j3 : Math.round(j3 / f10);
    }

    public static String B(String str) {
        try {
            Class<?> cls = Class.forName(StubApp.getString2("20449"));
            return (String) cls.getMethod(StubApp.getString2("6443"), String.class).invoke(cls, str);
        } catch (Exception e10) {
            AbstractC1550k.l(StubApp.getString2(3962), StubApp.getString2(22635).concat(str), e10);
            return null;
        }
    }

    public static String C(int i3) {
        switch (i3) {
            case DfuBaseService.PROGRESS_STARTING /* -2 */:
                return StubApp.getString2(1337);
            case -1:
                return StubApp.getString2(351);
            case 0:
                return StubApp.getString2(5107);
            case 1:
                return StubApp.getString2(643);
            case 2:
                return StubApp.getString2(3235);
            case 3:
                return StubApp.getString2(613);
            case 4:
                return StubApp.getString2(1483);
            case 5:
                return StubApp.getString2(2127);
            case 6:
                return StubApp.getString2(22637);
            default:
                return i3 >= 10000 ? Xa.h.g(i3, StubApp.getString2(22636), StubApp.getString2(74)) : StubApp.getString2(DilithiumEngine.DilithiumPolyT1PackedBytes);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0110 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int D(android.net.Uri r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.AbstractC1560u.D(android.net.Uri, java.lang.String):int");
    }

    public static void E(int i3) {
        Integer.toString(i3, 36);
    }

    public static boolean F(int i3) {
        return i3 == 3 || i3 == 2 || i3 == 268435456 || i3 == 21 || i3 == 1342177280 || i3 == 22 || i3 == 1610612736 || i3 == 4;
    }

    public static boolean G(Context context) {
        int i3 = f20190a;
        if (i3 < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return true;
        }
        String str = f20193d;
        if (i3 == 30 && (AbstractC0624h2.i(str, StubApp.getString2(22645)) || AbstractC0624h2.i(str, StubApp.getString2(22646)))) {
            return true;
        }
        return i3 == 34 && AbstractC0624h2.i(str, StubApp.getString2(22647));
    }

    public static boolean H(int i3) {
        return i3 == 10 || i3 == 13;
    }

    public static boolean I(Context context) {
        UiModeManager uiModeManager = (UiModeManager) StubApp.getOrigApplicationContext(context.getApplicationContext()).getSystemService(StubApp.getString2(18403));
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static long J(long j3) {
        return (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? j3 : j3 * 1000;
    }

    public static String K(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals(StubApp.getString2(3969))) {
            str = replace;
        }
        String y10 = AbstractC0624h2.y(str);
        int i3 = 0;
        String str2 = y10.split(StubApp.getString2(999), 2)[0];
        if (f20199k == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            String[] strArr = f20200l;
            HashMap hashMap = new HashMap(length + strArr.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i10 = 0; i10 < strArr.length; i10 += 2) {
                hashMap.put(strArr[i10], strArr[i10 + 1]);
            }
            f20199k = hashMap;
        }
        String str4 = (String) f20199k.get(str2);
        if (str4 != null) {
            StringBuilder b2 = AbstractC1856e.b(str4);
            b2.append(y10.substring(str2.length()));
            y10 = b2.toString();
            str2 = str4;
        }
        if (!StubApp.getString2(22648).equals(str2) && !StubApp.getString2(2368).equals(str2) && !StubApp.getString2(9110).equals(str2)) {
            return y10;
        }
        while (true) {
            String[] strArr2 = f20201m;
            if (i3 >= strArr2.length) {
                return y10;
            }
            if (y10.startsWith(strArr2[i3])) {
                return strArr2[i3 + 1] + y10.substring(strArr2[i3].length());
            }
            i3 += 2;
        }
    }

    public static Object[] L(int i3, Object[] objArr) {
        AbstractC1550k.c(i3 <= objArr.length);
        return Arrays.copyOf(objArr, i3);
    }

    public static long M(String str) {
        Matcher matcher = f20197h.matcher(str);
        if (!matcher.matches()) {
            throw C1406C.a(StubApp.getString2(22651) + str, null);
        }
        int i3 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase(StubApp.getString2(4928))) {
            i3 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if (StubApp.getString2(999).equals(matcher.group(11))) {
                i3 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone(StubApp.getString2(22649)));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            gregorianCalendar.set(14, new BigDecimal(StubApp.getString2(22650) + matcher.group(8)).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i3 != 0 ? timeInMillis - (i3 * 60000) : timeInMillis;
    }

    public static void N(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static void O(ArrayList arrayList, int i3, int i10) {
        if (i3 < 0 || i10 > arrayList.size() || i3 > i10) {
            throw new IllegalArgumentException();
        }
        if (i3 != i10) {
            arrayList.subList(i3, i10).clear();
        }
    }

    public static long P(int i3, long j3) {
        return R(j3, 1000000L, i3, RoundingMode.DOWN);
    }

    public static void Q(long[] jArr, long j3) {
        long j10;
        RoundingMode roundingMode = RoundingMode.DOWN;
        int i3 = 0;
        if (j3 >= 1000000 && j3 % 1000000 == 0) {
            long t3 = Ec.d.t(j3, 1000000L, RoundingMode.UNNECESSARY);
            while (i3 < jArr.length) {
                jArr[i3] = Ec.d.t(jArr[i3], t3, roundingMode);
                i3++;
            }
            return;
        }
        if (j3 < 1000000 && 1000000 % j3 == 0) {
            long t10 = Ec.d.t(1000000L, j3, RoundingMode.UNNECESSARY);
            while (i3 < jArr.length) {
                jArr[i3] = Ec.d.D(jArr[i3], t10);
                i3++;
            }
            return;
        }
        int i10 = 0;
        while (i10 < jArr.length) {
            long j11 = jArr[i10];
            if (j11 != 0) {
                if (j3 >= j11 && j3 % j11 == 0) {
                    jArr[i10] = Ec.d.t(1000000L, Ec.d.t(j3, j11, RoundingMode.UNNECESSARY), roundingMode);
                } else if (j3 >= j11 || j11 % j3 != 0) {
                    j10 = j3;
                    jArr[i10] = S(j11, 1000000L, j10, roundingMode);
                    i10++;
                    j3 = j10;
                } else {
                    jArr[i10] = Ec.d.D(1000000L, Ec.d.t(j11, j3, RoundingMode.UNNECESSARY));
                }
            }
            j10 = j3;
            i10++;
            j3 = j10;
        }
    }

    public static long R(long j3, long j10, long j11, RoundingMode roundingMode) {
        if (j3 == 0 || j10 == 0) {
            return 0L;
        }
        return (j11 < j10 || j11 % j10 != 0) ? (j11 >= j10 || j10 % j11 != 0) ? (j11 < j3 || j11 % j3 != 0) ? (j11 >= j3 || j3 % j11 != 0) ? S(j3, j10, j11, roundingMode) : Ec.d.D(j10, Ec.d.t(j3, j11, RoundingMode.UNNECESSARY)) : Ec.d.t(j10, Ec.d.t(j11, j3, RoundingMode.UNNECESSARY), roundingMode) : Ec.d.D(j3, Ec.d.t(j10, j11, RoundingMode.UNNECESSARY)) : Ec.d.t(j3, Ec.d.t(j11, j10, RoundingMode.UNNECESSARY), roundingMode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (java.lang.Math.abs(r9 - r2) == 0.5d) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long S(long r9, long r11, long r13, java.math.RoundingMode r15) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.AbstractC1560u.S(long, long, long, java.math.RoundingMode):long");
    }

    public static String[] T(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : str.trim().split(StubApp.getString2(22655), -1);
    }

    public static String U(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (int i3 = 0; i3 < bArr.length; i3++) {
            sb2.append(Character.forDigit((bArr[i3] >> 4) & 15, 16));
            sb2.append(Character.forDigit(bArr[i3] & 15, 16));
        }
        return sb2.toString();
    }

    public static long V(long j3) {
        return (j3 == -9223372036854775807L || j3 == Long.MIN_VALUE) ? j3 : j3 / 1000;
    }

    public static int a(long[] jArr, long j3, boolean z2) {
        int i3;
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            return ~binarySearch;
        }
        while (true) {
            i3 = binarySearch + 1;
            if (i3 >= jArr.length || jArr[i3] != j3) {
                break;
            }
            binarySearch = i3;
        }
        return z2 ? binarySearch : i3;
    }

    public static int b(x xVar, long j3) {
        int i3 = xVar.f1861a - 1;
        int i10 = 0;
        while (i10 <= i3) {
            int i11 = (i10 + i3) >>> 1;
            if (xVar.f(i11) < j3) {
                i10 = i11 + 1;
            } else {
                i3 = i11 - 1;
            }
        }
        int i12 = i3 + 1;
        if (i12 < xVar.f1861a && xVar.f(i12) == j3) {
            return i12;
        }
        if (i3 == -1) {
            return 0;
        }
        return i3;
    }

    public static int c(I i3, Long l9, boolean z2) {
        int i10;
        int binarySearch = Collections.binarySearch(i3, l9);
        if (binarySearch < 0) {
            i10 = -(binarySearch + 2);
        } else {
            while (true) {
                int i11 = binarySearch - 1;
                if (i11 < 0 || ((Comparable) i3.get(i11)).compareTo(l9) != 0) {
                    break;
                }
                binarySearch = i11;
            }
            i10 = binarySearch;
        }
        return z2 ? Math.max(0, i10) : i10;
    }

    public static int d(int[] iArr, int i3, boolean z2, boolean z10) {
        int i10;
        int i11;
        int binarySearch = Arrays.binarySearch(iArr, i3);
        if (binarySearch < 0) {
            i11 = -(binarySearch + 2);
        } else {
            while (true) {
                i10 = binarySearch - 1;
                if (i10 < 0 || iArr[i10] != i3) {
                    break;
                }
                binarySearch = i10;
            }
            i11 = z2 ? binarySearch : i10;
        }
        return z10 ? Math.max(0, i11) : i11;
    }

    public static int e(long[] jArr, long j3, boolean z2) {
        int i3;
        int binarySearch = Arrays.binarySearch(jArr, j3);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            while (true) {
                int i10 = binarySearch - 1;
                if (i10 < 0 || jArr[i10] != j3) {
                    break;
                }
                binarySearch = i10;
            }
            i3 = binarySearch;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static int f(int i3, int i10) {
        return AbstractC1482f.v(i3, i10, 1, i10);
    }

    public static void g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static float h(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f10, f12));
    }

    public static int i(int i3, int i10, int i11) {
        return Math.max(i10, Math.min(i3, i11));
    }

    public static long j(long j3, long j10, long j11) {
        return Math.max(j10, Math.min(j3, j11));
    }

    public static boolean k(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (Objects.equals(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static int l(int i3, int i10, byte[] bArr, int i11) {
        while (i3 < i10) {
            i11 = f20202n[((i11 >>> 24) ^ (bArr[i3] & 255)) & 255] ^ (i11 << 8);
            i3++;
        }
        return i11;
    }

    public static Handler m(Handler.Callback callback) {
        Looper myLooper = Looper.myLooper();
        AbstractC1550k.h(myLooper);
        return new Handler(myLooper, callback);
    }

    public static String n(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static int o(int i3) {
        if (i3 == 20) {
            return 30;
        }
        if (i3 == 22) {
            return 31;
        }
        if (i3 == 30) {
            return 34;
        }
        switch (i3) {
            case 2:
            case 3:
                return 3;
            case 4:
            case 5:
            case 6:
                return 21;
            case 7:
            case 8:
                return 23;
            case 9:
            case 10:
            case 11:
            case 12:
                return 28;
            default:
                switch (i3) {
                    case 14:
                        return 25;
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                        return 28;
                    default:
                        return IntCompanionObject.MAX_VALUE;
                }
        }
    }

    public static AudioFormat p(int i3, int i10, int i11) {
        return new AudioFormat.Builder().setSampleRate(i3).setChannelMask(i10).setEncoding(i11).build();
    }

    public static int q(int i3) {
        int i10 = f20190a;
        if (i3 == 10) {
            return i10 >= 32 ? 737532 : 6396;
        }
        if (i3 == 12) {
            return 743676;
        }
        if (i3 == 24) {
            return i10 >= 32 ? 67108860 : 0;
        }
        switch (i3) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static byte[] r(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            int i10 = i3 * 2;
            bArr[i3] = (byte) (Character.digit(str.charAt(i10 + 1), 16) + (Character.digit(str.charAt(i10), 16) << 4));
        }
        return bArr;
    }

    public static int s(int i3, String str) {
        int i10 = 0;
        for (String str2 : T(str)) {
            if (i3 == AbstractC1405B.h(AbstractC1405B.d(str2))) {
                i10++;
            }
        }
        return i10;
    }

    public static String t(int i3, String str) {
        String[] T7 = T(str);
        if (T7.length == 0) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : T7) {
            if (i3 == AbstractC1405B.h(AbstractC1405B.d(str2))) {
                if (sb2.length() > 0) {
                    sb2.append(StubApp.getString2(321));
                }
                sb2.append(str2);
            }
        }
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public static int u(int i3) {
        if (i3 == 2 || i3 == 4) {
            return 6005;
        }
        if (i3 == 10) {
            return 6004;
        }
        if (i3 == 7) {
            return 6005;
        }
        if (i3 == 8) {
            return 6003;
        }
        switch (i3) {
            case 15:
                return 6003;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i3) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return 6002;
                    default:
                        return 6006;
                }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:8|(2:10|(5:12|13|14|(2:16|17)|18))|21|13|14|(0)|18) */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int v(java.lang.String r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = -1
            r2 = 4956(0x135c, float:6.945E-42)
            java.lang.String r2 = com.stub.StubApp.getString2(r2)
            java.lang.String[] r5 = r5.split(r2, r1)
            int r1 = r5.length
            r2 = 2
            if (r1 >= r2) goto L15
            return r0
        L15:
            int r3 = r1 + (-1)
            r3 = r5[r3]
            r4 = 3
            if (r1 < r4) goto L2e
            int r1 = r1 - r2
            r5 = r5[r1]
            r1 = 8103(0x1fa7, float:1.1355E-41)
            java.lang.String r1 = com.stub.StubApp.getString2(r1)
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L2e
            r5 = 1
            goto L2f
        L2e:
            r5 = r0
        L2f:
            r3.getClass()     // Catch: java.lang.NumberFormatException -> L3a
            int r0 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L3a
            if (r5 == 0) goto L3a
            int r5 = -r0
            return r5
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.AbstractC1560u.v(java.lang.String):int");
    }

    public static long w(float f10, long j3) {
        return f10 == 1.0f ? j3 : Math.round(j3 * f10);
    }

    public static long x(long j3) {
        return j3 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j3;
    }

    public static int y(int i3) {
        if (i3 == 8) {
            return 3;
        }
        if (i3 == 16) {
            return 2;
        }
        if (i3 != 24) {
            return i3 != 32 ? 0 : 22;
        }
        return 21;
    }

    public static int z(int i3, int i10) {
        int i11 = 2;
        if (i3 != 2) {
            if (i3 != 3) {
                if (i3 != 4) {
                    if (i3 != 21) {
                        if (i3 != 22) {
                            if (i3 != 268435456) {
                                if (i3 != 1342177280) {
                                    if (i3 != 1610612736) {
                                        throw new IllegalArgumentException();
                                    }
                                }
                            }
                        }
                    }
                    i11 = 3;
                }
                i11 = 4;
            } else {
                i11 = 1;
            }
        }
        return i11 * i10;
    }
}
