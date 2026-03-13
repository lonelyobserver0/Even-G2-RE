package b3;

import android.media.MediaPlayer;
import com.stub.StubApp;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.MessageCodec;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b3.q, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0515q implements q8.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10650b;

    public /* synthetic */ C0515q(Object obj, int i3) {
        this.f10649a = i3;
        this.f10650b = obj;
    }

    @Override // q8.e
    public final void a(q8.g routeUpdateResult) {
        String str;
        j9.e eVar;
        j9.e eVar2;
        String str2;
        switch (this.f10649a) {
            case 0:
                Intrinsics.checkNotNullParameter(routeUpdateResult, "routeUpdateResult");
                if (!routeUpdateResult.f20095a.isEmpty()) {
                    List list = routeUpdateResult.f20095a;
                    com.mapbox.navigation.base.route.g gVar = (com.mapbox.navigation.base.route.g) CollectionsKt.first(list);
                    Intrinsics.checkNotNullParameter(gVar, "<this>");
                    String profile = gVar.f12500c.profile();
                    C0498N c0498n = (C0498N) this.f10650b;
                    X2.j travelMode = c0498n.f10596v;
                    Intrinsics.checkNotNullParameter(travelMode, "travelMode");
                    i9.d dVar = null;
                    if (Intrinsics.areEqual(profile, travelMode == X2.j.f8289c ? StubApp.getString2(5804) : travelMode == X2.j.f8290d ? StubApp.getString2(5803) : null)) {
                        String str3 = StubApp.getString2(9202) + list.size();
                        String string2 = StubApp.getString2(103);
                        R2.c.b(string2, str3);
                        try {
                            str = ((com.mapbox.navigation.base.route.g) CollectionsKt.first(list)).f12498a.geometry();
                        } catch (Exception e10) {
                            R2.c.f(string2, StubApp.getString2(9203) + e10.getMessage());
                            str = null;
                        }
                        String str4 = c0498n.f10579l0;
                        boolean z2 = false;
                        boolean z10 = (str4 == null || Intrinsics.areEqual(str4, str)) ? false : true;
                        Y2.a aVar = c0498n.f10598w;
                        Y2.a aVar2 = Y2.a.f8731b;
                        if (aVar == aVar2 && ((c0498n.f10581m0 > 0 && list.size() != c0498n.f10581m0) || ((str2 = c0498n.f10579l0) != null && str != null && !Intrinsics.areEqual(str2, str)))) {
                            z2 = true;
                        }
                        if (c0498n.f10598w == aVar2) {
                            if (z2 || z10) {
                                R2.c.b(string2, StubApp.getString2(9204));
                                D5.B b2 = c0498n.f10585p;
                                if (b2 != null) {
                                    b2.v();
                                }
                                try {
                                    E9.k kVar = c0498n.f10582n;
                                    if (kVar != null) {
                                        ((ConcurrentLinkedQueue) kVar.f2084e).clear();
                                        kVar.a(true);
                                        E9.p pVar = (E9.p) kVar.f2085f;
                                        MediaPlayer mediaPlayer = pVar.f2095b;
                                        if (mediaPlayer != null) {
                                            mediaPlayer.release();
                                        }
                                        pVar.f2095b = null;
                                        pVar.f2098e = null;
                                        E9.w wVar = (E9.w) kVar.f2086g;
                                        wVar.f2113e.stop();
                                        wVar.f2116h = null;
                                    }
                                } catch (Exception e11) {
                                    R2.c.f(string2, StubApp.getString2(9205) + e11.getMessage());
                                }
                            }
                            F5.c cVar = c0498n.f10571d;
                            if (z2) {
                                R2.c.b(string2, StubApp.getString2(9206));
                                X2.w wVar2 = (X2.w) cVar.f2238b;
                                R2.c.b(StubApp.getString2(390), StubApp.getString2(9207));
                                X2.p pVar2 = wVar2.f8336g;
                                if (pVar2 != null) {
                                    String string22 = StubApp.getString2(696);
                                    X2.q qVar = wVar2.f8345s;
                                    Intrinsics.checkNotNullParameter(qVar, string22);
                                    String str5 = StubApp.getString2(9208) + "";
                                    new BasicMessageChannel(pVar2.f8316a, str5, (MessageCodec) X2.p.f8315b.getValue()).send(null, new X2.o(qVar, str5, 0));
                                }
                            } else if (z10) {
                                R2.c.b(string2, StubApp.getString2(9209));
                                cVar.o();
                            }
                        }
                        c0498n.f10579l0 = str;
                        c0498n.f10581m0 = list.size();
                        x9.t tVar = c0498n.f10576k;
                        if (tVar == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("routeLineApi");
                            tVar = null;
                        }
                        tVar.e(list, new C0509k(c0498n, 0));
                        j9.e eVar3 = c0498n.f10575h;
                        String string23 = StubApp.getString2(9024);
                        if (eVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string23);
                            eVar = null;
                        } else {
                            eVar = eVar3;
                        }
                        eVar.d((com.mapbox.navigation.base.route.g) CollectionsKt.first(list));
                        if (eVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string23);
                            eVar2 = null;
                        } else {
                            eVar2 = eVar3;
                        }
                        eVar2.f15402k.f10727a = Double.valueOf(c0498n.f10593t);
                        if (eVar3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string23);
                            eVar3 = null;
                        }
                        eVar3.c();
                        i9.d dVar2 = c0498n.j;
                        if (dVar2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("navigationCamera");
                        } else {
                            dVar = dVar2;
                        }
                        i9.d.a(dVar);
                        break;
                    }
                }
                break;
            default:
                String string24 = StubApp.getString2(392);
                m8.r rVar = (m8.r) this.f10650b;
                Intrinsics.checkNotNullParameter(rVar, string24);
                Intrinsics.checkNotNullParameter(routeUpdateResult, "<anonymous parameter 0>");
                rVar.f17213G = null;
                rVar.f17242w.f17253b = null;
                break;
        }
    }
}
