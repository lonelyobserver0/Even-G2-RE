package E6;

import C2.i;
import com.google.gson.JsonElement;
import com.mapbox.geojson.Point;
import com.stub.StubApp;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import u5.d;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final i f1924a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final d f1925b = new d(6);

    /* renamed from: c, reason: collision with root package name */
    public static final a f1926c = new a();

    public static String a(double d8) {
        return new DecimalFormat(StubApp.getString2(1879), new DecimalFormatSymbols(Locale.US)).format(d8);
    }

    public static String b(List list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Point point = (Point) it.next();
            if (point == null) {
                arrayList.add(null);
            } else {
                Locale locale = Locale.US;
                arrayList.add(a(point.longitude()) + StubApp.getString2(321) + a(point.latitude()));
            }
        }
        return d(StubApp.getString2(1262), arrayList);
    }

    public static HashMap c(Map map) {
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            hashMap.put(str, ((com.mapbox.auto.value.gson.b) map.get(str)).f12374a);
        }
        return hashMap;
    }

    public static String d(String str, List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        boolean z2 = true;
        for (int i3 = 0; i3 <= list.size() - 1; i3++) {
            if (z2) {
                z2 = false;
            } else {
                sb2.append((CharSequence) str);
            }
            Object obj = list.get(i3);
            if (obj != null) {
                sb2.append(obj);
            }
        }
        return sb2.toString();
    }

    public static ArrayList e(String str, b bVar) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(StubApp.getString2(1262), -1)) {
            if (str2.isEmpty()) {
                arrayList.add(null);
            } else {
                arrayList.add(bVar.i(str2));
            }
        }
        return arrayList;
    }

    public static HashMap f(Map map) {
        if (map == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((String) entry.getKey(), new com.mapbox.auto.value.gson.b((JsonElement) entry.getValue()));
        }
        return hashMap;
    }
}
