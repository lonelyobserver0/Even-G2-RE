package m9;

import Z9.C0366a;
import com.mapbox.api.directions.v5.models.DirectionsRoute;
import com.mapbox.navigation.base.route.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: m9.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C1289c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17267a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f17268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f17269c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1289c(List list, e eVar) {
        super(0);
        this.f17269c = list;
        this.f17268b = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List f10;
        switch (this.f17267a) {
            case 0:
                List list = this.f17269c;
                boolean isEmpty = list.isEmpty();
                e eVar = this.f17268b;
                if (isEmpty) {
                    eVar.getClass();
                    eVar.f17276e = CollectionsKt.emptyList();
                    eVar.f17273b.z(CollectionsKt.emptyList());
                    d dVar = new d(eVar, 1);
                    if (eVar.f17285o) {
                        dVar.invoke();
                    }
                } else {
                    ArrayList arrayList = new ArrayList();
                    int i3 = 0;
                    for (Object obj : list) {
                        int i10 = i3 + 1;
                        if (i3 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        g gVar = (g) obj;
                        if (i3 != 0) {
                            eVar.f17274c.getClass();
                            f10 = null;
                        } else {
                            DirectionsRoute route = gVar.f12498a;
                            Intrinsics.checkNotNullParameter(route, "route");
                            f10 = i8.d.f(route);
                        }
                        if (f10 != null) {
                            arrayList.add(f10);
                        }
                        i3 = i10;
                    }
                    C0366a c0366a = eVar.f17273b;
                    eVar.f17274c.getClass();
                    c0366a.z(CollectionsKt.take(list, 1));
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.f(arrayList));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        List<List> completeRoutePoints = (List) it.next();
                        Object obj2 = ((C0366a) eVar.f17275d.f8675c).f9105b;
                        Intrinsics.checkNotNullParameter(completeRoutePoints, "completeRoutePoints");
                        ArrayList arrayList3 = new ArrayList(CollectionsKt.f(completeRoutePoints));
                        for (List<List> list2 : completeRoutePoints) {
                            ArrayList arrayList4 = new ArrayList(CollectionsKt.f(list2));
                            for (List list3 : list2) {
                                ArrayList arrayList5 = new ArrayList();
                                int i11 = 0;
                                for (Object obj3 : list3) {
                                    int i12 = i11 + 1;
                                    if (i11 < 0) {
                                        CollectionsKt.throwIndexOverflow();
                                    }
                                    if (i11 % 25 == 0 || i11 == list3.size() - 1) {
                                        arrayList5.add(obj3);
                                    }
                                    i11 = i12;
                                }
                                arrayList4.add(arrayList5);
                            }
                            arrayList3.add(arrayList4);
                        }
                        arrayList2.add(arrayList3);
                    }
                    eVar.f17277f = arrayList2;
                    eVar.f17278g = CollectionsKt.flatten(CollectionsKt.flatten(CollectionsKt.flatten(arrayList2)));
                }
                break;
            default:
                this.f17268b.getClass();
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1289c(e eVar, List list) {
        super(0);
        this.f17268b = eVar;
        this.f17269c = list;
    }
}
