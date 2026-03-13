package J7;

import com.mapbox.navigator.RouteInterface;
import da.C0819i;
import java.util.Comparator;
import java.util.List;
import kotlin.comparisons.ComparisonsKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class h implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3431a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3432b;

    public /* synthetic */ h() {
        this.f3431a = 2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3431a) {
            case 0:
                RouteInterface routeInterface = ((com.mapbox.navigation.base.route.g) obj).f12501d;
                List list = (List) this.f3432b;
                return ComparisonsKt.compareValues(Integer.valueOf(list.indexOf(routeInterface)), Integer.valueOf(list.indexOf(((com.mapbox.navigation.base.route.g) obj2).f12501d)));
            case 1:
                String str = ((C0819i) obj).f13508a;
                List list2 = (List) this.f3432b;
                int indexOf = list2.indexOf(str);
                int indexOf2 = list2.indexOf(((C0819i) obj2).f13508a);
                if (indexOf < indexOf2) {
                    return -1;
                }
                return indexOf == indexOf2 ? 0 : 1;
            default:
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                int i3 = iArr[0];
                int i10 = iArr2[0];
                if (i3 >= i10) {
                    if (i3 <= i10) {
                        int i11 = iArr[1];
                        int i12 = iArr2[1];
                        if (i11 >= i12) {
                            if (i11 <= i12) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
        }
    }

    public /* synthetic */ h(int i3, List list) {
        this.f3431a = i3;
        this.f3432b = list;
    }
}
