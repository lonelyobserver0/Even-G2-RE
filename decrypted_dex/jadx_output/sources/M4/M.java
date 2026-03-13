package M4;

import com.stub.StubApp;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class M extends D implements Set {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f4554c = 0;

    /* renamed from: b, reason: collision with root package name */
    public transient I f4555b;

    public static int j(int i3) {
        int max = Math.max(i3, 2);
        if (max >= 751619276) {
            hc.b.h(StubApp.getString2(3543), max < 1073741824);
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    public static M l(int i3, Object... objArr) {
        if (i3 == 0) {
            return f0.f4614k;
        }
        if (i3 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new l0(obj);
        }
        int j = j(i3);
        Object[] objArr2 = new Object[j];
        int i10 = j - 1;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < i3; i13++) {
            Object obj2 = objArr[i13];
            if (obj2 == null) {
                throw new NullPointerException(i2.u.p(i13, StubApp.getString2(3544)));
            }
            int hashCode = obj2.hashCode();
            int q10 = r.q(hashCode);
            while (true) {
                int i14 = q10 & i10;
                Object obj3 = objArr2[i14];
                if (obj3 == null) {
                    objArr[i12] = obj2;
                    objArr2[i14] = obj2;
                    i11 += hashCode;
                    i12++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                q10++;
            }
        }
        Arrays.fill(objArr, i12, i3, (Object) null);
        if (i12 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new l0(obj4);
        }
        if (j(i12) < j / 2) {
            return l(i12, objArr);
        }
        int length = objArr.length;
        if (i12 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i12);
        }
        return new f0(objArr, objArr2, i11, i10, i12);
    }

    public static M m(Collection collection) {
        if ((collection instanceof M) && !(collection instanceof SortedSet)) {
            M m4 = (M) collection;
            if (!m4.g()) {
                return m4;
            }
        }
        Object[] array = collection.toArray();
        return l(array.length, array);
    }

    @Override // M4.D
    public I a() {
        I i3 = this.f4555b;
        if (i3 != null) {
            return i3;
        }
        I n10 = n();
        this.f4555b = n10;
        return n10;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof M) && (this instanceof f0)) {
            M m4 = (M) obj;
            m4.getClass();
            if ((m4 instanceof f0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return r.g(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return r.k(this);
    }

    public I n() {
        Object[] array = toArray(D.f4540a);
        G g10 = I.f4549b;
        return I.j(array.length, array);
    }
}
