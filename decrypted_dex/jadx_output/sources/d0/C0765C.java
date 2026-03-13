package d0;

import Ub.AbstractC0347c;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.AbstractC0624h2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: d0.C, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class C0765C implements M1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13127b;

    public /* synthetic */ C0765C(Object obj, int i3) {
        this.f13126a = i3;
        this.f13127b = obj;
    }

    @Override // M1.d
    public final Bundle a() {
        Pair[] pairArr;
        switch (this.f13126a) {
            case 0:
                return ((M) this.f13127b).W();
            default:
                B3.s sVar = (B3.s) this.f13127b;
                for (Map.Entry entry : MapsKt.toMap((LinkedHashMap) sVar.f653e).entrySet()) {
                    String str = (String) entry.getKey();
                    Tb.b0 b0Var = (Tb.b0) ((Tb.K) entry.getValue());
                    b0Var.getClass();
                    F5.c cVar = AbstractC0347c.f7577b;
                    Object obj = Tb.b0.f7345f.get(b0Var);
                    if (obj == cVar) {
                        obj = null;
                    }
                    sVar.r(obj, str);
                }
                for (Map.Entry entry2 : MapsKt.toMap((LinkedHashMap) sVar.f650b).entrySet()) {
                    sVar.r(((M1.d) entry2.getValue()).a(), (String) entry2.getKey());
                }
                Map map = (Map) sVar.f651c;
                if (map.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry entry3 : map.entrySet()) {
                        arrayList.add(TuplesKt.to((String) entry3.getKey(), entry3.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                Bundle source = AbstractC0624h2.a((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                Intrinsics.checkNotNullParameter(source, "source");
                return source;
        }
    }
}
