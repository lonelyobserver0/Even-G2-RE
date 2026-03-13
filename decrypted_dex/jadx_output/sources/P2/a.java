package P2;

import J1.r;
import J1.s;
import J1.t;
import L1.e;
import P1.c;
import androidx.work.impl.WorkDatabase_Impl;
import com.even.even_core.utils.room.EvDatabase_Impl;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.F1;
import com.stub.StubApp;
import j2.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends s {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5484c = 1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f5485d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(EvDatabase_Impl evDatabase_Impl) {
        super(2, 0);
        this.f5485d = evDatabase_Impl;
    }

    @Override // J1.s
    public final void b(c cVar) {
        switch (this.f5484c) {
            case 0:
                cVar.k(StubApp.getString2(4804));
                cVar.k(StubApp.getString2(2964));
                cVar.k(StubApp.getString2(4805));
                break;
            default:
                cVar.k(StubApp.getString2(4790));
                cVar.k(StubApp.getString2(4791));
                cVar.k(StubApp.getString2(4792));
                cVar.k(StubApp.getString2(4793));
                cVar.k(StubApp.getString2(4794));
                cVar.k(StubApp.getString2(4795));
                cVar.k(StubApp.getString2(4796));
                cVar.k(StubApp.getString2(4797));
                cVar.k(StubApp.getString2(4798));
                cVar.k(StubApp.getString2(4799));
                cVar.k(StubApp.getString2(4800));
                cVar.k(StubApp.getString2(4801));
                cVar.k(StubApp.getString2(4802));
                cVar.k(StubApp.getString2(2964));
                cVar.k(StubApp.getString2(4803));
                break;
        }
    }

    @Override // J1.s
    public final void h(c cVar) {
        String string2 = StubApp.getString2(4806);
        r rVar = this.f5485d;
        switch (this.f5484c) {
            case 0:
                cVar.k(StubApp.getString2(4814));
                ArrayList arrayList = ((EvDatabase_Impl) rVar).f3370g;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).getClass();
                        Intrinsics.checkNotNullParameter(cVar, string2);
                    }
                    break;
                }
                break;
            default:
                cVar.k(StubApp.getString2(4807));
                cVar.k(StubApp.getString2(4808));
                cVar.k(StubApp.getString2(4809));
                cVar.k(StubApp.getString2(4810));
                cVar.k(StubApp.getString2(4811));
                cVar.k(StubApp.getString2(4812));
                cVar.k(StubApp.getString2(4813));
                int i3 = WorkDatabase_Impl.f10370v;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) rVar;
                ArrayList arrayList2 = workDatabase_Impl.f3370g;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((f) workDatabase_Impl.f3370g.get(i10)).getClass();
                        Intrinsics.checkNotNullParameter(cVar, string2);
                    }
                    break;
                }
                break;
        }
    }

    @Override // J1.s
    public final void m(c cVar) {
        String string2 = StubApp.getString2(4806);
        r rVar = this.f5485d;
        switch (this.f5484c) {
            case 0:
                ArrayList arrayList = ((EvDatabase_Impl) rVar).f3370g;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).getClass();
                        Intrinsics.checkNotNullParameter(cVar, string2);
                    }
                    break;
                }
                break;
            default:
                int i3 = WorkDatabase_Impl.f10370v;
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) rVar;
                ArrayList arrayList2 = workDatabase_Impl.f3370g;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((f) workDatabase_Impl.f3370g.get(i10)).getClass();
                        Intrinsics.checkNotNullParameter(cVar, string2);
                    }
                    break;
                }
                break;
        }
    }

    @Override // J1.s
    public final void o(c cVar) {
        switch (this.f5484c) {
            case 0:
                ((EvDatabase_Impl) this.f5485d).f3364a = cVar;
                ((EvDatabase_Impl) this.f5485d).k(cVar);
                ArrayList arrayList = ((EvDatabase_Impl) this.f5485d).f3370g;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).getClass();
                        f.a(cVar);
                    }
                    break;
                }
                break;
            default:
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f5485d;
                int i3 = WorkDatabase_Impl.f10370v;
                workDatabase_Impl.f3364a = cVar;
                cVar.k(StubApp.getString2(4815));
                ((WorkDatabase_Impl) this.f5485d).k(cVar);
                ArrayList arrayList2 = ((WorkDatabase_Impl) this.f5485d).f3370g;
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ((f) ((WorkDatabase_Impl) this.f5485d).f3370g.get(i10)).getClass();
                        f.a(cVar);
                    }
                    break;
                }
                break;
        }
    }

    @Override // J1.s
    public final void p(c cVar) {
        switch (this.f5484c) {
            case 0:
                F1.m(cVar);
                break;
            default:
                F1.m(cVar);
                break;
        }
    }

    @Override // J1.s
    public final t r(c cVar) {
        switch (this.f5484c) {
            case 0:
                HashMap hashMap = new HashMap(5);
                hashMap.put(StubApp.getString2(290), new L1.b(StubApp.getString2(290), 1, 1, StubApp.getString2(4825), true, null));
                hashMap.put(StubApp.getString2(3709), new L1.b(StubApp.getString2(3709), 0, 1, StubApp.getString2(4825), true, null));
                hashMap.put(StubApp.getString2(616), new L1.b(StubApp.getString2(616), 0, 1, StubApp.getString2(3321), true, null));
                hashMap.put(StubApp.getString2(1248), new L1.b(StubApp.getString2(1248), 0, 1, StubApp.getString2(3321), true, null));
                hashMap.put(StubApp.getString2(1350), new L1.b(StubApp.getString2(1350), 0, 1, StubApp.getString2(4825), true, null));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(0);
                String string2 = StubApp.getString2(4844);
                L1.f fVar = new L1.f(string2, hashMap, hashSet, hashSet2);
                L1.f a3 = L1.f.a(cVar, string2);
                if (!fVar.equals(a3)) {
                    break;
                } else {
                    break;
                }
            default:
                HashMap hashMap2 = new HashMap(2);
                L1.b bVar = new L1.b(StubApp.getString2(4816), 1, 1, StubApp.getString2(3321), true, null);
                String string22 = StubApp.getString2(4816);
                hashMap2.put(string22, bVar);
                L1.b bVar2 = new L1.b(StubApp.getString2(4817), 2, 1, StubApp.getString2(3321), true, null);
                String string23 = StubApp.getString2(4817);
                hashMap2.put(string23, bVar2);
                HashSet hashSet3 = new HashSet(2);
                List asList = Arrays.asList(string22);
                String string24 = StubApp.getString2(290);
                hashSet3.add(new L1.c(StubApp.getString2(4819), StubApp.getString2(4818), StubApp.getString2(4818), asList, Arrays.asList(string24)));
                hashSet3.add(new L1.c(StubApp.getString2(4819), StubApp.getString2(4818), StubApp.getString2(4818), Arrays.asList(string23), Arrays.asList(string24)));
                HashSet hashSet4 = new HashSet(2);
                hashSet4.add(new e(StubApp.getString2(4820), Arrays.asList(string22)));
                hashSet4.add(new e(StubApp.getString2(4821), Arrays.asList(string23)));
                String string25 = StubApp.getString2(4822);
                L1.f fVar2 = new L1.f(string25, hashMap2, hashSet3, hashSet4);
                L1.f a9 = L1.f.a(cVar, string25);
                boolean equals = fVar2.equals(a9);
                String string26 = StubApp.getString2(4823);
                if (!equals) {
                    break;
                } else {
                    HashMap hashMap3 = new HashMap(25);
                    hashMap3.put(string24, new L1.b(StubApp.getString2(290), 1, 1, StubApp.getString2(3321), true, null));
                    hashMap3.put(StubApp.getString2(291), new L1.b(StubApp.getString2(291), 0, 1, StubApp.getString2(4825), true, null));
                    hashMap3.put(StubApp.getString2(292), new L1.b(StubApp.getString2(292), 0, 1, StubApp.getString2(3321), true, null));
                    hashMap3.put(StubApp.getString2(293), new L1.b(StubApp.getString2(293), 0, 1, StubApp.getString2(3321), false, null));
                    hashMap3.put(StubApp.getString2(294), new L1.b(StubApp.getString2(294), 0, 1, StubApp.getString2(3322), true, null));
                    hashMap3.put(StubApp.getString2(295), new L1.b(StubApp.getString2(295), 0, 1, StubApp.getString2(3322), true, null));
                    hashMap3.put(StubApp.getString2(296), new L1.b(StubApp.getString2(296), 0, 1, StubApp.getString2(4825), true, null));
                    hashMap3.put(StubApp.getString2(297), new L1.b(StubApp.getString2(297), 0, 1, StubApp.getString2(4825), true, null));
                    hashMap3.put(StubApp.getString2(298), new L1.b(StubApp.getString2(298), 0, 1, StubApp.getString2(4825), true, null));
                    hashMap3.put(StubApp.getString2(299), new L1.b(StubApp.getString2(299), 0, 1, StubApp.getString2(4825), true, null));
                    hashMap3.put(StubApp.getString2(300), new L1.b(StubApp.getString2(300), 0, 1, StubApp.getString2(4825), true, null));
                    hashMap3.put(StubApp.getString2(301), new L1.b(StubApp.getString2(301), 0, 1, StubApp.getString2(4825), true, null));
                    L1.b bVar3 = new L1.b(StubApp.getString2(302), 0, 1, StubApp.getString2(4825), true, null);
                    String string27 = StubApp.getString2(302);
                    hashMap3.put(string27, bVar3);
                    hashMap3.put(StubApp.getString2(303), new L1.b(StubApp.getString2(303), 0, 1, StubApp.getString2(4825), true, null));
                    L1.b bVar4 = new L1.b(StubApp.getString2(304), 0, 1, StubApp.getString2(4825), true, null);
                    String string28 = StubApp.getString2(304);
                    hashMap3.put(string28, bVar4);
                    hashMap3.put(StubApp.getString2(305), new L1.b(StubApp.getString2(305), 0, 1, StubApp.getString2(4825), true, null));
                    hashMap3.put(StubApp.getString2(306), new L1.b(StubApp.getString2(306), 0, 1, StubApp.getString2(4825), true, null));
                    hashMap3.put(StubApp.getString2(282), new L1.b(StubApp.getString2(282), 0, 1, StubApp.getString2(4825), false, null));
                    hashMap3.put(StubApp.getString2(DfuBaseService.NOTIFICATION_ID), new L1.b(StubApp.getString2(DfuBaseService.NOTIFICATION_ID), 0, 1, StubApp.getString2(4825), true, null));
                    hashMap3.put(StubApp.getString2(284), new L1.b(StubApp.getString2(284), 0, 1, StubApp.getString2(4825), true, null));
                    hashMap3.put(StubApp.getString2(285), new L1.b(StubApp.getString2(285), 0, 1, StubApp.getString2(4825), true, null));
                    hashMap3.put(StubApp.getString2(286), new L1.b(StubApp.getString2(286), 0, 1, StubApp.getString2(4825), true, null));
                    hashMap3.put(StubApp.getString2(287), new L1.b(StubApp.getString2(287), 0, 1, StubApp.getString2(4825), true, null));
                    hashMap3.put(StubApp.getString2(288), new L1.b(StubApp.getString2(288), 0, 1, StubApp.getString2(4825), true, null));
                    hashMap3.put(StubApp.getString2(289), new L1.b(StubApp.getString2(289), 0, 1, StubApp.getString2(3322), false, null));
                    HashSet hashSet5 = new HashSet(0);
                    HashSet hashSet6 = new HashSet(2);
                    hashSet6.add(new e(StubApp.getString2(4826), Arrays.asList(string28)));
                    hashSet6.add(new e(StubApp.getString2(4827), Arrays.asList(string27)));
                    String string29 = StubApp.getString2(4819);
                    L1.f fVar3 = new L1.f(string29, hashMap3, hashSet5, hashSet6);
                    L1.f a10 = L1.f.a(cVar, string29);
                    if (!fVar3.equals(a10)) {
                        break;
                    } else {
                        HashMap hashMap4 = new HashMap(2);
                        hashMap4.put(StubApp.getString2(3514), new L1.b(StubApp.getString2(3514), 1, 1, StubApp.getString2(3321), true, null));
                        hashMap4.put(string22, new L1.b(StubApp.getString2(4816), 2, 1, StubApp.getString2(3321), true, null));
                        HashSet hashSet7 = new HashSet(1);
                        hashSet7.add(new L1.c(StubApp.getString2(4819), StubApp.getString2(4818), StubApp.getString2(4818), Arrays.asList(string22), Arrays.asList(string24)));
                        HashSet hashSet8 = new HashSet(1);
                        hashSet8.add(new e(StubApp.getString2(4829), Arrays.asList(string22)));
                        String string210 = StubApp.getString2(4830);
                        L1.f fVar4 = new L1.f(string210, hashMap4, hashSet7, hashSet8);
                        L1.f a11 = L1.f.a(cVar, string210);
                        if (!fVar4.equals(a11)) {
                            break;
                        } else {
                            HashMap hashMap5 = new HashMap(2);
                            hashMap5.put(string22, new L1.b(StubApp.getString2(4816), 1, 1, StubApp.getString2(3321), true, null));
                            hashMap5.put(StubApp.getString2(4832), new L1.b(StubApp.getString2(4832), 0, 1, StubApp.getString2(4825), true, null));
                            HashSet hashSet9 = new HashSet(1);
                            hashSet9.add(new L1.c(StubApp.getString2(4819), StubApp.getString2(4818), StubApp.getString2(4818), Arrays.asList(string22), Arrays.asList(string24)));
                            HashSet hashSet10 = new HashSet(0);
                            String string211 = StubApp.getString2(4833);
                            L1.f fVar5 = new L1.f(string211, hashMap5, hashSet9, hashSet10);
                            L1.f a12 = L1.f.a(cVar, string211);
                            if (!fVar5.equals(a12)) {
                                break;
                            } else {
                                HashMap hashMap6 = new HashMap(2);
                                hashMap6.put(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), new L1.b(StubApp.getString2(ModuleDescriptor.MODULE_VERSION), 1, 1, StubApp.getString2(3321), true, null));
                                hashMap6.put(string22, new L1.b(StubApp.getString2(4816), 2, 1, StubApp.getString2(3321), true, null));
                                HashSet hashSet11 = new HashSet(1);
                                hashSet11.add(new L1.c(StubApp.getString2(4819), StubApp.getString2(4818), StubApp.getString2(4818), Arrays.asList(string22), Arrays.asList(string24)));
                                HashSet hashSet12 = new HashSet(1);
                                hashSet12.add(new e(StubApp.getString2(4835), Arrays.asList(string22)));
                                String string212 = StubApp.getString2(4836);
                                L1.f fVar6 = new L1.f(string212, hashMap6, hashSet11, hashSet12);
                                L1.f a13 = L1.f.a(cVar, string212);
                                if (!fVar6.equals(a13)) {
                                    break;
                                } else {
                                    HashMap hashMap7 = new HashMap(2);
                                    hashMap7.put(string22, new L1.b(StubApp.getString2(4816), 1, 1, StubApp.getString2(3321), true, null));
                                    hashMap7.put(StubApp.getString2(4838), new L1.b(StubApp.getString2(4838), 0, 1, StubApp.getString2(3322), true, null));
                                    HashSet hashSet13 = new HashSet(1);
                                    hashSet13.add(new L1.c(StubApp.getString2(4819), StubApp.getString2(4818), StubApp.getString2(4818), Arrays.asList(string22), Arrays.asList(string24)));
                                    HashSet hashSet14 = new HashSet(0);
                                    String string213 = StubApp.getString2(4839);
                                    L1.f fVar7 = new L1.f(string213, hashMap7, hashSet13, hashSet14);
                                    L1.f a14 = L1.f.a(cVar, string213);
                                    if (!fVar7.equals(a14)) {
                                        break;
                                    } else {
                                        HashMap hashMap8 = new HashMap(2);
                                        hashMap8.put(StubApp.getString2(728), new L1.b(StubApp.getString2(728), 1, 1, StubApp.getString2(3321), true, null));
                                        hashMap8.put(StubApp.getString2(4841), new L1.b(StubApp.getString2(4841), 0, 1, StubApp.getString2(4825), false, null));
                                        HashSet hashSet15 = new HashSet(0);
                                        HashSet hashSet16 = new HashSet(0);
                                        String string214 = StubApp.getString2(4842);
                                        L1.f fVar8 = new L1.f(string214, hashMap8, hashSet15, hashSet16);
                                        L1.f a15 = L1.f.a(cVar, string214);
                                        if (!fVar8.equals(a15)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
        }
        return new t(true, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(WorkDatabase_Impl workDatabase_Impl) {
        super(12, 0);
        this.f5485d = workDatabase_Impl;
    }
}
