package M1;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import com.stub.StubApp;
import com.yalantis.ucrop.UCropActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4508a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4509b;

    public a(E0 registry) {
        Intrinsics.checkNotNullParameter(registry, "registry");
        this.f4509b = new LinkedHashSet();
        registry.K(StubApp.getString2(3480), this);
    }

    @Override // M1.d
    public final Bundle a() {
        Pair[] pairArr;
        switch (this.f4508a) {
            case 0:
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
                List value = CollectionsKt.toList((LinkedHashSet) this.f4509b);
                String key = StubApp.getString2(3481);
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(value, "value");
                Intrinsics.checkNotNullParameter(value, "<this>");
                source.putStringArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
                return source;
            default:
                Bundle bundle = new Bundle();
                ((UCropActivity) this.f4509b).m().getClass();
                return bundle;
        }
    }

    public a(UCropActivity uCropActivity) {
        this.f4509b = uCropActivity;
    }
}
