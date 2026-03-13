package d0;

import android.util.Log;
import com.stub.StubApp;
import e0.AbstractC0831d;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: d0.a, reason: case insensitive filesystem */
/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes1.dex */
public final class C0771a implements J {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13240a;

    /* renamed from: b, reason: collision with root package name */
    public int f13241b;

    /* renamed from: c, reason: collision with root package name */
    public int f13242c;

    /* renamed from: d, reason: collision with root package name */
    public int f13243d;

    /* renamed from: e, reason: collision with root package name */
    public int f13244e;

    /* renamed from: f, reason: collision with root package name */
    public int f13245f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f13246g;

    /* renamed from: h, reason: collision with root package name */
    public String f13247h;

    /* renamed from: i, reason: collision with root package name */
    public int f13248i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public int f13249k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f13250l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f13251m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f13252n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13253o;

    /* renamed from: p, reason: collision with root package name */
    public final M f13254p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13255q;

    /* renamed from: r, reason: collision with root package name */
    public int f13256r;

    public C0771a(M m4) {
        m4.G();
        C0791v c0791v = m4.f13179w;
        if (c0791v != null) {
            c0791v.f13392b.getClassLoader();
        }
        this.f13240a = new ArrayList();
        this.f13253o = false;
        this.f13256r = -1;
        this.f13254p = m4;
    }

    @Override // d0.J
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16640) + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f13246g) {
            return true;
        }
        this.f13254p.f13161d.add(this);
        return true;
    }

    public final void b(V v2) {
        this.f13240a.add(v2);
        v2.f13222d = this.f13241b;
        v2.f13223e = this.f13242c;
        v2.f13224f = this.f13243d;
        v2.f13225g = this.f13244e;
    }

    public final void c(int i3) {
        if (this.f13246g) {
            boolean J10 = M.J(2);
            String string2 = StubApp.getString2(49);
            if (J10) {
                Log.v(string2, StubApp.getString2(16641) + this + StubApp.getString2(9591) + i3);
            }
            ArrayList arrayList = this.f13240a;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                V v2 = (V) arrayList.get(i10);
                AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t = v2.f13220b;
                if (abstractComponentCallbacksC0789t != null) {
                    abstractComponentCallbacksC0789t.f13383t += i3;
                    if (M.J(2)) {
                        Log.v(string2, StubApp.getString2(16642) + v2.f13220b + StubApp.getString2(1632) + v2.f13220b.f13383t);
                    }
                }
            }
        }
    }

    public final int d(boolean z2) {
        if (this.f13255q) {
            throw new IllegalStateException(StubApp.getString2(16644));
        }
        if (M.J(2)) {
            Log.v(StubApp.getString2(49), StubApp.getString2(16643) + this);
            PrintWriter printWriter = new PrintWriter(new X());
            f(StubApp.getString2(6127), printWriter, true);
            printWriter.close();
        }
        this.f13255q = true;
        boolean z10 = this.f13246g;
        M m4 = this.f13254p;
        if (z10) {
            this.f13256r = m4.j.getAndIncrement();
        } else {
            this.f13256r = -1;
        }
        m4.x(this, z2);
        return this.f13256r;
    }

    public final void e(int i3, AbstractComponentCallbacksC0789t abstractComponentCallbacksC0789t, String str, int i10) {
        String str2 = abstractComponentCallbacksC0789t.f13360T;
        if (str2 != null) {
            AbstractC0831d.d(abstractComponentCallbacksC0789t, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0789t.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException(StubApp.getString2(16452) + cls.getCanonicalName() + StubApp.getString2(16652));
        }
        String string2 = StubApp.getString2(16645);
        String string22 = StubApp.getString2(16646);
        if (str != null) {
            String str3 = abstractComponentCallbacksC0789t.f13347B;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder(StubApp.getString2(16647));
                sb2.append(abstractComponentCallbacksC0789t);
                sb2.append(string22);
                throw new IllegalStateException(E1.a.n(sb2, abstractComponentCallbacksC0789t.f13347B, string2, str));
            }
            abstractComponentCallbacksC0789t.f13347B = str;
        }
        if (i3 != 0) {
            if (i3 == -1) {
                throw new IllegalArgumentException(StubApp.getString2(16649) + abstractComponentCallbacksC0789t + StubApp.getString2(16650) + str + StubApp.getString2(16651));
            }
            int i11 = abstractComponentCallbacksC0789t.f13388z;
            if (i11 != 0 && i11 != i3) {
                throw new IllegalStateException(StubApp.getString2(16648) + abstractComponentCallbacksC0789t + string22 + abstractComponentCallbacksC0789t.f13388z + string2 + i3);
            }
            abstractComponentCallbacksC0789t.f13388z = i3;
            abstractComponentCallbacksC0789t.f13346A = i3;
        }
        b(new V(i10, abstractComponentCallbacksC0789t));
        abstractComponentCallbacksC0789t.f13384v = this.f13254p;
    }

    public final void f(String str, PrintWriter printWriter, boolean z2) {
        String string2;
        if (z2) {
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16653));
            printWriter.print(this.f13247h);
            printWriter.print(StubApp.getString2(16654));
            printWriter.print(this.f13256r);
            printWriter.print(StubApp.getString2(16655));
            printWriter.println(this.f13255q);
            if (this.f13245f != 0) {
                printWriter.print(str);
                printWriter.print(StubApp.getString2(16656));
                printWriter.print(Integer.toHexString(this.f13245f));
            }
            if (this.f13241b != 0 || this.f13242c != 0) {
                printWriter.print(str);
                printWriter.print(StubApp.getString2(16657));
                printWriter.print(Integer.toHexString(this.f13241b));
                printWriter.print(StubApp.getString2(16658));
                printWriter.println(Integer.toHexString(this.f13242c));
            }
            if (this.f13243d != 0 || this.f13244e != 0) {
                printWriter.print(str);
                printWriter.print(StubApp.getString2(16659));
                printWriter.print(Integer.toHexString(this.f13243d));
                printWriter.print(StubApp.getString2(16660));
                printWriter.println(Integer.toHexString(this.f13244e));
            }
            if (this.f13248i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print(StubApp.getString2(16661));
                printWriter.print(Integer.toHexString(this.f13248i));
                printWriter.print(StubApp.getString2(16662));
                printWriter.println(this.j);
            }
            if (this.f13249k != 0 || this.f13250l != null) {
                printWriter.print(str);
                printWriter.print(StubApp.getString2(16663));
                printWriter.print(Integer.toHexString(this.f13249k));
                printWriter.print(StubApp.getString2(16664));
                printWriter.println(this.f13250l);
            }
        }
        ArrayList arrayList = this.f13240a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println(StubApp.getString2(16665));
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            V v2 = (V) arrayList.get(i3);
            switch (v2.f13219a) {
                case 0:
                    string2 = StubApp.getString2(3796);
                    break;
                case 1:
                    string2 = StubApp.getString2(12244);
                    break;
                case 2:
                    string2 = StubApp.getString2(16675);
                    break;
                case 3:
                    string2 = StubApp.getString2(16674);
                    break;
                case 4:
                    string2 = StubApp.getString2(16673);
                    break;
                case 5:
                    string2 = StubApp.getString2(16672);
                    break;
                case 6:
                    string2 = StubApp.getString2(16671);
                    break;
                case 7:
                    string2 = StubApp.getString2(16670);
                    break;
                case 8:
                    string2 = StubApp.getString2(16669);
                    break;
                case 9:
                    string2 = StubApp.getString2(16668);
                    break;
                case 10:
                    string2 = StubApp.getString2(16667);
                    break;
                default:
                    string2 = StubApp.getString2(16666) + v2.f13219a;
                    break;
            }
            printWriter.print(str);
            printWriter.print(StubApp.getString2(16676));
            printWriter.print(i3);
            printWriter.print(StubApp.getString2(994));
            printWriter.print(string2);
            printWriter.print(StubApp.getString2(397));
            printWriter.println(v2.f13220b);
            if (z2) {
                if (v2.f13222d != 0 || v2.f13223e != 0) {
                    printWriter.print(str);
                    printWriter.print(StubApp.getString2(16677));
                    printWriter.print(Integer.toHexString(v2.f13222d));
                    printWriter.print(StubApp.getString2(16678));
                    printWriter.println(Integer.toHexString(v2.f13223e));
                }
                if (v2.f13224f != 0 || v2.f13225g != 0) {
                    printWriter.print(str);
                    printWriter.print(StubApp.getString2(16679));
                    printWriter.print(Integer.toHexString(v2.f13224f));
                    printWriter.print(StubApp.getString2(16680));
                    printWriter.println(Integer.toHexString(v2.f13225g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(StubApp.getString2(16681));
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f13256r >= 0) {
            sb2.append(StubApp.getString2(16682));
            sb2.append(this.f13256r);
        }
        if (this.f13247h != null) {
            sb2.append(StubApp.getString2(397));
            sb2.append(this.f13247h);
        }
        sb2.append(StubApp.getString2(265));
        return sb2.toString();
    }
}
