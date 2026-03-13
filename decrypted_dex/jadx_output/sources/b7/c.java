package b7;

import A3.s;
import Xa.h;
import a.AbstractC0378a;
import a7.f;
import a7.i;
import com.stub.StubApp;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class c extends f implements i {

    /* renamed from: w, reason: collision with root package name */
    public static final AtomicLong f10716w = new AtomicLong(0);

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f10717u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList f10718v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s delegateProvider) {
        super(delegateProvider, f10716w.incrementAndGet(), StubApp.getString2(9283), b.f10715a);
        Intrinsics.checkNotNullParameter(delegateProvider, "delegateProvider");
        this.f10717u = new ArrayList();
        this.f10718v = new ArrayList();
        LinkedHashMap linkedHashMap = this.f9302b;
        Boolean bool = Boolean.FALSE;
        linkedHashMap.put(StubApp.getString2(8520), bool);
        this.f9302b.put(StubApp.getString2(8521), bool);
        this.f9302b.put(StubApp.getString2(8522), bool);
        this.f9302b.put(StubApp.getString2(117), bool);
        this.f9302b.put(StubApp.getString2(8523), bool);
        this.f9302b.put(StubApp.getString2(8524), bool);
        this.f9302b.put(StubApp.getString2(8525), bool);
        this.f9302b.put(StubApp.getString2(8526), bool);
        this.f9302b.put(StubApp.getString2(8527), bool);
        this.f9302b.put(StubApp.getString2(8528), bool);
        this.f9302b.put(StubApp.getString2(8529), bool);
        this.f9302b.put(StubApp.getString2(8530), bool);
        this.f9302b.put(StubApp.getString2(8531), bool);
        this.f9302b.put(StubApp.getString2(8532), bool);
        this.f9302b.put(StubApp.getString2(8533), bool);
        this.f9302b.put(StubApp.getString2(8534), bool);
        this.f9302b.put(StubApp.getString2(8535), bool);
        this.f9302b.put(StubApp.getString2(8536), bool);
        this.f9302b.put(StubApp.getString2(8537), bool);
        this.f9302b.put(StubApp.getString2(8538), bool);
        this.f9302b.put(StubApp.getString2(8539), bool);
        this.f9302b.put(StubApp.getString2(8540), bool);
        this.f9302b.put(StubApp.getString2(8541), bool);
        this.f9302b.put(StubApp.getString2(8542), bool);
        this.f9302b.put(StubApp.getString2(8543), bool);
        this.f9302b.put(StubApp.getString2(8544), bool);
        this.f9302b.put(StubApp.getString2(8545), bool);
        this.f9302b.put(StubApp.getString2(8546), bool);
        this.f9302b.put(StubApp.getString2(8547), bool);
        this.f9302b.put(StubApp.getString2(8548), bool);
        this.f9302b.put(StubApp.getString2(8549), bool);
        this.f9302b.put(StubApp.getString2(8550), bool);
        this.f9302b.put(StubApp.getString2(8551), bool);
        this.f9302b.put(StubApp.getString2(8552), bool);
        this.f9302b.put(StubApp.getString2(8553), bool);
        this.f9302b.put(StubApp.getString2(8554), bool);
        this.f9302b.put(StubApp.getString2(8555), bool);
        this.f9302b.put(StubApp.getString2(8556), bool);
        Boolean bool2 = Boolean.TRUE;
        j(StubApp.getString2(5296), AbstractC0378a.H(bool2));
        j(StubApp.getString2(9284), AbstractC0378a.H(bool2));
        j(StubApp.getString2(5297), AbstractC0378a.H(bool2));
        j(StubApp.getString2(9285), AbstractC0378a.H(bool2));
    }

    @Override // a7.i
    public final ArrayList a() {
        return this.f10718v;
    }

    @Override // a7.i
    public final ArrayList b() {
        return this.f10717u;
    }

    @Override // a7.f
    public final String h() {
        return StubApp.getString2(8563);
    }

    @Override // a7.f
    public final void i(String property) {
        Intrinsics.checkNotNullParameter(property, "property");
        int hashCode = property.hashCode();
        P6.c cVar = this.f9313n;
        P6.c cVar2 = this.f9311l;
        switch (hashCode) {
            case -2146810373:
                String string2 = StubApp.getString2(8535);
                if (property.equals(string2)) {
                    Q6.c cVar3 = (Q6.c) cVar2;
                    h.y(string2, h.f(string2, cVar3, StubApp.getString2(9322)), cVar3);
                    Q6.c cVar4 = (Q6.c) cVar;
                    h.y(string2, h.f(string2, cVar4, StubApp.getString2(9322)), cVar4);
                    break;
                }
                break;
            case -2041493401:
                String string22 = StubApp.getString2(8522);
                if (property.equals(string22)) {
                    Q6.c cVar5 = (Q6.c) cVar2;
                    h.y(string22, h.f(string22, cVar5, StubApp.getString2(9321)), cVar5);
                    Q6.c cVar6 = (Q6.c) cVar;
                    h.y(string22, h.f(string22, cVar6, StubApp.getString2(9321)), cVar6);
                    break;
                }
                break;
            case -1946894033:
                String string23 = StubApp.getString2(117);
                if (property.equals(string23)) {
                    Q6.c cVar7 = (Q6.c) cVar2;
                    h.y(string23, h.f(string23, cVar7, StubApp.getString2(9320)), cVar7);
                    Q6.c cVar8 = (Q6.c) cVar;
                    h.y(string23, h.f(string23, cVar8, StubApp.getString2(9320)), cVar8);
                    break;
                }
                break;
            case -1747293499:
                String string24 = StubApp.getString2(8553);
                if (property.equals(string24)) {
                    Q6.c cVar9 = (Q6.c) cVar2;
                    h.y(string24, h.f(string24, cVar9, StubApp.getString2(9319)), cVar9);
                    Q6.c cVar10 = (Q6.c) cVar;
                    h.y(string24, h.f(string24, cVar10, StubApp.getString2(9319)), cVar10);
                    break;
                }
                break;
            case -1717422239:
                String string25 = StubApp.getString2(8534);
                if (property.equals(string25)) {
                    Q6.c cVar11 = (Q6.c) cVar2;
                    h.y(string25, h.f(string25, cVar11, StubApp.getString2(9318)), cVar11);
                    Q6.c cVar12 = (Q6.c) cVar;
                    h.y(string25, h.f(string25, cVar12, StubApp.getString2(9318)), cVar12);
                    break;
                }
                break;
            case -1708933018:
                String string26 = StubApp.getString2(8541);
                if (property.equals(string26)) {
                    Q6.c cVar13 = (Q6.c) cVar2;
                    h.y(string26, h.f(string26, cVar13, StubApp.getString2(9317)), cVar13);
                    Q6.c cVar14 = (Q6.c) cVar;
                    h.y(string26, h.f(string26, cVar14, StubApp.getString2(9317)), cVar14);
                    break;
                }
                break;
            case -1690648887:
                String string27 = StubApp.getString2(8542);
                if (property.equals(string27)) {
                    Q6.c cVar15 = (Q6.c) cVar2;
                    h.y(string27, h.f(string27, cVar15, StubApp.getString2(9316)), cVar15);
                    Q6.c cVar16 = (Q6.c) cVar;
                    h.y(string27, h.f(string27, cVar16, StubApp.getString2(9316)), cVar16);
                    break;
                }
                break;
            case -1628743893:
                String string28 = StubApp.getString2(8551);
                if (property.equals(string28)) {
                    Q6.c cVar17 = (Q6.c) cVar2;
                    h.y(string28, h.f(string28, cVar17, StubApp.getString2(9315)), cVar17);
                    Q6.c cVar18 = (Q6.c) cVar;
                    h.y(string28, h.f(string28, cVar18, StubApp.getString2(9315)), cVar18);
                    break;
                }
                break;
            case -1600683761:
                String string29 = StubApp.getString2(8538);
                if (property.equals(string29)) {
                    Q6.c cVar19 = (Q6.c) cVar2;
                    h.y(string29, h.f(string29, cVar19, StubApp.getString2(9314)), cVar19);
                    Q6.c cVar20 = (Q6.c) cVar;
                    h.y(string29, h.f(string29, cVar20, StubApp.getString2(9314)), cVar20);
                    break;
                }
                break;
            case -1595213049:
                String string210 = StubApp.getString2(8521);
                if (property.equals(string210)) {
                    Q6.c cVar21 = (Q6.c) cVar2;
                    h.y(string210, h.f(string210, cVar21, StubApp.getString2(9212)), cVar21);
                    Q6.c cVar22 = (Q6.c) cVar;
                    h.y(string210, h.f(string210, cVar22, StubApp.getString2(9212)), cVar22);
                    break;
                }
                break;
            case -1436636971:
                String string211 = StubApp.getString2(8523);
                if (property.equals(string211)) {
                    Q6.c cVar23 = (Q6.c) cVar2;
                    h.y(string211, h.f(string211, cVar23, StubApp.getString2(9313)), cVar23);
                    Q6.c cVar24 = (Q6.c) cVar;
                    h.y(string211, h.f(string211, cVar24, StubApp.getString2(9313)), cVar24);
                    break;
                }
                break;
            case -1362940800:
                String string212 = StubApp.getString2(8531);
                if (property.equals(string212)) {
                    Q6.c cVar25 = (Q6.c) cVar2;
                    h.y(string212, h.f(string212, cVar25, StubApp.getString2(9312)), cVar25);
                    Q6.c cVar26 = (Q6.c) cVar;
                    h.y(string212, h.f(string212, cVar26, StubApp.getString2(9312)), cVar26);
                    break;
                }
                break;
            case -1336352187:
                String string213 = StubApp.getString2(8526);
                if (property.equals(string213)) {
                    Q6.c cVar27 = (Q6.c) cVar2;
                    h.y(string213, h.f(string213, cVar27, StubApp.getString2(9311)), cVar27);
                    Q6.c cVar28 = (Q6.c) cVar;
                    h.y(string213, h.f(string213, cVar28, StubApp.getString2(9311)), cVar28);
                    break;
                }
                break;
            case -1262567732:
                String string214 = StubApp.getString2(8537);
                if (property.equals(string214)) {
                    Q6.c cVar29 = (Q6.c) cVar2;
                    h.y(string214, h.f(string214, cVar29, StubApp.getString2(9310)), cVar29);
                    Q6.c cVar30 = (Q6.c) cVar;
                    h.y(string214, h.f(string214, cVar30, StubApp.getString2(9310)), cVar30);
                    break;
                }
                break;
            case -1083772767:
                String string215 = StubApp.getString2(8536);
                if (property.equals(string215)) {
                    Q6.c cVar31 = (Q6.c) cVar2;
                    h.y(string215, h.f(string215, cVar31, StubApp.getString2(9309)), cVar31);
                    Q6.c cVar32 = (Q6.c) cVar;
                    h.y(string215, h.f(string215, cVar32, StubApp.getString2(9309)), cVar32);
                    break;
                }
                break;
            case -951348361:
                String string216 = StubApp.getString2(8543);
                if (property.equals(string216)) {
                    Q6.c cVar33 = (Q6.c) cVar2;
                    h.y(string216, h.f(string216, cVar33, StubApp.getString2(9308)), cVar33);
                    Q6.c cVar34 = (Q6.c) cVar;
                    h.y(string216, h.f(string216, cVar34, StubApp.getString2(9308)), cVar34);
                    break;
                }
                break;
            case -888013006:
                String string217 = StubApp.getString2(8549);
                if (property.equals(string217)) {
                    Q6.c cVar35 = (Q6.c) cVar2;
                    h.y(string217, h.f(string217, cVar35, StubApp.getString2(9307)), cVar35);
                    Q6.c cVar36 = (Q6.c) cVar;
                    h.y(string217, h.f(string217, cVar36, StubApp.getString2(9307)), cVar36);
                    break;
                }
                break;
            case -886443260:
                String string218 = StubApp.getString2(8540);
                if (property.equals(string218)) {
                    Q6.c cVar37 = (Q6.c) cVar2;
                    h.y(string218, h.f(string218, cVar37, StubApp.getString2(9306)), cVar37);
                    Q6.c cVar38 = (Q6.c) cVar;
                    h.y(string218, h.f(string218, cVar38, StubApp.getString2(9306)), cVar38);
                    break;
                }
                break;
            case -869728875:
                String string219 = StubApp.getString2(8550);
                if (property.equals(string219)) {
                    Q6.c cVar39 = (Q6.c) cVar2;
                    h.y(string219, h.f(string219, cVar39, StubApp.getString2(9305)), cVar39);
                    Q6.c cVar40 = (Q6.c) cVar;
                    h.y(string219, h.f(string219, cVar40, StubApp.getString2(9305)), cVar40);
                    break;
                }
                break;
            case -564393509:
                String string220 = StubApp.getString2(8545);
                if (property.equals(string220)) {
                    Q6.c cVar41 = (Q6.c) cVar2;
                    h.y(StubApp.getString2(8545), h.f(string220, cVar41, StubApp.getString2(9304)), cVar41);
                    Q6.c cVar42 = (Q6.c) cVar;
                    h.y(StubApp.getString2(8545), h.f(string220, cVar42, StubApp.getString2(9304)), cVar42);
                    break;
                }
                break;
            case -483024021:
                String string221 = StubApp.getString2(8552);
                if (property.equals(string221)) {
                    Q6.c cVar43 = (Q6.c) cVar2;
                    h.y(StubApp.getString2(8552), h.f(string221, cVar43, StubApp.getString2(9303)), cVar43);
                    Q6.c cVar44 = (Q6.c) cVar;
                    h.y(StubApp.getString2(8552), h.f(string221, cVar44, StubApp.getString2(9303)), cVar44);
                    break;
                }
                break;
            case -465299984:
                String string222 = StubApp.getString2(8529);
                if (property.equals(string222)) {
                    Q6.c cVar45 = (Q6.c) cVar2;
                    h.y(StubApp.getString2(8529), h.f(string222, cVar45, StubApp.getString2(9302)), cVar45);
                    Q6.c cVar46 = (Q6.c) cVar;
                    h.y(StubApp.getString2(8529), h.f(string222, cVar46, StubApp.getString2(9302)), cVar46);
                    break;
                }
                break;
            case -199448228:
                String string223 = StubApp.getString2(8554);
                if (property.equals(string223)) {
                    Q6.c cVar47 = (Q6.c) cVar2;
                    h.y(StubApp.getString2(8554), h.f(string223, cVar47, StubApp.getString2(9301)), cVar47);
                    Q6.c cVar48 = (Q6.c) cVar;
                    h.y(StubApp.getString2(8554), h.f(string223, cVar48, StubApp.getString2(9301)), cVar48);
                    break;
                }
                break;
            case -197162119:
                String string224 = StubApp.getString2(8555);
                if (property.equals(string224)) {
                    Q6.c cVar49 = (Q6.c) cVar2;
                    h.y(StubApp.getString2(8555), h.f(string224, cVar49, StubApp.getString2(9300)), cVar49);
                    Q6.c cVar50 = (Q6.c) cVar;
                    h.y(StubApp.getString2(8555), h.f(string224, cVar50, StubApp.getString2(9300)), cVar50);
                    break;
                }
                break;
            case 317300605:
                String string225 = StubApp.getString2(8532);
                if (property.equals(string225)) {
                    Q6.c cVar51 = (Q6.c) cVar2;
                    h.y(StubApp.getString2(8532), h.f(string225, cVar51, StubApp.getString2(9299)), cVar51);
                    Q6.c cVar52 = (Q6.c) cVar;
                    h.y(StubApp.getString2(8532), h.f(string225, cVar52, StubApp.getString2(9299)), cVar52);
                    break;
                }
                break;
            case 428355132:
                String string226 = StubApp.getString2(8530);
                if (property.equals(string226)) {
                    Q6.c cVar53 = (Q6.c) cVar2;
                    h.y(StubApp.getString2(8530), h.f(string226, cVar53, StubApp.getString2(9298)), cVar53);
                    Q6.c cVar54 = (Q6.c) cVar;
                    h.y(StubApp.getString2(8530), h.f(string226, cVar54, StubApp.getString2(9298)), cVar54);
                    break;
                }
                break;
            case 525511352:
                String string227 = StubApp.getString2(8548);
                if (property.equals(string227)) {
                    Q6.c cVar55 = (Q6.c) cVar2;
                    h.y(StubApp.getString2(8548), h.f(string227, cVar55, StubApp.getString2(9297)), cVar55);
                    Q6.c cVar56 = (Q6.c) cVar;
                    h.y(StubApp.getString2(8548), h.f(string227, cVar56, StubApp.getString2(9297)), cVar56);
                    break;
                }
                break;
            case 676079173:
                String string228 = StubApp.getString2(8524);
                if (property.equals(string228)) {
                    Q6.c cVar57 = (Q6.c) cVar2;
                    h.y(StubApp.getString2(8524), h.f(string228, cVar57, StubApp.getString2(9296)), cVar57);
                    Q6.c cVar58 = (Q6.c) cVar;
                    h.y(StubApp.getString2(8524), h.f(string228, cVar58, StubApp.getString2(9296)), cVar58);
                    break;
                }
                break;
            case 748171971:
                String string229 = StubApp.getString2(8546);
                if (property.equals(string229)) {
                    Q6.c cVar59 = (Q6.c) cVar2;
                    h.y(StubApp.getString2(8546), h.f(string229, cVar59, StubApp.getString2(9295)), cVar59);
                    Q6.c cVar60 = (Q6.c) cVar;
                    h.y(StubApp.getString2(8546), h.f(string229, cVar60, StubApp.getString2(9295)), cVar60);
                    break;
                }
                break;
            case 750756954:
                String string230 = StubApp.getString2(8528);
                if (property.equals(string230)) {
                    Q6.c cVar61 = (Q6.c) cVar2;
                    h.y(StubApp.getString2(8528), h.f(string230, cVar61, StubApp.getString2(9294)), cVar61);
                    Q6.c cVar62 = (Q6.c) cVar;
                    h.y(StubApp.getString2(8528), h.f(string230, cVar62, StubApp.getString2(9294)), cVar62);
                    break;
                }
                break;
            case 961593943:
                String string231 = StubApp.getString2(8547);
                if (property.equals(string231)) {
                    Q6.c cVar63 = (Q6.c) cVar2;
                    h.y(StubApp.getString2(8547), h.f(string231, cVar63, StubApp.getString2(9293)), cVar63);
                    Q6.c cVar64 = (Q6.c) cVar;
                    h.y(StubApp.getString2(8547), h.f(string231, cVar64, StubApp.getString2(9293)), cVar64);
                    break;
                }
                break;
            case 1304244361:
                String string232 = StubApp.getString2(8525);
                if (property.equals(string232)) {
                    Q6.c cVar65 = (Q6.c) cVar2;
                    h.y(StubApp.getString2(8525), h.f(string232, cVar65, StubApp.getString2(9292)), cVar65);
                    Q6.c cVar66 = (Q6.c) cVar;
                    h.y(StubApp.getString2(8525), h.f(string232, cVar66, StubApp.getString2(9292)), cVar66);
                    break;
                }
                break;
            case 1419415223:
                String string233 = StubApp.getString2(8544);
                if (property.equals(string233)) {
                    Q6.c cVar67 = (Q6.c) cVar2;
                    h.y(StubApp.getString2(8544), h.f(string233, cVar67, StubApp.getString2(9291)), cVar67);
                    Q6.c cVar68 = (Q6.c) cVar;
                    h.y(StubApp.getString2(8544), h.f(string233, cVar68, StubApp.getString2(9291)), cVar68);
                    break;
                }
                break;
            case 1561581864:
                String string234 = StubApp.getString2(8556);
                if (property.equals(string234)) {
                    Q6.c cVar69 = (Q6.c) cVar2;
                    h.y(StubApp.getString2(8556), h.f(string234, cVar69, StubApp.getString2(9290)), cVar69);
                    Q6.c cVar70 = (Q6.c) cVar;
                    h.y(StubApp.getString2(8556), h.f(string234, cVar70, StubApp.getString2(9290)), cVar70);
                    break;
                }
                break;
            case 1638989475:
                String string235 = StubApp.getString2(8539);
                if (property.equals(string235)) {
                    Q6.c cVar71 = (Q6.c) cVar2;
                    h.y(StubApp.getString2(8539), h.f(string235, cVar71, StubApp.getString2(9289)), cVar71);
                    Q6.c cVar72 = (Q6.c) cVar;
                    h.y(StubApp.getString2(8539), h.f(string235, cVar72, StubApp.getString2(9289)), cVar72);
                    break;
                }
                break;
            case 1660037973:
                String string236 = StubApp.getString2(8527);
                if (property.equals(string236)) {
                    Q6.c cVar73 = (Q6.c) cVar2;
                    h.y(string236, h.f(string236, cVar73, StubApp.getString2(9288)), cVar73);
                    Q6.c cVar74 = (Q6.c) cVar;
                    h.y(string236, h.f(string236, cVar74, StubApp.getString2(9288)), cVar74);
                    break;
                }
                break;
            case 1859954313:
                String string237 = StubApp.getString2(8520);
                if (property.equals(string237)) {
                    Q6.c cVar75 = (Q6.c) cVar2;
                    h.y(string237, h.f(string237, cVar75, StubApp.getString2(9287)), cVar75);
                    Q6.c cVar76 = (Q6.c) cVar;
                    h.y(string237, h.f(string237, cVar76, StubApp.getString2(9287)), cVar76);
                    break;
                }
                break;
            case 2053557555:
                String string238 = StubApp.getString2(8533);
                if (property.equals(string238)) {
                    Q6.c cVar77 = (Q6.c) cVar2;
                    h.y(string238, h.f(string238, cVar77, StubApp.getString2(9286)), cVar77);
                    Q6.c cVar78 = (Q6.c) cVar;
                    h.y(string238, h.f(string238, cVar78, StubApp.getString2(9286)), cVar78);
                    break;
                }
                break;
        }
    }
}
