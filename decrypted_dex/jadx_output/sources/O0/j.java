package O0;

import L0.h0;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import java.util.Objects;
import o0.C1420Q;
import r0.AbstractC1560u;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class j extends C1420Q {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f5131A = 0;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f5132r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f5133s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f5134t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f5135u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f5136v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f5137w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f5138x;

    /* renamed from: y, reason: collision with root package name */
    public final SparseArray f5139y;

    /* renamed from: z, reason: collision with root package name */
    public final SparseBooleanArray f5140z;

    static {
        new j(new i());
        AbstractC1560u.E(1000);
        AbstractC1560u.E(1001);
        AbstractC1560u.E(1002);
        AbstractC1560u.E(1003);
        i2.u.A(1004, 1005, 1006, 1007, 1008);
        i2.u.A(1009, 1010, 1011, 1012, 1013);
        i2.u.A(1014, 1015, 1016, 1017, 1018);
    }

    public j(i iVar) {
        super(iVar);
        this.f5132r = iVar.f5122r;
        this.f5133s = iVar.f5123s;
        this.f5134t = iVar.f5124t;
        this.f5135u = iVar.f5125u;
        this.f5136v = iVar.f5126v;
        this.f5137w = iVar.f5127w;
        this.f5138x = iVar.f5128x;
        this.f5139y = iVar.f5129y;
        this.f5140z = iVar.f5130z;
    }

    @Override // o0.C1420Q
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j.class == obj.getClass()) {
                j jVar = (j) obj;
                if (super.equals(jVar) && this.f5132r == jVar.f5132r && this.f5133s == jVar.f5133s && this.f5134t == jVar.f5134t && this.f5135u == jVar.f5135u && this.f5136v == jVar.f5136v && this.f5137w == jVar.f5137w && this.f5138x == jVar.f5138x) {
                    SparseBooleanArray sparseBooleanArray = this.f5140z;
                    int size = sparseBooleanArray.size();
                    SparseBooleanArray sparseBooleanArray2 = jVar.f5140z;
                    if (sparseBooleanArray2.size() == size) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= size) {
                                SparseArray sparseArray = this.f5139y;
                                int size2 = sparseArray.size();
                                SparseArray sparseArray2 = jVar.f5139y;
                                if (sparseArray2.size() == size2) {
                                    for (int i10 = 0; i10 < size2; i10++) {
                                        int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                                        if (indexOfKey >= 0) {
                                            Map map = (Map) sparseArray.valueAt(i10);
                                            Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                            if (map2.size() == map.size()) {
                                                for (Map.Entry entry : map.entrySet()) {
                                                    h0 h0Var = (h0) entry.getKey();
                                                    if (map2.containsKey(h0Var)) {
                                                        Object value = entry.getValue();
                                                        Object obj2 = map2.get(h0Var);
                                                        int i11 = AbstractC1560u.f20190a;
                                                        if (!Objects.equals(value, obj2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i3)) < 0) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // o0.C1420Q
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.f5132r ? 1 : 0)) * 961) + (this.f5133s ? 1 : 0)) * 961) + (this.f5134t ? 1 : 0)) * 28629151) + (this.f5135u ? 1 : 0)) * 31) + (this.f5136v ? 1 : 0)) * 31) + (this.f5137w ? 1 : 0)) * 961) + (this.f5138x ? 1 : 0)) * 31;
    }
}
