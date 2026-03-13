package S9;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class g extends i {

    /* renamed from: s, reason: collision with root package name */
    public final i f6626s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i originalAdapter) {
        super(d.f6616d, Reflection.getOrCreateKotlinClass(List.class), originalAdapter.f6642c, CollectionsKt.emptyList(), 0);
        Intrinsics.checkNotNullParameter(originalAdapter, "originalAdapter");
        this.f6626s = originalAdapter;
    }

    @Override // S9.i
    public final Object b(o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return CollectionsKt.listOf(this.f6626s.b(reader));
    }

    @Override // S9.i
    public final void d(r writer, Object obj) {
        List value = (List) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                this.f6626s.d(writer, value.get(size));
            }
        }
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        List value = (List) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f6626s.e(writer, value.get(i3));
        }
    }

    @Override // S9.i
    public final void f(r writer, int i3, Object obj) {
        List list = (List) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (list == null || list.isEmpty()) {
            return;
        }
        super.f(writer, i3, list);
    }

    @Override // S9.i
    public final void g(s2.d writer, int i3, Object obj) {
        List list = (List) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (list == null || list.isEmpty()) {
            return;
        }
        super.g(writer, i3, list);
    }

    @Override // S9.i
    public final int h(Object obj) {
        List value = (List) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        int size = value.size();
        int i3 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i3 += this.f6626s.h(value.get(i10));
        }
        return i3;
    }

    @Override // S9.i
    public final int i(int i3, Object obj) {
        List list = (List) obj;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return super.i(i3, list);
    }
}
