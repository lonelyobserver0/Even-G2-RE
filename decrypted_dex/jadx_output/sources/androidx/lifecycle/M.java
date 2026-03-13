package androidx.lifecycle;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import d0.C0765C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class M implements M1.d {

    /* renamed from: a, reason: collision with root package name */
    public final E0 f9884a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9885b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f9886c;

    /* renamed from: d, reason: collision with root package name */
    public final Lazy f9887d;

    public M(E0 savedStateRegistry, W viewModelStoreOwner) {
        Intrinsics.checkNotNullParameter(savedStateRegistry, "savedStateRegistry");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.f9884a = savedStateRegistry;
        this.f9887d = LazyKt.lazy(new J2.d(viewModelStoreOwner, 3));
    }

    @Override // M1.d
    public final Bundle a() {
        Pair[] pairArr;
        Map emptyMap = MapsKt.emptyMap();
        if (emptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(emptyMap.size());
            for (Map.Entry entry : emptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle source = AbstractC0624h2.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Intrinsics.checkNotNullParameter(source, "source");
        Bundle from = this.f9886c;
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            source.putAll(from);
        }
        for (Map.Entry entry2 : ((N) this.f9887d.getValue()).f9888b.entrySet()) {
            String key = (String) entry2.getKey();
            Bundle value = ((C0765C) ((I) entry2.getValue()).f9876a.f654f).a();
            Intrinsics.checkNotNullParameter(value, "source");
            if (!value.isEmpty()) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                source.putBundle(key, value);
            }
        }
        this.f9885b = false;
        return source;
    }

    public final void b() {
        Pair[] pairArr;
        if (this.f9885b) {
            return;
        }
        Bundle from = this.f9884a.w("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map emptyMap = MapsKt.emptyMap();
        if (emptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(emptyMap.size());
            for (Map.Entry entry : emptyMap.entrySet()) {
                arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle source = AbstractC0624h2.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        Intrinsics.checkNotNullParameter(source, "source");
        Bundle from2 = this.f9886c;
        if (from2 != null) {
            Intrinsics.checkNotNullParameter(from2, "from");
            source.putAll(from2);
        }
        if (from != null) {
            Intrinsics.checkNotNullParameter(from, "from");
            source.putAll(from);
        }
        this.f9886c = source;
        this.f9885b = true;
    }
}
