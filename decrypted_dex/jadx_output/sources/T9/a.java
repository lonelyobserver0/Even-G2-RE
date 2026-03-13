package T9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class a extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7222a;

    public a(List list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f7222a = new ArrayList(list);
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final Object get(int i3) {
        return this.f7222a.get(i3);
    }

    @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
    /* renamed from: getSize */
    public final int get_size() {
        return this.f7222a.size();
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return this.f7222a.toArray(new Object[0]);
    }
}
