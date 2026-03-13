package mb;

import Xa.AbstractActivityC0364d;
import Z9.C0366a;
import android.app.Activity;
import android.app.Application;
import android.content.SharedPreferences;
import androidx.lifecycle.AbstractC0440o;
import com.stub.StubApp;
import db.C0824a;
import db.InterfaceC0825b;
import f4.C0882f;
import io.flutter.plugin.common.BinaryMessenger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import l4.C1145A;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public class i implements InterfaceC0825b, eb.a, s {

    /* renamed from: a, reason: collision with root package name */
    public C0824a f17322a;

    /* renamed from: b, reason: collision with root package name */
    public g f17323b;

    public final k b() {
        boolean z2;
        String str;
        ArrayList arrayList;
        Set<String> stringSet;
        g gVar = this.f17323b;
        f fVar = (gVar == null || gVar.f17314b == null) ? null : gVar.f17315c;
        if (fVar == null) {
            throw new m(StubApp.getString2(4486), StubApp.getString2(21208));
        }
        C0882f c0882f = fVar.f17305d;
        c0882f.getClass();
        HashMap hashMap = new HashMap();
        Activity activity = (Activity) c0882f.f13748b;
        String string2 = StubApp.getString2(17487);
        int i3 = 0;
        SharedPreferences sharedPreferences = activity.getSharedPreferences(string2, 0);
        String string22 = StubApp.getString2(17488);
        boolean contains = sharedPreferences.contains(string22);
        String string23 = StubApp.getString2(21201);
        boolean z10 = true;
        if (!contains || (stringSet = sharedPreferences.getStringSet(string22, null)) == null) {
            z2 = false;
        } else {
            hashMap.put(string23, new ArrayList(stringSet));
            z2 = true;
        }
        String string24 = StubApp.getString2(17489);
        boolean contains2 = sharedPreferences.contains(string24);
        String string25 = StubApp.getString2(435);
        if (contains2) {
            String string = sharedPreferences.getString(string24, "");
            String string26 = StubApp.getString2(17490);
            String string3 = sharedPreferences.contains(string26) ? sharedPreferences.getString(string26, "") : null;
            j jVar = new j();
            if (string == null) {
                throw new IllegalStateException(StubApp.getString2(21202));
            }
            jVar.f17324a = string;
            jVar.f17325b = string3;
            hashMap.put(string25, jVar);
        } else {
            z10 = z2;
        }
        String string27 = StubApp.getString2(21203);
        String string28 = StubApp.getString2(21204);
        String string29 = StubApp.getString2(21205);
        String string210 = StubApp.getString2(660);
        if (z10) {
            String string211 = StubApp.getString2(21197);
            if (sharedPreferences.contains(string211)) {
                hashMap.put(string210, sharedPreferences.getString(string211, "").equals(StubApp.getString2(3235)) ? l.f17330c : l.f17329b);
            }
            String string212 = StubApp.getString2(21198);
            str = string23;
            if (sharedPreferences.contains(string212)) {
                hashMap.put(string29, Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(string212, 0L))));
            }
            String string213 = StubApp.getString2(21199);
            if (sharedPreferences.contains(string213)) {
                hashMap.put(string28, Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(string213, 0L))));
            }
            hashMap.put(string27, Integer.valueOf(sharedPreferences.getInt(StubApp.getString2(21200), 100)));
        } else {
            str = string23;
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        l lVar = (l) hashMap.get(string210);
        if (lVar == null) {
            lVar = null;
        }
        j jVar2 = (j) hashMap.get(string25);
        ArrayList arrayList2 = (ArrayList) hashMap.get(str);
        if (arrayList2 != null) {
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                Double d8 = (Double) hashMap.get(string29);
                Double d10 = (Double) hashMap.get(string28);
                Integer num = (Integer) hashMap.get(string27);
                arrayList.add(fVar.f17304c.E(str2, d8, d10, num == null ? 100 : num.intValue()));
                i3 = 0;
            }
        } else {
            arrayList = null;
        }
        activity.getSharedPreferences(string2, i3).edit().clear().apply();
        k kVar = new k();
        if (lVar == null) {
            throw new IllegalStateException(StubApp.getString2(21207));
        }
        kVar.f17326a = lVar;
        kVar.f17327b = jVar2;
        if (arrayList == null) {
            throw new IllegalStateException(StubApp.getString2(21206));
        }
        kVar.f17328c = arrayList;
        return kVar;
    }

    @Override // eb.a
    public final void onAttachedToActivity(eb.b bVar) {
        C0824a c0824a = this.f17322a;
        BinaryMessenger binaryMessenger = c0824a.f13554b;
        Application application = (Application) c0824a.f13553a;
        Ya.d dVar = (Ya.d) bVar;
        AbstractActivityC0364d abstractActivityC0364d = dVar.f8882a;
        g gVar = new g();
        gVar.f17313a = application;
        gVar.f17314b = abstractActivityC0364d;
        gVar.f17317e = bVar;
        gVar.f17318f = binaryMessenger;
        gVar.f17315c = new f(abstractActivityC0364d, new C0366a(abstractActivityC0364d, new C1145A(18)), new C0882f(abstractActivityC0364d, 11));
        s.a(binaryMessenger, this);
        gVar.f17316d = new h(this, abstractActivityC0364d);
        dVar.a(gVar.f17315c);
        dVar.b(gVar.f17315c);
        AbstractC0440o lifecycle = dVar.f8883b.getLifecycle();
        gVar.f17319g = lifecycle;
        lifecycle.a(gVar.f17316d);
        this.f17323b = gVar;
    }

    @Override // db.InterfaceC0825b
    public final void onAttachedToEngine(C0824a c0824a) {
        this.f17322a = c0824a;
    }

    @Override // eb.a
    public final void onDetachedFromActivity() {
        g gVar = this.f17323b;
        if (gVar != null) {
            eb.b bVar = gVar.f17317e;
            if (bVar != null) {
                ((Ya.d) bVar).c(gVar.f17315c);
                eb.b bVar2 = gVar.f17317e;
                ((Ya.d) bVar2).f8884c.remove(gVar.f17315c);
                gVar.f17317e = null;
            }
            AbstractC0440o abstractC0440o = gVar.f17319g;
            if (abstractC0440o != null) {
                abstractC0440o.b(gVar.f17316d);
                gVar.f17319g = null;
            }
            s.a(gVar.f17318f, null);
            Application application = gVar.f17313a;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(gVar.f17316d);
                gVar.f17313a = null;
            }
            gVar.f17314b = null;
            gVar.f17316d = null;
            gVar.f17315c = null;
            this.f17323b = null;
        }
    }

    @Override // eb.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // db.InterfaceC0825b
    public final void onDetachedFromEngine(C0824a c0824a) {
        this.f17322a = null;
    }

    @Override // eb.a
    public final void onReattachedToActivityForConfigChanges(eb.b bVar) {
        onAttachedToActivity(bVar);
    }
}
