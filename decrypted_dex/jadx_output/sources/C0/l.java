package C0;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import o0.C1412I;
import o0.C1438m;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class l extends m {

    /* renamed from: n, reason: collision with root package name */
    public static final l f970n;

    /* renamed from: d, reason: collision with root package name */
    public final List f971d;

    /* renamed from: e, reason: collision with root package name */
    public final List f972e;

    /* renamed from: f, reason: collision with root package name */
    public final List f973f;

    /* renamed from: g, reason: collision with root package name */
    public final List f974g;

    /* renamed from: h, reason: collision with root package name */
    public final List f975h;

    /* renamed from: i, reason: collision with root package name */
    public final List f976i;
    public final C1438m j;

    /* renamed from: k, reason: collision with root package name */
    public final List f977k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f978l;

    /* renamed from: m, reason: collision with root package name */
    public final List f979m;

    static {
        List list = Collections.EMPTY_LIST;
        f970n = new l("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public l(String str, List list, List list2, List list3, List list4, List list5, List list6, C1438m c1438m, List list7, boolean z2, Map map, List list8) {
        super(str, list, z2);
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list2.size(); i3++) {
            Uri uri = ((k) list2.get(i3)).f964a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        b(list6, arrayList);
        this.f971d = Collections.unmodifiableList(arrayList);
        this.f972e = Collections.unmodifiableList(list2);
        this.f973f = Collections.unmodifiableList(list3);
        this.f974g = Collections.unmodifiableList(list4);
        this.f975h = Collections.unmodifiableList(list5);
        this.f976i = Collections.unmodifiableList(list6);
        this.j = c1438m;
        this.f977k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f978l = Collections.unmodifiableMap(map);
        this.f979m = Collections.unmodifiableList(list8);
    }

    public static void b(List list, ArrayList arrayList) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            Uri uri = ((j) list.get(i3)).f961a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList c(int i3, List list, List list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            Object obj = list.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < list2.size()) {
                    C1412I c1412i = (C1412I) list2.get(i11);
                    if (c1412i.f18040b == i3 && c1412i.f18041c == i10) {
                        arrayList.add(obj);
                        break;
                    }
                    i11++;
                }
            }
        }
        return arrayList;
    }

    @Override // G0.a
    public final Object a(List list) {
        ArrayList c10 = c(0, this.f972e, list);
        List list2 = Collections.EMPTY_LIST;
        return new l(this.f980a, this.f981b, c10, list2, c(1, this.f974g, list), c(2, this.f975h, list), list2, this.j, this.f977k, this.f982c, this.f978l, this.f979m);
    }
}
