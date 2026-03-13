package f;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import d.j;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f.f, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0866f extends AbstractC0863c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f13690a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f13691b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ F1 f13692c;

    public C0866f(j jVar, String str, F1 f12) {
        this.f13690a = jVar;
        this.f13691b = str;
        this.f13692c = f12;
    }

    public final void b() {
        Object parcelable;
        Integer num;
        j jVar = this.f13690a;
        jVar.getClass();
        String key = this.f13691b;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!jVar.f13068d.contains(key) && (num = (Integer) jVar.f13066b.remove(key)) != null) {
            jVar.f13065a.remove(num);
        }
        jVar.f13069e.remove(key);
        LinkedHashMap linkedHashMap = jVar.f13070f;
        boolean containsKey = linkedHashMap.containsKey(key);
        String string2 = StubApp.getString2(994);
        String string22 = StubApp.getString2(17397);
        String string23 = StubApp.getString2(17398);
        if (containsKey) {
            StringBuilder l9 = com.mapbox.common.b.l(string22, key, string2);
            l9.append(linkedHashMap.get(key));
            Log.w(string23, l9.toString());
            linkedHashMap.remove(key);
        }
        Bundle bundle = jVar.f13071g;
        if (bundle.containsKey(key)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = J.b.b(key, bundle);
            } else {
                parcelable = bundle.getParcelable(key);
                if (!C0861a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w(string23, string22 + key + string2 + ((C0861a) parcelable));
            bundle.remove(key);
        }
        if (jVar.f13067c.get(key) != null) {
            throw new ClassCastException();
        }
    }
}
