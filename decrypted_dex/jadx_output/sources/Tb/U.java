package Tb;

import java.util.Arrays;
import kotlin.coroutines.CoroutineContext;
import r0.AbstractC1550k;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public int f7318a;

    /* renamed from: b, reason: collision with root package name */
    public int f7319b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7320c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7321d;

    public U() {
        this.f7320c = new long[10];
        this.f7321d = new Object[10];
    }

    public synchronized void a(long j, Object obj) {
        if (this.f7319b > 0) {
            if (j <= ((long[]) this.f7320c)[((this.f7318a + r0) - 1) % ((Object[]) this.f7321d).length]) {
                b();
            }
        }
        c();
        int i3 = this.f7318a;
        int i10 = this.f7319b;
        Object[] objArr = (Object[]) this.f7321d;
        int length = (i3 + i10) % objArr.length;
        ((long[]) this.f7320c)[length] = j;
        objArr[length] = obj;
        this.f7319b = i10 + 1;
    }

    public synchronized void b() {
        this.f7318a = 0;
        this.f7319b = 0;
        Arrays.fill((Object[]) this.f7321d, (Object) null);
    }

    public void c() {
        int length = ((Object[]) this.f7321d).length;
        if (this.f7319b < length) {
            return;
        }
        int i3 = length * 2;
        long[] jArr = new long[i3];
        Object[] objArr = new Object[i3];
        int i10 = this.f7318a;
        int i11 = length - i10;
        System.arraycopy((long[]) this.f7320c, i10, jArr, 0, i11);
        System.arraycopy((Object[]) this.f7321d, this.f7318a, objArr, 0, i11);
        int i12 = this.f7318a;
        if (i12 > 0) {
            System.arraycopy((long[]) this.f7320c, 0, jArr, i11, i12);
            System.arraycopy((Object[]) this.f7321d, 0, objArr, i11, this.f7318a);
        }
        this.f7320c = jArr;
        this.f7321d = objArr;
        this.f7318a = 0;
    }

    public synchronized Object d() {
        return this.f7319b == 0 ? null : f();
    }

    public synchronized Object e(long j) {
        Object obj;
        obj = null;
        while (this.f7319b > 0 && j - ((long[]) this.f7320c)[this.f7318a] >= 0) {
            obj = f();
        }
        return obj;
    }

    public Object f() {
        AbstractC1550k.g(this.f7319b > 0);
        Object[] objArr = (Object[]) this.f7321d;
        int i3 = this.f7318a;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f7318a = (i3 + 1) % objArr.length;
        this.f7319b--;
        return obj;
    }

    public synchronized int g() {
        return this.f7319b;
    }

    public U(int i3, int i10, InterfaceC0327h interfaceC0327h, CoroutineContext coroutineContext) {
        this.f7320c = interfaceC0327h;
        this.f7318a = i3;
        this.f7319b = i10;
        this.f7321d = coroutineContext;
    }
}
