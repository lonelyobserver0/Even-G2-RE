package kotlin.collections.unsigned;

import java.util.Iterator;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.jvm.functions.Function0;

/* loaded from: /home/loneobs/Code/Even/RE/even-apks/base/decrypted_dex/classes2.dex */
public final /* synthetic */ class a implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15583a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15584b;

    public /* synthetic */ a(Object obj, int i3) {
        this.f15583a = i3;
        this.f15584b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Iterator m199iteratorimpl;
        Iterator m278iteratorimpl;
        Iterator m120iteratorimpl;
        Iterator m383iteratorimpl;
        switch (this.f15583a) {
            case 0:
                m199iteratorimpl = UIntArray.m199iteratorimpl((int[]) this.f15584b);
                return m199iteratorimpl;
            case 1:
                m278iteratorimpl = ULongArray.m278iteratorimpl((long[]) this.f15584b);
                return m278iteratorimpl;
            case 2:
                m120iteratorimpl = UByteArray.m120iteratorimpl((byte[]) this.f15584b);
                return m120iteratorimpl;
            default:
                m383iteratorimpl = UShortArray.m383iteratorimpl((short[]) this.f15584b);
                return m383iteratorimpl;
        }
    }
}
