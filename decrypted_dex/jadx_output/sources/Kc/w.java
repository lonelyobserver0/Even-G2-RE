package Kc;

import java.util.RandomAccess;
import kotlin.collections.AbstractList;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final class w extends AbstractList implements RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f3854b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C0104k[] f3855a;

    public w(C0104k[] c0104kArr) {
        this.f3855a = c0104kArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C0104k) {
            return super.contains((C0104k) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i3) {
        return this.f3855a[i3];
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public final int get_size() {
        return this.f3855a.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C0104k) {
            return super.indexOf((C0104k) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C0104k) {
            return super.lastIndexOf((C0104k) obj);
        }
        return -1;
    }
}
