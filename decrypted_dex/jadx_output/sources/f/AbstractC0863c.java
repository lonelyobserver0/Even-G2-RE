package f;

import android.os.Parcelable;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import d.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* renamed from: f.c, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public abstract class AbstractC0863c {
    public final void a(Parcelable parcelable) {
        C0866f c0866f = (C0866f) this;
        j jVar = c0866f.f13690a;
        LinkedHashMap linkedHashMap = jVar.f13066b;
        String str = c0866f.f13691b;
        Object obj = linkedHashMap.get(str);
        F1 f12 = c0866f.f13692c;
        if (obj == null) {
            throw new IllegalStateException((StubApp.getString2(17394) + f12 + StubApp.getString2(17395) + parcelable + StubApp.getString2(17396)).toString());
        }
        int intValue = ((Number) obj).intValue();
        ArrayList arrayList = jVar.f13068d;
        arrayList.add(str);
        try {
            jVar.b(intValue, f12, parcelable);
        } catch (Exception e10) {
            arrayList.remove(str);
            throw e10;
        }
    }
}
