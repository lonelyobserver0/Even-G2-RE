package Ac;

import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import com.google.android.gms.internal.measurement.L1;
import com.mapbox.maps.LayerPosition;
import com.mapbox.maps.Style;
import com.stub.StubApp;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import m8.G;
import wc.C1889f;
import x9.I;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f354c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f355d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i3) {
        super(0);
        this.f352a = i3;
        this.f353b = obj;
        this.f354c = obj2;
        this.f355d = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f352a) {
            case 0:
                L1 l12 = ((C1889f) this.f353b).f22372b;
                Intrinsics.checkNotNull(l12);
                break;
            case 1:
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(24951));
                sb2.append(Ec.l.r((G) this.f353b));
                sb2.append(StubApp.getString2(24952));
                List list = (List) this.f354c;
                ArrayList arrayList = new ArrayList(CollectionsKt.f(list));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.mapbox.navigation.base.route.g) it.next()).f12506i);
                }
                sb2.append(arrayList);
                sb2.append(StubApp.getString2(3046));
                sb2.append((String) this.f355d);
                break;
            case 2:
                break;
            case 3:
                K4.m mVar = ((Y6.j) this.f354c).f8763A;
                AnimatorSet animatorSet = (AnimatorSet) this.f353b;
                animatorSet.addListener(mVar);
                AnimatorListenerAdapter animatorListenerAdapter = (AnimatorListenerAdapter) this.f355d;
                if (animatorListenerAdapter != null) {
                    animatorSet.addListener(animatorListenerAdapter);
                }
                break;
            case 4:
                L1 l13 = ((C1889f) this.f353b).f22372b;
                List list2 = (List) this.f354c;
                List k3 = l13 == null ? null : l13.k((String) this.f355d, list2);
                if (k3 != null) {
                    list2 = k3;
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt.f(list2));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((X509Certificate) ((Certificate) it2.next()));
                }
                break;
            case 5:
                y9.t tVar = (y9.t) this.f355d;
                Style style = (Style) this.f354c;
                ((I) this.f353b).getClass();
                I.k(style, StubApp.getString2(19170), tVar.f23604c, null);
                break;
            default:
                String str = ((y9.r) ((Pair) this.f355d).getFirst()).f23600a;
                Map map = r9.r.f20470k;
                ((I) this.f353b).getClass();
                Set set = (Set) map.get(new y9.r(str));
                if (set != null) {
                    Iterator it3 = set.iterator();
                    while (it3.hasNext()) {
                        ((Style) this.f354c).moveStyleLayer((String) it3.next(), new LayerPosition(null, StubApp.getString2(22800), null));
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
