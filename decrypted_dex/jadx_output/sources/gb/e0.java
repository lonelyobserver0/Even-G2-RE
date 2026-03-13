package gb;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.stub.StubApp;
import java.util.ArrayList;
import kotlin.text.Typography;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14330a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f14331b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14332c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f14333d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f14334e;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f14335f;

    /* renamed from: g, reason: collision with root package name */
    public final f0 f14336g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f14337h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14338i;
    public final p2.h j;

    /* renamed from: k, reason: collision with root package name */
    public final String[] f14339k;

    /* renamed from: l, reason: collision with root package name */
    public final e0[] f14340l;

    public e0(boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, g0 g0Var, f0 f0Var, Integer num, String str, p2.h hVar, String[] strArr, e0[] e0VarArr) {
        this.f14330a = z2;
        this.f14331b = z10;
        this.f14332c = z11;
        this.f14333d = z12;
        this.f14334e = z13;
        this.f14335f = g0Var;
        this.f14336g = f0Var;
        this.f14337h = num;
        this.f14338i = str;
        this.j = hVar;
        this.f14339k = strArr;
        this.f14340l = e0VarArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static e0 a(JSONObject jSONObject) {
        int i3;
        int i10;
        e0[] e0VarArr;
        int i11;
        Integer num;
        String string2;
        String str;
        p2.h hVar;
        int i12;
        char c10;
        String string22 = StubApp.getString2(17898);
        String string23 = StubApp.getString2(17899);
        String string24 = StubApp.getString2(17900);
        String string25 = StubApp.getString2(17901);
        String string26 = StubApp.getString2(17902);
        String string27 = StubApp.getString2(17903);
        String string28 = StubApp.getString2(17904);
        String string29 = StubApp.getString2(17905);
        String string210 = StubApp.getString2(17906);
        String string211 = StubApp.getString2(17907);
        String string212 = StubApp.getString2(ModuleDescriptor.MODULE_VERSION);
        String string = jSONObject.getString(StubApp.getString2(17908));
        if (string == null) {
            throw new JSONException(StubApp.getString2(17991));
        }
        String string213 = StubApp.getString2(17909);
        if (jSONObject.isNull(string213)) {
            i3 = 0;
            i10 = 1;
            e0VarArr = null;
        } else {
            JSONArray jSONArray = jSONObject.getJSONArray(string213);
            i3 = 0;
            int length = jSONArray.length();
            i10 = 1;
            e0[] e0VarArr2 = new e0[length];
            for (int i13 = 0; i13 < length; i13++) {
                e0VarArr2[i13] = a(jSONArray.getJSONObject(i13));
            }
            e0VarArr = e0VarArr2;
        }
        int valueOf = Integer.valueOf(i10);
        Integer valueOf2 = Integer.valueOf(i3);
        switch (string.hashCode()) {
            case -737377923:
                if (string.equals(StubApp.getString2(17917))) {
                    i11 = i3;
                    break;
                }
                i11 = -1;
                break;
            case -737089298:
                if (string.equals(StubApp.getString2(17916))) {
                    i11 = i10;
                    break;
                }
                i11 = -1;
                break;
            case -737080013:
                if (string.equals(StubApp.getString2(17915))) {
                    i11 = 2;
                    break;
                }
                i11 = -1;
                break;
            case -736940669:
                if (string.equals(StubApp.getString2(17914))) {
                    i11 = 3;
                    break;
                }
                i11 = -1;
                break;
            case 469250275:
                if (string.equals(StubApp.getString2(17913))) {
                    i11 = 4;
                    break;
                }
                i11 = -1;
                break;
            case 1241689507:
                if (string.equals(StubApp.getString2(17912))) {
                    i11 = 5;
                    break;
                }
                i11 = -1;
                break;
            case 1539450297:
                if (string.equals(StubApp.getString2(17911))) {
                    i11 = 6;
                    break;
                }
                i11 = -1;
                break;
            case 2110497650:
                if (string.equals(StubApp.getString2(17910))) {
                    i11 = 7;
                    break;
                }
                i11 = -1;
                break;
            default:
                i11 = -1;
                break;
        }
        switch (i11) {
            case 0:
                valueOf = 6;
                num = valueOf;
                break;
            case 1:
                valueOf = 5;
                num = valueOf;
                break;
            case 2:
            case 6:
                num = valueOf;
                break;
            case 3:
                valueOf = 4;
                num = valueOf;
                break;
            case 4:
                valueOf = 3;
                num = valueOf;
                break;
            case 5:
                valueOf = 2;
                num = valueOf;
                break;
            case 7:
                valueOf = 7;
                num = valueOf;
                break;
            default:
                num = valueOf2;
                break;
        }
        ArrayList arrayList = new ArrayList();
        String string214 = StubApp.getString2(17918);
        JSONArray jSONArray2 = jSONObject.isNull(string214) ? null : jSONObject.getJSONArray(string214);
        if (jSONArray2 != null) {
            for (int i14 = i3; i14 < jSONArray2.length(); i14++) {
                arrayList.add(jSONArray2.optString(i14));
            }
        }
        boolean optBoolean = jSONObject.optBoolean(StubApp.getString2(17919));
        boolean optBoolean2 = jSONObject.optBoolean(StubApp.getString2(17920), i10);
        boolean optBoolean3 = jSONObject.optBoolean(StubApp.getString2(17921));
        boolean optBoolean4 = jSONObject.optBoolean(StubApp.getString2(17922));
        boolean optBoolean5 = jSONObject.optBoolean(StubApp.getString2(17923));
        String string3 = jSONObject.getString(StubApp.getString2(17924));
        g0[] values = g0.values();
        int length2 = values.length;
        int i15 = i3;
        while (i15 < length2) {
            int i16 = i15;
            g0 g0Var = values[i16];
            int i17 = length2;
            if (g0Var.f14349a.equals(string3)) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(StubApp.getString2(17925));
                String string4 = jSONObject2.getString(string212);
                int[] d8 = AbstractC1856e.d(13);
                String str2 = string211;
                int length3 = d8.length;
                int i18 = i3;
                while (i18 < length3) {
                    int i19 = length3;
                    int i20 = d8[i18];
                    switch (i20) {
                        case 1:
                            string2 = StubApp.getString2(17938);
                            break;
                        case 2:
                            string2 = StubApp.getString2(17937);
                            break;
                        case 3:
                            string2 = StubApp.getString2(17936);
                            break;
                        case 4:
                            string2 = StubApp.getString2(17935);
                            break;
                        case 5:
                            string2 = StubApp.getString2(17934);
                            break;
                        case 6:
                            string2 = StubApp.getString2(17933);
                            break;
                        case 7:
                            string2 = StubApp.getString2(17932);
                            break;
                        case 8:
                            string2 = StubApp.getString2(17931);
                            break;
                        case 9:
                            string2 = StubApp.getString2(17930);
                            break;
                        case 10:
                            string2 = StubApp.getString2(17929);
                            break;
                        case 11:
                            string2 = StubApp.getString2(17928);
                            break;
                        case 12:
                            string2 = StubApp.getString2(17927);
                            break;
                        case 13:
                            string2 = StubApp.getString2(17926);
                            break;
                        default:
                            throw null;
                    }
                    int i21 = i18;
                    if (string2.equals(string4)) {
                        boolean z2 = i3;
                        String str3 = string210;
                        f0 f0Var = new f0(i20, jSONObject2.optBoolean(StubApp.getString2(17939), z2), jSONObject2.optBoolean(StubApp.getString2(17940), z2));
                        String string215 = StubApp.getString2(17941);
                        String string5 = jSONObject.isNull(string215) ? null : jSONObject.getString(string215);
                        String string216 = StubApp.getString2(17942);
                        if (jSONObject.isNull(string216)) {
                            str = string5;
                            hVar = null;
                        } else {
                            JSONObject jSONObject3 = jSONObject.getJSONObject(string216);
                            String string6 = jSONObject3.getString(StubApp.getString2(17943));
                            JSONArray jSONArray3 = jSONObject3.getJSONArray(StubApp.getString2(17944));
                            String string217 = StubApp.getString2(17945);
                            String string7 = jSONObject3.isNull(string217) ? null : jSONObject3.getString(string217);
                            JSONObject jSONObject4 = jSONObject3.getJSONObject(StubApp.getString2(17946));
                            String[] strArr = new String[jSONArray3.length()];
                            str = string5;
                            int i22 = 0;
                            while (i22 < jSONArray3.length()) {
                                String string8 = jSONArray3.getString(i22);
                                string8.getClass();
                                switch (string8.hashCode()) {
                                    case -2058889126:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17966))) {
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -1917283616:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17965))) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -1844815832:
                                        i12 = i22;
                                        if (string8.equals(str2)) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -1825589953:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17964))) {
                                            c10 = 3;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -1821235109:
                                        i12 = i22;
                                        String str4 = str3;
                                        if (string8.equals(str4)) {
                                            str3 = str4;
                                            c10 = 4;
                                            break;
                                        } else {
                                            str3 = str4;
                                            c10 = 65535;
                                            break;
                                        }
                                    case -1757573738:
                                        i12 = i22;
                                        if (string8.equals(string29)) {
                                            c10 = 5;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -1682373820:
                                        i12 = i22;
                                        if (string8.equals(string28)) {
                                            c10 = 6;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -1658955742:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17963))) {
                                            c10 = 7;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -1567118045:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17962))) {
                                            c10 = '\b';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -1476752575:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17961))) {
                                            c10 = '\t';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -1413737489:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17960))) {
                                            c10 = '\n';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -1377792129:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17959))) {
                                            c10 = 11;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -1249512767:
                                        i12 = i22;
                                        if (string8.equals(string27)) {
                                            c10 = '\f';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -1186060294:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17958))) {
                                            c10 = '\r';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -1151034798:
                                        i12 = i22;
                                        if (string8.equals(string26)) {
                                            c10 = 14;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -835992323:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17957))) {
                                            c10 = 15;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -818219584:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17956))) {
                                            c10 = 16;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -747304516:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17955))) {
                                            c10 = 17;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -613980922:
                                        i12 = i22;
                                        if (string8.equals(string25)) {
                                            c10 = 18;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -613352043:
                                        i12 = i22;
                                        if (string8.equals(string24)) {
                                            c10 = 19;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -549230602:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17954))) {
                                            c10 = 20;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case -265713450:
                                        i12 = i22;
                                        if (string8.equals(string23)) {
                                            c10 = 21;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 3373707:
                                        i12 = i22;
                                        if (string8.equals(string212)) {
                                            c10 = 22;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 96619420:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(11427))) {
                                            c10 = 23;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 253202685:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17953))) {
                                            c10 = 24;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 588174851:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17952))) {
                                            c10 = 25;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 798554127:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(11429))) {
                                            c10 = 26;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 892233837:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17951))) {
                                            c10 = 27;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 991032982:
                                        i12 = i22;
                                        if (string8.equals(string22)) {
                                            c10 = 28;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 1069376125:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17950))) {
                                            c10 = 29;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 1216985755:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(6750))) {
                                            c10 = 30;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 1469046696:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(11428))) {
                                            c10 = 31;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 1662667945:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17949))) {
                                            c10 = ' ';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 1921869058:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17948))) {
                                            c10 = '!';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2011152728:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(7505))) {
                                            c10 = Typography.quote;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 2011773919:
                                        i12 = i22;
                                        if (string8.equals(StubApp.getString2(17947))) {
                                            c10 = '#';
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    default:
                                        i12 = i22;
                                        c10 = 65535;
                                        break;
                                }
                                switch (c10) {
                                    case 0:
                                        string8 = StubApp.getString2(17988);
                                        break;
                                    case 1:
                                        string8 = StubApp.getString2(17987);
                                        break;
                                    case 2:
                                        string8 = str2;
                                        break;
                                    case 3:
                                        string8 = StubApp.getString2(17986);
                                        break;
                                    case 4:
                                        string8 = str3;
                                        break;
                                    case 5:
                                        string8 = string29;
                                        break;
                                    case 6:
                                        string8 = string28;
                                        break;
                                    case 7:
                                        string8 = StubApp.getString2(17985);
                                        break;
                                    case '\b':
                                        string8 = StubApp.getString2(17984);
                                        break;
                                    case '\t':
                                        string8 = StubApp.getString2(17983);
                                        break;
                                    case '\n':
                                        string8 = StubApp.getString2(17982);
                                        break;
                                    case 11:
                                        string8 = StubApp.getString2(17981);
                                        break;
                                    case '\f':
                                        string8 = string27;
                                        break;
                                    case '\r':
                                        string8 = StubApp.getString2(17980);
                                        break;
                                    case 14:
                                        string8 = string26;
                                        break;
                                    case 15:
                                        string8 = StubApp.getString2(17979);
                                        break;
                                    case 16:
                                        string8 = StubApp.getString2(17978);
                                        break;
                                    case 17:
                                        string8 = StubApp.getString2(17977);
                                        break;
                                    case 18:
                                        string8 = string25;
                                        break;
                                    case 19:
                                        string8 = string24;
                                        break;
                                    case 20:
                                        string8 = StubApp.getString2(17976);
                                        break;
                                    case 21:
                                        string8 = string23;
                                        break;
                                    case 22:
                                        string8 = StubApp.getString2(17975);
                                        break;
                                    case 23:
                                        string8 = StubApp.getString2(9754);
                                        break;
                                    case 24:
                                        string8 = StubApp.getString2(17974);
                                        break;
                                    case 25:
                                        string8 = StubApp.getString2(17973);
                                        break;
                                    case 26:
                                        string8 = StubApp.getString2(17972);
                                        break;
                                    case 27:
                                        string8 = StubApp.getString2(17971);
                                        break;
                                    case 28:
                                        string8 = string22;
                                        break;
                                    case 29:
                                        string8 = StubApp.getString2(17970);
                                        break;
                                    case 30:
                                        string8 = StubApp.getString2(6750);
                                        break;
                                    case 31:
                                        string8 = StubApp.getString2(17969);
                                        break;
                                    case ' ':
                                        string8 = StubApp.getString2(17949);
                                        break;
                                    case '!':
                                        string8 = StubApp.getString2(17968);
                                        break;
                                    case '\"':
                                        string8 = StubApp.getString2(7505);
                                        break;
                                    case '#':
                                        string8 = StubApp.getString2(17967);
                                        break;
                                }
                                strArr[i12] = string8;
                                i22 = i12 + 1;
                            }
                            h0 a3 = h0.a(jSONObject4);
                            p2.h hVar2 = new p2.h();
                            hVar2.f19671a = string6;
                            hVar2.f19672b = strArr;
                            hVar2.f19674d = string7;
                            hVar2.f19673c = a3;
                            hVar = hVar2;
                        }
                        return new e0(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, g0Var, f0Var, num, str, hVar, (String[]) arrayList.toArray(new String[arrayList.size()]), e0VarArr);
                    }
                    i18 = i21 + 1;
                    string210 = string210;
                    length3 = i19;
                }
                throw new NoSuchFieldException(E1.a.j(StubApp.getString2(17989), string4));
            }
            i15 = i16 + 1;
            string210 = string210;
            length2 = i17;
            string211 = string211;
        }
        throw new NoSuchFieldException(E1.a.j(StubApp.getString2(17990), string3));
    }
}
