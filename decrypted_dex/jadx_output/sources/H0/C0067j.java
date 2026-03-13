package H0;

import M4.AbstractC0154z;
import M4.C0152x;
import M4.Y;
import f5.r0;
import i5.C1057a;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o0.C1438m;
import z0.C1986b;

/* renamed from: H0.j, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final /* synthetic */ class C0067j implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2579a;

    public /* synthetic */ C0067j(int i3) {
        this.f2579a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2579a) {
            case 0:
                return l.b(((k) obj).f2580a.f2575c, ((k) obj2).f2580a.f2575c);
            case 1:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b2 = bArr[i3];
                    byte b10 = bArr2[i3];
                    if (b2 != b10) {
                        return b2 - b10;
                    }
                }
                return 0;
            case 2:
                return ((C1438m) obj2).j - ((C1438m) obj).j;
            case 3:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 4:
                return Integer.compare(((O0.g) ((List) obj).get(0)).f5119f, ((O0.g) ((List) obj2).get(0)).f5119f);
            case 5:
                return ((O0.f) Collections.max((List) obj)).compareTo((O0.f) Collections.max((List) obj2));
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C0152x.f(O0.p.c((O0.p) Collections.max(list, new C0067j(8)), (O0.p) Collections.max(list2, new C0067j(8)))).a(list.size(), list2.size()).b((O0.p) Collections.max(list, new C0067j(9)), (O0.p) Collections.max(list2, new C0067j(9)), new C0067j(9)).e();
            case 7:
                return ((O0.m) ((List) obj).get(0)).compareTo((O0.m) ((List) obj2).get(0));
            case 8:
                return O0.p.c((O0.p) obj, (O0.p) obj2);
            case 9:
                O0.p pVar = (O0.p) obj;
                O0.p pVar2 = (O0.p) obj2;
                Y a3 = (pVar.f5158e && pVar.f5161h) ? O0.q.f5172i : O0.q.f5172i.a();
                C0152x c0152x = AbstractC0154z.f4667a;
                pVar.f5159f.getClass();
                return c0152x.b(Integer.valueOf(pVar.f5163l), Integer.valueOf(pVar2.f5163l), a3).b(Integer.valueOf(pVar.f5162k), Integer.valueOf(pVar2.f5162k), a3).e();
            case 10:
                return ((P0.s) obj).f5441a - ((P0.s) obj2).f5441a;
            case 11:
                return Float.compare(((P0.s) obj).f5443c, ((P0.s) obj2).f5443c);
            case 12:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 13:
                return ((f5.F) ((r0) obj)).f13841a.compareTo(((f5.F) ((r0) obj2)).f13841a);
            case 14:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 15:
                String name = ((File) obj).getName();
                int i10 = C1057a.f14833f;
                return name.substring(0, i10).compareTo(((File) obj2).getName().substring(0, i10));
            case 16:
                return Integer.compare(((r1.d) obj2).f20243b, ((r1.d) obj).f20243b);
            case 17:
                C1986b c1986b = (C1986b) obj;
                C1986b c1986b2 = (C1986b) obj2;
                int compare = Integer.compare(c1986b.f23644c, c1986b2.f23644c);
                return compare != 0 ? compare : c1986b.f23643b.compareTo(c1986b2.f23643b);
            case 18:
                return Integer.compare(((y1.d) obj).f23466a.f23469b, ((y1.d) obj2).f23466a.f23469b);
            default:
                return Long.compare(((y1.c) obj).f23463b, ((y1.c) obj2).f23463b);
        }
    }
}
