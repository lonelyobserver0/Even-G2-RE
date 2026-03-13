package androidx.recyclerview.widget;

import android.util.SparseArray;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f10082a;

    /* renamed from: b, reason: collision with root package name */
    public int f10083b;

    public final T a(int i3) {
        SparseArray sparseArray = this.f10082a;
        T t3 = (T) sparseArray.get(i3);
        if (t3 != null) {
            return t3;
        }
        T t10 = new T();
        sparseArray.put(i3, t10);
        return t10;
    }
}
