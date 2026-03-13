package E1;

import D7.c;
import T0.H;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import com.stub.StubApp;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import o0.C1437l;
import o0.C1438m;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.DERSequence;
import w.AbstractC1856e;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract /* synthetic */ class a {
    public static final String a(int i3) {
        int c10 = AbstractC1856e.c(i3);
        if (c10 == 0) {
            return StubApp.getString2(1781);
        }
        if (c10 == 1) {
            return StubApp.getString2(1780);
        }
        if (c10 == 2) {
            return StubApp.getString2(1779);
        }
        if (c10 == 3) {
            return StubApp.getString2(1778);
        }
        if (c10 == 4) {
            return StubApp.getString2(1777);
        }
        if (c10 == 5) {
            return StubApp.getString2(1776);
        }
        throw new IndexOutOfBoundsException();
    }

    public static final String b(int i3) {
        int c10 = AbstractC1856e.c(i3);
        if (c10 == 0) {
            return StubApp.getString2(1787);
        }
        if (c10 == 1) {
            return StubApp.getString2(1786);
        }
        if (c10 == 2) {
            return StubApp.getString2(1785);
        }
        if (c10 == 3) {
            return StubApp.getString2(1784);
        }
        if (c10 == 4) {
            return StubApp.getString2(1783);
        }
        if (c10 == 5) {
            return StubApp.getString2(1782);
        }
        throw new IndexOutOfBoundsException();
    }

    public static float c(float f10, float f11, float f12, float f13) {
        return ((f10 - f11) * f12) + f13;
    }

    public static int d(double d8, int i3, int i10) {
        return (Double.hashCode(d8) + i3) * i10;
    }

    public static int e(int i3, int i10, int i11) {
        return (Integer.hashCode(i3) + i10) * i11;
    }

    public static int f(int i3, int i10, int i11, int i12) {
        return ((i3 - i10) * i11) + i12;
    }

    public static int g(int i3, int i10, List list) {
        return (list.hashCode() + i3) * i10;
    }

    public static String h(Object obj, String str) {
        return str.concat(obj.getClass().getName());
    }

    public static String i(String str, Exception exc) {
        return str + exc;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String l(String str, StringBuilder sb2, List list) {
        sb2.append(list);
        sb2.append(str);
        return sb2.toString();
    }

    public static String m(String str, Throwable th, String str2, String str3) {
        return str + th + str2 + str3;
    }

    public static String n(StringBuilder sb2, String str, String str2, String str3) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static HashMap o(Class cls, s5.a aVar) {
        HashMap hashMap = new HashMap();
        hashMap.put(cls, aVar);
        return hashMap;
    }

    public static Map p(HashMap hashMap) {
        return Collections.unmodifiableMap(new HashMap(hashMap));
    }

    public static Pair q(int i3, boolean z2, D7.b bVar) {
        return TuplesKt.to(bVar, new c(i3, z2));
    }

    public static ASN1EncodableVector r(ASN1EncodableVector aSN1EncodableVector, ASN1EncodableVector aSN1EncodableVector2) {
        aSN1EncodableVector2.add(new DERSequence(aSN1EncodableVector));
        return new ASN1EncodableVector();
    }

    public static void s(JsonElement jsonElement, Gson gson, JsonWriter jsonWriter, JsonElement jsonElement2) {
        gson.getAdapter(jsonElement.getClass()).write(jsonWriter, jsonElement2);
    }

    public static void t(JsonElement jsonElement, LinkedHashMap linkedHashMap, String str) {
        linkedHashMap.put(str, new com.mapbox.auto.value.gson.b(jsonElement));
    }

    public static void u(String str, String str2, String str3) {
        R2.c.c(str3, str + str2);
    }

    public static void v(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
    }

    public static void w(C1437l c1437l, H h2) {
        h2.d(new C1438m(c1437l));
    }

    public static /* synthetic */ String x(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 3 ? StubApp.getString2(1116) : StubApp.getString2(1788) : StubApp.getString2(1789) : StubApp.getString2(1790);
    }
}
