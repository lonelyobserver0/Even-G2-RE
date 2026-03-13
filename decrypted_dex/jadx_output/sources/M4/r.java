package M4;

import com.stub.StubApp;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import kotlin.UByte;
import kotlin.UShort;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class r {
    public static int a(int i3) {
        if (i3 >= 3) {
            return i3 < 1073741824 ? (int) Math.ceil(i3 / 0.75d) : IntCompanionObject.MAX_VALUE;
        }
        d(i3, StubApp.getString2(2021));
        return i3 + 1;
    }

    public static void b(int i3, Object[] objArr) {
        for (int i10 = 0; i10 < i3; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(i2.u.p(i10, StubApp.getString2(3544)));
            }
        }
    }

    public static void c(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(Xa.h.m(obj2, StubApp.getString2(3554)));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException(StubApp.getString2(3552) + obj + StubApp.getString2(3553));
    }

    public static void d(int i3, String str) {
        if (i3 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + StubApp.getString2(3555) + i3);
    }

    public static Object e(int i3) {
        if (i3 < 2 || i3 > 1073741824 || Integer.highestOneBit(i3) != i3) {
            throw new IllegalArgumentException(i2.u.p(i3, StubApp.getString2(3556)));
        }
        return i3 <= 256 ? new byte[i3] : i3 <= 65536 ? new short[i3] : new int[i3];
    }

    public static boolean f(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean g(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static i0 h(Set set, L4.g gVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof i0)) {
                set.getClass();
                return new i0(set, gVar);
            }
            i0 i0Var = (i0) set;
            L4.g gVar2 = i0Var.f4627b;
            gVar2.getClass();
            return new i0(i0Var.f4626a, new L4.h(Arrays.asList(gVar2, gVar)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof i0)) {
            set2.getClass();
            return new j0(set2, gVar);
        }
        i0 i0Var2 = (i0) set2;
        L4.g gVar3 = i0Var2.f4627b;
        gVar3.getClass();
        return new j0((SortedSet) i0Var2.f4626a, new L4.h(Arrays.asList(gVar3, gVar)));
    }

    public static Object i(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object j(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int k(Set set) {
        Iterator it = set.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i3 = ~(~(i3 + (next != null ? next.hashCode() : 0)));
        }
        return i3;
    }

    public static h0 l(M m4, M m10) {
        hc.b.j(m4, StubApp.getString2(3557));
        hc.b.j(m10, StubApp.getString2(3558));
        return new h0(m4, m10);
    }

    public static int m(int i3, int i10, int i11) {
        return (i3 & (~i11)) | (i10 & i11);
    }

    public static ArrayList n(Object... objArr) {
        int length = objArr.length;
        d(length, StubApp.getString2(3559));
        ArrayList arrayList = new ArrayList(android.support.v4.media.session.b.x(length + 5 + (length / 10)));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        r9 = r6 & r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r5 != (-1)) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        t(r1, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r13[r5] = m(r13[r5], r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int o(java.lang.Object r9, java.lang.Object r10, int r11, java.lang.Object r12, int[] r13, java.lang.Object[] r14, java.lang.Object[] r15) {
        /*
            int r0 = r(r9)
            r1 = r0 & r11
            int r2 = s(r1, r12)
            r3 = -1
            if (r2 != 0) goto Le
            goto L40
        Le:
            int r4 = ~r11
            r0 = r0 & r4
            r5 = r3
        L11:
            int r2 = r2 + (-1)
            r6 = r13[r2]
            r7 = r6 & r4
            if (r7 != r0) goto L3c
            r7 = r14[r2]
            boolean r7 = f5.u0.j(r9, r7)
            if (r7 == 0) goto L3c
            if (r15 == 0) goto L2b
            r7 = r15[r2]
            boolean r7 = f5.u0.j(r10, r7)
            if (r7 == 0) goto L3c
        L2b:
            r9 = r6 & r11
            if (r5 != r3) goto L33
            t(r1, r9, r12)
            return r2
        L33:
            r10 = r13[r5]
            int r9 = m(r10, r9, r11)
            r13[r5] = r9
            return r2
        L3c:
            r5 = r6 & r11
            if (r5 != 0) goto L41
        L40:
            return r3
        L41:
            r8 = r5
            r5 = r2
            r2 = r8
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.r.o(java.lang.Object, java.lang.Object, int, java.lang.Object, int[], java.lang.Object[], java.lang.Object[]):int");
    }

    public static void p(List list, L4.g gVar, int i3, int i10) {
        for (int size = list.size() - 1; size > i10; size--) {
            if (gVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i11 = i10 - 1; i11 >= i3; i11--) {
            list.remove(i11);
        }
    }

    public static int q(int i3) {
        return (int) (Integer.rotateLeft((int) (i3 * (-862048943)), 15) * 461845907);
    }

    public static int r(Object obj) {
        return q(obj == null ? 0 : obj.hashCode());
    }

    public static int s(int i3, Object obj) {
        return obj instanceof byte[] ? ((byte[]) obj)[i3] & UByte.MAX_VALUE : obj instanceof short[] ? ((short[]) obj)[i3] & UShort.MAX_VALUE : ((int[]) obj)[i3];
    }

    public static void t(int i3, int i10, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i3] = (byte) i10;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i3] = (short) i10;
        } else {
            ((int[]) obj)[i3] = i10;
        }
    }

    public static AbstractList u(List list, L4.e eVar) {
        return list != null ? new S(list, eVar) : new T(list, eVar);
    }
}
