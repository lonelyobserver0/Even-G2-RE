package d;

import C.AbstractC0025b;
import Z9.C0366a;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import f.C0861a;
import f.C0864d;
import f.C0865e;
import f.C0866f;
import f.C0867g;
import f.InterfaceC0862b;
import i.AbstractActivityC1027h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f13065a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f13066b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f13067c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f13068d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f13069e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f13070f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f13071g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1027h f13072h;

    public j(AbstractActivityC1027h abstractActivityC1027h) {
        this.f13072h = abstractActivityC1027h;
    }

    public final boolean a(int i3, int i10, Intent intent) {
        String str = (String) this.f13065a.get(Integer.valueOf(i3));
        if (str == null) {
            return false;
        }
        C0864d c0864d = (C0864d) this.f13069e.get(str);
        if ((c0864d != null ? c0864d.f13687a : null) != null) {
            ArrayList arrayList = this.f13068d;
            if (arrayList.contains(str)) {
                c0864d.f13687a.f(c0864d.f13688b.t(intent, i10));
                arrayList.remove(str);
                return true;
            }
        }
        this.f13070f.remove(str);
        this.f13071g.putParcelable(str, new C0861a(intent, i10));
        return true;
    }

    public final void b(int i3, F1 contract, Parcelable parcelable) {
        Bundle bundle;
        int i10;
        Intrinsics.checkNotNullParameter(contract, "contract");
        AbstractActivityC1027h abstractActivityC1027h = this.f13072h;
        C0366a r8 = contract.r(abstractActivityC1027h, parcelable);
        if (r8 != null) {
            new Handler(Looper.getMainLooper()).post(new H1.a(i3, 1, this, r8));
            return;
        }
        Intent l9 = contract.l(abstractActivityC1027h, parcelable);
        if (l9.getExtras() != null) {
            Bundle extras = l9.getExtras();
            Intrinsics.checkNotNull(extras);
            if (extras.getClassLoader() == null) {
                l9.setExtrasClassLoader(abstractActivityC1027h.getClassLoader());
            }
        }
        String string2 = StubApp.getString2(16419);
        if (l9.hasExtra(string2)) {
            bundle = l9.getBundleExtra(string2);
            l9.removeExtra(string2);
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if (Intrinsics.areEqual(StubApp.getString2(16420), l9.getAction())) {
            String[] stringArrayExtra = l9.getStringArrayExtra(StubApp.getString2(16421));
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC0025b.d(abstractActivityC1027h, stringArrayExtra, i3);
            return;
        }
        if (!Intrinsics.areEqual(StubApp.getString2(2488), l9.getAction())) {
            abstractActivityC1027h.startActivityForResult(l9, i3, bundle2);
            return;
        }
        C0867g c0867g = (C0867g) l9.getParcelableExtra(StubApp.getString2(16422));
        try {
            Intrinsics.checkNotNull(c0867g);
            i10 = i3;
            try {
                abstractActivityC1027h.startIntentSenderForResult(c0867g.f13693a, i10, c0867g.f13694b, c0867g.f13695c, c0867g.f13696d, 0, bundle2);
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                new Handler(Looper.getMainLooper()).post(new H1.a(i10, 2, this, e));
            }
        } catch (IntentSender.SendIntentException e11) {
            e = e11;
            i10 = i3;
        }
    }

    public final C0866f c(String key, F1 contract, InterfaceC0862b callback) {
        Object parcelable;
        Sequence<Number> generateSequence;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LinkedHashMap linkedHashMap = this.f13066b;
        if (((Integer) linkedHashMap.get(key)) == null) {
            generateSequence = SequencesKt__SequencesKt.generateSequence(C0865e.f13689a);
            for (Number number : generateSequence) {
                int intValue = number.intValue();
                LinkedHashMap linkedHashMap2 = this.f13065a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                    int intValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(intValue2), key);
                    linkedHashMap.put(key, Integer.valueOf(intValue2));
                }
            }
            throw new NoSuchElementException(StubApp.getString2(16423));
        }
        this.f13069e.put(key, new C0864d(callback, contract));
        LinkedHashMap linkedHashMap3 = this.f13070f;
        if (linkedHashMap3.containsKey(key)) {
            Object obj = linkedHashMap3.get(key);
            linkedHashMap3.remove(key);
            callback.f(obj);
        }
        int i3 = Build.VERSION.SDK_INT;
        Bundle bundle = this.f13071g;
        if (i3 >= 34) {
            parcelable = J.b.b(key, bundle);
        } else {
            parcelable = bundle.getParcelable(key);
            if (!C0861a.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0861a c0861a = (C0861a) parcelable;
        if (c0861a != null) {
            bundle.remove(key);
            callback.f(contract.t(c0861a.f13686b, c0861a.f13685a));
        }
        return new C0866f(this, key, contract);
    }
}
