package A;

import N.B;
import N.I;
import S3.D;
import android.view.View;
import androidx.recyclerview.widget.C0463p;
import androidx.recyclerview.widget.RecyclerView;
import i4.C1038b;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.comparisons.ComparisonsKt;
import u3.C1773b;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class i implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i f25b = new i(6);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26a;

    public /* synthetic */ i(int i3) {
        this.f26a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f26a) {
            case 0:
                WeakHashMap weakHashMap = I.f4732a;
                float g10 = B.g((View) obj);
                float g11 = B.g((View) obj2);
                if (g10 > g11) {
                    return -1;
                }
                return g10 < g11 ? 1 : 0;
            case 1:
                return ComparisonsKt.compareValues(((Lc.h) obj).f4411a, ((Lc.h) obj2).f4411a);
            case 2:
                List list = O2.a.f5195a;
                return ComparisonsKt.compareValues(Character.valueOf(O2.a.b((String) ((Pair) obj).getSecond())), Character.valueOf(O2.a.b((String) ((Pair) obj2).getSecond())));
            case 3:
                C0463p c0463p = (C0463p) obj;
                C0463p c0463p2 = (C0463p) obj2;
                RecyclerView recyclerView = c0463p.f10271d;
                if ((recyclerView == null) == (c0463p2.f10271d == null)) {
                    boolean z2 = c0463p.f10268a;
                    if (z2 == c0463p2.f10268a) {
                        int i3 = c0463p2.f10269b - c0463p.f10269b;
                        if (i3 != 0) {
                            return i3;
                        }
                        int i10 = c0463p.f10270c - c0463p2.f10270c;
                        if (i10 != 0) {
                            return i10;
                        }
                        return 0;
                    }
                    if (z2) {
                        return -1;
                    }
                } else if (recyclerView != null) {
                    return -1;
                }
                return 1;
            case 4:
                int i11 = ((int[]) obj)[0];
                int i12 = ((int[]) obj2)[0];
                if (i11 < i12) {
                    return -1;
                }
                return i11 == i12 ? 0 : 1;
            case 5:
                C1038b c1038b = (C1038b) obj;
                C1038b c1038b2 = (C1038b) obj2;
                D.h(c1038b);
                D.h(c1038b2);
                int i13 = c1038b.f14754a;
                int i14 = c1038b2.f14754a;
                if (i13 == i14) {
                    int i15 = c1038b.f14755b;
                    int i16 = c1038b2.f14755b;
                    if (i15 == i16) {
                        return 0;
                    }
                    if (i15 < i16) {
                        return -1;
                    }
                } else if (i13 < i14) {
                    return -1;
                }
                return 1;
            case 6:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 7:
                return ComparisonsKt.compareValues(((File) obj).getAbsolutePath(), ((File) obj2).getAbsolutePath());
            case 8:
                return ComparisonsKt.compareValues(((File) obj).getAbsolutePath(), ((File) obj2).getAbsolutePath());
            default:
                int i17 = ((C1773b) obj).f21437e;
                int i18 = ((C1773b) obj2).f21437e;
                if (i17 == i18) {
                    return 0;
                }
                return i17 > i18 ? 1 : -1;
        }
    }
}
