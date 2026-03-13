package d;

import android.os.Bundle;
import com.stub.StubApp;
import d0.C0791v;
import e.InterfaceC0827a;
import i.AbstractActivityC1027h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import l4.E0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class f implements InterfaceC0827a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1027h f13057b;

    public /* synthetic */ f(AbstractActivityC1027h abstractActivityC1027h, int i3) {
        this.f13056a = i3;
        this.f13057b = abstractActivityC1027h;
    }

    @Override // e.InterfaceC0827a
    public final void a(l it) {
        switch (this.f13056a) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                AbstractActivityC1027h abstractActivityC1027h = this.f13057b;
                Bundle w10 = ((E0) abstractActivityC1027h.f13079d.f9078c).w(StubApp.getString2(16418));
                if (w10 != null) {
                    j jVar = abstractActivityC1027h.f13083h;
                    jVar.getClass();
                    ArrayList<Integer> integerArrayList = w10.getIntegerArrayList(StubApp.getString2(16414));
                    ArrayList<String> stringArrayList = w10.getStringArrayList(StubApp.getString2(16415));
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = w10.getStringArrayList(StubApp.getString2(16416));
                        if (stringArrayList2 != null) {
                            jVar.f13068d.addAll(stringArrayList2);
                        }
                        Bundle bundle = w10.getBundle(StubApp.getString2(16417));
                        Bundle bundle2 = jVar.f13071g;
                        if (bundle != null) {
                            bundle2.putAll(bundle);
                        }
                        int size = stringArrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            String str = stringArrayList.get(i3);
                            LinkedHashMap linkedHashMap = jVar.f13066b;
                            boolean containsKey = linkedHashMap.containsKey(str);
                            LinkedHashMap linkedHashMap2 = jVar.f13065a;
                            if (containsKey) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    TypeIntrinsics.asMutableMap(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i3);
                            Intrinsics.checkNotNullExpressionValue(num2, "rcs[i]");
                            int intValue = num2.intValue();
                            String str2 = stringArrayList.get(i3);
                            Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(intValue), str3);
                            linkedHashMap.put(str3, Integer.valueOf(intValue));
                        }
                        break;
                    }
                }
                break;
            default:
                C0791v c0791v = (C0791v) this.f13057b.f14605w.f9233b;
                c0791v.f13394d.b(c0791v, c0791v, null);
                break;
        }
    }
}
