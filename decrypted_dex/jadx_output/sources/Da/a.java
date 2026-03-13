package Da;

import com.stub.StubApp;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.markedcontent.b;
import oa.AbstractC1469b;
import oa.C1471d;
import oa.j;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1529b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C1471d c1471d, int i3) {
        super(c1471d);
        this.f1529b = i3;
        switch (i3) {
            case 1:
                super(c1471d);
                AbstractC1469b O7 = c1471d.O(j.f18621y3);
                j jVar = j.f18599t2;
                if (O7.equals(jVar)) {
                    return;
                }
                throw new IllegalArgumentException(StubApp.getString2(1560) + jVar + StubApp.getString2(620));
            default:
                AbstractC1469b O10 = c1471d.O(j.f18621y3);
                j jVar2 = j.f18594s2;
                if (O10.equals(jVar2)) {
                    return;
                }
                throw new IllegalArgumentException(StubApp.getString2(1560) + jVar2 + StubApp.getString2(620));
        }
    }

    public String toString() {
        switch (this.f1529b) {
            case 0:
                return super.toString() + StubApp.getString2(1561) + this.f12789a.R(j.f18566m2) + StubApp.getString2(74);
            default:
                return super.toString();
        }
    }
}
