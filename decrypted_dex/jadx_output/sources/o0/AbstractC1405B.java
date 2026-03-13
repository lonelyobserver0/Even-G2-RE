package o0;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.mapbox.common.logger.LogPriority;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import r0.AbstractC1560u;

/* renamed from: o0.B, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC1405B {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList f18019a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f18020b = Pattern.compile(StubApp.getString2(21491));

    public static boolean a(String str, String str2) {
        Z9.A f10;
        int a3;
        if (str == null) {
            return false;
        }
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(StubApp.getString2(938))) {
                    c10 = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals(StubApp.getString2(6095))) {
                    c10 = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals(StubApp.getString2(6094))) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals(StubApp.getString2(468))) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(StubApp.getString2(1629))) {
                    c10 = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals(StubApp.getString2(76))) {
                    c10 = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(StubApp.getString2(935))) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals(StubApp.getString2(1627))) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals(StubApp.getString2(1623))) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1903231877:
                if (str.equals(StubApp.getString2(83))) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1903589369:
                if (str.equals(StubApp.getString2(84))) {
                    c10 = '\n';
                    break;
                }
                break;
        }
        switch (c10) {
            case 3:
                if (str2 != null && (f10 = f(str2)) != null && (a3 = f10.a()) != 0 && a3 != 16) {
                }
                break;
        }
        return false;
    }

    public static String b(String str, String str2) {
        if (str != null && str2 != null) {
            String[] T7 = AbstractC1560u.T(str);
            StringBuilder sb2 = new StringBuilder();
            for (String str3 : T7) {
                if (str2.equals(d(str3))) {
                    if (sb2.length() > 0) {
                        sb2.append(StubApp.getString2(321));
                    }
                    sb2.append(str3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
        }
        return null;
    }

    public static int c(String str, String str2) {
        Z9.A f10;
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals(StubApp.getString2(938))) {
                    c10 = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals(StubApp.getString2(3206))) {
                    c10 = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals(StubApp.getString2(3202))) {
                    c10 = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals(StubApp.getString2(468))) {
                    c10 = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals(StubApp.getString2(1629))) {
                    c10 = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals(StubApp.getString2(3955))) {
                    c10 = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals(StubApp.getString2(21267))) {
                    c10 = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals(StubApp.getString2(935))) {
                    c10 = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals(StubApp.getString2(1623))) {
                    c10 = '\b';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals(StubApp.getString2(1609))) {
                    c10 = '\t';
                    break;
                }
                break;
            case 1505942594:
                if (str.equals(StubApp.getString2(3208))) {
                    c10 = '\n';
                    break;
                }
                break;
            case 1556697186:
                if (str.equals(StubApp.getString2(19291))) {
                    c10 = 11;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (f10 = f(str2)) == null) {
                    return 0;
                }
                return f10.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case '\b':
                return 9;
            case '\t':
                return 20;
            case '\n':
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    public static String d(String str) {
        Z9.A f10;
        String str2 = null;
        if (str != null) {
            String y10 = AbstractC0624h2.y(str.trim());
            if (y10.startsWith(StubApp.getString2(1732)) || y10.startsWith(StubApp.getString2(3982))) {
                return StubApp.getString2(469);
            }
            if (y10.startsWith(StubApp.getString2(1730)) || y10.startsWith(StubApp.getString2(1729))) {
                return StubApp.getString2(1610);
            }
            if (y10.startsWith(StubApp.getString2(21492)) || y10.startsWith(StubApp.getString2(21493)) || y10.startsWith(StubApp.getString2(3983)) || y10.startsWith(StubApp.getString2(21494))) {
                return StubApp.getString2(1613);
            }
            if (y10.startsWith(StubApp.getString2(1733))) {
                return StubApp.getString2(1683);
            }
            if (y10.startsWith(StubApp.getString2(21495)) || y10.startsWith(StubApp.getString2(1726))) {
                return StubApp.getString2(1614);
            }
            if (y10.startsWith(StubApp.getString2(21496)) || y10.startsWith(StubApp.getString2(21497))) {
                return StubApp.getString2(2391);
            }
            if (y10.startsWith(StubApp.getString2(1728))) {
                if (y10.startsWith(StubApp.getString2(21498)) && (f10 = f(y10)) != null) {
                    str2 = e(f10.f9069b);
                }
                return str2 == null ? StubApp.getString2(468) : str2;
            }
            if (y10.startsWith(StubApp.getString2(21499))) {
                return StubApp.getString2(21268);
            }
            if (y10.startsWith(StubApp.getString2(21500))) {
                return StubApp.getString2(21266);
            }
            if (y10.startsWith(StubApp.getString2(3197)) || y10.startsWith(StubApp.getString2(3198))) {
                return StubApp.getString2(1629);
            }
            if (y10.startsWith(StubApp.getString2(3199)) || y10.startsWith(StubApp.getString2(3200))) {
                return StubApp.getString2(935);
            }
            if (y10.startsWith(StubApp.getString2(937))) {
                return StubApp.getString2(938);
            }
            if (y10.startsWith(StubApp.getString2(21501)) || y10.startsWith(StubApp.getString2(21502))) {
                return StubApp.getString2(3955);
            }
            if (y10.startsWith(StubApp.getString2(3201))) {
                return StubApp.getString2(3202);
            }
            if (y10.startsWith(StubApp.getString2(3205))) {
                return StubApp.getString2(3206);
            }
            if (y10.startsWith(StubApp.getString2(3203)) || y10.startsWith(StubApp.getString2(3204))) {
                return StubApp.getString2(3208);
            }
            if (y10.startsWith(StubApp.getString2(21503))) {
                return StubApp.getString2(21267);
            }
            if (y10.startsWith(StubApp.getString2(3207))) {
                return StubApp.getString2(1609);
            }
            if (y10.startsWith(StubApp.getString2(21504))) {
                return StubApp.getString2(1626);
            }
            if (y10.startsWith(StubApp.getString2(21505))) {
                return StubApp.getString2(1627);
            }
            if (y10.startsWith(StubApp.getString2(21506))) {
                return StubApp.getString2(3209);
            }
            if (y10.startsWith(StubApp.getString2(21507))) {
                return StubApp.getString2(519);
            }
            if (y10.contains(StubApp.getString2(21508))) {
                return StubApp.getString2(503);
            }
            if (y10.contains(StubApp.getString2(21509)) || y10.contains(StubApp.getString2(21510))) {
                return StubApp.getString2(467);
            }
            ArrayList arrayList = f18019a;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    public static String e(int i3) {
        if (i3 == 32) {
            return StubApp.getString2(2392);
        }
        if (i3 == 33) {
            return StubApp.getString2(469);
        }
        if (i3 == 35) {
            return StubApp.getString2(1610);
        }
        if (i3 != 64) {
            if (i3 == 163) {
                return StubApp.getString2(19287);
            }
            if (i3 == 177) {
                return StubApp.getString2(1614);
            }
            if (i3 == 221) {
                return StubApp.getString2(1626);
            }
            if (i3 == 165) {
                return StubApp.getString2(1629);
            }
            if (i3 == 166) {
                return StubApp.getString2(935);
            }
            switch (i3) {
                case 96:
                case 97:
                case 98:
                case LogPriority.NONE /* 99 */:
                case 100:
                case 101:
                    return StubApp.getString2(19283);
                case 102:
                case 103:
                case 104:
                    break;
                case 105:
                case 107:
                    return StubApp.getString2(1623);
                case 106:
                    return StubApp.getString2(21294);
                case 108:
                    return StubApp.getString2(6953);
                default:
                    switch (i3) {
                        case 169:
                        case 172:
                            return StubApp.getString2(3202);
                        case 170:
                        case 171:
                            return StubApp.getString2(3208);
                        case 173:
                            return StubApp.getString2(1609);
                        case 174:
                            return StubApp.getString2(3955);
                        default:
                            return null;
                    }
            }
        }
        return StubApp.getString2(468);
    }

    public static Z9.A f(String str) {
        Matcher matcher = f18020b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new Z9.A(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0, 4);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String g(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int h(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (i(str)) {
            return 1;
        }
        if (l(str)) {
            return 2;
        }
        if (k(str)) {
            return 3;
        }
        if (j(str)) {
            return 4;
        }
        if (StubApp.getString2(474).equals(str) || StubApp.getString2(494).equals(str) || StubApp.getString2(2004).equals(str) || StubApp.getString2(2005).equals(str) || StubApp.getString2(2006).equals(str)) {
            return 5;
        }
        if (StubApp.getString2(5923).equals(str)) {
            return 6;
        }
        ArrayList arrayList = f18019a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }

    public static boolean i(String str) {
        return StubApp.getString2(643).equals(g(str));
    }

    public static boolean j(String str) {
        return StubApp.getString2(1483).equals(g(str)) || StubApp.getString2(3317).equals(str);
    }

    public static boolean k(String str) {
        return StubApp.getString2(613).equals(g(str)) || StubApp.getString2(462).equals(str) || StubApp.getString2(467).equals(str) || StubApp.getString2(503).equals(str) || StubApp.getString2(3654).equals(str) || StubApp.getString2(19279).equals(str) || StubApp.getString2(3209).equals(str) || StubApp.getString2(19592).equals(str) || StubApp.getString2(19593).equals(str) || StubApp.getString2(21511).equals(str) || StubApp.getString2(19275).equals(str) || StubApp.getString2(19276).equals(str) || StubApp.getString2(19274).equals(str);
    }

    public static boolean l(String str) {
        return StubApp.getString2(3235).equals(g(str));
    }

    public static String m(String str) {
        if (str == null) {
            return null;
        }
        String y10 = AbstractC0624h2.y(str);
        y10.getClass();
        char c10 = 65535;
        switch (y10.hashCode()) {
            case -1833600100:
                if (y10.equals(StubApp.getString2(1700))) {
                    c10 = 0;
                    break;
                }
                break;
            case -1007807498:
                if (y10.equals(StubApp.getString2(21517))) {
                    c10 = 1;
                    break;
                }
                break;
            case -979095690:
                if (y10.equals(StubApp.getString2(21516))) {
                    c10 = 2;
                    break;
                }
                break;
            case -586683234:
                if (y10.equals(StubApp.getString2(21515))) {
                    c10 = 3;
                    break;
                }
                break;
            case -432836268:
                if (y10.equals(StubApp.getString2(21514))) {
                    c10 = 4;
                    break;
                }
                break;
            case -432836267:
                if (y10.equals(StubApp.getString2(21513))) {
                    c10 = 5;
                    break;
                }
                break;
            case 187090231:
                if (y10.equals(StubApp.getString2(21512))) {
                    c10 = 6;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return StubApp.getString2(1611);
            case 1:
                return StubApp.getString2(1627);
            case 2:
                return StubApp.getString2(825);
            case 3:
                return StubApp.getString2(21518);
            case 4:
                return StubApp.getString2(6095);
            case 5:
                return StubApp.getString2(6094);
            case 6:
                return StubApp.getString2(1623);
            default:
                return y10;
        }
    }
}
