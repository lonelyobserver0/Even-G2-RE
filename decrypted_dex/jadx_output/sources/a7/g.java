package a7;

import A3.s;
import X6.j;
import X6.l;
import X6.m;
import com.mapbox.common.Cancelable;
import com.mapbox.maps.MapboxMap;
import com.mapbox.maps.Style;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g implements j, l, m {

    /* renamed from: a, reason: collision with root package name */
    public s f9319a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9320b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public int f9321c;

    /* renamed from: d, reason: collision with root package name */
    public int f9322d;

    @Override // X6.j
    public final void a(s delegateProvider) {
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        this.f9319a = delegateProvider;
    }

    @Override // X6.m
    public final void b(Style style) {
        Intrinsics.checkNotNullParameter(style, "style");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X6.j
    public final void g() {
        ArrayList arrayList = this.f9320b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) ((WeakReference) it.next()).get();
            if (aVar != null) {
                f fVar = (f) aVar;
                MapboxMap mapboxMap = (MapboxMap) fVar.f9301a.f196h;
                Iterator it2 = fVar.f9309i.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (mapboxMap.styleLayerExists(str)) {
                        mapboxMap.removeStyleLayer(str);
                    }
                }
                Iterator it3 = fVar.j.iterator();
                while (it3.hasNext()) {
                    String str2 = (String) it3.next();
                    if (mapboxMap.styleSourceExists(str2)) {
                        mapboxMap.removeStyleSource(str2);
                    }
                }
                LinkedHashSet linkedHashSet = fVar.f9308h;
                Iterator it4 = linkedHashSet.iterator();
                while (it4.hasNext()) {
                    ((Cancelable) it4.next()).cancel();
                }
                linkedHashSet.clear();
                fVar.f9305e.clear();
                fVar.f9306f.clear();
                fVar.f9315p.clear();
                fVar.f9316q.clear();
                fVar.f9317r.clear();
                fVar.f9318s.clear();
                if (fVar instanceof i) {
                    i iVar = (i) fVar;
                    iVar.b().clear();
                    iVar.a().clear();
                }
            }
        }
        arrayList.clear();
    }

    @Override // X6.j
    public final void initialize() {
    }

    @Override // X6.l
    public final void onSizeChanged(int i3, int i10) {
        this.f9321c = i3;
        this.f9322d = i10;
        Iterator it = this.f9320b.iterator();
        while (it.hasNext()) {
        }
    }
}
