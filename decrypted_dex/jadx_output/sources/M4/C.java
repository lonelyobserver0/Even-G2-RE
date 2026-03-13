package M4;

import com.stub.StubApp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f4537a;

    /* renamed from: b, reason: collision with root package name */
    public int f4538b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4539c;

    public C(int i3) {
        r.d(i3, StubApp.getString2(2352));
        this.f4537a = new Object[i3];
        this.f4538b = 0;
    }

    public static int f(int i3, int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(StubApp.getString2(3539));
        }
        if (i10 <= i3) {
            return i3;
        }
        int i11 = i3 + (i3 >> 1) + 1;
        if (i11 < i10) {
            i11 = Integer.highestOneBit(i10 - 1) << 1;
        }
        return i11 < 0 ? IntCompanionObject.MAX_VALUE : i11;
    }

    public final void a(Object obj) {
        obj.getClass();
        e(1);
        Object[] objArr = this.f4537a;
        int i3 = this.f4538b;
        this.f4538b = i3 + 1;
        objArr[i3] = obj;
    }

    public final void b(Object... objArr) {
        int length = objArr.length;
        r.b(length, objArr);
        e(length);
        System.arraycopy(objArr, 0, this.f4537a, this.f4538b, length);
        this.f4538b += length;
    }

    public abstract C c(Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(List list) {
        if (list != 0) {
            e(list.size());
            if (list instanceof D) {
                this.f4538b = ((D) list).b(this.f4538b, this.f4537a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void e(int i3) {
        Object[] objArr = this.f4537a;
        int f10 = f(objArr.length, this.f4538b + i3);
        if (f10 > objArr.length || this.f4539c) {
            this.f4537a = Arrays.copyOf(this.f4537a, f10);
            this.f4539c = false;
        }
    }
}
