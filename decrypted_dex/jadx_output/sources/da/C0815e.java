package da;

import com.stub.StubApp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p0.AbstractC1482f;

/* renamed from: da.e, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0815e implements InterfaceC0813c {

    /* renamed from: a, reason: collision with root package name */
    public int f13499a;

    /* renamed from: b, reason: collision with root package name */
    public int f13500b;

    /* renamed from: c, reason: collision with root package name */
    public long f13501c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f13502d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f13503e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public HashMap f13504f = new HashMap();

    public static int[] b(int i3) {
        int[] iArr = new int[i3];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    public final void a(int i3) {
        this.f13502d = b(i3 + 1);
        for (Map.Entry entry : this.f13504f.entrySet()) {
            if (this.f13502d[((Integer) entry.getValue()).intValue()] == -1) {
                this.f13502d[((Integer) entry.getValue()).intValue()] = ((Integer) entry.getKey()).intValue();
            } else {
                HashMap hashMap = this.f13503e;
                List list = (List) hashMap.get(entry.getValue());
                List list2 = list;
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    hashMap.put(entry.getValue(), arrayList);
                    arrayList.add(Integer.valueOf(this.f13502d[((Integer) entry.getValue()).intValue()]));
                    this.f13502d[((Integer) entry.getValue()).intValue()] = Integer.MIN_VALUE;
                    list2 = arrayList;
                }
                list2.add(entry.getKey());
            }
        }
    }

    @Override // da.InterfaceC0813c
    public final ArrayList c(int i3) {
        int[] iArr;
        int i10 = (i3 < 0 || (iArr = this.f13502d) == null || i3 >= iArr.length) ? -1 : iArr[i3];
        if (i10 == -1) {
            return null;
        }
        if (i10 != Integer.MIN_VALUE) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf(i10));
            return arrayList;
        }
        List list = (List) this.f13503e.get(Integer.valueOf(i3));
        if (list == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(list);
        Collections.sort(arrayList2);
        return arrayList2;
    }

    @Override // da.InterfaceC0813c
    public final int e(int i3) {
        Integer num = (Integer) this.f13504f.get(Integer.valueOf(i3));
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(StubApp.getString2(1352));
        sb2.append(this.f13499a);
        sb2.append(StubApp.getString2(397));
        return AbstractC1482f.f(this.f13500b, StubApp.getString2(265), sb2);
    }
}
