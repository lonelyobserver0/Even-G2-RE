package d;

import android.os.Bundle;
import androidx.lifecycle.EnumC0438m;
import androidx.lifecycle.EnumC0439n;
import com.stub.StubApp;
import d0.C0791v;
import i.AbstractActivityC1027h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final /* synthetic */ class e implements M1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13054a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1027h f13055b;

    public /* synthetic */ e(AbstractActivityC1027h abstractActivityC1027h, int i3) {
        this.f13054a = i3;
        this.f13055b = abstractActivityC1027h;
    }

    @Override // M1.d
    public final Bundle a() {
        C0791v c0791v;
        AbstractActivityC1027h abstractActivityC1027h = this.f13055b;
        switch (this.f13054a) {
            case 0:
                Bundle outState = new Bundle();
                j jVar = abstractActivityC1027h.f13083h;
                jVar.getClass();
                Intrinsics.checkNotNullParameter(outState, "outState");
                LinkedHashMap linkedHashMap = jVar.f13066b;
                outState.putIntegerArrayList(StubApp.getString2(16414), new ArrayList<>(linkedHashMap.values()));
                outState.putStringArrayList(StubApp.getString2(16415), new ArrayList<>(linkedHashMap.keySet()));
                outState.putStringArrayList(StubApp.getString2(16416), new ArrayList<>(jVar.f13068d));
                outState.putBundle(StubApp.getString2(16417), new Bundle(jVar.f13071g));
                return outState;
        }
        do {
            c0791v = (C0791v) abstractActivityC1027h.f14605w.f9233b;
            EnumC0439n enumC0439n = EnumC0439n.f9913a;
        } while (AbstractActivityC1027h.o(c0791v.f13394d));
        abstractActivityC1027h.f14606x.e(EnumC0438m.ON_STOP);
        return new Bundle();
    }
}
