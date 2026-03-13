package S9;

import com.stub.StubApp;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes3.dex */
public final class p extends i {

    /* renamed from: s, reason: collision with root package name */
    public final i f6655s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(i originalAdapter) {
        super(originalAdapter.f6640a, Reflection.getOrCreateKotlinClass(List.class), originalAdapter.f6642c, CollectionsKt.emptyList(), 0);
        Intrinsics.checkNotNullParameter(originalAdapter, "originalAdapter");
        this.f6655s = originalAdapter;
    }

    @Override // S9.i
    public final Object b(o reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return CollectionsKt.listOf(this.f6655s.b(reader));
    }

    @Override // S9.i
    public final void d(r writer, Object obj) {
        List value = (List) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException(StubApp.getString2(6066));
    }

    @Override // S9.i
    public final void e(s2.d writer, Object obj) {
        List value = (List) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException(StubApp.getString2(6066));
    }

    @Override // S9.i
    public final void f(r writer, int i3, Object obj) {
        List list = (List) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (list == null) {
            return;
        }
        int size = list.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                this.f6655s.f(writer, i3, list.get(size));
            }
        }
    }

    @Override // S9.i
    public final void g(s2.d writer, int i3, Object obj) {
        List list = (List) obj;
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f6655s.g(writer, i3, list.get(i10));
        }
    }

    @Override // S9.i
    public final int h(Object obj) {
        List value = (List) obj;
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException(StubApp.getString2(6067));
    }

    @Override // S9.i
    public final int i(int i3, Object obj) {
        List list = (List) obj;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += this.f6655s.i(i3, list.get(i11));
        }
        return i10;
    }
}
