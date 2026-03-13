package F7;

import com.mapbox.api.directions.v5.models.LegAnnotation;
import com.mapbox.api.directions.v5.models.Notification;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c {
    public static ArrayList a(int i3, List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.f(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Notification notification = (Notification) it.next();
            Notification.Builder builder = notification.toBuilder();
            Integer geometryIndex = notification.geometryIndex();
            if (geometryIndex != null) {
                builder.geometryIndex(Integer.valueOf(geometryIndex.intValue() + i3));
            }
            Integer geometryIndexStart = notification.geometryIndexStart();
            if (geometryIndexStart != null) {
                builder.geometryIndexStart(Integer.valueOf(geometryIndexStart.intValue() + i3));
            }
            Integer geometryIndexEnd = notification.geometryIndexEnd();
            if (geometryIndexEnd != null) {
                builder.geometryIndexEnd(Integer.valueOf(geometryIndexEnd.intValue() + i3));
            }
            Notification build = builder.build();
            Intrinsics.checkNotNullExpressionValue(build, "notification.toBuilder()…      }\n        }.build()");
            arrayList.add(build);
        }
        return arrayList;
    }

    public static ArrayList b(int i3, int i10, List list) {
        Integer geometryIndex;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Notification notification = (Notification) it.next();
            if (Intrinsics.areEqual(notification.refreshType(), "dynamic") && ((geometryIndex = notification.geometryIndex()) == null || (geometryIndex.intValue() >= i3 && geometryIndex.intValue() <= i10))) {
                notification = null;
            }
            if (notification != null) {
                arrayList.add(notification);
            }
        }
        return arrayList;
    }

    public static ArrayList c(LegAnnotation legAnnotation, LegAnnotation legAnnotation2, int i3, int i10, int i11, Function1 function1) {
        List list = (List) function1.invoke(legAnnotation);
        if (list == null) {
            return null;
        }
        List list2 = legAnnotation2 != null ? (List) function1.invoke(legAnnotation2) : null;
        if (list2 == null) {
            list2 = CollectionsKt.emptyList();
        }
        int size = list.size();
        if (size < i3) {
            D9.l.e(StubApp.getString2(2124) + i3 + StubApp.getString2(2125) + size, StubApp.getString2(2126));
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < i3; i12++) {
            arrayList.add(list.get(i12));
        }
        int min = Math.min(size - i3, list2.size());
        for (int i13 = 0; i13 < min; i13++) {
            arrayList.add(list2.get(i13));
        }
        int size2 = arrayList.size();
        int i14 = size - size2;
        for (int i15 = 0; i15 < i14; i15++) {
            arrayList.add(list.get(i15 + size2));
        }
        if (i10 > 0) {
            Iterator<Integer> it = new IntRange(i11, RangesKt.coerceAtMost((i10 + i11) - 1, size)).iterator();
            while (it.hasNext()) {
                int nextInt = ((IntIterator) it).nextInt();
                arrayList.set(nextInt, list.get(nextInt));
            }
        }
        return arrayList;
    }
}
