package d;

import android.util.Log;
import com.stub.StubApp;
import d0.C0766D;
import d0.L;
import d0.M;
import d0.Z;
import d0.a0;
import d0.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class t extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f13102b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(z zVar, int i3) {
        super(1);
        this.f13101a = i3;
        this.f13102b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        Set set;
        Object obj3;
        switch (this.f13101a) {
            case 0:
                Intrinsics.checkNotNullParameter((C0759a) obj, "backEvent");
                z zVar = this.f13102b;
                ArrayDeque arrayDeque = zVar.f13117b;
                ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((C0766D) obj2).f13128a) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                C0766D c0766d = (C0766D) obj2;
                if (zVar.f13118c != null) {
                    zVar.a();
                }
                zVar.f13118c = c0766d;
                if (c0766d != null) {
                    boolean J10 = M.J(3);
                    M m4 = c0766d.f13131d;
                    if (J10) {
                        Log.d(StubApp.getString2(49), StubApp.getString2(16430) + m4);
                    }
                    m4.w();
                    m4.x(new L(m4), false);
                }
                return Unit.INSTANCE;
            default:
                C0759a backEvent = (C0759a) obj;
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                z zVar2 = this.f13102b;
                C0766D c0766d2 = zVar2.f13118c;
                if (c0766d2 == null) {
                    ArrayDeque arrayDeque2 = zVar2.f13117b;
                    ListIterator<E> listIterator2 = arrayDeque2.listIterator(arrayDeque2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            obj3 = listIterator2.previous();
                            if (((C0766D) obj3).f13128a) {
                            }
                        } else {
                            obj3 = null;
                        }
                    }
                    c0766d2 = (C0766D) obj3;
                }
                if (c0766d2 != null) {
                    boolean J11 = M.J(2);
                    String string2 = StubApp.getString2(49);
                    M m10 = c0766d2.f13131d;
                    if (J11) {
                        Log.v(string2, StubApp.getString2(16428) + m10);
                    }
                    if (m10.f13165h != null) {
                        Iterator it = m10.f(new ArrayList(Collections.singletonList(m10.f13165h)), 0, 1).iterator();
                        while (it.hasNext()) {
                            e0 e0Var = (e0) it.next();
                            e0Var.getClass();
                            Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                            if (M.J(2)) {
                                Log.v(string2, StubApp.getString2(16429) + backEvent.f13048c);
                            }
                            ArrayList arrayList = e0Var.f13300c;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                CollectionsKt__MutableCollectionsKt.addAll(arrayList2, ((a0) it2.next()).f13266k);
                            }
                            set = CollectionsKt___CollectionsKt.toSet(arrayList2);
                            List list = CollectionsKt.toList(set);
                            int size = list.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                ((Z) list.get(i3)).c(backEvent, e0Var.f13298a);
                            }
                        }
                        Iterator it3 = m10.f13170n.iterator();
                        if (it3.hasNext()) {
                            throw com.mapbox.common.b.e(it3);
                        }
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
