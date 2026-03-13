package Z9;

import ea.InterfaceC0856c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public class L extends K {

    /* renamed from: l, reason: collision with root package name */
    public final float f9100l;

    /* renamed from: m, reason: collision with root package name */
    public final float f9101m;

    /* renamed from: n, reason: collision with root package name */
    public int f9102n;

    /* renamed from: o, reason: collision with root package name */
    public final List f9103o;

    public L(InterfaceC0856c interfaceC0856c, String str, String str2, List list, int i3, int i10) {
        super(interfaceC0856c, str, str2);
        this.f9102n = 0;
        this.f9103o = list;
        this.f9100l = i3;
        this.f9101m = i10;
        this.j = new ArrayList();
        this.f9102n = 0;
        new J(this, 1).c(list);
    }

    public static ArrayList l(int i3, List list) {
        int size = list.size() / i3;
        ArrayList arrayList = new ArrayList(size);
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 * i3;
            i10++;
            arrayList.add(list.subList(i11, i10 * i3));
        }
        return arrayList;
    }

    public final void e(List list, I i3) {
        this.j.addAll(list);
        this.j.add(i3);
    }

    public final void f(List list, I i3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            e((List) it.next(), i3);
        }
    }

    public final List g(ArrayList arrayList, boolean z2) {
        if (this.j.isEmpty()) {
            if (z2) {
                e(Arrays.asList(Float.valueOf(0.0f), Float.valueOf(((Number) arrayList.get(0)).floatValue() + this.f9101m)), new I(13));
                return arrayList.subList(1, arrayList.size());
            }
            e(Arrays.asList(Float.valueOf(0.0f), Float.valueOf(this.f9100l)), new I(13));
        }
        return arrayList;
    }

    public final void h() {
        I i3 = this.f9102n > 0 ? (I) i2.u.j(1, this.j) : null;
        I i10 = new I(9);
        if (i3 == null || i10.equals(i3)) {
            return;
        }
        e(Collections.EMPTY_LIST, i10);
    }

    public final void i(ArrayList arrayList, boolean z2) {
        int i3;
        int i10;
        int i11 = 2;
        int i12 = 5;
        List list = arrayList;
        boolean z10 = z2;
        while (list.size() >= 4) {
            boolean z11 = list.size() == i12;
            if (z10) {
                Number number = (Number) list.get(0);
                Number number2 = (Number) list.get(1);
                Number number3 = (Number) list.get(i11);
                Number number4 = z11 ? (Number) list.get(4) : 0;
                Number number5 = (Number) list.get(3);
                i3 = i12;
                Number[] numberArr = new Number[6];
                numberArr[0] = number;
                numberArr[1] = 0;
                numberArr[i11] = number2;
                numberArr[3] = number3;
                numberArr[4] = number4;
                numberArr[i3] = number5;
                e(Arrays.asList(numberArr), new I(8));
                i10 = i11;
            } else {
                i3 = i12;
                Number number6 = (Number) list.get(0);
                Number number7 = (Number) list.get(1);
                Number number8 = (Number) list.get(i11);
                Number number9 = (Number) list.get(3);
                Number number10 = z11 ? (Number) list.get(4) : 0;
                i10 = i11;
                Number[] numberArr2 = new Number[6];
                numberArr2[0] = 0;
                numberArr2[1] = number6;
                numberArr2[i10] = number7;
                numberArr2[3] = number8;
                numberArr2[4] = number9;
                numberArr2[i3] = number10;
                e(Arrays.asList(numberArr2), new I(8));
            }
            list = list.subList(z11 ? i3 : 4, list.size());
            z10 = !z10;
            i11 = i10;
            i12 = i3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    public final void j(ArrayList arrayList, boolean z2) {
        for (ArrayList arrayList2 = arrayList; !arrayList2.isEmpty(); arrayList2 = arrayList2.subList(1, arrayList2.size())) {
            e(arrayList2.subList(0, 1), new I(z2 ? 6 : 7));
            z2 = !z2;
        }
    }

    public final void k(ArrayList arrayList, boolean z2) {
        int i3;
        int i10;
        int i11 = 2;
        List list = arrayList;
        while (list.size() >= 4) {
            int i12 = list.size() % 4 == 1 ? 1 : 0;
            if (z2) {
                Number number = (Number) list.get(i12);
                Number number2 = i12 != 0 ? (Number) list.get(0) : 0;
                Number number3 = (Number) list.get(i12 != 0 ? i11 : 1);
                Number number4 = (Number) list.get(i12 != 0 ? 3 : i11);
                Number number5 = (Number) list.get(i12 != 0 ? 4 : 3);
                i3 = 5;
                Number[] numberArr = new Number[6];
                numberArr[0] = number;
                numberArr[1] = number2;
                numberArr[i11] = number3;
                numberArr[3] = number4;
                numberArr[4] = number5;
                numberArr[5] = 0;
                e(Arrays.asList(numberArr), new I(8));
                i10 = i11;
            } else {
                i3 = 5;
                Number number6 = i12 != 0 ? (Number) list.get(0) : 0;
                Number number7 = (Number) list.get(i12);
                Number number8 = (Number) list.get(i12 != 0 ? i11 : 1);
                Number number9 = (Number) list.get(i12 != 0 ? 3 : i11);
                Number number10 = (Number) list.get(i12 != 0 ? 4 : 3);
                i10 = i11;
                Number[] numberArr2 = new Number[6];
                numberArr2[0] = number6;
                numberArr2[1] = number7;
                numberArr2[i10] = number8;
                numberArr2[3] = number9;
                numberArr2[4] = 0;
                numberArr2[5] = number10;
                e(Arrays.asList(numberArr2), new I(8));
            }
            list = list.subList(i12 != 0 ? i3 : 4, list.size());
            i11 = i10;
        }
    }
}
