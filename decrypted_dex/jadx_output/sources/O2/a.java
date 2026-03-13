package O2;

import A.i;
import Ec.l;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.stub.StubApp;
import ic.C1070a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final List f5195a = CollectionsKt.listOf((Object[]) new String[]{StubApp.getString2(3992), StubApp.getString2(3722), StubApp.getString2(3993), StubApp.getString2(3994), StubApp.getString2(3995), StubApp.getString2(3990), StubApp.getString2(3991), StubApp.getString2(3519), StubApp.getString2(3996)});

    public static String a(Context context, String packageName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        try {
            PackageManager packageManager = context.getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "getPackageManager(...)");
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            CharSequence applicationLabel = packageManager.getApplicationLabel(applicationInfo);
            Intrinsics.checkNotNull(applicationLabel, "null cannot be cast to non-null type kotlin.String");
            return (String) applicationLabel;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(StubApp.getString2(3997), StubApp.getString2(3998), e10);
            return "";
        }
    }

    public static char b(String s10) {
        Intrinsics.checkNotNullParameter(s10, "s");
        if (s10.length() <= 0) {
            return (char) 0;
        }
        a5.c cVar = new a5.c(9, false);
        cVar.f9283c = C1070a.f15014b;
        cVar.f9284d = C1070a.f15015c;
        cVar.f9282b = C1070a.f15018f;
        try {
            String[] v2 = l.v(s10.charAt(0), cVar);
            Intrinsics.checkNotNull(v2);
            return v2.length == 0 ? Character.toLowerCase(s10.charAt(0)) : v2[0].charAt(0);
        } catch (Exception unused) {
            return Character.toLowerCase(s10.charAt(0));
        }
    }

    public static Map c(LinkedHashMap map) {
        List list;
        List<Pair> sortedWith;
        Intrinsics.checkNotNullParameter(map, "map");
        if (map.isEmpty()) {
            return map;
        }
        list = MapsKt___MapsKt.toList(map);
        sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new i(2));
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.f(sortedWith)), 16));
        for (Pair pair : sortedWith) {
            Pair pair2 = TuplesKt.to(pair.getFirst(), pair.getSecond());
            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
        }
        return linkedHashMap;
    }
}
